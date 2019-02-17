package kwdpac;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Kdr
{

	public static void main(String[] args) throws Exception
	{
		File f=new File("kwd238.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh1=rwb.getSheet(0);
		int nour1=rsh1.getRows();
		int nouc1=rsh1.getColumns();
		Sheet rsh2=rwb.getSheet(1);
		int nour2=rsh2.getRows();
		int nouc2=rsh2.getColumns();
		//open excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh1=wwb.getSheet(0);
		WritableSheet wsh2=wwb.getSheet(1);
		//decorations
		WritableCellFormat cf=new WritableCellFormat();
		cf.setAlignment(Alignment.JUSTIFY);
		cf.setWrap(true);
		//take date as column name 
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		Date dt=new Date();
		String cname=sf.format(dt);
		//result tests
		Label l1=new Label(nouc1,0,cname,cf);
		wsh1.addCell(l1);
		//result steps
		Label l2=new Label(nouc2,0,cname,cf);
		wsh2.addCell(l2);
		//create object to method class
		Kdm ms=new Kdm();
		//
		Method m[]=ms.getClass().getMethods();
		//
		try
		{
			for(int i=1;i<nour1;i++)
			{
				int flag=0;
				//
				String tid=rsh1.getCell(0,i).getContents();
				String mode=rsh1.getCell(2,i).getContents();
				if(mode.equalsIgnoreCase("yes"))
				{
					//
					for(int j=1;j<nour2;j++)
					{
						String sid=rsh2.getCell(0,j).getContents();
						if(tid.equals(sid))
						{
							//
							String mn=rsh2.getCell(2,j).getContents();
							String l=rsh2.getCell(3,j).getContents();		
							String t=rsh2.getCell(4,j).getContents();
							String c=rsh2.getCell(5,j).getContents();
							System.out.println(mn+" "+l+" "+t+" "+c);
							for(int k=0;k<m.length;k++)
							{
								if(m[k].getName().equals(mn))
								{
									String r=(String) m[k].invoke(ms,l,t,c);
									Label lsh1=new Label(nouc2,j,r,cf);
									wsh2.addCell(lsh1);
									if(r.contains("FAILED")&&r.contains("failed"))
									{
										flag=1;
									}
									break;
								}
							}//k
						}
						else
						{
							break;
						}
					}//j
					if(flag==0)
					{
						Label lsh2=new Label(nouc1,i,"test passed",cf);
						wsh1.addCell(lsh2);
					}
				}
			}//i
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		wwb.write();
		wwb.close();
		rwb.close();
		
		}

}

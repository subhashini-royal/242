package AI;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class S4appium {

	public static void main(String[] args)throws Exception
	{
		//Color c=Color.BLUE;
		Color c=new Color(255,255,255);
		File f=new File("E:\\amma\\rgb.png");
		BufferedImage br=ImageIO.read(f);
		int w=br.getWidth();
		int h=br.getHeight();
		int count=0;
		for(int i=0;i<w;i++)
		{
			for(int j=0;j<h;j++)
				{
			    Color ac=new Color(br.getRGB(i, j));
			    if(ac.getBlue()==c.getBlue() && ac.getGreen()==c.getGreen() && ac.getRed()==c.getRed())
			    {
			    	count=count+1;
			    	
			    }
				}
				
		}
		System.out.println("total pixels r:"+(w*h));
		System.out.println("pixcels with expected color:"+count);
		double percentage=count*100.0/(w*h);
		System.out.println(percentage);

	}

}

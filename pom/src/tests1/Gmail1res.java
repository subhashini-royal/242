package tests1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Gmail1res
{

	public static void main(String[] args) throws Exception
	{
		//reading
		File f1=new File("");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//Writing
		File f2=new File("");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		//Data driven with POM
		String l="";
		while((l=br.readLine())!=null)
		{
			String p[]=l.split(",");
		}
		//launch site
		
		

	}

}

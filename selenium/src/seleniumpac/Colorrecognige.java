package seleniumpac;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Colorrecognige {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter expected color");
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		Color ec=new Color(r,g,b);
		int count=0;
		float percentage;
		File f=new File("E:\\amma\\addcart.png");
		BufferedImage fullImg=ImageIO.read(f);
		//check image color pixel by pixel
		int w=fullImg.getWidth();
		int h=fullImg.getHeight();
		for(int i=0;i<w;i++)
		{
			for (int j=0;j<h;j++)
{
	Color ac=new Color(fullImg.getRGB(i, j));
	if(ac.getRed()==ec.getRed()&&ac.getGreen()==ec.getGreen()&&ac.getBlue()==ec.getGreen())
	{
		count=count+1;
	}
}
		}
		System.out.println("total pixels:"+(w*h));
		System.out.println("Expected colour pixel"+count);
		
		percentage=(count*100)/(w*h);
		
		System.out.println("Expected color% is"+percentage);	
}

	}



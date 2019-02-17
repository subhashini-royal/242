package AI;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;



public class S2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter text");
	    String x=sc.nextLine();
	     //convert into voice
	     VoiceManager vm=VoiceManager.getInstance();
	     System.setProperty("mbrola.base","E:\\amma\\mbrola\\mbrola");
	     Voice v=vm.getVoice("mbrola_us3");
	     v.allocate();
	     v.speak(x);
	     v.deallocate();
	     
		

	}

}

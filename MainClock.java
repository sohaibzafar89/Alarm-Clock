//package clock;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;

public class MainClock {

	public static void main(String[] args) throws Exception,IOException, InterruptedException {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Hours : ");
		int hour=scan.nextInt();
		
		System.out.print("Enter Minutes : ");
		int minute=scan.nextInt();
		
		System.out.print("Enter Seconds : ");
		int second=scan.nextInt();
		
		System.out.println("Choose     1. AM      2. PM");
		int choose=scan.nextInt();
		
		System.out.println("Enter the time of Alarm : ");
		
		System.out.print("Enter Hours : ");
		int h=scan.nextInt();
		
		System.out.print("Enter Minutes : ");
		int m=scan.nextInt();
		
		System.out.print("Enter Seconds : ");
		int s=scan.nextInt();
		
		System.out.println("Choose     1. AM      2. PM");
		int choose1=scan.nextInt();
		
		scan.close();
		Clock c=new Clock(hour, minute, second);
		c.AP(choose);
		
		while(true) {
			c.tick();
			if(c.play(h, m, s, choose1)==true) {
				MusicOrganizer music = new MusicOrganizer();
				music.playTrack(0);
				c.tick();
			}
			Thread.sleep(1000);
			new ProcessBuilder("cmd.exe", "/c", "cls").inheritIO().start().waitFor();
			c.Display();
		}

	}

}

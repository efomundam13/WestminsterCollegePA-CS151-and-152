
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Manny Fomundam
 * Lab 4 - Do you have the time?
 * Takes the raw form of a time and turns the time into a nicer form
 */
public class Lab4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String time = LocalTime.now().toString();
		System.out.println(time);

		String hours = time.substring(0,2);
		String minutes = time.substring(3,5);
		String seconds = time.substring(6,8);

		int hour = Integer.parseInt(hours );

		String niceTime = "";


		if (hour == 00) {
			niceTime += 12;
		}
		else if (hour <= 9) {
			niceTime += hour;
		}
		else if(hour > 12)	{
			niceTime += hour-12;
		}

		niceTime += ":" + minutes + ":" + seconds;
		System.out.print(niceTime);

		if (hour > 12) {
			System.out.println(" PM");
		}
		else if (hour < 12) {
			System.out.println(" AM");
		}
	}
}
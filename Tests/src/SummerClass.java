
public class SummerClass {
	
	public static void main(String[] args) {
		float [] MyArray =  {(float) 15.0, (float) 8.0, (float) 13.0, (float) 6.0, (float) 9.0, (float) 12.0 };

		int i;

		float temp, sum;

		sum = (float) 0.0;

		for (i = 0; i<6; i++)
		{

		    sum = sum + MyArray[i];

		    }

		temp = sum / 6;

		System.out.print(temp);
	}

}

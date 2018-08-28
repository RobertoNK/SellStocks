import java.util.Scanner;

public class borrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean valid = true;
		while(valid) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter stock price: ");
		double stockPrice= input.nextDouble();
		if(stockPrice==0) {
			valid = false;
			break;
		}
		System.out.println("Enter number of shares: ");
		double shares = input.nextDouble();
		double result_1= stockPrice*shares;
		result_1=Math.round(result_1*100);
		result_1= result_1/100;
		System.out.println("value of shares: $"+String.format("%.2f", result_1));
		System.out.println("Enter commission (as a percentage): ");
		double com=input.nextDouble();
		double result_2=(result_1*com);
		result_2=Math.round(result_2);
		result_2=result_2/100;
		System.out.println("commsion: $"+String.format("%.2f", result_2));
		double result_3=result_1-result_2;
		System.out.println("net proceeds: $"+String.format("%.2f",result_3));
		}
	}
}

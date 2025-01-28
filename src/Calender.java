import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   enum Days {
			      Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
			   }
			      
			   
			      Days frist_day = Days.Monday;
			      Days second_day = Days.Tuesday;
			      Days third_day = Days.Wednesday;
			      Days fourth_day = Days.Thursday;
			      Days fifth_day = Days.Friday;
			      
			      Days frist_holiday_of_a_week = Days.Saturday;
			      Days second_holiday_of_a_week = Days.Sunday;
			      
			      System.out.println("Enter the num ber of the day(1-7)");
			      Scanner sc=new Scanner(System.in);
			      int a=sc.nextInt();
			      
					switch(a)
					{
					case 1:
						System.out.println("according to the enterd number the day is = " +frist_day);
						break;
					
					case 2:
						System.out.println("according to the enterd number the day is = " +second_day);
						break;
					
					case 3:
						System.out.println("according to the enterd number the day is = " +third_day);
						break;
					
					case 4:
						System.out.println("according to the enterd number the day is = " +fourth_day);
						break;
					
					case 5:
						System.out.println("according to the enterd number the day is = " +fifth_day);
						break;
					case 6:
						System.out.println("according to the enterd number the day is = " +frist_holiday_of_a_week);
						break;

					case 7:
						System.out.println("according to the enterd number the day is = " +second_holiday_of_a_week);
						break;
						
					default:
						System.out.println("enterd wrong choice");

					}
					
						System.out.println("Updating using branch update");
			      
			      
			      }

	

}

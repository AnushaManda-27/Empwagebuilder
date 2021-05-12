public class Empwagebuilder {

	private static final int EMP_RATE_PER_HR = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PRESENT_FULL = 1;
		int IS_PRESENT_HALF = 2;
	    int EMP_RATE_PER_HR = 20;

  int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
		int empHrs;
		switch(empCheck) {
		
		case 1:
			empHrs=8;
			break;
		case 2:
			empHrs=4;
			break;
		default:
			empHrs=0;
		}
      int salary = EMP_RATE_PER_HR * empHrs;
      System.out.println("salary:"+salary);
	}
	}

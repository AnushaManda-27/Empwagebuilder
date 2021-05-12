public class Empwagebuilder {

	private static final int EMP_RATE_PER_HR = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PRESENT_FULL = 1;
		int IS_PRESENT_HALF = 2;
	    int EMP_RATE_PER_HR = 20;
double empCheck = Math.floor(Math.random() * 10) % 3;
		
		int empHrs;
		if (empCheck == IS_PRESENT_FULL) {
		empHrs=16;
		}
		else if(empCheck == IS_PRESENT_HALF) {
		empHrs=8;
		}
	    else {
		empHrs=0;
	    }
      int salary = EMP_RATE_PER_HR * empHrs;
      System.out.println("salary:"+salary);
	}

}

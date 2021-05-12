public class Empwagebuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PRESENT = 1;
	    int EMP_RATE_PER_HR = 20;
double empCheck = Math.floor(Math.random() * 10) % 2;
		
		int empHrs;
		if (empCheck == IS_PRESENT) {
		empHrs=8;
		}
		else {
		empHrs=0;
		}
      int salary = EMP_RATE_PER_HR*empHrs;
      System.out.println("salary:"+salary);
	}

}

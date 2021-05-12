public class Empwagebuilder {
	
	public static void main(String[] args) {
	
	int IS_PRESENT_FULL=1;
	int IS_PRESENT_HALF=2;
	int EMP_RATE_PER_HR=20;
	int MAX_WORKING_DAYS=20;
	int MAX_WORKING_HRS=100;
    int totalworkhrs=0;
    int totalworkdays=0;
    
while((totalworkdays <= MAX_WORKING_DAYS )&&(totalworkhrs<MAX_WORKING_HRS)) {
	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	totalworkdays++;
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
	totalworkhrs += empHrs;
	System.out.println("Day : " + totalworkdays + " Emp Hr: " +empHrs);
} 	
int totalEmpWage = totalworkhrs * EMP_RATE_PER_HR;
System.out.println("Total Emp Wage: " + totalEmpWage);
}
}

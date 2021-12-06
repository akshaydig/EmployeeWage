package employeewage;

public class EmpWageForMonth {
	public static void main(String[] args) {

		int empWage;
		int EMP_RATE_PER_HOUR = 20;
		int empHour = 0;
		int empDay = 20;

		int empCheck = (int) (Math.random() * 10) % 3;
		switch (empCheck) {
		case 1:
			empHour = 8;
			break;
		case 2:
			empHour = 4;
			break;
		default:
			empHour = 0;
		}
		empWage = empHour * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage " + empWage);
		empDay = empWage * empDay;
		System.out.println("Emp Day Per Month  " + empDay);
	}
}

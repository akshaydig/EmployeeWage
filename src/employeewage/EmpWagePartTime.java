package employeewage;

public class EmpWagePartTime {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int EMP_RATE_PER_HOUR = 20;
		int IS_FULL_TIME = 8;
		int IS_PART_TIME = 4;
		int empWage = 0;

		int empCheck = (int) (Math.random() * 3);
		if (empCheck == 1) {
			System.out.println("Employee is present for full time");
			empWage = EMP_RATE_PER_HOUR * IS_FULL_TIME;
		} else if (empCheck == 2) {
			System.out.println("Employee is present for part time");
			empWage = EMP_RATE_PER_HOUR * IS_PART_TIME;
		} else {
			System.out.println("Employee is not present");
			empWage = EMP_RATE_PER_HOUR * IS_FULL_TIME * empCheck;
		}
		System.out.println("Emp Wage: " + empWage);
	}
}


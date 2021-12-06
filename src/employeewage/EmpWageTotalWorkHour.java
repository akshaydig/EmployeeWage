package employeewage;

public class EmpWageTotalWorkHour {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int totalSalary;
		int EMP_RATE_PER_HOUR = 20;
		int NO_OF_WORKINGDAYS = 20;
		int totalWorkingDays = 0;
		int MAX_HR_IN_MONTH = 100;
		int empHr, totalEmpHrs = 0;

		while (totalEmpHrs < MAX_HR_IN_MONTH && totalWorkingDays < NO_OF_WORKINGDAYS) {
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) empCheck;
			switch (i) {
			case 1:
				empHr = 8;
				break;
			case 2:
				empHr = 4;
				break;
			default:
				empHr = 0;
			}
			totalEmpHrs = totalEmpHrs + empHr;
		}
		totalSalary = EMP_RATE_PER_HOUR * totalEmpHrs;
		System.out.println(" total Salary is:" + totalSalary);
	}
}


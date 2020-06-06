class EmployeeWage {

  public static final int Is_Part_Time =1;
  public static final int Is_Full_Time =2;

 private int numofcompany = 0;
 private CompanyEmpWage[] CompanyEmpWageArray;

 public EmployeeWage() {
  CompanyEmpWageArray = new CompanyEmpWage[5];
}



private void addCompanyEmpWage(String company, int emp_rate_per_hour, int num_Of_Working_Days, int max_Hours_In_Month) {

    CompanyEmpWageArray[numofcompany] = new CompanyEmpWage(company, emp_rate_per_hour, num_Of_Working_Days, max_Hours_In_Month);
     numofcompany++;
}

  public void ComputeEmpWage() {
    for (int i =0; i < numofcompany; i++) {
      CompanyEmpWageArray[i].setTotalEmpWage(this.ComputeEmpWage(CompanyEmpWageArray[i]));
      System.out.println(CompanyEmpWageArray[i]);
    }
}
   private int ComputeEmpWage(CompanyEmpWage CompanyEmpWage) {
      int emphr=0, TotalWorkingDays=0, TotalEmpHrs=0;

    while (TotalEmpHrs <= max_Hours_In_Month && TotalWorkingDays < num_Of_Working_Days) {
      TotalWorkingDays++;
    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    switch (empCheck) {
      case Is_Part_Time:
	emphr=4;
         break;
      case Is_Full_Time:
         emphr=8;
	 break;
      default:
        emphr=0;
    }
      TotalEmpHrs += emphr;
      System.out.println("Day : "+TotalWorkingDays  +  "Emp Hr : " + emphr);
    }
      return TotalEmpHrs*CompanyEmpWage.emp_rate_per_hour;
 }
  public String toString() {
      return "Total Emp Wage For Company : " +company+ "is: " + TotalEmpWage;
}
   public static void main(String args[]) {
      EmployeeWage empWage = new EmployeeWage();
      EmployeeWage.addCompanyEmpWage("DMart", 20, 2, 10);
      EmployeeWage.addCompanyEmpWage("Reliance", 10, 4, 20);
      empWage.ComputeEmpWage();
  }

}
public class CompanyEmpWage {
  public final String company;
  public final int emp_rate_per_hour;
  public final int num_Of_Working_Days;
  public final int max_Hours_In_Month;
  public int TotalEmpWage;

  public CompanyEmpWage(String company, int emp_rate_per_hour, int num_Of_Working_Days, int max_Hours_In_Month) {
   this.company = company;
   this.emp_rate_per_hour = emp_rate_per_hour;
   this.num_Of_Working_Days = num_Of_Working_Days;
   this.num_Of_Working_Days = num_Of_Working_Days;
}

  public void setTotalEmpWage(int TotalEmpWage) {
   this.TotalEmpWage = TotalEmpWage;
}

 public String toString() {
    return "Total Emp wage for Company: " +company+" is: " + TotalEmpWage;
   }

}



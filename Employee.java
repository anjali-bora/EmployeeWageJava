import java.util.*;

public class Employee {
   static void totalWageOfCompany(ArrayList<CompanyEmpWage> cp){ 
     for ( CompanyEmpWage p : cp ) {
       System.out.println("company name :"+p.name+"	companyTotalWage:"+p.companyTotalWagePerMonth);
     }
}
public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in);
  ArrayList<CompanyEmpWage> cp = new ArrayList<CompanyEmpWage>(); 
  boolean end_key = true;
  System.out.println("	Welcome to Employee Wage Computation Program\n"); 
  while (end_key) {
    System.out.println("	1: Add	2: View your company's total wage	3: Total Wage Of Companys	4: Exit");
    int choice = sc.nextInt(); int i = 0;
    switch (choice) {

       case 1:
         sc.nextLine();
         System.out.println("	Enter name of your company "); 
         String name = sc.nextLine();
         System.out.println("	Enter the wage per hour of your company :"); 
         int wage = sc.nextInt();
         System.out.println("	Enter the number of working day in a month :"); 
         int days = sc.nextInt();
         System.out.println("	Enter the number of working hours in a day :"); 
         int hours = sc.nextInt();
            System.out.println("	Enter the number of Employes in company :"); 
         int numEmp = sc.nextInt();
         cp.add(new CompanyEmpWage(name ,wage, days, hours , numEmp)); 
         break;
      case 2:
         sc.nextLine();
         System.out.println("	Enter the name of your company to view total wage:"); 
         String update = sc.nextLine();
         Iterator<CompanyEmpWage> iter = cp.iterator(); 
         while (iter.hasNext()) {
           CompanyEmpWage data = iter.next(); 
           if (update.equals(data.getRecord())) {
              System.out.println("	Your company's TotalWagePerDay is:"+data.getValues());
              System.out.println("	Your company's TotalWagePerMonth is:"+data.getMonth());

           }
       }

        break; 
        case 3:
          totalWageOfCompany(cp); 
         break;

     case 4:
       end_key = false; 
       break;
     default:
        System.out.println("	Enter valid input"); 
        break;
      }
   }
 }
}
class CompanyEmpWage{ 
String name;
int wage; 
int days; 
int hours;
int companyTotalWagePerDay; 
int companyTotalWagePerMonth;
CompanyEmpWage(String name,int wage, int days, int hours, int numEmp ){ 
   this.name = name;
   this.wage = wage; 
   this.days = days; 
   this.hours = hours;
   this.companyTotalWagePerDay = (wage * numEmp * hours); 
   this.companyTotalWagePerMonth = (wage * numEmp * hours * days);

}
public int getValues(){
  return this.companyTotalWagePerDay;
 }
public int getMonth(){
  return this.companyTotalWagePerMonth;
 }

public String getRecord(){ 
  return this.name;
 }
}





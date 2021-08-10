public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;


   public Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public  double bonus(){
       if (this.workHours>40){
           bonus=(this.workHours-40)*30;
           return bonus;
       }else{
           return bonus();
       }

    }
    public double tax(){
       if (this.salary<1000){
           this.tax=0;
           return tax;
       }
       if (this.salary>1000) {
           this.tax = this.salary * 0.03;
           return tax;
       }
        return 1;
    }

    public void raiseSalary(){
       int thisYear=2021;
        if (thisYear-this.hireYear<10){
            this.raiseSalary=salary*0.05;
            System.out.println("Maaş Artışı: "+raiseSalary);
        }
        if (thisYear-this.hireYear>9  && thisYear-this.hireYear<20 ){
        this.raiseSalary=salary*0.1;
            System.out.println("Maaş Artışı: "+raiseSalary);
        }
        if (thisYear-this.hireYear>19){
            this.raiseSalary=salary*0.15;
            System.out.println("Maaş Artışı: "+raiseSalary);
        }
    }

    public  void employeeInfo(){
        System.out.println("Çalışanın adı : "+ this.name);
        System.out.println("Çalışanın maaşı : "+ this.salary);
        System.out.println("Çalışma saati : "+ this.workHours);
        System.out.println("Başlangıç yılı: "+ this.hireYear);
        System.out.println("Vergi oranı : "+ this.tax());
        System.out.println("Bonus oranı : "+ this.bonus());
        System.out.println("Bonus oranı : "+ this.bonus());
            raiseSalary();
            double vBmaas=this.salary-this.tax+this.bonus;
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " +vBmaas);
        double tMaas=vBmaas+raiseSalary;
        System.out.println("Toplam Maaş  : " +tMaas);
    }

}

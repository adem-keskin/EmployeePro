public class Employee {         // Calisan SINIFI ve parametrelerini olusturdum..
    private String name;
    public double salary;
    private int workHours;
    private int hireYear;
    private int hireDate;

    public Employee(String name, double salary, int workHours, int hireYear) {      // Constructor = Yapici Method icine alacagi parametreler..
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {                           // Vergi method  maas double olarak kabul edilmelidir..!
        if (this.salary > 1000){
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus(){                          // Bonus method -> Fazla mesaide saat basina 30€ bonus..
        if (this.workHours > 40){                   // Mounth - 40 hour
            int extra = this.workHours - 40 ;
            return extra * 30.0;
        }
        return 0.0;
    }

    public double raiseSalary (){                 // Zam method -> calistigi yillara göre ne kadar zam verilecek..
        int hireYear = 2020 - hireDate;           // DateNOW = 2020 kabul edildi..
        if (hireYear < 10){
            return salary * 0.05;
        } else if ( hireYear >= 10 && hireYear < 20) {
            return  salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }
    public void toString(Employee employee) {       // toString adinda bir method yazdipciktilari aldik...
        System.out.println("SALARY : " + salary);
        System.out.println("TAX : " + this.tax());
        System.out.println("BONUS : " + this.bonus());
        System.out.println("RAISE SALARY : " + this.raiseSalary());
        System.out.println("TOTAL NET SALARY = " + ( this.salary + employee.bonus() - employee.tax() + employee.raiseSalary()));
    }
}

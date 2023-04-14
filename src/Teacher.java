public class Teacher extends Worker{

    Subject mSubject;
    public Teacher(String name, int age, Subject subject, int experience, double salary) {
        super(name, age, experience, salary);
        setSubject(subject);
    }

    public Subject getSubject() { return mSubject; }
    public void setSubject(Subject sub) {mSubject = sub;
    }

    public double Salary_T() {

        int uzysk = 150;
        double sal = getSalary() - uzysk * 0.5;

        if ( sal > 2500 )
        {
            sal = sal - getSalary() * 0.18 ;
        }
        return sal;
    };

    public double Final_Salary() {
        return Salary_T() + calBonus();
    }

    public String toString() {
        return "Imię i nazwisko: " + getName() + "\nWiek: " + getAge() + "\nPrzedmiot: " + getSubject() + "\nDoświadczenie: " + getExperience() + "\nPensja: " + Final_Salary() + "\n";
    }
}

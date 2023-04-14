public class Admin extends Worker
{
    String mPosition;

    public Admin(String name, int age, int experience, double salary, String position) {
        super(name, age, experience, salary);
        setPosition(position);
    }

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        this.mPosition = position;
    }

    public double Salary_A() {

        int uzysk = 150;
        double sal = getSalary() - uzysk;

        if ( sal > 2500 )
        {
            sal = sal - getSalary() * 0.18 ;
        }
        return sal;
    };

    public double Final_Salary() {
        return Salary_A() + calBonus();
    }

    public String toString() {
        return "Imię i nazwisko: " + getName() + "\nWiek: " + getAge() + "\nDoświadczenie: " + getExperience() + "\nPensja: " + Final_Salary() + "\nStanowisko: " + getPosition() + "\n";
    }
}


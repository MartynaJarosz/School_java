public abstract class Worker extends Person{

    int mExperience;
    double mSalary;

     public Worker(String name, int age, int experience, double salary) {
        super(name, age);
         setExperience(experience); setSalary(salary);
    }

    public int getExperience() {
        return mExperience;
    }

    public void setExperience(int mExperience) {
        this.mExperience = mExperience;
    }

    public double getSalary() {
        return mSalary;
    }

    public void setSalary(double mSalary) {
        this.mSalary = mSalary;
    }

    protected double calBonus() {
         if (mExperience >= 5) {
            if (mExperience >= 20)
                return (mSalary * 0.2);

            return (mSalary * mExperience * 0.01);
        }
        else
            return 0;
    }

    public double getBonus() {
        return calBonus();
    }

    public abstract String toString();
}
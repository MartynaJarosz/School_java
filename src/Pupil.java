enum Subject {POLSKI, MATEMATYKA, FIZYKA, CHEMIA, INFORMATYKA, ANGIELSKI, NIEMIECKI};

abstract public class Pupil extends Person {

    private final static int SUBJECT_NO = 7;
    private String mClass = "";
    private double mAve = 0;
    private double[] mNotes = new double[SUBJECT_NO];
    protected String mID;
    private static int ID = 1000;


    public Pupil(String name, int age, String clas) {
        super(name, age);
        setClassName(clas);
        mID = Integer.toString(ID++);
    }

    public void clearNotes() {
        for (int i = 0; i<SUBJECT_NO; i++) {
            mNotes[i] = 0;
        }
    }

    public void setmNote( Subject subject, double note ) {
        switch (subject) {
            case POLSKI : mNotes[0] = note; break;
            case MATEMATYKA : mNotes[1] = note; break;
            case FIZYKA : mNotes[2] = note; break;
            case CHEMIA : mNotes[3] = note; break;
            case INFORMATYKA : mNotes[4] = note; break;
            case ANGIELSKI : mNotes[5] = note; break;
            case NIEMIECKI : mNotes[6] = note; break;
        }
    }
    public void calcAve() {
        int n = 0;
        double Ave = 0;

        for (int i = 0; i<SUBJECT_NO; i++) {
            if(mNotes[i] >= 2) {
                Ave += mNotes[i];
                n++;
            }
        }
        mAve = (n != 0 ) ? Ave/n : 0;
    }

    public String getID() { return mID; }
    public double getAve() { return mAve; }
    public String getClassName() { return mClass; }
    public void setClassName( String clas ) {
        mClass = clas;
    }

    public  String toString() {
        return "ID: " + getID() + "\nImię i nazwisko: " + super.getName() + "\nŚrednia: " + getAve() + "\nKlasa: " +
                getClassName() + "\nWiek: " + getAge() + "\nUbiór: " + printOutfit() + "\n";
    }

    abstract  public String printOutfit();
}

public class SchoolBoy extends Pupil {

    public SchoolBoy(String name, int age, String clas) {
        super(name, age, clas);
        mID = "M_" + getID();
    }

    public String printOutfit(){
        return "Biala koszula z krawatem, szkolna marynarka, polbuty, spodnie granatowe";
    }
}

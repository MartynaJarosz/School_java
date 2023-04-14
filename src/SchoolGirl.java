public class SchoolGirl extends Pupil {

    public SchoolGirl(String name, int age, String clas) {
        super(name, age, clas);
        mID = "F_" + getID();
    }

    public String printOutfit(){
        return "Biala bluzka z krawatem, szkolna marynarka, granatowa spodniczka, plaskie obuwie";
    }
}

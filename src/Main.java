public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Jan Kowalski", 46, Subject.CHEMIA, 20, 5000);
        Admin a1 = new Admin("Anna Nowak", 31, 4, 2000, "Asystentka Biura");

        System.out.println(t1);
        System.out.println(a1);


        SchoolBoy s1 = new SchoolBoy("Tomasz Pan", 16, "1b");
        s1.setmNote(Subject.MATEMATYKA, 4.0);
        s1.setmNote(Subject.INFORMATYKA, 4.0);
        s1.setmNote(Subject.POLSKI, 4.0);
        //s1.clearNotes();
        s1.calcAve();

        SchoolBoy s2 = new SchoolBoy("Adam Turek", 16, "1b");
        s2.setmNote(Subject.MATEMATYKA, 3.0);
        s2.setmNote(Subject.ANGIELSKI, 4.0);
        s2.setmNote(Subject.CHEMIA, 3.0);
        s2.setmNote(Subject.FIZYKA, 4.0);
        s2.calcAve();

        SchoolBoy s3 = new SchoolBoy("Kamil Pyra", 16, "1b");
        s3.setmNote(Subject.MATEMATYKA, 5.0);
        s3.setmNote(Subject.NIEMIECKI, 4.0);
        s3.calcAve();

        SchoolGirl s4 = new SchoolGirl("Maja Kruszonka", 18, "3a");
        s4.setmNote(Subject.INFORMATYKA, 5.0);
        s4.setmNote(Subject.POLSKI, 4.5);
        s4.setmNote(Subject.FIZYKA, 3.5);
        s4.setmNote(Subject.ANGIELSKI, 3.0);
        s4.calcAve();

        SchoolGirl s5 = new SchoolGirl("Zuzanita Kebasa", 17,"2d");
        s5.setmNote(Subject.POLSKI, 4.0);
        s5.setmNote(Subject.MATEMATYKA, 3.0);
        s5.setmNote(Subject.FIZYKA, 3.5);
        s5.setmNote(Subject.CHEMIA, 4.0);
        s5.setmNote(Subject.ANGIELSKI, 4.0);
        s5.calcAve();

        SchoolGirl s6 = new SchoolGirl("Martina Wegetariana", 17, "2d");
        s6.setmNote(Subject.ANGIELSKI, 4);
        s6.setmNote(Subject.POLSKI, 4);
        s6.setmNote(Subject.FIZYKA, 3);
        s6.setmNote(Subject.CHEMIA, 4);
        s6.calcAve();

        Pupil[] pupils = {s1,s2,s3,s4,s5,s6};
        printAllPupil(pupils);
    }

    private static void printAllPupil(Pupil[] p ) {
        for(Pupil pupil: p) {
            System.out.print("-------------------------\n" + pupil.toString());
            pupil.printOutfit();
        }
    }
}

/*1. Projket systemu dla prywatnej szkoly

W szkole pracuja nauczyciele oraz pracownicy administracji. Do szkoly chodzi mlodziez
do roznych klas.
Kazda osoba identyfikowana jest przez nazwisk oraz imie
Każdy uczeń dodatkowo idntyfikowany jest przez dentyfikator ID (string).
ID ma byc dotepny z klasy opisujacej dowolnego ucznia (Pupil) - aby mozna go drukowac
majac tylko uczniow (obiekty klasy Pupil). Identyfikator ten, tworzony jest na podstawie wartosci
wspolnej dla wszystkich obiektow klasy Pupil (static, string) i dodatkowo w klasach ucznia (SchoolBoy) i uczennicy (SchoolGirl)
dodawany jest przedrostek do ID:
 - F_ dla dziwczyn  (F_12345)
 - M_ dla chlopcow  (M_00100)

Dla kazdej osoby nalezy pamietac oprocz imienia i nazwiska dodatkowo wiek  (klasa bazowa Person)

Dla kazdego ucznia (bez wzgledu czy uczen czy uczennica)
-pamietamy oceny z przedmitow:
POLSKI, MATEMATYKA, FIZYKA, CHEMIA, INFORMATYKA, ANGIELSKI, NIEMIECKI (typ wyliczneiowy)

- mozemy drukowac ubior, (tu nie moze byc implementacji bo zalezy czy dziewczyna czy chlopak) czyli abstrakcyjna
- nazwa klasy (np 2a, lub 3b)
- mozliwosc ustawiania ocen dla danego przedmiotu,
- mozliwosc obliczanai sredniej (jak nie ma oceny z danego przemdiotu to pamitacac 0 - mozna zdefinowac stala tablice),
- mozliwosc wyczyszczenia wszystkich ocen. Oceny polowkowe tez moga byc oraz zakres ocen od 2..5
- w klasie jest identyfikator (int) starowy - wartosc 1000 (konstr Pupil), na jego podstawie tworzony jest ID ucznia
  w postaci stringu w ktorym jest ta liczba a w klsie pochodnej dokonkatenowyny jest odpowiedni przedrostek
  jak opisano wczesniej

Program testowy:
- stworzyc tablice typu pupil do ktorej wstawiamy po 3-ech uczniow i 3 uczennice
- zaimplementowac metode printAllPupil( Pupil[] pupilTab ) w ktorej:
 - drukowac w zestawieniu uczniow: ID, imie, nazwisko, srednia ocen, klasa,  ilosc lat, ubior (abstrakcyjna)

 Kazdy uczen moze miec rozna ilosc ocen - jak nie ma to wartosc 0

W kazdej klasie reprezentujacej ucznia lub uczennice oprocz konstruktora ma byc metoda-implementacja drukowanie ubioru:
  uczennica: biala bluzka z krawatem, szkolna marynarka, granatowa spodniczka, plaskie obuwie
  uczen    : biala koszula z krawatem, szkolna marynarka, polbuty, spodnie granatowe.

Dla kazdego pracownika (Worker) pamietac czy nauczyciel (Teacher) czy administrator (Admin),
pamietac pensje butto,
Dla nauczyciela pamietac jakiego przedmiotu uczy.
xMA byc mozliwosc obliczenia pensji
 - administracja standardowo (koszty uzysku standardowe i 18%podatku, standardowa kwota wolna)
 - dla nauczycieli  80% pensji naliczac 50% koszty uzysku a od reszty standardowo
   oraz uwzglednic staz pracy  (w zakrezie od 5 do 20 lat pracy doliczac do kwoty brutto odpowiednio od 5 do 20% kwoty brutto -
             np dla 10 stazu pracy od 4000 brutto doliczyc 400 czyli lacznie jest 4400 brutto.
             Powyzej 20 lat stazowe wynosza 20% )
 - dla pracownika administracji pamietas nstanowsko na ktorym pracuje

W klasach settery i gettery reszta ukryta (ma byc protected dla Identyfikatora aby mozna bylo bezposredio z niego skorzystac w konstruktorze
                                           klas SchoolBoy i SchoolGirl)
*/
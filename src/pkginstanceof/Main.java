package pkginstanceof;

public class Main {

    public static void main(String[] args) 
    {
         Osoba[] osoba = new Osoba[200]; 
         osoba[0] = new Pracownik("Arkadiusz", "Włodarczyk", 1000000);
         osoba[1] = new Student("Alusia", "Matikusa");
         osoba[3] = new Pracownik("Arkadasfaiusz", "asf", 444);
         
         for (Osoba person: osoba)
         {
             if (person instanceof Pracownik)
             {
                Pracownik tmp = (Pracownik)person;
                tmp.pracuj();
             }
             else if (person instanceof Student)
             {
                Student tmp = (Student)person;
                tmp.pobierzOpis();
             }             
             
         }
    }
    
}
abstract class Osoba
{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();
}

class Pracownik extends Osoba
{
    double wynagrodzenie;
     
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię:" + imie);
        System.out.println("Nazwisko:" + nazwisko);
        System.out.println("Wynagrodzenie:" + wynagrodzenie);
    }
    void pracuj()
    {
        System.out.println("ja pracuje");
    }
   
}

class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
    }  
    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem studentem");
        System.out.println("Imię:" + imie);
        System.out.println("Nazwisko:" + nazwisko);
       
    }    
}



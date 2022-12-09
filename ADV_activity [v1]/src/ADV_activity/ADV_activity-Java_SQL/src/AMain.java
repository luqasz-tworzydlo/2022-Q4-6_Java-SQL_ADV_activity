import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class AMain
{
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Łukasz Tworzydło - nr albumu: gd29623 [projekt zaliczeniowy]
    // Informatyka, grupa laboratoryjna: INiS3_PR2.2
    // [Programowanie w języku JAVA & Bazy danych]
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        // odniesienie do lokalnej bazy danych [XAMPP]
        // oraz wywołanie bazy danych '5_adv_activity'
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

        /*// dodanie nowego rekordu do tabeli 'adv_books' [1.1]
        PreparedStatement stmt1 = con.prepareStatement("INSERT INTO adv_books (rodzaj_ksiazki, autor, rok_rozpoczecia) VALUES (?, ?, ?)");
        ((PreparedStatement)stmt1).setString(1, "muzyczna"); stmt1.setString(2, "Łukasz Wojciech M. Tworzydło");
        stmt1.setString(3, "2018"); stmt1.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_books' [1.2]
        PreparedStatement stmt2 = con.prepareStatement("INSERT INTO adv_books (rodzaj_ksiazki, autor, rok_rozpoczecia) VALUES (?, ?, ?)");
        ((PreparedStatement)stmt2).setString(1, "edukacyjna"); stmt2.setString(2, "Łukasz Wojciech M. Tworzydło");
        stmt2.setString(3, "2019"); stmt2.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_books' [1.3]
        PreparedStatement stmt3 = con.prepareStatement("INSERT INTO adv_books (rodzaj_ksiazki, autor, rok_rozpoczecia) VALUES (?, ?, ?)");
        ((PreparedStatement)stmt3).setString(1, "naukowa"); stmt3.setString(2, "Łukasz Wojciech M. Tworzydło");
        stmt3.setString(3, "2019"); stmt3.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_books' [1.4]
        PreparedStatement stmt4 = con.prepareStatement("INSERT INTO adv_books (rodzaj_ksiazki, autor, rok_rozpoczecia) VALUES (?, ?, ?)");
        ((PreparedStatement)stmt4).setString(1, "religijna"); stmt4.setString(2, "Łukasz Wojciech M. Tworzydło");
        stmt4.setString(3, "2019"); stmt4.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_books' [1.5]
        PreparedStatement stmt5 = con.prepareStatement("INSERT INTO adv_books (rodzaj_ksiazki, autor, rok_rozpoczecia) VALUES (?, ?, ?)");
        ((PreparedStatement)stmt5).setString(1, "projektowa"); stmt5.setString(2, "Łukasz Wojciech M. Tworzydło");
        stmt5.setString(3, "2019"); stmt5.executeUpdate();*/

        /*// dodanie nowego rekordu do tabeli 'adv_websites' [2.1]
        PreparedStatement stmt6 = con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt6).setString(1, "ADV Publishing"); stmt6.setString(2, "wydawnicza");
        stmt6.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt6.setString(4,"https://advpublishing.wordpress.com/"); stmt6.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_websites' [2.2]
        PreparedStatement stmt7 = con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt7).setString(1, "Just Travel Today"); stmt7.setString(2, "podróżnicza");
        stmt7.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt7.setString(4,"https://just-travel-today.com/"); stmt7.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_websites' [2.3]
        PreparedStatement stmt8 = con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt8).setString(1, "AVANT DE VENIR"); stmt8.setString(2, "muzyczna");
        stmt8.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt8.setString(4,"https://avantdevenir.wordpress.com/"); stmt8.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_websites' [2.4]
        PreparedStatement stmt9= con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt9).setString(1, "Edukacja Kreacja"); stmt9.setString(2, "edukacyjna");
        stmt9.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt9.setString(4,"https://edukacjakreacja.wordpress.com/"); stmt9.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_websites' [2.5]
        PreparedStatement stmt10 = con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt10).setString(1, "Wiedza Przyszłości"); stmt10.setString(2, "naukowa");
        stmt10.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt10.setString(4,"https://wiedzaprzyszlosci.wordpress.com/"); stmt10.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_websites' [2.6]
        PreparedStatement stmt11 = con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt11).setString(1, "Projekty AD"); stmt11.setString(2, "projektowa");
        stmt11.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt11.setString(4,"https://projektyad.wordpress.com/"); stmt11.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_websites' [2.7]
        PreparedStatement stmt12 = con.prepareStatement("INSERT INTO adv_websites (nazwa_strony, rodzaj_strony, tworca_strony, strona_www) VALUES (?, ?, ?, ?)");
        ((PreparedStatement)stmt12).setString(1, "Sacris Coelum"); stmt12.setString(2, "religijna");
        stmt12.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt12.setString(4,"https://sacriscoelum.wordpress.com/"); stmt12.executeUpdate();*/

        /*// dodanie nowego rekordu do tabeli 'adv_travel' [3.1]
        PreparedStatement stmtA = con.prepareStatement("INSERT INTO adv_travel (kraj, nazwa_filmu, tworca, nazwa_kanalu, www_youtube) VALUES (?, ?, ?, ?, ?)");
        ((PreparedStatement)stmtA).setString(1, "Israel & Jordan"); stmtA.setString(2, "Let's start our journey!");
        stmtA.setString(3, "JustTravelToday & luqastro :>"); stmtA.setString(4,"Just Travel Today");
        stmtA.setString(5,"https://youtu.be/g6kZjtrKQtw"); stmtA.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_travel' [3.2]
        PreparedStatement stmtB = con.prepareStatement("INSERT INTO adv_travel (kraj, nazwa_filmu, tworca, nazwa_kanalu, www_youtube) VALUES (?, ?, ?, ?, ?)");
        ((PreparedStatement)stmtB).setString(1, "Israel & Jordan"); stmtB.setString(2, "The Holy Land, and even more!");
        stmtB.setString(3, "JustTravelToday & luqastro :>"); stmtB.setString(4,"Just Travel Today");
        stmtB.setString(5,"https://youtu.be/-yAXYJTpksU"); stmtB.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_travel' [3.3]
        PreparedStatement stmtC = con.prepareStatement("INSERT INTO adv_travel (kraj, nazwa_filmu, tworca, nazwa_kanalu, www_youtube) VALUES (?, ?, ?, ?, ?)");
        ((PreparedStatement)stmtC).setString(1, "Israel"); stmtC.setString(2, "Let’s drive together!");
        stmtC.setString(3, "JustTravelToday & luqastro :>"); stmtC.setString(4,"Just Travel Today");
        stmtC.setString(5,"https://youtu.be/5DdLthH5ivg"); stmtC.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_travel' [3.4]
        PreparedStatement stmtD = con.prepareStatement("INSERT INTO adv_travel (kraj, nazwa_filmu, tworca, nazwa_kanalu, www_youtube) VALUES (?, ?, ?, ?, ?)");
        ((PreparedStatement)stmtD).setString(1, "Israel"); stmtD.setString(2, "Driving through Israel… breathtaking views!");
        stmtD.setString(3, "JustTravelToday & luqastro :>"); stmtD.setString(4,"Just Travel Today");
        stmtD.setString(5,"https://youtu.be/bwnLhjKIdcc"); stmtD.executeUpdate();
        // dodanie nowego rekordu do tabeli 'adv_travel' [3.5]
        PreparedStatement stmtE = con.prepareStatement("INSERT INTO adv_travel (kraj, nazwa_filmu, tworca, nazwa_kanalu, www_youtube) VALUES (?, ?, ?, ?, ?)");
        ((PreparedStatement)stmtE).setString(1, "Israel & Jordan"); stmtE.setString(2, "The Last Expedition!");
        stmtE.setString(3, "JustTravelToday & luqastro :>"); stmtE.setString(4,"Just Travel Today");
        stmtE.setString(5,"https://youtu.be/BhQvj6F6Wk4"); stmtE.executeUpdate();*/

        // rozpoczęcie działania menu wyboru niniejszego programu
        adv_activity_menu();
    }
    public static void adv_activity_menu() // menu of the software
    {
        var option_number = -1;
        while (option_number != 9) {
            System.out.println("1. Dodaj nowy rekord do bazy danych do tabeli 'adv_books'");
            System.out.println("2. Usuń wybrany rekord z tabli 'adv_books' z bazy danych [niedostępne]");
            System.out.println("3. Wybierz i wyświetl początki publikacji z książek dla 2018 lub 2019 roku");
            System.out.println("4. Wyświetl początki publikacji wszystkich rodzajów książek z roku 2018 i 2019");
            System.out.println("5. Wyświetl rodzaj ksiązki, jej początki, nazwę strony i odnośnik do strony www");
            System.out.println("6. Wyświetl stronę i filmiki podróżnicze [Just Travel Today]");
            System.out.println("7. Wyświetl wszystkie rodzaje oraz nazwy stron internetowych");
            System.out.println("8. Wyświetl stronę wydawnictwa ADV Publishing oraz blog podróżniczy Just Travel Today");
            System.out.println("9. Wpisz wartość 9, aby zakończyć program");
            option_number = sc.nextInt();
            switch (option_number) {
                default:
                    option_number = 9;
                    break;
                case 8:
                    ADVPublishing_JustTravelToday();
                    StartAgain();
                case 7:
                    Type_NameOfAWebsite();
                    StartAgain();
                case 6:
                    Website_TravelVideos();
                    StartAgain();
                case 5:
                    Type_Since_Name_URL();
                    StartAgain();
                case 4:
                    TheBeginning();
                    StartAgain();
                case 3:
                    F18_F19();
                    StartAgain();
                case 2:
                    DeleteARecord();
                    StartAgain();
                case 1:
                    AddARecord();
                    StartAgain();
            }
        }
    }
    public static void ADVPublishing_JustTravelToday() // case no 8
    {
        System.out.println("\n=> ADV Publishing & Just Travel Today:");
        var selectYear = 0;
        selectYear = sc.nextInt();
        // ???
    }
    public static void Type_NameOfAWebsite() // case no 7
    {
        System.out.println("\n=> Rodzaje i nazwy stron internetowych:");
        // ???
    }

    public static void Website_TravelVideos() // case no 6
    {
        System.out.println("\n=> Strona i filmiki podróżnicze [Just Travel Today]:");
        // ???
    }
    public static void Type_Since_Name_URL() // case no 5 [main]
    {
        System.out.println("\n=> Wybierz numer od 1 do 5 w celu wybrania rodzaju ksiązki," +
                "\n   aby wyświetlić jej nazwę, początki, nazwę strony i odnośnik do strony www:");
        var option_case = 0;
        while (option_case != 0)
        {
            System.out.println("0. Wpisz wartość 0, aby zakończyć program");
            System.out.println("1. Wybierz i wyświetl rodzaj 'muzyczna'");
            System.out.println("2. Wybierz i wyświetl rodzaj 'edukacyjna'");
            System.out.println("3. Wybierz i wyświetl rodzaj 'naukowa'");
            System.out.println("4. Wybierz i wyświetl rodzaj 'religijna'");
            System.out.println("5. Wybierz i wyświetl rodzaj 'projektowa'");
            option_case = sc.nextInt();
            switch (option_case)
            {
                default: option_case = 0; break;
                case 1: muzyczna(); //break;
                case 2: edukacyjna(); //break;
                case 3: naukowa(); //break;
                case 4: religijna(); //break;
                case 5: projektowa(); //break;
            }
        }
    }
    public static  void muzyczna() // case no 5.1
    {
        ///
    }
    public static void edukacyjna() // case no 5.2
    {
        ///
    }
    public static void naukowa() // case no 5.3
    {
        ///
    }
    public static void religijna() // case no 5.4
    {
        ///
    }
    public static void projektowa() // case no 5.5
    {
        ///
    }
    public static void TheBeginning() // case no 4
    {
        System.out.println("\n=> Początki publikacji wszystkich rodzajów książek z roku 2018 i 2019:");
        // ???
    }
    public static void F18_F19() // case no 3
    {
        System.out.println("\n=> Wybierz rok, aby zobaczyć początki publikacji" +
                "\n   poszczególnych rodzajów książek dla 2018 lub 2019 roku:");
        var option_year = 0;
        while (option_year != 0)
        {
            System.out.println("0. Zakończ program");
            System.out.println("1. Wybierz rok 2018");
            System.out.println("2. Wybierz rok 2019");
            option_year = sc.nextInt();
            switch (option_year)
            {
                default: option_year = 0; break;
                case 1: F2018(); //break;
                case 2: F2019(); //break;
            }
        }
    }
    public static void F2018() // case no 3.1
    {
        System.out.println("\n=> Początki z roku 2018:");
        // ???
    }
    public static void F2019() // case no 3.2
    {
        System.out.println("\n=> Początki z roku 2019:");
        // ???
    }
    public static void DeleteARecord() // case no 2
    {
        System.out.println("\n=> Niestety ta funkcja jest obecnie niedostępna :<" +
                "\n   Kontynuuj, aby wrócić do menu oraz wybrać inną opcję");
    }
    public static void AddARecord() // case no 1
    {
        System.out.println("\n=> Dodaj nowy rekord do bazy danych, jeden wiersz (krotkę) do tabeli 'adv_books':");
        // ???
    }
    public static void StartAgain() // restart a software
    {
        System.out.println("\n=> Rozpocząć ponownie działanie programu?");
        String YoN = "nie";
        while (YoN != "nie")
        {
            System.out.println("tak");
            System.out.println("nie");
            switch (YoN)
            {
                default: YoN = "nie"; break;
                case "tak": adv_activity_menu();
            }
        }
    }
}
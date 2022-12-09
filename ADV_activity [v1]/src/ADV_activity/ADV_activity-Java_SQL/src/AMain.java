import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;


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
        // uzupełnienie bazy danych o 17 rekordów [dla stworzonych 3 tabel]
        // AddNewRecords_17(); // gdy kod zostanie użyty to należy go ukryć,
        // aby przypadkiem nie został wywołany po raz kolejny, zdublowany

        // rozpoczęcie działania menu wyboru niniejszego programu
        adv_activity_menu();
    }
    public static void AddNewRecords_17() throws Exception
    {

        // odniesienie do lokalnej bazy danych [XAMPP]
        // oraz wywołanie bazy danych '5_adv_activity'
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

        // dodanie nowego rekordu do tabeli 'adv_books' [1.1]
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
        stmt5.setString(3, "2019"); stmt5.executeUpdate();

        // dodanie nowego rekordu do tabeli 'adv_websites' [2.1]
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
        stmt12.setString(3, "Łukasz Wojciech M. Tworzydło"); stmt12.setString(4,"https://sacriscoelum.wordpress.com/"); stmt12.executeUpdate();

        // dodanie nowego rekordu do tabeli 'adv_travel' [3.1]
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
        stmtE.setString(5,"https://youtu.be/BhQvj6F6Wk4"); stmtE.executeUpdate();
    }
    public static void adv_activity_menu() // menu of the software
    {
        System.out.println();

        var option_number =-1;
            System.out.println("1. Dodaj nowy rekord do bazy danych do tabeli 'adv_books'");
            System.out.println("2. Usuń wybrany rekord z tabeli 'adv_books' z bazy danych [niedostępne]");
            System.out.println("3. Wybierz i wyświetl początki publikacji z książek dla 2018 lub 2019 roku");
            System.out.println("4. Wyświetl początki publikacji wszystkich rodzajów książek z roku 2018 i 2019");
            System.out.println("5. Wyświetl rodzaj ksiązki, jej początki, nazwę strony i odnośnik do strony www");
            System.out.println("6. Wyświetl stronę i filmiki podróżnicze [Just Travel Today]");
            System.out.println("7. Wyświetl wszystkie rodzaje oraz nazwy stron internetowych");
            System.out.println("8. Wyświetl stronę wydawnictwa ADV Publishing oraz blog podróżniczy Just Travel Today");
            System.out.println("9. Wpisz wartość 9, aby zakończyć program");
            System.out.println();
            option_number = sc.nextInt();
            switch (option_number) {
                default:
                    option_number = 9;
                    break;
                case 8:
                    ADVPublishing_JustTravelToday();
                    StartAgain();
                    break;
                case 7:
                    Type_NameOfAWebsite();
                    StartAgain();
                    break;
                case 6:
                    Website_TravelVideos();
                    StartAgain();
                    break;
                case 5:
                    Type_Since_Name_URL();
                    break;
                case 4:
                    TheBeginning();
                    StartAgain();
                    break;
                case 3:
                    F18_F19();
                    StartAgain();
                    break;
                case 2:
                    DeleteARecord();
                    StartAgain();
                    break;
                case 1:
                    AddARecord();
                    StartAgain();
                    break;
        }
    }
    public static void ADVPublishing_JustTravelToday()  // case no 8
    {
        System.out.println("\n=> ADV Publishing & Just Travel Today:\n");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c8 = con.createStatement();

            ResultSet lc_8a = stmt_c8.executeQuery("SELECT adv_websites.nazwa_strony, adv_websites.strona_www FROM adv_websites\n" +
                    "WHERE (adv_websites.nazwa_strony = 'ADV Publishing' OR adv_websites.nazwa_strony = 'Just Travel Today')");
            while(lc_8a.next()) System.out.println(lc_8a.getString(1)); // wyświetlenie nazw stron internetowych

            ResultSet lc_8b= stmt_c8.executeQuery("SELECT adv_websites.nazwa_strony, adv_websites.strona_www FROM adv_websites\n" +
                    "WHERE (adv_websites.nazwa_strony = 'ADV Publishing' OR adv_websites.nazwa_strony = 'Just Travel Today')");
            while(lc_8b.next()) System.out.println(lc_8b.getString(2)); // wyświetlenie odnośników do stron www

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Type_NameOfAWebsite() // case no 7
    {
        System.out.println("\n=> Rodzaje i nazwy stron internetowych:\n");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c7 = con.createStatement();

            ResultSet lc_7a = stmt_c7.executeQuery("SELECT adv_websites.rodzaj_strony, adv_websites.nazwa_strony FROM adv_websites");
            while(lc_7a.next()) System.out.println("* " + lc_7a.getString(1)); // wyświetlenie nazw stron internetowych
            System.out.println();
            ResultSet lc_7b = stmt_c7.executeQuery("SELECT adv_websites.rodzaj_strony, adv_websites.nazwa_strony FROM adv_websites");
            while(lc_7b.next()) System.out.println("* " + lc_7b.getString(2)); // wyświetlenie odnośników do stron www

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void Website_TravelVideos() // case no 6
    {
        System.out.println("\n=> Strona i filmiki podróżnicze [Just Travel Today]:\n");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c6 = con.createStatement();

            ResultSet lc_6a = stmt_c6.executeQuery("SELECT adv_websites.nazwa_strony, adv_travel.nazwa_filmu, adv_travel.www_youtube FROM\n" +
                    "adv_websites JOIN adv_travel ON adv_websites.nazwa_strony = adv_travel.nazwa_kanalu");
            while(lc_6a.next()) System.out.println("a) " + lc_6a.getString(1)); // wyświetlenie nazwy strony podróżniczej
            System.out.println();
            ResultSet lc_6b = stmt_c6.executeQuery("SELECT adv_websites.nazwa_strony, adv_travel.nazwa_filmu, adv_travel.www_youtube FROM\n" +
                    "adv_websites JOIN adv_travel ON adv_websites.nazwa_strony = adv_travel.nazwa_kanalu");
            while(lc_6b.next()) System.out.println("b) " + lc_6b.getString(2)); // wyświetlenie nazwy filmu podróżniczego
            System.out.println();
            ResultSet lc_6c = stmt_c6.executeQuery("SELECT adv_websites.nazwa_strony, adv_travel.nazwa_filmu, adv_travel.www_youtube FROM\n" +
                    "adv_websites JOIN adv_travel ON adv_websites.nazwa_strony = adv_travel.nazwa_kanalu");
            while(lc_6c.next()) System.out.println("c) " + lc_6c.getString(3)); // wyświetlenie odnośniku do filmu podróżniczego

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void Type_Since_Name_URL() // case no 5 [main]
    {
        System.out.println("\n=> Wybierz numer od 1 do 5 w celu wybrania rodzaju ksiązki, aby wyświetlić" +
                "\n   jej nazwę, początki, nazwę strony i odnośnik do strony www:\n");
        var option_case = 0;
        {
            System.out.println("0. Wybierz 0, aby zresetować program");
            System.out.println("1. Wybierz i wyświetl rodzaj 'muzyczna'");
            System.out.println("2. Wybierz i wyświetl rodzaj 'edukacyjna'");
            System.out.println("3. Wybierz i wyświetl rodzaj 'naukowa'");
            System.out.println("4. Wybierz i wyświetl rodzaj 'religijna'");
            System.out.println("5. Wybierz i wyświetl rodzaj 'projektowa'");
            System.out.println();
            option_case = sc.nextInt();
            switch (option_case)
            {
                default: option_case = 0; StartAgain(); break;
                case 1: muzyczna(); StartAgain(); break;
                case 2: edukacyjna(); StartAgain(); break;
                case 3: naukowa(); StartAgain(); break;
                case 4: religijna(); StartAgain(); break;
                case 5: projektowa(); StartAgain(); break;
            }
        }
    }
    public static  void muzyczna() // case no 5.1
    {
        System.out.println();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c5c1 = con.createStatement();

            ResultSet lc_5c1a = stmt_c5c1.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'muzyczna' AND adv_websites.rodzaj_strony = 'muzyczna'");
            while(lc_5c1a.next()) System.out.println("-> rodzaj: " + lc_5c1a.getString(1)); // wyświetlenie rodzaju ksiązki

            ResultSet lc_5c1b = stmt_c5c1.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'muzyczna' AND adv_websites.rodzaj_strony = 'muzyczna'");
            while(lc_5c1b.next()) System.out.println("-> początki: " + lc_5c1b.getString(2)); // wyświetlenie roku rozpoczęcia

            ResultSet lc_5c1c = stmt_c5c1.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'muzyczna' AND adv_websites.rodzaj_strony = 'muzyczna'");
            while(lc_5c1c.next()) System.out.println("-> nazwa strony: " + lc_5c1c.getString(3)); // wyświetlenie nazwy strony internetowej

            ResultSet lc_5c1d = stmt_c5c1.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'muzyczna' AND adv_websites.rodzaj_strony = 'muzyczna'");
            while(lc_5c1d.next()) System.out.println("-> odnośnik do strony: " + lc_5c1d.getString(4)); // wyświetlenie odnośnika do strony internetowej
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void edukacyjna() // case no 5.2
    {
        System.out.println();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c5c2 = con.createStatement();

            ResultSet lc_5c2a = stmt_c5c2.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'edukacyjna' AND adv_websites.rodzaj_strony = 'edukacyjna'");
            while(lc_5c2a.next()) System.out.println("-> rodzaj: " + lc_5c2a.getString(1)); // wyświetlenie rodzaju ksiązki

            ResultSet lc_5c2b = stmt_c5c2.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'edukacyjna' AND adv_websites.rodzaj_strony = 'edukacyjna'");
            while(lc_5c2b.next()) System.out.println("-> początki: " + lc_5c2b.getString(2)); // wyświetlenie roku rozpoczęcia

            ResultSet lc_5c2c = stmt_c5c2.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'edukacyjna' AND adv_websites.rodzaj_strony = 'edukacyjna'");
            while(lc_5c2c.next()) System.out.println("-> nazwa strony: " + lc_5c2c.getString(3)); // wyświetlenie nazwy strony internetowej

            ResultSet lc_5c2d = stmt_c5c2.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'edukacyjna' AND adv_websites.rodzaj_strony = 'edukacyjna'");
            while(lc_5c2d.next()) System.out.println("-> odnośnik do strony: " + lc_5c2d.getString(4)); // wyświetlenie odnośnika do strony internetowej
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void naukowa() // case no 5.3
    {
        System.out.println();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c5c3 = con.createStatement();

            ResultSet lc_5c3a = stmt_c5c3.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'naukowa' AND adv_websites.rodzaj_strony = 'naukowa'");
            while(lc_5c3a.next()) System.out.println("-> rodzaj: " + lc_5c3a.getString(1)); // wyświetlenie rodzaju ksiązki

            ResultSet lc_5c3b = stmt_c5c3.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'naukowa' AND adv_websites.rodzaj_strony = 'naukowa'");
            while(lc_5c3b.next()) System.out.println("-> początki: " + lc_5c3b.getString(2)); // wyświetlenie roku rozpoczęcia

            ResultSet lc_5c3c = stmt_c5c3.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'naukowa' AND adv_websites.rodzaj_strony = 'naukowa'");
            while(lc_5c3c.next()) System.out.println("-> nazwa strony: " + lc_5c3c.getString(3)); // wyświetlenie nazwy strony internetowej

            ResultSet lc_5c3d = stmt_c5c3.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'naukowa' AND adv_websites.rodzaj_strony = 'naukowa'");
            while(lc_5c3d.next()) System.out.println("-> odnośnik do strony: " + lc_5c3d.getString(4)); // wyświetlenie odnośnika do strony internetowej
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void religijna() // case no 5.4
    {
        System.out.println();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c5c4 = con.createStatement();

            ResultSet lc_5c4a = stmt_c5c4.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'religijna' AND adv_websites.rodzaj_strony = 'religijna'");
            while(lc_5c4a.next()) System.out.println("-> rodzaj: " + lc_5c4a.getString(1)); // wyświetlenie rodzaju ksiązki

            ResultSet lc_5c4b = stmt_c5c4.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'religijna' AND adv_websites.rodzaj_strony = 'religijna'");
            while(lc_5c4b.next()) System.out.println("-> początki: " + lc_5c4b.getString(2)); // wyświetlenie roku rozpoczęcia

            ResultSet lc_5c4c = stmt_c5c4.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'religijna' AND adv_websites.rodzaj_strony = 'religijna'");
            while(lc_5c4c.next()) System.out.println("-> nazwa strony: " + lc_5c4c.getString(3)); // wyświetlenie nazwy strony internetowej

            ResultSet lc_5c4d = stmt_c5c4.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'religijna' AND adv_websites.rodzaj_strony = 'religijna'");
            while(lc_5c4d.next()) System.out.println("-> odnośnik do strony: " + lc_5c4d.getString(4)); // wyświetlenie odnośnika do strony internetowej
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void projektowa() // case no 5.5
    {
        System.out.println();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c5c5 = con.createStatement();

            ResultSet lc_5c5a = stmt_c5c5.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'projektowa' AND adv_websites.rodzaj_strony = 'projektowa'");
            while(lc_5c5a.next()) System.out.println("-> rodzaj: " + lc_5c5a.getString(1)); // wyświetlenie rodzaju ksiązki

            ResultSet lc_5c5b = stmt_c5c5.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'projektowa' AND adv_websites.rodzaj_strony = 'projektowa'");
            while(lc_5c5b.next()) System.out.println("-> początki: " + lc_5c5b.getString(2)); // wyświetlenie roku rozpoczęcia

            ResultSet lc_5c5c = stmt_c5c5.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'projektowa' AND adv_websites.rodzaj_strony = 'projektowa'");
            while(lc_5c5c.next()) System.out.println("-> nazwa strony: " + lc_5c5c.getString(3)); // wyświetlenie nazwy strony internetowej

            ResultSet lc_5c5d = stmt_c5c5.executeQuery("SELECT adv_books.rodzaj_ksiazki, adv_books.rok_rozpoczecia, adv_websites.nazwa_strony,\n" +
                    "adv_websites.strona_www FROM adv_books JOIN adv_websites ON adv_books.autor = adv_websites.tworca_strony\n" +
                    "WHERE adv_books.rodzaj_ksiazki = 'projektowa' AND adv_websites.rodzaj_strony = 'projektowa'");
            while(lc_5c5d.next()) System.out.println("-> odnośnik do strony: " + lc_5c5d.getString(4)); // wyświetlenie odnośnika do strony internetowej
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void TheBeginning() // case no 4
    {
        System.out.println("\n=> Początki publikacji wszystkich rodzajów książek z roku 2018 i 2019:\n");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c4 = con.createStatement();

            ResultSet lc_4a = stmt_c4.executeQuery("SELECT rodzaj_ksiazki, rok_rozpoczecia FROM adv_books");
            while(lc_4a.next()) System.out.println("-> rodzaj: " + lc_4a.getString(1)); // wyświetlenie wszystkich rodzajów książek
            System.out.println();
            ResultSet lc_4b = stmt_c4.executeQuery("SELECT rodzaj_ksiazki, rok_rozpoczecia FROM adv_books");
            while(lc_4b.next()) System.out.println("-> początki: " + lc_4b.getString(2)); // wyświetlenie początków danych rodzajów

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void F18_F19() // case no 3
    {
        System.out.println("\n=> Wybierz rok, aby zobaczyć początki publikacji" +
                "\n   poszczególnych rodzajów książek dla 2018 lub 2019 roku:\n");
        var option_year = 0;
        {
            System.out.println("0. Zakończ program");
            System.out.println("1. Wybierz rok 2018");
            System.out.println("2. Wybierz rok 2019");
            System.out.println();
            option_year = sc.nextInt();
            switch (option_year)
            {
                default: option_year = 0; break;
                case 1: F2018(); break;
                case 2: F2019(); break;
            }
        }
    }
    public static void F2018() // case no 3.1
    {
        System.out.println("\n=> Początki z roku 2018:");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c3 = con.createStatement();

            ResultSet lc_3F1 = stmt_c3.executeQuery("SELECT rodzaj_ksiazki FROM adv_books WHERE rok_rozpoczecia ='2018'");
            while(lc_3F1.next()) System.out.println("-> rodzaj: " + lc_3F1.getString(1)); // wyświetlenie wszystkich rodzajów książek z 2018 roku

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void F2019() // case no 3.2
    {
        System.out.println("\n=> Początki z roku 2019:");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            Statement stmt_c3 = con.createStatement();

            ResultSet lc_3F2 = stmt_c3.executeQuery("SELECT rodzaj_ksiazki FROM adv_books WHERE rok_rozpoczecia ='2019'");
            while(lc_3F2.next()) System.out.println("-> rodzaj: " + lc_3F2.getString(1)); // wyświetlenie wszystkich rodzajów książek z 2019 roku

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void DeleteARecord() // case no 2
    {
        System.out.println("\n=> Niestety ta funkcja jest obecnie niedostępna :<" +
                "\n   Kontynuuj, aby wrócić do menu oraz wybrać inną opcję");
    }
    public static void AddARecord() // case no 1
    {
        System.out.println("\n=> Dodaj nowy rekord do bazy danych, jeden wiersz (krotkę) do tabeli 'adv_books':\n");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5_adv_activity", "root", "");

            // dodanie nowego, dowolnego rekordu do tabeli 'adv_books'
            PreparedStatement stmt1 = con.prepareStatement("INSERT INTO adv_books (rodzaj_ksiazki, autor, rok_rozpoczecia) VALUES (?, ?, ?)");

            System.out.println("Wpisz kategorię ksiązek [np. muzyczna]");
            String Parameter1;
            Parameter1 = sc.next();

            System.out.println("Wpisz autora ksiązek [czyli imię + nazwisko]");
            String Parameter2;
            Parameter2 = sc.next();

            System.out.println("Wpisz rok rozpoczęcia niniejszej kategorii książek [np. 2012]");
            String Parameter3;
            Parameter3 = sc.next();

            ((PreparedStatement) stmt1).setString(1, Parameter1); // dane do parametru 'rodzaj_ksiazki'
            stmt1.setString(2, Parameter2); // dane do parametru 'autor'
            stmt1.setString(3, Parameter3); // dane do parametru 'rok_rozpoczecia'
            stmt1.executeUpdate(); // wpisanie nowego rekordu do tabeli

            System.out.println("\nGratulacje! Wprowadziłeś/aś nowy rekord do tabeli bazy danych! :>");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void StartAgain() // restart a software
    {
        System.out.println("\n=> Rozpocząć ponownie działanie programu?");
        String YoN = "nie";
        {
            System.out.println("tak");
            System.out.println("nie");
            System.out.println();
            YoN = sc.next();
            switch (YoN)
            {
                case "nie": break;
                case "tak": adv_activity_menu(); break;
            }
        }
    }
}
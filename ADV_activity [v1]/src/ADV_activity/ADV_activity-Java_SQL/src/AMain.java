import java.sql.Connection;
import java.sql.DriverManager;

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
                    //break;
                case 7:
                    Type_NameOfAWebsite();
                    //break;
                case 6:
                    Website_TravelVideos();
                    //break;
                case 5:
                    Type_Since_Name_URL();
                    //break;
                case 4:
                    TheBeginning();
                    //break;
                case 3:
                    F18_F19();
                    //break;
                case 2:
                    DeleteARecord();
                    //break;
                case 1:
                    AddARecord();
                    //break;
            }
        }
    }
    public static void ADVPublishing_JustTravelToday() // case no 8
    {
        System.out.println("\n=> ADV Publishing & Just Travel Today:");
        var selectYear = 0;
        selectYear = sc.nextInt();
        // ???

        StartAgain();
    }
    public static void Type_NameOfAWebsite() // case no 7
    {
        System.out.println("\n=> Rodzaje i nazwy stron internetowych:");
        // ???

        StartAgain();
    }

    public static void Website_TravelVideos() // case no 6
    {
        System.out.println("\n=> Strona i filmiki podróżnicze [Just Travel Today]:");
        // ???

        StartAgain();
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

        StartAgain();
    }
    public static void edukacyjna() // case no 5.2
    {
        ///

        StartAgain();
    }
    public static void naukowa() // case no 5.3
    {
        ///

        StartAgain();
    }
    public static void religijna() // case no 5.4
    {
        ///

        StartAgain();
    }
    public static void projektowa() // case no 5.5
    {
        ///

        StartAgain();
    }
    public static void TheBeginning() // case no 4
    {
        System.out.println("\n=> Początki publikacji wszystkich rodzajów książek z roku 2018 i 2019:");
        // ???

        StartAgain();
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

        StartAgain();
    }
    public static void F2019() // case no 3.2
    {
        System.out.println("\n=> Początki z roku 2019:");
        // ???

        StartAgain();
    }
    public static void DeleteARecord() // case no 2
    {
        System.out.println("\n=> Niestety ta funkcja jest obecnie niedostępna :<" +
                "\n   Kontynuuj, aby wrócić do menu oraz wybrać inną opcję");
        StartAgain();
    }
    public static void AddARecord() // case no 1
    {
        System.out.println("\n=> Dodaj nowy rekord do bazy danych, jeden wiersz (krotkę) do tabeli 'adv_books':");
        // ???

        StartAgain();
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
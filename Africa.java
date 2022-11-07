import java.util.ArrayList;
import java.util.Scanner;

public class Africa extends Location{

    final String name = "South Africa";
    public String africaItem = "Africa item";

    public String getLocationName()
    {
        return name;
    }


    @Override
    public String addItem() {
        return africaItem;
    }

    @Override
    public String countryLocation1() {
        return "Location 1";
    }

    @Override
    public String countryLocation2() {
        return "Location 2";
    }

    public String getLocationInformation() {
        return"""
                I sydafrika sker der mellem 35- og 40 tusinde skovbrande årligt. Disse er primært naturlige,
                dog er der et antal der er menneskeskabte. Disse sker grundet uagtsomhed, og især at
                folk blot brænder deres affald. Når dette sker, så tænker de ikke over deres omgivelser
                og den tørre jord de står på. Derfor glemmer mange også, at deres affaldsbrænde kan være
                direkte medvirkende til stiftelsen af en skov- eller naturbrand.""";
    }

    public void PrintQuestions(){
        System.out.println("""

                Bør man brænde sit eget affald (evt. haveaffald) i baghaven, taget i betragtning at
                området kan være i en super-tør periode?
                Svarmuligheder (Ja / Nej)""");
        NoQuestion();
    }

    @Override
    public String getLocationInformation2() {
        return """
                Information 2
                """;
    }

    @Override
    public void PrintQuestions2() {
        System.out.println("""
                Spørgsmål 2
                """);
        YesQuestion();
    }
}

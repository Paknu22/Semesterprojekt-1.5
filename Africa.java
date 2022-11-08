import java.util.ArrayList;
import java.util.Scanner;

public class Africa extends Location{

    final String name = "Syd Africa";
    public String africaItem = "Vandhane";

    public String getLocationName()
    {
        return name;
    }


    @Override
    public String addItem() {
        return africaItem;
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
}

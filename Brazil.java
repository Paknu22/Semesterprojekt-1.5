import java.util.ArrayList;
import java.util.Scanner;

public class Brazil extends Location {

    final String name = "Brazil";
    public String brazilItem = "brazil item";

    public String getLocationName() {
        return name;
    }

    @Override
    public String addItem() {
        return brazilItem;
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
        return """
                Amazonas er verdens største regnskov, og den huser mere end 30 millioner mennesker samt
                1/10 af alle kendte dyrearter. I de seneste år er der blevet stiftet et stort antal
                skovbrande i Amazonas. Helt præcist 33.116 alene i August 2022. Dette gøres af militante
                grupper for at stjæle det pågældende land og derefter bruge det til andre forretninger.
                Det siges at den brasilianske regering, ledet af Jair Bolsonaro, er skyld i dette ærgerlige
                scenarie. Den nuværende regering har siden 2019 støttet diverse militsgrupper der udrydder
                og brænder områder i regnskoven som huser den indfødte befolkning.
                """;
    }

    public void PrintQuestions() {
        System.out.println("""
                Er det en god ide at den brassilianske regering starter alle disse skovbrande i Amazonas”?
                Svarmuligheder (Ja / Nej)
                """);
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
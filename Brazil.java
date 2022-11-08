import java.util.ArrayList;
import java.util.Scanner;

public class Brazil extends Location {

    final String name = "Brasilien";
    public String brazilItem = "Vandslange";

    public String getLocationName() {
        return name;
    }

    @Override
    public String addItem() {
        return brazilItem;
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
                Er det en godt at den brassilianske regering starter alle disse skovbrande i Amazonas”?
                Svarmuligheder (Ja / Nej)
                """);
        NoQuestion();
    }
}
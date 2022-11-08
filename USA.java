import java.util.ArrayList;
import java.util.Scanner;

public class USA extends Location {

    final String name = "USA";
    public String usaItem = "Brandhelikopter";

    public String getLocationName() {
        return name;
    }

    @Override
    public String addItem() {
        return usaItem;
    }

    public String getLocationInformation() {
        return """
                Når efteråret nærmer sig stiger antallet af skovbrande i det vestlige Californien.
                Det er faktisk i efteråret at de mest skadelige og farlige skovbrande finder sted.
                Det er i sandhed en hyggelig tid på året, hvilket også er hvorfor at mange tager
                ud og oplever den skønne natur. De største årsager til menneskeskabte skovbrande i
                lige netop dette område er ting som efterladte bål (som er ulovlige i staten
                bortset fra enkelte strande) og fyrværkeri som antænder den tørre vegetation med
                små gnister. Før har tabte cigaretskodder været en stor faktor for starten af
                skovbrande i det vestlige californien, dog er det blevet en mindre hyppig ting.
                """;
    }

    public void printQuestions() {
        System.out.println("Skal man slukke sit ulovlige bål når man er færdig med at bruge det?\n" +
                "Svarmuligheder (Ja / Nej)");
        yesQuestion();
    }
}

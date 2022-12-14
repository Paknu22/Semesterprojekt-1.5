import java.util.ArrayList;
import java.util.Scanner;

public class Australia extends Location {

    final String name = "Australien";
    public String australiaItem = "Brandmand";

    public String getLocationName() {
        return name;
    }

    @Override
    public String addItem() {
        return australiaItem;
    }

    public String getLocationInformation() {
        return """
                Velkommen, du er i Oodnadatta - den tørreste by i Australien. Her har vi en masse skovbrande årligt,
                fordi der er så meget brandbart materiale! Vi har nemlig fulgt amerikanske anvisninger og prøvet
                at undgå skovbrande i en så høj grad, at vi har alt for meget vegetabilsk materiale der, i naturens
                vilje, skulle være brændt.  Dette er dog ikke sket, og derfor har du måske hørt om skovbrande i
                Australien før! Vi har nemlig så meget “benzin” på jorden at du kan antænde et kæmpemæssigt arial
                med noget så uskyldigt som en tændstik. Det er vigtigt at lade de naturlige skovbrande løbe deres
                gang, ellers ender I i en situation magen til vores!
                """;
    }

    public void printQuestions() {
        System.out.println("Bør man bekæmpe alle former for skovbrande?\n" +
                "Svarmuligheder (Ja / Nej)");
        noQuestion();
    }
}
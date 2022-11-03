public class Indonesia extends Location{
    final String name = "Indonesia";

    public String getLocationName()
    {
        return name;
    }

    public String getLocationInformation() {
        return"""
                Velkommen til Sumatra, Indonesien. Økonomien buldrer fremad hernede, og derfor
                har vi en masse firmaer der har brug for plads til at vækste. Vi har en
                masse skøn natur, og den sætter vi stor stolthed i. Det er dog ærgerligt,
                at der sidste år blev brændt 328,724 hektar land fra Januar til August alene.
                Vi har en tør sæson fra Juli til Oktober, og der plejer der faktisk at være endnu
                flere brænde. Mange af brændende er intentionelle på baggrund af et ønske om mere
                plads til at plante diverse planter der kan laves olie af. Men ikke nok med det,
                så har vi en stor del af befolkningen der ryger, kører i slidte biler, mm. Folk
                taber cigaretskodder, mister deres dæk på vejen så fælgen laver gnister direkte
                mod asfalten og bremser uden bremseskiver så bremsen er metal mod metal hvilket
                også forårsager gnister. Så pas på derude, og gør alt hvad du kan for at undgå gnister
                i tørre områder!
                """;
    }

    public void PrintQuestions(){
        System.out.println("""
                Du kører på vejen i Sumatra, Indonesien og mærker at bilen bremser lidt underligt.
                Det er som om der er noget der skurrer omme bagfra. Hvad gør du?
                
                1: Jeg ignorerer det og kører videre uden bekymring.
                2: Jeg sætter bilen i frigear, lader den rulle og trækker ind til siden når
                det muligt hvorefter jeg tjekker bremsernes tilstand. Er de i dårlig stand
                skal de skiftes før den videre kørsel.
                3: Jeg undlader at bruge bremserne på min tur.
                Svarmuligheder (1 / 2 / 3)
                """);
        Correct2();
    }
}

public class Portugal extends Location {
    final String name = "Portugal";
    public String protugalItem = "Portugal item";

    public String getLocationName() {
        return name;
    }

    @Override
    public String addItem() {
        return protugalItem;
    }

    public String getLocationInformation() {
        return """
                Velkommen til Portugal! Her har vi en masse skovbrande årligt, fordi vi også
                har en masse tørre områder. Vores temperaturer var oppe på 40 grader
                nogle dage sidste sommer, og vi fik allesammen en notifikation på vores
                telefon om at være påpasselige. Her har været hundredvis af skovbrande som
                har tvunget et større antal landsbyboere ind mod mere sikre zoner. Mange af
                skovbrandene er forårsaget af en kombination af varme, tørke og vind. Disse er
                naturlige. Dog har vi også oplevet at nogle har været uagtsomme i vores natur
                og muligvis bare kastet deres cigaretskodder på jorden. Dette har været en mulig
                faktor i stiftelsen af nogle af de dødeligste skovbrande i landets historie,
                så dette holdes der også ekstra øje med i disse dage. Husk! Du må aldrig bare
                smide dine cigaretskodder. Hav altid en æske eller brændsikker pose med, hvis du
                ved at du vil ryge. Det er faktisk bedst at lade helt vær med at ryge, men gør du
                det alligevel, så husk et sikkert sted at smide det ud bagefter!
                """;
    }

    public void PrintQuestions() {
        System.out.println("Må man gerne smide sine cigaretskodder på jorden lige efter man har røget færdig?\n" +
                "Svarmuligheder (Ja / Nej)");
        NoQuestion();
    }
}
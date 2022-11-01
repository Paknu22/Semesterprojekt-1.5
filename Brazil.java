public class Brazil extends Location{
    final String name = "Brazil";

    public String getLocationName()
    {
        return name;
    }

    public void getLocationInformation() {
        System.out.println("""
                Amazonas er verdens største regnskov, og den huser mere end 30 millioner mennesker samt
                1/10 af alle kendte dyrearter. I de seneste år er der blevet stiftet et stort antal
                skovbrande i Amazonas. Helt præcist 33.116 alene i August 2022. Dette gøres af militante
                grupper for at stjæle det pågældende land og derefter bruge det til andre forretninger.
                Det siges at den brasilianske regering, ledet af Jair Bolsonaro, er skyld i dette ærgerlige
                scenarie. Den nuværende regering har siden 2019 støttet diverse militsgrupper der udrydder
                og brænder områder i regnskoven som huser den indfødte befolkning.
                """);
    }

    public void PrintQuestions(){
        System.out.println("""
                Er det en god ide at tage på sabbatårsrejse til Rio De Janeiro for at finde sig
                selv og samtidigt støtte den brasilianske økonomi hvis man støtter klimaet
                og i forvejen spiser vegansk mad for at “passe på dyrene”?
                Svarmuligheder (Ja / Nej)
                """);
        NoQuestion();
    }
}

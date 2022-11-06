public class Greece extends Location{
    final String name = "Greece";
    public String greeceItem = "Greece item";

    public String getLocationName()
    {
        return name;
    }

    @Override
    public String addItem() {
        return greeceItem;
    }

    public String getLocationInformation() {
        return"""
                Sidste år mistede grækenland 250.000 hektar skov til skovbrande.
                Brandmænd var oppe mod 20 kilometer lange skovbrande, og
                klimaet kollapser. Regeringen kunne ikke gøre noget
                tilstrækkeligt ved situationen, så den fortsatte. Statsminister
                Kyriakos Mitsotakis beskyldte klimaændringer og forsvarede hans
                regerings strategi. Der blev bl.a. arresteret 8 mænd og 1 kvinde
                på grund af uagtsomhed i skoven der forårsagede en skovbrand.
                Regeringen mener også at mange af de andre skovbrande har været
                af samme årsag, dog har det ikke endnu kunnet bevises. I år der 82
                døde til skovbrande indtil videre.
                """;
    }

    public void PrintQuestions(){
        System.out.println("""
                Du er på ferie i Grækenland med din familie om sommeren, og I har lyst til at tage på en udflugt\s
                til en skov hvor i skal hygge jer. Din ven spørger om I ikke skal lave et bål og grille\s
                nogle pølser. Hvad gør du?
                
                1: Jeg siger ja tak og henter kartoffelsalaten
                
                2: Jeg tænker mig om, tjekker området for tørre blade og accepterer derefter.\s
                
                3: Jeg fortæller min ven om de forfærdelige risici der kan være ved brandstiftelse i områder\s
                med tørke og tager på McDonalds i stedet.
                
                Svarmuligheder (1 / 2 / 3)
                """);
        Correct2();
    }
}

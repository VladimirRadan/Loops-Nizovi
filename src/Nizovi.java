public class Nizovi {

    public static void main(String[] args) {

        int niz[] = new int[4];
        niz[0] = 5;
        niz[1] = 6;
        niz[2] = 7;
        niz[3] = 8;

        System.out.println("Duzina niza je: " + niz.length);


        String[] nizStringova = {"Pera", "Zika", "Laza"};
        nizStringova[2] = "Djura";
        //nizStringova[3] = "Adam";

        System.out.println("Duzina niza je: " + nizStringova.length);

        System.out.println(nizStringova);

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }

        for (String a : nizStringova) {
            System.out.println(a);
        }



    }

}

import java.util.Arrays;

public class Nizovi {

    public static void main(String[] args) {

        //int a = 5;

        int mojNiz [] = new int[6];// -----------> @urf843hffw
        mojNiz[0] = 15;
        mojNiz[1] = 20;
        mojNiz[5] = 50;

//        for (int i = 0; i < mojNiz.length; i++) {
//            System.out.println(mojNiz[i]);
//        }

        int niz[] = {55, 8, 9, 10, 56, 78};// indexi krecu od 0  mesto u memoriji ---> [I@27f674d

        Arrays.sort(niz);
        //System.out.println(Arrays.toString(niz));

//        System.out.println(niz.length);
//        System.out.println(niz);
//
//        for (int i = 0; i < niz.length; i++) {
//            System.out.println(niz[i]);
//        }

//        for (int i: niz){  //hasNext
//            System.out.println(i);
//        }


       // System.out.println(niz[niz.length-2]);

        String nizDanaUNedelji [] = new String[]{"Pon", "Uto", "Sre"};

        int [][] niz2d = new int[][]{
                {1, 2, 8},
                {3,5,6},
                {5,6,7}
        };

        System.out.println(niz2d[1][2]);

        for (int i = 0; i < niz2d.length; i++) {
            for (int j = 0; j < niz2d[i].length; j++) {
                System.out.print(niz2d[i][j]);
            }
            System.out.println();
        }







    }


}

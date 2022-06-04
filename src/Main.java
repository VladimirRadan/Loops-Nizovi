public class Main {

    public static void main(String[] args) {


//        for (int i = 10; i > 0; i--) {
//            System.out.println("Iterator: " + i);
//        }


//        for (;;) {
//            System.out.println("Infinite loop");
//        }


//        for (int i = 0; i <10; i++){
//            for (int j = 0; j<20; j++){
//                System.out.println("Iteratot i: " + i + " iterator j: " + j);
//            }
//        }


        int a = 0;
        while (a < 10){
            a++;
            if (a == 5){
                continue;
                //System.out.println("Skipujem 5");
            }else {
                System.out.println(a);
            }

        }








    }


}//end class

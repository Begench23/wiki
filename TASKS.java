public class TASKS {

    public static void main(String[] args) {


        int[] given = {1, 2, 3, -2, 0};
        int n = 4;

        for (int n1 = 0; n1 < given.length; n1++) {

            for (int n2 = n1+1; n2 < given.length; n2++) {

                for (int n3 = n2+1; n3 < given.length; n3++) {

                    for (int n4 = n3+1; n4 < given.length; n4++) {

                        int zero;
                        zero= n1+n2+n3+n4;
                        if (zero==0){
                            int [] arrResult = {n1, n2, n3, n4};
                            System.out.println;
                        }

                    }
                }
            }

        }


    }


}

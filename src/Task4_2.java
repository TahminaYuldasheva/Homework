public class Task4_2 {
    public static void main(String[] args) {
        char[][] array = new char [8][8];

        for(int i =0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if((i+j)%2==0) {
                    System.out.print('W');
                }
                else {
                    System.out.print('B');
                }
            }
            System.out.println();
        }
    }
}

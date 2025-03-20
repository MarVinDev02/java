package NivelBasico;

public class Arrays {
    public static void main(String[] args) {
        String[] ninja = new String[4];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";

        boolean[] bool = new boolean[1];
        bool[0] = true;
        System.out.println(bool[0]);

        int[] num = new int[3];
        num[1] = (int) Math.random();
        System.out.println(num[0]);
        System.out.println(num[1]);

    //Redeclarar array;
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Haruzen Sarutobi";
        ninja[3] = "Minatu Uzumaki";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        for (int i = 0; i < 7; i++){
            System.out.println(ninja[i]);
        }
    }


}

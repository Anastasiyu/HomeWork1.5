public class Main {
    public static void main(String[] args) { Task1();
    }

    public static void Task1() {
        int[] box = new int[]{1, 2, 3};
        double[] arrayBox = new double[3];
        arrayBox[0] = 1.12;
        arrayBox[1] = 2.13;
        arrayBox[2] = 3.14;
        boolean[] arrayBool = {true, false, false};
        for (int i = 0; i < arrayBox.length; i++) {
            System.out.print(box[i] + ",");

        }
        System.out.print(box[arrayBox.length-1]);
    }}

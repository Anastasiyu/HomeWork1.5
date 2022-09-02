public class Main {
    public static void main(String[] args) {


    int[] Box = new int[]{1, 2, 3};

    double[] arrayBox = new double[3];
    arrayBox[0]=1.25;
    arrayBox[1]=2.36;
    arrayBox[2]=3.47;

    boolean[] arrayBig = {false, true, true, false};

    for (int i = 0; i < Box.length -1; i++) {
        System.out.print(Box[i] +", ");
    }
System.out.println(Box[Box.length - 1]);

    for (int i = 0; i < arrayBox.length; i++){
        System.out.print(arrayBox[i]);
        if(i!=arrayBox.length-1);{
        System.out.print(", ");

        }}
        System.out.println();
            for (int i = 0; i < arrayBig.length; i++){
                System.out.print(arrayBig[i]);
                if(i!=arrayBig.length-1);{
                System.out.print(", ");
        }}}}
import java.util.Arrays;

public class Main {
    // Hi sensei
    public static void main(String[] args) {
        double[] array = {8.2, -64.2, 12.5, 31.0, 16.2, -9.69, 51.0, 6.3,
                          5.99, -87.2, 13.2, 32.2, 14.2, -8.5, -6.9};
        int count=0;
        double sum=0, avg=0;
        boolean check = false;
                
        for (double i: array) {
            if (i<0) {
                check = true;
            }
            if(check){
                if(i>0) {
                    count++;
                    sum += i;
                }
            }
        }

        avg = sum/count;
        System.out.println("Avarage = "+ avg);
        System.out.println("----------------------------------");

        sortArray(array);

    }
    public static void sortArray (double[] array){
        for (int i = 0; i < array.length; i++) {
            double min=array[i];
            int min_i=i;
            for (int j = i+1; j < array.length; j++) {
                if(min > array[j]){
                    min = array[j];
                    min_i = j;
                }
            }
            if(i != min_i){
                double tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("Sorted array-> "+Arrays.toString(array));
    }
}
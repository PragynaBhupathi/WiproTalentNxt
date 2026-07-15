public class HOA6 {
    public static void main(String[] args) {
        int[] a = {16, 54, 68, 113, 7, 93, 23};
        for (int i = 0; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
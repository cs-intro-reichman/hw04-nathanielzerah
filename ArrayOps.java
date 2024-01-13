public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        if (n == 0) {
            System.out.println("Minimum 1");
        } else if (n == 1) {
            System.out.println("1");
        }
        
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++){
            int y = array[i];
            if (y != i){
                System.out.println(i);
                break;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(array[(n-2)]);
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean SameElements = true;
        int n1 = array1.length;
        int n2 = array2.length;
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                if (array1[i] == array2[j]) {
                    break;
                } else if (j == (n2 - 1)){
                    SameElements = false;
                }
            }
        }
        System.out.println(SameElements);
        return SameElements;
    }

    public static boolean isSorted(int [] array) {
        boolean Sorted = true;
        int n = array.length;
        int[] ord = new int[n];
        for (int i = 0; i < n; i++){
            ord[i] = array[i]; 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ord[j] > ord[j + 1]) {
                    int temp = ord[j];
                    ord[j] = ord[j + 1];
                    ord[j + 1] = temp;
                }
            }
        }

        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = ord[n - i - 1];
            }

        for (int i = 0; i < n; i++) {
            if (array[i] != rev[i] && array[i] != ord[i]) {
                Sorted = false;
            }
        }
        System.out.println(Sorted);
        return Sorted;
    }
}

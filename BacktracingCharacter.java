public class BacktracingCharacter {

    public static void subArrays(char[] arr, int index) {
        if (index == arr.length) {
            for (char ch : arr) {
                System.out.print(ch + " ");
            }
            System.out.println();
            return;
        }

        for (int j = index; j < arr.length; j++) {
            // swap
            char temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;

            subArrays(arr, index + 1);

            // backtrack (swap back)
            temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        subArrays(arr, 0);
    }
}

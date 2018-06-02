public class JumpSearch {

    public int search(int[] arr, int key) {
        int step = (int) Math.sqrt(arr.length);
        int prev = 0;

        for (; arr[min(step, arr.length) -1] < key; prev = step, step += (int) Math.sqrt(arr.length)) {
            if (prev > arr.length) {
                return -1;
            }
            System.out.println("prev:" + prev + " step: " + step);
        }

        for (; arr[prev] < key; prev++) {
            if(prev == min(step,arr.length)) {
                return -1;
            }
        }

        return arr[prev] == key ? prev : -1;

    }

    public int min(int num1, int num2) {
        return num1 > num2 ? num2 : num1;
    }


}

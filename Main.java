public class Main {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        int index = new JumpSearch().search(arr, 34);

        System.out.println(index != -1 ? "The item has been found at index: " + index : "Item not found");

    }

}

public class FirstClass {     // [1]
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!"); // [3]
    }

    public static class Notebook {
        String weight;
        int price;

        public Notebook(String weight, int price) {
            this.weight = weight;
        }
    }
}

public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static int checkSumSign(){
        int a = -1;
        int b = -5;
        int sum = a + b;
        if(sum >= 0){
            System.out.println("Сумма положительная " + sum);
        } else {
            System.out.println("Сумма отрицательная" + sum);
        }
                return sum;
        }

        public static void printColor(){
        int value = 101;
        if(value <= 0) {
            System.out.println("Красный " + value);
        } else if((value > 0) && (value <= 100)){
            System.out.println("Желтый " + value);
        } else {
            System.out.println("Зеленый " + value);
        }
        }

        public static void compareNumbers(){
        int a = 22;
        int b = 38;
        if(a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
        }


}

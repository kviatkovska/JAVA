public class task1 {
        public static void main(String [] args) {
            int a=189; //вводимо перше число
            int b=274; //вводимо друге число
            String binaryString1 = Integer.toBinaryString(a); //здіснюємо перетворення першого числа
            System.out.println("Перше число - " + a + " - в двійковій системі числення - " + binaryString1 ); // виводимо результат в консоль
            String binaryString2 = Integer.toBinaryString(b); //здійснюємо перетворення другого числа
            System.out.println("Друге число - " + b + " - в двійковій системі числення - " + binaryString2 ); // виводимо результат в консоль

            int result = a^b; //вводимо зміну для обчислення суми по модулю два в десятковій системі числення
            System.out.println(a + "^" + b); // виводимо операцію в консоль
            System.out.println("Результат суми по модулю два в десятковій системі числення - " + result); // виводимо результат в консоль
            System.out.println("Переведення результату в двійкову систему числення - " + Integer.toBinaryString(result));
            // виводимо перетворення попереднього результату в двійкову систему числення

            String secondResult  = Integer.toBinaryString(Integer.parseInt(Integer.toBinaryString(a), 2)
                    ^ Integer.parseInt(Integer.toBinaryString(b), 2)); //вводимо зміну для обчислення суми по модулю два в двійковій системі числення
            System.out.println("Результат суми по модулю два в двійковій системі числення - " + secondResult); // виводимо результат в консоль
            System.out.println("Переведення результату в десяткову систему числення - " + Integer.parseInt(secondResult, 2));
            // виводимо перетворення попереднього результату в десяткову систему числення

        }


    }

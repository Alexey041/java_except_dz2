import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task4();
    }

/*     Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.Ввод текста вместо числа не должно приводить к падению 
    приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */
    
    
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Введите дробное число");
            System.out.println(Float.parseFloat(scanner.nextLine()));
        } catch (Exception e) {
            System.err.println("Введено некорректное значени");
            task1();
        }
    }

    public static void task2(){
        try {
            int d = 0;
            int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; 
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("На 0 делить нельзя!");
        }

    }
    
    public static void task3() {
           try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[1] = 9;
                } catch (NullPointerException ex) {
                    System.out.println("Указатель не может указывать на null!");
            
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Массив выходит за пределы своего размера!");
            
                } catch (Throwable ex) {
                    System.out.println("Что-то пошло не так...");
                }
            }   

    
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    
    /* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        String res;
        System.out.println("Введите не пустую строку!");
        do {
            res = scanner.nextLine();
            if (res.equals("")) {
                System.err.println("Я запрещаю пустые строки!");
            }
        } while(res.equals(""));
        
    }





}


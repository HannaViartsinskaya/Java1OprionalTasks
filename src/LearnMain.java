import java.util.Scanner;
import java.lang.String;

public class LearnMain {
    private static int inverseInt(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;

        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        //Приветствовать любого пользователя при вводе его имени через командную строку
      /*  String name;
        Scanner in=new Scanner(System.in);
        System.out.println("Как тебя зовут? \n");
        name=in.nextLine();
        System.out.println("Привет  "+name+"!");*/

      // Отобразить в окне консоли аргументы командной строки в обратном порядке.
     /*   System.out.println("Все числа для коммандной строки переданы в  Run-> Edit configurations->Program arguments \n");
        for (int i=args.length-1;i>=0;i--)
        {
            System.out.println(" "+args[i]);
        }*/



       //Отобразить в окне консоли аргументы командной строки в обратном порядке. При вводе данных в терминале с хранением в Int
      /*Scanner in=new Scanner(System.in);
        System.out.println("Введите цифры без пробелов \n");
        int numb=in.nextInt();
        int result= inverseInt(numb);
        System.out.println("Введенные числа в обратном порядке:  "+result);*/

       //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        int quantityNumber;
        Scanner in=new Scanner(System.in);
        System.out.println("Сколько сгенерировать случайных чисел? ");
        quantityNumber=in.nextInt();
        int [] generateNumbers;
        generateNumbers=new int [quantityNumber];
        System.out.println("Сгенерированные числа: ");
        for (int i=0;i<quantityNumber;i++)
        {
        generateNumbers[i]=(int)(Math.random() *(1000-1))+1;
            System.out.print(generateNumbers[i]+" ");
        }
        System.out.println("\nСгенерированные числа с переходом на новую строку: ");
        for (int i=0;i<quantityNumber;i++)
        {
            System.out.println(generateNumbers[i]);
        }

    }
}

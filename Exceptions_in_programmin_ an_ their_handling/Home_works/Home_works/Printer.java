import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;

        if (lenA != lenB) {
            return new int[]{0}; // Вернуть нулевой массив длины 1 при разных длинах
        }

        int[] c = new int[lenA];

        for (int i = 0; i < lenA; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            c[i] = a[i] / b[i];
        }

        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.divArrays(a, b));     
      System.out.println(itresume_res);
    }
}
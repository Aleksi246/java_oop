import java.io.*;

public class Task2 {
    public static void main(String[] args) {


        try(OutputStream outputStream = new FileOutputStream("Fibonacci.csv")){
            long num1 = 0, num2 = 1, temp;
            for(int i = 0; i < 61; i++) {
                temp = num2;
                num2 = num1 + num2;

                String text = num1+ "\n";
                num1 = temp;

                byte[] bytes = text.getBytes();
                outputStream.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

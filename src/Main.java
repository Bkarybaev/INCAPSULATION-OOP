import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();



        student.setName(scanner.nextLine());
        student.setSurname(scanner.nextLine());
        student.setAge(new Scanner(System.in).nextInt());
        String[] array = new String[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextLine();
        }
        student.setCourse(array);
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
        System.out.println(Arrays.toString(student.getCourse()));

    }
}
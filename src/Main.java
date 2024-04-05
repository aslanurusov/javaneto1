import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Кол-во начисленных миль за купленный билет:");
        short price = 26100;
        byte rublesformile = 20;
        int miles = price / rublesformile;

        System.out.println("Стоимость билета = " + price);
        System.out.println("Кол-во полученных миль = " + miles);
    }
}
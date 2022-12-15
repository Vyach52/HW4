public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать!");
            System.out.println(

            );
        }

        int temperature = 4;
        if (temperature <= 5)
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        else {
            System.out.println("Можно идти без шапки");
            System.out.println(

            );
        }
        int speed = 61;
        if (speed >= 60)
            System.out.println("Если скорость " + speed + " то придется оплатить штраф");
        else {
            System.out.println("Если скорость " + speed + " можно ехать спокойно");
            System.out.println(

            );
        }

            System.out.println("Задача 4");
            int age1 = 5;
            if (age1 >= 2 && age1 <= 6)
                System.out.println("Если человеку " + age1 + " то ему нужно ходить в сад");
            else {
                System.out.println("Ему нельзя в детсад");
            }
            int age2= 6;
            if (age<5)
          System.out.println("Если возраст ребенка "+age2+" то он не может кататься на аттракционах");
        else{
            if (age2>5&&age2<14)
                System.out.println(" можно кататься в сопровождении родителей");
            else {
                System.out.println(" можно кататься без сопровождения родителей");}}
        System.out.println(

        );
        int people = 23;
        int sedentary=60;
        int general=102;
        int erect=general-sedentary;
        if (people>general)
            System.out.println("вагон полный, мест нет ");
        else if (people<sedentary)
            System.out.println(" в вагоне есть сидячие места");
        if (people>sedentary&&people<general)
            System.out.println(" в вагоне есть стоячие места");
        System.out.println(

        );
        int one=1;
        int two=2;
        int three=3;
        if (one<two && one<three);
            else if (two<three && three>one);
            else
        System.out.println(three);

    }}


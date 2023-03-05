package HW_1;

public class HW1 {
    public static void main(String[] args){

        // Задані числа
        byte b1 = 10;
        byte b2 = 23;

        short s1 = 130;
        short s2 = 250;

        int i1 = 1050;
        int i2 = 2000;

        long l1 = 1006700L;
        long l2 = 2000453L;

        float f1 = 10.2f;
        float f2 = 20.5f;

        double d1 = 112.5;
        double d2 = 200.2;

        System.out.println("Задані числа byte: "+b1+" "+b2+"\nЗадані числа short: "+s1+" "+s2+"\nЗадані числа  int: "+i1+" "+i2+"\nЗадані числа long: "+l1+" "+l2+"\nЗадані числа double: "+d1+" "+d2);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        // Додавання
        System.out.println("Додавання");
        byte b3 = (byte)(b1 + b2);
        System.out.println("Byte додавання: " + b3);

        short s3 = (short) (s1 + s2);
        System.out.println("Short додавання: " + s3);

        int i3 = i1 + i2;
        System.out.println("Int додавання: " + i3);

        long l3 = l1 + l2;
        System.out.println("Long додавання: " + l3);

        float f3 = f1 + f2;
        System.out.println("Float додавання: " + f3);

        double d3 = d1 + d2;
        System.out.println("Double додавання: " + d3);
        System.out.println("------------------------------------------------------------------------------------------");
        // Віднімання
        System.out.println("Віднімання");
        b3 = (byte)(b1 - b2);
        System.out.println("Byte віднімання: " + b3);

        s3 = (short)(s1 - s2);
        System.out.println("Short віднімання: " + s3);

        i3 = i1 - i2;
        System.out.println("Int віднімання: " + i3);

        l3 = l1 - l2;
        System.out.println("Long віднімання: " + l3);

        f3 = f1 - f2;
        System.out.println("Float віднімання: " + f3);

        d3 = d1 - d2;
        System.out.println("Double віднімання: " + d3);
        System.out.println("------------------------------------------------------------------------------------------");
        // Множення
        System.out.println("Множення");
        b3 = (byte)(b1 * b2);
        System.out.println("Byte множення: " + b3);

        s3 = (short)(s1 * s2);
        System.out.println("Short множення: " + s3);

        i3 = i1 * i2;
        System.out.println("Int множення: " + i3);

        l3 = l1 * l2;
        System.out.println("Long множення: " + l3);

        f3 = f1 * f2;
        System.out.println("Float множення: " + f3);

        d3 = d1 * d2;
        System.out.println("Double множення: " + d3);
        System.out.println("------------------------------------------------------------------------------------------");
        // Ділення
        System.out.println("Ділення");
        b3 = (byte)(b2 / b1);
        System.out.println("Byte ділення: " + b3);

        s3 = (short)(s2 / s1);
        System.out.println("Short ділення: " + s3);

        i3 = i2 / i1;
        System.out.println("Int ділення: " + i3);

        l3 = l2 / l1;
        System.out.println("Long ділення: " + l3);

        f3 = f2 / f1;
        System.out.println("Float ділення: " + f3);

        d3 = d2 / d1;
        System.out.println("Double ділення: " + d3);
    }
}




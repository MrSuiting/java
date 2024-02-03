package Java_OOP_Laptops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop("IMB MagicBook S3", 16, 1024, "Linux Kali", "фиолетовый", 16.4);
        Laptop laptop2 = new Laptop("Cooper Light M2", 32, 2048, "Linux Mint", "розовый", 18.3);
        Laptop laptop3 = new Laptop("Asused H7", 64, 640, "Oracle Linux", "голубой", 11.5);
        Laptop laptop4 = new Laptop("Halvin Pucker J99", 48, 4096, "Linux Debian", "зеленый", 12.3);
        Laptop laptop5 = new Laptop("Bubber Jitter N17", 24, 1600, "Free RTOS", "оранжевый", 16.0);
        Laptop laptop6 = new Laptop("Scrabber JS7+ Pro", 96, 8192, "Astra Linux Orel", "перламутр", 22.0);
        Laptop laptop7 = new Laptop("Mosc Ultimate Kremlin Edition", 128, 12400, "Berkut OS special KGB 3.0", "прозрачный", 22.0);
        
        Set<Laptop> unicLaptop = new HashSet<Laptop>();
       
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        unicLaptop.add(laptop7);
        
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptop.size());
        
        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "Объем ОЗУ: ");
        mapCrit.put(2, "Размер НЖМД: ");
        mapCrit.put(3, "Тип ОС: ");
        mapCrit.put(4, "Цвет: ");
        mapCrit.put(5, "Дисплей (дюйм): ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Желаемые характеристики: ");
        System.out.println("1. Объем ОЗУ: ");
        int ramUser = sc.nextInt();
        System.out.println("Объем НЖМД: ");
        int storUser = sc.nextInt();
        System.out.println("Дисплей: ");
        double digUser = sc.nextDouble();
        for(Laptop lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
    }
}
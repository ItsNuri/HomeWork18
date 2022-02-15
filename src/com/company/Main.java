package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cow cow1 = new Cow(500,(byte)7,'f',"Mary");
        Cow cow2 = new Cow(850,(byte)10,'m',"John");
        Cow cow3 = new Cow(400,(byte)4,'f',"Bella");
        Cow cow4 = new Cow(500,(byte)3,'f',"Back");
        Cow cow5 = new Cow(460,(byte)5,'m',"Din");
        Cow cow6 = new Cow(360,(byte)3,'f',"Lotta");

        Sheep sheep1 = new Sheep(100,(byte)2,'f',"Hanni");
        Sheep sheep2 = new Sheep(80,(byte)5,'f',"Dori");
        Sheep sheep3 = new Sheep(110,(byte)6,'m',"Ten");
        Sheep sheep4 = new Sheep(90,(byte)3,'m',"Hope");

        Horse horse1 = new Horse(300,(byte)7,'m',"Black","Black");
        Horse horse2 = new Horse(450,(byte)5,'m',"Floppy","Weight");
        Horse horse3 = new Horse(450,(byte)4,'f',"Lotta","brown");

        Farm farms1 = new Farm("World Street 45","Bertram",new Sheep[]{sheep1,sheep2,sheep3},new Cow[]{cow1,cow2,cow3,cow4,cow4,cow5},new Horse[]{horse1,horse2});
        Farm farms2 = new Farm("Old World street 30","Werner",new Sheep[]{sheep4},new Cow[]{cow6},new Horse[]{horse3});
        System.out.println(farms1);
        System.out.println(" ");
        System.out.println(farms2);
    }
}

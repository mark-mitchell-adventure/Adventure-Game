import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heroAtk = 25;
        int enemyAtk = 15;

        int heroHP = 100;
        int enemyHP = 75;

        String heroName= "";

        System.out.println("Are you ready? Y/N");
        if(input.nextLine().equalsIgnoreCase("y")){
            System.out.println("Enter your name");
            heroName = input.nextLine();

            do {
                System.out.println("-------" + heroName + "-------      ------- Enemy -------");
                System.out.println("HP = " + heroHP + "                        HP = " + enemyHP);
                System.out.println("Atk = 25                        Atk = 15");

                System.out.println();
                System.out.println("1. Attack \n 2. Heal \n 3. Give Up");
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("you attacked the enemy");
                    enemyHP -= heroAtk;


                } else if (choice == 2) {
                    System.out.println("you healed");

                    System.out.println(heroHP + 20);
                    heroHP += 20;

                } else {
                    System.out.println("you gave up you coward");
                    break;
                }
            }while(enemyHP > 0);
            System.out.println("you won");



        } else {
            System.out.println("fine then");
        }





    }



}

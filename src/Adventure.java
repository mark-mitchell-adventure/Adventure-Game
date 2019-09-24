import java.util.Random;
import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heroAtk = 25;
        int enemyAtk = 15;

        int heroHP = 100;
        int enemyHP = 75;

        String heroName= "";
        String heroCharacter= "";

        ///// READY, SET, GO!! ////////
        System.out.println("Are you ready? Y/N");
        if(input.nextLine().equalsIgnoreCase("y")){
            System.out.println("Enter your name");
            heroName = input.nextLine();

            System.out.println("Would you like to be a Dark Elf, Samurai, or Canadian");
            heroCharacter = input.nextLine();





            ////// TABLE DISPLAY //////
            do {
                System.out.println("-------" + heroCharacter + "-------     ------ Mid-Size Enemy ----");
                System.out.println("-------" + heroName + "-------      ------- Enemy -------");
                System.out.println("HP = " + heroHP + "                        HP = " + enemyHP);
                System.out.println("Atk = 25                        Atk = 15");

                System.out.println();
                System.out.println("1. Attack \n 2. Heal \n 3. Give Up");
                int choice = input.nextInt();


                ///// USER CHOICE ////

                //// User Attack ////
                if (choice == 1) {
                    System.out.println("you attacked the enemy");
                    enemyHP = heroAttack(enemyHP,heroAtk);

                } else if (choice == 2) {
                    System.out.println("you healed");

                    System.out.println(heroHP + 20);
                    heroHP += 20;

                }else {
                    System.out.println("you gave up you coward");
                }

                /////// ENEMY AUTO ATTACK ////
                heroHP = enemyAttack(heroHP, enemyAtk);


            }while(enemyHP >= 0 && heroHP >= 0);


            ////// END OF GAME //////
            if(enemyHP <= 0) {
                System.out.println(


                        "__  __                   ___       __             \n" +
                        "_ \\/ /_________  __      __ |     / /____________ \n" +
                        "__  /_  __ \\  / / /      __ | /| / /_  __ \\_  __ \\\n" +
                        "_  / / /_/ / /_/ /       __ |/ |/ / / /_/ /  / / /\n" +
                        "/_/  \\____/\\__,_/        ____/|__/  \\____//_/ /_/ \n" +
                        "                                                  \n");

                System.out.println("\n\n\n ::Credits::\n\n Developers: \n Mark Strange \n Mitchell Arnold \n Build 1.0 \n Special thanks to the Ceres class project for giving us the idea for the game.");
            }else if(heroHP <= 0){
                System.out.println("You died...");
            }
            else{
                System.out.println("You lost");
            }


            ///// DON'T WANT TO (PLAY) ////
        } else {
            System.out.println("Fine then.");
        }





    }



    //////////  ATTACK METHODS!! //////////////
    public static int heroAttack(int enemyHP, int heroAtk){
        return enemyHP - heroAtk;
    }



    public static int enemyAttack(int heroHP, int enemyAtk){
        Random rand = new Random();
        int condition = rand.nextInt(3);
        if(condition == 1){
            System.out.println("\n--------  You lost 15HP. --------\n");
           return heroHP - enemyAtk;
        }else if(condition == 2){
            System.out.println("\n-------- Super Hit!! -------- \n -------- You lost 30HP. --------\n");
            return heroHP - (enemyAtk + 15);
        }else{
            System.out.println("\n-------- You dodged enemy attack. --------\n");
            return heroHP;
        }
    }


    //////// CHARACTER CLASS



}

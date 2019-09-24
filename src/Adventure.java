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
        String heroCharacter= ":: yWarrior Hero :: ";

        ///// READY, SET, GO!! ////////
        System.out.println("_________________________   __  _____________  __\n" +
                "___    |__  __ \\__  ____/   _ \\/ /_  __ \\_  / / /\n" +
                "__  /| |_  /_/ /_  __/      __  /_  / / /  / / / \n" +
                "_  ___ |  _, _/_  /___      _  / / /_/ // /_/ /  \n" +
                "/_/  |_/_/ |_| /_____/      /_/  \\____/ \\____/   \n" +
                "                                                 \n" +
                "__________________________________  __   _____ \n" +
                "___  __ \\__  ____/__    |__  __ \\ \\/ /   _ __ \\\n" +
                "__  /_/ /_  __/  __  /| |_  / / /_  /    __/ _/\n" +
                "_  _, _/_  /___  _  ___ |  /_/ /_  /     _/_/  \n" +
                "/_/ |_| /_____/  /_/  |_/_____/ /_/      (_)   ");
        System.out.println("Are you? Y/N");
        if(input.nextLine().equalsIgnoreCase("y")){
            System.out.println("Enter your name");
            heroName = input.nextLine();



            ///////// CHARACTER CLASS /////////

            System.out.println( characterClass(heroHP, heroAtk) );




            ////// TABLE DISPLAY //////
            do {
                System.out.println("-------" + heroCharacter + "-------     ------ Mid-Size Enemy ----");
                System.out.println("-------" + heroName + "-------           ------- Enemy -------");
                System.out.println("HP = " + heroHP + "                             HP = " + enemyHP);
                System.out.println("Atk = 25                             Atk = 15");

                System.out.println();
                System.out.println("1. Attack \n 2. Heal \n 3. Give Up");
                int choice = input.nextInt();


                ///// USER CHOICE ////

                //// User Attack ////
                if (choice == 1) {
                    System.out.println("Solid hit!!");
                    enemyHP = heroAttack(enemyHP,heroAtk);  /// refer to Attack Methods ( at bottom )

                } else if (choice == 2) {
                    System.out.println("Healing powers of Varndaroff, activate!!");

                    System.out.println(heroHP + 20);
                    heroHP += 20;

                }else {
                    System.out.println("You gave up you coward.");
                }

                /////// ENEMY AUTO ATTACK ////
                heroHP = enemyAttack(heroHP, enemyAtk);


            }while(enemyHP > 0 && heroHP > 0);


            ////// END OF GAME //////
            if(enemyHP <= 0) {
                System.out.println(


                        "__  __                   ___       __             \n" +
                        "_ \\/ /_________  __      __ |     / /____________ \n" +
                        "__  /_  __ \\  / / /      __ | /| / /_  __ \\_  __ \\\n" +
                        "_  / / /_/ / /_/ /       __ |/ |/ / / /_/ /  / / /\n" +
                        "/_/  \\____/\\__,_/        ____/|__/  \\____//_/ /_/ \n" +
                        "                                                  \n");

                System.out.println("\n ::Credits::\n\n Developers: \n Mark Strange \n Mitchell Arnold \n Build 1.0 \n Special thanks to the Ceres class project for giving us the idea for the game.");
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
            System.out.println("____________  __________________________     ______  ________________   ______\n" +
                    "__  ___/_  / / /__  __ \\__  ____/__  __ \\    ___  / / /___  _/__  __/   ___  /\n" +
                    "_____ \\_  / / /__  /_/ /_  __/  __  /_/ /    __  /_/ / __  / __  /      __  / \n" +
                    "____/ // /_/ / _  ____/_  /___  _  _, _/     _  __  / __/ /  _  /        /_/  \n" +
                    "/____/ \\____/  /_/     /_____/  /_/ |_|      /_/ /_/  /___/  /_/        (_)   \n" +
                    "                                                                              ");
            System.out.println("\n-------- Ouuucchh! -------- \n -------- You lost 30HP. --------\n");
            return heroHP - (enemyAtk + 15);
        }else{
            System.out.println("                                          \n" +
                    " ____   _____  ____   _____  _____  ____  \n" +
                    "|    \\ |     ||    \\ |   __||   __||    \\ \n" +
                    "|  |  ||  |  ||  |  ||  |  ||   __||  |  |\n" +
                    "|____/ |_____||____/ |_____||_____||____/ \n" +
                    "                                          \n" +
                    "               __ \n" +
                    " _____  _____ |  |\n" +
                    "|     ||_   _||  |\n" +
                    "|-   -|  | |  |__|\n" +
                    "|_____|  |_|  |__|\n" +
                    "                  \n");
            System.out.println("\n-------- You dodged enemy attack. --------\n");
            return heroHP;
        }
    }


    //////// CHARACTER CLASS
public static String characterClass(int heroHP, int heroAtk) {
    Scanner input = new Scanner(System.in);
    System.out.println("Would you like to be a 1) Dark Elf, 2) Samurai, or 3) Canadian");
    int heroCharacterNum = input.nextInt();

    switch (heroCharacterNum) {
        case 1:
            System.out.println("Dark Elf");
            heroHP = 120;
            heroAtk = 25;
            System.out.println("HP " + heroHP);
            System.out.println("AP " + heroAtk);
            System.out.println("But we haven't gotten to objects, so this doesn't update!! Bummer ;(\n\n\n\n\n");
        break;
        case 2:
            System.out.println("Samurai");
            heroHP = 135;
            heroAtk = 30;
            System.out.println("HP " + heroHP);
            System.out.println("AP " + heroAtk);
            System.out.println("But we haven't gotten to objects, so this doesn't update!! Bummer ;(\n\n\n\n\n");
            break;
        case 3:
            System.out.println("Canadian");
            heroHP = 175;
            heroAtk = 45;
            System.out.println("HP " + heroHP);
            System.out.println("AP " + heroAtk);
            System.out.println("But we haven't gotten to objects, so this doesn't update!! Bummer ;(\n\n\n\n\n");
            break;
        default:
            System.out.println("Please select a character.");
    }
return "";
}


// Character select


        }


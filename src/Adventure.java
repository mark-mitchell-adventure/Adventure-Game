import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heroAtk = 25;
        int enemyAtk = 15;

        int heroHP = 100;
        int enemyHP = 75;

        String heroName= "";


        ///// READY, SET, GO!! ////////
        System.out.println("Are you ready? Y/N");
        if(input.nextLine().equalsIgnoreCase("y")){
            System.out.println("Enter your name");
            heroName = input.nextLine();





            ////// TABLE DISPLAY //////
            do {
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

                } else {
                    System.out.println("you gave up you coward");
                    break;
                }

                /////// ENEMY AUTO ATTACK ////
                System.out.println("Enemy attacks! You lost 15HP.");
//                heroHP = enemyAttack();

            }while(enemyHP > 0);


            ////// END OF GAME //////
            if(enemyHP == 0) {
                System.out.println("You won!!!!");
            }else{
                System.out.println("You lost");
            }


            ///// DON'T WANT TO (PLAY) ////
        } else {
            System.out.println("Fine then. \n\n\n ::Credits::\n\n Developers: \n Mark Strange \n Mitchell Arnold \n Build 1.0 \n Special thanks to the Ceres class project for giving us the idea for the game.");
        }





    }



    //////////  ATTACK METHODS!! //////////////
    public static int heroAttack(int enemyHP, int heroAtk){
        return enemyHP - heroAtk;
    }



//    public static int enemyAttack(int atk1, int atk2, int atk3){
//        if(atk1 == 1){
//           return heroHP - enemyAtk;
//        }else if(atk2 == 2){
//            System.out.println("Super Hit!! \n You lost 30HP");
//            return heroHP - (enemyAtk + 15);
//        }else{
//            System.out.println("You dodged enemy attack.");
//            return 0;
//        }
//    }

}

import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Stone_Game{

    public static void main(String[] args) {
        System.out.println("Welcome to the Game\nChoose your option\n1 for Stone\n2 for Paper\n3 for Scissors: ");
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();
        if(user==1 || user==2 || user==3){
            Random r = new Random();
            int computer = r.nextInt(3)+1;
            if(computer==1){
                System.out.println("Computer chooses Stone");
            }
            else if(computer==2){
                System.out.println("Computer chooses Paper");
            }
            else if(computer==3){
                System.out.println("Computer chooses Scissors");
            }
            else{
                System.out.println("code fails");
            }
            if(user==computer){
                System.out.println("It's a Tie");
            }
            else if((user==1&&computer==3)||(user==2&&computer==1)||(user==3&&computer==2)){
                System.out.println("You win!");
            }
            else{
                System.out.println("You loose!");
            }
        }
        else{
            System.out.println("Wrong option choosen");
        }
    }
}


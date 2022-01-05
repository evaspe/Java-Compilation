import java.util.Random;
public class DiceGame {
        

    public static int playGame(){
        int rollcount=0;
        Random r= new Random();
        int roll= (r.nextInt(6)+1) + (r.nextInt(6)+1);
    
   
        //immediate win
        if(roll==7|| roll==11){
            rollcount=1;
            return rollcount;
        }
        //immediate loss
        else if(roll==2|| roll==3|| roll==12) {
            return 0;

        }
        else {
            rollcount++;
            int key=roll;
           
            //keep rolling until we get 7 or key
            do {
            roll= (r.nextInt(6)+1) + (r.nextInt(6)+1);
            //System.out.println("\n inside of while roll is:" + roll);
            rollcount++;
            }while((roll != 7) && (roll != key));

           // System.out.println("\nout of while roll is:" + roll);

            if(roll==7){
                return rollcount;
               
            }
            else { 
                return 0;
                
            } 
        }
    }

    public static void main(String[] args){
        int totalrollcount=0;
        int wins=0;


        for (int i=0; i<=10000000; i++){
            int temp=playGame();
            if (temp>0){
            wins++;
            totalrollcount += temp;
        }
        }

        double pwin= ((double)wins/10000000); //probability of winning
        double aroll= (totalrollcount/(double)wins); //average rolls to win
        System.out.println("\nprobability of winning: " + pwin + " average rolls to win:" + aroll);
        
    }
}
package HW2;
//import java.util.Random;

public class PlayCard {
  public  static  int  playRandom(MatchCardGame g){
    int upperBound= g.getSize();

    while(!g.gameOver()){
        Random rand=new Random();
    
        while(!g.flip(rand.nextInt(upperBound))){ // flip 1, if first flip is invalid
        };

        while (!g.flip(rand.nextInt(upperBound)));{ // keep flipping until valid flip
        } 
      
            if(!g.wasMatch()){
                 g.flipMismatch(); //if those two flips are not a match, call mismatch
            }

            else{ //if they were a match
            }

            }
    
    return g.getFlips();
  
  }


  public  static  int  playGood(MatchCardGame g){
    //sorry :<
    
    int[] knownPositions= new int[n];
    for (int i=0; i< n;i++){
     knownPositions[i]=0;
  }
    Boolean matchInIndex=false; // use this to keep track of whehter there is a match within the new array
    int playIndex; // use this to record the index of the match card
  while(!g.gameOver()){

   
    //there would be a loop to check whether two elements of the array are the same letter, then play those togehter
    //there would be an if statment to do that, otherwise generate random first number

    Random rand=new Random();
    while(!g.flip(rand.nextInt(upperBound))){ // flip 1, if first flip is invalid
    };
    knownPositions[OddIndex]= g.previousFlipIdentity();

    
    for (int i=0; i< n;i++){
      knownPositions[i]=0;
      if (knownPositions[i]=g.previousFlipIdentity()){
        matchInIndex=true;
        playIndex=i;
      }
    }

    if(matchInIndex)
    g.flip(playIndex);

    else{
    while (!g.flip(rand.nextInt(upperBound)));{ // keep flipping until valid flip
    } }
    knownPositions[EvenIndex]= g.previousFlipIdentity();
  
        if(!g.wasMatch()){
             g.flipMismatch(); //if those two flips are not a match, call mismatch
        }

        else{ //if they were a match
          //change their letters to lowercase in the new array so we dont actually try to match them again
          knownPositions[EvenIndex]= (char) (knownPositions[EvenIndex] + 32);
          knownPositions[OddIndex]= (char) (knownPositions[OddIndex] + 32);
        }

return g.getFlips();
      
  }
}

  // Monte Carlo Method
  public  static  double  randomMC(int N){
    MatchCardGame g= new MatchCardGame(32);
    int totalFlips;
    for (int i=0; i<32; i++){
        g.shuffleCards();
       totalFlips += playRandom(g);
    }
    return (totalFlips/32);
  }

  public  static  double  goodMC(int N){
    MatchCardGame g= new MatchCardGame(32);
    int totalFlips;
    for (int i=0; i<32; i++){
        g.shuffleCards();
       totalFlips += playRandom(g);
    }
    return (totalFlips/32);
  }

  public static void main(String[] args) {
  }
}
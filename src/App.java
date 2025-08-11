import java.util.Random;
import java.util.Scanner;


public class App { 

    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    char guzik;
    
    String[] plansza = {" _ ", " _ ",  " _ ", " _ " ," _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ "," [META] "};


    String ludzik = " | ";

    plansza[0] = ludzik;

    int aktualnePole = 0;

    int licznik = 0;

    while(aktualnePole < plansza.length - 1) {
        for (String pole : plansza) {
        System.out.print(pole);
    }
    System.out.println(); 
        System.out.print("Kliknij ENTER by rzucić kostką: ");

        scanner.nextLine();
        


        Result kostka = dice(); 
        licznik++;
        System.out.print(kostka.getDiceImg());
        System.out.println(); 
        System.out.println(); 

        
        plansza[aktualnePole] =" _ ";
        aktualnePole+= kostka.getValue();
        if (aktualnePole < plansza.length - 1) {
    plansza[aktualnePole] = ludzik;
    
    

    }

        

        }




    

    System.out.printf("""
    
    Gratulacje wygraleś w %d rzutach.

     [***META***]
     |          |
     |    |     |
            """, licznik);




    
        

        
    scanner.close();
    }

    public static Result dice() {

        int value = 0;
        Random random = new Random();
        value = random.nextInt(6) + 1;
        String diceImg;
        
                

        

        String diceOne;
        String diceTwo;
        String diceThree;
        String diceFour;
        String diceFive;
        String diceSix;



        diceOne = """
                
                 ______
                |      |
                |   *  |
                |      | 
                |______|
                 """;
        

        diceTwo = """
                
                 ______
                |      |
                | * *  |
                |      | 
                |______|
                 """;
        diceThree = """
                
                 ______
                | *    |
                |   *  |
                |    * |
                |______|
                 """;
        diceFour = """
                
                 ______
                |      |
                | *  * |
                | *  * |
                |______|
                 """;
       diceFive = """
                
                 _______
                |       |
                |* * *  |
                | *  *  |
                |_______|
                 """;
        diceSix = """
                
                 ______
                |      |
                |* * * |
                |* * * |
                |______|
                 """;

                 

        switch (value) {

            case 1 ->  diceImg = diceOne;
            case 2 ->  diceImg = diceTwo;
            case 3 ->  diceImg = diceThree;
            case 4 ->  diceImg = diceFour;
            case 5 ->  diceImg = diceFive;
            case 6 ->  diceImg = diceSix;
            default -> diceImg = "INVALID DICE";  
        };
        
        return new Result(value, diceImg);


        
        
    }
    
}

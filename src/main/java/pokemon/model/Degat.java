package pokemon;
import java.util.Random;


    public class Degat {
    public int attaque;
    public int puissance;
    public int defense;
    public double coef;
    public double avantage;
    public double total;
    Random rand = new Random();


    public Degat() { 
        this.attaque = attaque;
        this.puissance = puissance;
        this.defense = defense;
        this.avantage = avantage; 
        this.coef =  coef;
        this.total = total;

        double coef = 0.85 + (1.0 - 0.85) * rand.nextDouble();
        
        """
                avantage 
                1 si nrml
                2 si force
                0.5 si faible
                """;




        total = (((11*attaque*puissance)/25*defense)+2)*avantage*coef;

    }
}


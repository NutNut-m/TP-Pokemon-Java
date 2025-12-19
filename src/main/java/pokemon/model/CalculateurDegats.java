package pokemon;
import java.util.Random;


    public static class CalculateurDegats {

    // Coef aléatoire entre 0.85 et 1 pour toutes les attaques
    private static double getRandomCoef() {
        return 0.85 + (Math.random() * (1.0 - 0.85));
    }

    public static double calculerDegatMainNuee(Monster attacker, Monster defender) {
        double avantage = getAdvantageMultiplier(attacker.getType(), defender.getType());
        double degat = 20 * ((double) attacker.getAttack() / defender.getDefense()) * getRandomCoef();
        return (degat * avantage);
    }

    public static double calculerDegatSpecial(Monster attacker, Monster defender, Attaque attaque) {
        double avantage = getMultiplicateurAvantage(attaque.getType(), defender.getType())
        double base = (11.0 * attacker.getAttack() * attaque.getPower()) / (25.0 * defender.getDefense()) + 2;
        return (base*avantage*getRandomCoef());
    }
}


package pokemon.model;

/**
 * Représente les types de monstres et d'attaques.
 * Gère les multiplicateurs de dégâts selon les rapports de force.
 */
public enum Type {
    LIGHTNING,
    WATER,
    FIRE,
    NATURE,
    EARTH,
    NORMAL;

    /**
     * Calcule le coefficient d'avantage ou de faiblesse.
     * @param opponentType Le type du monstre adverse.
     * @return 2.0 si fort, 0.5 si faible, 1.0 si neutre.
     */
    public double getEffectiveness(Type opponentType) {
        // Le type NORMAL n'a aucun rapport force/faiblesse [cite: 105]
        if (this == NORMAL || opponentType == NORMAL) {
            return 1.0;
        }

        switch (this) {
            case LIGHTNING:
                if (opponentType == WATER) return 2.0; // Fort contre l'eau [cite: 55]
                if (opponentType == EARTH) return 0.5; // Faible contre la terre [cite: 55]
                break;

            case WATER:
                if (opponentType == FIRE) return 2.0;      // Fort contre le feu [cite: 65]
                if (opponentType == LIGHTNING) return 0.5; // Faible contre la foudre [cite: 65]
                break;

            case FIRE:
                if (opponentType == NATURE) return 2.0; // Fort contre la nature [cite: 77]
                if (opponentType == WATER) return 0.5;  // Faible contre l'eau [cite: 77]
                break;

            case NATURE:
                if (opponentType == EARTH) return 2.0; // Fort contre la terre [cite: 70]
                if (opponentType == FIRE) return 0.5;  // Faible contre le feu [cite: 77]
                break;

            case EARTH:
                if (opponentType == LIGHTNING) return 2.0; // Fort contre la foudre [cite: 70]
                if (opponentType == NATURE) return 0.5;    // Faible contre la nature [cite: 70]
                break;
        }

        // Par défaut, le rapport est neutre [cite: 105]
        return 1.0;
    }
}
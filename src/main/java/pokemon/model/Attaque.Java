public class Attaque {
    public String name;
    public Type type;
    public int nbUse;
    public int power;
    public double fail;

    public Attaque(String name, Type type, int nbUse, int power, double fail){
        this.name = name;
        this.type = type;
        this.nbUse = nbUse;
        this.power = power;
        this.fail = fail;
    }

    public getType(){
        return type;
    }

    public getnbUse(){
        return nbUse;
    }

    public getPower(){
        return power;
    }

    public getFail(){
        return fail;
    }
}
public class Classroom {

    public static void main(String[] args) {
    
    Wilders christophe = new Wilders( "christophe",true);
    System.out.println(christophe.whoAmI());
    

    Wilders bryce = new Wilders ("Bryce", false);
    System.out.println(bryce.whoAmI() + ". En vrai si je suis plutôt pas mal aware mais pour l'intérêt de cet exercice j'ai accepté d'endosser ce rôle de mec pas axare. Si jamais vous me croisez dans les couloirs veuillez ne pas en prendre compte.");
    }
}

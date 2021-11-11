package UI.junit.patterns;

public class Singlton {
    private static String dataBase;
    private String passwordToDb;
    private static Singlton singlton;

    private Singlton() {
    }

    public static Singlton getInstance(){
        if(singlton == null){
            singlton = new Singlton();
        }
        return singlton;
    }
}

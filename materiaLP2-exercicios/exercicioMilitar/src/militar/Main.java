package militar;

public class Main {

    public static void main(String[] args) {

        Militar m1 = new Militar("Lucas", 35);
        Militar m2 = new Militar("Joao", 38);
        Militar m3 = new Militar("Eduardo", 25);
        
        System.out.println("m1.equals(m2)" + m1.equals(m2));
        System.out.println("m2.equals(m1)" + m2.equals(m1));
        System.out.println("m3.equals(m1)" + m3.equals(m1));
    }
    
}

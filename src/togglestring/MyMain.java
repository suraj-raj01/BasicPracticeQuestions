package togglestring;
public class MyMain {
    public static void main(String[] args) {
        String name = "SuRaJ kUmAr";
        ToggleString toggleString = new ToggleString();
        System.out.println("Original Case = " + name);
        System.out.println("Toggle Case = " + toggleString.Toggle(name));
    }
}
/*
Original Case = suRaJKumAr
Toggle Case = SUrAjkUMaR
*/
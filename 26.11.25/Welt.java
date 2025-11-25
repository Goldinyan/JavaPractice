import java.util.ArrayList;

public class Welt {
    private Hund h1;
    private Hund h2;
    
    public Welt() {
        h1 = new Hund(55, 50, 20, "Purzelchen");
        h2 = new Hund(5, 75, 100, "Schnurzel");
    }


    


    public void ueben() {
        int i = 1;
        
        while (i <= 2) {
            h1.altere(); 
            h2.altere();
            
            h1.lerne();
            
            if (i == 2) {
                h2.lerne();
            }
            
            h1.aendereGewicht(-8);
            i = i + 1;
        }
        
        h1.belle();
        h1.sageOutfit();
        h2.belle();
    } 
}

class Hund { 
    private int gewicht;
    private int erfahrung; 
    private int intelligenz;
    private String name; 
    private Halsband meinHalsband;
    private ArrayList<Floh> meineFlohe = new ArrayList<Floh>();

    public Hund(int pGewicht, int pErfahrung, int pIntelligenz, String pName) {
        gewicht = pGewicht;
        erfahrung = pErfahrung; 
        intelligenz = pIntelligenz - 20;
        name = pName;
        meinHalsband = new Halsband();
    }

    public void addFloh(Floh F){
        if (meineFlohe.size() < 3) {  
            meineFlohe.add(F);    
            F.setHalsband(meinHalsband);  
        }
    }


}

class Floh {
    private static int nextId = 1;
    private final int id;
    private Halsband halsband;

    public Floh() {
        id = nextId++;
    }

    public int getId(){
        return this.id;
    }

    public void setHalsband(Halsband pHalsband) {
        halsband = pHalsband;
    }

    public Halsband getHalsband(){
        return this.halsband;
    }
}

class Halsband {
    private String farbe;

    public Halsband() {
        double z = Math.random();

        if (z < 0.01) {
            farbe = "braun";
        } else if (z < 0.5) {
            farbe = "schwarz";
        } else {
            farbe = "grau";
        }
    }

    public String getFarbe() {
        return farbe;
    }
}


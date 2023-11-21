//Creare un hashmap prendere tutti i valori, ordinarli e stamparli

import java.util.*;

//
public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("Insalata", 0.90);
        Articolo articolo2 = new Articolo("Fanta", 1.30);
        Articolo articolo3 = new Articolo("Gelati", 4.50);

        Map<String, Articolo> mapArticolo = new HashMap<>();
        mapArticolo.put("Verdura", articolo1);
        mapArticolo.put("Bevande", articolo2);
        mapArticolo.put("Surgelati", articolo3);
        List<Articolo> listArticolo = new ArrayList<>(mapArticolo.values());
        Collections.sort(listArticolo, new Comparator<Articolo>() {
            @Override
            public int compare(Articolo o1, Articolo o2) {
                return Double.compare(o1.prezzo, o2.prezzo);
            }
        });

        System.out.println("Lista in ordine di prezzo: " + listArticolo);
    }
}









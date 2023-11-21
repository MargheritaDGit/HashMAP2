public class Articolo {
    public String name;
    public double prezzo;

    public Articolo(String name, double prezzo) {
        this.name = name;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "name='" + name + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}

package Language;

public class Mayan extends Language{

    public Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "Verb-object-subject");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Fun fact: " + this.name + " is an ergative language.");

    }

}

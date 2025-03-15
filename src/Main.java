// paquetes son colecciones de clases que están relacionadas.
import Language.*;
public class Main {
    public static void main(String[] args) {
        Language myLang = new Language("Chibchombiano", 50000000, "Sout America", "Sujeto - Verbo - Predicado");
        myLang.getInfo();

        Mayan akatek = new Mayan("Akatek", 45430);
        akatek.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Chinese mandarin", 1140000000);
        mandarin.getInfo();
        SinoTibetan bernese = new SinoTibetan("Burnese", 42900000);
        bernese.getInfo();

    }
}

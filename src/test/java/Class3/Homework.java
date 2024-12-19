package Class3;

public class Homework {
public static void main(String[] args) {
    /**
     * Formula sheet -> https://www.rapidtables.com/convert/temperature/fahrenheit-to-celsius.html
     *
     * F -> C
     * F -> K
     *
     * C -> F
     * C -> K
     *
     * K -> F
     * K -> C
     *
     */
    // F -> C
    double fTemp = 56;
    double cTemp_fTemp = (fTemp - 32) * 5/9;
    System.out.println(fTemp+"°F is equals to "+cTemp_fTemp+"°C");

    // F -> K
    double kTemp_fTemp = (fTemp + 459.67) * 5/9;
    System.out.println(fTemp+"°F is equals to "+kTemp_fTemp+"°K");

    // C-> F
    double cTemp = 20;
    double fTemp_cTemp = (cTemp * 9/5 + 32);
    System.out.println(cTemp+"C is equals to "+fTemp_cTemp+"F");

    // C -> K
    double kTemp_cTemp = (cTemp +273.15);
    System.out.println(cTemp+"C is equals to "+kTemp_cTemp+"K");

    // K -> F
    double kTemp = 0;
    double fTemp_kTemp = (kTemp * 9/5) - 459.67;
    System.out.println(kTemp+"K is equals to"+fTemp_kTemp+"F");

    // F -> K
    double kTemp_ffTemp = (fTemp + 459.67)  * 5/9;
    System.out.println(fTemp + "K is equals to"+kTemp_ffTemp+"K");
}}





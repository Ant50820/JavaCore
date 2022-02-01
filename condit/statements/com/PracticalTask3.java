package condit.statements.com;

public class PracticalTask3 {

    /*
    Enter the name of the country. Print the name of the continent.
     (Declare enum with names of continents)

     */
    public enum Continents {

        AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, ASIA;
    }

    public static void main(String[] args) {

        Continents continents = Continents.AFRICA;

        switch (continents) {
            case AFRICA:
                System.out.println("Algeria, Tunisia, Morocco");
                break;
            case EUROPE:
                System.out.println("Ukraine, France, Poland");
                break;
            case NORTH_AMERICA:
                System.out.println("Canada, USA, Mexico");
                break;
            case SOUTH_AMERICA:
                System.out.println("Brazil, Colombia, Argentina");
                break;
            case ASIA:
                System.out.println("China, India, Taiwan");
                break;
            default:

        }


    }
}

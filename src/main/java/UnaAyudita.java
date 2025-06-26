import java.util.Scanner;

public class UnaAyudita {
    public static void main(String[] args) {
        System.out.println("1 - Temporadas 1 a 4  ");
        int season = (int) (Math.random() * 5)+1; // esta seccion corre automaticamente, por lo que  1 - 5 para que haya posibilidad de que input sea default
        System.out.println(season);

        switch (season) {
            case 1: //
                System.out.println("La primavera me alteraaaa");
                break;

            case 2:
                System.out.println("En verano, mejor temprano");
                break;

            case 3: {
                System.out.println("En Otoño, agarrados de moño");
                break;
            }

            case 4:
                System.out.println("En el invierno eterno");
                break;

            default:
                System.err.println("No es una temporada");
        }


        System.out.println("\n Una ayudita?");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().toLowerCase();

        int peopleCounter = 0;

        double totalDonation = 0;

        boolean askDonation;
        if (response.equals("si") || response.equals("s")) {

            askDonation = true;

            while (askDonation) {
                System.out.println("\nCuanto quieres donar?");
                double individualDonation = scanner.nextDouble();
                System.out.println("Importe donado: " + individualDonation);
                scanner.nextLine();

                peopleCounter++;
                totalDonation += individualDonation;

                System.out.println("quieres donar de nuevo?");
                String keepDonating = scanner.nextLine();
                if (!keepDonating.equals("si") && !keepDonating.equals("s")) {
                    askDonation = false;
                }

            }
        } else {
            System.out.println("me deprimo y me voy a mi casa...");
        }

        System.out.println("Han donado: " + peopleCounter + " personas");
        System.out.println("Total donado: " + totalDonation);


        //3
        scanner.hasNextLine();

        System.out.println("3 Archivo 'sonoro' \n");
        System.out.println("1 -4");
        boolean continueProgram = true;

        while (continueProgram) {
            int caseOption = scanner.nextInt();
            scanner.hasNextLine();




        switch (caseOption) {
            case 1:
                System.out.println("1 - El cohete hace zuiimmmm");
                break;

            case 2:
                System.out.println("2 - El coche hace vroooommmmm");
                break;

            case 3:
                System.out.println("3 - El perro hace wooof!");
                break;

            case 4:
                System.out.println("4 - Swoosh salgo por la izquierda");
                continueProgram = false;
                break;

            default:
                System.out.println("Sin sonido, no es una opción válida");

        }
    }
    //end of main
    }

}

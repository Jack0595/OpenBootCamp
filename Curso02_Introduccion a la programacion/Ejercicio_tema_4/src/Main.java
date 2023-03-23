public class Main {
    public static void main(String[] args) {
        int numeroIF = 18;

        if(numeroIF > 0){
            System.out.println("El numero " + numeroIF + " es Positivo");
        }else if (numeroIF == 0) {
            System.out.println("El numero " + numeroIF + " es Cero");
        } else if (numeroIF < 0) {
            System.out.println("El numero " + numeroIF + " es negativo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println("El bucle While incremento la variable a: " + numeroWhile);
        }

        int numeroDoWhile =3;

        do{
            numeroDoWhile ++;
            System.out.println("El bucle DoWhile incremento la variable a: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El bucle For tiene la valor: " + numeroFor);
        }

        String estacion = "Verano";

        switch (estacion){
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            default: 
                System.out.println("El valor agregado no es una esatción del año");
        }
    }
}
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args){
        Scanner plus = new Scanner(System.in);

        float precioCamisetas = 25;
        float precioPantalones = 30;


        System.out.println("ingrese cantidad de camisetas");
        Float cantidadCamisetas = plus.nextFloat();
        float totalCamiseta = precioCamisetas*cantidadCamisetas;
        double descuentoCamiseta = totalCamiseta*0.15;
        double totalDescuentoCamiseta = totalCamiseta-descuentoCamiseta;

        System.out.println("ingrese cantidad de pantalones");
        Float cantidadPantalones = plus.nextFloat();
        float totalPantalon = precioPantalones*cantidadPantalones;
        double descuentoPantalon = totalPantalon*0.15;
        double totalDescuentoPantalon = totalPantalon-descuentoPantalon;

        double totalAPagar = totalDescuentoCamiseta+totalDescuentoPantalon;

        System.out.println("el total a pagar es: "+ totalAPagar);

        if (cantidadCamisetas >= 2){
            double descuentoAdicional = totalAPagar*0.05;
            double totalDescuentoAdicional = totalAPagar-descuentoAdicional;
            System.out.println("por comprar 2 camisetas tu total a pagar es: "+ totalDescuentoAdicional);
        }
    plus.close();
    }   
}

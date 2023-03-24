package ejercicios_sobre_clases;

public class AcabadoApp {
	 
    public static void main(String[] args) {
         
        Acabado cuenta_1 = new Acabado("DiscoDurodeRoer");
        Acabado cuenta_2 = new Acabado("Fernando", 300);
         
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
         
        System.out.println(cuenta_1); 
        System.out.println(cuenta_2); 
         
    }
     
}
package dam1_delafuentecedillo_jonathan_ej0501b10punto3d;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        Punto A = new Punto (0.41f,-3.77f);
     
        System.out.println("A " + A);

        System.out.println(" \nSalida directa toString() :");
        System.out.println(A.toString());

        System.out.println("Hay un total de " + Punto.getContador() + " " + Punto.getPunto() + "s");
        
        System.out.println(Punto.CalcularArea(3.24,4.81, 0.41, -3.77, 6.412, -1.423));
        
    }
    
}
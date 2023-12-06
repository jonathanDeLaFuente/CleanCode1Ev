package dam1_delafuentecedillo_jonathan_ej0501b10punto3d;

public class Punto {
        
    public float coordenadaX;
    public float coordenadaY;
    private static int contador = 0;
    private static String punto = "Punto";
    final private int id;

    public static int getContador() {
        return contador;
    }   
    
    public static String getPunto() {
        return punto;
    }
    
    public double CalcularDistancia (Punto Param){
        return Math.sqrt(Math.pow(Param.coordenadaX-coordenadaX, 2)+Math.pow(Param.coordenadaY-coordenadaY, 2));
    }
    
    public static String CalcularArea (double ParamX1, double ParamY1,double ParamX2, double ParamY2,double ParamX3, double ParamY3){   
        double semiperimetro = ((CalcularDistancia(ParamX1, ParamY1, ParamX2, ParamY2)
                + (CalcularDistancia(ParamX1, ParamY1, ParamX3, ParamY3))
                + (CalcularDistancia(ParamX2, ParamY2, ParamX3, ParamY3)))/2);
        
        double areaPrimeraForma = Math.sqrt(semiperimetro * (semiperimetro-CalcularDistancia(ParamX1, ParamY1, ParamX2, ParamY2))
                * (semiperimetro-CalcularDistancia(ParamX1, ParamY1, ParamX3, ParamY3))
                * (semiperimetro-CalcularDistancia(ParamX2, ParamY2, ParamX3, ParamY3))); 
        
        return (DevolverTresDistancias(ParamX1, ParamY1, ParamX2, ParamY2, ParamX3, ParamY3) +
                  "El area del triangulo formado por los puntos es : \n" +
                  "Área = " + areaPrimeraForma );  
    }
    
    private static double CalcularDistancia (double ParamX1, double ParamY1, double ParamX2, double ParamY2){
        return Math.sqrt(Math.pow(ParamX1-ParamX2, 2)+Math.pow(ParamY1-ParamY2, 2));
    }
    
    private static String DevolverTresDistancias(double ParamX1, double ParamY1,double ParamX2, double ParamY2,double ParamX3, double ParamY3){
         return "Punto A : (" + ParamX1 + " , " + ParamY1 + ")\n" +
                  "Punto B : (" + ParamX2 + " , " + ParamY2 + ")\n" +
                  "Punto C : (" + ParamX3 + " , " + ParamY3 + ")\n\n" +
                 "La distancia entre A Y B : " + CalcularDistancia(ParamX1, ParamY1, ParamX2, ParamY2) + "\n" +
                  "La distancia entre A Y C : " + CalcularDistancia(ParamX1, ParamY1, ParamX3, ParamY3) + "\n" +  
                  "La distancia entre B Y C : " + CalcularDistancia(ParamX2, ParamY2, ParamX3, ParamY3) + "\n\n";
    }
    
    public Punto( float X , float Y){
        this.coordenadaX = X;
        this.coordenadaY = Y;
        contador++;
        id = contador;
    }
    
    public Punto(){
        coordenadaX = 0f;
        coordenadaY = 0f;
        contador++;
        id = contador;
    }

    public static void setPunto(String aPunto) {
        punto = aPunto;
    }
    
    public String toString(){
        String cadena = punto + " " + id + "(" + coordenadaX + " , " + coordenadaY + ")";
        return cadena;
    }
    
    public void setX (float X){ this.coordenadaX = X; }
    public float getX (){ return coordenadaX; }
    public void setY (float Y){ this.coordenadaY = Y; }
    public float getY (){ return coordenadaY; }
    
    public int getId() {
        return id;
    }
    

           
}
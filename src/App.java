public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Este programa resuelve ecuaciones de segundo grado.");
            System.out.println("Por favor, introduzca los valores.");

            double a = Double.parseDouble(System.console().readLine("a = "));
            double b = Double.parseDouble(System.console().readLine("b = "));
            double c = Double.parseDouble(System.console().readLine("c = "));

            double raiz = b*b-(4*a*c);
            
            // Código corregido
            double sol1 = (-b + Math.sqrt(raiz)) / (2*a);
            double sol2 = (-b - Math.sqrt(raiz)) / (2*a);

            if ((a == 0) && (b == 0) && (c == 0)){
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else if ((a == 0) && (b == 0) && (c != 0)){
                System.out.println("La ecuación no tiene solución.");
            } else if ((raiz < 0)){
                System.out.println("La ecuación no tiene soluciones reales.");
            } else {
                System.out.printf("Las soluciones de la ecuación de segundo grado son las siguientes: %.2f %.2f", sol1, sol2);
            }
        } catch (Exception e) {
            
        }
        
    }
}

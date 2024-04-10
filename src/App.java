import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Crear la instancia de la clase
        MetodosOrdenamiento metodo = new MetodosOrdenamiento();
        Scanner scanner = new Scanner (System.in);
        boolean pasosm;
        int[]numeros={30,7,12,5};
        System.out.println("Desea mostrar los pasos");
        System.out.println("1.Si");
        System.out.println("2.No");
        int pasos=scanner.nextInt();
        if(pasos==1){
            pasosm=true;
        }else{
            pasosm=false;
        }
        //Llamamos al metodo que tiene el ordenamiento burbuja
        int[]arregloOrdenadoBurbuja=metodo.sortByBubble(numeros, pasosm);
        //Imprimir el arreglo ordenado
        metodo.printArray(arregloOrdenadoBurbuja);
    }
}

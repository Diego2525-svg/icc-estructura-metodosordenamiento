public class MetodosOrdenamiento {
    //1.Devuelve un arreglo de enteros por burbuja

    public int[] sortByBubble(int[]arreglo, boolean condicion){
        if (condicion==true){
            //Bucle externo que recorre todo el arreglo
            for (int i = 0; i <arreglo.length; i++){
                System.out.println("\n Pasado numero"+i);
                //Bucle interno que compara el elemento acual 
                for (int j = i+1; j <arreglo.length; j++){
                    System.out.println("i="+ arreglo[i]+"j="+arreglo[j]);
                    //Comparar posiciones 
                    if (arreglo[i] > arreglo[j]){
                        //Intercambio de valores
                        System.out.println("-Si es mayor asi que cambio");
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                        System.out.println("");
                    }
                }
            }
        
        }
        else{
            //Bucle externo que recorre todo el arreglo
        for (int i = 0; i <arreglo.length; i++){
            //Bucle interno que compara el elemento acual 
            for (int j = i+1; j <arreglo.length; j++){
                //Comparar posiciones 
                if (arreglo[i] > arreglo[j]){
                    //Intercambio de valores
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    System.out.println("");
                }
            }
        }
        }

        return arreglo;
    }

    //4.Metodo que imprime un arreglo
    public void printArray(int[] arreglo){
        for (int i = 0; i <arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
}

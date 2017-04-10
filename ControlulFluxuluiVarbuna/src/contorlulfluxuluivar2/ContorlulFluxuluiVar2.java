package contorlulfluxuluivar2;

import java.util.Arrays;

public class ContorlulFluxuluiVar2 {

    public static void main(String[] args) {

        int[] array = {12, 23, -22,  43, 545, -4, -55, 43, -44, -22144, 12, 0,0, -999, -87, 45, 99, -120};
        int[] mark = new int[array.length];
        Arrays.sort(array);

        System.out.println("Acessta este sirul initial sortat=" + Arrays.toString(array));


        int a = 0, b = 0;


        int k = 0, y = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] < 0) {
                a++;
            } else {
                b++;
            }
       
        }

        int[] pozitiveArray = new int[b];
        int[] negativeArray = new int[a];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[k] = array[i];
                k++;
            } else {
                pozitiveArray[y] = array[i];
                y++;
            }
        }

        System.out.println("Sirul cu numere pozitive este: " + Arrays.toString(pozitiveArray));
        System.out.println("Sirul cu numere negative este: " + Arrays.toString(negativeArray));

        int duplicat = 0;

        for (int cont = 0; cont < array.length; cont++) {
                for (int w = cont + 1; w < array.length; w++) {
                    if (array[w] == array[cont]) {
                        if(mark [w] !=1){
                            duplicat++;
                            mark[w] = 1;
                       
                        }
                }
            }
        }
        
        System.out.println("Numarul de duplicate este: " + duplicat);
        
        
    }
}

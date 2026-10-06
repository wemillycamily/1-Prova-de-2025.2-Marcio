public class questao1{
public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;
        
        // adiciona elementos de A sem repetir
        for (int i = 0; i < tamA; i+=1) {
            if (!contem(u, tamU, a[i])) {
                u[tamU] = a[i];
                tamU+=1;
            }
        }
        
        // adiciona elementos de B sem repetir
        for (int i = 0; i < tamB; i+=1) {
            if (!contem(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU+=1;
            }
        }
        
        return tamU;
    }
    }
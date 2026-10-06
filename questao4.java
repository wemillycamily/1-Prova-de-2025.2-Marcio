public class questao4{ 
public static void rotacionar(int[] v, int tam, int k) {
        if (tam <= 1) return;
        
        k = k % tam;
        if (k == 0) return;

        if (k > 0) {
            // rotação para a esquerda
            for (int passo = 0; passo < k; passo+=1) {
                int primeiro = v[0];
                for (int i = 0; i < tam - 1; i+=1) {
                    v[i] = v[i + 1];
                }
                v[tam - 1] = primeiro;
            }
        } else {
            // rotação para a direita (k negativo)
            k = -k;
            for (int passo = 0; passo < k; passo+=1) {
                int ultimo = v[tam - 1];
                for (int i = tam - 1; i > 0; i-=1) {
                    v[i] = v[i - 1];
                }
                v[0] = ultimo;
            }
        }
    }
}
}
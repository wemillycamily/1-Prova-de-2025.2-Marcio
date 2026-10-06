public class questao3{
public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;
        
        for (int i = 0; i < tamV; i+=1) {
            if (!contem(vsr, tamVSR, v[i])) {
                vsr[tamVSR] = v[i];
                tamVSR+=1;
            }
        }
        
        return tamVSR;
    }
    }
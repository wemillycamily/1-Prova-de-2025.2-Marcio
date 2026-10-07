public class Prova2025_2 {
    public static boolean contem(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }
}
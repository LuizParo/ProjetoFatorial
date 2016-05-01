public class Fatorial {
    // Versão iterativa do cálculo fatorial.
    public int calcularFatorial(int n) {
        int resultado = 1;

        for(int i = 2; i <= n; i++) {
            esultado *= i;
        }
        return resultado;
    }
}
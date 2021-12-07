package exerciciorepita;
import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int numero, media, soma=0;
        int totalValor = 0;
        int nPar = 0; 
        int nImpar = 0;
        int acimaDeCem = 0;
        //TESTE DE REPETIÇÃO NO FINAL, FAÇA ... ENQUANTO (CONDIÇÃO FOR ATENDIDA)
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero: <br><em>(valor 0 interrompe)</em></br> </html>"));
            soma += numero;

            if (numero % 2 == 0) {
                nPar++;
            } else {
                nImpar++;
            }
            if (numero > 100) {
                acimaDeCem++;
            }
            if (numero != 0) {
                totalValor++;
            }

        } while (numero != 0);
        media = soma / totalValor;
        //SAÍDA DOS VALORES
        JOptionPane.showMessageDialog(null, "<html>______________________ "
                + "<br> Resultado <br> _______________________" 
                + "<br> Total de valores: " + totalValor + "<br>"
                + "Total de números pares: " + nPar + "<br>"
                + "Total de números impares: " + nImpar + "<br>"
                + "Números acima de 100: " + acimaDeCem + "<br>"
                + "Média dos valores: " + media + "<br>"
                + "_______________________</html>");
    }
    
}

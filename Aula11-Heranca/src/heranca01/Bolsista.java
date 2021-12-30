package heranca01;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de " + this.nome);
    }
    @Override //Esta sobreposto, nao e a mesma coisa do PagarMensalidade do Aluno
    public void PagarMensalidade(){
        System.out.println(this.nome + " e bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}

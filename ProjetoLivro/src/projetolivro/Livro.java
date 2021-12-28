package projetolivro;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int PagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodos
    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ", autor = "
                + autor + "\n, totPaginas = " + totPaginas
                + ", PagAtual = " + PagAtual + "\n, aberto = "
                + aberto + "\n, leitor = " + leitor.getNome() + '}';
    }
    //Metodo Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.PagAtual = 0;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        
        return PagAtual;
    }

    public void setPagAtual(int PagAtual) {
        this.PagAtual = PagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Implementacao de todos os metodos abstratos da interface Publicacao
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.totPaginas){
            this.PagAtual = 0;
        } else{
            this.PagAtual = pagina;
        }
    }

    @Override
    public void avancarPag() {
        this.PagAtual++;
    }

    @Override
    public void voltarPag() {
        this.PagAtual--;
    }
}

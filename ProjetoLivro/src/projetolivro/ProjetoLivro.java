package projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa ("Vitor", 26, "M");
        
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 500, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 400, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        l[1].abrir();
        l[1].folhear(200);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }
    
}

package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 5 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Vitor", 25, "M", "vitorosouza");
        g[1] = new Gafanhoto("Jeanne", 50, "F", "jematni");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]); //Vitor assiste Aula 1 de POO
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0],v[1]);//Vitor assiste Aula 12 de PHP
        vis[1].avaliar(35.0f);
        System.out.println(vis[1].toString());
        
        
        
        
        
    }
    
}

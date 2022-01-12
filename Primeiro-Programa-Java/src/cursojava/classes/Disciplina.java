package cursojava.classes;

import java.util.Objects;


//Essa classe Disciplina serviara para todos os objetos e instancias de NOTAS e MATERIAS
public class Disciplina {
    private String disciplina;
    private double nota;
   
    //Getters e Setters
    public String getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    //equals() e hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.disciplina);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota))
        {
            return false;
        }
        if (!Objects.equals(this.disciplina, other.disciplina))
        {
            return false;
        }
        return true;
    }
    
    //toString()
    @Override
    public String toString() {
        return "Disciplina{" + "disciplina=" + disciplina + ", nota=" + nota + '}';
    }
    
    
}

package cursojava.classes;

import java.util.Objects;

public class Disciplina {
    private String disciplina1;
    private double nota1;
    private String disciplina2;
    private double nota2;
    private String disciplina3;
    private double nota3;
    private String disciplina4;
    private double nota4;
    
    //METODOS GETTERS E SETTERS
    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    
    //equals() E hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.disciplina1);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.nota1) ^ (Double.doubleToLongBits(this.nota1) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.disciplina2);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.nota2) ^ (Double.doubleToLongBits(this.nota2) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.disciplina3);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.nota3) ^ (Double.doubleToLongBits(this.nota3) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.disciplina4);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.nota4) ^ (Double.doubleToLongBits(this.nota4) >>> 32));
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
        if (Double.doubleToLongBits(this.nota1) != Double.doubleToLongBits(other.nota1))
        {
            return false;
        }
        if (Double.doubleToLongBits(this.nota2) != Double.doubleToLongBits(other.nota2))
        {
            return false;
        }
        if (Double.doubleToLongBits(this.nota3) != Double.doubleToLongBits(other.nota3))
        {
            return false;
        }
        if (Double.doubleToLongBits(this.nota4) != Double.doubleToLongBits(other.nota4))
        {
            return false;
        }
        if (!Objects.equals(this.disciplina1, other.disciplina1))
        {
            return false;
        }
        if (!Objects.equals(this.disciplina2, other.disciplina2))
        {
            return false;
        }
        if (!Objects.equals(this.disciplina3, other.disciplina3))
        {
            return false;
        }
        if (!Objects.equals(this.disciplina4, other.disciplina4))
        {
            return false;
        }
        return true;
    }
    
    //toString() do objeto Disciplina para poder mostrar as disciplinas e as notas 
    @Override
    public String toString() {
        return "Disciplina{" + "disciplina1=" + disciplina1 + ", nota1=" + nota1 + ", disciplina2=" + disciplina2 + ", nota2=" + nota2 
                + ", disciplina3=" + disciplina3 + ", nota3=" + nota3 + ", disciplina4=" + disciplina4 + ", nota4=" + nota4 + '}';
    }
}

package heranca01;

public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Estou exercendo o curso de " + this.getCurso());
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}

package semana5;

public class CrachaEstudante extends Cracha {

    private String curso;

    public void setCurso(String curso){
        this.curso = curso;
    }

    @Override
    public void imprimir(){
        Impressao.imprimirLinha("ESTUDANTE");
        Impressao.imprimirLinha("Nome: " + nome);
        Impressao.imprimirLinha("Curso: " + curso);
    }

    
}

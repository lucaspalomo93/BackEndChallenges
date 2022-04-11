package domain;

public class Estudiante extends Persona{
    private String cursoMatriculado;

    public Estudiante(String cursoMatriculado, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursoMatriculado=" + cursoMatriculado + '}';
    }

    @Override
    public void cambiarEstadoCivil(String estado) {
        this.setEstadoCivil(estado);
    }

    @Override
    public void imprimirInformacion() {
        this.toString();
    }
    
    public void matriculacionNuevoCurso(String curso){
        this.setCursoMatriculado(curso);
    }
    
    
    
}

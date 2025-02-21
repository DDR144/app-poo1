package model;

public class Docente extends Persona{
    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String horaAsistencia, Boolean valorAsistencia) {
        System.out.println("aplicar logica " +
                "para a asistencia del " +
                "docente");
        return true;
    }
}

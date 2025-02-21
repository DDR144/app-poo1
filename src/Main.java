import model.Alumno;
import model.Curso;
import model.Especialidad;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Curso objCurso = new Curso();
        objCurso.setIdcurso(1);
        System.out.println(objCurso.getIdcurso());

        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());

        Especialidad objEspe = new Especialidad(4,"Didier",true, LocalDate.now());
        System.out.println(objEspe.getFechaCrea());
        System.out.println();
        objEspe.Imprmir();

        Alumno objAlumno = new Alumno();
        objAlumno.setId(1);
        objAlumno.setDni("954816");
        objAlumno.setNombre("Didier");
        objAlumno.setApellido("Huerta");
        objAlumno.setEdad(26);
        System.out.println(objAlumno.getId());


    }
}
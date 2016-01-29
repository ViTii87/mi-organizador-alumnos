
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // Atributos para guardar el nombre y apellidos del alumno
    private String nombre;
    private String apellidos;
    
    // Atributo para guardar el identificador de grupo de cada alumno.
    private String idGrupo;

    /**
     * Contructor de alumnos
     */
    public Alumno(String nombreCompleto, String apellidos)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        idGrupo = null;
    }

    
    /**
     * Metodo para obtener el nombre del alumno.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo para obtener los apellidos del alumno.
     */
    public String gerApellidos(){
        return apellidos;
    }
    
    /**
     * Metodo para fijar el id del grupo del alumno.
     */
    public void setGrupo(String idgrupo){
        this.idGrupo = idGrupo;
    }
    
    /**
     * Metodo para devolver la id del grupo del alumno
     */
    public String getIdGrupo(){
        return idGrupo;
    }
}

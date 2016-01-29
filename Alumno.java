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
    private String apellido1;
    private String apellido2;
    
    // Atributo para guardar el identificador de grupo de cada alumno.
    private String idGrupo;

    /**
     * Contructor de alumnos
     */
    public Alumno(String apellido1, String apellido2, String nombre)
    {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        idGrupo = null;
    }
    
    /**
     * Metodo para devolver el nombre completo
     */
    public String getNombreCompleto()
    {
        return apellido1 + "  " + apellido2 + " , " + nombre + "              Grupo: " + getIdGrupo();
    }
    
    /**
     * Metodo para fijar el id del grupo del alumno.
     */
    public void setGrupo(int idGrupo){
        if(idGrupo < 10)
        {
            this.idGrupo = "0"+"0"+"0"+idGrupo;
        }
        else
        {
            if(idGrupo < 100)
            {
                this.idGrupo = "0"+"0"+idGrupo;
            }
            else
            {
                if(idGrupo < 1000)
                {
                    this.idGrupo = "0"+idGrupo;
                }
            }
        }
    }
    
    /**
     * Metodo para devolver la id del grupo del alumno
     */
    public String getIdGrupo(){
        return idGrupo;
    }
}

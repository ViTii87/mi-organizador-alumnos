import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Random;
/**
 * Write a description of class Agrupa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agrupa
{
    // Atributo que crea una lista de alumnos
    private ArrayList<Alumno> listaAlumnos;

    // Atributo iterador
    private Iterator<Alumno> it;

    /**
     * Constructor que crea una lista de alumnos.
     */
    public Agrupa()
    {
        listaAlumnos = new ArrayList<Alumno>();

        listaAlumnos.add(new Alumno("Adeva", "Tranche", "Adrián"));
        listaAlumnos.add(new Alumno("Aller", "González", "Francisco Javier"));
        listaAlumnos.add(new Alumno("Álvarez", "Prieto", "Noelia"));
        listaAlumnos.add(new Alumno("Barrionuevo", "Pérez", "Manuel"));
        listaAlumnos.add(new Alumno("Bóveda", "del Río", "José Antonio"));
        //listaAlumnos.add(new Alumno("de la Viuda", "Crespo", "Ignacio"));
    }

    /**
     * Metodo para emparejar alumnos
     */
    public void empareja()
    {
        int pareja = 0;
        int guardaAlea = 0;
        boolean impar = true;
        Collections.shuffle(listaAlumnos);
        it = listaAlumnos.iterator();
        Random aleatorio = new Random();
        guardaAlea = aleatorio.nextInt(1000);
        if(listaAlumnos.size() % 2 == 0){
            impar = false;
        }

        while(it.hasNext()){
            if(impar == false)
            {
                if(pareja == 2)
                {
                    pareja = 0;
                    guardaAlea = aleatorio.nextInt(1000);
                }
                it.next().setGrupo(guardaAlea);
                pareja ++;
            }
            else
            {
                it.next().setGrupo(guardaAlea);
                pareja ++;
                if (pareja >2)
                {
                    impar = false;
                    pareja = 0;
                    guardaAlea = aleatorio.nextInt(1000);
                }
            }
        }
    }

    /**
     * Metodo para mostrar alumnos
     */
    public void mostrar()
    {
        it = listaAlumnos.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getNombreCompleto());
        }
    }

    /**
     * Metodo para mostrar solo los alumnos pertenecientes a un grupo
     */
    public void mostrarGrupo(String idGrupo){
        int index = 0;
        boolean noGrupo = false;
        System.out.println("Listado de los alumnos del Grupo: " + idGrupo);
        while(index < listaAlumnos.size())
        {
            if(listaAlumnos.get(index).getIdGrupo().equals(idGrupo))
            {
                 System.out.println(listaAlumnos.get(index).getNombreCompleto());
                 index ++;
                 noGrupo = true;
            }
            else
            {
                index ++;
            }
        }
        if(!noGrupo)
            {
                 System.out.println("ERROR. No hay alumnos en ese grupo o no existe");
            }
    }
}

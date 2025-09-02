package Controllers;

import java.util.TreeMap;

public class DirectorioTelefonico {

    private TreeMap<Long, Contacto> directorio=new TreeMap<>();

    public DirectorioTelefonico() {
    }

    // PRINCIPAL FUNCTIONS
    public void agregarContacto(Contacto contacto) {
        directorio.put(( long ) contacto.getTelefono(), contacto);
    }

    public Contacto buscarContacto(Long telefono) {
        if(  ! directorio.containsKey(telefono) ) {
            return null;
        }
        Contacto contacto=directorio.get(telefono);
        return contacto;
    }

    // GETTERS AND SETTERS
    public TreeMap<Long, Contacto> getDirectorio() {
        return directorio;
    }

    public void setDirectorio(TreeMap<Long, Contacto> directorio) {
        this.directorio=directorio;
    }

}

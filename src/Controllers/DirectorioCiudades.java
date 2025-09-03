package Controllers;

import java.util.ArrayList;

public class DirectorioCiudades {

    private static ArrayList<Ciudad> ciudades;

    public DirectorioCiudades() {
        ciudades=new ArrayList<Ciudad>();
        ciudades.add(new Ciudad("San Luis"));
        ciudades.add(new Ciudad("Córdoba"));
        ciudades.add(new Ciudad("Buenos Aires"));
    }

    public static void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
}
/*
             /\_/\           ___
            = o_o =_______    \ \
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
     */
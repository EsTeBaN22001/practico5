package Controllers;

public class Contacto {

    private int DNI;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private Long telefono;

    public Contacto(int DNI, String nombre, String apellido, String Ciudad, String direccion, Long telefono) {
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellido=apellido;
        this.ciudad=Ciudad;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI=DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad=Ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono=telefono;
    }
}
/*
             /\_/\           ___
            = o_o =_______    \ \
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
     */
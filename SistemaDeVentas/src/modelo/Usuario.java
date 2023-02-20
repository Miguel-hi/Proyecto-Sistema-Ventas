package modelo;

/**
 *
 * @author migue
 */
public class Usuario {

    private int id_Usuario;
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Password;
    private String Telefono;
    private int estado;

    /* Constructor */
    public Usuario() {

        this.id_Usuario = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Usuario = "";
        this.Password = "";
        this.Telefono = "";
        this.estado = 0;
    }
    
    // Metodos set y get //

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    

}

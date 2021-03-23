import java.util.ArrayList;

/**
 *
 * @author Marlene
 */
public class ProyectoFiscalia {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  }

  public class Procedimiento {
    private String nombre;
    private ArrayList<String> participantes;
    private ArrayList<String> roles;
    private String resultado;

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public ArrayList<String> getParticipantes() {
      return participantes;
    }

    public void setParticipantes(ArrayList<String> participantes) {
      this.participantes = participantes;
    }

    public ArrayList<String> getRoles() {
      return roles;
    }

    public void setRoles(ArrayList<String> roles) {
      this.roles = roles;
    }

    public String getResultado() {
      return resultado;
    }

    public void setResultado(String resultado) {
      this.resultado = resultado;
    }

  }

  public class Causa {
    private String codigo;
    private Fiscal encargado;
    private ArrayList<Procedimiento> peritajes;
    private String estado;
    private String tipoCaso;
    private String region;

    public String getCodigo() {
      return codigo;
    }

    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }

    public Fiscal getEncargado() {
      return encargado;
    }

    public void setEncargado(Fiscal encargado) {
      this.encargado = encargado;
    }

    public ArrayList<Procedimiento> getPeritajes() {
      return peritajes;
    }

    public void setPeritajes(ArrayList<Procedimiento> peritajes) {
      this.peritajes = peritajes;
    }

    public String getEstado() {
      return estado;
    }

    public void setEstado(String estado) {
      this.estado = estado;
    }

    public String getTipoCaso() {
      return tipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
      this.tipoCaso = tipoCaso;
    }

    public String getRegion() {
      return region;
    }

    public void setRegion(String region) {
      this.region = region;
    }

  }

  public class Fiscal {
    private String nombre;
    private String rut;
    private ArrayList<Causa> causasActuales;
    private String especialidad;
    private String region;

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getRut() {
      return rut;
    }

    public void setRut(String rut) {
      this.rut = rut;
    }

    public ArrayList<Causa> getCausasActuales() {
      return causasActuales;
    }

    public void setCausasActuales(ArrayList<Causa> causasActuales) {
      this.causasActuales = causasActuales;
    }

    public String getEspecialidad() {
      return especialidad;
    }

    public void setEspecialidad(String especialidad) {
      this.especialidad = especialidad;
    }

    public String getRegion() {
      return region;
    }

    public void setRegion(String region) {
      this.region = region;
    }

  }

}
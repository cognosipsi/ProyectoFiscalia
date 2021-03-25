import java.util.ArrayList;


public class ProyectoFiscalia {

  public static void main(String[] args) {
     Procedimiento prueba;
     ArrayList<Procedimiento> peritaje = new ArrayList<Procedimiento>();
     ArrayList<String> part = new ArrayList<String>();
     ArrayList<String> rol = new ArrayList<String>();
     ArrayList<Causa> actual = new ArrayList<Causa>();
     Causa caso;
     Fiscal nuevo;
     part.add("Juan Perez");
     rol.add("Policia");
     part.add("Roberto Gonzalez");
     rol.add("Victima");
     prueba.setNombreProc("Toma de denuncia");
     prueba.setParticipantes(part);
     prueba.setRoles(rol);
     prueba.setResultado("Se hace una denuncia por estafa");
     peritaje.add(prueba);
     caso.setCodigo("123456");
     caso.setEstado("Abierto");
     caso.setTipoCaso("Delitos economicos");
     caso.setRegion("VI");
     caso.setPeritajes(peritaje);
     actual.add(caso);
     nuevo.setNombre("Maria Castillo");
     nuevo.setRut("12345768-9");
     nuevo.setEspecialidad("Delitos economicos");
     nuevo.setRegion("VI");
     nuevo.setCausasActuales(actual);
     System.out.println(nuevo);
  }

  public class Procedimiento {
    private String nombreProc;
    private ArrayList<String> participantes=new ArrayList<String>();
    private ArrayList<String> roles=new ArrayList<String>();
    private String resultado;

    public String getNombreProc() {
      return nombreProc;
    }

    public void setNombreProc(String nombreProc) {
      this.nombreProc = nombreProc;
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
    private ArrayList<Procedimiento> peritajes=new ArrayList<Procedimiento>();
    private String estado;
    private String tipoCaso;
    private String region;
    private boolean asignada;


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

    public boolean getAsignada(){
      return asignada;
    }

    public void setAsignada(boolean asignada){
      this.asignada=asignada;
    }

  }

  public class Fiscal {
    private String nombre;
    private String rut;
    private ArrayList<Causa> causasActuales=new ArrayList<Causa>();
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
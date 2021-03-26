public class ProyectoFiscalia {

  public static void main(String[] args) {
     Procedimiento prueba= new Procedimiento();
     Procedimiento peritajes[]= new Procedimiento[2];
     Causa actual[]= new Causa[2];
     Causa caso= new Causa();
     Fiscal nuevo= new Fiscal();
     String part[]= new String[2];
     String rol[]= new String[2];
     part[0]="Juan Perez";
     rol[0]="Policia";
     part[1]="Roberto Gonzalez";
     rol[1]="Victima";
     prueba.setNombreProc("Toma de denuncia");
     prueba.setParticipantes(part);
     prueba.setRoles(rol);
     prueba.setResultado("Se hace una denuncia por estafa");
     peritajes[0]=prueba;
     caso.setPeritajes(peritajes);
     caso.setCodigo("123456");
     caso.setEstado("Abierto");
     caso.setTipoCaso("Delitos economicos");
     caso.setDistrito(9);
     actual[0]=caso;
     nuevo.setNombre("Maria Castillo");
     nuevo.setRut("12345768-9");
     nuevo.setEspecialidad("Delitos economicos");
     nuevo.setDistrito(9);
     nuevo.setCausasActuales(actual);

     System.out.println("Fiscales:");
     System.out.println("Nombre:"+ nuevo.getNombre());
     System.out.println("Rut:"+ nuevo.getRut());
     System.out.println("Especialidad:"+ nuevo.getEspecialidad());
     System.out.println("Distrito:"+ nuevo.getDistrito());
     System.out.println("Causas:");
     System.out.println("    Codigo:"+ caso.getCodigo());
     System.out.println("    Estado:"+ caso.getEstado());
     System.out.println("    Tipo de caso:"+ caso.getTipoCaso());
     System.out.println("    Procedimientos:");
     System.out.println("          1."+ prueba.getNombreProc());
     System.out.println("            Participantes:");
     System.out.println("                "+ part[0]+"/"+rol[0]);
     System.out.println("                "+ part[1]+"/"+rol[1]);
     System.out.println("            Resultado:"+ prueba.getResultado());
  }
  
  public static class Procedimiento {
    private String nombreProc;
    private String participantes[];
    private String roles[];
    private String resultado;

    public Procedimiento(){
      nombreProc= new String() ;
      participantes= new String[3];
      roles= new String[3];
      resultado= new String();
    }

        public String getNombreProc() {
            return nombreProc;
        }

        public void setNombreProc(String nombreProc) {
            this.nombreProc = nombreProc;
        }

        public String[] getParticipantes() {
            return participantes;
        }

        public void setParticipantes(String[] participantes) {
            this.participantes = participantes;
        }

        public String[] getRoles() {
            return roles;
        }

        public void setRoles(String[] roles) {
            this.roles = roles;
        }

        public String getResultado() {
            return resultado;
        }

        public void setResultado(String resultado) {
            this.resultado = resultado;
        }



  }
  public static class Causa {
    private String codigo;
    private Fiscal encargado;
    private Procedimiento peritajes[];
    private String estado;
    private String tipoCaso;
    private int distrito;

    public Causa(){
      codigo=new String();
      encargado= new Fiscal();
      peritajes= new Procedimiento[3];
      estado= new String();
      tipoCaso= new String();
      distrito= 0;
    }

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

        public Procedimiento[] getPeritajes() {
            return peritajes;
        }

        public void setPeritajes(Procedimiento[] peritajes) {
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

        public int getDistrito() {
            return distrito;
        }

        public void setDistrito(int distrito) {
            this.distrito = distrito;
        }


   
  }

  public static class Fiscal {
    private String nombre;
    private String rut;
    private Causa causasActuales[];
    private String especialidad;
    private int distrito;

    public Fiscal(){
      nombre= new String();
      rut= new String();
      causasActuales= new Causa[3];
      especialidad = new String();
      distrito=0; 
    }

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

        public Causa[] getCausasActuales() {
            return causasActuales;
        }

        public void setCausasActuales(Causa[] causasActuales) {
            this.causasActuales = causasActuales;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public int getDistrito() {
            return distrito;
        }

        public void setDistrito(int distrito) {
            this.distrito = distrito;
        }


   

  }

}

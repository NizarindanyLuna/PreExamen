
package modelo;

public class DatosPersonales {
    
    private String nCliente;
    private String fNac;
    private String domicilio;
    private String sexo;

    public DatosPersonales(String nCliente, String fNac, String domicilio, String sexo) {
        this.nCliente = nCliente;
        this.fNac = fNac;
        this.domicilio = domicilio;
        this.sexo = sexo;
    }
    
    public DatosPersonales(){
        
    }
    
    public DatosPersonales(DatosPersonales DatosP){
        
    }

    public String getnCliente() {
        return nCliente;
    }

    public String getfNac() {
        return fNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
    }

    public void setfNac(String fNac) {
        this.fNac = fNac;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

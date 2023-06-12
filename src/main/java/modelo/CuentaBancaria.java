package modelo;

public class CuentaBancaria {

    private int nCuenta, pRendimiento;
    private DatosPersonales dPersona;
    private String fApertura, nBanco;
    private float saldo;

    public CuentaBancaria() {

    }

    public CuentaBancaria(int nCuenta, int pRendimiento, DatosPersonales dPersona, String fApertura, String nBanco, float saldo) {
        this.nCuenta = nCuenta;
        this.pRendimiento = pRendimiento;
        this.dPersona = dPersona;
        this.fApertura = fApertura;
        this.nBanco = nBanco;
        this.saldo = saldo;
    }

    public CuentaBancaria(CuentaBancaria CuentaB) {

    }

    public int getnCuenta() {
        return nCuenta;
    }

    public int getpRendimiento() {
        return pRendimiento;
    }

    public DatosPersonales getdPersona() {
        return dPersona;
    }

    public String getfApertura() {
        return fApertura;
    }

    public String getnBanco() {
        return nBanco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setpRendimiento(int pRendimiento) {
        this.pRendimiento = pRendimiento;
    }

    public void setdPersona(DatosPersonales dPersona) {
        this.dPersona = dPersona;
    }

    public void setfApertura(String fApertura) {
        this.fApertura = fApertura;
    }

    public void setnBanco(String nBanco) {
        this.nBanco = nBanco;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(float cantidad){
        saldo=saldo+cantidad;
    }
    
    public boolean Retirar(float retirar){
        if(retirar<=saldo){
            saldo = getSaldo()-retirar;
            return true;
        }
        else{
          return  false;
        }
    }
    
    public float CalcularCreditos(){
        return getpRendimiento()/365*getSaldo();
    }
}

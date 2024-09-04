package JulioIngrid;

//Clase abstracta de pago
abstract class Pago{
    abstract void procesarPago();
}

//Clase derivada para pagos con tarjeta de crédito
class TarjetaDeCredito extends Pago{
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaDeCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad){
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void procesarPago() {
        System.out.println("Procesando pago con tarjea de credito");
        //Lógica para procesar pago con tarjeta de crédito
    }

    public void verificarLimiteCredito(){
        System.out.println("Verificando límite de crédito");
        //Lógica para verificar límite de crédito
    }

}
class PayPal extends Pago{
    private String emailUsuario;
    public PayPal(String emailUsuario){
        this.emailUsuario = emailUsuario;
    }
    @Override
    void procesarPago() {
        System.out.println("Procesando pago con JulioIngrid.PayPal");
    }
    public void enviarRecibo(){
        System.out.println("Enviando recibo");
    }

}


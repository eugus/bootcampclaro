public class Conta {


    int numero;
    double saldo;
    String agencia;
    String titular;

    public Conta() {
    }

    public Conta(int numero, double saldo, String agencia, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", agencia='" + agencia + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}

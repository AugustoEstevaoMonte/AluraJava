public class Conta{
  private double saldo;
  private int agencia;
  private int numero;
  private ClienteBanco titular;
  private static  int total;


  public Conta(int agen, int num)
  {
    this.agencia = agen;
    this.numero = num;
    total+=1;
  }

  public static int getTotal() {
    return Conta.total;
  }


  public void setSaldo(double value)
  {
    if(value<=0)
      return;
    this.saldo = value;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void setAgencia(int agencia){
    if(agencia<=0)
      return;
    this.agencia = agencia;
  }

  public int getAgencia()
  {
    return this.agencia;
  }

  public void setNumero(int num){
    if(num<=0)
      return;
    this.numero = num;
  }

  public int getNumero()
  {
    return this.numero;
  }

  public void setTitular(ClienteBanco tit){
    this.titular = tit;
  }

  public ClienteBanco getTitular()
  {
    return this.titular;
  }


  public void depositarValor(double value)
  {
    if(value<=0)
      return;
    this.saldo+=value;
  }

  public void sacarValor(double valor){
    if(valor<=0 || this.saldo<valor)
      return;
    this.saldo-=valor;
  }

  public void transferirValor(Conta dest, double value){
    if(value<=0.0 || this.saldo<value)
      return;
    this.saldo -= value;
    dest.saldo = value;
  }
}
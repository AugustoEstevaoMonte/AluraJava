public class ByteBankEncapsulado {
  public static void main(String[] args) {
    Conta testeNovo = new Conta(1232,1234);
    ClienteBanco paulo = new ClienteBanco();
    testeNovo.setTitular(paulo);
    testeNovo.getTitular().setCPF("000-000-000.00");
    testeNovo.getTitular().setNome("Paulo Bicho de pé");
    testeNovo.getTitular().setProfissao("Ator pornô");
    System.out.println(testeNovo.getTitular().getCPF() + " \n" + testeNovo.getTitular().getNome() + "\n" + testeNovo.getTitular().getProfissao());
  }
}

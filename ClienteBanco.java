  public class ClienteBanco 
  {
    private String nome;
    private String cpf;
    private String profissao;

    public void setNome(String name)
    {
      this.nome = name;
    }

    public void setCPF(String cp){
      this.cpf = cp;
    }

    public void setProfissao(String prof){
      this.profissao = prof;
    }

    public String getNome()
    {
      return this.nome;
    }

    public String getCPF(){
      return this.cpf;
    }

    public String getProfissao(){
      return this.profissao;
    }

  }
  
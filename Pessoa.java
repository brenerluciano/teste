package Classes;
public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String cpf, String nome, int idade, String endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getCpf(){
        return cpf;
    }
     
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void andar(){
        System.out.println("Andando....! ");
    }

    public void comer(){
        System.out.println("Comendo algo...! ");
    }

    public void falar(){
        System.out.println("Vamos nessa! ");
    }

    public void pular(){
        System.out.println("Pulando uma certa altura...! ");
    }
}
package projeto1.Pessoa;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private int idade;

    //Nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    //email
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    //telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return telefone;
    }

    //idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }


}

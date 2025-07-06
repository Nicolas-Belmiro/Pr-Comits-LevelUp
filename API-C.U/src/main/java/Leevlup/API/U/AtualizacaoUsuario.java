package Leevlup.API.U;


public class AtualizacaoUsuario {
    private String nome;
    private Long telefone;
    private String email;
    private String senha;

    public AtualizacaoUsuario(String nome, Long telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email; this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
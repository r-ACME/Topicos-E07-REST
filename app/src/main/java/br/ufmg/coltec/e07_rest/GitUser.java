package br.ufmg.coltec.e07_rest;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Field;

public class GitUser {

    @SerializedName("name")
    private String nome;
    @SerializedName("login")
    private String login;
    @SerializedName("company")
    private String empresa;
    @SerializedName("blog")
    private String blog;
    @SerializedName("location")
    private String local;
    @SerializedName("email")
    private String email;
    @SerializedName("bio")
    private String biografia;
    @SerializedName("public_repos")
    private Integer qtdRepositorios;
    @SerializedName("public_gists")
    private Integer qtdSeguidores;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Integer getQtdRepositorios() {
        return qtdRepositorios;
    }

    public void setQtdRepositorios(Integer qtdRepositorios) {
        this.qtdRepositorios = qtdRepositorios;
    }

    public Integer getQtdSeguidores() {
        return qtdSeguidores;
    }

    public void setQtdSeguidores(Integer qtdSeguidores) {
        this.qtdSeguidores = qtdSeguidores;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", company='" + empresa + '\'' +
                ", blog='" + blog + '\'' +
                ", location='" + local + '\'' +
                ", email='" + email + '\'' +
                ", bio='" + biografia + '\'' +
                ", public_repos='" + qtdRepositorios + '\'' +
                ", followers='" + qtdSeguidores + '\'' +
                '}';
    }

}

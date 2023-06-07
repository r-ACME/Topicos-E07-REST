package br.ufmg.coltec.e07_rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitRest{

    private Retrofit retrofit;

    public GitRest() {

        // configura o retrofit para um determinado serviço
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/users/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public GitRestAPI getGitRest() {
        return this.retrofit.create(GitRestAPI.class);
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}

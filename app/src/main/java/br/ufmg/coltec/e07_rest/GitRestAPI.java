package br.ufmg.coltec.e07_rest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitRestAPI {

    @GET("{user}")
    public Call<GitUser> getUser(@Path("user") String user);

    @GET("{bio}/{name}")
    public Call<List<GitUser>> getLogin(@Path("bio") String biografia,
                                        @Path("name") String nome);


}

package br.ufmg.coltec.e07_rest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    GitRest git = new GitRest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtPesquisa = findViewById(R.id.txt_pesquisa);
        Button btnPesquisa = findViewById(R.id.btn_pesquisa);

        btnPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    GitRest gitRest = new GitRest();
                    String search = txtPesquisa.getText().toString();

                    GitRestAPI service = gitRest.getGitRest();
                    Call<GitUser> fetchUser = service.getUser(search);

                    fetchUser.enqueue(new Callback<GitUser>() {
                        @Override
                        public void onResponse(Call<GitUser> call, Response<GitUser> response) {
                            GitUser user = response.body();

                            Intent intent = new Intent(MainActivity.this, UserView.class);
                            Bundle args = new Bundle();

                            args.putString("nome", user.getNome());
                            args.putString("login", user.getLogin());
                            args.putString("empresa", user.getEmpresa());
                            args.putString("blog", user.getBlog());
                            args.putString("local", user.getLocal());
                            args.putString("email", user.getEmail());
                            args.putString("biografia", user.getBiografia());
                            args.putString("qtdRepositorios", user.getQtdRepositorios().toString());
                            args.putString("qtdSeguidores", user.getQtdSeguidores().toString());
                            //intent.putExtras(args);
                            intent.putExtra("data", args);

                            startActivity(intent);
                            //Toast.makeText(MainActivity.this, "Usuário encontrado: " + user.toString(),  Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onFailure(Call<GitUser> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "Usuário não encontrado: " + txtPesquisa.getText().toString(),  Toast.LENGTH_LONG).show();
                        }
                    });
            }
        });


    }
}
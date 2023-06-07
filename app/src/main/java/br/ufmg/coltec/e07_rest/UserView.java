package br.ufmg.coltec.e07_rest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);

        Bundle bundle = this.getIntent().getBundleExtra("data");

        String nome = bundle.getString("nome");//
        String login = bundle.getString("login");//
        String empresa = bundle.getString("empresa");//
        String blog = (String) bundle.get("blog");
        String local = (String) bundle.get("local");//
        String email = (String) bundle.get("email");//
        String biografia = (String) bundle.get("biografia");//

        String qtdRepositorios = bundle.getString("qtdRepositorios");//
        String qtdSeguidores = bundle.getString("qtdSeguidores");//

        TextView lblNome = findViewById(R.id.lbl_nome);
        TextView lblLogin = findViewById(R.id.lbl_usuario);
        TextView lblEmpresa = findViewById(R.id.lbl_empresa);
        TextView lblBlog = findViewById(R.id.lbl_blog);
        TextView lblLocal = findViewById(R.id.lbl_cidade);
        TextView lblEmail = findViewById(R.id.lbl_email);
        TextView lblBiografia = findViewById(R.id.lbl_descricao);
        TextView lblQtdRepositorios = findViewById(R.id.lbl_qtd_repositorios);
        TextView lblQtdSeguidores = findViewById(R.id.lbl_qtd_seguidores);

        lblNome.setText(nome);
        lblLogin.setText(login);
        lblEmpresa.setText(empresa);
        lblBlog.setText(blog);
        lblLocal.setText(local);
        lblEmail.setText(email);
        lblBiografia.setText(biografia);
        lblQtdRepositorios.setText(qtdRepositorios);
        lblQtdSeguidores.setText(qtdSeguidores);

    }
}
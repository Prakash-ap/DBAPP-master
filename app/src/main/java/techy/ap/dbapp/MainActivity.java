package techy.ap.dbapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import techy.ap.dbapp.Database.Database;
import techy.ap.dbapp.Model.Docs;

public class MainActivity extends AppCompatActivity {
    private EditText name,spaecialist;
    private Button save,view;
    Database db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        spaecialist=findViewById(R.id.special);
        save=findViewById(R.id.btn_save);
        db=new Database(this);
        view=findViewById(R.id.brn_view);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname=name.getText().toString();
                String sspecial=spaecialist.getText().toString();
                Docs docs=new Docs();
                docs.setName(sname);
                docs.setSpecialist(sspecial);
                db.insertdata(docs);


            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}

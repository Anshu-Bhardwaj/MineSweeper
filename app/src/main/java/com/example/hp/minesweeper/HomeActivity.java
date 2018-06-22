package com.example.hp.minesweeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editText=findViewById(R.id.nameEditText);
    }

    public void StartMainActivity(View view){
        String name= editText.getText().toString();
        Intent intent= new Intent(this,MainActivity.class);
        intent.putExtra("Player_Name",name);
        startActivity(intent);
    }
}

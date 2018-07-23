package com.example.niloofar.sharedradio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnsave(View view){

        EditText nameObj=findViewById(R.id.txt_name);
        EditText familyObj=findViewById(R.id.txt_family);
        RadioButton maleObj=findViewById(R.id.rb_male);

        String name=nameObj.getText().toString();
        String family=familyObj.getText().toString();
        boolean isMale=maleObj.isChecked();

        SharedPreferences shpObj=getSharedPreferences("personalInfo",MODE_PRIVATE);

        shpObj.edit().putString("kname",name).apply();
        shpObj.edit().putString("kfamily",family).apply();
        shpObj.edit().putBoolean("kisMale",isMale).apply();
        Toast.makeText(this,"your info has been save",Toast.LENGTH_SHORT).show();
    }
    public void btnshow(View view){
        Intent intent=new Intent(this,showActivity.class);
        startActivity(intent);
    }
}

package com.example.niloofar.sharedradio;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView nameObj=findViewById(R.id.txv_name);
        TextView familyObj=findViewById(R.id.txv_family);
        TextView genderObj=findViewById(R.id.txv_gender);

        SharedPreferences shpReaderObj=getSharedPreferences("personalInfo",MODE_PRIVATE);
        String name=shpReaderObj.getString("kname","Empty");
        String family=shpReaderObj.getString("kfamily","Empty");
        boolean isMale=shpReaderObj.getBoolean("kisMale",false);
        String gender="Female";
        if(isMale){
            gender="Male";
        }
        nameObj.setText(name);
        familyObj.setText(family);
        genderObj.setText(gender);
    }
    public void btnExite(View view){
        finish();
    }
}

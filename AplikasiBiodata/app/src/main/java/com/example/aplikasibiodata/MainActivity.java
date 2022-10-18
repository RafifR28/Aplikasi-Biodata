package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone(View view){
        Uri uri = Uri.parse("tel:081293243106");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void showMap(View view){
        Uri uri = Uri.parse("geo:-7.067663, 110.457026");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ramadanrafif30@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"Email dari aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent,"Ingin mengirim email?"));
        }catch (android.content.ActivityNotFoundException ex){

        }
    }
}
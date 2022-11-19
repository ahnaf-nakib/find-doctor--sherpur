package com.nakib.finddoctorsherpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity4 extends AppCompatActivity {

    LinearLayout asad,saifulamin,nurnabi,ruposh,ratan,shamoli,sumon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

       asad =   findViewById(R.id.asad);
       saifulamin = findViewById(R.id.saifulamin);
       nurnabi = findViewById(R.id.nurnabi);
       ruposh = findViewById(R.id.ruposh);
       ratan = findViewById(R.id.ratan);
       shamoli = findViewById(R.id.shamoli);
       sumon = findViewById(R.id.sumon);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        asad.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01717-802456";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });
       saifulamin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01997445407";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });

       nurnabi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01937-567878";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });

       shamoli.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01713-567962";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });

       ratan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01772226665";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });

       ruposh.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01839-838383";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });

       sumon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String phone = "01717572043";
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
               startActivity(intent);
           }
       });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
package com.nakib.finddoctorsherpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity11 extends AppCompatActivity {

    LinearLayout sahidull,uttam,reza,foyez,imran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        sahidull=findViewById(R.id.sahidull);
        uttam=findViewById(R.id.uttam);
        reza=findViewById(R.id.reza);
        foyez=findViewById(R.id.foyez);
        imran=findViewById(R.id.imran);


//adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sahidull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01712-535216";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        uttam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01768-515322";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        reza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01763-508258";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        foyez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "০১৫৯৫৫৩৯৩৬১ ";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        imran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01839-838383";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
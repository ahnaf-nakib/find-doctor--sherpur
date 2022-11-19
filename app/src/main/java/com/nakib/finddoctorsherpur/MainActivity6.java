package com.nakib.finddoctorsherpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity6 extends AppCompatActivity {
LinearLayout anupom,parvin,mukti,samsur,aziz,mizan,robiul,kollol,jahirul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        anupom=findViewById(R.id.anupom);
        parvin=findViewById(R.id.parvin);
        mukti=findViewById(R.id.mukti);
        samsur=findViewById(R.id.samsur);
        aziz=findViewById(R.id.aziz);
        mizan=findViewById(R.id.mizan);
        robiul=findViewById(R.id.robiul);
        kollol=findViewById(R.id.kollol);
        jahirul=findViewById(R.id.jahirul);

//adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mukti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = " 01839-838383";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        samsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01965-017370";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        aziz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01758-883531";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        mizan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01713-576371";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        robiul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01959994082";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        jahirul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "০১৩১৭১৩৭৬৭৮";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        kollol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "০১৮৮০-০৬৪০৯০";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        anupom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01913385822";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        parvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = " 01833437482";
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
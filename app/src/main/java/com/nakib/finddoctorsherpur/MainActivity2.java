package com.nakib.finddoctorsherpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    LinearLayout indrajit,satya,nadim,mostak,hannan,sahidul,asad,rajib,azad,amirul,ashraful,arup,bijoy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        indrajit=findViewById(R.id.indrajit);
        nadim=findViewById(R.id.nadim);
        mostak=findViewById(R.id.mostak);
        hannan=findViewById(R.id.hannan);
        sahidul=findViewById(R.id.sahidul);
        asad=findViewById(R.id.asad);
        rajib=findViewById(R.id.rajib);
        azad=findViewById(R.id.azad);
        amirul=findViewById(R.id.amirul);
        ashraful=findViewById(R.id.ashraful);
        arup=findViewById(R.id.arup);
        bijoy=findViewById(R.id.bijoy);
        satya=findViewById(R.id.satya);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        indrajit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01712613826";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        nadim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01718357880";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        hannan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01957558344";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mostak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01839838383";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        sahidul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01712-535216";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        asad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "0171";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        rajib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01833437482";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        amirul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01856263388";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        ashraful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01223";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        arup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01932816650";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        bijoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01911314797";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        azad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01839838383";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        satya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01720348665";
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
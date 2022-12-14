package com.nakib.finddoctorsherpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity15 extends AppCompatActivity {


    LinearLayout prof,biddut,parvej;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        prof=findViewById(R.id.prof);
        biddut=findViewById(R.id.biddut);
        parvej=findViewById(R.id.parvej);



//adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01839-838383";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        biddut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01911314797";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        parvej.setOnClickListener(new View.OnClickListener() {
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
        if(item.getItemId()==android.R.id.home)
        { this.finish();   }
        return super.onOptionsItemSelected(item);
    }
}
package com.nakib.finddoctorsherpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity8 extends AppCompatActivity {

    LinearLayout ismail,mostofa,bari,fuad,asadc,babon,tofa,fakru,pankaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ismail=findViewById(R.id.ismail);
        mostofa=findViewById(R.id.mostofa);
        bari=findViewById(R.id.bari);
        fuad=findViewById(R.id.fuad);
        asadc=findViewById(R.id.asadc);
        babon=findViewById(R.id.babon);
        tofa=findViewById(R.id.tofa);
        fakru=findViewById(R.id.fakru);
        pankaj=findViewById(R.id.pankaj);


//adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ismail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "01712613826";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    mostofa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01767621444";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });

    bari.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01918495726";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });

    fuad.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01317137678";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });
    asadc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01595539361";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });
    babon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01739764393";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });

    tofa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01995365413";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });

    fakru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "০১৮৩৯-৮৩৮৩৮৩";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });

    pankaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = "01595539361";
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
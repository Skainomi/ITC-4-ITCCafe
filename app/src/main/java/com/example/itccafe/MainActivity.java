package com.example.itccafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int totalMenu1 = 0;
    static int totalMenu2 = 0;
    static int totalHarga = 0;
    static int totalBeli = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buy = findViewById(R.id.btn_buy);
        Button reset = findViewById(R.id.btn_reset);
        Button menuSatuPlus = findViewById(R.id.btn_menu1plus);
        Button menuDuaPlus = findViewById(R.id.btn_menu2plus);
        Button menuSatuMin = findViewById(R.id.btn_menu1minus);
        Button menuDuaMin = findViewById(R.id.btn_menu2minus);

        final TextView jml1 = findViewById(R.id.tv_jmlMenu1);
        final TextView jml2 = findViewById(R.id.tv_jmlMenu2);

        final TextView jmlharga = findViewById(R.id.tv_jmlHarga);
        final TextView jmlBeli = findViewById(R.id.tv_jmlBeli);


        jmlBeli.setText("");
        menuSatuPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(totalMenu1 < 10)
                {
                    totalMenu1 = totalMenu1 + 1;
                    totalBeli = totalBeli + 1;
                    totalHarga = totalHarga + 100000;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Maksimal 10 Pesanan", Toast.LENGTH_SHORT).show();
                }
                jml1.setText("" + totalMenu1);
                jmlharga.setText("Rp. " + totalHarga);
                jmlBeli.setText("" + totalBeli);

            }
        });
        menuDuaPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(totalMenu2 < 10)
                {
                    totalMenu2 = totalMenu2 + 1;
                    totalBeli = totalBeli + 1;
                    totalHarga = totalHarga + 200000;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Maksimal 10 Pesanan", Toast.LENGTH_SHORT).show();
                }
                jml2.setText("" + totalMenu2);
                jmlharga.setText("Rp. " + totalHarga);
                jmlBeli.setText("" + totalBeli);

            }
        });

        menuSatuMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(totalMenu1 > 0)
                {
                    totalMenu1 = totalMenu1 - 1;
                    totalBeli = totalBeli - 1;
                    totalHarga = totalHarga - 100000;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Tidak Blh Kurang dari 0", Toast.LENGTH_SHORT).show();
                }
                jmlharga.setText("Rp. " + totalHarga);
                jmlBeli.setText("" + totalBeli);
                jml1.setText("" + totalMenu1);
            }
        });

        menuDuaMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(totalMenu2 > 0)
                {
                    totalMenu2 = totalMenu2 - 1;
                    totalBeli = totalBeli - 1;
                    totalHarga = totalHarga - 200000;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Tidak Blh Kurang dari 0", Toast.LENGTH_SHORT).show();
                }
                jml2.setText("" + totalMenu2);
                jmlharga.setText("Rp. " + totalHarga);
                jmlBeli.setText("" + totalBeli);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMenu1 = 0;
                totalMenu2 = 0;
                totalHarga = 0;
                totalBeli = 0;
                jml1.setText("" + totalMenu2);
                jml2.setText("" + totalMenu2);
                jmlharga.setText("Rp. " + totalHarga);
                jmlBeli.setText("Purchased");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMenu1 = 0;
                totalMenu2 = 0;
                totalHarga = 0;
                totalBeli = 0;
                jml1.setText("" + totalMenu2);
                jml2.setText("" + totalMenu2);
                jmlharga.setText("" + totalHarga);
                jmlBeli.setText("" + totalBeli);
            }
        });



    }

}

package com.example.asus.crudmahasiswa2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.asus.crudmahasiswa2.adapter.MahasiswaAdapter;
import com.example.asus.crudmahasiswa2.model.Mahasiswa;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_main);

        //coba gambar source dinamis
        ImageView ivCobaGambar = (ImageView) findViewById(R.id.iv_coba_gambar);

//        int SDK_INT = Build.VERSION.SDK_INT;
//        if (SDK_INT > 8) {
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
//                    .permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//            try {
//                URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZTaRlv9eENh8YVuO76gFEDKFC4YO4zdfIheQVex7RVC-qHvjX");
//                Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                ivCobaGambar.setImageBitmap(bmp);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZTaRlv9eENh8YVuO76gFEDKFC4YO4zdfIheQVex7RVC-qHvjX")
                .into(ivCobaGambar);

        //1. data
        String[] nama = new String[]{"isna", "firdasari", "lancar", "TA" }; //menampilkan data statis

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Isna");
        mahasiswa1.setNim("3.34.15.13");
        mahasiswa1.setEmail("firdasariisna13@gmail.com");
        mahasiswa1.setFoto("R.drawable.isna");

        Mahasiswa mahasiswa2 = new Mahasiswa(
          "Firdasari",
          "3.34.15.1.15.25" ,
          "firdasari@gmail.com",
          "R.drawable.cvisna"
        );

        Mahasiswa mahasiswa3 = new Mahasiswa(
                "Banyuwangi",
                "2018",
                "banyuwangi@gmail.com",
                " "
        );

        Mahasiswa mahasiswa4 = new Mahasiswa(
                "Lempuyang",
                "2018",
                "lempuyang@gmail.com",
                ""
        );


        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);

        //2. adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                nama); //membuat array adapter

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this,
                R.layout.item_mahasiswa,
                mahasiswas);

        //3. activity
//        ListView lvDaftarNama = (ListView) findViewById(R.id.lv_daftar_nama);
        ListView lvDaftarNama = (ListView) findViewById(R.id.lv_daftar_nama) ;
        lvDaftarNama.setAdapter(mahasiswaAdapter);

    }
}

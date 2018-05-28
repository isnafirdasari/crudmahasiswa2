package com.example.asus.crudmahasiswa2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.crudmahasiswa2.R;
import com.example.asus.crudmahasiswa2.model.Mahasiswa;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa>{
    public MahasiswaAdapter(@NonNull Context context,
                            int resource,
                            @NonNull ArrayList<Mahasiswa> objects) {
        super(context,resource,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_mahasiswa, parent, false);
        }

        Mahasiswa mahasiswa = getItem(position);

        TextView tvNama = (TextView) convertView.findViewById(R.id.tv_nama);
        tvNama.setText(mahasiswa.getNama());

        TextView tvNim = (TextView) convertView.findViewById(R.id.tv_nim);
        tvNim.setText(mahasiswa.getNim());

        TextView tvEmail = (TextView) convertView.findViewById(R.id.tv_email);
        tvEmail.setText(mahasiswa.getEmail());

        ImageView ivCobagambar = (ImageView) convertView.findViewById(R.id.iv_coba_gambar);
        Picasso.get().load(mahasiswa.getFoto()).into(ivCobagambar);

        return convertView;
    }
}

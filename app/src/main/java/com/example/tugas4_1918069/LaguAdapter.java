package com.example.tugas4_1918069;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LaguAdapter extends RecyclerView.Adapter<LaguAdapter.LaguViewHolder>{
    private ArrayList<Lagu> dataList;
    public LaguAdapter(ArrayList<Lagu> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public LaguAdapter.LaguViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_lagu, parent, false);
        return new LaguViewHolder(view);
    }
    public void onBindViewHolder(LaguViewHolder holder, int position) {
        holder.coverAlbum.setImageResource(dataList.get(position).getFoto());
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtPenyanyi.setText(dataList.get(position).getPenyanyi());
        holder.txtTahun.setText(dataList.get(position).getTahun());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class LaguViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtPenyanyi, txtTahun;
        private ImageView coverAlbum;
        public LaguViewHolder(View itemView) {
            super(itemView);
            coverAlbum = (ImageView) itemView.findViewById(R.id.cover_album);
            txtJudul = (TextView)itemView.findViewById(R.id.txt_judul);
            txtPenyanyi = (TextView) itemView.findViewById(R.id.txt_penyanyi);
            txtTahun = (TextView) itemView.findViewById(R.id.txt_tahun);
        }
    }


}


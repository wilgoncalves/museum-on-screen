package com.williangoncalves.museumonscreen.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.mediation.Adapter;

public class AdapterPrincipal extends RecyclerView.Adapter<AdapterPrincipal.MyViewHolder> {

    @NonNull
    @Override
    public AdapterPrincipal.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPrincipal.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        ImageView imagem;
        TextView conteudo;
        TextView referencia;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

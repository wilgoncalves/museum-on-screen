package com.williangoncalves.museumonscreen.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.williangoncalves.museumonscreen.R;

public class AdapterPrincipal extends RecyclerView.Adapter<AdapterPrincipal.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista_principal, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titulo.setText(R.string.text_o_grito);
        holder.imagem.setImageResource(R.drawable.o_grito);
        holder.conteudo.setText(R.string.desc_o_grito);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        ImageView imagem;
        TextView conteudo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textViewTitulo);
            imagem = itemView.findViewById(R.id.imageViewArte);
            conteudo = itemView.findViewById(R.id.textViewConteudo);
        }
    }
}

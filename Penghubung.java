package com.example.dwimahdini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Penghubung extends RecyclerView.Adapter<Vieww> {


    Context context;
    List<com.example.dwimahdini.Isi> items;

    public Penghubung(Context context, List<com.example.dwimahdini.Isi> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Vieww onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new Vieww(LayoutInflater.from(context).inflate(R.layout.isi_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Vieww holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
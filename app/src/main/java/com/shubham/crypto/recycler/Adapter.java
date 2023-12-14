package com.shubham.crypto.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shubham.crypto.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<holder> {

    ArrayList<model> list = new ArrayList<>();

    public Adapter(ArrayList<model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.curr_layout, parent, false);
        return new holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
    model item = list.get(position);
    holder.nameofCurr.setText(item.getName());
    holder.logoofCurr.setImageDrawable(item.getLogo());
    holder.priceofCurr.setText(item.getPrice());
    holder.symbolofCurr.setText(item.getSymbol());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

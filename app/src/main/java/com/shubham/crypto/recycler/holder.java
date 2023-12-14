package com.shubham.crypto.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shubham.crypto.R;

public class holder extends RecyclerView.ViewHolder {
    TextView nameofCurr, priceofCurr, symbolofCurr;
    ImageView logoofCurr;
    public holder(@NonNull View itemView) {
        super(itemView);


        nameofCurr = itemView.findViewById(R.id.name);
        priceofCurr = itemView.findViewById(R.id.price);
        symbolofCurr = itemView.findViewById(R.id.symbol);
        logoofCurr = itemView.findViewById(R.id.logo);
    }
}

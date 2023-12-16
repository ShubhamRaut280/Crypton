package com.shubham.crypto.recycler;

import static android.content.ContentValues.TAG;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import com.shubham.crypto.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<holder>  {

    ArrayList<model> mainlist;
    ArrayList<model>backup;

    public Adapter(ArrayList<model> list) {
        this.mainlist = list;
        this.backup = new ArrayList<>(list);

    }




    @NonNull
    @Override
        public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.curr_layout, parent, false);
            return new holder(itemView);
        }




    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
    model item = mainlist.get(position);
    holder.nameofCurr.setText(item.getName());
    holder.priceofCurr.setText("$"+item.getPrice());
    holder.symbolofCurr.setText(item.getSymbol());
    holder.date.setText("Last updated: "+item.getDate());

        Log.d("FILTER_DEBUG", "i think the size of  list should not be null inside bind q"+" size of backup : "+backup.size()+" size of main list: "+ mainlist.size() );





    }



    @Override
    public int getItemCount() {
        Log.d("FILTER_DEBUG", "i think the size of filtered list should not be null inside itemcount "+" size of backup : "+backup.size()+" size of main list: "+ mainlist.size() );

        return mainlist.size();
    }


    public void getFilter(String keyword) {

        if(backup.size()==0)
            backup.addAll(mainlist);
        Log.d("FILTER_DEBUG", "i think the size of filtered list should not be null inside getfilter "+" size of backup : "+backup.size()+" size of main list: "+ mainlist.size() );


            ArrayList<model> filteredList = new ArrayList<>();
            Log.d("FILTER_DEBUG", "i think keyoword is empty lets check " + keyword+ " its string casting : "+ keyword.toString().toLowerCase());


            if (keyword.toString().isEmpty()) {
                filteredList.addAll(backup);
                Log.d("FILTER_DEBUG", "i think the size of filtered list should not be null " +filteredList.size()+" size of backup : "+backup.size()+" size of main list: "+ mainlist.size() );


            }
            else
            {
                for (model m :backup) {
                    if (m.getName().toLowerCase().contains(keyword.toString().toLowerCase()))
                    {
                        Log.d("FILTER_DEBUG", "match found in input " + m.getName().toLowerCase()+" keyword is : "+ keyword.toString().toLowerCase());

                        filteredList.add(m);

                    }
                }
            }


            Log.d("FILTER_DEBUG", "Filtered Size: " + filteredList.size());


         mainlist.clear();
            mainlist.addAll(filteredList);
        for (model m :
                filteredList) {
            Log.d(TAG, "getFilter:Name in filtered list :"+m.getName().toLowerCase());
        }
        for (model m :
                mainlist) {
            Log.d(TAG, "getFilter:Name in main list :"+m.getName().toLowerCase());
        }



        Log.d("FILTER_DEBUG", "list Size: " + mainlist.size());
            notifyDataSetChanged();

        }
    };





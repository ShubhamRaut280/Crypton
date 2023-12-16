package com.shubham.crypto;

import static android.content.ContentValues.TAG;
import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.shubham.crypto.Api_Related.Crypto;
import com.shubham.crypto.Api_Related.Cryptodata.CryptoData;
import com.shubham.crypto.recycler.Adapter;
import com.shubham.crypto.recycler.model;

import org.json.JSONObject;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ArrayList<model> recvlist = new ArrayList<>();
    Adapter adapter = new Adapter(recvlist);

    RecyclerView recyclerView;
    TextView error;
    FloatingActionButton refresh;
    EditText searchbar;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.main)));
        getSupportActionBar().setTitle("Search");
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        pb = findViewById(R.id.pb);
        error = findViewById(R.id.errormsg);
        refresh = findViewById(R.id.refresh);


        retrofitwork();
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                retrofitwork();
                Toast.makeText(MainActivity.this, "Refreshing", Toast.LENGTH_SHORT).show();
            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pb.setVisibility(View.VISIBLE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchmenu,menu);
        MenuItem item = menu.findItem(R.id.search_menu);
        SearchView searchView =  (SearchView)item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter(query);
                adapter.notifyDataSetChanged();

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter(newText);
                adapter.notifyDataSetChanged();

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);

    }


    // code for retrofit requests


    public void retrofitwork(){

        recvlist.clear();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://pro-api.coinmarketcap.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            Crypto reqData = retrofit.create(Crypto.class);

            String apikey = "b94b5c1d-20f6-4785-9e60-d110f83efd9e";


            reqData.getCryptoData(apikey).enqueue(new Callback<CryptoData>() {
                @Override
                public void onResponse(Call<CryptoData> call, Response<CryptoData> response) {
                    pb.setVisibility(GONE);
                    if (response.isSuccessful() && response.body() != null) {
                        Log.d(TAG, "onResponse: Everything is okkkkk");

                        if (response.body().getData() != null) {
                            for (int i = 0; i < response.body().getData().size(); i++) {

                                String cname = response.body().getData().get(i).getName();
                                String csymbol = response.body().getData().get(i).getSymbol();
                                double cprice = response.body().getData().get(i).getQuote().getUSD().getPrice();
                                String price = String.format("%.3f",cprice);

                                LocalDateTime currentDateTime = LocalDateTime.now();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                                String formattedDateTime = currentDateTime.format(formatter);

                                String date = formattedDateTime;
                                model result = new model(cname, csymbol, price, null,date);

                                recvlist.add(result);

                            }

                            Log.d(TAG, "onResponse: data is passed to recycler");

                            recyclerView.setAdapter(new Adapter(recvlist));
                        }

                    }
                }
                        @Override
                        public void onFailure(Call<CryptoData> call, Throwable t) {
                        Log.d(TAG, "API request failed: " + t.getMessage());
                        error.setVisibility(View.VISIBLE);
                        pb.setVisibility(GONE);
                    }
                    });


    }

    public String filterdate(String mixdatetime)
    {
        String ans  = new String();

        // Parse the string to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse(mixdatetime, DateTimeFormatter.ISO_DATE_TIME);

        // Extract date and time
        String date = dateTime.toLocalDate().toString();
        String time = dateTime.toLocalTime().toString();

        ans = date+" : "+time;


        return ans;

    }




}
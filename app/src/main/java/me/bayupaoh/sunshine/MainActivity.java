package me.bayupaoh.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import me.bayupaoh.sunshine.Adapter.AdapterWeather;
import me.bayupaoh.sunshine.Model.ModelWeather;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewWeather;
    ArrayList<ModelWeather> listWeather = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declaration();
        setDataDummy();
        setRecylclerView();
    }

    private void setRecylclerView() {
        recyclerViewWeather.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        AdapterWeather adapterWeather = new AdapterWeather(listWeather,getApplicationContext());
        recyclerViewWeather.setAdapter(adapterWeather);
        recyclerViewWeather.setItemAnimator(new DefaultItemAnimator());
        recyclerViewWeather.setHasFixedSize(true);
    }

    private void setDataDummy() {
        listWeather.add(new ModelWeather(R.drawable.rain,"Tomorow","Rainy",17,17));
        listWeather.add(new ModelWeather(R.drawable.rain,"Tomorow","Rainy",17,17));
        listWeather.add(new ModelWeather(R.drawable.rain,"Tomorow","Rainy",17,17));
        listWeather.add(new ModelWeather(R.drawable.rain,"Tomorow","Rainy",17,17));
        listWeather.add(new ModelWeather(R.drawable.rain,"Tomorow","Rainy",17,17));
    }

    private void declaration() {
        recyclerViewWeather = (RecyclerView) findViewById(R.id.recycler_cuaca);

    }
}

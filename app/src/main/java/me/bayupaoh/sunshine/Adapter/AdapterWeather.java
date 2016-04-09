package me.bayupaoh.sunshine.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import me.bayupaoh.sunshine.Model.ModelWeather;
import me.bayupaoh.sunshine.R;

import static me.bayupaoh.sunshine.R.layout.adapter_weather;

/**
 * Created by CodeLabs on 09/04/2016.
 */
public class AdapterWeather extends RecyclerView.Adapter<AdapterWeather.ViewHolderWaeather> {
    private ArrayList<ModelWeather> listWeather;
    private Context context;

    public AdapterWeather(ArrayList<ModelWeather> listWeather, Context context) {
        this.listWeather = listWeather;
        this.context = context;
    }

    @Override
    public AdapterWeather.ViewHolderWaeather onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather,parent,false);
        ViewHolderWaeather view = new ViewHolderWaeather(viewItem);
        return view;
    }

    @Override
    public void onBindViewHolder(AdapterWeather.ViewHolderWaeather holder, int position) {
        holder.imgIcon.setImageAlpha(listWeather.get(position).getIcon());
        holder.txtDay.setText(listWeather.get(position).getDay());
        holder.txtWeather.setText(listWeather.get(position).getWeather());
        holder.temperature.setText(String.valueOf(listWeather.get(position).getTemperature()));
        holder.temperatureForecast.setText(String.valueOf(listWeather.get(position).getTemperatureForecast()));
    }

    @Override
    public int getItemCount() {
        return listWeather.size();
    }

    public class ViewHolderWaeather extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtDay;
        TextView txtWeather;
        TextView temperature;
        TextView temperatureForecast;

        public ViewHolderWaeather(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.img_adapter_icon_weather);
            txtDay = (TextView) itemView.findViewById(R.id.txt_adapter_day);
            txtWeather = (TextView) itemView.findViewById(R.id.txt_adapter_status);
            temperature = (TextView) itemView.findViewById(R.id.txt_adapter_temperature);
            temperatureForecast= (TextView) itemView.findViewById(R.id.txt_adapter_temperature2);
        }
    }
}

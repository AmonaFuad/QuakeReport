package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapterClass extends ArrayAdapter<EarthquakeCustomClass> {
    public EarthquakeAdapterClass( Context context, ArrayList <EarthquakeCustomClass> earthquakeInfo) {
        super(context, 0,earthquakeInfo);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            LayoutInflater inflater=LayoutInflater.from(getContext());
            listItemView =inflater.inflate(R.layout.custom_list_item, parent, false);
        }

        EarthquakeCustomClass getwords = getItem(position);


        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_info);
       magnitudeTextView.setText(getwords.getMagnitude());

         TextView cityTextView = (TextView) listItemView.findViewById(R.id.city_info);
       magnitudeTextView.setText(getwords.getCity());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_info);
        magnitudeTextView.setText(getwords.getDate());
        return listItemView;
    }

}

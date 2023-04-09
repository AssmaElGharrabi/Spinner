package com.example.spinner;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerAdapter extends ArrayAdapter<ItemData> {

    Activity context;
    ArrayList<ItemData> list;
    LayoutInflater inflater;

    public SpinnerAdapter(Activity context,int id,ArrayList<com.example.spinner.ItemData> list){
        super(context,id,list);
        this.list=list;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public View getView(int position, View convertView , ViewGroup parent){
        View itemView = inflater.inflate(R.layout.spinner_row,parent,false);
        ImageView imageView = (ImageView)itemView.findViewById(R.id.imageView);
        TextView txtName = itemView.findViewById(R.id.txtName);
        TextView txtDetails = itemView.findViewById(R.id.txtDetails);
        com.example.spinner.ItemData rowd = list.get(position);
        txtName.setText(rowd.name);
        txtDetails.setText(rowd.Details);
        imageView.setImageResource(rowd.image);
        return itemView;

    }
    public View getDropDownView(int position,View convertView,ViewGroup parent){
        return getView(position,convertView,parent);
    }

}

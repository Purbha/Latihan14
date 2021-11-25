package com.ims_hr.latihan14;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter_List extends ArrayAdapter<Adapter_Array> {

    Context Ctx;
    private int ResID;
    List<Adapter_Array> Data;

    public Adapter_List(@NonNull Context context, @LayoutRes int resource, @NonNull List<Adapter_Array> objects) {
        super(context, resource, objects);
        this.Ctx = context;
        this.ResID = resource;
        this.Data = objects;
    }

    static class DataHolder{
        TextView TV_Val, TV_Header, TV_Desc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataHolder Holder;
        if(convertView == null){
            LayoutInflater inflater = ((Activity) Ctx).getLayoutInflater();
            convertView = inflater.inflate(ResID,parent,false);
            Holder = new DataHolder();
            Holder.TV_Val = convertView.findViewById(R.id.textView_List_Val);
            Holder.TV_Header = convertView.findViewById(R.id.textView_List_Header);
            Holder.TV_Desc = convertView.findViewById(R.id.textView_List_Desc);
            convertView.setTag(Holder);
        } else {
            Holder = (DataHolder)convertView.getTag();
        }
        Adapter_Array dataItem = Data.get(position);
        Holder.TV_Val.setText(dataItem.Val);
        Holder.TV_Header.setText(dataItem.Header);
        Holder.TV_Desc.setText(dataItem.Desc);
        return convertView;
    }

}

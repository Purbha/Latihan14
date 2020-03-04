package com.ims_hr.latihan14;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter_List extends ArrayAdapter<Adapter_Array> {

    Context Ctx;
    private int ResID;
    List<Adapter_Array> Data = null;

    public Adapter_List(@NonNull Context context, @LayoutRes int resource, @NonNull List<Adapter_Array> objects) {
        super(context, resource, objects);
        this.Ctx = context;
        this.ResID = resource;
        this.Data = objects;
    }

    static class DataHolder{
        TextView TV_Val;
        TextView TV_Header;
        TextView TV_Desc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataHolder Holder = null;
        if(convertView == null){
            LayoutInflater inflater = ((Activity) Ctx).getLayoutInflater();
            convertView = inflater.inflate(ResID,parent,false);
            Holder = new DataHolder();
            Holder.TV_Val = (TextView)convertView.findViewById(R.id.textView_List_Val);
            Holder.TV_Header = (TextView)convertView.findViewById(R.id.textView_List_Header);
            Holder.TV_Desc = (TextView)convertView.findViewById(R.id.textView_List_Desc);
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

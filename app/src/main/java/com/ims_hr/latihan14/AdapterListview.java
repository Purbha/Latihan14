package com.ims_hr.latihan14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterListview extends BaseAdapter {

    Context context;
    private int ResID;
    List<ArrayModel> Data;

    public AdapterListview(Context context, int resID, List<ArrayModel> data) {
        this.context = context;
        ResID = resID;
        Data = data;
    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public ArrayModel getItem(int i) {
        return Data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View barisData;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        barisData = inflater.inflate(ResID,viewGroup,false);
        TextView TV_Val = barisData.findViewById(R.id.textView_List_Val);
        TextView TV_Header = barisData.findViewById(R.id.textView_List_Header);
        TextView TV_Desc = barisData.findViewById(R.id.textView_List_Desc);
        ArrayModel arrayModel = this.getItem(i);
        TV_Val.setText(arrayModel.Val);
        TV_Header.setText(arrayModel.Header);
        TV_Desc.setText(arrayModel.Desc);
        return barisData;
    }

}

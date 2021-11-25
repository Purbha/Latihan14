package com.ims_hr.latihan14;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView LV_Data;
    List<Adapter_Array> ListData;
    Adapter_List adapter_list;
    public static final String IDHERO = "idhero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Set_Object();
        Listen_LV_Data();
    }

    private void Inisial() {
        LV_Data = findViewById(R.id.ListView_Data);

    }

    private void Set_Object() {
        ListData = new ArrayList<>();
        ListData.add(new Adapter_Array("EARTHSHAKER","Melee - Support - Initiator - Disabler - Nuker","1"));
        ListData.add(new Adapter_Array("ANTI-MAGE","Melee - Carry - Escape - Nuker","2"));
        adapter_list = new Adapter_List(MainActivity.this,R.layout.template_list,ListData);
        LV_Data.setAdapter(adapter_list);
    }

    private void Listen_LV_Data() {
        LV_Data.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra(IDHERO,ListData.get(position).Val);
            startActivity(intent);
        });
    }

}

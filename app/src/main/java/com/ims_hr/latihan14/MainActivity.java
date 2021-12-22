package com.ims_hr.latihan14;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView LV_Data;
    List<ArrayModel> ListData;
    Adapter_List adapter_list;
    AdapterListview adapterListview;
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
        ListData.add(new ArrayModel("ABADDON","SHIELDS HIS ALLIES OR HIMSELF FROM ATTACKS","1"));
        ListData.add(new ArrayModel("ALCHEMIST","EARNS EXTRA GOLD FROM UNIT KILLS AND BOUNTY RUNES","2"));
        ListData.add(new ArrayModel("ANCIENT APPARITION","LAUNCHES A POWERFUL ICY BLAST FROM ANYWHERE ON THE MAP","3"));
        ListData.add(new ArrayModel("ANTI-MAGE","SLASHES HIS FOES WITH MANA-DRAINING ATTACKS","4"));
        ListData.add(new ArrayModel("ARC WARDEN","CREATES A COPY OF HIMSELF TO SPLIT PUSH","5"));
        ListData.add(new ArrayModel("AXE","TAUNTS AND FORCES ENEMIES TO ATTACK HIM","6"));
        ListData.add(new ArrayModel("BANE","PUTS HIS ENEMIES TO SLEEP, INCAPACITATING THEM","7"));
        ListData.add(new ArrayModel("BATRIDER","CAN LASSO AN ENEMY AWAY FROM HIS TEAM","8"));
        ListData.add(new ArrayModel("BEASTMASTER","SUMMONS BEASTS TO AID HIS HUNT","9"));
        ListData.add(new ArrayModel("BLOODSEEKER","CHASES DOWN LOW HEALTH ENEMIES WITH INCREASED SPEED","10"));
        //adapter_list = new Adapter_List(MainActivity.this, R.layout.template_list, ListData);
        //LV_Data.setAdapter(adapter_list);
        adapterListview = new AdapterListview(MainActivity.this,R.layout.template_list,ListData);
        LV_Data.setAdapter(adapterListview);
    }

    private void Listen_LV_Data() {
        LV_Data.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra(IDHERO,ListData.get(position).Val);
            startActivity(intent);
        });
    }

}

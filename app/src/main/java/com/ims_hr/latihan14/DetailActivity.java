package com.ims_hr.latihan14;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView TV_Header, TV_Desc, TV_Bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Inisial();
        Set_Object();
    }

    private void Inisial() {
        TV_Header = findViewById(R.id.textView_Detail_Header);
        TV_Desc = findViewById(R.id.textView_Detail_Desc);
        TV_Bio = findViewById(R.id.textView_Detail_Bio);
    }

    private void Set_Object() {
        Intent intent = getIntent();
        String IDHero = intent.getStringExtra(MainActivity.IDHERO);
        if(IDHero.equals("1")) {
            TV_Header.setText("EARTHSHAKER");
            TV_Desc.setText("Melee - Support - Initiator - Disabler - Nuker");
            TV_Bio.setText("Like a golem or gargoyle, Earthshaker was one with the earth but now" +
                    " walks freely upon it. Unlike those other entities, he created himself through" +
                    " an act of will, and serves no other master. In restless slumbers," +
                    " encased in a deep seam of stone, he became aware of the life drifting freely" +
                    " above him.");
        }
        if(IDHero.equals("2")) {
            TV_Header.setText("ANTI-MAGE");
            TV_Desc.setText("Melee - Carry - Escape - Nuker");
            TV_Bio.setText("The monks of Turstarkuri watched the rugged valleys below their" +
                    " mountain monastery as wave after wave of invaders swept through the lower" +
                    " kingdoms. Ascetic and pragmatic, in their remote monastic eyrie they remained" +
                    " aloof from mundane strife, wrapped in meditation that knew no gods or" +
                    " elements of magic.");
        }
    }

}

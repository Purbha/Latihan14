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
            TV_Header.setText("ABADDON");
            TV_Desc.setText("SHIELDS HIS ALLIES OR HIMSELF FROM ATTACKS");
            TV_Bio.setText("Able to transform enemy attacks into self-healing, Abaddon can survive almost any assault. Shielding allies and launching his double-edged coil at a friend or foe, he is always ready to ride into the thick of battle.");
        }
        if(IDHero.equals("2")) {
            TV_Header.setText("ALCHEMIST");
            TV_Desc.setText("EARNS EXTRA GOLD FROM UNIT KILLS AND BOUNTY RUNES");
            TV_Bio.setText("Synthesizing extra resources from each and every kill, Alchemist has no trouble gathering the tools needed to destroy his foes. Ambushing enemies with corrosive acid and a host of unstable chemicals, he battles to ensure his greedy escapades can remain uninterrupted.");
        }
        if(IDHero.equals("3")) {
            TV_Header.setText("ANCIENT APPARITION");
            TV_Desc.setText("LAUNCHES A POWERFUL ICY BLAST FROM ANYWHERE ON THE MAP");
            TV_Bio.setText("Able to launch a powerful blast of damaging ice across the battlefield, Ancient Apparition threatens to shatter weakened enemies wherever they are. Slowing enemies as he enhances his allies' effectiveness in battle, he is a constant threat to his foes.");
        }
        if(IDHero.equals("4")) {
            TV_Header.setText("ANTI-MAGE");
            TV_Desc.setText("SLASHES HIS FOES WITH MANA-DRAINING ATTACKS");
            TV_Bio.setText("Should Anti-Mage have the opportunity to gather his full strength, few can stop his assaults. Draining mana from enemies with every strike or teleporting short distances to escape an ambush, cornering him is a challenge for any foe.");
        }
        if(IDHero.equals("5")) {
            TV_Header.setText("ARC WARDEN");
            TV_Desc.setText("CREATES A COPY OF HIMSELF TO SPLIT PUSH");
            TV_Bio.setText("A splintered fragment of the same primordial power as the Ancients themselves, Zet the Arc Warden has pledged to see the clash between Radiant and Dire finally end. Assault lone enemies with fluxing energy, or distort space to generate a protective field around allies. Summon a Spark Wraith to patrol an area for enemies to infuse with harmful magic, then create a double of Zet, items and all, to overwhelm your foes.");
        }
        if(IDHero.equals("6")) {
            TV_Header.setText("AXE");
            TV_Desc.setText("TAUNTS AND FORCES ENEMIES TO ATTACK HIM");
            TV_Bio.setText("One after another, Axe cuts down his foes. Marching ahead of his team, he locks his enemies in battle then counters their blows with a deadly spin of his weapon. Slamming his culling blade through a weakened enemy, he is always charging onward.");
        }
        if(IDHero.equals("7")) {
            TV_Header.setText("BANE");
            TV_Desc.setText("PUTS HIS ENEMIES TO SLEEP, INCAPACITATING THEM");
            TV_Bio.setText("Bane brings terror to his enemies with his arsenal of disabling abilities. Whether trapping a foe within a contagious nightmare, or gripping an enemy in place, he gives allies all the time they need to slay their enemy.");
        }
        if(IDHero.equals("8")) {
            TV_Header.setText("BATRIDER");
            TV_Desc.setText("CAN LASSO AN ENEMY AWAY FROM HIS TEAM");
            TV_Bio.setText("Once he takes to the skies, Batrider can strike from any direction. Snatching a foe with his lasso, he soars above the treetops, pulling his prey through a trail of flame as he drags them before his merciless allies.");
        }
        if(IDHero.equals("9")) {
            TV_Header.setText("BEASTMASTER");
            TV_Desc.setText("SUMMONS BEASTS TO AID HIS HUNT");
            TV_Bio.setText("Summoning a poison-spitting boar and a scouting hawk to aid his hunt, Beastmaster never stalks the battlefield unprepared. Chopping through the forest with his axes, his stunning roar opens the way for his allies to devastate enemies.");
        }
        if(IDHero.equals("10")) {
            TV_Header.setText("BLOODSEEKER");
            TV_Desc.setText("CHASES DOWN LOW HEALTH ENEMIES WITH INCREASED SPEED");
            TV_Bio.setText("Bloodseeker forces difficult decisions on his enemies. Able to drive his foes to a retreat by bathing a large area with a damaging ritual, his gruesome ultimate asks his opponents to hold still, or die.");
        }
    }

}

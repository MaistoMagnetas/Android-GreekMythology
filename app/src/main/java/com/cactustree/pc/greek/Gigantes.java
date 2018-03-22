package com.cactustree.pc.greek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Gigantes extends AppCompatActivity {

    GridView gridViewGigantes;

    /*    <!--Gigantes-->
        <!--Alcyoneus :: Antaeus :: Enceladus :: Mimas :: Polybotes :: Porphyrion-->*/
    int gigantes[] = {R.string.gigantes_alcyoneus, R.string.gigantes_antaeus, R.string.gigantes_enceladus,
            R.string.gigantes_mimas, R.string.gigantes_polybotes, R.string.gigantes_porhpyrion,};

    int gigantesIcons[] = {R.drawable.gigantes_alcyo, R.drawable.gigantes_amtaeus, R.drawable.gigantes,
            R.drawable.gigantes_mimas, R.drawable.gigantes_polybotes, R.drawable.gigantes_porphyrion};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gigantes);

        gridViewGigantes = (GridView) findViewById(R.id.gridview_gigantes);
        CustomAdapter adapter = new CustomAdapter(this, gigantes, gigantesIcons);
        gridViewGigantes.setAdapter(adapter);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewGigantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeGigantesActivity(gigantes[position], gigantesIcons[position], alcyoneys());
                        break;
                    case 1:
                        makeGigantesActivity(gigantes[position], gigantesIcons[position], antaeus());
                        break;
                    case 2:
                        makeGigantesActivity(gigantes[position], gigantesIcons[position], enceladus());
                        break;
                    case 3:
                        makeGigantesActivity(gigantes[position], gigantesIcons[position], mimas());
                        break;
                    case 4:
                        makeGigantesActivity(gigantes[position], gigantesIcons[position], polybotes());
                        break;
                    case 5:
                        makeGigantesActivity(gigantes[position], gigantesIcons[position], porphyrion());
                        break;
                    default:
                        Toast.makeText(Gigantes.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void makeGigantesActivity(int title, int image, String description) {
        Intent intent = new Intent(Gigantes.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String alcyoneys() {
        String alcyoneysDesc = "In Greek mythology, Alcyoneus was the antagonist of the hero Heracles. He was considered to be one of the Gigantes, the children of the Titans Uranus and Gaea. In the Gigantomachy, the war that happened between the Giants and the Olympians, Heracles and Alcyoneus fought each other. However, Alcyoneus was immortal while stepping on his native land and would revive if anyone would try to kill him. So, when Heracles hit him with an arrow and Alcyoneus was about to stand up again, Athena advised Heracles to drag him out of his homeland; that was how Alcyoneus died. Alcyoneus had seven daughters called Alkyonides, who threw themselves into the sea after their father died.";
        return alcyoneysDesc;
    }

    private String antaeus() {
        String antaeusDesc = "Antaeus was the son of the gods Poseidon and Gaea, one of the Gigantes, in Greek mythology. He drew strength from his mother, earth, and was invincible while he was in contact with her; he challenged people who passed by his area to wrestling matches, in which he always won, and killed them in the end. He then used their skulls to build a temple honouring his father. He challenged the demigod hero Heracles, who was on his way to complete the eleventh of the famous Labours of Heracles, being to steal the golden apples from the Garden of Hesperides. The hero realised that Antaeus tapped his power from earth, so he locked him in a bearhug in such a way as to be unable to touch the ground, and then crushed him.";
        return antaeusDesc;
    }

    private String enceladus() {
        String enceladusDesc = "Enceladus was one of the Gigantes, the Giants, in Greek mythology, son of Gaea and Uranus. All the Giants were born when Cronus, son of Uranus, castrated his father and the blood fell onto the earth (Gaea).\n" +
                "\n" +
                "During the Gigantomachy, the great battle between the Giants and the Olympian gods, Enceladus was the primary adversary of goddess Athena, who threw the island of Sicily against the fleeing Giant and buried him under it. Another source, however, mentions that it was Zeus that hurled a thunderbolt against Enceladus and killed him. Many sources claim that Enceladus was buried under Mount Etna, although others thought it was the monster Typhon or Briareus, one of the Hekatonheires, that was buried there. In any case, Enceladus was considered to be the main cause of earthquakes and volcanic eruptions, and when Mount Etna erupted, it was considered to be Enceladus' breath." ;
        return enceladusDesc;
    }

    private String mimas() {
        String mimasDsec = "Mimas was one of the Gigantes in Greek mythology, one of the sons of the Titans Uranus and Gaea which sprang out of the soil when Uranus was castrated by his son Cronus and the blood fell on the earth. He participated in the Gigantomachy, the battle that occured between the Gigantes and the Olympians, and he was the main opposition of the god Hephaestus; he was killed by him with missiles of red hot metal. Another account says that he was killed by Zeus, hurling a thunderbolt against him and turning him to ash. He was buried off the coast of Naples, under the island of Prochyte, one of the Phlegraean Islands.";
        return mimasDsec;
    }

    private String polybotes() {
        String polybotesDesc = "Polybotes was one of the Gigantes in Greek mythology, the children of the Titans Uranus and Gaea. The Gigantes emerged from the earth (Gaea) when Uranus was castrated by his son Cronus and his blood fell onto the soil. During the Gigantomachy, the great battle that happened between the Olympian gods and the Gigantes, he fought against Poseidon, and he was eventually crushed under Nisyros, a part of the island of Kos that Poseidon broke off and threw against him." ;
        return polybotesDesc;
    }

    private String porphyrion() {
        String porphyrionDesc = "Porphyrion was one of the Gigantes in Greek mythology, the sons of the Titans Uranus and Gaea that sprang out when Uranus was castrated by his son Cronus and the blood fell on the earth. He was considered the mightiest of all the Gigantes. During the Gigantomachy, the battle that took place between the Gigantes and the Olympian Gods, Porphyrion stood against Heracles and Hera. During their fight, Zeus put a spell on Porphyrion, making him fall in love with Hera, whom he tried to rape. At that point, Zeus threw a thunderbolt against him, while Heracles provided the finishing blow with an arrow.";
        return porphyrionDesc;
    }
}

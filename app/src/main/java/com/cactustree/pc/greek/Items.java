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

public class Items extends AppCompatActivity {

    GridView gridViewItems;
    //<!--Aegis :: Ambrosia :: Golden Fleece :: Ichor :: Necklace of Harmonia :: Nectar ::
    //Shield of Achilles :: Shirt of Nessus-->
    int items[] = {R.string.items_aegis,R.string.items_ambrosia,R.string.items_golden_fleece,
    R.string.items_inchor,R.string.items_neclase_of_harmonia,R.string.items_nectar,
    R.string.items_shield_achilles,R.string.items_nessus};

    int itemsIcons[] = {R.drawable.items_aegis,R.drawable.items_ambrosia,R.drawable.items_golden_fleece,
            R.drawable.items_ichor,R.drawable.items_neclaseharmonia,R.drawable.items_nectar,
            R.drawable.items_shieldofachiles,R.drawable.items_nessus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewItems = (GridView) findViewById(R.id.gridview_items);
        CustomAdapter adapter = new CustomAdapter(this,items,itemsIcons);
        gridViewItems.setAdapter(adapter);

        gridViewItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeItemsActivity(items[position], itemsIcons[position], aegis());
                        break;
                    case 1:
                        makeItemsActivity(items[position], itemsIcons[position], ambrosia());
                        break;
                    case 2:
                        makeItemsActivity(items[position], itemsIcons[position], goldenFleece());
                        break;
                    case 3:
                        makeItemsActivity(items[position], itemsIcons[position], ichor());
                        break;
                    case 4:
                        makeItemsActivity(items[position], itemsIcons[position], necklaceHarmonia());
                        break;
                    case 5:
                        makeItemsActivity(items[position], itemsIcons[position], nectar());
                        break;
                    case 6:
                        makeItemsActivity(items[position], itemsIcons[position], shieldofAchilles());
                        break;
                    case 7:
                        makeItemsActivity(items[position], itemsIcons[position], shirtofNessus());
                        break;
                    default:
                        Toast.makeText(Items.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void makeItemsActivity(int title, int image, String description) {
        Intent intent = new Intent(Items.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String aegis() {
        String aegisDesc = "The aegis is a shield carried primarily by Zeus in Greek mythology, which he sometimes lent to Athena. According to other sources, it was not a shield but rather an animal skin worn over the garments of the gods as extra protection. It bore the head of a Gorgon and made a terrible roaring sound during the battle. The aegis was forged by the Cyclopes in Hephaestus’ forge, and had golden serpent-like scales and a Gorgon’s head rolling its eyes. In some texts, it was mentioned that when Zeus would shake the aegis, clouds would cover Mount Ida and men would hide in fear.\n" +
                "\n" +
                "In Greek, the word aegis has various meanings, including a violent windstorm, a divine shield, and a goatskin garment." ;
        return aegisDesc;
    }

    private String ambrosia() {
        String ambrosiaDesc = "In Greek mythology, ambrosia was considered the food or drink of the Olympian gods, and it was thought to bring long life and immortality to anyone who consumed it. It was often linked to nectar, the other element that the gods consumed; usually, it was thought that ambrosia was the food and nectar was the drink of the gods. In general, ambrosia was only consumed by deities; when Heracles achieved immortality, Athena offered him ambrosia; while when Tantalus tried to steal some to give to other mortals, he was punished for committing hubris. Whoever consumed ambrosia no longer had blood in their veins, but another substance called ichor.\n" +
                "\n" +
                "One of the myths about Achilles’ immortality has it that his mother Thetis anointed him with ambrosia when he was born and then passed him through flames, so that the mortal elements of his body would be consumed. However, Peleus, his father, found out and stopped her; this caused Thetis’ rage and left without managing to immortalise Achilles’ heel. As a result, that was the only vulnerable spot in his body." ;
        return ambrosiaDesc;
    }
    private String goldenFleece() {
        String goldenFleeceDesc = "The Golden Fleece was the fleece of the golden ram that was held in Colchis, and the object of desire for Jason, who organised an expedition with the Argonauts in order to retrieve it.\n" +
                "\n" +
                "The myth has it that Athamas, king of the city of Orchomenos, married the goddess Nephele, with whom he had two children, Phrixus and Helle. Later, he took Ino as his second wife, who hated her stepchildren and plotted to kill them. She would have succeeded, but at the last second, Nephele sent a flying golden ram to save her children from their stepmother. She then told her children not to look down while the ram was flying. However, Helle looked down, felt dizzy and fell into the part of the sea that took her name, Hellespont. The ram and Phrixus eventually reached Colchis, where the boy was warmly welcomed by the king, Aeetes. Phrixus gave the golden fleece of the ram as a gift to the king, grateful for his hospitality. Aeetes placed the golden fleece in a garden which was guarded by a never sleeping dragon. Jason later arrived in Colchis, and after successfully completing the three tasks that Aeetes had given to him, he retrieved the golden fleece." ;
        return goldenFleeceDesc;
    }
    private String ichor() {
        String ichorDesc = "Ichor was the golden fluid that flowed in the veins of gods and immortals, in Greek mythology. It was also believed that it was toxic to mortals, killing them instantly. Ichor also ran through the single vein that Talos had, a giant bronze man with wings that was seen in Ancient Crete. He was responsible for guarding Europa and hurled rocks against anyone who came close. He died when the Argonauts went to Crete after they had retrieved the Golden Fleece; Medea removed the nail that controlled the flow of ichor, which drained from Talos and killed him.";
        return ichorDesc;
    }
    private String necklaceHarmonia() {
        String necklaceHarmoniaDesc = "The Necklace of Harmonia was a magical object in Greek mythology that brought ill fortune to anyone who possessed it. It was created by the blacksmith god Hephaestus.\n" +
                "\n" +
                "When Hephaestus found out that his wife Aphrodite, goddess of love, had an affair with Ares, god of war, he became enraged and developed a scheme with which he managed to ridicule both of them to the rest of the Olympian gods. He also said that any child that would be produced by this union would be cursed. Aphrodite had a daughter, whom she named Harmonia. This daughter later became the wife of the legendary founder of the city of Thebes, Cadmus. As soon as Hephaestus found out about the marriage, he went to Harmonia and offered her the necklace as a gift. He had previously cursed the necklace to bring misfortune to anyone who wore or possessed it; at the same time, though, the necklace was able to bring eternal youth and beauty to its bearer. According to the myths, the necklace was made of gold and jewels, and had the shape of two serpents forming a clasp with their open mouths.\n" +
                "\n" +
                "Harmonia and her husband were eventually turned into serpents, and the necklace was inherited by their daughter, Semele. It also brought her demise, as the day she wore it, she was visited by a disguised Hera and was tricked into asking her lover, who was Zeus in disguise, to reveal himself; Zeus was forced to comply causing her instant death. The necklace later fell into the hands of Queen Jocasta, who remained young and beautiful thanks to it. She unknowingly married her son Oedipus, and when the truth was revealed, she killed herself, while Oedipus tore his eyes out. Polynices inherited the necklace and gifted it to Eriphyle, eventually leading to her demise as well. It then went into Arsinoe's hands, before finally reaching the hands of Amphoterus and Acarnan. They both decided to offer the necklace to the Temple of Athena in Delphi, in order to stop any further misfortunes. The necklace was stolen, however, by the tyrant Phayllus, who offered it to his lover; however, her son fell into madness, set fire to the house, killing everyone in there. This is the last story linked to the Necklace of Harmonia." ;
        return necklaceHarmoniaDesc;
    }
    private String nectar() {
        String nectarDesc = "Nectar was called the divine drink that the Olympian gods had. It had the magical property to confer immortality on any mortal who had the luck to drink it. It was closely related to ambrosia, which was considered the food of the gods, although sometimes it was also thought to be a drink. It was a grave offense to steal either nectar or ambrosia. Tantalus tried to steal ambrosia from the gods, and this condemned him to an afterlife in the Underworld where he was eternally punished to suffer of hunger and thirst; he was forced to stand in a river, but any time he would try to drink water, the waters would recede. Similarly, when he tried to reach the branches with fruit that were above him, they would also move further away from him." ;
        return nectarDesc;
    }
    private String shieldofAchilles() {
        String shieldofAchillesDesc = "The Shield of Achilles is the shield that the Greek hero used during his duel against Hector, prince of Troy, towards the end of the Trojan War.\n" +
                "\n" +
                "Achilles had given his armour to his friend Patroclus, who died in the battle and the armour was taken by the Trojans. Achilles' mother, the goddess Thetis, asked Hephaestus to forge a new armour to provide her son. The shield was described in detail by Homer in his epic Iliad, and it was said to depict a number of things in concentric circles." ;
        return shieldofAchillesDesc;
    }
    private String shirtofNessus() {
        String shirtofNessusDesc = "The Shirt of Nessus was the poisoned shirt that led to the death of the Greek demigod Heracles. When Heracles and his wife Deianeira tried to cross a river, the centaur Nessus offered to help. However, when Heracles was on the opposite riverbank, Nessus tried to rape Deianeira. The demigod shot an arrow that had been dipped in the poisonous blood of the Lernaean Hydra, and killed Nessus. Just before he died, though, Nessus told Deianeira to take his shirt, which was covered in the now tainted blood of the centaur; she was told to use his blood to make sure that her husband would forever be faithful to her. Deianeira naively believed the centaur and took his blood-covered shirt.\n" +
                "\n" +
                "Years later, when Heracles fell in love with Ino, Deianeira felt jealous and threatened; so, she gave Heracles the shirt of Nessus. As soon as the hero wore it, he started feeling unbearable pain, as his body started burning. He eventually threw himself into a funeral pyre, and died." ;
        return shirtofNessusDesc;
    }
}

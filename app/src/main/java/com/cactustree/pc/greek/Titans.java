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

public class Titans extends AppCompatActivity {

    GridView gridViewTitans;


//    <!--Titans-->
//    <!--Asteria :: Astraeus :: Atlas :: Clymene :: Coeus :: Crius :: Cronus :: Dione :: Eos :: Epimetheus :: Eurybia ::
//    Eurynome :: Hyperion :: Iapetus :: Lelantos :: Menoetius :: Metis :: Mnemosyne :: Oceanus :: Ophion :: Pallas :: Perses ::
//    Phoebe :: Prometheus :: Rhea :: Selene :: Styx :: Tethys :: Thea :: Themis-->
    int titans[] = {R.string.titans_asteria,R.string.titans_astraeus,R.string.titans_atlas,R.string.titans_clumene,
    R.string.titans_coeus,R.string.titans_crius,R.string.titans_cronus,R.string.titans_dione,R.string.titans_eos,
    R.string.titans_epimetheus,R.string.titans_eurybia,R.string.titans_eurynome,R.string.titans_hyperion,
    R.string.titans_iapetus,R.string.titans_lelantos,R.string.titans_menotius,R.string.titans_metis,
    R.string.titans_mnemosyne,R.string.titans_oceanus,R.string.titans_ophion,R.string.titans_pallas,
    R.string.titans_perses,R.string.titans_phoebe,R.string.titans_prometheus,R.string.titans_rhea,
    R.string.titans_selene,R.string.titans_styx,R.string.titans_tethys,R.string.titans_thea,
    R.string.titans_themis};

    int titansIcons[] = {R.drawable.titans_asteria,R.drawable.titans_astraeus,R.drawable.titans,R.drawable.titans_clumene,
        R.drawable.titans_coeus,R.drawable.titans_crius,R.drawable.titans_cronus,R.drawable.titans_dione,R.drawable.titans_eos,
        R.drawable.titans_epimetheus,R.drawable.titans_eurybia,R.drawable.titans_eurynome,R.drawable.titans_hyperion,
        R.drawable.titans_iapetus,R.drawable.titans_lelantos,R.drawable.titans_menotius,R.drawable.titans_metis,
        R.drawable.titans_mnemosyne,R.drawable.titans_oceanus,R.drawable.titans_ophion,R.drawable.titans_pallas,
        R.drawable.titans_perseus,R.drawable.titans_phoebe,R.drawable.titans_prometheus,R.drawable.titans_rhea,
        R.drawable.titans_selene,R.drawable.titans_styx,R.drawable.titans_tethys,R.drawable.titans_thea,
        R.drawable.titans_themis};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titans);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewTitans = (GridView) findViewById(R.id.gridview_titans);
        CustomAdapter adapter = new CustomAdapter(this,titans,titansIcons);
        gridViewTitans.setAdapter(adapter);

        gridViewTitans.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeTitansActivity(titans[position], titansIcons[position], asteria());
                        break;
                    case 1:
                        makeTitansActivity(titans[position], titansIcons[position], astraeus());
                        break;
                    case 2:
                        makeTitansActivity(titans[position], titansIcons[position], atlas());
                        break;
                    case 3:
                        makeTitansActivity(titans[position], titansIcons[position], clymene());
                        break;
                    case 4:
                        makeTitansActivity(titans[position], titansIcons[position], coeus());
                        break;
                    case 5:
                        makeTitansActivity(titans[position], titansIcons[position], crius());
                        break;
                    case 6:
                        makeTitansActivity(titans[position], titansIcons[position], cronus());
                        break;
                    case 7:
                        makeTitansActivity(titans[position], titansIcons[position], dione());
                        break;
                    case 8:
                        makeTitansActivity(titans[position], titansIcons[position], eos());
                        break;
                    case 9:
                        makeTitansActivity(titans[position], titansIcons[position], epimetheus());
                        break;
                    case 10:
                        makeTitansActivity(titans[position], titansIcons[position], eurybia());
                        break;
                    case 11:
                        makeTitansActivity(titans[position], titansIcons[position], eurynome());
                        break;
                    case 12:
                        makeTitansActivity(titans[position], titansIcons[position], hyperion());
                        break;
                    case 13:
                        makeTitansActivity(titans[position], titansIcons[position], iapetus());
                        break;
                    case 14:
                        makeTitansActivity(titans[position], titansIcons[position], lelantos());
                        break;
                    case 15:
                        makeTitansActivity(titans[position], titansIcons[position], menotius());
                        break;
                    case 16:
                        makeTitansActivity(titans[position], titansIcons[position], metis());
                        break;
                    case 17:
                        makeTitansActivity(titans[position], titansIcons[position], mnemosyne());
                        break;
                    case 18:
                        makeTitansActivity(titans[position], titansIcons[position], oceanus());
                        break;
                    case 19:
                        makeTitansActivity(titans[position], titansIcons[position], ophion());
                        break;
                    case 20:
                        makeTitansActivity(titans[position], titansIcons[position], pallas());
                        break;
                    case 21:
                        makeTitansActivity(titans[position], titansIcons[position], perses());
                        break;
                    case 22:
                        makeTitansActivity(titans[position], titansIcons[position], phoebe());
                        break;
                    case 23:
                        makeTitansActivity(titans[position], titansIcons[position], prometheus());
                        break;
                    case 24:
                        makeTitansActivity(titans[position], titansIcons[position], rhea());
                        break;
                    case 25:
                        makeTitansActivity(titans[position], titansIcons[position], selene());
                        break;
                    case 26:
                        makeTitansActivity(titans[position], titansIcons[position], styx());
                        break;
                    case 27:
                        makeTitansActivity(titans[position], titansIcons[position], tethys());
                        break;
                    case 28:
                        makeTitansActivity(titans[position], titansIcons[position], thea());
                        break;
                    case 29:
                        makeTitansActivity(titans[position], titansIcons[position], themis());
                        break;
                    default:
                        Toast.makeText(Titans.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });//
//     Iapetus :: Lelantos :: Menoetius :: Metis :: Mnemosyne :: Oceanus :: Ophion :: Pallas :: Perses ::
//    Phoebe :: Prometheus :: Rhea :: Selene :: Styx :: Tethys :: Thea :: Themis-->


    }

    public void makeTitansActivity(int title, int image, String description) {
        Intent intent = new Intent(Titans.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String asteria() {
       String asteriaDesc = "Asteria was a name given to a number of different beings in Greek mythology. As a deity, however, the name refers to a Titan goddess, daughter of the Titans Coeus and Phoebe and sister of Leto. She was married to the Titan Perses, and had a daughter, Hecate. Asteria was the goddess of nocturnal oracles and shooting stars. Zeus pursued her, but Asteria instead turned into a quail and fell into the Aegean to escape. As a result, she transformed into Ortygia, the quail island, which was later linked to the island of Delos.";
        return asteriaDesc;
    }

    private String astraeus() {
        String asteriaDesc = "Astraeus was a Titan god in Greek mythology, son of the Titans Crius and Eurybia. He was the god of the dusk and the winds. Astraeus was married to Eos, goddess of the dawn, and created numerous children, including the four Anemoi (winds) and the five Astra Planeta (wandering stars or planets).";
        return asteriaDesc;
    }

    private String atlas() {
        String asteriaDesc = "Atlas was one of the Titans, son of Iapetus and Clymene, and brother of Prometheus, Epimetheus and Menoetius. During the Titanomachy, the War between the Titans and the Olympian gods, Atlas and his brother Menoetius sided with the Titans, while Prometheus and Epimetheus helped the Olympian gods. Atlas was the leader in the batttle; however, being on the losing side, Zeus condemned him to eternally stand on the western side of Gaea (the earth) holding Uranus (the sky) on his shoulders. Therefore, the contemporary depiction of Atlas holding the Earth on his shoulders is a misconception.\n" +
                "\n" +
                "He was the Titan god of astronomy and navigation and he was married to his sister, Phoebe. He had numerous children, including the Hesperides, the Hyades, Hyas, the Pleiades, Calypso, Dione and Maera. He was associated with the Atlas mountains in northwest Africa. According to a later myth, when Perseus went to that region, a giant named Atlas tried to drive him away. So, Perseus revealed Medusa's head, whom he had already killed, thus turning Atlas into stone (the Atlas mountains themselves).\n" +
                "\n" +
                "In the myth of the Twelve Labours of Heracles, the demigod was sent to bring the golden apples from Hera's garden, tended by the Hesperides and guarded by the dragon Ladon. Heracles asked Atlas to bring the apples to him; during that time, he would replace him in holding up the sky. Atlas went and brought the apples to Heracles; he then attempted to trick him into holding the skies forever. However, Heracles managed to evade the trick and left with the apples.";
        return asteriaDesc;
    }

    private String clymene() {
        String asteriaDesc = "Clymene was a Titan goddess in Greek mythology, daughter of the Titans Oceanus and Tethys, thus making her an Oceanid. She was the goddess of renown, fame, and infamy. She was married to the Titan Iapetus, and they had four sons, Atlas, Epimetheus, Prometheus and Menoetius. She was also a consort of Helios, with whom she had a son, Phaeton, and the Heliades.\n" +
                "\n" +
                "There were many other figures with the same name in Greek mythology. One Clymene was a servant of the famous Helen of Troy, daughter of Hippalces and Aethra and half-sister of Theseus. Another Clymene was the daughter of Catreus, and along with her sister Aerope, she was sold away out of her father's fear that he would be killed by his children. This Clymene was later married to Nauplius, with whom she had three sons, Palameded, Oeax and Nausimedon.";
        return asteriaDesc;
    }

    private String coeus() {
        String asteriaDesc = "Coeus was one of the Titans, son of Uranus and Gaia. His name means questioning, while the respective Roman deity was Polus, the celestial axis around which the heavens revolve. Based on his Greek name, it has been suggested that Coeus may have also been the Titan of inquisitive minds and intellect.\n" +
                "\n" +
                "Coeus also represented one of the four pillars that hold the heavens and the earth apart. He was the pillar of the north, while the other three pillars were personified by his brothers Hyperion, Iapetus and Crius. The four brothers played an important role in dethroning their father, Uranus; as they were located in the four corners of the earth, they held Uranus in place, while their brother Cronus castrated him with the diamond sickle that their mother Gaea had given him.\n" +
                "\n" +
                "Although Coeus does not have an active role in Ancient Greek religion, he was important through his children, Leto and Asteria, whom he had with his wife and sister, Phoebe. Leto was one of Zeus' lovers and gave birth to the twin Olympians, Artemis and Apollo.\n" +
                "\n" +
                "During the Titanomachy, Coeus tried to stop Zeus and the other Olympians; failing, he and the rest of the Titans were banished to the Underworld. Trying to escape, Coeus broke his chains but was forced to stay by Cerberus, the guardian of the underworld.";
        return asteriaDesc;
    }

    private String crius() {
        String asteriaDesc = "Crius was one of the Titans, son of Uranus and Gaea. He married Eurybia, daughter of Pontus and Gaea, and had three children, Astraios, Pallas and Perses. His grandchildren were:\n" +
                "\n" +
                "From the marriage of Astraios (god of dusk) and Eos (goddess of dawn): the four Anemoi (Winds - Boreas, Notus, Eurus, Zephyrus), and the five Astra Planeta (Wandering Stars, meaning planets - Phainon, Phaethon, Puroeis, Eosphoros, Stilbon).\n" +
                "From the marriage of Pallas (god of warcraft) and Styx (goddess of the homonymous river): Zelus (glory), Nike (victory), Kratos (power), Via (force), Scylla, Fontes (fountains), and Lacus (lakes).\n" +
                "From the marriage of Perses (god of destruction) and Asteria (the starry one): Hecate (goddess of wilderness, childbirth, and magic).\n" +
                "Crius was considered one of the four pillars that hold the heavens and the earth apart. He represented the pillar of the south, while the other three pillars were personified by his brothers Iapetus, Coeus and Hyperion. The four brothers had an important role during the dethroning of their father, Uranus; as they were in the four corners of the earth, they held Uranus in place, while their brother Cronus castrated him with a sickle that their mother had given them.\n" +
                "\n" +
                "In the Titanomachy, the war between the Titans and the Olympians, Crius participated siding with the Titans, but did not have a specific role. When the Titans were defeated, Crius along with the rest of his siblings was thrown into Tartarus, the lower level of the Underworld.";
        return asteriaDesc;
    }

    private String cronus() {
        String asteriaDesc = "Cronus was the ruling Titan who came to power by castrating his father Uranus. His wife was Rhea, while their offspring were the first of the Olympians. To ensure his safety, Cronus ate each of the children as they were born. This worked until Rhea, unhappy at the loss of her children, tricked Cronus into swallowing a rock, instead of Zeus. When he grew up, Zeus revolted against Cronus and the other Titans, defeating them, and banishing them to Tartarus in the underworld.\n" +
                "\n" +
                "Cronus managed to escape to Italy, where he ruled as Saturn. The period of his rule was said to be a golden age on earth, honoured by the Saturnalia feast. A festival was also held in Athens, honouring Cronus; it was called Kronia and it took place on the twelfth day of the month Hekatombaion.";
        return asteriaDesc;
    }

    private String dione() {
        String asteriaDesc = "Dione was a Titan goddess in Greek mythology, most probably a daughter of Oceanus and Tethys and thus, an Oceanid. According to some sources, she was the first wife of Zeus, with whom she had a daughter, the goddess Aphrodite. She was an oracle and was worshipped alongside Zeus at the earliest Oracle in Greece that was located at Dodona. She made an appearance in Homer's Iliad, when her daughter was wounded and she tried to heal her. The priestesses and prophetesses at her shrine in Dodona were called Peleiades or the Doves, which was the sacred bird of her daughter, Aphrodite.\n" +
                "\n" +
                "There was also another Dione, a nymph and the daughter of Atlas. She became the wife of king Tantalus, and they had two sons, Pelops and Broteas, and a daughter, Niobe.";
        return asteriaDesc;
    }

    private String eos() {
        String asteriaDesc = "Eos was a Titan goddess in Greek mythology, daughter of the Titans Hyperion and Theia. She was the goddess of the dawn and had two siblings; Helios, god of the sun; and Selene, goddess of the moon. She was married to Astraeus, god of the dusk and together, they had numerous children that represented everything that occurred during the union of the dusk and the dawn, i.e. the twilight. Among her children were the four Anemoi (winds), as well as Eosphorus (the Morning Star) and the Astra Planeta (wandering stars or planets). She was described as having rosy fingers, a light pink gown woven with flowers, wearing a tiara and having large white-feathered wings.\n" +
                "\n" +
                "According to another source, she was the consort of god Ares, causing the jealousy of Aphrodite, who cursed her with insatiable sexual urge. As a result, Eos abducted various young men, including Cephalus, Tithonus and Orion. She had two sons with Tithonus, Memnon and Emathion. Memnon fought on the side of the Trojan in the Trojan War, where he died.";
        return asteriaDesc;
    }

    private String epimetheus() {
        String asteriaDesc = "Epimetheus was one of the Titans, son of Iapetus and Clymene. He was the brother of Prometheus, Atlas and Menoetius. His name is derived from the Greek word meaning 'afterthought', which is the antonym of his brother's name, Prometheus, meaning 'forethought'. In this context, Epimetheus appeared as a foolish character, while Prometheus was the clever one.\n" +
                "\n" +
                "Prometheus and Epimetheus were told to distribute characteristics to the newly created animals. Epimetheus started giving a positive trait to every animal, but lacking foresight, he realised that he had distributed all traits without having any left to give to man. So, Prometheus gave mankind the civilizing arts and fire.\n" +
                "\n" +
                "Epimetheus received Pandora as a gift from the gods; a human created by the gods specifically to punish the humans. The marriage of Epimetheus and Pandora is not explicit in any source, but only implied; from their union, Pyrrha, their daughter, was born. Pandora was given a jar which contained all evils of humanity; curious to see what was inside, she opened it and all evils were released into the world. Shocked, she closed it as soon as she could, but only Hope remained trapped inside.";
        return asteriaDesc;
    }

    private String eurybia() {
        String asteriaDesc = "Eurybia was a Titan goddess in Greek mythology, representing the mastery of the seas. She was a minor deity and did not play an important role in the myths. She was the daughter of the Titans Pontus and Gaea, and she was married to the Titan Crius. Her children were Astraeus, Perses and Pallas.";
        return asteriaDesc;
    }

    private String eurynome() {
        String asteriaDesc = "Eurynome was a Titan goddess in Greek mythology, daughter of the Titans Oceanus and Tethys, hence an Oceanid. She was the third wife of Zeus, with whom she had the three Charites, goddesses of grace. When Hephaestus was thrown off Mount Olympus by his mother Hera for being crippled, Eurynome and Thetis caught him and raised him. Eurynome may also have been a goddess of pasturelands.\n" +
                "\n" +
                "She was also often linked to another Eurynome, who was an early Queen of the Titans alongside her husband, Ophion. This couple fought against Cronus and Rhea and lost the throne to them.";
        return asteriaDesc;
    }

    private String hyperion() {
        String asteriaDesc = "Hyperion was one of the Titans, son of Uranus and Gaia. He represented light, wisdom and watchfulness. He was the father of the sun, the moon, and the dawn. In some early texts, the sun is mentioned as Helios Hyperion; however, in later texts, including Homer's and Hesiod's writings, Hyperion and Helios are two different deities, the latter being a physical representation of the sun. Hyperion is not mentioned in the Titanomachy, the War that resulted in the overthrow of the Titans and the start of the era of the Olympians.\n" +
                "\n" +
                "Hyperion was married to his sister, Theia, and they had three children, Helios (the sun), Selene (the moon) and Eos (the dawn). He was considered one of the four pillars that hold the heavens and the earth apart, and since his daughter was dawn, he was probably the pillar of the east. The other three pillars were his brothers Coeus (pillar of the north), Crius (pillar of the south), and Iapetus (pillar of the west). These four Titans were the ones that held their father Uranus in place, while Cronus castrated him with a sickle.";
        return asteriaDesc;
    }

    private String iapetus() {
        String asteriaDesc = "Iapetus was a Titan, son of Uranus and Gaea, and father of Atlas, Prometheus, Epimetheus and Menoetius. His name derives from the Greek word meaning to pierce usually with a spear; therefore, Iapetus may have been considered as the god of craftsmanship, although other sources site him as the god of mortality.\n" +
                "\n" +
                "Iapetus was also considered the personification of one of the four pillars that hold the heavens and the earth apart, a role that he later bequeathed to his son, Atlas. He represented the pillar of the west, the other three being represented by his brothers Crius, Coeus and Hyperion. The four brothers actively played a role in the dethroning of their father Uranus; as they were all in the four corners of the earth, they held Uranus firmly in place while their brother Cronus castrated him with a sickle.\n" +
                "\n" +
                "Iapetus' sons were thought to have been the ancestors of humans, and that they had some detrimental qualities that not only led to their own demise, but they also passed them down to humans. So, although Prometheus was clever, he bequeathed scheming to mankind; Epimetheus, guileless as he was, passed down stupidity; Atlas, being powerful and patient, gave excessive daring; and finally, Menoetius, an arrogant personality, bequeathed violence.";
        return asteriaDesc;
    }
    private String lelantos() {
        String asteriaDesc = "Lelantos was a Titan god in Greek mythology, son of the Titans Coeus and Phoebe. He was the brother of Leto and Asteria. He was the husband of Periboa, and had a daughter, Aura. His name means \"something that goes unobserved\"; therefore, he became the Titan of air, hunter's skill of stalking prey, and the unseen.";
        return asteriaDesc;
    }
    private String menotius() {
        String asteriaDesc = "Menoetius was a Titan god, son of Titans Iapetus and Clymene, and brother of Atlas, Prometheus and Epimetheus. His name derives from the Ancient Greek words \"menos\" (might) and \"oitos\" (doom), meaning \"doomed might\". Based on the descriptions of various resources, he may have been the Titan of violent anger, rash action, and human mortality, and he often committed hubris, having superfluous pride. During the Titanomachy, Zeus killed Menoetius and banished him to Tartarus.";
        return asteriaDesc;
    }
    private String metis() {
        String asteriaDesc = "Metis was one of the Titans, a daughter of Oceanus and Tethys; therefore, she was considered an Oceanid. She was the first wife of Zeus, and became the goddess of wisdom, prudence and deep thought.\n" +
                "\n" +
                "According to a prophecy, Metis would bear two children, the first being Athena, while the second one, a son, would be so powerful that would overthrow Zeus. Zeus, afraid of this, tricked Metis into turning herself into a fly, and swallowed her. However, Metis was already pregnant to Athena, and, inside Zeus' stomach, she started creating a helmet for her daughter. Zeus was in such pain that he asked Hephaestus to hit his head with an axe; as soon as his head was opened, Athena jumped out fully grown and clad in armour. It is often said that Athena had no mother and she was born out of Zeus alone; this doesn't necessarily conflict with this account, as the ancient Greeks believed that children were descendants of the fathers, while mothers did not contribute to the creation of their children.";
        return asteriaDesc;
    }
    private String mnemosyne() {
        String asteriaDesc = "Mnemosyne was one of the Titans, daughter of Uranus and Gaea, and goddess of memory. She was also occassionally referred to as Mneme; however, this was the name of another goddess. She was the oracular goddess of the underground oracle of Trophonios in the region of Boeotia.\n" +
                "\n" +
                "Zeus slept with Mnemosyne for nine consecutive days, eventually leading to the birth of the nine Muses. In Hesiod's Theogony, the kings and poets were inspired by Mnemosyne and the Muses, thus getting their extraordinary abilities in speech and using powerful words.\n" +
                "\n" +
                "The name Mnemosyne was also used for a river in the Underworld, Hades, which flowed parallel to the river of Lethe (which means forgetfulness). Usually, the souls of the dead would drink water from Lethe, so that they would forget their past lives when they would be reincarnated. However, the souls of the novices were told to drink water from Mnemosyne. This myth may have been part of a small mystic religion or be tied to Orphic poetry.";
        return asteriaDesc;
    }
    private String oceanus() {
        String asteriaDesc = "Oceanus was an ancient Greek god. According to one version, he was born by the union of the primal gods Chaos and Gaea, sanctified by god Eros. Another version has it that he was one of the twelve Titans, thus a son of Gaea and Uranus.\n" +
                "\n" +
                "Oceanus was married to his sister, Tethys, with whom he had numerous children, called Oceanids. These were the lesser gods and goddesses of the rivers, the sea, and the springs. In fact, Oceanus and Tethys were so fertile that the overproduction of the aqueous elements of nature would cause floods; so, they divorced to stop this from happening. The couple was not involved in the Titanomachy against Zeus, so the latter let them continue their reign in their watery kingdom.\n" +
                "\n" +
                "In ancient Greek art, Oceanus was depicted having bull horns and the tail of a serpentine fish instead of legs. He was later considered as a simple sea god or the personification of the sea.";
        return asteriaDesc;
    }
    private String ophion() {
        String asteriaDesc = "Ophion or Ophioneus was an elder Titan god in Greek mythology, who was the ruler of the Earth along with his wife Eurynome. The couple was later overthrown by Cronus and Rhea.";
        return asteriaDesc;
    }
    private String pallas() {
        String asteriaDesc = "Pallas was a Titan god in Greek mythology, son of the Titans Crius and Eurybia. He had two brothers, Astraeus and Perses, and he was married to Styx, with whom he had a number of children; Zelus, Nike, Kratos, Bia, Scylla, Fontes and Lacus. He was the Titan of warcraft. During the Titanomachy, Pallas was killed by the goddess Athena.";
        return asteriaDesc;
    }

    private String perses() {
        String asteriaDesc = "Perses was a Titan god in Greek mythology, son of the Titans Crius and Eurybia. He represented destruction and peace. He was married to the Titan goddess Asteria, with whom he had one daughter, Hecate; she was the goddess of wilderness, witchcraft and magic.\n" +
                "\n" +
                "Another mythological figure with the same name was the brother of Aeetes, and son of Helios and Perse. He overthrew his brother, claiming the throne of Colchis for himself, but was later killed by his niece, Medea.";
        return asteriaDesc;
    }
    private String phoebe() {
        String asteriaDesc = "Phoebe was one of the Titans, daughter of Uranus and Gaea. She was married to her brother Coeus, with whom she had Asteria (the starry one) and Leto. The Olympians Apollo and Artemis, twin siblings, were the children of Leto; thus, they were often referred to as Phoebus and Phoebe respectively, taking their alternative names from their grandmother. Phoebe was associated with the moon and the Oracle of Delphi, and was considered to be the goddess of prophecy.\n" +
                "\n" +
                "In the Titanomachy, the War between the Titans and the Olympian gods which resulted in the defeat of the former, Phoebe did not participate and therefore, she was spared imprisonment in Tartarus.";
        return asteriaDesc;
    }
    private String prometheus() {
        String asteriaDesc = "Prometheus was one of the Titans, son of Iapetus (also a Titan) and Clymene, an Oceanid. His brothers were Epimetheus, Atlas and Menoetius. The name derives from the Greek word meaning 'forethought'.\n" +
                "\n" +
                "During the Titanomachy, the war between the Titans and the Olympian gods, Prometheus sided with Zeus, helping to overthrow the old gods. Siding with the winning side, Prometheus avoided being punished with the rest of the Titans and was therefore not sent to Tartarus, the Underworld.\n" +
                "\n" +
                "In all accounts, Prometheus was presented to be the protector and benefactor of mankind. In an event called Trick at Mecone, he tricked Zeus by asking him to choose between two offerings; beef hidden inside an ox's stomach (something pleasing hidden inside a repelling exterior) or bones wrapped in glistening fat (something inedible hidden inside a pleasing exterior). Zeus chose the latter and hence, a precedent was created in what humans could sacrifice from that moment; so, they kept the meat for themselves and sacrificed bones to the gods.\n" +
                "\n" +
                "As a result of the trick at Mecone, Zeus was infuriated and decided to hide fire from mortals as punishment. Prometheus, in an effort to help humanity again, managed to steal fire back and give it to humans. More enraged, the father of gods asked Hephaestus to create Pandora, the first woman, who according to Hesiod, would bring troubles to mankind. He also punished Prometheus by having him chained to a rock, where an eagle ate his liver during the day, and the liver was regenerated during the night due to Prometheus' immortality. He was later saved by the demigod Hercules.";
        return asteriaDesc;
    }
    private String rhea() {
        String asteriaDesc = "Rhea was one of the Titans, daughter of Uranus and Gaea. She was the sister and wife of Cronus, also a Titan. She was responsible for the way things flow in the kingdom of Cronus (her name means 'that which flows').\n" +
                "\n" +
                "Rhea and Cronus had six children; Hestia, Hades, Demeter, Poseidon, Hera and Zeus. Cronus, afraid that he would be overthrown by his children just like he had done with his father, decided to swallow all of them. However, he was tricked by Rhea, who managed to save Zeus from his father. When Zeus grew up, he forced his father to disgorge his siblings and eventually overthrew him.\n" +
                "\n" +
                "Although Rhea was considered the \"mother of gods\", similarly to Gaea and Cybele, she did not have a strong cult and many followers. She had a temple in Crete, the place in which she hid Zeus to save from his father. In art, she started appearing in the fourth century BC; however, she was often depicted with characteristics similar to those used for Cybele, thus making the two goddesses indistinguishable. Rhea was often symbolised as a pair of lions that pulled a celestial chariot. This symbol was often placed on city gates, the best known cactustree being that at the city of Mycenae, where two stone lions guarded the gates.";
        return asteriaDesc;
    }
    private String selene() {
        String asteriaDesc = "Selene was a Titan goddess in Greek mythology, daughter of the Titans Hyperion and Theia. She had two siblings, Helios and Eos. She was the goddess of the moon, which she drove every night across the skies. Selene was linked to Artemis as well as Hecate; all three were considered lunar goddesses.\n" +
                "\n" +
                "She had an affair with a mortal named Endymion, whom Zeus had granted the choice of when he would die; Endymion chose to fall into an eternal sleep to remain ageless and deathless. Selene drove the silver moon chariot which was carried by two snow-white horses, as opposed to the golden sun chariot which was carried by four.\n" +
                "\n" +
                "According to other sources, Selene was one of Zeus' lovers and they had a number of children; Pandia, she who is all-bright; Ersa, the dew; Nemea, the nymph of the eponymous place; and Dionysus, although this may be a confusion due to the name similarity between Selene and Semele.";
        return asteriaDesc;
    }
    private String styx() {
        String asteriaDesc = "Styx was a Titan goddess in Greek mythology, daughter of the Titans Oceanus and Tethys, thus being one of the Oceanid sisters. She was the goddess of the River Styx, and wife to the Titan Pallas, with whom she had four children; Zelus, Nike, Kratos, and Bia. Styx fought on the side of Zeus and the Olympians during the Titanomachy, the great war between the Titans and the Olympians, the latter emerging victorious. To honour her, Zeus gave her name to the binding oath that was taken by the gods.\n" +
                "\n" +
                "The River Styx was the boundary between the realm of Earth and the Underworld. In its waters, the great hero Achilles was submerged when he was an infant by his mother Thetis, thus making him invincible; however, as she held him by his heel, that was the only spot on his body that was vulnerable. This is how the phrase Achilles' heel was created to signify a vulnerable spot.";
        return asteriaDesc;
    }

    private String tethys() {
        String asteriaDesc = "Tethys was one of the Titans, daughter of Uranus and Gaea. She was married to her brother, Oceanus, and gave birth to the river gods, who lived in the rivers that were then known to the Greeks, such as the Nile and Alpheus; and to three thousand water goddesses, called Oceanids. Despite being the mother of so many deities in the Greek mythology, Tethys was not actively worshipped. During the Titanomachy, she raised Hera as her stepchild, brought to her by Rhea.\n" +
                "\n" +
                "According to one myth, Hera did not like that Callisto and Arcas were placed in the heavens by being turned into the constellations Ursa Major and Ursa Minor, so she asked Tethys to do something about it. To appease Hera, Tethys denied the constellations from being able to touch the sea and fall below the horizon; instead, they were forever doomed to circle the sky.";
        return asteriaDesc;
    }
    private String thea() {
        String asteriaDesc = "Thea was one of the Titans, daughter of Uranus and Gaea. The alternative spelling of her name, Theia, means divine; goddess; while her other name, Euryphaessa, is a combination of the Greek words \"eury\", meaning wide, and \"phaos\", meaning bright. Hence, she was the goddess of light and was thought to be of considerable beauty. She was also the deity that endowed gold, silver and gems with their radiance.\n" +
                "\n" +
                "Based on a poem by Homer, Thea was married to her brother Hyperion, giving birth to Helios (the Sun), Selene (the Moon), and Eos (the Dawn). She was an oracular goddess, as she was the prophetic deity of an oracular shrine in the region of Phtiotis in Thessaly.";
        return asteriaDesc;
    }
    private String themis() {
        String asteriaDesc = "Themis was one of the Titans, daughter of Uranus and Gaea. She was the human-like representation of the natural and moral order. The name derives from the Greek word meaning that which is current and contemporary. According to Hesiod, she was the second wife of Zeus, a marriage that helped the supreme Olympian to stabilise his power over all gods and humans.\n" +
                "\n" +
                "Themis also represents the law and undisputed order, the divine right. She was the goddess that created the divine laws that govern everything and are even above gods themselves. In general, Themis had three subsistences; goddess of natural order, which manifested through the Hores (the Hours), meaning the seasonal and never-ceasing rotation of time; goddess of moral order, manifested through Eunomia (fair order), Deke (trial) and Erene (peace), which were the utmost characteristics of the society, and through the Moires, which represented the destiny of every human being; and finally, goddess of prophecy, shown through the Nymphs, as well as the virgin Astraea.\n" +
                "\n" +
                "Initially, Themis substituted her mother in the Oracle of Delphi, having inherited the ability to foresee events from her; however, when Apollo was born, Themis cared so much for him that she eventually offered the Oracle to him.";
        return asteriaDesc;
    }
    //    <!--Asteria :: Astraeus :: Atlas :: Clymene :: Coeus :: Crius :: Cronus :: Dione :: Eos :: Epimetheus :: Eurybia ::
//    Eurynome :: Hyperion :: Iapetus :: Lelantos :: Menoetius :: Metis :: Mnemosyne :: Oceanus :: Ophion :: Pallas :: Perses ::
//    Phoebe :: Prometheus :: Rhea :: Selene :: Styx :: Tethys :: Thea :: Themis-->
}

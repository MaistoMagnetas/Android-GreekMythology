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

public class GodsActivity extends AppCompatActivity {

    GridView gridViewGods;
    int gods[] = {R.string.gods_aphrodite, R.string.gods_apollo, R.string.gods_ares, R.string.gods_artemis,
            R.string.gods_athena, R.string.gods_hades, R.string.gods_hephaestus, R.string.gods_hera, R.string.gods_hermes,
            R.string.gods_hestia, R.string.gods_poseidon, R.string.gods_zeus};
    int godsIcons[] = {R.drawable.gods_aphrodite, R.drawable.gods_apollo, R.drawable.gods_ares,
            R.drawable.gods_artemis, R.drawable.gods_athena, R.drawable.gods_hades, R.drawable.gods_hephaestus,
            R.drawable.gods_hera, R.drawable.gods_hermes, R.drawable.gods_hestia, R.drawable.gods_poseidon,
            R.drawable.gods_zeus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gods);

        gridViewGods = (GridView) findViewById(R.id.gridview_gods);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), gods, godsIcons);
        gridViewGods.setAdapter(adapter);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewGods.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeGodActivity(godsIcons[position], gods[position], aphrodite());
                        break;
                    case 1:
                        makeGodActivity(godsIcons[position], gods[position], apollo());
                        break;
                    case 2:
                        makeGodActivity(godsIcons[position], gods[position], ares());
                        break;
                    case 3:
                        makeGodActivity(godsIcons[position], gods[position], artemis());
                        break;
                    case 4:
                        makeGodActivity(godsIcons[position], gods[position], athena());
                        break;
                    case 5:
                        makeGodActivity(godsIcons[position], gods[position], hades());
                        break;
                    case 6:
                        makeGodActivity(godsIcons[position], gods[position], hephaestus());
                        break;
                    case 7:
                        makeGodActivity(godsIcons[position], gods[position], hera());
                        break;
                    case 8:
                        makeGodActivity(godsIcons[position], gods[position], hermes());
                        break;
                    case 9:
                        makeGodActivity(godsIcons[position], gods[position], hestia());
                        break;
                    case 10:
                        makeGodActivity(godsIcons[position], gods[position], poseidon());
                        break;
                    case 11:
                        makeGodActivity(godsIcons[position], gods[position], zeus());
                        break;
                    default:
                        Toast.makeText(GodsActivity.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void makeGodActivity(int image, int title, String description) {
        Intent intent = new Intent(GodsActivity.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    //Gods descdriptions
    private String aphrodite() {
        String aphroditeDesc = "Aphrodite was the goddess of love, desire and beauty. Apart from her natural " +
                "beauty, she also had a magical girdle that compelled everyone to desire her. \n\n" +

                "There are two accounts of her birth. According to one, she was the daughter of Zeus and Dione, " +
                "the mother goddess worshipped at the Oracle of Dodona. However, the other account, which is more prevalent, " +
                "informs us that she arose from the sea on a giant scallop, after Cronus castrated Uranus and tossed his " +
                "severed genitals into the sea. Aphrodite then walked to the shore of Cyprus. In a different version of the myth," +
                " she was born near the island of Cythera, hence her epithet \"Cytherea\".\n\n" +
                "Aphrodite was married to Hephaestus; however, she had an affair with her brother Ares, god of war." +
                " When Hephaestus found out about the affair, he devised a plan and managed to humiliate his wife and her lover " +
                "to the other Olympians. Her holy tree was the myrtle, while her holy birds were the dove, the swan, and the sparrow.\n" +
                "\n" +
                "Aphrodite represented sex, affection, and the attraction that binds people together.";
        return aphroditeDesc;
    }

    private String apollo() {
        String apolloDesc = "Apollo was the son of Zeus and Leto, twin brother of Artemis. He was the god of music, and he is often depicted playing a " +
                "golden lyre. He was also known as the Archer, far shooting with a silver bow; the god of healing, giving the science of medicine to man; " +
                "the god of light; and the god of truth. One of Apollo's most important daily tasks was to harness his four-horse chariot, in " +
                "order to move the Sun across the sky. \n\n" +

                "Apollo was an oracular god, as he was the prophetic deity in the Oracle in Delphi. People from all over the known world travelled there " +
                "to learn what the future held for them, through his priestess Pythia. The god was also worshipped in the island of Delos, which was initially " +
                "dedicated to his twin sister Artemis. In relation to the rituals and practices that took place in Delos and Delphi, it could be said that there w" +
                "ere two completely distinct cults in honour of Apollo.\n" +

                "As already mentioned, Apollo was also considered as the god of healing and medicine, either through himself or through his son Asclepius. At the " +
                "same time, he could also bring forth " +
                "disease and plague with his arrows; it was considered that a god that can cause disease is also able to prevent it.\n" +

                "He was born on Delos, where his mother Leto sought refuge; Hera, having realised that Leto was impregnated by her husband Zeus, " +
                "banned Leto from giving birth on land. So, Leto managed to go to Delos, which had recently been formed, and therefore, was not considered " +
                "a real island yet. The inhabitants of the island, along with Artemis who had been born a day earlier, helped Leto give birth to Apollo. Leto then " +
                "promised the Delians that Apollo would always favour them for having helped her.\n" +
                "\n" +
                "His holy tree was the laurel, and his holy animal was the dolphin.";
        return apolloDesc;
    }

    private String ares() {
        String aresDesc = "Ares was the god of war, and son of Zeus and Hera. He represented the raw violence and untamed acts that " +
                "occured in wartime, in contrast to Athena, who was a symbol of tactical strategy and military planning.\n\n" +

                "He was disliked by both his parents. Whenever Ares appeared in a myth, he was depicted as a violent personality, who faced humiliation " +
                "through his defeats more than once. In the Iliad, it is mentioned that Zeus hated him more than anyone else; Ares was also on the losing side of " +
                "the Trojan War, favouring the Trojans.\n" +

                "He was the lover of his sister, Aphrodite, who was married to Hephaestus. When the latter found out about the affair, he devised a plan and managed to humiliate both of them. The union of Ares and Aphrodite resulted in the birth of eight children, including Eros, god of love.\n" +
                "\n" +
                "There were few temples attributed to Ares in Ancient Greece. Sacrifices would usually be made to him when an army would march to war; " +
                "Spartans would make sacrifices to Enyalius, another lesser god and son of Ares and Enyo. However, the name was also used as a byname for Ares.\n" +

                "When Ares went to war, he was followed by his companions, Deimos (terror) and Phobos (fear), who were the product of his union with Aphrodite. Eris," +
                " goddess of discord and sister of Deimos and Phobos, often accompanied them in war.";
        return aresDesc;
    }

    private String artemis() {
        String artemisDesc = "Artemis was the goddess of chastity, virginity, the hunt, the moon, and the natural environment.\n"+

                "She was the daughter of Zeus and Leto, twin sister of Apollo. She was born on the island of Ortygia (Delos), where Leto " +
                "had found shelter after being hunted by the lawful wife of Zeus, Hera. As soon as Artemis was born, she helped her mother give birth" +
                " to her twin brother, thereby becoming the protector of childbirth and labour. She asked her father to grant her eternal chastity and " +
                "virginity, and never gave in to any potential lovers; devoted to hunting and nature, she rejected marriage and love.\n"+

                "Artemis appeared in a number of myths. In the myth of Actaeon, he was a hunting companion of Artemis; at some point, he saw the goddess naked bathing in a spring and tried to rape her. As a " +
                "punishment, Artemis transformed him into a stag and his hounds killed him. In the myth of Orion which has various versions, Orion was also a " +
                "hunting companion of Artemis and the only person to have won her heart. However, he was accidentally killed either by the goddess or by a scorpion which was sent by Gaea.\n "+

                "In another myth, Callisto was one of the followers of Artemis and thus she had remained a virgin. Zeus, however, changing his form to resemble Artemis, managed to seduce and rape her, " +
                "impregnating her. Callisto gave birth to Arcas, but later, she was transformed into a bear either by Hera or Artemis. Arcas almost killed his mother, but Zeus stopped him and placed Callisto in the heavens as a constellation." +
                " According to other sources, both Callisto and Arcas were turned into the Ursa Minor and the Ursa Major constellations.";
        return artemisDesc;
    }

    private String athena() {
        String athenaDesc = "Athena was the Greek virgin goddess of reason, intelligent activity, arts and literature. She was the daughter of Zeus; her birth is " +
                "unique in that she did not have a mother. Instead, she sprang full grown and clad in armour from Zeus' forehead.\n"+

                "She was fierce and brave in battle; however, she only took part in wars that defended the state and home from outside enemies. She was the patron of the city, handcraft, and agriculture. " +
                "She invented the bridle, which permitted man to tame horses, the trumpet, the flute, the pot, the rake, the plow, the yoke, the ship, and the chariot. She was the embodiment of wisdom, reason, and purity. " +
                "She was Zeus' favourite child and was allowed to use his weapons including his thunderbolt. Her holy tree was the olive tree and she was often symbolised as an owl.\n"+

                "She was fierce and brave in battle; however, she only took part in wars that defended the state and home from outside enemies. She was the patron of the city, handcraft, and agriculture. " +
                "She invented the bridle, which permitted man to tame horses, the trumpet, the flute, the pot, the rake, the plow, the yoke, the ship, and the chariot. She was the embodiment of wisdom, reason, " +
                "and purity. She was Zeus' favourite child and was allowed " +
                "to use his weapons including his thunderbolt. Her holy tree was the olive tree and she was often symbolised as an owl.";

        return athenaDesc;
    }

    private String hades() {
        String hadesDesc = "Hades was the brother of Zeus and Poseidon. After the overthrow of their father, Cronus, he drew lots with them to share the universe. He drew poorly, which resulted in " +
                "becoming lord of the underworld and ruler of the dead. Nevertheless, he was not considered to be death itself, as this was a different god, called Thanatos. Greedy like his brother Poseidon, " +
                "he was mainly interested in " +
                "increasing his subjects, and anyone whose deeds resulted in people dying was favoured by him. The Erinnyes (the Furies) were welcomed guests in his kingdom.\n"+

                "Hades was the brother of Zeus and Poseidon. After the overthrow of their father, Cronus, he drew lots with them to share the universe. He drew poorly, which resulted in becoming " +
                "lord of the underworld and ruler of the dead. Nevertheless, he was not considered to be death itself, as this was a different god, called Thanatos. Greedy like his brother Poseidon, he was mainly " +
                "interested in increasing his subjects, and anyone whose deeds " +
                "resulted in people dying was favoured by him. The Erinnyes (the Furies) were welcomed guests in his kingdom.\n"+

                "Although an Olympian, Hades preferred the Underworld and rarely left his kingdom. His weapon was a pitchfork, which he used to create earthquakes, similar to the way Poseidon used his " +
                        "trident. He also had a helmet of invisibility, which he had received as a gift from the Cyclopes, in order to use it " +
                        "during the clash of the Titans. He was married to Persephone, daughter of Demeter, whom Hades abducted and carried down to the Underworld.";
        return hadesDesc;
    }

    private String hephaestus() {
        String hephaestusDesc = "Hephaestus was the Greek god of blacksmiths, sculptors, metallurgy, fire and volcanoes; thus, he is symbolised with a hammer, an anvil and a pair of tongs.\n"+

                "According to Homer's epics, the Iliad and the Odyssey, he was the son of Zeus and Hera. However, Hesiod informs us that Hera bore Hephaestus alone. According to an account, " +
                "after Hephaestus was born, Hera threw him from Olympus because he was crippled; he fell into the ocean and was raised by Thetis and Eurynome. Another myth has it that he once tried to protect " +
                "his mother from Zeus' advances and as a result, the father of the Gods flung him down from Olympus, which caused his physical disability; he fell on the island of Lemnos where he " +
                "became a master craftsman. He was later accepted back to Olympus, and became the craftsman of the gods, creating majestic armors, shields and weapons.\n"+

                "He was married to Aphrodite; after he learned his wife had an affair with her brother, Ares, he devised a plan with which he humiliated both lovers to the other gods." ;
        return hephaestusDesc;
    }

    private String hera() {
        String heraDesc = "Hera was Zeus' wife and sister, and was raised by the Titans Oceanus and Tethys. She was the supreme goddess, patron of marriage and childbirth, having a " +
                "special interest in protecting married women. Her sacred animals were the cow and the peacock, and she favoured the city of Argos.\n"+

                "Zeus initially courted Hera, but after many unsuccessful attempts, he resorted to trickery. He took the form of a disheveled cuckoo; Hera, feeling sorry for the bird, held it to her breast to keep it warm. Zeus then resumed his normal f" +
                "orm and taking advantage of Hera's surprise, he raped her. Hera then married him to cover her shame; their marriage was turbulent and they often clashed.\n"+

                "Occassionally, Zeus treated the other gods with particular harshness; Hera took advantage of that and asked them to join her in a revolt. They all accepted and set the plan in motion; Hera drugged Zeus, and then, the others bound him to a couch. At that stage, however, they began to argue over what the next step should be. Briareus, one of the Hecatoncheires, overheard the arguments; still full of gratitude to Zeus for saving him and his brothers from a dragon, Briareus sneaked in and quickly untied the knots that held Zeus in place. Zeus sprang from the couch and grabbed his thunderbolt. The gods fell to their knees begging and pleading for mercy. He seized Hera and hung her from the sky with gold chains. She wept in pain all night, but none of the other gods dared to interfere. Her weeping kept Zeus up, so the following morning, he agreed to release her if she swore never to rebel again. She had little choice but to agree. While she never again rebelled, she often interfered with Zeus's plans and she was often able to outwit him.\n" +
                "\n" +
                "Most stories concerning Hera deal with her jealousy and her plans of revenge for Zeus's infidelities.";
        return heraDesc;
    }

    private String hermes() {
        String hermesDesc = "Hermes was the Greek god of commerce, son of Zeus and Maia. Quick acting and cunning, he was able to move swiftly between the world of man and the world of gods, acting as a messenger of the gods and the link between mortals and the Olympians.\n"+
                "He was the protector of travelers, thieves and athletes. He occassionally tricked the other gods for his own amusement or in an effort to protect humans. With the ability to move freely between worlds, he also served as the guide of the souls of the dead to the underworld and the afterlife.\n"+
                "When Hermes was born, he jumped out of his crib, stole Apollo's cattle and then went back to his crib playing innocent. However, Apollo figured it out, grabbed Hermes and went to Zeus to complain. The father of gods simply laughed and didn't punish Hermes. To apologise, Hermes gave Apollo the lyre which he had just invented. Hermes appeared in many other myths; in the Odyssey, Odysseus was instructed by the god to chew a magic herb with which he would be able to avoid Circe's powers and not be transformed to animals like his companions; in the myth of Pandora, when the gods provided a trait to her, Hermes gave her the ability to lie and seduce with her words.";
        return hermesDesc;
    }

    private String hestia() {
        String hestiaDesc = "Hestia was the goddess of the hearth, family, and domestic life. She was not worshipped publicly, which is evident by the lack of temples and shrines attributed to her; this comes in contrast to the Roman equivalent goddess Vesta, who represented the public hearth. Her name meant both a house and a hearth, symbolising the home and its residents. She also represented the coalition and relationship between the colonies and the mother cities. She was Zeus' sister, but although initially she was included in the Olympian gods, she was later replaced by Dionysus. She took a vow to remain a virgin, refusing to give in to the callings of Poseidon and Apollo; once, she was almost raped by Priapus, a lesser god of fertility, but was saved thanks to the braying of a mule." ;
        return hestiaDesc;
    }

    private String poseidon() {
        String poseidonDesc = "Poseidon is the god of the sea and protector of all aquatic features. Brother of Zeus and Hades, after the overthrow of their father, Cronus, he drew lots with them to share the universe. He ended up becoming lord of the sea. He was widely worshipped by seamen. He married Amphitrite, one of the granddaughters of the Titan Oceanus.\n"+
                "At one point he desired Demeter. To deter him, Demeter asked him to make the most beautiful animal that the world had ever seen. So, in an effort to impress her, Poseidon created the first horse. In some accounts, his first attempts were unsuccessful and created a variety of other animals in his quest; thus, by the time the horse was created, his passion for Demeter had diminished.\n"+
                "His weapon was a trident, with which he could make the earth shake, causing earthquakes, and shatter any object. He was second to Zeus in power amongst the gods. He was considered by Greeks to have a difficult quarrelsome personality. Combined with his greed, he had a series of disputes with other gods during his various attempts to take over the cities they were patrons of.";
        return poseidonDesc;
    }

    private String zeus() {
        String zeusDesc = "Zeus was the god of the sky and ruler of the Olympian gods. He overthrew his father, Cronus, and then drew lots with his brothers Poseidon and Hades, in order to decide who would succeed their father on the throne. Zeus won the draw and became the supreme ruler of the gods, as well as lord of the sky and rain. His weapon was a thunderbolt which he hurled at those who displeased or defied him, especially liars and oathbreakers. He was married to Hera but often tested her patience, as he was infamous for his many affairs.\n"+
                "Zeus, the presiding deity of the universe, ruler of the skies and the earth, was regarded by the Greeks as the god of all natural phenomena on the sky; the personification of the laws of nature; the ruler of the state; and finally, the father of gods and men.\n"+
                "Using his shield, the Aegis, Zeus could create all natural phenomena related to the air and the sky, such as storms, tempests, and intense darkness. At his command, mighty thunders would flash and lightnings would roll, wreaking havoc; or the skies would open to rejuvenate the earth with life-giving water.\n"+
                "As the personification of the operations of nature, he represented the grand laws of unchanging and harmonious order, by which both the natural and the spiritual world were governed. He was the god of regulated time as marked by the changing seasons and the regular succession of day and night, in contrast to what his father Cronus represented before him; absolute time, i.e. eternity.\n"+
                "As the father of men, he took a paternal interest in the actions and well-being of mortals. He watched over them with tender solicitude, rewarding truth, charity, and fairness, while severely punishing perjury and cruelty. Even the poorest and most forlorn wanderer could find a powerful advocate in Zeus, for he, as a wise and merciful paternal figure, demanded that the wealthy inhabitants of the earth be attentive to the needs of their less fortunate fellow citizens.";
        return zeusDesc;
    }


}

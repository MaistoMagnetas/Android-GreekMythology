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

public class HeroesActivity extends AppCompatActivity {

    GridView gridViewHeroes;
    int heroNames[] = {R.string.heroes_achilles,R.string.heores_actaeon,R.string.heroes_aeneas,
    R.string.heroes_atlanta,R.string.heroes_bellerophon,R.string.heroes_dioscuri,R.string.heroes_heracles,
    R.string.heroes_jason,R.string.heroes_meleager,R.string.heroes_odysseus,R.string.heroes_peleus,
    R.string.heroes_perseus,R.string.heroes_theseus};
    int heroIcons[] = {R.drawable.heroes_achilles,R.drawable.heroes_actaeon,R.drawable.heroes_aeneas,
            R.drawable.heroes_atlanta,R.drawable.heroes_bellerophon,R.drawable.heroes_dioscuri,R.drawable.heroes_heracles,
            R.drawable.heroes_jason,R.drawable.heroes_meleager,R.drawable.heores_odysseus,R.drawable.heroes_peleus,
            R.drawable.heroes,R.drawable.heroes_theseus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewHeroes = (GridView) findViewById(R.id.gridview_heroes);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),heroNames,heroIcons);
        gridViewHeroes.setAdapter(adapter);

        gridViewHeroes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeHeroeActivity(heroIcons[position], heroNames[position], achilles());
                        break;
                    case 1:
                        makeHeroeActivity(heroIcons[position], heroNames[position], actaeon());
                        break;
                    case 2:
                        makeHeroeActivity(heroIcons[position], heroNames[position], aeneas());
                        break;
                    case 3:
                        makeHeroeActivity(heroIcons[position], heroNames[position], atlanta());
                        break;
                    case 4:
                        makeHeroeActivity(heroIcons[position], heroNames[position], bellerophon());
                        break;
                    case 5:
                        makeHeroeActivity(heroIcons[position], heroNames[position], dioscuri());
                        break;
                    case 6:
                        makeHeroeActivity(heroIcons[position], heroNames[position], heracles());
                        break;
                    case 7:
                        makeHeroeActivity(heroIcons[position], heroNames[position], jason());
                        break;
                    case 8:
                        makeHeroeActivity(heroIcons[position], heroNames[position], meleager());
                        break;
                    case 9:
                        makeHeroeActivity(heroIcons[position], heroNames[position], odysseus());
                        break;
                    case 10:
                        makeHeroeActivity(heroIcons[position], heroNames[position], peleus());
                        break;
                    case 11:
                        makeHeroeActivity(heroIcons[position], heroNames[position], perseus());
                        break;
                    case 12:
                        makeHeroeActivity(heroIcons[position], heroNames[position], theseus());
                        break;
                    default:
                        Toast.makeText(HeroesActivity.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void makeHeroeActivity(int image, int title, String description) {
        Intent intent = new Intent(HeroesActivity.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String achilles() {
        String achillesDesc = "Achilles was a hero in Greek mythology and one of the main characters that participated in the Trojan War. He was also the protagonist of Homer’s epic, the Iliad. He was the son of Peleus, king of the Myrmidons, and Thetis, a nymph. Both Zeus and Poseidon were in love with Thetis, however Prometheus warned them of a prophecy that said the son of Thetis would be greater than his father; so, the two gods decided to withdraw, and Peleus ended up marrying her. When Achilles was born, his mother wanted to make him immortal and thus, dipped him in the river Styx. However, she did not realise that his heel, by which she held him, was not touched by the waters, and so that was the only part of his body that remained mortal. According to another version, Thetis covered Achilles’ body in ambrosia and put him on top of a fire to burn away his mortality; however, she was enraged because she was interrupted by Peleus and abandoned them.\n"+
                "When the Trojan War started, Achilles commanded 50 ships, each having 50 Myrmidons. He also appointed five commanders; Menesthius, Eudorus, Peisander, Phoenix and Alcimedon. After departing, they landed in Mysia by mistake, which was then ruled by Telephus. Telephus was wounded in the battle by Achilles, and could not be healed. After consulting an oracle, he was told that he who inflicted the wound would be able to heal it; so, Telephus asked Achilles to heal him, and in return he guided them to Troy.\n"+
                "The Iliad starts the narrative of the Trojan War with Agamemnon, leader of the Achaeans, having acquired a woman called Chryseis as his slave. Her father, being a priest of Apollo, begs the god to help him, and Apollo sends a plague among the Greeks. Calchas identifies the source of the problem and Agamemnon reluctantly consents; however, he demands that Achilles hand over his own prize, another woman called Briseis. Achilles, furious that he was dishonoured in such a way, withdraws from battle and asks his mother to convince Zeus to help the Trojans, so that he may prove himself again in the battlefield. The Trojans manage to repel the Greeks back to the shore; Patroclus, Achilles’ friend, wearing Achilles’ armor, successfully leads the Myrmidons against the enemy, but is subsequently killed by Hector, the Trojan prince. Enraged by his friend’s death, Achilles joins the battle and tracks down Hector, whom he kills in a face to face duel. He then drags Hector’s lifeless body with his chariot during the funeral games he held for Patroclus.\n"+
                "The death of Achilles is not narrated in the Iliad, although it was predicted by Hector with his dying breath. Paris, the brother of Hector, managed to kill the hero with an arrow that landed on Achilles’ heel, the only vulnerable part of his body. The arrow was poisoned and some sources say that it was guided by the god Apollo. Achilles was cremated and his ashes were mingled with those of Patroclus.";
        return achillesDesc;
    }

    private String actaeon() {
        String actaeonDesc = "Actaeon was a famous hero in Greek mythology. He was the son of Aristaeus, a herdsman, and Autonoe, and resided in the region of Boeotia. He was the pupil of the centaur Chiron. He somehow caused the wrath of goddess Artemis, eventually leading to his death. There are many and different recounts of the myth; however, they all revolve around the notion that he was a hunter that was transformed into a stag and was then killed by his hunting dogs. According to the most popular version, provided by Callimachus, Actaeon accidentally saw Artemis naked, while she was bathing in the woods; amazed at her beauty, he was spotted by the goddess, who told him not to speak again or he would change into a deer. Upon hearing his hunting dogs, however, Actaeon called them and immediately transformed into a deer. So, he started running into the woods, but his well-trained dogs found him and tore him to pieces. The myth of Actaeon was considered to represent human sacrifice in an effort to appease a deity.";
        return actaeonDesc;
    }

    private String aeneas() {
        String aeneasDesc = "Aeneas was a Trojan hero in Greek mythology, son of the prince Anchises and the goddess Aphrodite. He is more extensively mentioned in Roman mythology, and is seen as an ancestor of Remus and Romulus, founders of Rome.\n"+
                "Aphrodite made all Greek gods fall in love with mortal women, and Zeus, to punish her, made her fall in love with Anchises, who was a herdsman near Mount Ida. Aphrodite appeared in front of him, and the herdsman was smitten by her beauty. After sleeping together, Aphrodite revealed her true identity to him, who feared for any consequences that might afflict him. Aphrodite reassured him that there would be no problem as long as he kept it a secret. She also told him that she would give birth to Aeneas.\n"+
                "In the Iliad, Aeneas was the leader of the Trojan Dardanians, and the main lieutenant of Hector. Aphrodite protected him throughout the war, and was also helped by Apollo, and even Poseidon who normally favoured the Greeks. In Roman literature, mainly the Aeneid written by Virgil, he was one of the few Trojans not killed during the Trojan War. He travelled to Italy, where he settled in the region where Rome would later be built by his descendants, Remus and Romulus.";
        return aeneasDesc;
    }

    private String atlanta() {
        String atlantaDesc = "Atlanta's parentage is uncertain. Her parents may have benn King Iasus and Clymene. She came into the world in the \"undesirable state\" of being female. As a result, her father had her carried into the woods and left to die. However, a bear found her and adopted her. As she grew older she began to spend time with hunters and was soon the best amongst them. She loved hunting and the outdoors and had no use for a man in her life. She also received an oracle that her marriage would end in disaster. She had no compunction in defending her virginity. When the centaurs Rhoecus and Hylaeus attempted to rape her, she quickly killed them with her arrows.\n"+
                "She wished to join the Argonauts, but Jason thought it was ill-fated to have a woman among the crew, fearing problems might occur, similar to those during the boar hunt.\n" +
                "\n" +
                "Her shooting skills allowed her to draw first blood during the Calydonian Boar Hunt. Her contribution to the hunt was marred when a quarrel over giving her a trophy of the hunt resulted in the death of Meleager and his uncles.\n"+
                "At the funeral games honoring Pelias, Atlanta entered the wrestling contests. There, she gained more fame by scoring a victory over Peleus.\n" +
                "\n" +
                "She achieved enough that her father forgave her for not being a son and allowed her to return home. Once there, he attempted to fulfill his fatherly obligations by finding her a husband. For her to simply refuse might arouse dangerous resentment. Instead she proposed a test. The successful suitor would have to beat her in a foot race. Losing suitors would be beheaded by her. As Atlanta was one of the fastest mortals this appeared to ensure her maidenhood.\n" +
                "\n" +
                "For quite some time this worked. Some say that she evened the odds by wearing armor while she ran. Others say that she gave the suitors a head start of half the distance. In any case the heads stacked up.\n" +
                "\n" +
                "Melanion fell in love with her. He knew that he was not fast enough to win the race. So he did what many frustrated lovers had done; he prayed to Aphrodite for help. Aphrodite had a weakness for lovers and a concern about those that rejected romance to the degree that Atlanta did. Aphrodite presented Melanion with three golden apples and a plan. In return, Melanion was to sacrifice to Aphrodite.\n" +
                "\n" +
                "Melanion then ran his race with Atlanta carrying the apples with him. When Atlanta caught up to him he tossed the first apple at her feet. The sight of the magic golden apple was irresistible to Atlanta. She stopped to pick it up confident that she could make up the time. Soon enough she was once again passing Melanion. He threw the second apple, this time further to the side. Again, she lost time retrieving the apple. As she again caught up the finish line was near and chasing the third thrown apple cost her the race.\n" +
                "\n" +
                "Despite her resistance, marriage seemed to suit Atlanta. Melanion's happiness and joy was so great he completely forgot his obligations to sacrifice to Aphrodite. As usual when messing up with the gods payback was severe.\n" +
                "\n" +
                "Aphrodite waited until Melanion and Atlanta were passing a shrine to a god, possibly Zeus. She then hit them with overwhelming desire. Melanion took Atlanta into the shrine and lay with her. At that point, the infuriated god turned them both into lions. This was regarded by the Greeks as particularly poetic as they believed that lions could mate only with leopards.\n" +
                "\n" +
                "There is one other mystery concerning Atlanta. Somehow, despite her vaunted virginity, she had a son - Parthenopaeus. The father is uncertain. Melanion and Meleager have both been suggested, but both of them were with Atlanta only briefly. Aris has also been put forward as the father. Out of embarrassment, she left the child exposed on a mountain. He was found and raised, eventually becoming a hero in his own right.";
        return atlantaDesc;
    }

    private String bellerophon() {
        String bellerophonDesc = "Bellerophon provides a lesson in the proper relationship between a mortal hero and the gods. When he was young he honored the gods and won their favor, but eventually his pride got the better of him and led to his downfall.\n" +
                "\n" +
                "Bellerophon was the son of Poseidon and Eurynome, wife of Glaucus. He was raised by Glaucus who thought Bellerophon was his own son. Considering that both Poseidon and Glaucus were interested in horses, it is not surprising that Bellerophon quested after Pegasus. After many failures, he asked the seer Polyeidus for help.\n" +
                "\n" +
                "Following Polyeidus' instructions, he spent the night in a temple of Athena. There, he had a dream that the goddess offered him a magical, golden bridle. He awoke and found the bridle he dreamt about in his hands. He sensibly made a sacrifice to both Athena and Poseidon. Afterwards, he went to the meadow Pegasus was grazing at, and was able to bridle and tame the horse without difficulty. Triumphant in his success, he went to King Pittheus and received permission to marry his daughter Aethra. However, before the marriage, he accidentally killed a man, possibly one of his brothers, and was banished.\n"+
                "He went to King Proetus to be excused for his crime. The king pardoned him, but during his stay at Proetus's house, the King's wife, Stheneboea, attempted to seduce him. As an honorable man Bellerophon rejected her advances. This infuriated Stheneboea who then falsely accused him of attempting to seduce her.\n" +
                "\n" +
                "Greatly upset, Proetus wanted to be rid of Bellerophon without having to accuse him publicly. He was also concerned about harming a house guest, as this was an offence to the gods. So, he sent Bellerophon to deliver a sealed message to his wife's father, King Iobates.\n" +
                "\n" +
                "Arriving on Pegasus, Bellerophon was warmly received and settled in as Iobates' house guest. Iobates unsealed and read the message thus learning of Stheneboea's accusations against Bellerophon. This left Iobates in the same predicament of acting against a guest that had troubled Proetus.\n" +
                "\n" +
                "Iobates' solution was to ask Bellerophon to undertake a series of heroic, but deadly tasks. However, Bellerophon's courage and skill as an archer, combined with Pegasus' help, allowed him to prevail. In addition, his parentage, his sacrifices, and his acts of honour gave him the favour of the gods. His first task was to kill the terrible Chimaera. Succeeding, he was sent to conquer the neighbouring Solymi tribe, which was Iobates' traditional enemy. When he defeated them, the King sent him to fight the Amazons. He was again victorious. In desperation, Iobates led an ambush against Bellerophon using his entire army; the army was killed to the last man.\n" +
                "\n" +
                "At this point, Iobates had the wisdom to notice that something was very wrong. He realized that the gods favoured Bellerophon and that this favor would not have been given to a dishonorable house guest. Iobates succeed in making amends by giving Bellerophon half his kingdom, including the best farmlands and his daughter Philonoe in marriage.\n" +
                "\n" +
                "There are two stories concerning the fate of Stheneboea. One says that Bellerophon extracted revenge by taking her for a ride on Pegasus, then shoving her off to fall to her death. In the other version, Stheneboea hears that Bellerophon has married her sister. She knows that this means her slander would be revealed and chose to kill herself.\n" +
                "\n" +
                "It appeared that Bellerophon would live happily ever after. His glorious deeds were widely sung. He was happily married. Philonoe bore him two sons, Isander and Hippolochus, and two daughters, Laodameia and Deidameia. As a king his subjects loved and honored him.\n" +
                "\n" +
                "However, this was not enough for Bellerophon. In his arrogance, he decided that he could ride Pegasus to Mount Olympus and visit the gods. Zeus quickly put an end to his trip by sending the gadfly to sting Pegasus and dismount Bellerophon. He survived his fall, but was crippled. He spent the rest of his life wandering the earth. No man would help him because of his offense to the gods. He died alone with no one to record his fate.";
        return bellerophonDesc;
    }

    private String dioscuri() {
        String dioscuriDesc = "In Greek mythology, the Dioscuri were the twin brothers Castor and Pollux (also called Polydeuces). Their mother was Leda, but they had different fathers. Tyndareus, the king of Sparta, was the father of Castor (hence a mortal), while Zeus was the father of Pollux (a demigod). Some sources say that they were born from an egg, along with their twin sisters Helen and Clytemnestra.\n" +
                "\n" +
                "The myth has it that Leda was seduced by Zeus, who had taken the form of a swan. However, there are different versions as to whether the twins were both mortals, both immortals, or Castor was mortal and Pollux was a demigod.\n" +
                "\n" +
                "The twins participated in the Argonautic Expedition, helping Jason retrieve the Golden Fleece. Upon their return to Greece, they also aided Jason in taking revenge for the treachery of Pelias, king of Iolcus, by destroying the city. They also took part in the hunt of the Calydonian Boar. Later, when their sister Helen was abducted by Theseus, king of Attica, they attacked his kingdom. They freed their sister and abducted Theseus' mother Aethra in revenge, who served as a slave for Helen.\n" +
                "\n" +
                "Castor and Pollux fell in love with Phoebe and Hilaeira, nieces of Leucippus, who were known as the Leucippides and who were already the consorts of the Dioscuri's cousins, Lynceus and Idas. The twins abducted the Leucippides and brought them back to Sparta, thus starting a family feud. The cousins attacked the region of Arcadia and managed to claim a herd of cattle from the Dioscuri, who were enraged. Some time later, the cousins visited their uncle's palace; the Dioscuri, Helen, and Paris were present at the time. The Dioscuri thought it was a good opportunity to take their cattle back and left for their cousins' home. Lynceus and Idas left some time later, leaving Helen and Paris alone, which eventually led to the Trojan War. The cousins caught the Dioscuri while attempting to steal the herd; Castor was mortally wounded by Idas, while Pollux killed Lynceus. As Idas approached to kill Pollux though, Zeus threw a thudnerbolt against him, thus saving his son's life. Pollux then asked his father to grant half of his immortality to his brother. Hence, they transformed into the constellation Gemini, able to travel back and forth between Olympus and Hades." ;
        return dioscuriDesc;
    }

    private String heracles() {
        String heraclesDesc = "Heracles (or Hercules) is best known as the strongest of all mortals, and even stronger than many gods. He was the deciding factor in the triumphant victory of the Olympians over the giants. He was the last mortal son of Zeus, and the only man born of a mortal woman to become a god upon his death.\n" +
                "\n" +
                "Offsetting his strength was a noticeable lack of intelligence or wisdom. Once, when the temperature was very high, he pulled his bow out and threatened to shoot at the sun. This, coupled with strong emotions in one so powerful, frequently got Heracles in trouble. While his friend and cousin Theseus ruled Athens, Heracles had trouble ruling himself. His pride was easily offended. He took up grudges easily and never forgot them. His appetites for food, wine, and women were as massive as his strength. Many of Heracles' great deeds occurred while doing penance for stupid acts done in anger or carelessness.\n" +
                "\n" +
                "It would be easy to view Heracles as a muscle-bound buffoon. Indeed, many of the Greek comedy playwrights used his character this way. Even among serious critics, he was often seen as a primitive, brutal, and violent man. There is much evidence to support this view; his weapon of choice was a massive club; his customary garment was a lion skin, with the head still attached; he impiously wounded some of the gods; he threatened a priestess of Apollo at Delphi when an answer to his questions was not forthcoming. He created most of his own problems.\n"+
                "However, viewing Heracles as simply a strong buffoon is unfair. He may have held grudges, but he would also do anything to help a friend. Once his anger passed, he was the most critical judge of his own actions. He was too strong for anyone to force a punishment on him. That he willingly did severe penance shows a fundamental sense of justice. During his punishments he showed patience, fortitude and endurance that were as heroic as his strength. Terrible things happened to him because of Hera's hatred, a hatred that he was not responsible for. That he persevered through it all was a moral victory beyond simple strength.\n" +
                "\n" +
                "The view of Heracles shifted considerably over time. The early view focused on how badly he managed despite his obvious gifts. As time passed the focus shifted to his virtues. The Romans valued him highly as he best fit their idea of a hero. He eventually had a fair sized cult that worshiped him as a god.";
        return heraclesDesc;
    }

    private String jason() {
        String jasonDesc = "Jason was a hero in Greek mythology, the leader of the Argonautic Expedition in the quest of retrieving the Golden Fleece. He was the son of the king of Iolcus, Aeson, but it is not certain who his mother was; various names appear in different sources as his mother.\n" +
                "\n" +
                "When Jason was still a baby, his half-uncle Pelias, vying for the throne of Aeson, killed all of Aeson's children, and overthrew Aeson; however, he failed to kill Jason. The baby was sent to the centaur Chiron, who nurtured him to adulthood. Pelias, in the meantime, consulted an oracle that told him to be careful of a man with one sandal. Jason, a grown man, returned to Iolcus to attend some games held by Pelias in honour of the god Poseidon; during his travel, he lost one of his sandals in the river Anauros while helping a disguised Hera to cross. Hera secretly blessed Jason at that point. Jason appeared in front of Pelias, asking for the throne as the rightful heir of Aeson, but Pelias gave him the quest to bring the Golden Fleece in order to step down from the throne.\n" +
                "\n" +
                "Jason started creating a party of heroes, who were collectively called the Argonauts, after the name of Jason's ship, Argo. The Golden Fleece was located in the mythical region of Colchis that would take a long time to reach. After the Argonauts set sail, they first reached the island of Lemnos. There, all the women of the island had killed their husbands after a curse that had been afflicted on them by the goddess Aphrodite, because she was not properly worshipped. The Argonauts stayed for a while there, sleeping with the women of the island and creating a new race, called Minyans.\n" +
                "Their next stop after Lemnos was the land of the Doliones, where they were warmly greeted. They were told there were supplies to be found beyond Bear Mountain, where a mythical race of giants called Gegeines lived. While the Argonauts were looking for supplies, the Gegeines attacked the ship; Heracles, who participated in the expedition, managed to kill many of them before the rest of the Argonauts came and pushed the giants back. At night, they set sail but a mistake caused them to land back on the island, where the Doliones, thinking they were enemies, attacked them; in the battle that followed, many Doliones were killed. In the following day, the remorseful Argonauts held funerals for the slain.\n" +
                "\n" +
                "They then went to Thrace, where the kingdom of King Phineus was being plagued by the Harpies. These monsters were sent by Zeus to steal food every day. Jason helped the king and killed the Harpies on their next attack. Phineus, grateful for Jason's help, told the Argonauts where Colchis lay and how to pass through the Symplegades, the Clashing Rocks. These were huge rock cliffs that would move and crush anything that passed between them. Phineus told Jason to release a dove and see if it would make it through, an omen for what would happen to the ship. The dove successfully passed, losing only a few tail feathers; so, when the ship travelled through the rocks, only minor damages were caused at the stern of the ship.\n" +
                "\n" +
                "Jason and the Argonauts eventually reached Colchis, where they were welcomed by King Aeetes. The Golden Fleece was in the possession of the king, gifted to him by Phrixus when he arrived there on a flying golden ram. Aeetes said he would give the fleece to Jason if he successfully completed three tasks. Jason despared by his quests. Hera, favouring him, convinced Aphrodite and Eros to make Medea, Aeetes' daughter, to fall in love with Jason and help him in the tasks. The first task was to plow a field using Khalkotauroi, fire-breathing oxen; Medea gave Jason an ointment that protected him from the fire. The second task was to sow dragon's teeth in the field, causing an army of stone warriors to appear. Jason was forewarned by Medea, and following her advice, threw a rock into the army. The soldiers, not knowing who had thrown the rock, killed each other. The third task was to take the Golden Fleece from a sleepless dragon. A sleeping potion, provided by Medea, was enough for Jason to overcome the dragon and take the Golden Fleece.\n" +
                "\n" +
                "After retrieving the fleece, Jason and the Argonauts left, and Medea joined them. Aeetes tried to follow them, but Medea killed her brother and threw his pieces into the sea, causing Aeetes to stop and retrieve them. Zeus, angry at Medea's act of killing her brother, caused a number of storms on their way back. To redeem themselves, they stopped at the island of Aeaea, where the nymph Circe lived to be purified. They then went on. On their voyage, they also met the Sirens that caused ships to crash onto the reefs, as their captivating voices mesmerised the crews; Orpheus, however, played the lyre and completely covered their voices, thus managing to evade the ill fate. Near Crete, they met Talos, a giant bronze man, who guarded the island and threw stones at anyone approaching. Medea cast a spell on him and they managed to remove the plug that kept Talos' ichor (the divine blood) in his single vein. Thus, he bled to death.\n" +
                "\n" +
                "The Argonauts eventually managed to return to their home. Jason found his father Aeson at a very old age, and asked Medea to transfer some of his life to his father. Medea gave a few more years to Aeson, without removing them from Jason, but by infusing Aeson's blood with magical herbs. Pelias' daughters asked her to do the same for their father; Medea tricked them into killing him instead. As a result, Pelias' son exiled Jason and Medea.\n" +
                "\n" +
                "The couple went to Corinth, where Jason fell in love and was engaged with Creusa. Medea, infuriated, confronted Jason, but he ignored her. As a revenge, Medea killed Creusa by giving her a dress that stuck on her and put her on fire; her father Creon was also burned trying to save his daughter. Medea then killed her sons that she had with Jason, fearing he would kill them as retaliation. She then abandoned Jason, flying to Athens on a dragon chariot sent by her grandfather, the sun god Helios.\n" +
                "\n" +
                "Years later, Jason managed to reclaim the throne of Iolcus with the help of his friend, Peleus. However, he remained lonely, having lost the favour of Hera after breaking his vows to Medea. He died while sleeping under the stern of his ship Argo, which having rotten fell on him.";
        return jasonDesc;
    }

    private String meleager() {
        String meleagerDesc = "Meleager was the son of King Oeneus of Calydon and Althaea. Seven days after his birth, the Fates appeared to foretell his future. Clotho and Lachesis predicted he would be noble and brave. Atropos warned him that he would die as soon as one of the sticks in the fireplace burned completely. Taking the hint, Althaea pulled the stick from the fire, put it out, and hid it in a safe place.\n" +
                "\n" +
                "While still young, he came to be regarded as second only to Heracles in his abilities. He was the youngest of the Argonauts and according to some, he killed the Argonauts' chief enemy, King Aeetes of Colchis.\n" +
                "\n" +
                "After he returned from this journey, he married Cleopatra and had a daughter, Polydora. His domestic tranquility was brought to an end when Artemis unleashed a fearsome boar in his homeland. He naturally took a leading role in killing the boar during what became known as the Calydonian Boar Hunt which lead to his death.\n"+
                "There are two versions of Meleager's death; both start with a quarrel with his uncles over the prized boar skin. To understand what happened, it is necessary to know that Althaea was married to Oeneus to help settle a blood feud that may have gone on for generations. While his uncles came to help with the boar, there still would have been a lot of tension among them, the Calydonians and Althaea's brothers.\n" +
                "\n" +
                "In the first version the quarrel over the prize led to a new war between Curetes and Calydon. This put Meleager in a terrible position, as he had relatives in both sides. Without his leadership, Calydon was on the verge of losing. His wife appealed to him to save the city. However, while leading Calydon, he killed his uncles. As a result, his mother cursed him and possibly burned the last stick the Fates had spoken of. In any case, the Erinyes then killed him to revenge for his killing of blood relatives.\n" +
                "\n" +
                "The more romantic version of his death starts with Meleager awarding the prize to Atlanta because she drew first blood. Awarding the prize to a woman angered the rest of the hunting party, but most remained silent. However, his uncles felt that their position entitled them to give orders to Meleager. A quarrel ensued between them and Meleager killed his uncles. Upon hearing of her brothers death by his hands, his mother burned the stick Fates had spoken of; as a result, Meleager died and Althaea then killed herself in remorse. Cleopatra then also committed suicide, driven by grief.";
        return meleagerDesc;
    }

    private String odysseus() {
        String odysseusDesc = "Odysseus was a legendary hero in Greek mythology, king of the island of Ithaca and the main protagonist of Homer's epic, the Odyssey. He was also a prominent character in the other surviving Homeric epic, the Iliad. He was the son of Laertes and Anticlea, and is well known as an eloquent speaker, ingenious and cunning.\n" +
                "\n" +
                "Before the Trojan War started, Odysseus was one of the suitors that wanted to marry Helen, step-daughter of king Tyndareus of Sparta. However, the suitors were many and there didn't seem to be a way to solve who the husband would be. Odysseus told Tyndareus that he would provide a solution if he helped him marry Tyndareus' niece, Penelope. Tyndareus agreed and Odysseus proposed to draw straws. Before that, though, he made everyone swear an oath that they would all support the husband and wife in any ill fate that they might face in the future. As a result, Menelaus drew the lucky straw, while Odysseus married Penelope.\n" +
                "\n" +
                "After Helen's abduction by Prince Paris of Troy, all suitors were summoned to help Menelaus in his quest to bring her back. Odysseus did not want to join the expedition, for an oracle had informed him that if he participated, it would take him a long time to return home. So, he decided to feign madness by harnessing a donkey and an ox to a plough and sowing salt on a field. Palamedes did not believe that Odysseus was actually mad, so he put Odysseus' baby boy Telemachus in front of the plough; Odysseus immediately changed course, thus exposing his plan. For this reason, Odysseus always had a grudge against Palamedes since then.\n"+
                "After Odysseus' plan was foiled, they all tried to recruit the hero Achilles, as an oracle said that the Trojan War would be won only if Achilles joined. Before they reached the island of Scyros where Achilles lived, his mother Thetis disguised him as a woman, because of another prophecy that said Achilles would either live a long, peaceful life, or have a glorious death while young. Odysseus made a plan to find out who Achilles was, among the women; he laid various weapons on a table, and Achilles was the only one who showed real interest in them. Odysseus then sounded a battle horn, and Achilles instinctively picked up a weapon ready to fight. As a result, Achilles joined in.\n" +
                "\n" +
                "After the Greeks reached Troy and the war started, Odysseus played a particularly influential role as a strategist and advisor. He was the main character who maintained the morale of the Greeks in a high level, and managed to prevent Agamemnon from withdrawing from the war. He also managed to appease Achilles' rage when Patroclus was slain. However, holding a grudge against Palamedes, it seems that Odysseus played a role in his demise; some versions say that Odysseus made a plan to expose Palamedes as a traitor and was stoned to death. According to another version, Odysseus and Diomedes told Palamedes to descend a well because of a treasure that was supposedly hidden there; when Palamedes reached the bottom of the well, the two men buried him inside.\n" +
                "\n" +
                "Odysseus was most famous in the war for his contribution to create the Trojan Horse, a huge wooden horse that was supposed to be a gift to the Trojans by the retreating Greeks. The Trojans accepted the gift joyfully and started celebrating around it. When the night fell and everyone was drunk, the Greek warriors, who had hidden in the hollow body of the horse, revealed themselves and slew the Trojans, winning the war.\n" +
                "\n" +
                "After the Trojan War, Odysseus made a ten-year journey to reach his home, Ithaca; his adventures were recounted in the epic Odyssey. On his way home, storms led Odysseus' ships to the island of the Cyclops Polyphemus, who started eating the crew of the ships. Odysseus managed to trick Polyphemus and along with his companions, blinded the Cyclops. Before they left, though, he did the mistake of revealing his identity to Polyphemus, who then told his father, the god Poseidon; this had a major impact on the hero's travel, as the god sent rough seas throughout the journey.\n" +
                "\n" +
                "The ships then reached the island of the god of winds, Aeolus, who put all winds except the west wind in a bag and gave the bag to Odysseus. As a result, the west wind blew the ships all the way to Ithaca. However, just before they reached the shore, Odysseus' companions took the bag of winds from Odysseus, and thinking it contained gold, opened it and released all of the winds. The ships were blown away from the island, back to where they had started. Aeolus did not accept to help them again, and they left.\n" +
                "\n" +
                "They went to the island of the Laestrygonians, a cannibalistic tribe that ate all of the crew, except that of Odysseus' ship. They quickly left the island and reached that of the witch Circe. She turned Odysseus' companions into pigs, but Odysseus, who had been given a magical herb by Hermes, resisted her witchcraft. Circe fell in love with Odysseus and transformed the pigs back into men. After they stayed on the island for one year, they left to continue their voyage.\n" +
                "\n" +
                "They reached the western edge of the world, where Odysseus took advice from the spirit of the prophet Teiresias, and later encountered his mother's spirit, who told him that back home, his wife Penelope was being surrounded by potential suitors. They then returned to Circe's island, who advised them on how to continue; they managed to avoid the Sirens, as well as the monsters Scylla and Charybdis.\n" +
                "\n" +
                "In the island of Thrinacia, Odysseus disregarded the advice of Teiresias and Circe, and caught the cattle of the sun god Helios. Helios, enraged, demanded that Zeus punish them, or he would make the sun shine in the Underworld. Zeus obliged by causing a shipwreck in which only Odysseus survived. He reached the island of Ogygia, where the witch Calypso kept him captive for seven years, before Hermes intervened and released the hero.\n" +
                "\n" +
                "Odysseus then reached the island of the Phaeacians (the modern day island of Corfu), who helped him reach his destination. He reached Ithaca late at night, and he was disguised by Athena as a beggar in order to learn what had happened during his absence. Penelope, his wife, had just announced that she would marry the person who was able to string his husband's bow and then shoot an arrow through twelve axe shafts. She knew that this was impossible to do for everyone except her husband. None of the suitors managed to do it, but Odysseus still in disguise completed the challenge and revealed himself; helped by his son Telemachus, he slew the suitors. Penelope did not believe that it was her husband but instead a god in disguise. To believe him, she asked him to move their bed to another room. Odysseus said that this was impossible, as he had made the bed and knew that one of the legs was a living olive tree.\n" +
                "\n" +
                "Years later, the son of Odysseus and Circe, Telegonus, reached adulthood and wanted to meet his father. He went to Ithaca, but as he reached the shore, he killed some sheep as he was hungry. Odysseus went and fought with him, not knowing who the other person was. Odysseus was eventually killed by Telegonus. Telegonus took Penelope and Telemachus to the island of Circe, where she made them immortal. The two sons then married each other's mothers.";
        return odysseusDesc;
    }

    private String peleus() {
        String peleusDesc = "Peleus was a hero in Greek mythology, son of Aeacus, king of the island of Aegina, and Endeis, an oread nymph. He was the husband of the nymph Thetis, with whom he fathered the famous hero Achilles.\n" +
                "\n" +
                "Along with his brother Telamon, they accidentally killed their half-brother, Phocus, while hunting, and were forced to flee the island of Aegina, in order to avoid punishment. When they reached the region of Phthia, Peleus fell in love with Antigone, the daughter of the region's king Eurytion, with whom he had a daughter, Polydora. Peleus, Telamon, and Eurytion were all participants in the Argonautic Expedition, in Jason's quest to retrieve the Golden Fleece. Some time later, yet in another hunting accident, Peleus killed Eurytion and had to flee.\n" +
                "\n" +
                "Peleus reached Iolcus, where the king's wife, Astydameia, fell in love with him. Peleus denied her advances, and for revenge, Astydameia sent a message to Antigone, saying that Peleus would marry her daughter. Antigone was so bitter that she hanged herself. Astydameia then falsely accused Peleus of trying to rape her; the king, Acastus, took Peleus into a forest where he abandoned him just before an attack by centaurs. Peleus was saved by Chiron, a wise centaur, or Hermes, the messenger god. Peleus escaped, ransacked Iolcus, and killed both Astydameia and Acastus.\n"+
                "ater, Peleus met Thetis, a sea nymph who was able to change form. Aided by Proteus, Peleus managed to win her heart. Their marriage was a grand event that was attended by most Olympian gods. However, the goddess of strife, Eris, was not invited; angry that she was scorned, Eris dropped the Apple of Discord among the guests, a golden apple that had an inscription reading \"To the fairest\". Hera, Athena, and Aphrodite started arguing over who should be the one to receive the apple, and told Zeus to decide. Zeus, reluctant to give an answer, said that the best person to decide was Paris, prince of Troy, who was also attending the wedding. After being bribed by the goddesses, Paris eventually picked Aphrodite, who had promised him she would give him the most beautiful woman in the world, Helen. This was the event that eventually culminated in the Trojan War.\n" +
                "\n" +
                "Peleus and Thetis had seven sons, but the six of them died when they were born. Only one son survived, who was named Achilles. Thetis decided to make Achilles invulnerable by dipping him in the River Styx; however, she did not realise that his heel, the part from which she was holding him, was not touched by the river waters, and was thus left vulnerable. This later became Achilles' doom, as a poisonous arrow shot by Paris and guided by Apollo during the Trojan War hit him in his heel and killed him.";
        return peleusDesc;
    }

    private String perseus() {
       String perseusDesc = "According to the myth, there once was a king named Acrisius, who had a beautiful daughter named Danae. The Oracle of Apollo told Acrisius that there would come a day when Danae's son would kill him; so he locked Danae in a bronze tower so that she would never marry or have children.\n" +
               "\n" +
               "The tower had no doors, except for one very small window. Danae was very sad, until one day, a bright golden light came through the small window; a man appeared holding a thunderbolt in his hand and although Danae knew he was a god, she didn't know which one. The man said, \"Yes, I am a god and I wish to make you my wife. I can turn this dark prison into a wonderful, sunny and blooming land.\"\n" +
               "\n" +
               "Indeed, the horrible prison turned into fields as beautiful as the Elysian Fields themselves, but one day Acrisius saw light coming out of the small window. He told his men to tear down one of the walls. When he entered, he saw Danae smiling and holding a baby on her lap. This was Perseus. Acrisius was furious, so he locked Danae and baby Perseus in a large chest and cast them out to sea.\n"+
               "Somehow, they managed to arrive safely to the island of Seriphos, where Polydectes ruled. The king's brother, Dictys, who was a fisherman, caught the chest in his net and pulled it to shore, freeing Danae and her son. Perseus grew up to become a strong young man. Polydectes heard about Danae and asked her in marriage, but she rejected him. If it wasn't for Perseus, Polydectes would have married Danae by force; so the king decided to create a plan to get rid of the young man.\n" +
               "\n" +
               "Polydectes pretended to marry the daughter of his friend. Everybody had to bring a wedding present, including Perseus. However, Perseus, being poor, had not brought anything, and Polydectes pretended to be furious. After a heated discussion, Perseus said he would bring him anything the king would ask; so Polydectes asked for the head of the Gorgon Medusa.\n" +
               "\n" +
               "Perseus set forth on his adventure; he wandered for days, searching for the Gorgons lair. One night, in an unknown country he realized how hopeless things were. Medusa was a horrible creature, who had snakes growing out of her head instead of hair, and a terrifying gaze that literary petrified anyone who would look into her eyes. In his despair, a tall woman and a young man with winged sandals appeared and introduced themselves as goddess Athena and god Hermes. Hermes said that they were all siblings as Perseus was in fact the son of Zeus, so they would help him in his quest; so Hermes offered him his winged sandals and the sickle that was used by Cronus to castrate Uranus; while Athena gave him her shield, so that Perseus would not have to look straight into Medusa's eyes. They also gave him further information on how to find the lair of Medusa.\n" +
               "\n" +
               "So Perseus went to the cave of the Graeae, who would lead him further in his adventure. The Graeae were three women who shared a single eye among them. So, when one of them was about to give the eye to one of the others, Perseus grabbed it and blackmailed them to aid him. So, the Graeae informed him that he should find the Nymphs of the North to get the Cap of Darkness which would make him invisible, as well as a magic bag.\n" +
               "\n" +
               "After getting these two items, Perseus eventually went to the lair of Medusa and her sisters, whom he found sleeping. He wore the Cap of Darkness, and unseen managed to kill Medusa using the sickle; he then used the shield to carry the head and place it into the magic bag, for even though it was dead, the head still have the potential to turn someone into stone. Medusa's sisters woke up and attacked Perseus, but he flew away using his winged sandals.\n" +
               "\n" +
               "On his way back to Seriphus, he had many adventures; in one of them, he came across the Titan Atlas, who was condemned to carry the heavens on his shoulders. To release him of his pain, Perseus turned him into stone using Medusa's head, so that he would no longer feel the weight of his burden.\n" +
               "\n" +
               "Later on, he saw what looked like a statue chained to a rock, so he went to investigate. He saw that it was not a statue, but a woman, and asked her why she was chained to the rock. \"My name is Andromeda\", she replied, \"and I have been punished because of my vain mother. She boasted that I was more beautiful than the Nereids. Poseidon was angered and said that I must be sacrificed to a sea monster,\" she said. Even as she spoke a monster rose from the sea. Perseus pulled Medusa's head out of the bag; the sea monster turned to stone and crumbled to pieces. Perseus cut Andromeda's chains and took her to her father, King Cepheus of Phoenicia. When Perseus asked Andromeda's hand in marriage, Cepheus gladly agreed. So, Perseus and Andromeda set off for Seriphus.\n" +
               "\n" +
               "On the way they stopped at Larisa, so Perseus could compete in some games that were held at that time; however, when he threw a discus, it hit an old man who instantly died. The man was Acrisius and therefore, the prophecy became true; after mourning, Perseus and Andromeda set off again.\n" +
               "\n" +
               "When they arrived at Seriphus, the first person they met was Dictys, the fisherman who had brought Danae and Perseus ashore many years ago. Dictys told them how Polydectes had never really married, but since Danae wouldn't marry Polydectes, he forced her to be his handmaiden. Perseus was furious, so he asked Dictys to take care of Andromeda, in order to avenge for his mother's mistreatment.\n" +
               "\n" +
               "Perseus stormed to the palace, walked in and said, \"Let all who are my friends shield their eyes!\" So saying he raised Medusa's head and Polydectes and his courtiers were immediately turned to stone. Perseus and Andromeda lived happily for many years and their descendants became great kings, the greatest of them all being Heracles, the strongest man in the world.\n" +
               "\n" +
               "Eventually, Perseus was killed by Dionysus. To be immortalised, Perseus and Andromeda were turned into stars and would live together in the sky.\n" +
               "\n" +
               "Clash of the Titans (the movie)\n" +
               "\n" +
               "Clash of the Titans is a 2010 fantasy film (remake of the 1981 film of the same name), loosely based on the Greek myth of Perseus. (CAREFUL, SPOILERS FOLLOW!!!)\n" +
               "\n" +
               "The film begins with a narration describing how the Olympians managed to overthrow their own creators, the Titans, through the aid of the Kraken, Zeus's creation. After their fierce struggle, Zeus (Liam Neeson) became the King of the Gods, his brother, Poseidon (Danny Huston), the Lord of the Seas, and their brother, Hades (Ralph Fiennes), tricked by Zeus to rule the sickening Underworld in chaos and terror.\n" +
               "\n" +
               "A coffin is then seen drifting through the sea before it is rescued by a fisherman, Spyros (Pete Postlethwaite). When Spyros opens it, he discovers the baby Perseus and his mother, Danae, inside and raises the boy as his own. Perseus does not know who his real father and mother are, and worries that he will be neglected when his adoptive parents have a child of their own, but Spyros reassures him of his love. Years later, Perseus (Sam Worthington) and his family are fishing when they witness a group of soldiers from Argos destroying a massive statue of Zeus, effectively declaring war on the gods. Immediately following the fall of the statue, Zeus rises from the ocean, killing most of the soldiers and then destroying the boat Perseus and his family are on. Perseus attempts to save his family from the sinking boat, but is unable to, and passes out on driftwood from the wreckage. The surviving soldiers find him and take him back to Argos.\n" +
               "\n" +
               "When King Cepheus (Vincent Regan) and Queen Cassiopeia (Polly Walker) of Argos, at a feast for the returning soldiers, compare themselves to the gods and compare the beauty of their daughter, Andromeda (Alexa Davalos), to that of Aphrodite, Zeus appears again, killing the remaining soldiers. When Perseus is unaffected by his attack, Zeus realizes he is a demigod, and tells him of his true father, himself. Zeus kills the queen, and demands that Argos further pay for its insolence and vanity; in 10 days, the Kraken will be released, and if the princess Andromeda is not sacrificed, then Argos will be destroyed. Zeus then seeks out the gods on Mount Olympus and convinces Zeus to agree to his plan in order to punish mankind for their lack of love.\n" +
               "\n" +
               "Initially, the Argives see Perseus as an agent of the gods and imprison him, but the king later seeks his help. A woman named Io (Gemma Arterton), who has been watching over Perseus his entire life, advises him that the only way to avenge the death of his family is to agree to the king's wishes and attempt to defeat the Kraken. He is sent out with a small group of soldiers, led by Draco (Mads Mikkelsen), along with Io to seek the Stygian Witches, while Zeus visits Acrisius (Jason Flemyng), a disfigured man who was married to Danae when Zeus impregnated her with Perseus. When Acrisius planned to kill his wife and the newborn Perseus, Zeus sent down a thunderbolt from Olympus, badly scarring and disfiguring Acrisius' entire body. To help him achieve his goals, Zeus imbues him with superhuman powers to enable him to kill Perseus. Acrisius attacks the Argive group, killing several, and even when his hand is severed in the fight, his blood falling on the sand causes giant scorpions to rise from the desert and continue the attack. Perseus and the Argives manage to kill the first two scorpions, but are surrounded by three more, even larger than the first. As they are about to attack, the scorpions are suddenly calmed by a group of Djinn, gentle and benevolent Sand-Demons with magical powers. There is initially mistrust between the two groups, until the chief heals Perseus of grave injuries sustained during the fight, and the two sides agree to cooperate.\n" +
               "\n" +
               "Perseus and his group, via the scorpions, arrive at the barren, rocky \"Garden of Stygia\", the site where the Gods ended the Great War and defeated the Titans. They find the three Stygian Witches, who are hideous and share one eye. They tell Perseus, after he threatens to throw their eye off the mountain, that Medusa's head will be able to kill the Kraken, but that he will die in the process. The soldiers go to the Underworld, where Medusa lives in seclusion in a temple, and only the soldiers enter (Io cannot because she is a woman). Medusa turns all the remaining soldiers into stone, the Djinn destroys himself with his heart, weakening Medusa, and Draco, who is gravely injured by one of Medusa's arrows early in the fight, rescues a cornered Perseus by skewering Medusa with a stone pillar from the ceiling and allows himself to be turned to stone in order to give Perseus a clear shot at Medusa's head. Perseus, eyes shut, kills Medusa. As he exits the temple, Acrisius returns and stabs Io. Perseus fights him again and, this time, successfully kills him, which turns Acrisius back to human form. Io dies, telling Perseus \"this is the part of the journey you do alone...\"\n" +
               "\n" +
               "Perseus finds Pegasus and flies back to Argos as the Kraken is being released, thus destroying the city. As a priest is about to sacrifice Andromeda, Zeus appears, and has his creatures attack Perseus and steal Medusa's head. Perseus defeats the creatures and regains the head, as well as successfully turning the Kraken to stone before it consumes Andromeda. Zeus appears once more and boasts that he cannot die because he is immortal; but Perseus throws his sword, charged together with Zeus's lightning at him which banishes him to the Underworld. Perseus then saves Andromeda from drowning when the apparatus used to restrain her falls into the ocean, but refuses to become king of Argos.\n" +
               "\n" +
               "In the final scene, Perseus stands at the broken statue of Zeus seen at the beginning. Zeus appears and offers to make Perseus a god on Olympus; but he refuses. Zeus notes that Zeus will return one day for revenge when mankind is in fear. Zeus states that if Perseus is still intent to stay on earth then he might give him a gift since he is the son of Zeus after all. A resurrected Io appears before Perseus, and the two begin to embrace while Pegasus flies above them.";
       return perseusDesc;
    }

    private String theseus() {
        String theseusDesc = "Theseus was a Greek hero in Greek mythology. While having all the qualities of a traditional hero, such as strength and courage, he was also intelligent and wise. His early adventures benefited the city and region of Athens, helping in the consolidation of the Athenian power through shrewd political maneuvering. He also led the Athenian army on a number of victorious campaigns. He was also credited as the founder of democracy, voluntarily transferring many of his powers as king over to an elected assembly. He gained a reputation for helping the poor and oppressed.\n" +
                "\n" +
                "His shedding of power also made it easier for him to continue going on adventures after his rule. \"Not without Theseus\" became a popular Athenian saying, reflecting the belief he should be included in any important undertaking.\n" +
                "\n" +
                "While growing up, he looked up to his older cousin Heracles. Theseus and Heracles later saved each other's lives; Heracles through his strength; Theseus through his wisdom.\n"+
                "In middle age, his wisdom deserted him. He began going on foolish adventures, and making bad decisions. His efforts to produce an heir for the throne led to more problems. The people of Athens grew tired of the turmoil he produced. Eventually, he died in exile. The city did not bother to bring his body home.\n" +
                "\n" +
                "Generations passed without much thought being given to Theseus. Then, during the Persian wars, Athenian soldiers reported seeing the ghost of Theseus and came to believe that he was responsible for their victories. The Athenian general Kimon received a command from the Oracle at Delphi to find Theseus' bones and return them to Athens. He did so, and he was reburied in a magnificent tomb that also served as a sanctuary for the defenseless.";
        return theseusDesc;
    }


}

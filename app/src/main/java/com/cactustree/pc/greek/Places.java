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

public class Places extends AppCompatActivity {

    GridView gridViewPlaces;
//    <!--Aeaea :: Arcadia :: Athens :: Aulis :: Calydon :: Colchis :: Corinth :: Crete ::
//    Delphi :: Iolcus :: Ithaca :: Lerna :: Lycia :: Mount Olympus :: Nemea :: Sparta ::
//    Tauris :: The Underworld :: Thebes :: Troy-->
    int places[] = {R.string.places_aeaea,R.string.places_arcadia,R.string.places_athens,R.string.places_aulis,
                    R.string.places_calydon,R.string.places_colchis,R.string.places_corinth,R.string.places_crete,
                    R.string.places_delphi,R.string.places_iolcus,R.string.places_lerna,R.string.places_lycia,
                    R.string.places_mounth_olympus,R.string.places_nemea,R.string.places_sparta,R.string.places_trauris,
                    R.string.places_underworld,R.string.places_thebes,R.string.places_troy};

    int placesIcons[] = {R.drawable.places_aeaea,R.drawable.places_arcadia,R.drawable.places_athens,
    R.drawable.places_aulis,R.drawable.places_calydon,R.drawable.places_colchis,R.drawable.places_corinth,
    R.drawable.places_crete,R.drawable.places_delphi,R.drawable.places_iolcus,R.drawable.places_lerna,
    R.drawable.places_lycia,R.drawable.places_olymp,R.drawable.places_nemea,R.drawable.places_sparta,
      R.drawable.places_tauris,R.drawable.places_underworld,R.drawable.places_thebes,
    R.drawable.places_troy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewPlaces = (GridView) findViewById(R.id.gridview_places);
        CustomAdapter adapter = new CustomAdapter(this,places,placesIcons);
        gridViewPlaces.setAdapter(adapter);

        gridViewPlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makePlacesActivity(places[position], placesIcons[position], aeaea());
                        break;
                    case 1:
                        makePlacesActivity(places[position], placesIcons[position], arcadia());
                        break;
                    case 2:
                        makePlacesActivity(places[position], placesIcons[position], athens());
                        break;
                    case 3:
                        makePlacesActivity(places[position], placesIcons[position], aulis());
                        break;
                    case 4:
                        makePlacesActivity(places[position], placesIcons[position], calydon());
                        break;
                    case 5:
                        makePlacesActivity(places[position], placesIcons[position], colchis());
                        break;
                    case 6:
                        makePlacesActivity(places[position], placesIcons[position], corinth());
                        break;
                    case 7:
                        makePlacesActivity(places[position], placesIcons[position], crete());
                        break;
                    case 8:
                        makePlacesActivity(places[position], placesIcons[position], delphi());
                        break;
                    case 9:
                        makePlacesActivity(places[position], placesIcons[position], iolcus());
                        break;
                    case 10:
                        makePlacesActivity(places[position], placesIcons[position], lerna());
                        break;
                    case 11:
                        makePlacesActivity(places[position], placesIcons[position], lycia());
                        break;
                    case 12:
                        makePlacesActivity(places[position], placesIcons[position], olympmount());
                        break;
                    case 13:
                        makePlacesActivity(places[position], placesIcons[position], nemea());
                        break;
                    case 14:
                        makePlacesActivity(places[position], placesIcons[position], sparta());
                        break;
                    case 15:
                        makePlacesActivity(places[position], placesIcons[position], tauris());
                        break;
                    case 16:
                        makePlacesActivity(places[position], placesIcons[position], underworld());
                        break;
                    case 17:
                        makePlacesActivity(places[position], placesIcons[position], thebes());
                        break;
                    case 18:
                        makePlacesActivity(places[position], placesIcons[position], troy());
                        break;
                    default:
                        Toast.makeText(Places.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }//    <!--Aeaea :: Arcadia :: Athens :: Aulis :: Calydon :: Colchis :: Corinth :: Crete ::
//    Delphi :: Iolcus :: Ithaca :: Lerna :: Lycia :: Mount Olympus :: Nemea :: Sparta ::
//    Tauris :: The Underworld :: Thebes :: Troy-->
            }
        });
    }

    public void makePlacesActivity(int title, int image, String description) {
        Intent intent = new Intent(Places.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String aeaea() {
        String aeaeaDesc = "Aeaea was a mythical island in Greek mythology, which was considered to be the place where the witch Circe lived. In this island, Odysseus stayed for a year while trying to get back to his homeland, Ithaca. It is not clear as to where the island was located geographically. Homer was inconsistent when he described Odysseus' adventures. Some scholars propose that it was located in the east, somewhere close to King Aeetes' land, Colchis, mainly because Circe was Aeetes' sister, but also because the palace of the goddess Eos (dawn) was on the island. Others suggest that it was located somewhere off the western coast of Italy.\n" +
                "\n" +
                "Although originally Circe transformed Odysseus' men into pigs, Odysseus managed to overcome the witch's magic. He and his men stayed on the island for a year feasting, and Odysseus fathered a child with Circe, Telegonus. When he decided to leave, Circe gave him directions on how to return to Ithaca. Years later, after Odysseus had returned home, Telegonus went to Ithaca to find him, but mistakenly killed him. Telegonus then took Odysseus' wife, Penelope, and son, Telemachus, to Aeaea, where Circe made them immortal.";
        return aeaeaDesc;
    }

    private String lerna() {
        String lernaDesc = "Lerna was a region in the Peloponnese in Greece, which was the backdrop for one of the Labours of Heracles in Greek mythology. It was the place where one of the best known mythical monsters dwelled, the Lernaean Hydra. It was a water snake that had nine heads; eight of them were mortal, but as soon as one was cut off, two more would appear. The ninth head was immortal and could not be slain by normal means. Slaying the Lernaean Hydra was the second labour that King Eurystheus gave to Heracles, as was demanded by the goddess Hera.\n" +
                "\n" +
                "Lerna was a region that had lots of springs and swamps, and was also one of the entrances to the Underworld. In this area, the Lernaean Mysteries were held as a tribute to the goddess of nature, Demeter. It was also here that the god Poseidon slept with Amymone, daughter of Danaus, to whom he revealed the secret of the Lernaean lake.";
        return lernaDesc;
    }

    private String arcadia() {
        String arcadiaDesc = "Arcadia is the name of a region in modern-day Greece, but it was also a place of reference in ancient Greek mythology. It was located in the Peloponnese, and was considered to be a wilderness in which the god Pan resided, along with dryads, nymphs and other spirits. It was believed that it was a utopic place, where inhuman creatures dwelled. Hermes, the god of thievery and the messenger of the other gods, would be seen roaming in the region, while Atalanta, a mythical heroine who participated in the hunt for the Calydonian Boar and managed to kill it, was the daughter of the king of Arcadia.";
        return arcadiaDesc;
    }

    private String athens() {
        String athensDesc = "Athens is the capital city of Greece and has been continuously inhabited for over 7000 years. In ancient times, it was one of the main city-states that competed for power against Sparta, Corinth and Thebes. It also provided the backdrop for various myths and legends for ancient Greeks.\n" +
                "\n" +
                "Its name derives from the goddess of wisdom, Athena, who became the city's patron goddess after a contest with Poseidon. The two gods competed for who would get the honour of becoming the patron god of the city, and offered gifts to the Athenians. Poseidon hit the ground with his trident and created a spring, showing that he would offer significant naval power. Athena, on the other hand, offered the olive tree, a symbol of prosperity and peace. The Athenians, led by King Cecrops I, decided to take Athena's gift, thus making her the patron goddess.\n" +
                "\n" +
                "The city was also the starting point for the story of Aegeus and Theseus. Aegeus was the king of Athens; during some games that were organised in the city, the son of King Minos of Crete was killed, and Minos waged war against Athens, emerging victorious. As punishment, Athens was forced to send young men and young women to Crete annually, in order to be sacrificed to the Minotaur, who dwelt in the labyrinth under the palace of Minos. At some point, though, Theseus, son of Aegeus, decided to go as part of the sacrifice, planning to kill the Minotaur. He was successful in his quest, but upon returning to Athens, he forgot to change his ship's sails to white; when Aegeus saw the black sails, meaning that Theseus had died in the labyrinth, he fell into the sea, and drowned, giving his name to what now is called the Aegean Sea.";
        return athensDesc;
    }

    private String aulis() {
        String aulisDesc = "Aulis was a town in ancient Greece, located in the area of Boeotia, opposite the island of Euboea. In Greek mythology, the Greek fleet gathered there in order to set sail to Troy and bring back Helen. However, Agamemnon, one of the Greek leaders, had killed a sacred deer of Artemis, and the goddess, furious, had caused all winds to cease. In order to let the winds blow again, Artemis asked Agamemnon to sacrifice his daughter Iphigenia. Agamemnon eventually agreed to sacrifice his daughter; when Iphigenia was brought to the altar, though, she was secretly exchanged for a deer by Artemis, and the young lady was sent to the region of Tauris to serve as a priestess.";
        return aulisDesc;
    }

    private String calydon() {
        String calydonDesc = "Calydon was a city in ancient Greece, and a place that appears in various myths. It was located in the region of Aetolia, and took its name from its founder, Calydon. The Mount Arakynthos was close to the city, and it was the area where the hunt of the Calydonian Boar took place. In Calydon, there was the Laphrion, a sanctuary dedicated to the goddess Artemis and her twin brother Apollo.";

        return calydonDesc;
    }

    private String colchis() {
        String colchisDesc = "Colchis was a region in the Southern Caucasus that appeared in the story of Jason and the Golden Fleece, in Greek mythology. It was on the area where modern-day Georgia is now located.\n" +
                "\n" +
                "In the myth of the Argonauts, Jason was told to retrieve the Golden Fleece from Colchis by the king of Iolcus, Pelias, who had usurped the throne from his brother Aeson, who was Jason's father. Jason organised the expedition, and along with his shipmates, the Argonauts, set sail for Colchis. There, he told King Aeetes that he wanted to take the Golden Fleece, and the king accepted to help him if he passed a number of trials. Jason eventually succeeded to pass the trials and kill the never-sleeping dragon that guarded the fleece, and retrieved it. He then set sail for Greece, followed by Aeetes' daughter, Medea.";

        return colchisDesc;
    }

    private String corinth() {
        String corinthDesc = "Corinth was a city-state in Ancient Greece, located between its rival states, Sparta and Athens. In Greek mythology, it was founded by Corinthos, who was a descendant of the god of sun Helios. Other sources suggest that the city was actually founded by the goddess Ephyra, daughter of the Titan god Oceanus. One of the better known kings of Corinth was Sisyphus, who was condemned in the afterlife to eternally roll a boulder uphill, while during the Trojan War, the leader of the Corinthians was Agamemnon, brother of the king of Sparta.";

        return corinthDesc;
    }

    private String crete() {
        String creteDesc = "Crete is the largest island in Greece and has been the backdrop for a number of stories of ancient Greek mythology.\n" +
                "\n" +
                "Zeus, the king of gods and men, was born in a cave in Greece and was raised by a goat, Amalthea. It was also in the nearby islets of Paximadia that the twins Artemis and Apollo were born. When Crete was attacked by a giant lizard, Zeus defended the island and threw a lightning bolt against it, turning the beast to stone and into an island that is now called Dia. On the other hand, the small islands of Lefkai were created after a musical contest between the Sirens and the Muses. The latter, furious that they had lost, pulled all the feathers from the Sirens and threw them into the sea, thus forming those islands. The giant automaton Talos was the guardian of Crete and was killed when Medea pulled a spike that held the ichor, the divine blood, into Talos' body. Finally, it was the place where the palace of King Minos was located, under which Daedalus had built the labyrinth, in order to house the Minotaur, a monster formed from the union of Minos' wife, Pasiphae, and a bull. Daedalus and his son Icarus were kept captive here, but managed to escape by creating wings made of feathers and wax; however, Icarus flew too close to the sun, the wax melted and he fell to his doom. It was here that Theseus was brought in order to kill the Minotaur.";
        return creteDesc;
    }

    private String delphi() {
        String delphiDesc = "Delphi is an ancient site in Greece and a modern town, which was an important part of various stories in Greek mythology. Ancient Greeks believed that Delphi was the centre of Grandmother Earth which Zeus was trying to find. Towards this end, the king of gods let two eagles fly in opposite directions from the top of Mount Olympus. The two eagles eventually crossed paths in Delphi, which is how the omphalos (navel) of the Earth was considered to be there.\n" +
                "\n" +
                "The Oracle of Delphi, or Pythia, was famous throughout ancient Greece, and people from all the then-known world would flock to the area seeking advice. The Oracle served the god Apollo, after he had slain Python, the dragon who protected the navel of the Earth. As a tribute to Apollo, the Pythian Games were held every four years, and were the precursor of the Olympic Games.";
        return delphiDesc;
    }

    private String iolcus() {
        String iolcusDesc = "Iolcos was an ancient city in Greece, in the region of Magnesia. In Greek mythology, the king of Iolcos was Aeson, but he was violently dethroned by his brother, Pelias. Pelias then forced Aeson's son, Jason, to retrieve the Golden Fleece from the region of Colchis, as a prophecy foretold of Pelias' death by Jason. Jason organised the Argonautic Expedition, and along with his fellow shipmates, collectively called the Argonauts, set sail for the mythical Colchis. After a number of adventures, they arrived in Colchis and Jason took the Golden Fleece from King Aeetes. Medea, Aeetes' daughter, fell in love with Jason and followed him back to Greece, where she became queen of Iolcos after marrying Jason.";
        return iolcusDesc;
    }
//    <!--Aeaea :: Arcadia :: Athens :: Aulis :: Calydon :: Colchis :: Corinth :: Crete ::
//    Delphi :: Iolcus :: Ithaca :: Lerna :: Lycia :: Mount Olympus :: Nemea :: Sparta ::
//    Tauris :: The Underworld :: Thebes :: Troy-->


    private String ithaca() {
        String ithacaDesc = "Ithaca is an island in the Ionian Sea in Greece, which was an important setting in one of the most famous myths of ancient Greece, the Odyssey.\n" +
                "\n" +
                "The main hero of the story, Odysseus, lived in Ithaca and was its rightful ruler. Homer described it as being \"low-lying\" and farthest to the west, despite being mountainous, and the island of Kefalonia being even more to the west. Some scholars argue that Homer's Ithaca was not modern-day Ithaca, but rather a nearby island. Odysseus was one of the suitors of Helen, the most beautiful woman in the known world. Foreseeing that the situation would not lead anywhere, as there was a multitude of suitors and Tyndareus was unable to choose a husband for her in fear of offending them, he made a proposal to him. He said that if Tyndareus would help him win the hand of Penelope, then he would provide a solution to the problem. He then told all of the suitors to swear an oath, which was hence named the Oath of Tyndareus, according to which no matter who Helen would pick for her husband, they would all support the couple. Everyone agreed and Helen chose Menelaus, king of Sparta. Odysseus then took Penelope for his bride and went back to Ithaca.\n" +
                "\n" +
                "After Helen's abduction by Paris and before the Trojan War started, Odysseus was told by an oracle that if he went to the expedition to retrieve Helen, he would not return home for decades. So, he originally pretended to be insane, but his plan was foiled and he was forced to join the Greek army against the Trojans. After the Trojan War, which lasted ten years, it took him another ten years to return home, facing multiple adventures in the process.";
        return ithacaDesc;
    }

    private String lycia() {
        String lyciaDesc = "Lycia was an area located in the region of Anatolia, on the southern coast of Turkey. It played a prominent role in various stories of Greek mythology. One of the most important features of the area was the Letoon, an important centre of worship dedicated to the goddess Leto, and her children, Apollo and Artemis. The Letoon is now included among the UNESCO World Heritage sites.\n" +
                "\n" +
                "Lycia appears in the texts of Herodotus; Europa had two sons, Sarpedon and Minos, who clashed together for the control of Crete. Minos won and exiled his brother, who ended up in Milyas, the original name of Lycia. Later, Lycus, the son of Pandion II of Athens, also exiled by his brother Aegeus, reached the same region, which took after his name.\n" +
                "\n" +
                "The region also appears in the story of Bellerophon, who became the king after Iobates, while it also participated in the Trojan War on the side of the Trojans. Sarpedon and Glaucus were the two most important Lycian leaders in the war.";
        return lyciaDesc;
    }

    private String olympmount() {
        String olympmountDesc = "In Greek mythology, Mount Olympus was the dwelling of the Olympian Gods and it was created after the Titanomachy, the battle during which the Olympians defeated their predecessors, the Titans. The peak Mytikas was then called Pantheon and was the venue where all the fiery discussions among the deities took place. There was also a place where the Throne of Zeus was located. The twelve Olympians that resided at Mount Olympus were Zeus, Hera, Poseidon, Athena, Apollo, Artemis, Hestia, Demeter, Hermes, Aphrodite, Ares and Hephaestus. Apart from the gods, the foot of the mountain was also the place where the nine Muses lived.";
        return olympmountDesc;
    }
    private String nemea() {
        String nemeaDesc = "Nemea is an ancient site in the Peloponnese in Greece, which provided the setting for one of the Labours of Heracles, in ancient Greek mythology. The ruler of the area was King Lycurgus and his wife was Queen Eurydice. The first labour that King Eurystheus asked Heracles to perform was to kill the Nemean lion, a creature that roamed in the area. Its skin was impenetrable by normal weapons, and it had golden fur. Heracles did not know this, and when he tried to confront it, he shot arrows against it with no success. So, he devised a plan; he cornered the lion in its den and eventually managed to capture it and strangle it with his bare hands. He tried to take its skin with his knife but failed; the goddess Athena saw how frustrated he was, and advised him to skin it using one of the lion's claws. Thus, he managed to take the skin and use it as a body armour.\n" +
                "\n" +
                "\n" +
                "See Also:";
        return nemeaDesc;
    }
    private String sparta() {
        String spartaDsec = "Sparta was a city-state in Ancient Greece, in the region of Laconia in the Peloponnese, that turned into the dominant military power of ancient Greece.\n" +
                "\n" +
                "The region of Sparta was also called Lacedaemon, after the name of the mythical king of the region. He was the son of Zeus and the nymph Taygete, and was married to Sparta, daughter of the river god Eurotas. Together, they had three children, Amyclas, Eurydice (different to the wife of Orpheus), and Asine. He built the sanctuary dedicated to the three Charites. Queen Sparta was considered to have been beautiful worth fighting for and protecting no matter the costs.";
        return spartaDsec;
    }
    private String underworld() {
        String underworldDesc = "The Underworld was hidden deep in the earth and was the kingdom of the dead, ruled by god Hades. Hades was a greedy god, whose sole purpose was to increase the number of souls in his kingdom; at the same time, he was very reluctant to let any soul leave. The Erinnyes were welcomed in the Underworld.\n" +
                "\n" +
                "For most souls, life in the underworld was not particularly unpleasant. It was rather like being in a miserable dream, full of shadows, ill-lit and desolate, barren of hope; a joyless place where the dead slowly faded into nothingness.\n" +
                "\n" +
                "Geographically, the Underworld was considered to have been surrounded by five rivers: the Acheron (river of woe), the Cocytus (river of lamentation), the Phlegethon (river of fire), the Styx (river of unbreakable oath by which the gods took vows), and the Lethe (river of forgetfulness). Past the rivers, a diamond gate, guarded by Cerberus, formed the entrance to the kingdom. Deep within the kingdom, lay Hades' vast palace, full with guests.\n" +
                "\n" +
                "Upon death, a soul was led by Hermes near the entrance of the underworld, where the ferry awaited to carry it across the Acheron. There was a single ferry run by Charon, the boatman who took the souls across the river. Only those who could pay the fare with coins placed on their lips when buried, were granted passage; the rest were trapped between two worlds. After the boat ride, the souls entered through the gates; Cerberus allowed everyone to enter, but none to leave. The souls then appeared before a panel of three judges, Rhadamanthus, Minos, and Aeacus, who passed sentence based on their deeds during their previous life. The souls who were good went to the Elysian Fields, while the others were singled out for special treatment; Sisyphus and Tantalus are two cactustrees of souls that were sentenced to be tormented for eternity.";
        return underworldDesc;
    }
    private String thebes() {
        String thebesDesc = "Thebes is a city in the region of Boeotia in Greece, which provided the setting for various myths and stories. Cadmus, a Phoenician king, was the mythical founder of the city; the myth has it that after getting advice from the Oracle of Delphi, he had to follow a cow and build a city wherever the animal would stop. After it stopped, Cadmus decided to sacrifice it to the gods and asked his men to get some water from a nearby spring, which was guarded by a dragon. The dragon killed most of his men, before it was slain by Cadmus. Advised by Athena, Cadmus sew half of the dragon's teeth, and armed soldiers sprang out of the ground, the Spartoi. Cadmus threw a stone among them, who confused about who had done it, started fighting each other. Only five survived, who helped Cadmus build Thebes.\n" +
                "\n" +
                "However, one of the most prominent sagas of Greek mythology that took place in Thebes was the story of Laius, and everything that resulted from his deeds. Although he was the rightful heir to the throne, it was usurped by Amphion and Zethus. Laius found refuge in the court of Pisa in the Pelopponese, where King Pelops warmly welcomed him. He then raped and abducted Pelops' son, Chrissipus, and went back to Thebes, where he was restored to the throne. Later, he married Jocasta, but he received an oracle that he should not have a child or the child would kill him and marry his wife. However, one night he was so drunk that he slept with Jocasta and impregnated her with Oedipus. The story of Oedipus also takes place in the city of Thebes.";
        return thebesDesc;
    }
    private String troy() {
        String troyDesc = "Troy was a city in the region of Asia Minor in modern-day Turkey, which was the setting of one of the most famous events in Greek mythology, the Trojan War. The Greek fleet set sail for Troy after the city's prince, Paris, abducted or, according to other sources, eloped with Helen, the wife of King Menelaus of Sparta. Menelaus, his brother Agamemnon, and other Greek leaders bound by the Oath of Tyndareus, organised the expedition to take Helen back. When they arrived in Troy, they camped near the River Scamander, while the main battles took place in the plain of Scamander, between the river and the hill on which Troy was located.\n" +
                "\n" +
                "On the site where Troy was considered to have been, archaeological excavations have revealed ruins of ancient cities, which are actually believed to be Troy. As time went by, one city was built on top of the ruins of the previous one; as a result, nine layers of an equal number of distinct \"Troys\" have been found on site.";
        return troyDesc;
    }
    private String tauris() {
        String taurisDesc = "Tauris was a place in the Crimean Peninsula, which appeared in the story of Iphigenia in Greek mythology. The Greeks had established a colony there, but they considered its original inhabitants, the Tauri, as savages. In the Greek myth of Iphigenia, Agamemnon, one of the Greek leaders in the Trojan War, was told to sacrifice his daughter Iphigenia because the goddess Artemis was angry with him for killing one of her sacred deer; as a punishment, no wind blew in order for the Greek fleet to sail to Troy. Agamemnon eventually accepted, and when Iphigenia was brought to the altar to be sacrificed, she was secretly exchanged for a deer by the goddess.\n" +
                "\n" +
                "Artemis brought Iphigenia to Tauris, where she served as a priestess to her at her temple. Many years later, her brother Orestes was told to go to Tauris to retrieve a statue of goddess Artemis, in order to be relieved of the Erinyes who chased him after he killed his mother Clytemnestra and her lover Aegisthus. There, he was reunited with his sister, and together they escaped the savage Tauri and returned to Greece.";
        return taurisDesc;
    }
}

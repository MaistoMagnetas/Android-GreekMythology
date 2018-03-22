package com.cactustree.pc.greek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Creatures extends AppCompatActivity {

    GridView gridViewCreatures;

/*    <!--Argus Panoptes :: Arion :: Ash Tree Nymphs :: Centaur :: Cerberus :: Ceryneian Hind :: Chimaera ::  :: Chrysaor :: Cretan Bull :: Cyclopes ::
    Delphyne :: Echidna :: Erymanthian Boar :: Giants :: Gorgons :: Hecatoncheires :: Laelaps ::
    Marsyas ::  :: Nessus :: Pegasus :: Phoenix :: Polyphemus : :: Python :: Silenus :: Sirens :: Talos :: Teumessian fox-->*/
    int[] creatures = {R.string.creatures_argus,R.string.creatures_arion,R.string.creatures_ash_ymphs,R.string.creatures_centaur,
            R.string.creatures_cerberus,R.string.creatures_ceryneian,R.string.creatures_chimaera, R.string.creatures_creatan_bull,
        R.string.creatures_cyclopes,R.string.creatures_delphyne,
            R.string.creatures_echidna,R.string.creatures_erymanthian,R.string.creatures_giants,R.string.creatures_gorgons,
            R.string.creatures_hecatoncheires,R.string.creatures_marsyas,
            R.string.creatures_nessus,R.string.creatures_pegasus,R.string.creatures_phoenix,R.string.creatures_polyphemus,
            R.string.creatures_python,R.string.creatures_sirens,R.string.creatures_talos,R.string.creatures_teumessian_fox};

    int[] creaturesIcons = {R.drawable.creatures_argus,R.drawable.creatures_arion,R.drawable.creatures_nymph,R.drawable.creatures_centaur,
            R.drawable.creatures_cerberus,R.drawable.creatures_ceryneian,R.drawable.creatures_chimera,R.drawable.creatures_cretan_bull,
            R.drawable.creatures_cyclopes,R.drawable.creatures_delphyne,
            R.drawable.creatures_echidna,R.drawable.creatures_erymanthian,R.drawable.creatures_giants,R.drawable.creatures_gorgones,
            R.drawable.creatures_hecatoncheires,R.drawable.creatures_marsyas,
            R.drawable.creatures_nessys,R.drawable.creatures_pegasus,R.drawable.creatures_pheonix,R.drawable.creatures_polyphemus,
            R.drawable.creatures_python,R.drawable.creatures_sirens,R.drawable.creatures_talos,R.drawable.creatures_teumessian_fox};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creatures);

        gridViewCreatures = (GridView) findViewById(R.id.gridview_creatures);
        CustomAdapter adapter = new CustomAdapter(this, creatures, creaturesIcons);
        gridViewCreatures.setAdapter(adapter);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        gridViewCreatures.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], argus());
                        break;
                    case 1:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], arion());
                        break;
                    case 2:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], nymphs());
                        break;
                    case 3:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], centaur());
                        break;
                    case 4:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], cerberus());
                        break;
                    case 5:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], hind());
                        break;
                    case 6:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], chimera());
                        break;
                    case 7:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], cretanBull());
                        break;
                    case 8:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], cyclopes());
                        break;
                    case 9:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], delphine());
                        break;
                    case 10:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], echidna());
                        break;
                    case 11:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], boar());
                        break;
                    case 12:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], giants());
                        break;
                    case 13:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], gorgons());
                        break;
                    case 14:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], hecatoncheires());
                        break;
                    case 15:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], marsyas());
                        break;
                    case 16:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], nessus());
                        break;
                    case 17:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], pegasus());
                        break;
                    case 18:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], pheonix());
                        break;
                    case 19:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], polyphemus());
                        break;
                    case 20:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], python());
                        break;
                    case 21:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], sirens());
                        break;
                    case 22:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], talos());
                        break;
                    case 23:
                        makeCreaturesActivity(creatures[position], creaturesIcons[position], fox());
                        break;
                    default:
                        Toast.makeText(Creatures.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
    public void makeCreaturesActivity(int title, int image, String description) {
        Intent intent = new Intent(Creatures.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String argus() {
        String argusDesc = "Argus Panoptes or Argos was a hundred-eyed giant in Greek mythology. He was a giant, the son of Arestor, whose name \"Panoptes\" meant \"the all-seeing one\". He was a servant of Hera; one of the tasks that were given to him was to slay the fearsome monster Echidna, wife of Typhon, which he successfully completed. However, his main task, at Hera's request, was to guard Io, a nymph that Zeus was involved with. Zeus, in his efforts to approach Io, told Hermes to disguise himself as a shepherd and make Argus go to sleep. As soon as he fell asleep, Hermes killed him with a stone.";
        return argusDesc;
    }

    private String arion() {
        String arionDesc = "Arion was an immortal horse in Greek mythology, which was very fast and bred by the gods. According to a source, it also had the ability to speak. The various sources differ on how the horse was bred. Some say that it was foaled by the goddess Demeter after sleeping with Poseidon, while others that it was the goddess of Earth, Gaea, that gave birth to it. Its most notable owner was Adrastus, king of Argos. Arion is also mentioned in the myth of Heracles against the Eleans, in which the demigod took the stallion from Oncus. He then rode on Arion during the war, and gifted it to Adrastus afterwards. During the battle of the Seven Against Thebes, in which the brothers Eteocles and Polynices killed each other while vying for the Theban throne, Adrastus was the only attacker to survive thanks to Arion's intervention.";
        return arionDesc;
    }

    private String nymphs() {
        String nymphsDesc = "The Ash Tree Nymphs or Meliae were created by the blood that fell on the earth when the Titan Cronus castrated his father Uranus, in his effort to overthrow him. Along with the Meliae, came out the Erinyes (the Furies) and the Giants. The mankind of the Age of Bronze originated from the Meliae. The honey-nymphs that nurtured and raised Zeus in Crete, Ida and Adrasteia, were called Meliai and probably belonged to this group of nymphs.\n" +
                "\n" +
                "The Meliae were always invoked as a group, although in a few myths, some of them are given individual names. One of them was called Melia and was the mother of Io, Philodice, Inachus, and Aegialeus.\n";
        return nymphsDesc;
    }

    private String chimera() {
        String chimeraDesc = "The Chimaera was a hybrid monster in Greek mythology, child of Typhoeus and Echidna and sibling of Cerberus and the Lernaean Hydra. It had the head and body of a lion, as well as the head of a goat that was attached to its back, and a tail that ended on a head of a snake.\n" +
                "\n" +
                "It resided in Lycia, a place in Asia Minor, where it ravaged the lands with its fire breath. It was killed by Bellerophon, assisted by Pegasus, when the former was asked by King Iobates of Lycia. Bellerophon rode on Pegasus' back, who could fly, and shot arrows at the Chimera from above.";
        return chimeraDesc;
    }

    private String centaur() {
        String centaurDesc = "Centaurs are half-human, half-horse creatures in Greek mythology. They have the body of a horse and the torso, head and arms of a man. They were considered to be the children of Ixion, king of the Lapiths, and Nephele, a cloud made in the image of Hera. According to a different myth, however, they were all born from the union of a single Centaurus with the Magnesian mares.\n" +
                "\n" +
                "One of the best known centaurs is Chiron or Cheiron, a wise centaur. Although most centaurs were depicted as lustful and wild, Chiron was a notable exception; modest and civilised, he was known for his medicinal skills and teaching abilities. He lived on Mount Pelion in Thessaly and was the tutor of a number of Greek mythical characters such as Achilles and Aesculapius. He was immortal; however, he was accidentally wounded by Heracles with an arrow treated with the blood of the monster Hydra, causing him insufferable pains. So, when Heracles asked his father to free Prometheus and Zeus demanded that someone must be sacrificed, Chiron volunteered and died, both to free Prometheus and himself from the pain.";
        return centaurDesc;
    }

    private String cerberus() {
        String cerberusDesc = "Cerberus was a three-headed dog that guarded the entrance of the Underworld, allowing the dead to enter but letting none out. He was the son of Typhon and Echidna. Apart from his three heads, he also had a serpent's tail, a mane of snakes and the claws of a lion.\n" +
                "\n" +
                "Cerberus was the twelfth and final labour that was given to Heracles by King Eurystheus. Heracles had to capture the three-headed dog without using any weapons. After learning how the enter the Underworld, and assisted by some of the gods, he managed to go to the Underworld and find Hades to ask for his permission to take Cerberus to the surface. Hades agreed under the condition that Heracles must not use any weapons. Heracles eventually managed to overpower Cerberus and brought him to Eurystheus, successfully completing his twelve labours.";
        return cerberusDesc;
    }

    private String hind() {
        String hindDesc = "The Ceryneian Hind in Greek mythology was a huge female deer which lived in the region of Keryneia. It was a sacred animal to the goddess of the hunt Artemis. Although female, it had male-like antlers, which were made of gold, while its hooves were made of bronze. It had the ability to outrun a flying arrow.\n" +
                "\n" +
                "Capturing the Ceryneian Hind was the third task that King Eurystheus asked the demigod hero Heracles to complete in the story of the Labours of Heracles. As the hind was unnaturally fast, he believed it would be impossible for the hero to catch. At the same time, he thought that catching the sacred animal would trigger the wrath of Artemis against Heracles and would kill him.\n" +
                "\n" +
                "Heracles chased the hind for a whole year in various lands in and out of Greece. There are many versions of how he finally managed to capture it; one has it that he captured it while it slept after lightly hurting it using a trap net. Another version says that Artemis appeared in front of the hero and told him to leave the hind alone; he should then go back and tell Eurystheus what had happened and the task would be considered fulfilled. A different account says that Heracles captured the animal using an arrow between its legs.\n"+
                "After catching the animal and on his way to Eurystheus, Heracles came across Artemis and her twin brother Apollo. He begged Artemis for forgiveness and told her why he was forced to capture the animal. Artemis indeed accepted his apology and forgave him, as long as he would set the animal free. Heracles accepted. When he went to the court of Eurystheus, he found out that the king's plan was to add the animal to his personal menagerie. So, Heracles devised a plan. He said that Eurystheus himself should come to take the animal from him. The king started walking towards Heracles and the hind, but Heracles purposefully left the hind loose a moment too early; the deer escaped with its unnatural speed and went back to its goddess. Heracles then said that Eurystheus simply had not been fast enough.\n" +
                "\n" +
                "Angry, Eurystheus told Heracles that the next task he should perform would be to catch the Erymanthian Boar.";
        return hindDesc;
    }

    private String chysaor() {
        String chysaorDesc = "Chrysaor was the brother of the winged horse Pegasus and son of Poseidon and the Gorgon Medusa. When Medusa was decapitated by Perseus, both Chrysaor and Pegasus were born at the same time. Little is known about Chrysaor; he was considered a stout-hearted warrior, and his name means \"he who bears a golden sword\". He did not have a major role in Greek mythology.";
        return chysaorDesc;
    }

    private String cretanBull() {
        String cretanBullDesc = "The Cretan Bull was a bull that appeared in the myth of the Labours of Heracles, as well as the myth of the Minotaur, in Greek mythology. It was the creature that Pasiphae fell in love with, and became impregnated by, eventually giving birth to the Minotaur.\n" +
                "\n" +
                "During the Labours of Heracles, King Eurystheus sent Heracles to capture the Cretan Bull and bring it back. The hero went to Crete and acquired permission by King Minos, who was happy to get rid of the animal that had destroyed the crops of the region. Heracles managed to capture the animal with his bare hands, and sent it back to Eurystheus. The king was so afraid of the animal that he hid inside a large jar upon seeing it. He later said to sacrifice it to Hera, but the goddess refused, thinking it would give further glory to Heracles. Instead, Eurystheus let it loose, which reached Marathon and acquired the name Marathonian Bull.\n" +
                "\n" +
                "Later, Theseus, son of the king of Athens Aegeus, set forth to capture the bull. He went to Marathon and indeed successfully caught it. He then returned to Athens where he sacrificed it to Athena or Apollo.";
        return cretanBullDesc;
    }

    private String cyclopes() {
        String cyclopesDesc = "The Cyclopes (singular: Cyclops) were gigantic, one-eyed monsters. Probably the most famous of them is Polyphemus, the Cyclops that was blinded by Odysseus. The Cyclopes were generally considered the sons of Titans Uranus and Gaea, but according to Homer, Polyphemus was the son of Poseidon, and the other Cyclopes were his brothers. Based on their description, they were a wild race of gigantic growth, similar in nature to the earth-born Giants, and had a single eye in the middle of their foreheads. They led a lawless life, possessing neither social manners nor fear for the gods, and were the workmen of Hephaestus, whose workshop was supposed to be in the heart of the volcanic mountain Etna.\n" +
                "\n" +
                "In this case, one may identify another striking instance of the manner in which the Greeks personified the powers of nature, which they saw in active operation around them. They observed the fire, rocks, and ash pouring from Etna and other volcanic mountains with awe and astonishment, and, with their vivacious imagination, found an explanation to the mystery; the god of Fire must be busy at work with his men in the depths of the earth, and the mighty flames coming from the depths of the earth must be a result of this.\n" +
                "\n" +
                "The chief representative of the Cyclops was the man-eating monster Polyphemus, described by Homer as having been blinded and outwitted by Odysseus. This monster fell in love with a beautiful nymph called Galatea; but, as may be supposed, his actions were not graceful nor acceptable to the fair maiden, who rejected them in favour of a youth named Acis; Polyphemus, enraged and with his usual barbarity, killed his rival by throwing upon him a gigantic rock. The blood of the murdered Acis, gushing out of the rock, formed a stream which still bears his name.\n" +
                "\n" +
                "Hesiod mentioned only three Cyclopes (not considering them a race or tribe): Arges (thunderbolt), Steropes (lightning), and Brontes (thunder), obviously storm gods. They were also the first smiths. When Cronus came to power, he imprisoned them in Tartarus. They were later released by Zeus and fought for him against the Titans. As a reward for their release, the Cyclopes gave Zeus his weapons of lighting and thunder. They continued as his workers at Mount Olympus forging his thunderbolts. Arges was killed by Hermes while he guarded Io for Hera; Apollo killed at least one of them as vengeance for the death of his son Aesculapius by Zeus.";
        return cyclopesDesc;
    }

    private String delphine() {
        String delphineDesc = "Delphyne is a female dragon in Greek mythology. Her mother was Gaea who gave her the task of guarding the oracle of Delphi. She was often accompanied by a male dragon, either Python or Typhon. Due to the different accounts and sources, she was sometimes mixed with Echidna, the mother of all monsters, who was half woman and half snake. In another source, Delphyne was appointed with guarding the sinews of Zeus, who were stolen by Typhon, and she was eventually slain by Apollo.";
        return delphineDesc;
    }

    private String echidna() {
        String echidnaDesc = "Echidna was a half-woman, half-snake creature in Greek mythology, also known as the \"mother of all monsters\", as she gave birth to most of the Greek mythical creatures. She was the wife of Typhon, who was the \"father of all monsters\" and the most fearsome and dangerous monster in said mythology. Both she and her husband were the children of Gaia and Tartarus. The couple attacked the Olympians, but Zeus managed to repel them, burying Typhon under Mount Etna; Echidna and her children were spared to continue challenging future heroes. Echidna was killed by Argus Panoptes while sleeping.\n" +
                "\n" +
                "Some of the most famous children of Echidna and Typhon were Cerberus, the three-headed hound who guarded the gates of the Underworld; the Lernaean Hydra, the multi-headed serpent that grew two heads if one was cut off; the Gorgon sisters, the best known being Medusa; and the Chimera, a creature that had the heads of a lion, a goat and snake.";
        return echidnaDesc;
    }

    private String boar() {
        String boarDesc = "The Erymanthian Boar was a fearsome animal in Greek mythology. Capturing it alive was one of the tasks that King Eurystheus asked the demigod hero Heracles to complete during the story of the Labours of Heracles.\n" +
                "\n" +
                "The boar was a giant creature living on Mount Erymanthos, a region sacred to the goddess of hunt Artemis. When the boar would reach the farmlands, it would lay waste and destroy everything in its passing. The capturing of such a fearsome animal was not an easy task, and this is why Eurystheus chose it as the fourth labour of Heracles.\n" +
                "\n" +
                "The hero set forth and initially visited a centaur who was a friend of his; his name was Pholus. The two friends had lunch and then decided to open a jar of wine; after opening it, the smell attracted all the centaurs of the mountain. They all started drinking, not realising that the wine should be mixed with water first, as was customary in ancient Greece. So, they became drunk and started attacking. Heracles shot poisonous arrows against them and the drunken centaurs retreated. Pholus was curious as to why the arrows were fatal, and while examining one, he also got poisoned. According to one account, an arrow also mistakenly hit the centaur Chiron, who, although immortal, was still able to feel the pain. So, he asked the gods to lose his immortality, and replace the Titan Prometheus who was chained on a mountain top where an eagle ate his liver daily. So it happened, and the eagle continued to eat Chiron's liver until it was shot down by Heracles.\n" +
                "\n" +
                "Heracles then asked Chiron how to catch the boar; Chiron said that he should lure it into thick snow, thus making it difficult for the animal to move. Heracles followed the centaur's advice and managed to capture the animal. He then took it back to the court of Eurystheus, who upon seeing it, was so scared that he hid inside a huge jar and asked Heracles to get rid of it.";
        return boarDesc;
    }

    private String giants() {
        String giantsDesc = "The Giants or Gigantes were a race of great strength, but not necessarily of great size, that were born out of the blood that fell onto the earth (the Titan goddess Gaea) when the Titan Uranus was castrated by his son, Cronus.\n" +
                "\n" +
                "The Giants were often confused with the Titans, who were a previous set of offspring by Uranus and Gaea. Just like the Titans who fought the Olympians during the Titanomachy, the Giants also fought Zeus and the other gods during the Gigantomachy. The Gigantomachy was probably considered the most important war among gods in Greek mythology, as it was depicted in a vast number of vases that have been found. The most detailed description that has survived belongs to Apollodorus, a mythographer of the first or second century AD. In this description, it is not mentioned why the war took place; however, it ended with the defeat of the Giants. The rule of the Olympians over the Giants probably symbolised the rule of order over chaos in Ancient Greece.\n" +
                "\n" +
                "Indicatively, some of the Giants were:\n" +
                "\n" +
                "Enceladus: he was killed by Athena by being crushed under the island of Sicily.\n" +
                "Eurymedon: he was a king of the Giants, and maybe the one who raped Hera, giving birth to Prometheus.\n" +
                "Porphyrion: he was the greatest of the Giants, but he died when Zeus threw a thunderbolt against him and Hercules or Apollo shot him with an arrow.";
        return giantsDesc;
    }

    private String gorgons() {
        String gorgonsDesc = "The Gorgons were three monsters in Greek mythology, daughters of Echidna and Typhon, the mother and father of all monsters respectively. Their names were Stheno, Euryale, and the most famous of them, Medusa. Although the first two were immortal, Medusa was not. Weirdly, Medusa was also not considered the child of Echidna and Typhon, but of Phorkys and Keto. Their faces were ugly and their hair was replaced by snakes; anyone who would gaze into their eyes would be turned to stone instantly.";
        return gorgonsDesc;
    }

    private String hecatoncheires() {
        String hecatoncheiresDesc = "The Hecatoncheires were giant creatures in Greek mythology. Their name means \"hundred - handed ones\", and apart from a hundred hands of unfathomable strength, they also had fifty heads. They were children of the Titans Uranus and Gaea; they were three, Briareus or Aegaeon (the vigorous or the sea goat), Cottus (the striker or the furious) and Gyges (the big-limbed). The natural forces that were represented by the Hecatoncheires were the earthquakes and the huge sea waves.\n" +
                "\n" +
                "Uranus, their father, threw them into Gaea's womb, which infuriated her; thus, this started her plotting towards the overthrow of her husband. She helped her son Cronus defeat his father, but when he came into power, he also imprisoned them in Tartarus. During the Titanomachy, the War between the Titans and the Olympians, Gaea sided with Zeus and told him to free the Cyclopes as they would be worthy allies; thanks to their help, the Titans were overthrown and Zeus made them the guards of Tartarus.";
        return hecatoncheiresDesc;
    }

    private String laelaps() {
        String laelapsDesc = "Laelaps was a dog in Greek mythology that always caught what he hunted. According to one source, Laelaps was the gift Zeus gave to Europa. The dog was later given to King Minos; Cephalus, who was Procris' husband, decided to use Laelaps in order to catch the Teumessian fox, which could never be caught. So, a paradox formed; a dog that always caught what it hunted, was after a fox that could never be caught. When Zeus realised what was going on and that the two animals would run for eternity, he decided to turn them both to stone, and then into constellations; Laelaps became the constellation Canis Major and the Teumessian fox became Canis Minor.";
        return laelapsDesc;
    }

    private String marsyas() {
        String marsyasDesc = "Marsyas was a satyr in Greek mythology, and he played an important role in two myths.\n" +
                "\n" +
                "In one myth, he played the aulos masterfully, a double-piped reed instrument. One day, he found an aulos down on the ground, which had been thrown aside by the goddess Athena; she had made the aulos, but had cursed it and thrown it after the other gods mocked her of how her cheeks moved when she played.\n" +
                "\n" +
                "In the other myth, Marsyas challenged the god of music Apollo to a contest of music. The contest was judged by the Muses, and Marsyas naturally lost. For committing hubris against Apollo, Marsyas was hanged inside a cave and was flayed alive. A source has it that Apollo later repented for the excessive punishment, and stopped playing the lyre for some time. Gods and nymphs mourned for Marsyas' death, and their tears were joined to create the river Marsyas which flew through the region of Phrygia. According to a different source, Marsyas didn't actually commit hubris, but it was Apollo who challenged the satyr to the contest because he was jealous of how masterfully Marsyas played the aulos.";
        return marsyasDesc;
    }

    private String nessus() {
        String nessusDesc = "Nessus was a centaur in Greek mythology, who was killed by Heracles and this eventually led to the hero's demise. He was the son of Centaurus, who was the father of all creatures known as the centaurs.\n" +
                "\n" +
                "Nessus is well known for his part in the story of the Shirt of Nessus. He was a ferryman, and one day, he had to carry Deianeira, wife of Heracles, across the river. After they crossed the river, Nessus tried to have sex with her, but Heracles watching from the other riverbank, shot an arrow straight into Nessus' chest. Before he drew his final breath, Nessus told Deianeira that his blood would ensure that her husband would be faithful to her in eternity. Deianeira believed him and collected some of the centaur's blood.\n" +
                "\n" +
                "Years later, Heracles fell in love with Iole, and Deianeira, afraid that he might abandon her, dipped a shirt or tunic into the centaur's blood and gave it to him as he was leaving for a gathering. After he left, she accidentally spilled some of the blood on the floor, where it started fuming. She then realised that it was in fact poison and tried to stop Heracles from wearing the shirt. However, the hero had already worn it and his flesh had started burning; in deep pain, he threw himself in a funeral pyre and died.";
        return nessusDesc;
    }

    private String pegasus() {
        String pegasusDesc = "Pegasus was a flying horse in Greek mythology, usually depicted as white coloured. His father was Poseidon and his mother was the Gorgon Medusa; he was born along with his brother Chrysaor when Medusa was decapitated by Perseus. Pegasus was captured and tamed by the Greek hero Bellerophon and helped him in his fights against the Chimera and the Amazons. Later, Bellerophon continued riding Pegasus on their way to Mount Olympus, but Zeus dismounted him on the way; Pegasus continued on the journey and reached Olympus.";
        return pegasusDesc;
    }

    private String pheonix() {
        String pheonixDesc = "A phoenix in Greek mythology was a bird that could live for a long time and could also be regenerated or reborn from the ashes of its predecessor. Some sources say that the phoenix simply died and decomposed before being reborn, but others claim that it would combust and die wrapped in flames. It was believed that it could live over 1400 years at a time.\n" +
                "\n" +
                "In ancient Greece, the phoenix was also linked to the civilization of Phoenicia, which has a similar sound to it. Phoenicia was famous for producing a purple dye from conch shells; this hue was also believed to be the colour of the bird's feathers. Other sources, however, say that it was coloured similarly to a peacock, or that it was red and yellow.";
        return pheonixDesc;
    }

    private String polyphemus() {
        String polyphemusDesc = "Polyphemus was the giant son of the god Poseidon and Thoosa in Greek mythology. He was one of the Cyclopes, having a single eye.\n" +
                "\n" +
                "According to the Odyssey, Odysseus arrived at the island of the Cyclops (Sicily), while trying to go back to his homeland, Ithaca. There, he and his men went into a cave that was full of food. Polyphemus, who dwelled in the cave, returned and sealed the entrance, so that none would escape; then he grabbed two of Odysseus' men and ate them. The next morning, he left to attend to his sheep, but not without eating two more of the men.\n" +
                "\n" +
                "Upon his return, Odysseus offered him some strong wine he had with him, intoxicating him. Polyphemus, drunk, asked what the kind man's name was, and Odysseus replied \"No one\". Polyphemus said that he would eat \"No one\" last for gratitude, and fell into a deep sleep. Odysseus, having planned this, took a wooden stake and blinded Polyphemus' single eye. The giant started screaming for help, but when the other giants arrived, they told them \"No one\" had blinded him; his friends thought that a god had attacked him and told him to pray.";
        return polyphemusDesc;
    }

    private String python() {
        String pythonDesc = "Python was the earth-dragon of Delphi in Greek mythology, and presided at the oracle of the area. At that time, the oracle honoured the Titan goddess Gaea.\n" +
                "\n" +
                "According to a source, when Zeus slept with the goddess Leto, impregnating her with the twin gods Artemis and Apollo. However, Hera was so angry at her husband's infidelity that she told Python to hunt Leto, so that she doesn't give birth anywhere that the sun shone. Leto was eventually accepted at the newly formed island of Delos, where she bore her twins. When Apollo grew up, he wanted to take revenge and thus pursued the dragon. Python, chased by Apollo, left Mount Parnassus where he lived and went to the Oracle of Gaea at Delphi. There, Apollo killed the dragon; however, Zeus told him he needed to redeem himself as he had committed such a sacrilegious act. So, Apollo became the founder of the Pythian Games, in order to purify himself.";
        return pythonDesc;
    }

    private String silenus() {
        String silenusDesc = "Silenus was a companion of the god of wine Dionysus in Greek mythology. He was much older than the satyrs, followers of the god, and had the characteristics of a horse rather than a goat. A group of Dionysus' followers was also named Sileni (plural), their most notable characteristic being that they were drunk. Eventually, the word was used as a name of the teacher and close companion of the god.\n" +
                "\n" +
                "Silenus was always drunk and was either supported by satyrs or on a donkey. While drunk, it was believed that he acquired arcane knowledge and was able to predict the future. According to a myth, King Midas of Phrygia managed to catch Silenus when he was drunk by a fountain in order to learn his secrets. A different version has it that Silenus was lost in the region of Phrygia, and was eventually found by peasants who took him to the king. Midas welcomed him and treated him kindly, and Dionysus, wanting to repay for the kindness he showed towards Silenus, told him he would give him a reward; Midas asked for the ability to turn everything he touched into gold.";
        return silenusDesc;
    }

    private String sirens() {
        String sirensDesc = "The Sirens were beautiful but dangerous creatures that lured the sailors with their beautiful voices to their doom, causing the ships to crash on the reefs near their island. They were the daughters of the river god Achelous, while their mother may have been Terpsichore, Melpomene, Sterope or Chthon. Although closely linked to marine environments, they were not considered sea deities. The texts mentioning the Sirens provide different opinions as to their number and their names; some mention two or three; others mention more.\n" +
                "\n" +
                "The Sirens were probably considered the companions of Persephone, daughter of goddess Demeter. The latter had given them wings in order to protect her daughter; however, after Persephone's abduction from Hades, Demeter cursed them. The Sirens' song was a beautiful, yet sad melody, eternally calling for Persephone's return.\n" +
                "\n" +
                "The Argonauts encountered the Sirens but successfully evaded them; Orpheus, who was on board, started playing his lyre so beautifully that the music completely drowned the Sirens' song. Another well-known encounter is that described in the Odyssey; Odysseus, advised by Circe, plugged the crew's ears with wax and ordered them to bind him on the mast of the ship. He also told them that no matter how much he begged, they should not untie him. When they passed near the Sirens' island, Odysseus started begging his shipmates to let him go, but none heard him; instead, they tied him even more. After they passed, Odysseus let them know that they were now in safe waters.";
        return sirensDesc;
    }

    private String talos() {
        String talosDesc = "Talos was a giant bronze man in Greek mythology, who protected Europa in Crete from pirates. According to one version, Talos was forged by the blacksmith god, Hephaestus, who gifted him to King Minos of Crete. Talos had a single vein, through which ichor, the divine blood of the Olympians, flowed. This vein was plugged by just one bronze nail. When Jason and the Argonauts reached Crete after having retrieved the Golden Fleece, they came across Talos, who started hurling giant rocks against the ship, being the guardian of the island. Medea, who was on board, managed to trick Talos and removed the nail that plugged Talos' vein; the ichor ran out, and Talos died.";
        return talosDesc;
    }

    private String fox() {
        String foxDesc = "The Teumessian fox was an animal in Greek mythology that always evaded its hunter. According to a myth, it was sent by a god, possibly Dionysus, to punish the city of Thebes for a crime the people had committed. Eventually, Creon, the regent of the city, told Amphitryon to catch and kill the fox, who had the idea of bringing the dog Laelaps in his aid; Laelaps was able to catch whatever prey it was after. Thus, a paradox was created; a fox that could never be caught was hunted by a dog that caught everything it hunted. Zeus, seeing that the hunt would continue for an eternity, turned both animals into stone and then into constellations; Laelaps became the constellation Canis Major, and the Teumessian Fox became Canis Minor.";
        return foxDesc;
    }

    /*    <!--Argus Panoptes :: Arion :: Ash Tree Nymphs :: Centaur :: Cerberus :: Ceryneian Hind :: Chimaera ::  :: Chrysaor :: Cretan Bull :: Cyclopes ::
    Delphyne :: Echidna :: Erymanthian Boar :: Giants :: Gorgons :: Hecatoncheires :: Laelaps ::
    Marsyas ::  :: Nessus :: Pegasus :: Phoenix :: Polyphemus : :: Python :: Silenus :: Sirens :: Talos :: Teumessian fox-->*/
}

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

public class MythsActivity extends AppCompatActivity {

    GridView gridViewMyths;
//    <!--Adventures of Perseus :: Ages of Man :: Amalthea's Horn :: Argonauts :: Birth of Athena ::
//      Creation of Man by Prometheus :: Gigantomachy :: Labours of Heracles :: Myth of Er ::
//    Seven Against Thebes :: The Creation :: The Creation II :: The Wanderings of Dionysus ::
//    Theseus Adventures :: Titanomachy :: Trojan War :: Zeus's Lovers-->
    int myths[] = {R.string.myths_perseus,R.string.myths_age_of_man,R.string.myths_amaltheas_horn,
            R.string.myths_argonauts,R.string.myths_athena_birth,R.string.myths_creation_prometheus,
            R.string.myths_gigantomachy,R.string.myths_heracles,R.string.myths_er,R.string.myths_againts_thebes,
            R.string.myths_creation,R.string.myths_creation_ii,R.string.myths_dionysus,R.string.myths_thesus,
            R.string.myths_titanomachy,R.string.myths_trojan_war,R.string.myths_zeus_lovers};

    int mythsIcons[] = {R.drawable.heroes,R.drawable.myths_ageofman,R.drawable.myths_horn,
            R.drawable.myths_argonauts,R.drawable.myths_athena,R.drawable.myths_creationofman,
            R.drawable.myths_gigantomachy,R.drawable.heroes_heracles,
            R.drawable.myth_er,R.drawable.myths_seventhebes,R.drawable.myths_creation,R.drawable.myths_creationii,
            R.drawable.myths_dionysus,R.drawable.heroes_theseus,R.drawable.myths_titanomachy,R.drawable.myths_trojanwar,R.drawable.myths_zeuslovers};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myths);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        gridViewMyths = (GridView) findViewById(R.id.gridview_myths);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),myths,mythsIcons);
        gridViewMyths.setAdapter(adapter);

        gridViewMyths.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeMythsActivity(myths[position], mythsIcons[position], perseus());
                        break;
                    case 1:
                        makeMythsActivity(myths[position], mythsIcons[position], ageOfMan());
                        break;
                    case 2:
                        makeMythsActivity(myths[position], mythsIcons[position], horn());
                        break;
                    case 3:
                        makeMythsActivity(myths[position], mythsIcons[position], argonauts());
                        break;
                    case 4:
                        makeMythsActivity(myths[position], mythsIcons[position], athena());
                        break;
                    case 5:
                        makeMythsActivity(myths[position], mythsIcons[position], prometheus());
                        break;
                    case 6:
                        makeMythsActivity(myths[position], mythsIcons[position], giganthomachy());
                        break;
                    case 7:
                        makeMythsActivity(myths[position], mythsIcons[position], heracles());
                        break;
                    case 8:
                        makeMythsActivity(myths[position], mythsIcons[position], erMyth());
                        break;
                    case 9:
                        makeMythsActivity(myths[position], mythsIcons[position], sevenThebes());
                        break;
                    case 10:
                        makeMythsActivity(myths[position], mythsIcons[position], creation());
                        break;
                    case 11:
                        makeMythsActivity(myths[position], mythsIcons[position], creation2());
                        break;
                    case 12:
                        makeMythsActivity(myths[position], mythsIcons[position], dionysus());
                        break;
                    case 13:
                        makeMythsActivity(myths[position], mythsIcons[position], theseus());
                        break;
                    case 14:
                        makeMythsActivity(myths[position], mythsIcons[position], titanchomachy());
                        break;
                    case 15:
                        makeMythsActivity(myths[position], mythsIcons[position], trojanwar());
                        break;
                    case 16:
                        makeMythsActivity(myths[position], mythsIcons[position], zeuslovers());
                        break;
                    default:
                        Toast.makeText(MythsActivity.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void makeMythsActivity(int title, int image, String description) {
        Intent intent = new Intent(MythsActivity.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String perseus() {
       String perseusDesc = "Perseus' life was a very interesting one, full of adventures. He was the son of the god Zeus and Danae. His reputation and character quickly turned him into a local hero of Argos (a place in Peloponese, Greece). Arcisius, Perseus' grandfather, had asked an oracle if he would ever have any kids; the answer he got was shocking and led him to live in a life of paranoia. He was told that his daughter would have a son that would eventually kill him. Arcisius, driven by the force of fear, had his daughter Danae jailed in an underground cave with brass walls. Nevertheless, the mighty Zeus, who had an eye for beauty and a way with women few dared to compete, had already spotted the beautiful maiden. He transformed into a shower of golden rain and entered the cave where Danae was held. Through their union, Danae gave birth to a baby boy, that she managed to keep secret for some time.\n" +
               "\n" +
               "It wasn't long, though, that her angry father found out about the baby. He refused to believe that Zeus had anything to do with it, so he condemned Danae's nurse to death, as he believed that she orchestrated this affair. He thought about killing his grandson himself, but his guilt would not let him. Desperately seeking a solution that would pose no danger to his life, he made up his mind. He had a wooden ark built for his daughter and his grandson, and he immediately ordered the two of them to be placed in it and to be set adrift at sea.\n" +
               "\n" +
               "Days and nights passed, Danae and her baby barely alive. Eventually, the wooden ark washed up on the island of Seriphos. There, a fisherman named Dictes, who was the brother of Polydectes, the ruler of the island, found it. He kindly took in young Perseus and his mother and shared his home with them. During this time, Perseus grew into a strong and brave man blessed with many talents, undoubtedly the result of a god's grace. However, Polydectes fell in love with Danae, and Perseus, wanting to protect her, kept his mother under guard at all times. So, Polydectes devised a plan; he invited some friends for dinner, and asked them what gift they would bring him if he was ever to ask for one. Perseus answered that if it was necessary, he would bring the head of Medusa, the Gorgon, to him; Medusa was a fearsome monster, who turned to stone anyone who would be unlucky to stare her in the eyes. The King agreed and asked Perseus to bring him the head of the Medusa, otherwise, he would take his mother by force.\n"+
               "Perseus set forth on his adventure to get Medusa's head. The Gods, of course, who loved to intervene in the affairs of mortals, would not leave Perseus helpless. Both Athena and Hermes set out to help Perseus with this challenge. With his intelligence and wit, Perseus managed to trick the nymphs. They gave him winged sandals, so he could fly above the ground; a bag, so he could carry the head of the Medusa; and the helmet of Hades, which would make him invisible. Using the winged sandals, Perseus flew above Medusa, looking only at her reflection using the shiny shield that Athena had given him. Invisible thanks to Hades' helmet, Perseus cut Medusa's head off, placed it in the bag and set for home.\n" +
               "\n" +
               "On his way home, he met Andromeda whom he rescued from a sea monster. They quickly fell in love and decided to get married. However, Andromeda's uncle, who wanted her for himself, disagreed and plotted to murder Perseus. Having Medusa's head gave Perseus a great advantage. He took out the head and as soon as Andromeda's uncle look at it, he turned into stone. When Perseus arrived home, he did the same with Polydectes, who was harassing Perseus' mother.\n" +
               "\n" +
               "What happened to Arcisius, Perseus' grandfather, though? Upon hearing of Perseus' achievements, he fled far away, but that wasn't enough to escape his fate. Much, he attended at a games ceremony in the city of Larissa, which was arranged by King Tentamides. Perseus participated in the event; when it was his turn to throw the discus, it slipped from his hand and hit his grandfather on the head, killing him. When Perseus found out he had killed his grandfather, he was deeply saddened and he buried him with honour.";
       return perseusDesc;
    }


    private String ageOfMan() {
        String ageOfManDesc = "According to Greek mythology, humankind passed through a number of eras that were characterised by specific events, and were known in ancient Greece as the Ages of Man. Hesiod, a famous ancient Greek poet, recognised five ages, while Ovid, a Roman poet, believed there were four.\n" +
                "\n" +
                "According to Hesiod, the five ages of man were:\n" +
                "\n" +
                "- The Golden Age. During the Golden Age of Man, the ruler of gods and men was the Titan Cronus. Mankind lived harmoniously among the gods and interacted with them. There was an abundance of food that nature provided, and humans did not need to work; so, they were able to live to a very old age, and when they died, it happened harmoniously and peacefully.\n"+
                "- The Silver Age. Starting from the Silver Age until the time of Hesiod, it was believed that Zeus was the god of gods and ruler of the universe. Men would live as children for a hundred years, supported by their mothers, while as adults, they lived for a very short time as they regularly clashed with each other. They did not pay tributes to the gods, for which reason Zeus killed all of them.\n" +
                "\n" +
                "- The Bronze Age. During this period, men were tough, trained, and warlike. They used bronze to create their weapons and dwellings, and eventually destroyed each other in wars. The end of this era was marked by the great flood of Deucalion.\n" +
                "\n" +
                "- The Heroic Age. After three eras of the mankind deteriorating in spirit, the Heroic Age was an improvement to the Bronze Age. This was the time that heroes and demigods lived, great fighters whose deeds would be sung for centuries to come.\n" +
                "\n" +
                "- The Iron Age. Hesiod believed he and his contemporaries were in the Iron Age, an age of desolation, destruction and pain. Humans would fight against each other and would only care of themselves. Because of lack of shame and indignation, humankind would destroy itself, and the gods would abandon them.\n" +
                "\n" +
                "According to Ovid, only four ages existed, and he completely disregarded the Heroic Age. During the Golden Age, men were unable to travel far and could not explore the whole world. During the Silver Age, Jupiter (the Roman equivalent of Zeus) offered the seasonal change, as well as the art of agriculture to men. For Ovid, the Bronze Age was also marked by warfare, while in the Iron Age, men were not only warlike, but also impious, and disloyal.";
        return ageOfManDesc;
    }


    private String argonauts() {
        String argonautsDesc = "The Argonauts were a number of heroes who participated in the Argonautic Expedition, setting sail for the mythical land of Colchis under the command of their leader Jason, in order to find the legendary Golden Fleece.\n" +
                "\n" +
                "The story unravels years before the Trojan War, when King Cretheus of Iolcus died and Pelias usurped the throne from his half-brother Aeson. However, he was told of a prophecy, according to which a descendant of Aeolus would seek revenge for his acts. Killing every possible descendant of Aeolus, Pelias spared his half-brother and incarcerated him. Aeson married Alcimede, who gave birth to Jason; faking her newborn's death to trick Pelias, Alcimede managed to hide her son in an area near Mount Pelion, where the centaur Chiron raised and nurtured him.\n" +
                "\n" +
                "As a young man, Jason returned to Iolcus under Hera's command. He attended a sacrifice to Poseidon where Pelias and other kings were present, and his uncle recognised him. Unable to kill him in front of so many guests, Pelias told him to fetch the Golden Fleece which was hanging from a tree somewhere in the far-away land of Colchis. This venture sounded impossible as the Fleece was guarded by a never-sleeping dragon. In fact, Pelias was so certain the mission would fail that he swore he would give up the throne if Jason returned with the Golden Fleece.\n" +
                "\n" +
                "Over 80 brave companions signed up for the journey Jason set out to complete. The expedition eventually succeeded, helped by Hera, and Jason returned with his companions to Iolcus, bringing along the Golden Fleece.";
        return argonautsDesc;
    }


    private String horn() {
        String hornDesc = "When Rhea gave birth to Zeus, she put him in a cave, located at Mount Ida in the island of Crete. In this way, his father Cronus would be unable to find him and swallow him, which he had done with his previous children. There, it was the goat Amalthea (Amaltheia) that nourished Zeus with her milk until he was grown up.\n" +
                "\n" +
                "One day, as young Zeus played with Amalthea, he accidentally broke off her horn. To make up for it and as a sign of gratitude, Zeus blessed the broken horn, so that its owner would find everything they desired in it. It became known as the Horn of Amalthea or the Cornucopia, an eternal symbol of abundance. When Amalthea died, Zeus used her hide to create his thunder-shield (the Aegis).";
        return hornDesc;
    }


    private String athena() {
        String athenaDesc = "Zeus came to lust after Metis, and chased her in his direct way. Metis tried to escape, going so far as to change her form many times; she changed into various creatures such as hawks, fish, and serpents. However, Zeus was both determined and equally proficient at changing form. He continued his pursuit until she relented.\n" +
                "\n" +
                "An oracle of Gaea then prophesied that Metis' first child would be a girl and that her second child would be a boy that would overthrow Zeus, similarly to what had happened to his father and grandfather. Zeus took this warning to heart. When he next saw Metis, he initially flattered her and put her at her ease. Then, with Metis' guards down, Zeus opened his mouth and swallowed her and her unborn child. This was the end of Metis, but also the beginning of Zeus' wisdom.\n" +
                "\n" +
                "After a time, Zeus developed an unbearable headache, which made him scream out of pain so loudly it could be heard throughout the earth. The other gods came to see what the problem was. Hermes realized what needed to be done and directed Hephaestus to take a wedge and split open Zeus's skull. Out of the skull sprang Athena, fully grown and in a full set of armour. Due to the way of her birth, she became the goddess of intelligence and wisdom.";
        return athenaDesc;
    }


    private String prometheus() {
        String prometheusDesc = "Prometheus and Epimetheus, two Titans, were spared imprisonment in Tartarus after the Titanomachy, the War between the Titans and the Olympians, because they had not fought alongside the other Titans. Instead, they were given the task of creating man. Prometheus shaped man out of mud, and Athena breathed life into his clay figure.\n" +
                "\n" +
                "Prometheus assigned Epimetheus with the task of giving the creatures of the earth their various qualities, such as swiftness, cunning, strength, fur, wings. Unfortunately, by the time he got to man, Epimetheus had given all the good qualities out and there were none left for man. So Prometheus decided to make man stand upright just like the gods did and to give them fire.\n" +
                "\n" +
                "Prometheus loved man more than the Olympians, who had banished most of his family to Tartarus. So when Zeus decreed that man must sacrifice a portion of each food to the gods, Prometheus decided to trick Zeus. He created two piles, one with bones wrapped in juicy fat, and another with the finest meat hidden inside a hide. He then asked Zeus to choose one of the piles; Zeus, unaware, chose the bones and since he had given his word, was forced to accept the bones as his share for future sacrifices. In his anger over the trick, he took fire away from man. However, Prometheus lit a torch from the sun and brought it back again to man. Zeus was enraged that man again had fire. He decided to inflict a terrible punishment on both man and Prometheus.\n"+
                "To punish man, Zeus had Hephaestus create a mortal of stunning beauty. The gods gave the mortal many gifts of wealth. He then had Hermes give the mortal a deceptive heart and a lying tongue. This creation was Pandora, the first woman. A final gift was a jar which Pandora was forbidden to open. Thus, Zeus sent Pandora to Epimetheus, who had decided to live amongst men.\n" +
                "\n" +
                "Prometheus had warned Epimetheus not to accept gifts from Zeus, but Pandora's beauty was too great; so, he let her stay. Eventually, Pandora's curiosity about the forbidden jar overwhelmed her; she opened it, releasing all evils upon the earth. Only one thing was left in the jar when Pandora managed to close the lid again - hope.\n" +
                "\n" +
                "Zeus was angry at Prometheus for three things: being tricked on sacrifices, stealing fire for man, and for refusing to tell Zeus which of Zeus's children would dethrone him. Zeus commanded his servants, Force and Violence, to seize Prometheus, take him to the Caucasus Mountains, and chain him to a rock with unbreakable, diamond chains. There, he was tormented day and night by a giant eagle tearing at his liver. Zeus gave Prometheus two ways out of this torment. He could tell Zeus who the mother of the child that would dethrone him was. Or meet two conditions: first, that an immortal must volunteer to die for Prometheus. And second, that a mortal must kill the eagle and unchain him. Eventually, Chiron the Centaur agreed to die for him and Heracles killed the eagle and unbound him.";
        return prometheusDesc;
    }


    private String giganthomachy() {
        String giganthomachyDesc = "The Gigantomachy was probably the most important battle that happened in Greek mythology. It was a fight between the Giants or Gigantes, sons of Gaea and Uranus, and the Olympian gods who were trying to overthrow the old religion and establish themselves as the new rulers of the cosmos.\n" +
                "\n" +
                "According to the most detailed source for this battle, what started the war was the Giant Alcyoneus stealing the cattle of god Helios. A prophecy had it that the Giants would only be defeated if a mortal was to help the gods. To protect her children, Gaea tried to find a plant that would shield the Giants from any harm; however, Zeus stopped Eos (Dawn), Selene (Moon) and Helios (Sun) from shining, and took every single plant for himself. When the battle began, Heracles fought Alcyoneus; however, the Giant would not die as long as he stepped on the soil of his homeland. With Athena's advice, Heracles dragged Alcyoneus away from his homeland, and killed him. The other Giants had similar fates; Dionysus killed Eurytus; Athena buried Enceladus under Sicily; Hermes killed Hippolytus; and so on. Many of the Giants were buried under islands. In fact, it was believed that the earthquakes and the volcanic eruptions were caused when the Giants moved in their tombs.";
        return giganthomachyDesc;
    }


    private String heracles() {
        String heraclesDesc = "The Twelve Labours of Heracles were a number of tasks that the mythical hero Heracles was told to complete by King Eurystheus. It all started when Hera, who loathed Heracles for he was a living cactustree of her husband's infidelities, drove the hero mad, making him kill his wife Megara and his children. When he realised what he had done, he deeply regretted it and went to the Oracle of Delphi to ask for penance. There, he was told to serve Eurystheus, king of Tiryns, for twelve years; if he completed all tasks he would be given, he would become immortal. Although Heracles did not like this as he considered Eurystheus to be a lesser person than himself, he decided to follow the Oracle's advice.\n" +
                "\n" +
                "When he arrived in Tiryns, Eurystheus initially asked Heracles to perform ten labours. These ten labours were:\n" +
                "\n" +
                "to kill the Nemean Lion,\n" +
                "to kill the Lernaean Hydra,\n" +
                "to capture the Ceryneian Hind,\n" +
                "to capture the Erymanthian Boar,\n" +
                "to clean the stables of Augeas in one day,\n" +
                "to kill the Stymphalian Birds,\n" +
                "to capture the Cretan Bull,\n" +
                "to steal the Mares of Diomedes,\n" +
                "to steal the girdle of the queen of the Amazons, Hippolyta, and,\n" +
                "to steal the cattle of the monster Geryon.\n\n"+
                "The Nemean lion was a terrible monster that roamed in the region of Nemea, capturing women as hostages and luring brave men to save them. When someone entered the lion's den and tried to free the woman, she would turn into the lion and eat the warrior alive. When Heracles arrived in a town of the region, he met a boy who asked him to kill the lion. He also told him that if Heracles killed the lion within a month, a lion would be sacrificed to Zeus; otherwise, the boy would sacrifice himself.\n" +
                "\n" +
                "Heracles eventually found the lion roaming, and shot many arrows against it. Only then did he realise that the lion's skin was impenetrable, and that his arrows would be of no use. So, he decided to follow it to its den. There, he blocked one of the two entrances to the cave and entered through the other. Fumbling in the dark, Heracles managed to find the lion; he stun it with his club and then he strangled it with his bare hands.\n" +
                "\n" +
                "After he had killed it, he thought of taking the impenetrable skin of the lion and use it as an armour. So, he managed to skin it with the help of the goddess Athena, who advised him to use the lion's claw to remove the pelt. Wearing the lion skin, Heracles entered the city on the thirtieth day. Upon seeing him, Eurystheus was initially horrified, for he feared the lion was roaming in the streets of the city.\n" +
                "\n" +
                "Labour two: slaying the Lernaean Hydra\n" +
                "\n" +
                "The Lernaean Hydra was a fearsome monster that lived in the swamp of the lake Lerna. It had been specifically raised by Hera to kill Heracles. The Hydra had nine heads, one of which was immortal and the rest were mortal.\n" +
                "\n" +
                "The swamp was covered in a poisonous mist, so upon his arrival, Heracles put a cloth on his mouth and nose. To lure the Hydra out of its lair, the hero shot flaming arrows, achieving his intent. However, when he chopped one of the Hydra's heads, he realised in horror that two new heads would spring back.\n" +
                "\n" +
                "At that point, the hero felt hopeless, so he asked for the help of his nephew, Iolaus. Iolaus, probably advised by the goddess Athena who favoured the hero, thought of an idea and put it in action; as soon as Heracles would chop one of the monster's heads, Iolaus would cauterise the stump with a firebrand. The plan was successful; no more heads would appear. Hera, angry that her side was losing the battle, sent a huge crab to distract Heracles, which he simply squashed under his foot. When it was time for the immortal head to be cut off, Heracles took a golden sword that Athena gave him, and using the same technique, the two heroes managed to kill the monster.\n" +
                "\n" +
                "Before Heracles left, he dipped his arrows in the poisonous blood of the Hydra, one of which he later used to kill the centaur Nessus; this would later become Heracles' doom, as the hero died due to the Shirt of Nessus which was smeared in the centaur's blood containing some of Hydra's poison. Hera turned her slain monster into the constellation of the same name, while she transformed the crab into the constellation Cancer.\n" +
                "\n" +
                "Eurystheus did not count the success of killing the hydra as one of the labours, using as an excuse the fact that Heracles was helped by Iolaus.\n" +
                "\n" +
                "Labour three: capturing the Ceryneian Hind\n" +
                "\n" +
                "In their effort to mark an end to Heracles' successes, Eurystheus and Hera decided that the next task Heracles should do would be to capture the Ceryneian Hind. This was a sacred deer belonging to the goddess Artemis, and had golden antlers and hooves of bronze. It was believed that it was so fast that it could outrun a flying arrow.\n" +
                "\n" +
                "Heracles made a real effort to track the animal. When he saw it, he followed it for a whole year through the lands of Greece, Thrace, Istria and the land of Hyperboreans. According to one version of the myth, he managed to capture the hind while it was sleeping. On his way back, Artemis and her twin brother Apollo appeared in front of Heracles. This task was given by Eurystheus, thinking that Heracles would cause the anger of the goddess and that she would punish him. However, when she appeared in front of him, Heracles asked for forgiveness, explaining to her that this was part of his penance for killing his wife and children. He also told her he would return the hind to her as soon as he showed it to Eurystheus. Artemis accepted his apology and let him go.\n" +
                "\n" +
                "When he returned to the king's court, Eurystheus told Heracles that the animal now belonged to him. Not forgetting his promise to the goddess, Heracles tricked Eurystheus by telling him he should take the animal himself and bring it to the palace. When Eurystheus came out to take the deer, the hero let it go and the animal ran back to Artemis. Heracles simply replied to Eurystheus that he was not been quick enough.\n" +
                "\n" +
                "Labour four: capturing the Erymanthian Boar\n" +
                "\n" +
                "The Erymanthian Boar was a giant animal living on Mount Erymanthos, which was dedicated to the goddess Artemis as well. Eurystheus thought that capturing this beast would be the perfect task that would lead to the hero's death. Heracles set forth on his journey to the mountain, but decided to stop by his friend's place, Pholus, a kind centaur. After eating together, Heracles asked his friend to open a jug of wine that he had, which attracted the other centaurs to Pholus' dwelling. Not knowing that wine was supposed to be watered down before being consumed, the centaurs quickly became drunk and attacked Heracles. The hero killed most of them by shooting his poisonous arrows against them; the centaurs that remained fled to Chiron's cave.\n" +
                "\n" +
                "Pholus did not understand why these arrows were so lethal. Out of curiosity, he picked one up but it fell on his foot and poisoned him as well. Another version has it that one of the arrows mistakenly hit Chiron as well; although Chiron, being immortal, did not die, he could still feel an insufferable pain. Not able to withstand it, the wise centaur asked to be rid of the pain, exchanging his immortality as well as take the place of the Titan Prometheus, who was bound on the top of a mountain and his liver was being eaten daily by an eagle. Zeus accepted the exchange. Heracles then killed the eagle with one of his arrows, stopping the torture for Chiron.\n" +
                "\n" +
                "Chiron advised Heracles how to catch the Erymanthian Boar; he told him that it would be very easy if the hero lured the boar into thick snow. Heracles followed Chiron's advice and captured the boar in no time. He then returned to Eurystheus, who upon seeing the creature was so scared that he hid himself in a large jar and asked Heracles to get rid of the animal.\n" +
                "\n" +
                "Labour five: cleaning the stables of Augeas\n" +
                "\n" +
                "King Augeas of Elis had a large number of cattle in his stables. All of them were blessed with perfect health and immortality, and being so lively, created a huge amount of dung. The stables of Augeas had never been cleaned in thirty years, and Eurystheus asked Heracles to clean them within a day. This task was set to stain Heracles' reputation as it was quite humiliating.\n" +
                "\n" +
                "When Heracles reached Augeas' court, he asked for one tenth of the cattle if he managed to clean the stables in a day; the king agreed. The hero managed to complete the task by diverting the rivers Alpheus and Peneus to pass through the stables and wash them out. Augeas refused to pay Heracles, and the hero took him to court, where he managed to win his claim, backed by Augeas' son, Phyleus. However, Phyleus and Heracles were both banished by Augeas before the court had ruled. Furious, Heracles returned to Elis, killed Augeas and handed the throne to Phyleus. This is when he was said to have founded the Olympic Games.\n" +
                "\n" +
                "Although Heracles was successful, Eurystheus did not count it as a success, saying that it was the rivers that had done the work for him, and that he accepted payment for it.\n" +
                "\n" +
                "Labour six: slaying the Stymphalian Birds\n" +
                "\n" +
                "Eurystheus' next task to Heracles was to kill the Stymphalian birds, large flying monsters that ate humans with their bronze beaks; their wings were made of metallic feathers that could be thrown against their prey, while their dung was highly poisonous. They belonged to the god of war, Ares, and lived in the area of the lake Stymphalia, where they destroyed all the surrounding area and the towns.\n" +
                "\n" +
                "Heracles was unable to go too deep into the swamp as he would eventually drown. Athena helped him by providing him with a rattle; the sound the rattle produced scared the birds and made them fly from their hiding place. While in the air, they were an easy target for Heracles, who shot many of them down with his poisonous arrows. The remaining birds flew away to plague other lands; in fact, they were later encountered by the Argonauts.\n" +
                "\n" +
                "Labour seven: capturing the Cretan Bull\n" +
                "\n" +
                "The seventh task Eurystheus gave to Heracles was to capture the Cretan Bull. This was a legendary creature that wreaked havoc on the island of Crete, destroying crops and land. After getting permission from King Minos, Heracles managed to catch the bull with his bare hands and sent it back to Eurystheus' court. Upon seeing the creature, Eurystheus hid in his jar and decided to sacrifice the animal to Hera. The goddess rejected the offer, as this would glorify Heracles' success even more. Instead, the animal was left free and went to the area of Marathon, getting the name Marathonian Bull. It was later caught by Theseus and was sacrificed to Athena and Apollo.\n" +
                "\n" +
                "Labour eight: stealing the Mares of Diomedes\n" +
                "\n" +
                "The Mares of Diomedes were fearsome animals that had been trained to eat human flesh. They were owned by Diomedes, king of Thrace. It was believed that due to their unnatural diet, the horses were seized with madness, uncontrollable and sometimes they even breathed fire. According to one source, Heracles brought a number of young men with him to help him with his task. After they managed to steal the animals, they were all chased by Diomedes and his army. Heracles told his companion Abderus to take care of the horses, while he was fighting Diomedes. Upon his return, Heracles realised that Abderus was devoured by the mares. Overcome with anger, Heracles fed Diomedes to his own horses, and later founded the city of Abdera in memory of his friend. After the horses were fed, they became calm and Heracles seized the opportunity to bind their mouths shut. He brought them back to Eurystheus, who either sacrificed them to Hera or left them roam free, as they had now become permanently calm.\n" +
                "\n" +
                "Labour nine: stealing the girdle of Hippolyta\n" +
                "\n" +
                "Admete, the daughter of Eurystheus, learned that Hippolyta, queen of the Amazons, had been given a girdle as a gift from her father, Ares, and wanted it for herself. So, Eurystheus decided to make this the ninth labour that Heracles would have to complete.\n" +
                "\n" +
                "Heracles took some friends with him and set sail for the region of Themiscyra, where the Amazons dwelled. On their way there, they stopped at the island of Paros, where the sons of king Minos of Crete killed two of Heracles' friends. Furious, Heracles killed the sons of Minos and demanded that two of the inhabitants replace his dead comrades. Thus, two of Minos' grandsons joined the band, and they all set sail again.\n" +
                "\n" +
                "After a brief stop at the court of Lycus, a friend of Heracles, they eventually reached the land of the Amazons. Hippolyta had heard of the glorious feats that Heracles had performed, and impressed, she immediately agreed to give her girdle. Heracles asked her to have lunch together on the ship and Hippolyta eagerly followed. At the same time, however, a disguised Hera went to the Amazons and started spreading rumours about Heracles wanting to abduct their queen. The Amazons decided to confront Heracles and rode towards the ship. Upon seeing them, Heracles thought that this had all been set up by Hippolyta and that she had no intention of handing over the girdle; so, he killed her, took the belt and set sail back to Tiryns.\n" +
                "\n" +
                "Labour ten: stealing the cattle of Geryon\n" +
                "\n" +
                "The tenth labour of Heracles was to steal the cattle of Geryon, who lived on the island of Erytheia, somewhere in the west. Heracles went on his quest, and he first had the cross the desert of Libya. At some point, having been so frustrated at the heat, he shot an arrow at the sun. Helios, the sun god, was so impressed by Heracles' courage, that he decided to help him by offering him his own golden chariot with which he sailed across the sea from west to east every night. Heracles hopped on the chariot and reached Erytheia overnight.\n" +
                "\n" +
                "There, his first obstacle was the two-headed dog Orthrus, brother of Cerberus, the three-headed dog and guardian of the Underworld. One blow with Heracles' club was enough to kill Orthrus. Eurytion, the herdsman, heard what happened and when he tried to confront Heracles, he was killed in the same way. Geryon immediately grabbed his three shields and three spears, while wearing three helmets and attacked the hero. However, a powerful shot of an arrow from Heracles' bow was enough to pierce Geryon's forehead and sent him to his demise.\n" +
                "\n" +
                "Bringing the cattle back to Tiryns was another task on its own. According to the Roman version of the story, Heracles took the road over the Aventine Hill where Rome would later be built on. There, a giant named Cacus stole some of the cattle, but they were later retrieved, called out by the animals remaining in the possession of Heracles. As an extra obstacle, Hera sent a gadfly to irritate the animals and scatter them. Heracles managed to get them back within a year. Before he reached Tiryns, though, Hera caused a flood that raised the level of a river so much that it could not be crossed. So, Heracles started piling stones into the river, and bridged the two riverbanks. He eventually reached Tiryns, where the cattle were sacrificed to the goddess.\n" +
                "\n" +
                "Upon finishing the tenth labour, Eurystheus told Heracles that he considered two of the labours invalid; the Hydra was not slain by Heracles alone but was helped by Iolaus, while he accepted payment for the cleaning of the Augean Stables. So, two more labours had to be completed. These were:\n" +
                "\n" +
                "11. to steal the Hesperidean Apples,\n" +
                "\n" +
                "12. to capture Cerberus, guardian of the Underworld.\n" +
                "\n" +
                "Labour eleven: stealing the apples from the garden of Hesperides\n" +
                "\n" +
                "The Hesperides were nymphs of the sunset that tended a garden somewhere in the far western corner of the world. Heracles managed to capture the Old Man of the Sea, a shape-shifting sea deity, in order to find out the exact location of the garden. During this quest, Heracles also confronted the half-giant Antaeus, who was invincible by drawing power from his mother, Gaea (the earth), as long as he touched it. To kill him, Heracles held him high so his feet wouldn't touch the ground, and crushed him with his hands.\n" +
                "\n" +
                "There are two versions on how Heracles managed to acquire the apples. One version has it that he reached the Hesperidean Garden, where he killed Ladon, the dragon guardian of the apples, and took the apples. According to another version, he came across Atlas, the Titan god who was condemned to hold the heavens on his shoulders. Atlas was also the father of the Hesperides, and thus had access to the garden at any time. Heracles persuaded Atlas to change places for a while, so that Atlas would fetch some of the apples. Atlas agreed and indeed took some of the apples. However, on his return, he decided he did not want to take the heavens back on his shoulders. Heracles tricked him and he said he would be keeping the heavens but wanted to adjust his cloak first. Atlas agreed to take the heavens back momentarily, but Heracles walked away taking the apples with him.\n" +
                "\n" +
                "Labour twelve: capturing Cerberus, guardian of the Underworld\n" +
                "\n" +
                "The final labour that Heracles had to complete was to capture Cerberus, the three-headed dog and guardian of the Underworld. Before going to the Underworld, Heracles decided to be initiated in the Eleusinian Mysteries, so that he would be taught how to travel alive from the world of the living to the realm of the dead and vice versa. He then went to Tanaerum, where one of the entrances to the Underworld lay, and was helped there by Athena and Hermes. The goddess Hestia also helped him with negotiating with Charon, the boatman that guided the souls over the river Acheron towards the Underworld.\n" +
                "\n" +
                "Once he reached the Underworld, he met Theseus and Pirithous, the two heroes that had been incarcerated in the Underworld by Hades for attempting to steal Persephone. According to one version of the story, snakes coiled around their legs and then turned into stone. A different version has it that the god of the Underworld feigned hospitality and invited them to a feast. However, the chairs on which the heroes were seated magically caused forgetfulness, thus keeping them there. Heracles pulled Theseus from his chair, managing to save him; however, part of his thigh was stuck to it, thus providing an explanation of the supposedly lean thighs of Athenians. When the hero tried to save Pirithous, though, the earth started trembling; it seems that because he desired Persephone for himself, it was so insulting that he was not allowed to leave.\n" +
                "\n" +
                "Heracles found Hades and asked him to take Cerberus to the surface. The god agreed on the condition that no weapons should be used to achieve it. Heracles managed to subdue the dog with his hands and brought it on his back to Tiryns. Eurystheus fled in horror into his jar and asked Heracles to take the monster back to the Underworld, releasing him from any other labours.\n" +
                "\n" +
                "After the Twelve Labours were complete, Heracles decided to join Jason and the Argonauts in their attempt to obtain the Golden Fleece.";
        return heraclesDesc;
    }


    private String erMyth() {
        String erMythDesc = "The Myth of Er is a tale in Greek mythology about a man who died on a battlefield and returned to life nine days later, recounting what happened in the afterlife. The word \"myth\" was used in the ancient Greek sense, meaning account, rather than the present-day meaning.\n" +
                "\n" +
                "Er was a man who died during a battle, and along with the souls of the other combatants, he was led to a magnificent place that had four doors; two into and out of the sky, and two into and out of the earth. There were judges who decided which path each soul should follow depending on the life they had led on Earth. The good ones were told to go to the sky, while the bad ones were led into the earth. From the sky exit, souls that appeared clean came out, telling of a place that filled them with incredible feelings. The souls that emerged from the earth exit were dirty and were talking about the misery and the difficulties they faced for punishment of what they had done while alive. Some souls however, those of murderers and other criminals, were not allowed to exit the earth and remained trapped forever.\n" +
                "\n" +
                "Er was told that he would not be judged and that he should remain there in order to see the whole procedure and report it back to mankind. Seven days later, they were all led to another place where there was the Spindle of Necessity. Necessity or Ananke was a primordial goddess and personification of fate. There, the souls were given a lottery number, and based on that, each of them was told to ask what their next life should be. The first soul, having travelled through the sky in the previous area, decided to become a dictator; when that happened, though, he didn't realise that he was destined to eat his own children because of his actions. Er realised that the souls that had travelled through the sky and had not lived the punishment of the other path, often chose bad things for their next lives, while the opposite happened for the souls that had been punished.\n"+
                "Once the souls chose their next life, they were led under the throne of Necessity to the River Lethe (Forgetfulness), where they were told to drink in order to forget their previous lives. That night, when each soul fell asleep, they were sent to new bodies to lead their new lives. Er's soul did not go through all of this and did not drink from the River Lethe, thus remembering everything he had experienced. When he woke up, he returned to his old body which had not decomposed during that period, but he found himself on the funeral pyre that his fellow soldiers had started. They saved him from the flames and he managed to recount his experience in the afterlife.\n" +
                "\n" +
                "The myth was used by Socrates to show that the choices people make have an impact on the afterlife, and that those who pretend to be pious but are false in their souls will be eventually punished in the next life.";
        return erMythDesc;
    }


    private String sevenThebes() {
        String sevenThebesDesc = "The story of Seven Against Thebes is one of the plays that were written by the great tragedian Aeschylus. It is the story of the war the broke out after Oedipus was exiled from the city of Thebes, and his sons Eteocles and Polynices ascended to the throne. The two brothers had initially agreed to share the throne, and rule in an alternating fashion. However, when Eteocles' time finished and it was Polynices' turn to rule, Eteocles refused and exiled his brother.\n" +
                "\n" +
                "Polynices went to Argos, where he raised an army that was led by seven leaders. These were Tydeus, Capaneus, Adrastus, Hippomedon, Parthenopeus, Amphiaraus, and Polynices himself. During the battle, they were confronted at the seven gates of Thebes by an equal number of defenders, whose names were Melanippus, Polyphontes, Megareus, Hyperbius, Actor, Lasthenes and Eteocles. Just before Eteocles confronted his brother at the seventh gate, he remembered his father's curse that the two brothers would divide the kingdom by the sword. With this in mind, Eteocles exited through the gate to confront his brother. In the following act of the play, a messenger appeared saying that the attackers had been repelled, and the bodies of the two brothers were brought on stage. The story ended there; however, Sophocles wrote the continuation of the story in his tragedy Antigone.";
        return sevenThebesDesc;
    }


    private String creation() {
        String creationDesc = "In the beginning there was only Chaos. Then out of the void appeared Erebus, the unknowable place where death dwells, and Night. All else was empty, silent, endless, dark. Then, Love was born bringing along the beginning of order. From Love emerged Light, followed by Gaea, the earth.\n" +
                "\n" +
                "Erebus slept with Night, eventually giving birth to Ether, the heavenly light, and to Day, the earthly light. Then, Night alone created Doom, Fate, Death, Sleep, Dreams, Nemesis, and all things that dwell in the darkness haunting mankind.\n" +
                "\n" +
                "Meanwhile, Gaea alone gave birth to Uranus, the sky. Uranus became Gaea's husband, surrounding her on all sides. Together, they produced the three Cyclopes, the three Hecatoncheires, and twelve Titans.\n"+
                "However, Uranus was a cruel father and husband. He hated the Hecatoncheires and imprisoned them by pushing them into the hidden places of the earth, Gaea's womb. This angered Gaea and she plotted against Uranus. She made a flint sickle and tried to get her children to attack Uranus. All were too afraid, except the youngest Titan, Cronus.\n" +
                "\n" +
                "Gaea and Cronus set up an ambush of Uranus as he lay with Gaea at night. Cronus grabbed his father and castrated him with the sickle, throwing the severed genitals into the ocean. It is unclear as to what happened to Uranus afterwards; he either died, withdrew from the earth, or exiled himself to Italy. As he departed, he promised that Cronus and the Titans would be punished. From the blood that was spilled on the earth due to his castration, emerged the Giants, the Ash Tree Nymphs, and the Erinnyes. From the sea foam that was produced when his genitals fell in the ocean, emerged Aphrodite.\n" +
                "\n" +
                "Cronus became the next ruler. He imprisoned the Cyclopes and the Hecatoncheires in Tartarus. He married his sister Rhea, and had many children. He ruled for many ages; however, Gaea and Uranus both had prophesied that Cronus would be eventually overthrown by a son. To avoid this, Cronus swallowed all of his children as they were born. Rhea was angry at the treatment of the children and plotted against Cronus. When it was time to give birth to her sixth child, Rhea hid herself, then she left the child to be raised by nymphs. To conceal her act she wrapped a stone in swaddling cloths and passed it off as the baby to Cronus, who swallowed it.\n" +
                "\n" +
                "This child was Zeus. He grew into a handsome youth at the island of Crete. He consulted Metis on how to defeat Cronus. She prepared a drink for Cronus designed to make him vomit the other children. Rhea convinced Cronus to accept his son and Zeus was allowed to return to Mount Othrys (the base of the Titans) as Cronus's cupbearer, giving him the opportunity to serve Metis' potion to Cronus. The plan work perfectly and the other five children emerged out of Cronus. As gods, they were unharmed and thankful to their youngest brother, they made him their leader.\n" +
                "\n" +
                "Cronus was yet to be defeated though. He and the Titans, except Prometheus, Epimetheus, and Oceanus, fought to retain their power; this led to the War between the Titans and the Olympians called Titanomachy. Atlas became their leader in battle and it looked for some time as though they would win and put the young gods down. However, Zeus was cunning; he went to Tartarus and freed the Cyclopes and the Hecatoncheires. Prometheus joined Zeus as well. He returned to battle with his new allies; the Cyclopes provided Zeus with lightning bolts for weapons; the Hecatoncheires were armed with boulders, waiting in an ambush. At the right time, Zeus retreated drawing the Titans into the Hecatoncheires's ambush, who rained down hundreds of boulders with such a fury that the Titans thought the mountains were falling on them. They ran away, leaving Zeus victorious.\n" +
                "\n" +
                "Zeus exiled the Titans who had fought against him into Tartarus, with the exception of Atlas, who being the leader of the opposing force, was punished to hold the universe on his shoulders.\n" +
                "\n" +
                "However, even after this victory, Zeus was not safe. Gaea, angry that her children had been imprisoned, gave birth to her last child, Typhon. Typhon was the deadliest monster in Greek mythology and was known as the \"Father of All Monsters\". He was so fearsome that most of the gods fled; however, Zeus faced the monster and flinging his lighting bolts was able to kill it. Typhon was buried under Mount Etna in Sicily.\n" +
                "\n" +
                "Much later, Zeus faced a final challenge set by the Giants. They went so far as to attempt to invade Mount Olympus, piling mountain upon mountain in an effort to reach the top. Nevertheless, the gods had already grown strong, and with the help of Heracles, the Giants were subdued and killed.";
        return creationDesc;
    }


    private String dionysus() {
        String dionysusDesc = "After Dionysus reached adulthood, he decided to wander far and wide, including areas outside of Greece. At the places he visited, he taught people how to cultivate vines, and he initiated them in the mysteries of his cult.\n" +
                "\n" +
                "On his way back to his homeplace, Thebes, however, he was spotted by pirates, to whom he appeared as a rich young man; he might even be the son of a king, and certainly looked like his family would pay a substantial amount for his safe return. Happy at their good luck, the pirates seized him and brought him aboard their ship. They then attempted to tie him to the mast, but the ropes simply would not hold. Whenever the rope touched his body, it just fell apart. Dionysus watched calmly, smiling. After many unsuccessful attempts, the helmsman realised that only a god would be responsible for this. He called out that the crew should free Dionysus and beg his forgiveness, but the captain mocked the helmsman as a fool and called for the crew to set sail. The crew raised the sail and caught the wind, but the ship did not move. Looking around, they saw the ship quickly becoming overgrown with vines that held it in place. Dionysus then changed himself into a lion and began to chase the crewmen. To escape, they leaped overboard, but as they did, they were changed to dolphins. Only the helmsman was spared of Dionysus' wrath.\n" +
                "\n" +
                "On his passage through Thrace, he was insulted by King Lycurgus, who bitterly opposed his new religion. Initially, Dionysus retreated into the sea, but he returned, overpowered Lycurgus and imprisoned him in a rocky cave. Dionysus planned to let him reflect and learn from his mistakes. However, Zeus was enraged that a mortal man had insulted a god, so he blinded and then killed Lycurgus.\n" +
                "\n" +
                "Dionysus eventually reached Thebes, which was ruled by his cousin Pentheus. However, Pentheus did not know of Dionysus. Dionysus was with a group of his followers, who were naturally singing and dancing loudly, flushed with wine. Pentheus disliked the loud strangers, and ordered his guards to imprison them all. He referred to their leader as a cheating sorcerer from Lydia. When he said this, the blind old prophet Teiresias, who was already dressed as one of Dionysus's followers, gave Pentheus a warning: \"The man you reject is a new god. He is Semele's child, whom Zeus rescued. He, along with Demeter, are the greatest upon earth for men.\" Pentheus, seeing the strange garb Teiresias had on, laughed at him and ordered his guards to continue. The guards soon found out that the ropes fell apart, the latches did not hold, and that there was no way they could imprison Dionysus' followers; so, they brought Dionysus to Pentheus. Dionysus tried to explain at length his worship, but Pentheus listened only to his own anger and insulted Dionysus. Finally, Dionysus gave up and left Pentheus to his doom. Pentheus pursued Dionysus' followers up to the hills where they had fled after escaping from prison. Many of the local women including Pentheus' mother and sister had joined them there. Then, Dionysus appeared to his followers in his most terrible form and drove them mad. To them, Pentheus appeared to be a mountain lion. In a berserk rage they attacked him and Pentheus realised he had insulted a god and would die for it. His mother was the first to reach him, and ripped his head off, while the others tore off his limbs.";
        return dionysusDesc;
    }


    private String creation2() {
        String creation2Desc = "Perhaps the most confusing aspect of this myth is the extensive use of names that seem difficult to non-native Greek speakers to pronounce. This sometimes causes frustration and loss of track when trying to establish the continuing relationship between these characters in the birth of the world. So, please be patient and try to associate these names with the characters and events that took place...\n" +
                "\n" +
                "It all started when Chaos, Gaea (Earth) and Eros started sleeping with each other, leading to the Gods. So, in Greek mythology, the creation of the world starts with the creation of the different classes of Gods. In this instance, the term 'gods' refers to the characters that ruled the Earth (without necessarily possessing any divine attributes) until the 'real' Gods, the Olympians, came. So after this brief introduction, the next step to examine is the creation of the Gods (which really is the same thing, it's just that when you are interested in the creation of the world, you look at the very beginning of the creation of the Gods, while, to examine the creation of the Gods, you have to look a little deeper).\n" +
                "\n" +
                "Hesiod's Theogony is one of the best introductions we have on the creation of the world. According to Hesiod, three major elements took part in the beginning of creation; Chaos, Gaea, and Eros. It is said that Chaos gave birth to Erebos and Night, while Uranus and Oceanus emerged from Gaea. Each child had a specific role, and Uranus' duty was to protect Gaea. Later, the two became a couple and\n" +
                "were the first Gods to rule the world. They had twelve children known as the Titans, three known as the Cyclopes, and three Hecatoncheires, the hundred-handed Giants.\n"+
                "The situation from here on however wasn't very peaceful. Uranus was a cruel father, afraid that he might be overthrown by his children; thus, he decided that his children belonged deep inside Gaea, hidden from himself and his kingdom. Gaea, infuriated with this arrangement, agreed at first, but later chose to help her children. She devised a plan to rid her children from their tyrant father, and supplied her youngest child Cronus with a sickle. She then arranged a meeting for the two, in which Cronus cut off his father's genitals. The seed of Uranus which fell into the sea gave birth to Aphrodite, while from his blood were created the Fates, the Giants, and the Meliad nymphs.\n" +
                "\n" +
                "Cronus succeeded his father in the throne and married his sister Rhea. He also freed his siblings and shared his kingdom with them. Oceanus was given the responsibility to rule over the sea and rivers, while Hyperion guided the Sun and the stars. When Cronus and Rhea started having their own children, Cronus was possessed by the very same fears that haunted his father.\n" +
                "\n" +
                "Cronus eventually decided that the best way to deal with this problem was to swallow all his children.\n" +
                "Of course, Rhea was very displeased and devised a plan to free her children. She managed to hide her youngest child, Zeus, from Cronus, by tricking him into swallowing a stone wrapped in infant clothes instead of the baby himself.\n" +
                "\n" +
                "The great Zeus was brought up by the Nymphs on Mount Dikte in the island of Crete. In order to cover the sound of his crying, the Kouretes danced and clashed their shields. As Zeus entered manhood, he gained the strength few would dare dream of. He overthrew his father, and freed his siblings from his father's stomach, taking the throne and the rule of the universe.";
        return creation2Desc;
    }

    private String theseus() {
        String theseusDesc = "Once, there was a young boy named Theseus. Nobody knew who his father was, for both King Aegeus of Athens and Poseidon had been fond of his mother Aethra. Right before Theseus was born, Aegeus said to Aethra, \"If we shall have a son, then when he becomes of age, tell him to lift this rock and take my sword and sandals.\" Aegeus then hid both his sword and his sandals under a large boulder and set sail for Athens.\n" +
                "\n" +
                "This happened in a small town called Troezen, where Theseus grew into a strong, young man. When Aethra thought it was time, she took Theseus to the large boulder and told him to lift it. Theseus wrapped his mighty arms around the boulder and lifted it with no difficulty at all. Then, he threw the boulder into a nearby forest. Aethra then told him to take the sword and sandals and go to Athens.";
        return theseusDesc;
    }

    private String titanchomachy() {
        String titanchomachyDEsc = "The Titanomachy, in Greek mythology, was the great war that occurred between the Titans, the old generation of Greek gods, and the Olympian gods, led by Zeus. The war lasted for a total of ten years, ending in the defeat of the old pantheon, which was based on Mount Othrys, and the establishment of the new one, based on Mount Olympus.\n" +
                "\n" +
                "When the Titans were in power, Uranus was the ruler of the universe. However, he caused the wrath of his wife, Gaea, after incarcerating some of her children, the Cyclopes and the Hecatonchires, in the depths of the earth, Tartarus. Gaea decided to take revenge, and created a giant sickle; she then told her children to castrate their father in order to overthrow him. Only Cronus agreed, and after he formed a plot with his mother, he managed to overpower his father and castrate him. From Uranus' blood that fell on the earth, three sets of children were born; the Gigantes, the Erinyes, and the Meliae; while from the blood that fell into the sea, the goddess Aphrodite was born.\n" +
                "\n" +
                "Cronus took the throne from his father, but not before Uranus made a prophecy that his son would also be overthrown by his own sons. Afraid that he would lose the reign, Cronus turned into the same tyrant god that his father was; he put his brothers back into Tartarus, and also ate his own children, in an effort to prevent the prophecy from becoming true. However, his wife Rhea tricked him and saved her youngest child, Zeus, from his father's paranoia. She hid Zeus in a cave in Crete, where he was raised by a goat, Amalthea.\n"+
                "When Zeus grew up, he became his father's cupbearer, without revealing his true identity. Helped by Metis, the Titan goddess who later became Zeus' first wife, he gave Cronus a mixture of wine and mustard, causing him to vomit one by one the children he had swallowed. When all of his brothers and sisters were freed, Zeus gathered them and convinced them to start a rebellion against their father.\n" +
                "\n" +
                "Thus started the Titanomachy. Zeus released the Hecatonchires and the Cyclopes from Tartarus and asked their help against their brother. They all agreed; the Hecatonchires started hurling rocks against the Titans, while the Cyclopes created the famous thunderbolts for their leader, Zeus. Themis and Prometheus were the only Titans that fought on the side of Zeus.\n" +
                "\n" +
                "When the War ended with the Olympians on the winning side, all Titans except Themis and Prometheus were jailed in Tartarus, and were guarded by the Hecatonchires. Zeus, along with his brothers Poseidon and Hades, divided the universe by drawing straws; Zeus won and became the king of the sky, as well as the ruler of mortals and gods; Poseidon became the ruler of the seas; while Hades, who drew the shortest straw, became the ruler of the Underworld. This was the dawn of a new era in Greek mythology.";
        return titanchomachyDEsc;
    }

    private String trojanwar() {
        String trojanwarDesc = "The Trojan War is probably one of the most important events that have been narrated in Greek mythology. It was a war that broke out between the Achaeans (the Greeks) and the city of Troy. The best known narration of this event is the epic poem Iliad, written by Homer.\n" +
                "\n" +
                "Zeus believed that the number of humans populating the Earth was too high and decided it was time to decrease it. Moreover, as he had various affairs with mortal women and fathered demigod children, he thought it would be good to get rid of them. He formed a plan after he learned of two prophecies; one of them said that he would be dethroned by one of his sons, just like he had done with his own father, Cronus; the other prophecy mentioned that the sea nymph Thetis, for whom Zeus had fallen, would give birth to a son that would surpass his father in glory. So, Zeus decided to marry Thetis to King Peleus.\n" +
                "\n" +
                "The god of gods organised a grand feast in celebration of Peleus' and Thetis' marriage, in which all of the gods and important figures were invited, except the goddess of strife, Eris. The goddess was stopped at the door by Hermes, infuriating her. Before she left, she threw her gift amidst the guests; the Apple of Discord, a golden apple on which the words \"to the fairest\" had been inscribed. Hera, Athena, and Aphrodite started quarreling over who should be the one to take the apple, and demanded that Zeus decide on this matter. Zeus knew that if he made a choice, he would cause the anger of the other two that wouldn't be picked, and decided to abstain; instead, he appointed Paris, the young prince of Troy, as the judge. Paris could not make a decision, even after seeing the three goddesses naked, so they started bribing him; Hera said that he would get political power and be the ruler of the continent of Asia; Athena would give him wisdom and great skills in battle; and Aphrodite offered him the most beautiful woman in the world, Helen of Sparta. Paris gave the apple to Aphrodite, and returned to Troy.\n"+
                "Peleus and Thetis had a son, Achilles, for whom two prophecies had been made; one was that he would either lead an uneventful but long life, or a glorious one but he would die young at a battlefield; the other prophecy was that without his help, the city of Troy would never fall. Afraid for her son's life, Thetis decided to grant immortality to him. When he was still an infant, she took him to the River Styx, one of the rivers that ran through the Underworld, and dipped him in the waters, thus making him invulnerable. However, Thetis did not realise that the heel of the boy, from which she was holding him, did not touch the waters and remained mortal; this would later be the doom of Achilles, and is the origin of the modern day phrase \"Achilles' heel\", signifying a vulnerable point. After the ritual, she dressed him as a girl and hid him at the court of King Lycomedes of Skyros.\n" +
                "\n" +
                "Meanwhile, the most beautiful woman in the world, Helen, was the daughter of King Tyndareus of Sparta, and many noble suitors had arrived to claim her hand in marriage. Tyndareus did not want to make a choice for fear of causing political tensions, and stalled the decision. One of the suitors, Odysseus, offered to help solve the situation, asking in return for the hand of Penelope; Tyndareus agreed, and Odysseus asked that all suitors swear an oath that they would protect the couple no matter who the groom would be. After the oath was taken, Tyndareus picked Menelaus as his daughter's husband, effectively making him the successor of the Spartan throne through Helen. However, Menelaus caused Aphrodite's wrath, after failing to sacrifice one hundred oxen for her as he had promised; this is why Aphrodite decided to help Paris win Helen's heart. The goddess made a plan and disguised Paris as a diplomatic emissary. He then went to Sparta, where Helen welcomed him, while her husband was away in Crete to bury his uncle. At that point, the god of love, Eros, shot an arrow to her, thus causing her to fall in love with the Trojan prince. The two lovers eloped and left for Troy.\n" +
                "\n" +
                "Menelaus returned home and realised what had happened. Along with Odysseus, they went to Troy to get Helen back, but all diplomatic attempts failed. So, Menelaus invoked the Oath of Tyndareus, and, helped by his brother Agamemnon, called all Achaean leaders who had previously been the suitors of Helen to fulfill their oath. They also needed the help of Achilles, as they knew of the prophecy that Troy would only fall with his help. Odysseus, Telamonian Ajax and Phoenix went to Skyros where they knew Achilles was hidden disguised as a woman. There, they either blew a warhorn, on the sound of which Achilles was the only woman that took a spear in hand; or they appeared as merchants selling jewels and weapons, and Achilles was the only woman interested in the latter.\n" +
                "\n" +
                "Having Achilles with them, all leaders gathered at the port of Aulis. A sacrifice was made to Apollo, and the god sent an omen; the Achaeans saw a snake appear from the altar that slithered to a bird's nest, where it ate the mother and her nine babies before it was turned to stone. The seer Calchas said that this meant Troy would fall in the tenth year of the war. The Achaeans set sail for Troy, although no one knew the way. By mistake, they arrived in Mysia, ruled by King Telephus; after a battle, during which Achilles wounded the king, the Achaean ships sailed but a storm scattered them. Telephus' wound would not heal, and an oracle told him it would be healed by the person who inflicted it. When Telephus confronted Achilles, he said he did not have any medical knowledge; Odysseus then proposed that the spear that caused the wound might help, so pieces of metal were used and the wound was healed. Telephus then told them how they would reach Troy.\n" +
                "\n" +
                "Due to the storm that scattered the fleet, the Achaean leaders eventually gathered in Aulis again eight years later. However, they were unable to set sail because there was no wind. Calchas realised that this was a punishment from the goddess Artemis, who was furious at Agamemnon for killing a sacred deer. Artemis demanded that Agamemnon's daughter Iphigenia be sacrificed. Although Agamemnon initially refused, he reluctantly agreed in the end, and tricked his wife Clytemnestra and Iphigenia to go to Aulis, saying that Iphigenia was to marry Achilles. When they arrived to Aulis and understood what was going on, Clytemnestra cursed Agamemnon and was the reason she murdered him after the war was over. Iphigenia gracefully accepted her fate and placed herself on the altar; however, just as Calchas was about to sacrifice her, Artemis substituted the woman for a deer and took her to Tauris where she became the goddess' high priestess. Nevertheless, no one saw what happened on the altar except Calchas, who was bound not to say anything.\n" +
                "\n" +
                "The winds picked up again after the sacrifice and the Achaean fleet was finally able to set sail. They made a stop at the island of Tenedos, where Achilles killed the king, who was the son of the god Apollo. Thetis had warned her son not to kill the king, lest he be killed by the god himself. This was also a foretelling of the hero's fate. While on the island, the Greeks sent a diplomatic mission to Troy asking for Helen, but it was refused into the city. So the fleet sailed on its final leg of the journey.\n" +
                "\n" +
                "When the fleet arrived, they were all reluctant to disembark, as a prophecy said that the first Greek to step on Trojan soil would be the first to die in the war. Finally, Odysseus decided to disembark first; however, he threw his shield on the ground and stepped on it, while Protesilaus who followed him landed on the ground. Thus it was Protesilaus who died first, during a single combat against the Trojan prince Hector.\n" +
                "\n" +
                "The siege of Troy lasted nine years, but not being complete, Troy was still able to maintain trade links with other Asian cities, as well as get reinforcements. At the end of the ninth year, the Achaean army mutinied and demanded that they return home, but Achilles eventually convinced them to stay longer.\n" +
                "\n" +
                "On the tenth year, the priest of Apollo, Chryses, went to Agamemnon and asked for his daughter Chryseis' return, who had been taken as a concubine. Agamemnon refused, and Chryses prayed to Apollo, who inflicted the Greek army with plague. Agamemnon returned Chryseis to her father, but instead took Achilles' concubine for his own. Achilles, infuriated, said he would no longer fight and stayed in his tent. Although the Achaeans initially won a few battles, Achilles' refusal to fight led to a series of defeats, to the point that the Trojans almost set fire to the Greek ships. Then, Patroclus, a close friend of Achilles, took command of the Myrmidon army, but was slain in battle by Hector. Achilles, maddened with grief, swore vengeance; Agamemnon returned the concubine back to him and the two leaders reconciled. The Greek army was again victorious, and Achilles eventually managed to kill Hector; he refused to give Hector's body to the Trojans for burial, and instead, he desecrated it by dragging it with his chariot in front of the city walls. He eventually agreed to return it, after King Priam of Troy pleaded for his son's proper burial.\n" +
                "\n" +
                "Achilles later died by a poisonous arrow that Paris shot against him. The arrow was guided by the god Apollo and hit Achilles on his heel, which was the only vulnerable spot of the hero's body. Achilles was burned on a funeral pyre and his bones were mixed with those of his close friend Patroclus. Paris was killed later by Philoctetes, using Heracles' bow.\n" +
                "\n" +
                "Odysseus devised a plan to end the war for good. He asked that a wooden horse be built that was hollow inside. Soldiers hid in the interior of the horse, which was brought in front of the city gates, saying that it was a gift from the Greeks, showing the withdrawal of the Greek army and the end of the war. The Trojans happily accepted and brought the horse inside the city. They then started feasting and celebrating the victory. During the night, the Greek soldiers went out of the horse and started slaying the drunk Trojans. In the battle that followed, a huge number of soldiers died but eventually, Troy fell. The Greeks burned it and raided it, at the same time committing offences against many gods, by destroying temples and sacred grounds. Although victorious, most heroes and Greek soldiers either never returned home or returned after many adventures, as the gods were infuriated.\n" +
                "\n" +
                "The Trojan War marked the end of the Heroic Age of Man, according to Hesiodus, and the transition of the world to the Iron Age. Zeus' attempt to depopulate the earth and kill a number of demigods and heroes proved successful.";
        return trojanwarDesc;
    }


    private String zeuslovers() {
        String zeusloversDesc = "Zeus, the father of gods and men, had a number of consorts before and after his marriage to Hera. His first lover was Metis, a Titan goddess and mother of Athena. He later married Themis, Titan goddess of tradition, with whom he had six children; the three Horai (Hours) and the three Moirai (Fates); according to some myths, the three Nymphai (Nymphs) were also children of Zeus and Themis. Afterwards, he was interested in Demeter but she resisted him. His third wife was Mnemosyne, who gave birth to the nine Muses. He was involved with Leto shortly before his marriage to Hera, and had Apollo and Artemis with her. Even after his marriage to Hera, he continued sleeping with both goddesses and mortals. The following is an indicative list of characters that Zeus consorted with:\n" +
                "\n" +
                "Europa\n" +
                "Io\n" +
                "Semele\n" +
                "Ganymede\n" +
                "Callisto\n" +
                "Dione\n" +
                "Persephone\n" +
                "Nemesis\n" +
                "Thaleia\n" +
                "Alkmene\n" +
                "Danae";
        return zeusloversDesc;
    }
}

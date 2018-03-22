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

public class Zodiac extends AppCompatActivity {

    GridView gridViewZodiac;
   /*  <!--Aquarius :: Aries :: Astrology :: Cancer :: Capricorn :: Gemini :: Leo :: Libra ::
    Pisces :: Sagittarius :: Scorpio :: Taurus :: Virgo-->*/
    int zodiac[] = {R.string.zodiac_aquarius,R.string.zodiac_aries,R.string.zodiac_astrology,
   R.string.zodiac_cancer,R.string.zodiac_capricon,R.string.zodiac_gemini,R.string.zodiac_leo,
   R.string.zodiac_libra,R.string.zodiac_pisces,R.string.zodiac_sagittarius,R.string.zodiac_scorpio,
   R.string.zodiac_taurus,R.string.zodiac_virgo};

    int zodiacIcons[] = {R.drawable.zodiac_aquarius,R.drawable.zodiac_aries,R.drawable.zodiac_astrology,
    R.drawable.zodiac_cancer,R.drawable.zodiac_capricon,R.drawable.zodiac_gemini,R.drawable.zodiac_leo,
    R.drawable.zodiac_libra,R.drawable.zodiac_pisces,R.drawable.zodiac_sagittarius,R.drawable.zodiac_scorpio,
    R.drawable.zodiac_taurus,R.drawable.zodiac_virgo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewZodiac = (GridView) findViewById(R.id.gridview_zodiac);
        CustomAdapter adapter = new CustomAdapter(this,zodiac,zodiacIcons);
        gridViewZodiac.setAdapter(adapter);

        gridViewZodiac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], aquarius());
                        break;
                    case 1:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], aries());
                        break;
                    case 2:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], astrology());
                        break;
                    case 3:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], cancer());
                        break;
                    case 4:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], capricon());
                        break;
                    case 5:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], gemini());
                        break;
                    case 6:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], leo());
                        break;
                    case 7:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], libra());
                        break;
                    case 8:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], pisces());
                        break;
                    case 9:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], sagittarius());
                        break;
                    case 10:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], scorpio());
                        break;
                    case 11:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], taurus());
                        break;
                    case 12:
                        makeZodiacActivity(zodiac[position], zodiacIcons[position], virgo());
                        break;
                    default:
                        Toast.makeText(Zodiac.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void makeZodiacActivity(int title, int image, String description) {
        Intent intent = new Intent(Zodiac.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String aquarius() {
        String aquariusDesc = "Aquarius is the 11th sign in the Zodiac and represents those born between Jan. 20 and Feb. 18.\n" +
                "\n" +
                "Aquarius, the Water Bearer, comes from the story of the Deucalion Flood. Zeus poured all the waters from the heavens out onto the Earth to wash away and destroy the wicked and evil men. This brought forth a fresh start for Deucalion and his wife Pyrrha, who threw stones over their shoulders to create a new race of men and women. This sign is also associated with Ganymede, the cupbearer of Olympus.\n" +
                "\n" +
                "According to Astrology Aquarius is an air sign characterized by cleverness, humanism and originality.";
        return aquariusDesc;
    }

    private String aries() {
        String ariesDesc = "Aries, the Ram. Aries is the first sign of the Zodiac, marking the beginning of the astrological year and representing those born between March 21 and April 19.\n" +
                "\n" +
                "King Athamas of Boeotia married the nymph Nephele at Hera's command. She was a nymph made from a cloud in Hera's image to trap the centaur, Ixion. The couple had two children; a son named Phrixus and a daughter named Helle. After a while, Athamas grew tired of Nephele and left her.\n" +
                "\n" +
                "Athamas then remarried, and his second wife was Ino, the daughter of Cadmus. She also gave him children -- two sons named Learches and Melicertes. Nephele was angry and asked Hera to assist in avenging Athamas' desertion. While this was going on, Zeus asked Ino and Athamas to care for Dionysus, as he wanted to keep him a secret from Hera. Hera eventually punished them for this by making them go mad. Ino was terribly jealous of Athamas and Nephele's children and plotted their deaths.";
        return ariesDesc;
    }

    private String astrology() {
        String astrologyDesc = "Astrology and mythology are interconnected as Mythology offers a background story to Astrology.\n" +
                "\n" +
                "Astrological terminology has its roots in Greek and Roman Mythology, all astrological constellations have Mythological names.\n" +
                "\n" +
                "Astrologers use all Zodiac constellations except Ophiuchus. The so-called 13th sign, was not adopted into Astrology because the sun barely passes through this constellation during its path through the Zodiac.";
        return astrologyDesc;
    }

    private String cancer() {
        String cancerDesc = "Cancer, the Crab, is the fourth sign of the Zodiac and represents those born between June 20 to July 22.\n" +
                "\n" +
                "Cancer was a creature sent by Hera to destroy Heracles, one of Zeus' illegitimate children whom she hated the most. This giant crab latched on to Heracles foot as he was battling the Hydra. He already had his hands full as everytime he cut off one of the Hydra's heads, two more grew in it's place. Before finishing off the Hydra, he turned his attention to the crab and crushed it. As a reward for the crab's obedience and sacrifice, Hera placed it's image among the stars.\n" +
                "\n" +
                "According to Astrology Cancer is considered a water sign and is one of the four cardinal signs, which are signs that indicate a change of season when the sun makes its annual passage into them.";
        return cancerDesc;
    }

    private String capricon() {
        String capriconDesc = "Capricorn is the tenth sign in the Zodiac and represents those born between Dec. 22 and Jan. 19.\n" +
                "\n" +
                "Capricorn is usually depicted as a goat or sea-goat, but in Greek Mythology he is the God Pan. Pan ruled over forests and woodlands, flocks and shepherds. From the waist down he was a goat and also had the ears and horns of a goat, and from the waist up he was a man. He was a horny little guy and was always trying to catch a nymph, who would flee because of his appearance. He, eventually, became the God of Nature, and some of his qualities, such as sexuality and love of nature have become part of the character of people born under this sign. Another story is that the goat nymph, Amalthea, who suckled Zeus as an infant, was placed among the stars as the constellation Capricorn by Zeus in gratitude.\n" +
                "\n" +
                "According to Astrology Capricorn is an earth sign and people born under this sign are responsible, patient, ambitious and loyal.";
        return capriconDesc;
    }

    private String gemini() {
        String geminiDesc = "Gemini is the sign of the twins, and the third sign of the Zodiac representing those born between May 20 and June 20.\n" +
                "\n" +
                "The twins were Castor and Polydeuces (Pollux). Together, they were known as the Dioscuri. Their sisters were Helen and Clytemnestra. They were the sons of Leda and Zeus and Tyndareus. Castor and Pollux were half-brothers. Leda was married to King Tyndareus of Sparta. At this time, she was also seduced by Zeus, so the father's of both children were uncertain. The Discouri were inseperable and grew closer with age.\n" +
                "\n" +
                "Castor was a famous horsetamer and Pollux, a superb boxer. When Castor was killed during a battle, Pollux was inconsolable and gave up his own life to be with his brother. Zeus rewarded their love by placing their images among the stars, where they shine side by side. Two lines of stars makes up this constellation, and two bright stars at the top of each line represent Castor and Pollux's heads.\n" +
                "\n" +
                "According to Astrology Gemini is an air sign and Gemini people are energetic, clever, imaginative and adaptable.";
        return geminiDesc;
    }

    private String leo() {
        String leoDesc = "Leo, the Lion, is the fifth sign of the Zodiac and represents those born July 22 to August 22.\n" +
                "\n" +
                "Leo had to do with the labors of Heracles. On his first task, he was sent to kill the Nemean Lion. This lion was savage and fearless as he couldn't be harmed by weapons. After attempting to kill the lion with arrows, which just bounced right off, Heracles wrestled the lion and strangled it to death. He didn't go away unharmed, though; the lion managed to bite off one of Heracles' fingers. After the lion was dead, Heracles skinned it with it's own claws and made some wonderful armor from the pelt and jaw. The constellation Leo is said to honor the bravery of battle between the Nemean Lion and Heracles.\n" +
                "\n" +
                "According to Astrology Leo is a fire sign and is considered a masculine, extroverted sign.";
        return leoDesc;
    }

    private String libra() {
        String libraDesc = "Libra, the Scales, is the seventh sign in the Zodiac and represents those born between Sept. 23 and Oct. 22.\n" +
                "\n" +
                "Libra represent balance and justice, harmony and equilibrium. In Greek Mythology, the Goddess of Justice is Themis. She is usually seen as a woman who is blindfolded holding the scale in her hands. She is the mother of Astraea. The constellations of Virgo and Libra shine side by side in the celestial sky. She is also said to return with her daughter when the Golden Age comes again.\n" +
                "\n" +
                "According to Astrology Libra is one of the three zodiac air signs and Libra people are social beings and their happiness is based within relationships.";
        return libraDesc;
    }

    private String pisces() {
        String piscesDesc = "Pisces is the 12th sign in the Zodiac and represents those born between Feb. 20 and March 20.\n" +
                "\n" +
                "Pisces is the fishes. In Greek Mythology, these two fish were Aphrodite and Eros. They were walking along the Euphrates River when Typhon appeared. They were scared and unable to run, so they called upon Zeus for help. He turned them into two fish, and they jumped in the river and escaped. Athena placed the fish among the stars and they became the constellation of Pisces.\n" +
                "\n" +
                "According to Astrology Pisces is a water sign and people born under this sign are compassionate, adaptable, devoted and imaginative.";
        return piscesDesc;
    }

    private String taurus() {
        String taurusDesc = "Taurus, the Bull, is the second sign in the Zodiac and represents those born between April 20 and May 20.\n" +
                "\n" +
                "Taurus, comes from the story of Europa. She was the daughter of King Agenor of Phoenicia and Telephassa. Europa became the object of Zeus' affections, and he appeared to her as a beautiful, white bull at the Phoenician waterside. The princess was awestruck by the beauty of the bull and walked over to pet it. She then climbed upon his back at which Zeus jumped into the water and carried her across the sea to Crete. He took the form of an eagle there and ravished her. She eventually bore him three sons whose names were Minos, Rhadamanthus, and Sarpedon.\n" +
                "\n" +
                "Zeus placed the image of the bull in the heavens. A group of stars called the Hyades make up Taurus' head, and another group of stars called the Pleiades make up part of the bull, as well. The Pleiades are a bright galactic cluster and the brightest seven make up their own constellation.\n"+
                "According to Astrology Taurus is an Earth sign and the traits of those born under the sign of Taurus include practicality and stubborness.";
        return taurusDesc;
    }

    private String scorpio() {
        String scorpioDesc = "Scorpio is the eighth sign in the Zodiac and represents those born between Oct. 24 and Nov. 22.\n" +
                "\n" +
                "Scorpio, in Greek Mythology, comes from the story of Orion. This giant of a man was the son of Poseidon and Euryale, and was also said to be the most handsome man alive. He and Artemis were hunting partners. This made her brother, Apollo, jealous. He went to Mother Earth and asked her to create a giant scorpion, which then stung and killed Orion. Zeus placed both of them in the heavens as a constellation. Scorpion is a pretty big constellation. The bright star, Antares, is the Scorpion's heart.\n" +
                "\n" +
                "According to Astrology Scorpio is a water sign and the traits of those born under the sign include determination and loyalty.";
        return scorpioDesc;
    }

    private String sagittarius() {
        String sagittariusDesc = "Sagittarius is the ninth sign in the Zodiac and represents those born between Nov. 22 and Dec. 21.\n" +
                "\n" +
                "Sagittarius is the centaur, Chiron. Chiron was unlike the other brutal Centaurs. He was kind and taught medicine, hunting, music and prophecy. He was a wonderful teacher to many great heroes, such as Jason and Achilles, and a friend to Heracles. The latter was the one who accidentally killed the Chiron. While hunting a boar, Heracles shot Chiron in the knee with one of his poisoned arrows. Being an immortal, Chiron could not die, but Heracles promised that he would help him. This is were Prometheus comes in. Heracles happened upon him and discovered that he couldn't be freed unless someone took his place. Chiron agreed and Prometheus was set free. Chiron was allowed to die and Zeus placed his image among the stars as reward of his noble character.\n" +
                "\n" +
                "According to Astrology Sagittarius is a fire sign seeking independence, excitement and truth.";
        return sagittariusDesc;
    }

    private String virgo() {
        String virgoDesc = "Virgo, the Maiden, is the fifth sign in the Zodiac and represents those born between Aug. 23 and Sept. 22.\n" +
                "\n" +
                "Virgo is the Goddess of Innocence and Purity, Astraea. According to the creation myth, Zeus sent Pandora down to Earth as a punishment to man. Because of her curiosity, she opened the box the gods had warned her not to, and let the plagues of hate, envy, sickness, etc. out into the world. Of course, Hope did not escape, but the Earth was just unbearable. One by one, the gods returned to the heavens to live. Astraea was the last to leave. She became the constellation Virgo, and according to legend, when the Golden Age comes again, Astraea will return to the Earth.\n" +
                "\n" +
                "According to Astrology Virgo is an earth sign and Virgo people are typically analytical, kind, hardworking and practical.";
        return virgoDesc;
    }

}

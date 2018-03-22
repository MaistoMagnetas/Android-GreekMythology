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

public class Planets extends AppCompatActivity {

    GridView gridViewPLanets;
    //Constellations :: Jupiter :: Mars :: Mercury :: Moon :: Neptune :: Pluto :: Saturn :: Sun :: Uranus Planet :: Venus
    int planets[] = {R.string.planets_constellations,R.string.planets_jupiter,R.string.planets_mars,
            R.string.planets_mercury,R.string.planets_moon,R.string.planets_neptune,R.string.planets_pluto,
            R.string.planets_saturn,R.string.planets_sun,R.string.planets_uranus,R.string.planets_venus};

    int planetsIcons[] = {R.drawable.planets_constellations,R.drawable.planets_jupyter,R.drawable.planets_mars,
        R.drawable.planets_mercury,R.drawable.planets_moon,R.drawable.planets_neptune,R.drawable.planets_pluto,
        R.drawable.planets_saturn,R.drawable.planets_sun,R.drawable.planets_uranus,R.drawable.planets_venus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        gridViewPLanets = (GridView) findViewById(R.id.gridview_planets);
        CustomAdapter adapter = new CustomAdapter(this,planets,planetsIcons);
        gridViewPLanets.setAdapter(adapter);

        gridViewPLanets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        makePlanetsActivity(planets[position], planetsIcons[position], constellations());
                        break;
                    case 1:
                        makePlanetsActivity(planets[position], planetsIcons[position], jupiter());
                        break;
                    case 2:
                        makePlanetsActivity(planets[position], planetsIcons[position], mars());
                        break;
                    case 3:
                        makePlanetsActivity(planets[position], planetsIcons[position], mercury());
                        break;
                    case 4:
                        makePlanetsActivity(planets[position], planetsIcons[position], moon());
                        break;
                    case 5:
                        makePlanetsActivity(planets[position], planetsIcons[position], neptune());
                        break;
                    case 6:
                        makePlanetsActivity(planets[position], planetsIcons[position], pluto());
                        break;
                    case 7:
                        makePlanetsActivity(planets[position], planetsIcons[position], saturn());
                        break;
                    case 8:
                        makePlanetsActivity(planets[position], planetsIcons[position], sun());
                        break;
                    case 9:
                        makePlanetsActivity(planets[position], planetsIcons[position], uranus());
                        break;
                    case 10:
                        makePlanetsActivity(planets[position], planetsIcons[position], venus());
                        break;
                    default:
                        Toast.makeText(Planets.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }//Constellations :: Jupiter :: Mars :: Mercury :: Moon :: Neptune :: Pluto :: Saturn :: Sun :: Uranus Planet :: Venus
            }
        });
    }

    public void makePlanetsActivity(int title, int image, String description) {
        Intent intent = new Intent(Planets.this, PressedActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    private String constellations() {
        String constellationsDesc = "Constellations are groups of stars forming a recognizable pattern that are traditionally named after its apparent form or identified with a mythological figure.\n" +
                "\n" +
                "In 1922, the International Astronomical Union (IAU) recognized 88 modern constellations.\n" +
                "\n" +
                "Constellation names that come from Greek mythology and figures from Greek and Roman myths are the best known. They were created and documented by the Greek astronomer Ptolemy.\n"+
                "Constellation names associated with figures from mythology include most of the members of the Perseus family, the Hercules family, the Orion family, the Zodiac family and the Ursa Major family. There is also the Heavenly waters constellation family from old Mesopotamia traditions.\n" +
                "\n" +
                "Newer named costellations include constellations named by Nicolas Louis de Lacaille in the 18th century with names after scientific instruments and costellations of Johann Bayer family named after exotic animals.\n" +
                "\n" +
                "The full costellation names list is the following\n" +
                "\n" +
                "HERCULES FAMILY\n" +
                "\n" +
                "Hercules, Sagitta, Aquila, Lyra, Cygnus, Vulpecula, Hydra, Sextans, Crater, Corvus, Ophiuchus, Serpens, Scutum, Centaurus, Lupus, Corona Australis, Ara, Triangulum Australe, Crux\n" +
                "\n" +
                "URSA MAJOR FAMILY\n" +
                "\n" +
                "Ursa Major, Ursa Minor, Draco, Canes Venatici, Bootes, Coma Berenices, Corona Borealis, Camelopardalis, Lynx, Leo Minor\n" +
                "\n" +
                "PERSEUS FAMILY\n" +
                "\n" +
                "Cassiopeia, Cepheus, Andromeda, Perseus, Pegasus, Cetus, Auriga, Lacerta, Triangulum\n" +
                "\n" +
                "ORION FAMILY\n" +
                "\n" +
                "Orion, Canis Major, Canis Minor, Lepus, Monoceros\n" +
                "\n" +
                "ZODIAC FAMILY\n" +
                "\n" +
                "Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces\n" +
                "\n" +
                "HEAVENLY WATERS FAMILY\n" +
                "\n" +
                "Delphinus, Equuleus, Eridanus, Piscis Austrinus, Carina, Puppis, Vela, Pyxis, Columba\n" +
                "\n" +
                "BAYER FAMILY\n" +
                "\n" +
                "Hydrus, Dorado, Volans, Apus, Pavo, Grus, Phoenix, Tucana, Indus, Chamaeleon, Musca\n" +
                "\n" +
                "LACAILLE FAMILY\n" +
                "\n" +
                "Norma, Circinus, Telescopium, Microscopium, Sculptor, Fornax, Caelum, Horologium, Octans, Mensa, Reticulum, Pictor, Antlia";
        return constellationsDesc;
    }

    private String jupiter() {
        String jupiterDesc = "Jupiter is the fifth planet from the Sun and the largest in the Solar System. Jupiter is more than twice as massive as all the other planets combined.\n" +
                "\n" +
                "Jupiter is the Roman name of Zeus, the king of gods, the ruler of Olympus. Jupiter was known to astronomers in ancient times as it is the fourth brightest object in the sky (after the Sun, the Moon and Venus).\n" +
                "\n" +
                "Jupiter has at least 67 moons, the larger ones were discovered by Galileo Galilei in 1610 (Io, Europa, Ganymede, Callisto). Some of the more recently discovered are Metis, Adrastea, Amalthea and Thebe, Leda, Himalia, Lysithea, Elara, Ananke, Carme, Pasiphae and Sinope.";
        return jupiterDesc;
    }

    private String mars() {
        String marsDesc = "Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, after Mercury. Mars is the Roman name of Aris, the god of War.\n" +
                "\n" +
                "The planet got this name due to its blood-red color. It is often referred as the \"Red Planet\" because the iron oxide prevalent on its surface gives it a reddish color. Mars has two moons, Phobos and Deimos, which are small and irregularly shaped. Mars has been known since prehistoric times.";
        return marsDesc;
    }

    private String mercury() {
        String mercuryDesc = "Mercury is the closest planet to the Sun and is also the smallest of the eight planets in our solar syste. Mercury is the Roman name for Hermes the god of commerce, travel and thievery. Hermes is the messenger of the gods, known for his speed and swiftness. That is why the planet received this name - because it moves so quickly across the sky (Mercury takes only 88 days to orbit the Sun). Mercury has been known since at least the time of the Sumerians (3rd millennium BC).";
        return mercuryDesc;
    }
    private String neptune() {
        String neptuneDesc = "Neptune is the eighth known planet from the Sun. Neptune is the Roman name of Poseidon the god of the Sea. Neptune is not visible to the unaided eye and is the only planet in the Solar System found by mathematical prediction rather than by empirical observation. Neptune's blue color is largely the result of absorption of red light by methane in the atmosphere.\n" +
                "\n" +
                "Neptune has 14 known moons with Triton it's largest one.";
        return neptuneDesc;
    }

    private String moon() {
        String moonDesc = "The Moon is the only natural satellite of Earth. It is the second brightest object in the sky after the Sun.\n" +
                "\n" +
                "The Moon was called Selene and Artemis by the Greeks, Luna by the Romans.";
        return moonDesc;
    }

    private String pluto() {
        String plutoDesc =
                "Pluto is the most distant planet from the Sun, usually orbiting beyond the orbit of Neptune.\n" +
                "\n" +
                "Pluto is the Roman name for Hades, the Greek god of the Underworld. The planet received it's name because of it's distance from the Sun and because it is in perpetual darkness.\n" +
                "\n" +
                "It is much smaller than any of the official planets and now classified as a \"dwarf planet\".";
        return plutoDesc;
    }

    private String saturn() {
        String saturnDesc = "Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius about nine times that of Earth.\n" +
                "\n" +
                "Saturn is the Roman god of agriculture. The associated Greek god, Cronus, was the son of Uranus and Gaia and the father of Zeus (Jupiter). Saturn has a prominent ring system that consists of nine continuous main rings and three discontinuous arcs.\n" +
                "\n" +
                "62 moons are known to orbit Saturn. Most interesting are the three moon pairs Mimas-Tethys, Enceladus-Dione and Titan-Hyperion that interact gravitationally. Titan, Saturn's largest moon is larger than the planet Mercury.\n";
        return saturnDesc;
    }

    private String sun() {
        String sunDesc = "The Sun is the star at the center of the Solar System and it's one of more than 100 billion stars in our galaxy. It's mass accounts for about 99.86% of the total mass of the Solar System.\n" +
                "\n" +
                "It's enormous effect for life on Earth has been recognized since prehistoric times, and the Sun has been regarded by many cultures as a deity, the Greeks called it Helios and the Romans called it Sol.";
        return sunDesc;
    }

    private String uranus() {
        String uranusDesc = "Uranus is the seventh planet from the Sun. It is the only planet whose name is derived directly from a figure from Greek mythology, Uranus the the ancient Greek deity of the Heavens, the earliest supreme god. Uranus was the son and mate of Gaia amd the father of Cronus (Saturn) and of the Cyclopes and Titans (predecessors of the Olympian gods). Like the other giant planets, Uranus has a ring system, a magnetosphere, and numerous moons.\n";
        return uranusDesc;
    }

    private String venus() {
        String venusDesc = "Venus is the second planet from the Sun. It is by far the hottest planet in the Solar System, with a mean surface temperature of 735 K (462 °C; 863 °F) even though Mercury is closer to the Sun.\n" +
                "\n" +
                "Venus is the Roman name for Aphrodite, the goddess of love and beauty. The planet is so named because it is the brightest of the planets known to the ancients. It is the brightest object in the sky except for the Sun and the Moon. Venus has been known since prehistoric times. It was popularly thought to be two separate bodies: Eosphorus as the morning star and Hesperus as the evening star.";
        return venusDesc;
    }


}

package com.example.igboamaka.funfacts.proverbs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.igboamaka.R;
import com.example.igboamaka.home.sentences.SentenceCategoryAdapter;
import com.example.igboamaka.home.sentences.Sentences;

import java.util.ArrayList;
import java.util.List;

public class ProverbsActivity extends AppCompatActivity {
    List<Proverbs> proverbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverbs);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Proverbs");

        setSupportActionBar(toolbar);

        proverbs = new ArrayList<>();

        proverbs.add(new Proverbs("Gidi gidi bụ ugwu eze", "Unity is strength", Color.parseColor("#FF9249")));

        proverbs.add(new Proverbs("Chọọ ewu ojii ka chi dị", "Make hay while the sun shines", Color.parseColor("#B13254")));
        proverbs.add(new Proverbs("Otu onye tuo izu, o gbue ochu", "Knowledge is never complete two heads are \nbetter than one",Color.parseColor("#FF5449")));
        proverbs.add(new Proverbs("Oge adighi eche mmadu", "Time and tide wait for nobody",Color.parseColor("#FF9249")));

        proverbs.add(new Proverbs("Ebe onye dara ka chi ya kwaturu ya", "Where one falls is where his god pushed\n him down",Color.parseColor("#FF7349")));
        proverbs.add(new Proverbs("Ihe di woro ogori azuala na ahia", "What was secret is revealed in the market place",Color.parseColor("#471437")));
        proverbs.add(new Proverbs("Ewu nwuru n'oba ji abughi agu \ngburu ya", "A goat that dies in a barn was never killed \nby hunger", Color.parseColor("#B13254")));

        proverbs.add(new Proverbs("Si kele onye nti chiri; enu anughi, \nala anu", "Salute the deaf; if the heavens don't hear, the \nearth will hear.",Color.parseColor("#FF5449")));
        proverbs.add(new Proverbs("O na-abu a si nwata wuba ahu, o \nsaba afo ya", "Tell a child to wash his body, he washes his \nstomach",Color.parseColor("#FF9249")));

        proverbs.add(new Proverbs("Ukpala gbabara n'ikpo okuko na-ala ala mmuo", "The grasshopper that runs into the mist of fowls ends up in the land of spirits.",Color.parseColor("#FF7349")));
        proverbs.add(new Proverbs("Onye hapu onu ya, uguru arachaa ya", "If one fails to lick his lips, the harmattan will do it",Color.parseColor("#471437")));
        proverbs.add(new Proverbs("Okuko na-arogoro ite onu, chetekwe \nmma gburu ya", "The chicken frowns at the cooking pot, ignoring the knife that killed it.", Color.parseColor("#B13254")));

        proverbs.add(new Proverbs("Ihe ka-nte bata n'onu nte, nte etefu", "When something greater than the pigmy cricket enters its hole, it takes off", Color.parseColor("#B13254")));
        proverbs.add(new Proverbs("Uzu na-amaghi akpu ogene lee egbe \nanya n'odu", "The blacksmith who does know how to forge \na metal gong should look at the tail of a kite",Color.parseColor("#FF5449")));
        proverbs.add(new Proverbs("Okuko nyuo ahu, ana achuwa ya oso", "When the fowl farts, the ground becomes a nuisance",Color.parseColor("#FF9249")));

        proverbs.add(new Proverbs("Ohia woro gi nku, sere gi onu", "The forest that denies you firewood has massaged your neck",Color.parseColor("#FF7349")));
        proverbs.add(new Proverbs("Okuko mmanya na-egbu ahubegh i mmanwulu ara na-ayi", "A drunken fowl has not met a mad fox",Color.parseColor("#471437")));
        proverbs.add(new Proverbs("Onye si na ya anaghi ata anu nkita, \nya arakwala mmiri ofe ya", "He who abhors dog meat should not eat \ndog-meat soup", Color.parseColor("#B13254")));

        proverbs.add(new Proverbs(" A tuoro omara, o mara, a tuoro \nofeke, o fenye ishi n'ohia", "If you tell a wise one, he understands; tell a \ndunce, he runs into the bush", Color.parseColor("#B13254")));
        proverbs.add(new Proverbs("Hapu ihe e dere na moto banye \nmoto", "Forget what is written on the vehicle’s body \nand enter the vehicle",Color.parseColor("#FF5449")));
        proverbs.add(new Proverbs("Nni bu ndu", "Food is life",Color.parseColor("#FF9249")));

        proverbs.add(new Proverbs("Egwu adiro atu afo, oburu uzo", "Fear does not affect the stomach, that’s why it \nis always in front",Color.parseColor("#FF7349")));
        proverbs.add(new Proverbs("O ji ngaji eri chetakwa ndi ji aka", "He who eats with spoon should remember \nthose who uses hand to eat",Color.parseColor("#471437")));
        proverbs.add(new Proverbs("Ara ga gba ndi ara", "Lunatics shall soon run mad", Color.parseColor("#B13254")));

        proverbs.add(new Proverbs("Ewere otutu cho ewu ojii tupu \nabali eruo", "Look for a black goat during the day before \nthe night comes.",Color.parseColor("#FF9249")));


        RecyclerView recyclerView = findViewById(R.id.proverbs_recycler_view);
        ProverbsAdapter adapter = new ProverbsAdapter(ProverbsActivity.this, proverbs);

        recyclerView.setLayoutManager(new LinearLayoutManager(ProverbsActivity.this));
        recyclerView.setAdapter(adapter);


    }
}
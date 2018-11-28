package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> phrase = new ArrayList<Word>();
        phrase.add(new Word("Where are you going?", "minto wuksus"));
        phrase.add(new Word("What is your name?", "tinnә oyaase'nә"));
        phrase.add(new Word("son", "angsi"));
        phrase.add(new Word("daughter", "tune"));
        phrase.add(new Word("older brother", "taachi"));
        phrase.add(new Word("younger brother", "chalitti"));
        phrase.add(new Word("older sister", "teṭe"));
        phrase.add(new Word("younger sister", "kolliti"));
        phrase.add(new Word("grandmother", "ama"));
        phrase.add(new Word("grandfather", "paapa"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, phrase,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
    }
}

package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class  NumbersActivity extends AppCompatActivity {
    public MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            mMediaPlayer.release();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of numbers
        final ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one", "lutti", R.drawable.number_one,R.raw.number_one));
        numbers.add(new Word("two", "otiiko", R.drawable.number_two,R.raw.number_two));
        numbers.add(new Word("three", "tolookosu", R.drawable.number_three,R.raw.number_three));
        numbers.add(new Word("four", "oyyisa", R.drawable.number_four,R.raw.number_four));
        numbers.add(new Word("five", "massokka", R.drawable.number_five,R.raw.number_five));
        numbers.add(new Word("six", "temmokka", R.drawable.number_six,R.raw.number_six));
        numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new Word("eight", "kawinta", R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new Word("nine", "wo’e", R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new Word("ten", "na’aacha", R.drawable.number_ten,R.raw.number_ten));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, numbers,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=numbers.get(position);
                releaseMediaPlayer();
                Log.v("NumbersActivity", "Current word: " + word);

                mMediaPlayer= MediaPlayer.create(NumbersActivity.this,word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
    private void releaseMediaPlayer(){
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}

package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.example.android.musicplayer.R.string.podcasts;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //TextView home = (TextView)findViewById(R.id.link_home);
        TextView library = (TextView)findViewById(R.id.link_library);
        TextView podcasts = (TextView)findViewById(R.id.link_podcasts);
        TextView store = (TextView)findViewById(R.id.link_store);

//        home.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                Intent homeIntent = new Intent(Home.this, Home.class);
//                startActivity(homeIntent);
//            }
//        });

        library.setOnClickListener(new View.OnClickListener()
        {
            /**
             * create Intent so when Library is clicked, the page changes to Library
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent libraryIntent = new Intent(Home.this, Library.class);
                startActivity(libraryIntent);
            }
        });

        podcasts.setOnClickListener(new View.OnClickListener()
        {
            /**
             * create Intent so when Podcasts is clicked, the page is changed Podcasts
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent podcastsIntent = new Intent (Home.this, Podcasts.class);
                startActivity(podcastsIntent);
            }
        });

        store.setOnClickListener(new View.OnClickListener()
        {
            /**
             * create Intent so when Store is clicked, the page changes to Store
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent storeIntent = new Intent (Home.this, Store.class);
                startActivity(storeIntent);
            }
        });

    }
}

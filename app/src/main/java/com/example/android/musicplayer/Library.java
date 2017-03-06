package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        TextView home = (TextView)findViewById(R.id.link_home);
        //TextView library = (TextView)findViewById(R.id.link_library);
        final TextView podcasts = (TextView)findViewById(R.id.link_podcasts);
        TextView store = (TextView)findViewById(R.id.link_store);

        home.setOnClickListener(new View.OnClickListener()
        {
            /**
             * creates Intent so when Home is clicked, the page changes to Home
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent homeIntent = new Intent(Library.this, Home.class);
                startActivity(homeIntent);
            }
        });

        podcasts.setOnClickListener(new View.OnClickListener()
        {
            /**
             * creates Intent so when Podcasts is clicked, the page changes to Podcasts
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent podcastsIntent = new Intent(Library.this, Podcasts.class);
                startActivity(podcastsIntent);
            }
        });

        store.setOnClickListener(new View.OnClickListener()
        {
            /**
             * creates Intent so when Store is clicked, the page changes to Store
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent storeIntent = new Intent(Library.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}

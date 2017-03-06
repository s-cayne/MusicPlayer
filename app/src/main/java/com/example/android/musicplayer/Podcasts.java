package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Podcasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcasts);

        TextView home = (TextView)findViewById(R.id.link_home);
        TextView library = (TextView)findViewById(R.id.link_library);
        //TextView podcasts = (TextView)findViewById(R.id.link_podcasts);
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
                Intent homeIntent = new Intent (Podcasts.this, Home.class);
                startActivity(homeIntent);
            }

        });

        library.setOnClickListener(new View.OnClickListener()
        {
            /**
             * creates Intent so when Library is clicked, the page changes to Library
             * @param view
             */
            @Override
            public void onClick(View view)
            {
                Intent libraryIntent = new Intent (Podcasts.this, Library.class);
                startActivity(libraryIntent);
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
                Intent storeIntent = new Intent (Podcasts.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}

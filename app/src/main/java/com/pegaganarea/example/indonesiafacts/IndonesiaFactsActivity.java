package com.pegaganarea.example.indonesiafacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class IndonesiaFactsActivity extends ActionBarActivity {
    //build objek for content and color
    private ColorFacts mColorFact = new ColorFacts();
    private ContentFacts mContentFacts = new ContentFacts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesia_facts);

        //Declare variable and asign of view aplication
        final TextView Content = (TextView) findViewById(R.id.Content);
        final Button ShowFactButton = (Button) findViewById(R.id.ShowFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //button action
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Set text into Content
                String fact = mContentFacts.getFact();
                Content.setText(fact);

                //Set ColorFacts into background and button text
                int color = mColorFact.getColor();
                relativeLayout.setBackgroundColor(color);
                ShowFactButton.setTextColor(color);
            }
        };
        ShowFactButton.setOnClickListener(listener);


        //notification action
    }
}

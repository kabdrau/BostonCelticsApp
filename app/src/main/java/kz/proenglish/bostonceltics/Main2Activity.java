package kz.proenglish.bostonceltics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    // create a property
    Button introButton;
    Button newsButton;
    Button playersButton;
    Button ticketsButton;
    Button callButton;
    Button emailButton;
    Button formulaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        introButton = (Button) findViewById(R.id.introButton);
        newsButton = (Button) findViewById(R.id.newsButton);
        playersButton = (Button) findViewById(R.id.playersButton);
        ticketsButton = (Button) findViewById(R.id.ticketsButtons);
        callButton = (Button) findViewById(R.id.callButton);
        emailButton = (Button) findViewById(R.id.emailButton);
        formulaButton = (Button) findViewById(R.id.formulaButton);

        introButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Boston_Celtics");
                Intent goToOtherActivity = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(goToOtherActivity);
            }
        });

        newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri1 = Uri.parse("https://twitter.com/celtics?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
                Intent goToOtherActivity = new Intent(Intent.ACTION_VIEW, uri1 );
                startActivity(goToOtherActivity);
            }
        });

        playersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToOtherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToOtherActivity);
            }
        });

        ticketsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri2 = Uri.parse("https://www.vividseats.com/nba-basketball/boston-celtics-tickets.html");
                Intent goToOtherActivity = new Intent(Intent.ACTION_VIEW, uri2 );
                startActivity(goToOtherActivity);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri phoneNumber = Uri.parse("tel:8582038039");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, phoneNumber);
                startActivity(callIntent);
            }
        });

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"kabdrau@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Boston Celtics Tickets");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi, I want to buy tickets for the upcoming match");
                startActivity(emailIntent);
            }
        });

        formulaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToOtherActivity = new Intent(getApplicationContext(),FormulaActivity.class);
                startActivity(goToOtherActivity);
            }
        });
    }
}
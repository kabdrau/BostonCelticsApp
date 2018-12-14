package kz.proenglish.bostonceltics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetailActivity extends AppCompatActivity {

    // create a property
    TextView nameTextView;
    TextView ageTextView;
    TextView heightTextView;
    TextView positionTextView;
    ImageView imageView;
    EditText pointsEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        // connecting all things
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);
        heightTextView = (TextView) findViewById(R.id.heightTextView);
        positionTextView = (TextView) findViewById(R.id.positionTextView);
        imageView = (ImageView) findViewById(R.id.imageView);
        pointsEditText = (EditText) findViewById(R.id.pointsEditText);

        // calling the Player class
        Player player = (Player) getIntent().getSerializableExtra("player");

        // filling the Player attributes
        nameTextView.setText(player.getName());
        ageTextView.setText("Birth date: " + player.getAge());
        heightTextView.setText("Height: " + player.getHeight());
        positionTextView.setText("Position: " + player.getPosition());
        imageView.setImageResource(player.getImage());
    }
}
package kz.proenglish.bostonceltics;

import android.icu.util.IslamicCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormulaActivity extends AppCompatActivity {

    EditText PointsEditText;
    Button fifteenPercentButton;
    Button twentyPercentButton;
    Button twentyfivePercentButton;
    EditText perEditText;
    TextView Attempts2TextView;
    TextView Fails2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);

        PointsEditText = (EditText) findViewById(R.id.PointsEditText);
        fifteenPercentButton = (Button) findViewById(R.id.fifteenPercentButton);
        twentyPercentButton = (Button) findViewById(R.id.twentyPercentButton);
        twentyfivePercentButton = (Button) findViewById(R.id.twentyfivePercentButton);
        perEditText = (EditText) findViewById(R.id.perEditText);
        Attempts2TextView = (TextView) findViewById(R.id.Attempts2TextView);
        Fails2TextView = (TextView) findViewById(R.id.Fails2TextView);

        fifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheAttempts(15.0);
            }
        });
        twentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheAttempts(20.0);
            }
        });
        twentyfivePercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { calcTheAttempts(25.0);
            }
        });
        perEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheAttempts(Double.valueOf(perEditText.getText().toString()));
            }
        });
    }

    // method calcTheAttemots for DRY programming
    void calcTheAttempts(Double percentage) {
        // get the number for the EditText
        Double points = Double.valueOf(PointsEditText.getText().toString());

        // determine the attempts
        Double attempts = (points * 100) / percentage;

        // display the attempts
        Attempts2TextView.setText(String.format("%.0f", attempts));

        // determine the failed attempts
        Double fails = attempts - points;

        // display the failed attempts
        Fails2TextView.setText(String.format("%.0f", fails));
    }
}
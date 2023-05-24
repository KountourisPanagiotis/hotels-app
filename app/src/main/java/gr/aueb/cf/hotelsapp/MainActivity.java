package gr.aueb.cf.hotelsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView backArrow;
    private ImageView menuBtn;
    private RatingBar ratingBar;
    private Button reservationBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backArrow = findViewById(R.id.backArrow);
        menuBtn = findViewById(R.id.menuBtn);
        ratingBar = findViewById(R.id.ratingBar);
        reservationBtn = findViewById(R.id.reservationBtn);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        reservationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                Toast.makeText(MainActivity.this, "Rating " + rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
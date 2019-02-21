package course.examples.ui.ratingsbar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;


public class RatingsBarActivity extends AppCompatActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView tv = (TextView) findViewById(R.id.textView);
        final RatingBar bar = (RatingBar) findViewById(R.id.ratingbar);

        bar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

        	// Called when the user swipes the RatingBar
        	@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
				tv.setText("Rating:" + rating);
			}
		});
    }
}
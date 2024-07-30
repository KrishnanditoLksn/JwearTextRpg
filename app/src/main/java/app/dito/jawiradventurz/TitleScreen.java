package app.dito.jawiradventurz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    public void redirectToGameScreen(View view) {
        Intent navGame = new Intent(this, GameScreen.class);
        try {
            startActivity(navGame);
        } catch (ActivityNotFoundException e) {
            Log.e("TitleScreen", "Activity not found");
        }
    }
}
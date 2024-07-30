package app.dito.jawiradventurz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class GameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game_screen);
    }

    public void redirectBacToTitle(View view) {
        Intent downloadIntent = new Intent(this, GameScreen.class);
        try {
            startActivity(downloadIntent);
        } catch (ActivityNotFoundException e) {
            Log.d("GameScreen", "Activity not found");
        }
    }
}
package app.dito.jawiradventurz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class GameScreen extends AppCompatActivity {
    private ImageView imageView1;
    private TextView textView1;
    private Button button1, button2, button3;
    private final GameStory gameStory = new GameStory(this);

    public Button getButton1() {
        return button1;
    }

    public void setButton1(String buttonText) {
        if (buttonText != null) {
            this.button1.setText(buttonText);
        }
    }

    public void setButton2(String buttonText) {
        if (buttonText != null) {
            this.button2.setText(buttonText);
        }
    }

    public void setButton3(String buttonText) {
        if (buttonText != null) {
            this.button3.setText(buttonText);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game_screen);
        imageView1 = findViewById(R.id.imageView);
        textView1 = findViewById(R.id.optionTextView1);
        button1 = findViewById(R.id.optionButton1);
        gameStory.entryPoint();
    }

    public ImageView getImageView() {
        return imageView1;
    }

    public void setImageView(int imageView) {
        if (imageView != 0) {
            this.imageView1.setImageResource(imageView);
        }
    }

    public TextView getTextView() {
        return textView1;
    }

    public void setTextView(String textView) {
        if (textView != null) {
            this.textView1.setText(textView);
        }
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
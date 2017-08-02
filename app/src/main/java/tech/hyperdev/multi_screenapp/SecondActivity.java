package tech.hyperdev.multi_screenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null) {
            String sentMessage = intent.getStringExtra("key-sent-message");
            Toast.makeText(this, sentMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void reply(View view) {
        finish();
    }
}

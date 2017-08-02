package tech.hyperdev.multi_screenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        String sendMe = "This is the message I want to send!";
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key-sent-message", sendMe);
        startActivity(intent);
    }
}

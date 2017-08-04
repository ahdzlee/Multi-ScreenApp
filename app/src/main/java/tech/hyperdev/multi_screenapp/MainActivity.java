package tech.hyperdev.multi_screenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtMessage;

    public static final String KEY_SEND_MESSAGE = "key-sent-message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        mEtMessage = (EditText) findViewById(R.id.etMessage);
    }

    public void send(View view) {
        String sendMe = mEtMessage.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(KEY_SEND_MESSAGE, sendMe);
        startActivity(intent);
    }
}

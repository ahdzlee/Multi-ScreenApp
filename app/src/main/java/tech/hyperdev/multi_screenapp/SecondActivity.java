package tech.hyperdev.multi_screenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView mTvSentMsgHolder;
    private TextView mTvSentMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViews();

        Intent intent = getIntent();
        if (intent != null) {
            String sentMessage = intent.getStringExtra(MainActivity.KEY_SEND_MESSAGE);
            if (!TextUtils.isEmpty(sentMessage)) {
                mTvSentMsgHolder.setVisibility(View.VISIBLE);
                mTvSentMsg.setVisibility(View.VISIBLE);

                mTvSentMsg.setText(sentMessage);
            }
        }
    }

    private void findViews() {
        mTvSentMsgHolder = (TextView) findViewById(R.id.tvSentMsgHolder);
        mTvSentMsg = (TextView) findViewById(R.id.tvSentMsg);
    }

    public void reply(View view) {
        finish();
    }
}

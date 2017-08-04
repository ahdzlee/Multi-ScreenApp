package tech.hyperdev.multi_screenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEtMessage;
    private TextView mTvReplyHolder;
    private TextView mTvReply;

    public static final String KEY_SEND_MESSAGE = "key-sent-message";
    public static final int REQ_CODE_REPLY_MESSAGE = 1111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        mEtMessage = (EditText) findViewById(R.id.etMessage);
        mTvReplyHolder = (TextView) findViewById(R.id.tvReplyHolder);
        mTvReply = (TextView) findViewById(R.id.tvReply);
    }

    public void send(View view) {
        String sendMe = mEtMessage.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(KEY_SEND_MESSAGE, sendMe);
        startActivityForResult(intent, REQ_CODE_REPLY_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQ_CODE_REPLY_MESSAGE) {
                String replyMsg = data.getStringExtra(SecondActivity.KEY_REPLY_MESSAGE);
                mTvReplyHolder.setVisibility(View.VISIBLE);
                mTvReply.setVisibility(View.VISIBLE);
                mTvReply.setText(replyMsg);
            }
        }
    }
}

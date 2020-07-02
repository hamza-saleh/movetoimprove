package ch.zli.m335.movetoimprove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {
    private TextView countdownText;

    private CountDownTimer countDownTimer;
    private long timeleftinmillisec =
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
    }
}
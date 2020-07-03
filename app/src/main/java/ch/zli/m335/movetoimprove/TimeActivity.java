package ch.zli.m335.movetoimprove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.format.Time;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {
    private TextView countdownText;

    private CountDownTimer countDownTimer;
    private long TimeLeftInMilliSeconds = 86400000;
    private boolean TimerRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        countdownText = findViewById(R.id.countdown_text);
        startTimer();
    }
    public void startTimer() {
        countDownTimer = new CountDownTimer(TimeLeftInMilliSeconds, 1000) {
            @Override
            public void onTick(long l) {
                TimeLeftInMilliSeconds = l;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    private void updateTimer() {
        int hour = (int) TimeLeftInMilliSeconds / 3600000;
        int minute = (int) TimeLeftInMilliSeconds % 3600000 / 60000;
        int seconds = (int) TimeLeftInMilliSeconds % 60000 / 1000;
        String timeleft;

        timeleft = "" + hour;
        timeleft +=  ":";
        timeleft += "" + minute;
        timeleft +=  ":";
        if (seconds < 10 ) timeleft += "0";
        timeleft += seconds;
        countdownText.setText(timeleft);

    }
    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        TimeLeftInMilliSeconds = prefs.getLong("millisLeft", 86400000);
        TimerRunning = prefs.getBoolean("timerRunning", false);
        updateTimer();
        if (TimerRunning) {
            if (TimeLeftInMilliSeconds < 0) {
                TimeLeftInMilliSeconds = 0;
                updateTimer();
            } else {
                startTimer();
            }
        }
    }
}
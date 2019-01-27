package com.example.simpletimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements onClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private MyCountDownTimer countDownTimer;
    private long timeElapsed;
    private boolean timerHasStarted = false;
    private Button startB;
    private TextView text;
    private TextView timeElapsedView;
    private final long startTime = 50 * 1000;
    private final long interval = 1 * 1000;
}

public class onCreate {
    startB =(Button)this.findViewById(R.id.button);
    startB.setOnClickListener(this);
    text =(TextView)this.findViewById(R.id.timer);
    timeElapsedView =(TextView)this.findViewById(R.id.timeElapsed);
    countDownTimer =new MyCountDownTimer(startTime, interval);
    text.setText(text.getText()+String.valueOf(startTime));
}

public class onClick {
    if(!timerHasStarted) {
        countDownTimer.start();
        timerHasStarted = true;
        startB.setText("Start");
    }
    else {
        countDownTimer.cancel();
        timerHasStarted = false;
        startB.setText("Reset");
    }
}

public class onFinish {
    text.setText("Time's up!");
    timeElapsedView.setText("Time Elapsed: "+String.valueOf(startTime));
}
public class onTick {
    text.setText("Time remain: "+millisUntilFinished);
    timeElapsed =startTime -millisUntilFinished;
    timeElapsedView.setText("Time Elapsed: "+String.valueOf(timeElapsed));

}
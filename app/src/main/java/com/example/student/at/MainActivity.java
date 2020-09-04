package com.example.student.at;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.View;
import android.view.ViewGroup;
import android.transition.TransitionManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.MotionEvent;


public class MainActivity extends AppCompatActivity {
    ViewGroup layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=(ViewGroup)findViewById(R.id.layout);
        layout.setOnTouchListener(
                new RelativeLayout.OnTouchListener()
                {
                    public boolean onTouch(View v,MotionEvent event)
                    {
                        moveButton();
                        return true;
                    }
                }
        );
    }
    public void moveButton()
    {
        View b1=findViewById(R.id.b1);

        //changing position
        RelativeLayout.LayoutParams positionRule=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRule.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        b1.setLayoutParams(positionRule);

        // Changing Size Of Button
     ViewGroup.LayoutParams sizeRule=b1.getLayoutParams();
        sizeRule.height=400;
        sizeRule.width=450;
        b1.setLayoutParams(sizeRule);
    }
}

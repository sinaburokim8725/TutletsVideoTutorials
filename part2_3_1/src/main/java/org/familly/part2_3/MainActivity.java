package org.familly.part2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //리니어 레이아웃에 두개의 버튼을 추가한다.
        LinearLayout linear = new LinearLayout(this);
        //버튼두개달기
        Button button1 = new Button(this);
        button1.setText("버튼 1");
        //버튼추가
        linear.addView(button1);
        //두번째버튼
        Button button2 = new Button(this);
        button2.setText("버트 2");
        //2번째버튼 추가
        linear.addView(button2);

        //컨텐츠 메모리에 띄우기
        setContentView(linear);
    }
}

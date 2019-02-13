package org.familly.part2_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab3_3MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVisibleTrue;
    Button btnVisibleFalse;
    Button btnVisibleGone;
    TextView textVisibleTarget;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3_main);


        //버튼클릭 이벤트를 할려면 버튼을 참조해야 한다.
        btnVisibleTrue = (Button) findViewById(R.id.btn_visible_true);
        btnVisibleFalse = (Button) findViewById(R.id.btn_visible_false);
        btnVisibleGone = (Button) findViewById(R.id.btn_visible_gone);
        textVisibleTarget = (TextView) findViewById(R.id.text_visible_target);


        /**
         //텍스트 뷰를 보여준다.
         btnVisibleTrue.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        textVisibleTarget.setVisibility(View.VISIBLE);
        }
        });
         //텍스트 뷰를 감춘다.
         //invisible 과 gone 차이점? 영역보존과 영역제거가 다르다.
         //비표시
         btnVisibleFalse.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        textVisibleTarget.setVisibility(View.INVISIBLE);
        }
        });
         **/
        //리스너 등록
        btnVisibleTrue.setOnClickListener(this);
        btnVisibleFalse.setOnClickListener(this);
        btnVisibleGone.setOnClickListener(this);

    }

    //클릭리스너인터페이스 구현할려면 이쪽으로
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_visible_true:
                textVisibleTarget.setVisibility(View.VISIBLE);
                break;
            case R.id.btn_visible_false:
                textVisibleTarget.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_visible_gone:

                textVisibleTarget.setVisibility(View.GONE);
                break;
            default:

        }

//        if 구문도 사용가능

/*
        if (v == btnVisibleTrue) {
            textVisibleTarget.setVisibility(View.VISIBLE);
        } else if (v == btnVisibleFalse) {
            //textVisibleTarget.setVisibility(View.INVISIBLE);
            textVisibleTarget.setVisibility(View.GONE);
        }
*/

    }
}

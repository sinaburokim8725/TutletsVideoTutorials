package org.familly.part2_3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Lab3_4MainActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_4_main);

        TextView txtFontApply = (TextView) findViewById(R.id.txt_font_apply);
        //외부폰트적용
        Typeface typeface = Typeface.createFromAsset(getAssets(), "SDMiSaeng.ttf");
        //텍스트에 적용
        txtFontApply.setTypeface(typeface);
        checkBox = (CheckBox) findViewById(R.id.check);

        //첵크 여부 확인
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkBox.setText("is Checked");
                } else {
                    checkBox.setText("is Unchecked");
                }
            }
        });
    }
}

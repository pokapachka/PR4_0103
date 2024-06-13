package com.example.pr4_osokin_l;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        }

        public void onStepAge(View view) {
            EditText _name = findViewById(R.id.editText);
            String strName = _name.getText().toString();

            setContentView(R.layout.step_2);

            TextView tv = findViewById(R.id.textView2);
            tv.setText("Очень приятно познакомиться " +strName+".\nМеня зовут Споти.\n Сколько тебе лет?");
        }

        public void onStep3(View view) {
            EditText age = findViewById(R.id.editText2);
            String strAge = age.getText().toString();
            setContentView(R.layout.step_3);
            TextView tv = findViewById(R.id.textView3);
            tv.setText("Ничего себе ты большой, целых " +strAge+ "лет\nnКакого ты пола?");
        }

        public void onStep4(View view) {
            setContentView(R.layout.step_4);
    }
}
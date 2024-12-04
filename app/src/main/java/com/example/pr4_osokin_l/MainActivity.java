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

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        }

    public void onStepAge(View view){
        EditText tbName = findViewById(R.id.Age);
        String NameUser = tbName.getText().toString();
        setContentView(R.layout.step_2);
        TextView tvName = findViewById(R.id.tvName);
        tvName.setText("Очень приятно познакомится "+NameUser+"\n Меня зовут Споти.\n Сколько тебе лет?");
    }

        public void onStepSex(View view) {
            EditText age = findViewById(R.id.Age);
            String strAge = age.getText().toString();
            setContentView(R.layout.step_3);
            TextView tv = findViewById(R.id.textView);
            tv.setText("Ничего себе ты большой, целых " +strAge+ " лет\nКакого ты пола?");
        }

        public void onStepEmail(View view) {
            setContentView(R.layout.step_4);
    }
}
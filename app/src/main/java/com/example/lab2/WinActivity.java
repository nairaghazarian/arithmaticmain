package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class WinActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        button = findViewById(R.id.button2);
        //Добавляет слушатель нажатий на кнопку для выполнении действий при её нажатии
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //возвращает пользователя в MainActivity
                startActivity(new Intent(WinActivity.this, com.example.lab2.MainActivity.class));
                finish();// завершает текущую активность, предотвращая возврат назад
            }
        });
    }
}
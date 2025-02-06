package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Эти переменные будут использоваться для взаимодействия с элементами пользовательского интерфейса
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Здесь происходит привязка переменных к соответствующим элементам пользовательского интерфейса по их идентификатору
        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);

        //Добавляет слушатель нажатий на кнопку для выполнении действий при её нажатии
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Здесь извлекаются введённые пользователем данные
                String edit = editText.getText().toString();

                //Здесь происходит проверка введённого значения
                if (edit.isEmpty()) {
                    //Если поле пустое то выводится сообщение
                    Toast.makeText(MainActivity.this, "Поле пустое", Toast.LENGTH_SHORT).show();
                } else {
                    //Если пользователь вводит цифру 4 то происходит переход на WinActivity
                    if (Integer.parseInt(edit) == 4) {
                        startActivity(new Intent(MainActivity.this, WinActivity.class));
                        finish();
                    } else {
                        //Иначе переход на LoseActivity
                        startActivity(new Intent(MainActivity.this, com.example.lab2.LoseActivity.class));
                        finish();
                    }
                }
            }
        });
    }
}

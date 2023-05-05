package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainTimer2Activity extends AppCompatActivity {

    private EditText editAlarmName;
    private EditText editAlarmHour;
    private EditText editAlarmMinutes;
    private Button btnSaveAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_timer_2);

        TextView txtAlarmName = findViewById(R.id.txtAlarmName);
        TextView txtAlarmHour = findViewById(R.id.txtAlarmHour);

        editAlarmName = findViewById(R.id.editAlarmName);
        editAlarmHour = findViewById(R.id.editAlarmHour);
        editAlarmMinutes = findViewById(R.id.editAlarmMinutes);

        btnSaveAlarm = findViewById(R.id.btnSaveAlarm);
        btnSaveAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAlarm();
            }
        });
    }

    private void saveAlarm() {
        String alarmName = editAlarmName.getText().toString();
        String alarmHour = editAlarmHour.getText().toString();
        String alarmMinutes = editAlarmMinutes.getText().toString();

        if (alarmName.isEmpty() || alarmHour.isEmpty() || alarmMinutes.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Alarm saved successfully", Toast.LENGTH_SHORT).show();
        finish();
    }
}

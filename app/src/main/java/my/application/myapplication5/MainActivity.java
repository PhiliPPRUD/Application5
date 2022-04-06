package my.application.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView example1;
    private TextView example2;
    private EditText user_field;
    private Button button;
    private TextView result_info;
    private TextView tvSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        example1 = findViewById(R.id.example1);
        user_field = findViewById(R.id.user_field);
        button = findViewById(R.id.button);
        result_info = findViewById(R.id.result_info);
        tvSum = findViewById(R.id.sum);


            example2 = findViewById(R.id.example2);
            example1 = findViewById(R.id.example1);
            Random random = new Random();
            int val = random.nextInt(100);
            int val1 = random.nextInt(100);
            example1.setText(Integer.toHexString(val));
            example2.setText(Integer.toHexString(val1));


            button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                String sum = Double.toHexString(val+val1);
                tvSum.setText(sum);

                if(user_field.getText().equals(""))
                    Toast.makeText(MainActivity.this, R.string.no_user_input, Toast.LENGTH_LONG).show();
                else {


                }
            }
        });
    }
}
package td.nhan.lab01_exe01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etR = findViewById(R.id.etR);
        EditText etD = findViewById(R.id.etD);
        EditText etC = findViewById(R.id.etC);

        RadioButton rbDt = findViewById(R.id.rbDt);
        RadioButton rbTt = findViewById(R.id.rbTt);
        Button button = findViewById(R.id.btnCalc);
        TextView tvKq = findViewById(R.id.tvKq);

        button.setOnClickListener(v -> {
            long r = Long.parseLong(etR.getText().toString());
            long d = Long.parseLong(etD.getText().toString());
            long c = Long.parseLong(etC.getText().toString());

            if (rbDt.isChecked()) {
                tvKq.setText("KQ: " + 2 * (r * d + r * c + c * d));
            } else {
                tvKq.setText("KQ: " + (r * d * c));
            }
        });

    }

}
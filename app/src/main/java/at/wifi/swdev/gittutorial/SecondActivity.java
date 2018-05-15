package at.wifi.swdev.gittutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void nameÜbergeben(View view) {

        EditText textField = findViewById(R.id.editText);

        String txt = textField.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(RESULT,txt);

        setResult(RESULT_OK, intent);
        finish();
    }
}

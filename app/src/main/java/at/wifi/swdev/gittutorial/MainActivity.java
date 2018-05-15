package at.wifi.swdev.gittutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoActifity2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // Zu welcher Anfrage ist das die Antwort => Request-Code
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {

            String result = data.getExtras().getString(SecondActivity.RESULT);

            TextView resultTV = findViewById(R.id.resultTV);
            resultTV.setText(String.valueOf(result));
        }

        super.onActivityResult(requestCode, resultCode, data);
    }


}

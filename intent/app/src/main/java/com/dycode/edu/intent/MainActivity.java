package com.dycode.edu.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
public class MainActivity extends AppCompatActivity {

}
    public static final String EXTRA_DATA = "EXTRA_DATA";
    private EditText editText;
    private Button btnSenData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_intent );
        editText = (EditText)findViewById(R.id. editText );
        btnSenData = (Button)findViewById(R.id. button );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(this, TargetActivity.class);
                intent.putExtra( EXTRA_DATA , data);
                startActivity(intent);
        }
        });
    }

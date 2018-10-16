package my.edu.tarc.asdf1234;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main()
        super.onCreate(savedInstanceState);

        //to display UI
        //R = resource class
        //layout = folder name
        setContentView(R.layout.activity_main);

        //linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    private TextView textViewMsg;
    //View = class
    //v = instance of a class
    public void showMessage(View v)
    {
        textViewMsg.setText("SMASHHHHHHHH!!!");
    }

    public void clearScreen(View v)
    {
        textViewMsg.setText("");
    }
}

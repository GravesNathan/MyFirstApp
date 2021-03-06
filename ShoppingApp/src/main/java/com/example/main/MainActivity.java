package com.example.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfirstapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        //The button name does not have to be the same as the button being reference but it helps to be uniform.
        //in the findViewById R stands for resources.  The code lets us search our resources for an element by it's ID.
        //We use the (Button) to cast the result if the findViewById as a button.

        //Now we'll create an onClick listener.  This will listen for any time the button specified is clicked to perform the action we request.
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//This is the onClick Event.  All of our code has to go in here for the click.
                //Here we create java objects for both the EditText fields using the EditText object type.  As before these java objects do not need to
                //be of the same name as the android ID, but it helps to be consistent.
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                //As the above are actually text strings we now need to parse it to get the integer for calculations.
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                //easiest way to change result to a text is to concat it with an empty string.  We do so when setting the resultTextView below
                resultTextView.setText(result + "");
            }
        });
    }
}
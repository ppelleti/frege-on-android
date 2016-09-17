package org.funwithsoftware.frege_example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.funwithsoftware.frege_example.FregeCode;

public class FregeActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView = (TextView) findViewById(R.id.txt);
        FregeCode.appendToTextView(textView);
    }
}

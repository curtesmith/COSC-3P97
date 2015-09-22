package com.github.curtesmith.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;


import com.github.curtesmith.lib.DisplayMessageModel;

import java.util.Observable;
import java.util.Observer;

public class DisplayMessageActivity extends AppCompatActivity implements Observer {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = new TextView(this);
        textView.setTextSize(40);

        DisplayMessageModel displayMessageModel;
        displayMessageModel = new DisplayMessageModel();
        displayMessageModel.addObserver(this);
        displayMessageModel.setMessage(getIntent().getStringExtra(HelloWorldActivity.EXTRA_MESSAGE));

        setContentView(textView);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void update(Observable observable, Object data) {
        textView.setText(((DisplayMessageModel) observable).getMessage());
    }
}

package org.fazzolari.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    public void spotify_streamer_button_click(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my spotify streamer app ", Toast.LENGTH_SHORT).show();
    }

    public void scores_button_click(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my scores app ", Toast.LENGTH_SHORT).show();
    }

    public void library_button_click(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my library app ", Toast.LENGTH_SHORT).show();
    }

    public void build_it_bigger_button_click(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app ", Toast.LENGTH_SHORT).show();
    }

    public void xyz_reader_button_click(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my xyz reader app ", Toast.LENGTH_SHORT).show();
    }

    public void capstone_button_click(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my capstone_button_click app ", Toast.LENGTH_SHORT).show();
    }
}

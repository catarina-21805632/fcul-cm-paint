package fcul.cm.paint;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void onStart() {
        Bundle extras = getIntent().getExtras();
        String color = extras.getString("COLOR");

        if (color != null) {
            if(color.equals("Yellow")){
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
            }else if(color.equals("Red")){
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }else if(color.equals("Blue")){
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }else if(color.equals("Green")){
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        }
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_about:
                Intent i = new Intent(this, About.class);
                startActivity(i);
                break;
            case R.id.menu_settings:
                Intent j = new Intent(this, Settings.class);
                startActivity(j);
                break;

        }
        return super.onOptionsItemSelected(item);

    }

}
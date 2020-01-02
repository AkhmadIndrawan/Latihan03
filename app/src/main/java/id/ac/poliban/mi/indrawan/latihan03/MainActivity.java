package id.ac.poliban.mi.indrawan.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    private void initComponents() {
        final Button btOk = findViewById(R.id.btOk);
        Button btOk02 = findViewById(R.id.btOk02);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btOk.setBackgroundColor(Color.RED);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.menu1){
            startActivity(new Intent(this, Menu1.class));
        } else if (item.getItemId() == R.id.menu2){
            startActivity(new Intent(this, Menu2.class));
        } else if (item.getItemId() == R.id.menu3){
            startActivity(new Intent(this, Menu3.class));
        }

        return true;
    }
}

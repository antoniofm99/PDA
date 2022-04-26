package es.ucm.fdi.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intitialize varibables and asign values
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home selection
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform item selection
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
            switch(item.getItemId()){
                case R.id.crear:
                    startActivity(new Intent(getApplicationContext(),Crear.class));
                    overridePendingTransition(0,0);

                case R.id.home:

                case R.id.about:
                    startActivity(new Intent(getApplicationContext(),About.class));
                    overridePendingTransition(0,0);
            }
            }
        }





        );
    }
}
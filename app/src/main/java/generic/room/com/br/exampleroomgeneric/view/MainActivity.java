package generic.room.com.br.exampleroomgeneric.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import generic.room.com.br.exampleroomgeneric.R;
import generic.room.com.br.exampleroomgeneric.entity.Login;
import generic.room.com.br.exampleroomgeneric.persistence.AppDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Login login = new Login ();
        login.setEmail("teste@gmail.com");
        login.setName("Ana");
        login.setPassword("123");

        AppDatabase appDatabase = AppDatabase.getAppDatabase(this);
        appDatabase.loginDAO().insertAll(login);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

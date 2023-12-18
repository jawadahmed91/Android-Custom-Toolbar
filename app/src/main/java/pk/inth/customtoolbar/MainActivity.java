package pk.inth.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Don't Forget to update your style layout file in last.
        // <style name="Theme.CustomToolbar" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        // Change the last word => NoActionBar

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.newgroup:
                Toast.makeText(this, "New Group", Toast.LENGTH_SHORT).show();
                break;

            case R.id.webwhatsapp:
                Toast.makeText(this, "Web WhatsApp", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Please choose correct option.", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
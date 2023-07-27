import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference the button
        Button projectsButton = findViewById(R.id.projectsButton);

        // Set a click listener for the button
        projectsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the ProjectsActivity
                Intent intent = new Intent(MainActivity.this, ProjectsActivity.class);
                startActivity(intent);
            }
        });
    }
}

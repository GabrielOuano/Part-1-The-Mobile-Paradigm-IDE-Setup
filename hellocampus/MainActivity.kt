import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar().setTitle("ID: 21800637")

        val myButton: Button = findViewById(R.id.btnChangeName)
        val myText: TextView = findViewById(R.id.tvDepartment)

        myButton.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                myText.setText("Dr. [Chairwoman Name]")
            }
        })
    }
}
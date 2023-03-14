package abhimanyu.android_studio_day6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageButton button_image;
    CheckBox checkBox,checkBox1;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_image=findViewById(R.id.imageButton);
        checkBox=findViewById(R.id.checkBox);
        checkBox1=findViewById(R.id.checkBox2);
        radioGroup=findViewById(R.id.rg);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i)
                {
                    case R.id.radioButtonMale:
                        Toast.makeText(MainActivity2.this, "MALE", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.radioButtonFemale:
                        Toast.makeText(MainActivity2.this, "FEMALE", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    Toast.makeText(MainActivity2.this, checkBox.getText().toString().trim() + "is Checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this, checkBox.getText().toString().trim() + "is Not Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(MainActivity2.this,checkBox1.getText().toString().trim()+ "is selected", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity2.this,checkBox1.getText().toString().trim()+ "is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "5G", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
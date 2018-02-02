package android.example.com.bt_constraintlayout_imgcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ArrayList<Images>arrContent;
    TextView txt,txt2;
    int pos = 0;
    int posProcess;
//Cuong was here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView5);

        arrContent = new ArrayList<>();

        imageView = findViewById(R.id.imageView);

        arrContent.add(new Images(R.drawable.a10,"Android 5.0 Lollipop was initially shown as 'Android L' on June 25, 2014 and officially made available on November 12, 2014. It introduced material design with OpenGL ES 3.1 support and refreshed lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a11,"Android M was initially announced as developer preview at Google I/O on May 28, 2015. Now Google has officially confirmed the name as Marshmallow. Marshmallow brings battery improverment with Doze, native support for fingerprint scanner and Google Now on Tap will give users information without leaving an app (Source: Google)"));

        imageView.setImageResource(arrContent.get(pos).getId());
        txt.setText(arrContent.get(pos).getDescription());
        posProcess = pos + 1;
        txt2.setText(posProcess + " of " + arrContent.size());

    }

        }
    }
}

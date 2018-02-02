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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView5);

        arrContent = new ArrayList<>();

        imageView = findViewById(R.id.imageView);

        arrContent.add(new Images(R.drawable.a01,"Android 1.5 announced on April 27, 2009 was the first release to officially use a codename based on a dessert and it was called Cupcake. It included several new UI features (Source: Google)"));
        arrContent.add(new Images(R.drawable.a02,"Android 1.6 codenamed Donut was announced on September 15, 2009 introduced voice and text entry search with multi-lingual speech synthesizer and support for WVGA screen (Source: Android)"));
        arrContent.add(new Images(R.drawable.a03,"Android called version 2.0 - 2.1 as Eclair which brought in support for Microsoft Exchange and Bluetooth 2.1 (Source: Google)"));
        arrContent.add(new Images(R.drawable.a04,"Android released version 2.2 called Froyo (or Frozen Yogurt) on May 20, 2010 with speed, memory and performance optimizations. It included support for upto 320 ppi displays and introduced Wi-Fi tethering (Source: Google)"));
        arrContent.add(new Images(R.drawable.a05,"Android version 2.3 was released on December 6, 2010 and Google called it Gingerbread. Gingerbread supported large screens and resolutions WXGA and higher. It had an improved Download Manager and improved virtual keyboard. Google launched Nexus S running Gingerbread as the platform reference device (Source: Google)"));
        arrContent.add(new Images(R.drawable.a06,"Android version 3.0 was called Honeycomb and it served as a first tablet only update. Motorola Xoom tablet was the first device to feature the new OS. It has a holographic user interface and simplified multitasking feature (Source: Google)"));
        arrContent.add(new Images(R.drawable.a07,"Android 4.0 released on October 19, 2011 was named Ice Cream Sandwich it brought backward compatibility with any device running version 2.3 Gingerbread. It supported Robonto font and drag-and-drop functionality. The major addition being the ability to access apps from lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a08,"Android 4.1 was announced at Google I/O on June 27, 2012 as Jelly Bean. It projected Google's 'Project Butter' effort aimed to smoothen the functionality and performance of user interface. Android version 4.1 - 4.3.1 was called Jelly Bean (Source: Google)"));
        arrContent.add(new Images(R.drawable.a09,"Android version 4.4 initially known as Key Lime Pie was later released on September 3, 2013 as KitKat. Google released Nexus 5 based on Android KitKat on October 31, 2013. It supported native IR blaster, Wi-Fi and mobile data activity indicators and Android runtime which replaced Dalvik virtual engine (Source: Google)"));
        arrContent.add(new Images(R.drawable.a10,"Android 5.0 Lollipop was initially shown as 'Android L' on June 25, 2014 and officially made available on November 12, 2014. It introduced material design with OpenGL ES 3.1 support and refreshed lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a11,"Android M was initially announced as developer preview at Google I/O on May 28, 2015. Now Google has officially confirmed the name as Marshmallow. Marshmallow brings battery improverment with Doze, native support for fingerprint scanner and Google Now on Tap will give users information without leaving an app (Source: Google)"));
        arrContent.add(new Images(R.drawable.a01,"Android 1.5 announced on April 27, 2009 was the first release to officially use a codename based on a dessert and it was called Cupcake. It included several new UI features (Source: Google)"));
        arrContent.add(new Images(R.drawable.a02,"Android 1.6 codenamed Donut was announced on September 15, 2009 introduced voice and text entry search with multi-lingual speech synthesizer and support for WVGA screen (Source: Android)"));
        arrContent.add(new Images(R.drawable.a03,"Android called version 2.0 - 2.1 as Eclair which brought in support for Microsoft Exchange and Bluetooth 2.1 (Source: Google)"));
        arrContent.add(new Images(R.drawable.a04,"Android released version 2.2 called Froyo (or Frozen Yogurt) on May 20, 2010 with speed, memory and performance optimizations. It included support for upto 320 ppi displays and introduced Wi-Fi tethering (Source: Google)"));
        arrContent.add(new Images(R.drawable.a05,"Android version 2.3 was released on December 6, 2010 and Google called it Gingerbread. Gingerbread supported large screens and resolutions WXGA and higher. It had an improved Download Manager and improved virtual keyboard. Google launched Nexus S running Gingerbread as the platform reference device (Source: Google)"));
        arrContent.add(new Images(R.drawable.a06,"Android version 3.0 was called Honeycomb and it served as a first tablet only update. Motorola Xoom tablet was the first device to feature the new OS. It has a holographic user interface and simplified multitasking feature (Source: Google)"));
        arrContent.add(new Images(R.drawable.a07,"Android 4.0 released on October 19, 2011 was named Ice Cream Sandwich it brought backward compatibility with any device running version 2.3 Gingerbread. It supported Robonto font and drag-and-drop functionality. The major addition being the ability to access apps from lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a08,"Android 4.1 was announced at Google I/O on June 27, 2012 as Jelly Bean. It projected Google's 'Project Butter' effort aimed to smoothen the functionality and performance of user interface. Android version 4.1 - 4.3.1 was called Jelly Bean (Source: Google)"));
        arrContent.add(new Images(R.drawable.a09,"Android version 4.4 initially known as Key Lime Pie was later released on September 3, 2013 as KitKat. Google released Nexus 5 based on Android KitKat on October 31, 2013. It supported native IR blaster, Wi-Fi and mobile data activity indicators and Android runtime which replaced Dalvik virtual engine (Source: Google)"));
        arrContent.add(new Images(R.drawable.a10,"Android 5.0 Lollipop was initially shown as 'Android L' on June 25, 2014 and officially made available on November 12, 2014. It introduced material design with OpenGL ES 3.1 support and refreshed lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a11,"Android M was initially announced as developer preview at Google I/O on May 28, 2015. Now Google has officially confirmed the name as Marshmallow. Marshmallow brings battery improverment with Doze, native support for fingerprint scanner and Google Now on Tap will give users information without leaving an app (Source: Google)"));
        arrContent.add(new Images(R.drawable.a01,"Android 1.5 announced on April 27, 2009 was the first release to officially use a codename based on a dessert and it was called Cupcake. It included several new UI features (Source: Google)"));
        arrContent.add(new Images(R.drawable.a02,"Android 1.6 codenamed Donut was announced on September 15, 2009 introduced voice and text entry search with multi-lingual speech synthesizer and support for WVGA screen (Source: Android)"));
        arrContent.add(new Images(R.drawable.a03,"Android called version 2.0 - 2.1 as Eclair which brought in support for Microsoft Exchange and Bluetooth 2.1 (Source: Google)"));
        arrContent.add(new Images(R.drawable.a04,"Android released version 2.2 called Froyo (or Frozen Yogurt) on May 20, 2010 with speed, memory and performance optimizations. It included support for upto 320 ppi displays and introduced Wi-Fi tethering (Source: Google)"));
        arrContent.add(new Images(R.drawable.a05,"Android version 2.3 was released on December 6, 2010 and Google called it Gingerbread. Gingerbread supported large screens and resolutions WXGA and higher. It had an improved Download Manager and improved virtual keyboard. Google launched Nexus S running Gingerbread as the platform reference device (Source: Google)"));
        arrContent.add(new Images(R.drawable.a06,"Android version 3.0 was called Honeycomb and it served as a first tablet only update. Motorola Xoom tablet was the first device to feature the new OS. It has a holographic user interface and simplified multitasking feature (Source: Google)"));
        arrContent.add(new Images(R.drawable.a07,"Android 4.0 released on October 19, 2011 was named Ice Cream Sandwich it brought backward compatibility with any device running version 2.3 Gingerbread. It supported Robonto font and drag-and-drop functionality. The major addition being the ability to access apps from lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a08,"Android 4.1 was announced at Google I/O on June 27, 2012 as Jelly Bean. It projected Google's 'Project Butter' effort aimed to smoothen the functionality and performance of user interface. Android version 4.1 - 4.3.1 was called Jelly Bean (Source: Google)"));
        arrContent.add(new Images(R.drawable.a09,"Android version 4.4 initially known as Key Lime Pie was later released on September 3, 2013 as KitKat. Google released Nexus 5 based on Android KitKat on October 31, 2013. It supported native IR blaster, Wi-Fi and mobile data activity indicators and Android runtime which replaced Dalvik virtual engine (Source: Google)"));
        arrContent.add(new Images(R.drawable.a10,"Android 5.0 Lollipop was initially shown as 'Android L' on June 25, 2014 and officially made available on November 12, 2014. It introduced material design with OpenGL ES 3.1 support and refreshed lock screen (Source: Google)"));
        arrContent.add(new Images(R.drawable.a11,"Android M was initially announced as developer preview at Google I/O on May 28, 2015. Now Google has officially confirmed the name as Marshmallow. Marshmallow brings battery improverment with Doze, native support for fingerprint scanner and Google Now on Tap will give users information without leaving an app (Source: Google)"));

        imageView.setImageResource(arrContent.get(pos).getId());
        txt.setText(arrContent.get(pos).getDescription());
        posProcess = pos + 1;
        txt2.setText(posProcess + " of " + arrContent.size());

    }
    public void onXML (View view)
    {
        switch (view.getId()){
            case R.id.btn2:
                pos++;
                posProcess = pos + 1;
                if(pos==arrContent.size()) {
                    pos=0;
                    posProcess = pos + 1;
                }
                imageView.setImageResource(arrContent.get(pos).getId());
                txt.setText(arrContent.get(pos).getDescription());
                txt2.setText(posProcess + " of " + arrContent.size());
                break;

            case R.id.btn1:
                pos--;
                posProcess = pos + 1;
                if(pos<=0) {
                    pos=arrContent.size()-1;
                    posProcess = pos + 1;
                }
                imageView.setImageResource(arrContent.get(pos).getId());
                txt.setText(arrContent.get(pos).getDescription());
                txt2.setText(posProcess + " of " + arrContent.size());
                break;
        }
    }
}

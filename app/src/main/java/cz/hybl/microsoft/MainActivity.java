package cz.hybl.microsoft;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.microsoft.com"));
        intent.setPackage("com.microsoft.emmx");
        //intent.setPackage("org.mozilla.firefox");
        startActivity(intent);
        System.exit(0);
    }
}

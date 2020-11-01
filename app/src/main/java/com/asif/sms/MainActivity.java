package com.asif.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send_sms = (Button) findViewById(R.id.send_sms);
        send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call Intent to send sms
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "0000000000", null));
                intent.putExtra("sms_body","Hello Dear....");
                startActivity(intent);
            }
        });
    }
}
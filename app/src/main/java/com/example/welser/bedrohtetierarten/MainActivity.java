package com.example.welser.bedrohtetierarten;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MAIN_ACTIVITY";

    private TextView testText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testText = (TextView) findViewById(R.id.textView);
        testText.getText();
        // Hallo Test
    }

    /*AsyncTask<Void, Void, String> task = new AsyncTask<Void, Void, String>() {

        @Override
        protected String doInBackground(Void... params) {
            // get request factory to send the get request
            HttpTransport httpTransport = new NetHttpTransport();
            HttpRequestFactory factory = httpTransport.createRequestFactory();
            // create url to send
            GenericUrl url = new GenericUrl("http://time.jsontest.com");
            try {
                HttpRequest request = factory.buildGetRequest(url);
                HttpResponse response = request.execute();
                String jsonstring = response.parseAsString();
                return jsonstring;
            } catch (Exception e) {
                return e.getMessage();
            }
        }
    };*/
}

package fr.unice.polytech.polynews.renaud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import fr.unice.polytech.polynews.R;

/**
 * Created by renaud on 14/04/2016.
 */
public class BdaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bda);

        final Button bdmButton = (Button) findViewById(R.id.bdmButton);
        bdmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bdmIntent = new Intent(v.getContext(), BdmActivity.class);
                startActivityForResult(bdmIntent, 0);
            }
        });

        final Button bdcButton = (Button) findViewById(R.id.bdcButton);
        bdcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bdcIntent = new Intent(v.getContext(),BdcActivity.class);
                startActivityForResult(bdcIntent,0);
            }
        });

        final Button theatreButton = (Button) findViewById(R.id.theatreButton);
        theatreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent theatreIntent = new Intent(v.getContext(),TheatreActivity.class);
                startActivityForResult(theatreIntent,0);
            }
        });

        final Button photoButton = (Button) findViewById(R.id.photoButton);
        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoIntent = new Intent(v.getContext(),PhotoActivity.class);
                startActivityForResult(photoIntent,0);
            }
        });

    }
}


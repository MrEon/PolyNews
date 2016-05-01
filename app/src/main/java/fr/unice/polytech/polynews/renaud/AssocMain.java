package fr.unice.polytech.polynews.renaud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import fr.unice.polytech.polynews.R;

public class AssocMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button bda = (Button) findViewById(R.id.bdaButton);
        bda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bdaIntent = new Intent(v.getContext(), BdaActivity.class);
                startActivityForResult(bdaIntent, 0);
            }
        });

        final Button bdj = (Button) findViewById(R.id.bdjButton);
        bdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bdjIntent = new Intent(v.getContext(),BdjActivity.class);
                startActivityForResult(bdjIntent,0);
            }
        });

        final Button pompom = (Button) findViewById(R.id.pompomButton);
        pompom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pompomIntent = new Intent(v.getContext(),PompomActivity.class);
                startActivityForResult(pompomIntent,0);
            }
        });

        final Button montagne = (Button) findViewById(R.id.montagneButton);
        montagne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent montagneIntent = new Intent(v.getContext(), MontagneActivity.class);
                startActivityForResult(montagneIntent, 0);
            }
        });

        final Button bds = (Button) findViewById(R.id.bdsButton);
        bds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bdsIntent = new Intent(v.getContext(), BdsActivity.class);
                startActivityForResult(bdsIntent, 0);
            }
        });

    }
}

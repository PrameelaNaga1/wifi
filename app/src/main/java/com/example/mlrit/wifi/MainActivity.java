package com.example.mlrit.wifi;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    TextView t1;
    BluetoothAdapter ba= BluetoothAdapter.getDefaultAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=(Switch)findViewById(R.id.switch3);
        t1=(TextView)findViewById(R.id.textView2);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    ba.enable();
                    t1.setText("ON");
                }

                else
                {
                    ba.disable();
                    t1.setText("OFF");
                }
                                          }
                                      }


        );
    }
}

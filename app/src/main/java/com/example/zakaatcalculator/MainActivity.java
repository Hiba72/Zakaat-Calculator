package com.example.zakaatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText cashAtHome= findViewById(R.id.cashhome);
        EditText cashInBank= findViewById(R.id.cashbank);
        EditText goldSilver= findViewById(R.id.goldsilver);
        EditText debt= findViewById(R.id.debt);

        Button btn= findViewById(R.id.btn1);
        TextView finalValue= findViewById(R.id.txt4);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       double add=Double.parseDouble(cashAtHome.getText().toString())+Double.parseDouble(cashInBank.getText().toString())+Double.parseDouble(goldSilver.getText().toString());
                       double total=add-Double.parseDouble(debt.getText().toString());
                       double zakaatMoney=total*0.025;
                       if(zakaatMoney>=682387.90) {
                           String payableZakaat = String.format("Your Zakaat is: %s PKR", zakaatMoney);
                           finalValue.setText(payableZakaat);
                       }
                       else{
                           String noZakaat = String.format("You don't have to pay Zakaat");
                           finalValue.setText(noZakaat);
                       }
                    }
                }
        );
    }


    }

    //  public void onClick1(View view) {

    //    EditText mEdit;
    //  mEdit   = (EditText)findViewById(R.id.cashhome);
    //  mEdit.getText().toString();
    //  num=Integer.parseInt(mEdit.toString());
    //  TextView text=(TextView) findViewById(R.id.txt4);
    //  double total= num*0.025;
    //  text.setText("Your payable zakaat is: "+total);

    //}

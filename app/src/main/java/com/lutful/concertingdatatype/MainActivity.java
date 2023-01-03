package com.lutful.concertingdatatype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edBuy, edSell;
    Button buttonCalculate;
    TextView tvDisplay;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edBuy = findViewById(R.id.edBuy);
        edSell = findViewById(R.id.edSell);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        tvDisplay = findViewById(R.id.tvDisplay);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                String ss_buy = edBuy.getText().toString();
                Integer.parseInt(ss_buy);
                */
/*
                int byPrice, sellPrice, profit;

                String sBuy = edBuy.getText().toString();

               /* byPrice = Integer.parseInt(edBuy.getText().toString());
                */

           /*     byPrice = Integer.parseInt( sBuy );

                String sSell = edSell.getText().toString();

                sellPrice = Integer.parseInt(sSell);

                profit = sellPrice - byPrice;

                tvDisplay.setText("Profit is : "+profit);

*/


                Float byPrice, sellPrice, profit, profitPercent;

                String sBuy = edBuy.getText().toString();

                  byPrice = Float.parseFloat( sBuy );

                String sSell = edSell.getText().toString();

                sellPrice = Float.parseFloat(sSell);

                profit = sellPrice - byPrice;

                profitPercent = profit/byPrice*100;

                tvDisplay.setText("Profit is : "+profit+"\nProfit % is: "+profitPercent+"%");








            }
        });




    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btn0, btnadd, btndiv, btnsub, btnmulti,btnequl;
TextView txtinpu;
double var1 , var2;
boolean add , sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
        btn0= (Button) findViewById(R.id.btn0);
        btnadd= (Button) findViewById(R.id.btnadd);
        btnsub= (Button) findViewById(R.id.btnsub);
        btnmulti= (Button) findViewById(R.id.btnmulti);
        btndiv= (Button) findViewById(R.id.btndiv);
        btndot= (Button) findViewById(R.id.btndot);
        btnequl = (Button) findViewById(R.id.btnequl) ;


        txtinpu = (TextView) findViewById(R.id.txtinpu);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText(txtinpu.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinpu.getText()+"");
                add=true;
                txtinpu.setText(null);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinpu.getText()+"");
                sub=true;
                txtinpu.setText(null);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinpu.getText()+"");
                mul=true;
                txtinpu.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(txtinpu.getText()+"");
                div=true;
                txtinpu.setText(null);
            }
        });
        btnequl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 =  Double.parseDouble(txtinpu.getText()+"");
                if(add==true)
                {
                    txtinpu.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    txtinpu.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    txtinpu.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    txtinpu.setText(var1/var2+"");
                    div=false;
                }
            }
        });


        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinpu.setText("");
            }
        });

    }
}

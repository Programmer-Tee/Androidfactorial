package com.example.tobeisun.move;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Next extends AppCompatActivity {
    EditText number ;
    TextView result;
    Button fact ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        number= (EditText) findViewById(R.id.editText1) ;
        result = (TextView) findViewById(R.id.textViewResult) ;
        fact = (Button) findViewById(R.id.buttonNext);


     fact.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             calculatefact();
         }
     });

    }

    void calculatefact()
    {
        int a = Integer.parseInt(number.getText().toString()) ;
        int answer=1;
        int i ;

        for (i=1;i<=a;i++)
        {
            answer =answer*i;
        }


          result.setText(String.valueOf(answer));
    }
}

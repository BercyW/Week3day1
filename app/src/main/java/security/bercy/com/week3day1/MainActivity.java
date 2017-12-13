package security.bercy.com.week3day1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_tom;
    private Button btn_clooney;
    private Button btn_will;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tom = findViewById(R.id.btn_tom);
        btn_clooney = findViewById(R.id.btn_clooney);
        btn_will = findViewById(R.id.btn_will);

        btn_tom.setOnClickListener(this);
        btn_clooney.setOnClickListener(this);
        btn_will.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_tom:
                replaceFragment(new TomCruseFragment());


                break;
            case R.id.btn_clooney:
                replaceFragment(new ClooneyFragment());
                break;
            case R.id.btn_will:
                replaceFragment(new WillSmithFragment());


                break;


        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction1 = fragmentManager.beginTransaction();
        transaction1.replace(R.id.rightFragment,fragment).commit();


    }
}

package security.bercy.com.week3day1;

import android.content.Context;
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
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tom = findViewById(R.id.tomcruise);
        btn_clooney = findViewById(R.id.clooney);
        btn_will = findViewById(R.id.willsmith);



        imageView = findViewById(R.id.imgFragment);
        btn_tom.setOnClickListener(this);
        btn_clooney.setOnClickListener(this);
        btn_will.setOnClickListener(this);
        replaceFragment(new RightFragment(),new ImageFragment());

    }



    public void replaceFragment(RightFragment detail, ImageFragment img) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction1 = fragmentManager.beginTransaction();
        transaction1.replace(R.id.rightFragmentTop,detail).commit();
        FragmentTransaction transaction2 = fragmentManager.beginTransaction();
        transaction2.replace(R.id.rightFragmentBottom,img).commit();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("", "onResume: ");

        TextView tvDetail = findViewById(R.id.tvFragment);
        tvDetail.setText("Thomas Cruise Mapother IV, known professionally as Tom Cruise, is an American actor and producer.");
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.tomcruise:

                replaceFragment(new RightFragment(),new ImageFragment());

                break;
            case R.id.clooney:
                break;
            case R.id.willsmith:
                break;



        }
    }
}

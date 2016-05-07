package edm.rs.senac.com.br.testeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloVida", "Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloVida", "Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "Pause");
    }
}

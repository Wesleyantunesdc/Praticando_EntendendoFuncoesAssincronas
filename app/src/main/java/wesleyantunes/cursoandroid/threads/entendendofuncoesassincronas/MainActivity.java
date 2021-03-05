package wesleyantunes.cursoandroid.threads.entendendofuncoesassincronas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
    }

    public void iniciarAsyncTask(View view){
        faca("Jamilton","Welsey","Teste");
    }


    public void faca(String... string){
        String nome = string[0];
        Log.d("Executar", "msg: "+ nome);
    }
}
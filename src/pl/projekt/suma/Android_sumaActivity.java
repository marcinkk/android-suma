package pl.projekt.suma;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Android_sumaActivity extends Activity{
	private EditText tekst_liczba_a;
	private EditText tekst_liczba_b;
	private EditText tekst_liczba_c;
	private Button przycisk_licz_sume;
	private Button przycisk_wyjscie;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tekst_liczba_a = (EditText) findViewById(R.id.pole_tekstowe_liczba_a);
        tekst_liczba_b = (EditText) findViewById(R.id.pole_tekstowe_liczba_b);
        tekst_liczba_c = (EditText) findViewById(R.id.pole_tekstowe_liczba_c);
        przycisk_licz_sume = (Button) findViewById(R.id.przycisk_licz_sume);
        przycisk_wyjscie = (Button) findViewById(R.id.przycisk_wyjscie);
        
        przycisk_wyjscie.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
        
        przycisk_licz_sume.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tekst;
				int liczba_a, liczba_b, liczba_c;
				
				tekst = tekst_liczba_a.getText().toString();
				liczba_a = Integer.parseInt(tekst);
				tekst = tekst_liczba_b.getText().toString();
				liczba_b = Integer.parseInt(tekst);	
				
				liczba_c = liczba_a + liczba_b;
				
				tekst = Integer.toString(liczba_c);
				tekst_liczba_c.setText(tekst);
			}
		});
    }
}
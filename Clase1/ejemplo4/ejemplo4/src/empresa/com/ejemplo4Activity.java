package empresa.com;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ejemplo4Activity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	ImageView _visor;
	int posicion;
	
	private Integer[] galeria = 
		    {
			  R.drawable.gintama,
			  R.drawable.mmm,
			  R.drawable.ulquiorra,
			  R.drawable.naruto,
			  R.drawable.kuroshitsuji
	         };
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        _visor = (ImageView)findViewById(R.id.visor);
        //_visor.setImageResource(R.drawable.kuroshitsuji);
        
        posicion = 0;
        _visor.setImageResource(galeria[posicion]);
        
        Button bRetroceder = (Button)findViewById(R.id.btnRetroceder);
        Button bAvanzar = (Button)findViewById(R.id.btnAvanzar);
        Button bSalir = (Button)findViewById(R.id.btnSalir);
        
        bRetroceder.setOnClickListener(this);
        bAvanzar.setOnClickListener(this);
        bSalir.setOnClickListener(this);
        
    }


	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
		case R.id.btnRetroceder: 
			posicion--;
			
			if(posicion == -1)
			  posicion = 4; //galeria.length -1
				
			_visor.setImageResource(galeria[posicion]);
			
			break;

		case R.id.btnAvanzar:
			posicion++;
			
			if(posicion == 5) //galeria.length
				  posicion = 0;
			
			_visor.setImageResource(galeria[posicion]);
			break;
			
			
		case R.id.btnSalir:
			this.finish();
			break;
			
		}
	}
	
	public void OnPause()
	{
		super.onPause(); 
		SharedPreferences.Editor posicionMemoria = getPreferences(0).edit();
		posicionMemoria.putInt("posicionfoto", posicion);
		
	}
	
	public void OnResume()
	{
		super.onResume();
		SharedPreferences datos = getPreferences(0);
		int posfoto = datos.getInt("posicionfoto", -1);
		
		if(posfoto != -1)
		{
			posicion = posfoto;
			_visor.setImageResource(galeria[posicion]);	
		}
		
	}
	
}
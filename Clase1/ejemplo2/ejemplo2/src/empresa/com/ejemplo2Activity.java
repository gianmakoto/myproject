package empresa.com;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ejemplo2Activity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	TextView tMensaje;
	boolean Entrar = true;
	boolean Adicional = true; 
	int cont = 0;
	
	String Nombre;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tMensaje = (TextView)findViewById(R.id.txtMensaje);
        tMensaje.setText("Iniciando Android!");
        
        Button bCambiar = (Button)findViewById(R.id.btnCambiar);
        bCambiar.setOnClickListener(this);      
        
    }
    
    public void onClick(View v)
    {
    	EditText tNombre = (EditText)findViewById(R.id.txtNombre);
    	
       if(Entrar == true)
       {
    	tMensaje.setText("Otro Mensaje..!");
    	Entrar = false;
    	
    	  if(Adicional == true)
    	  {
    		  if( cont == 0)
    		  {
    		    Nombre = tNombre.getText().toString();
    		    cont = 1;
    		  }  
    	    tNombre.setText("Hola " + Nombre);
    	    Adicional = false;
    	  }
         
       }
       else
       {
    	   tMensaje.setText("Iniciando Android!");
           Entrar = true;
           
     	  if(Adicional == false)
     	  {
     	    tNombre.setText("Chao " + Nombre);
     	    Adicional = true;
     	  }
           
       }
   }
}
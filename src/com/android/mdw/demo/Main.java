package com.android.mdw.demo;

import java.util.LinkedList;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Main extends ListActivity {
	/** 
	 * constantes para identificar si el usuario quiere visualizar los artítuclos 
	 * dentro de la aplicación o en el navegador
	 */
	final static int APP_VIEW = 1;
	final static int BROWSER_VIEW = 2;
	
	/**
	 * constante para identificar la llave con la que envío datos a través de intents
	 * para comunicar entre las dos actividades: Main y ShowElement
	 */
	final static String POSITION_KEY = "P";
	
	/**
	 * Guardamos la dirección del feed como otra variable de clase para poder modificarla sin
	 * complicaciones más adelante.
	 */
	static String feedUrl = "http://www.maestrosdelweb.com/index.xml";	


    
    /** Este método es llamado cuando la actividad es creada */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }  
}
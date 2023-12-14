package com.l20291029.mycountryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.l20291029.mycountryapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Definir la vista a través del objeto de enlace con la vista
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        //enlazar los elementos
        BottomNavigationView navView = viewBinding.mainBnvNavView;

        //pasar los id a un configurador de barras para habilitar la navegación
        AppBarConfiguration AppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.mainNavMiContinente,
                R.id.mainNavMiBuscar,
                R.id.mainNavMiPerfil
        ).build();

        // crear un controlador para vincular la navegación con un elemento(host)
        NavController navController = Navigation.findNavController(this, R.id.mainFragmentNavHost);

        // Enlazar los controles para que la interfaz cambie de vista conforme  se seleccionan los iconos
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration );
        NavigationUI.setUpWithNavController(navView, navController);


    }
}
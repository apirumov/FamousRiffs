package com.example.pirumov.famousriffs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button riffBtn1, riffBtn2, riffBtn3, riffBtn4, riffBtn5, riffBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        riffBtn1 = (Button) findViewById(R.id.but1);
        riffBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Run Riff first",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        riffBtn2 = (Button) findViewById(R.id.but2);
        riffBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Run Riff second",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        riffBtn3 = (Button) findViewById(R.id.but3);
        riffBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Run Riff Third",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        riffBtn4 = (Button) findViewById(R.id.but4);
        riffBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Run Riff fourth",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        riffBtn5 = (Button) findViewById(R.id.but5);
        riffBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Run Riff fifth",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        riffBtn6 = (Button) findViewById(R.id.but6);
        riffBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Run Riff sixth",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.riff1) {
            Toast toast = Toast.makeText(getApplicationContext(),"Run Riff First",Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.riff2) {
            Toast toast = Toast.makeText(getApplicationContext(),"Run Riff Second",Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.riff3) {
            Toast toast = Toast.makeText(getApplicationContext(),"Run Riff Third",Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.riff4) {
            Toast toast = Toast.makeText(getApplicationContext(),"Run Riff Fourth",Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.riff5) {
            Toast toast = Toast.makeText(getApplicationContext(),"Run Riff Fifth",Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.riff6) {
            Toast toast = Toast.makeText(getApplicationContext(),"Run Riff Sixth",Toast.LENGTH_SHORT);
            toast.show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

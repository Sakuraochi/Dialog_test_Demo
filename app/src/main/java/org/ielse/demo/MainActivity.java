package org.ielse.demo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.ielse.demo.widget.BottomMenuDialog;

public class MainActivity extends AppCompatActivity {

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

        findViewById(R.id.b_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog d1 = new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Title")
                        .setMessage("Message content")
                        .setPositiveButton("positive", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).setNegativeButton("nagative", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).create();
                d1.show();
            }
        });

        findViewById(R.id.b_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog d1 = new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Title")
                        .setSingleChoiceItems(new String[]{"特小", "小", "标准", "大", "特大"}, 3, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this.getApplicationContext(), String.valueOf(which), Toast.LENGTH_LONG).show();
                            }
                        }).create();
                d1.show();
            }
        });

        findViewById(R.id.b_5).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                 d5 = new BottomMenuDialog.Builder(MainActivity.this)
                        .setTitle("更换封面")
                        .addMenu("从手机相册选择", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                d5.dismiss();
                                Toast.makeText(v.getContext(), "从手机相册选择" , Toast.LENGTH_SHORT).show();
                            }
                        }).addMenu("从空间相册选择", new View.OnClickListener() {
                             @Override
                             public void onClick(View v) {
                                 d5.dismiss();
                                 Toast.makeText(v.getContext(), "从空间相册选择" , Toast.LENGTH_SHORT).show();
                             }
                         }).addMenu("拍一张", new View.OnClickListener() {
                             @Override
                             public void onClick(View v) {
                                 d5.dismiss();
                                 Toast.makeText(v.getContext(), "拍一张" , Toast.LENGTH_SHORT).show();
                             }
                         }).create();

                d5.show();
            }
        });
    }

    BottomMenuDialog d5;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

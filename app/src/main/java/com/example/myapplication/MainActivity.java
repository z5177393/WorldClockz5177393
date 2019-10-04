package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Button;
        import android.os.Bundle;
        import java.util.TimeZone;
        import java.text.SimpleDateFormat;
public class MainActivity extends AppCompatActivity {
    int i = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView TextView1 = (TextView)findViewById(R.id.h);
        final TextView TextView2 = (TextView)findViewById(R.id.c);
        final TextView TextView3 = (TextView)findViewById(R.id.j);
        final TextView TextView4 = (TextView)findViewById(R.id.d);
        final TextView TextView5 = (TextView)findViewById(R.id.k);
        final TextView TextView6 = (TextView)findViewById(R.id.e);
        final TextView TextView7 = (TextView)findViewById(R.id.l);
        final TextView TextView8 = (TextView)findViewById(R.id.f);
        final TextView TextView9 = (TextView)findViewById(R.id.m);
        final TextView TextView0 = (TextView)findViewById(R.id.g);
        final Button but1 =(Button) findViewById(R.id.change24);
        final Button but2 =(Button) findViewById(R.id.change12);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView1.setVisibility(View.VISIBLE);
                TextView2.setVisibility(View.INVISIBLE);
                TextView3.setVisibility(View.VISIBLE);
                TextView4.setVisibility(View.INVISIBLE);
                TextView5.setVisibility(View.VISIBLE);
                TextView6.setVisibility(View.INVISIBLE);
                TextView7.setVisibility(View.VISIBLE);
                TextView8.setVisibility(View.INVISIBLE);
                TextView9.setVisibility(View.VISIBLE);
                TextView0.setVisibility(View.INVISIBLE);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        TextView1.setVisibility(View.INVISIBLE);
                                        TextView2.setVisibility(View.VISIBLE);
                                        TextView3.setVisibility(View.INVISIBLE);
                                        TextView4.setVisibility(View.VISIBLE);
                                        TextView5.setVisibility(View.INVISIBLE);
                                        TextView6.setVisibility(View.VISIBLE);
                                        TextView7.setVisibility(View.INVISIBLE);
                                        TextView8.setVisibility(View.VISIBLE);
                                        TextView9.setVisibility(View.INVISIBLE);
                                        TextView0.setVisibility(View.VISIBLE);
                                    }
                                });
                    Thread t = new Thread() {public void run() { try { while (!isInterrupted()) {
                                Thread.sleep(1000);
                                runOnUiThread(new Runnable() {
                                    public void run() {
                                        TextView date0 = findViewById(R.id.c);
                                        TextView date1 = findViewById(R.id.d);
                                        TextView date2 = findViewById(R.id.e);
                                        TextView date3 = findViewById(R.id.f);
                                        TextView date4 = findViewById(R.id.g);
                                        TextView date5 = findViewById(R.id.h);
                                        TextView date6 = findViewById(R.id.j);
                                        TextView date7 = findViewById(R.id.k);
                                        TextView date8 = findViewById(R.id.l);
                                        TextView date9 = findViewById(R.id.m);

                                        long date = System.currentTimeMillis();
                                        SimpleDateFormat twen = new SimpleDateFormat("    MMM-dd-yyyy\nhh-mm-ss a");
                                        SimpleDateFormat twel = new SimpleDateFormat("    MMM-dd-yyyy\nHH-mm-ss a");
                                        twen.setTimeZone(TimeZone.getTimeZone("GMT+10"));
                                        String dateString = twen.format(date);
                                        date0.setText(dateString);

                                        twen.setTimeZone(TimeZone.getTimeZone("GMT-7"));
                                        dateString = twen.format(date);
                                        date1.setText(dateString);

                                        twen.setTimeZone(TimeZone.getTimeZone("GMT+9"));
                                        dateString = twen.format(date);
                                        date2.setText(dateString);

                                        twen.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                                        dateString = twen.format(date);
                                        date3.setText(dateString);

                                        twen.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                                        dateString = twen.format(date);
                                        date4.setText(dateString);

                                        twel.setTimeZone(TimeZone.getTimeZone("GMT+10"));
                                        dateString = twel.format(date);
                                        date5.setText(dateString);

                                        twel.setTimeZone(TimeZone.getTimeZone("GMT-7"));
                                        dateString = twel.format(date);
                                        date6.setText(dateString);

                                        twel.setTimeZone(TimeZone.getTimeZone("GMT+9"));
                                        dateString = twel.format(date);
                                        date7.setText(dateString);

                                        twel.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                                        dateString = twel.format(date);
                                        date8.setText(dateString);

                                        twel.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                                        dateString = twel.format(date);
                                        date9.setText(dateString);


                                    }
                                });
                            }

                        } catch (InterruptedException e) {

                        }
                    }


                };
                t.start();
            }
        }

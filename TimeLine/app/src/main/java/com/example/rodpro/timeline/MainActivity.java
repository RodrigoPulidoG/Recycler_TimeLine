package com.example.rodpro.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<EventTimeLine> listaEventos;
    RecyclerView recyclerEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEventos = new ArrayList<>();
        recyclerEventos = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerEventos.setLayoutManager(new LinearLayoutManager(this));

        llenarListaEventos ();

        AdaptadorTimeLine adapter = new AdaptadorTimeLine(listaEventos);
        recyclerEventos.setAdapter(adapter);
    }

    private void llenarListaEventos() {
        listaEventos.add(new EventTimeLine(R.drawable.mono_patin,"20 minutes ride","8th Junary","-10 000 COP"));
        listaEventos.add(new EventTimeLine(R.drawable.mono_patin,"15 minutes ride","8th Junary","-7 EDN"));
        listaEventos.add(new EventTimeLine(R.drawable.regalo,"Offer completed","7th Junary","+10 EDN"));
        listaEventos.add(new EventTimeLine(R.drawable.mono_patin,"10 minutes ride","7th Junary","-5 EDN"));
        listaEventos.add(new EventTimeLine(R.drawable.regalo,"Offer completed","7th Junary","+3 EDN"));

    }
}

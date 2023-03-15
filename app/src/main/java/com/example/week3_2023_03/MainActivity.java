package com.example.week3_2023_03;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Xml;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParserException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Xml xml = (Xml) getResources().getXml(R.xml.countries);

        ArrayList<MyWrapper> mymap = new ArrayList<>();
        while (true) {
            try {
                if (!(xml.)) break;
                String name = xml.getAttributeValue("", "name");
                String id = xml.getAttributeValue("", "id");
                String key = xml.getAttributeValue("", "key");
                String text = xml.getName();

                mymap.add(new MyWrapper(id, name, key, text));
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }


            // ArrayList<HashMap<String,String>> mymap = new ArrayList<HashMap<String,String>>();


            setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mymap));
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    MyWrapper str= (MyWrapper) l.getItemAtPosition(position);

        Toast.makeText(this,str.id,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,str.key,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,str.name,Toast.LENGTH_SHORT).show();
    }
}
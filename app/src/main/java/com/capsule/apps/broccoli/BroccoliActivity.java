package com.capsule.apps.broccoli;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class BroccoliActivity extends AppCompatActivity {

    private ArrayList<Contact> mContacts = new ArrayList<Contact>();
    private CustomAdapter mAdapter;
    private CustomRecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broccoli);
        mRecyclerView = (CustomRecyclerView) findViewById(R.id.contact_listview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        initialize();
        mAdapter = new CustomAdapter(this, mContacts);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initialize() {
        mContacts.clear();
        mContacts.add(new Contact(0xFF3d69d, "Larry Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Kelly Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "John Cho", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Kolla Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Marion Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Marie Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Majie Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Joko Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Yomoka Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Tokohama Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Konto Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Tokona Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Shauna Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Young Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Lee Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
        mContacts.add(new Contact(0xFF3d69d, "Kolona Pham", "1st Hamlet - Khanh Hong - Yen Khanh - Ninh Binh"));
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

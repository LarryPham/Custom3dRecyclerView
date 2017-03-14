package com.capsule.apps.broccoli;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ContactHolder> {

    private ArrayList<Contact> mContacts = new ArrayList<Contact>();
    private Context mContext;

    public CustomAdapter(Context context, ArrayList<Contact> contacts) {
        mContext = context;
        mContacts = contacts;
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(mContext).inflate(R.layout.custom_item_view, parent, false);
        return new ContactHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        final Contact contact = mContacts.get(position);
        if (position % 3 == 0) {
            holder.firstImage.setEnabled(false);
        }  else {
            holder.fifthImage.setEnabled(true);
        }
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ContactHolder extends RecyclerView.ViewHolder {
        ImageView firstImage, secondImage, thirdImage, forthImage, fifthImage, sixthImage;


        ContactHolder(View itemView) {
            super(itemView);
            firstImage = (ImageView) itemView.findViewById(R.id.first_image);
            secondImage = (ImageView) itemView.findViewById(R.id.second_image);
            thirdImage = (ImageView) itemView.findViewById(R.id.third_image);
            forthImage = (ImageView) itemView.findViewById(R.id.four_image);
            fifthImage = (ImageView) itemView.findViewById(R.id.five_image);
            sixthImage = (ImageView) itemView.findViewById(R.id.six_image);

        }
    }
}

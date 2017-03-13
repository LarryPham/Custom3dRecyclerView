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
        holder.contactImage.setColorFilter(contact.getContactColor());
        holder.contactName.setText(contact.getName());
        holder.contactAddress.setText(contact.getAddress());
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
        ImageView contactImage;
        TextView contactName;
        TextView contactAddress;

        ContactHolder(View itemView) {
            super(itemView);
            contactImage = (ImageView) itemView.findViewById(R.id.contact_image);
            contactName = (TextView) itemView.findViewById(R.id.contact_name);
            contactAddress = (TextView) itemView.findViewById(R.id.contact_address);
        }
    }
}

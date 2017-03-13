package com.capsule.apps.broccoli;

import java.io.Serializable;

public class Contact implements Serializable {

    private int mContactColor;
    private String mName;
    private String mAddress;

    public Contact(int contactColor, String name, String address) {
        mContactColor = contactColor;
        mName = name;
        mAddress = address;
    }

    public int getContactColor() {
        return mContactColor;
    }

    public void setContactColor(int contactColor) {
        mContactColor = contactColor;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contact contact = (Contact) obj;

        if (mContactColor != contact.mContactColor) return false;
        if (mName != null ? !mName.equals(contact.mName) : contact.mName != null) return false;
        return mAddress != null ? mAddress.equals(contact.mAddress) : contact.mAddress == null;

    }

    @Override
    public int hashCode() {
        int result = mContactColor;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mAddress != null ? mAddress.hashCode() : 0);
        return result;
    }
}

package com.thunderhead.trackoption;

import android.content.Intent;
import android.view.View;

class ListOfDataAttributesActivity$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ ListOfDataAttributesActivity read;

    private ListOfDataAttributesActivity$MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity listOfDataAttributesActivity) {
        this.read = listOfDataAttributesActivity;
    }

    /* synthetic */ ListOfDataAttributesActivity$MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity listOfDataAttributesActivity, byte b) {
        this(listOfDataAttributesActivity);
    }

    public final void onClick(View view) {
        Intent intent = new Intent(this.read, NewDataAttributeActivity.class);
        intent.putExtra("CUSTOMER_META_DATA_ID", this.read.IconCompatParcelizer);
        this.read.startActivityForResult(intent, 1);
    }
}

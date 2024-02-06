package com.thunderhead.trackoption;

import android.view.View;
import p040o.CropDocumentActivity;
import p040o.FragmentBuilder_BindPersonalInformationFragment;

/* renamed from: com.thunderhead.trackoption.ListOfDataAttributesActivity$MediaBrowserCompat$CustomActionResultReceiver */
class C6271xbf567432 implements View.OnClickListener {
    private /* synthetic */ ListOfDataAttributesActivity read;

    private C6271xbf567432(ListOfDataAttributesActivity listOfDataAttributesActivity) {
        this.read = listOfDataAttributesActivity;
    }

    /* synthetic */ C6271xbf567432(ListOfDataAttributesActivity listOfDataAttributesActivity, byte b) {
        this(listOfDataAttributesActivity);
    }

    public final void onClick(View view) {
        ListOfDataAttributesActivity listOfDataAttributesActivity = this.read;
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = listOfDataAttributesActivity.MediaBrowserCompat$ItemReceiver;
        int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
        listOfDataAttributesActivity.MediaMetadataCompat = i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i);
        ListOfDataAttributesActivity listOfDataAttributesActivity2 = this.read;
        CropDocumentActivity cropDocumentActivity = listOfDataAttributesActivity2.read;
        if (cropDocumentActivity != null) {
            cropDocumentActivity.write(listOfDataAttributesActivity2.MediaMetadataCompat != null);
        }
    }
}

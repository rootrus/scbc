package com.thunderhead.trackoption;

import android.text.Editable;
import android.text.TextWatcher;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.util.ArrayList;
import p040o.CropDocumentActivity;
import p040o.FragmentBuilder_BindPersonalInformationFragment;

/* renamed from: com.thunderhead.trackoption.ListOfDataAttributesActivity$MediaBrowserCompat$SearchResultReceiver */
class C6272x8bdb9253 implements TextWatcher {
    private /* synthetic */ ListOfDataAttributesActivity read;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private C6272x8bdb9253(ListOfDataAttributesActivity listOfDataAttributesActivity) {
        this.read = listOfDataAttributesActivity;
    }

    /* synthetic */ C6272x8bdb9253(ListOfDataAttributesActivity listOfDataAttributesActivity, byte b) {
        this(listOfDataAttributesActivity);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence == "" || this.read.MediaBrowserCompat$CustomActionResultReceiver == null) {
            FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.read.MediaBrowserCompat$ItemReceiver;
            fragmentBuilder_BindPersonalInformationFragment.write = this.read.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver = -1;
            fragmentBuilder_BindPersonalInformationFragment.IconCompatParcelizer.write();
        } else {
            ArrayList arrayList = new ArrayList();
            String lowerCase = charSequence.toString().toLowerCase();
            for (AttributeData next : this.read.MediaBrowserCompat$CustomActionResultReceiver) {
                if (next.getDisplayName().toLowerCase().contains(lowerCase)) {
                    arrayList.add(next);
                }
            }
            FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment2 = this.read.MediaBrowserCompat$ItemReceiver;
            fragmentBuilder_BindPersonalInformationFragment2.write = arrayList;
            fragmentBuilder_BindPersonalInformationFragment2.MediaBrowserCompat$ItemReceiver = -1;
            fragmentBuilder_BindPersonalInformationFragment2.IconCompatParcelizer.write();
        }
        if (this.read.MediaMetadataCompat != null) {
            this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.read.MediaMetadataCompat.getId());
        }
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            this.read.MediaBrowserCompat$MediaItem.setVisibility(8);
        } else {
            this.read.MediaBrowserCompat$MediaItem.setVisibility(0);
        }
        ListOfDataAttributesActivity listOfDataAttributesActivity = this.read;
        CropDocumentActivity cropDocumentActivity = listOfDataAttributesActivity.read;
        if (cropDocumentActivity != null) {
            if (listOfDataAttributesActivity.MediaMetadataCompat != null) {
                z = true;
            }
            cropDocumentActivity.write(z);
        }
    }
}

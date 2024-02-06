package com.scb.phone.view.fragment.additionaldocument;

import android.content.DialogInterface;
import p040o.getSettings;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class DocumentUploadFragment$MediaSessionCompat$QueueItem implements DialogInterface.OnClickListener {
    private /* synthetic */ DocumentUploadFragment IconCompatParcelizer;

    DocumentUploadFragment$MediaSessionCompat$QueueItem(DocumentUploadFragment documentUploadFragment) {
        this.IconCompatParcelizer = documentUploadFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getSettings getsettings = this.IconCompatParcelizer.presenter;
        if (getsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer appCompatActivity = new getSettings.AppCompatActivity(getsettings);
        if (getsettings.RatingCompat != null) {
            appCompatActivity.IconCompatParcelizer(getsettings.RatingCompat);
        }
    }
}

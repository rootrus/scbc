package com.scb.phone.view.fragment.additionaldocument;

import android.view.View;
import p040o.logSettings;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class DocumentInstructionsFragment$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ DocumentInstructionsFragment read;

    DocumentInstructionsFragment$MediaBrowserCompat$ItemReceiver(DocumentInstructionsFragment documentInstructionsFragment) {
        this.read = documentInstructionsFragment;
    }

    public final void onClick(View view) {
        logSettings logsettings = this.read.presenter;
        if (logsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write = new logSettings.write(logsettings);
        if (logsettings.RatingCompat != null) {
            write.IconCompatParcelizer(logsettings.RatingCompat);
        }
    }
}

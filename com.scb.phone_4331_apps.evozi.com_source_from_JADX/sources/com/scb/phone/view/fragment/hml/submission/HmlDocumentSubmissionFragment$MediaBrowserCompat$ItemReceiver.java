package com.scb.phone.view.fragment.hml.submission;

import androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.hml.HmlDocumentSubmissionAdapter;
import p040o.setShortcutName;

public final class HmlDocumentSubmissionFragment$MediaBrowserCompat$ItemReceiver extends GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver {
    private /* synthetic */ HmlDocumentSubmissionAdapter write;

    HmlDocumentSubmissionFragment$MediaBrowserCompat$ItemReceiver(HmlDocumentSubmissionAdapter hmlDocumentSubmissionAdapter) {
        this.write = hmlDocumentSubmissionAdapter;
    }

    public final int IconCompatParcelizer(int i) {
        if (this.write.MediaBrowserCompat$CustomActionResultReceiver(i) == setShortcutName.CATEGORY.ordinal()) {
            return 2;
        }
        setShortcutName setshortcutname = setShortcutName.ITEM;
        return 1;
    }
}

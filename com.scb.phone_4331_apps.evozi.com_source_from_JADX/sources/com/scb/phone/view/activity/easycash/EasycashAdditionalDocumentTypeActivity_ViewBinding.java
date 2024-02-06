package com.scb.phone.view.activity.easycash;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class EasycashAdditionalDocumentTypeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EasycashAdditionalDocumentTypeActivity write;

    public EasycashAdditionalDocumentTypeActivity_ViewBinding(EasycashAdditionalDocumentTypeActivity easycashAdditionalDocumentTypeActivity, View view) {
        super(easycashAdditionalDocumentTypeActivity, view);
        this.write = easycashAdditionalDocumentTypeActivity;
        easycashAdditionalDocumentTypeActivity.rvDocument = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_document, "field 'rvDocument'", RecyclerView.class);
    }

    public final void read() {
        EasycashAdditionalDocumentTypeActivity easycashAdditionalDocumentTypeActivity = this.write;
        if (easycashAdditionalDocumentTypeActivity != null) {
            this.write = null;
            easycashAdditionalDocumentTypeActivity.rvDocument = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.activity.chequemanagement;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ChequeAnnouncementActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ChequeAnnouncementActivity write;

    public ChequeAnnouncementActivity_ViewBinding(ChequeAnnouncementActivity chequeAnnouncementActivity, View view) {
        super(chequeAnnouncementActivity, view);
        this.write = chequeAnnouncementActivity;
        chequeAnnouncementActivity.btnAckKnowledge = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_ack_knowledge, "field 'btnAckKnowledge'", Button.class);
    }

    public final void read() {
        ChequeAnnouncementActivity chequeAnnouncementActivity = this.write;
        if (chequeAnnouncementActivity != null) {
            this.write = null;
            chequeAnnouncementActivity.btnAckKnowledge = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

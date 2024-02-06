package com.scb.phone.view.fragment.juristic;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class JuristicRequestFormFragment_ViewBinding extends BaseFragment_ViewBinding {
    private JuristicRequestFormFragment MediaBrowserCompat$CustomActionResultReceiver;

    public JuristicRequestFormFragment_ViewBinding(JuristicRequestFormFragment juristicRequestFormFragment, View view) {
        super(juristicRequestFormFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicRequestFormFragment;
        juristicRequestFormFragment.ivgEmail = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_email, "field 'ivgEmail'", CommonInputViewGroup.class);
        juristicRequestFormFragment.btSend = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_send, "field 'btSend'", Button.class);
    }

    public final void read() {
        JuristicRequestFormFragment juristicRequestFormFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (juristicRequestFormFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            juristicRequestFormFragment.ivgEmail = null;
            juristicRequestFormFragment.btSend = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

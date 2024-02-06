package com.scb.phone.view.fragment.juristic;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class JuristicRequestFormSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private JuristicRequestFormSuccessfulFragment IconCompatParcelizer;

    public JuristicRequestFormSuccessfulFragment_ViewBinding(JuristicRequestFormSuccessfulFragment juristicRequestFormSuccessfulFragment, View view) {
        super(juristicRequestFormSuccessfulFragment, view);
        this.IconCompatParcelizer = juristicRequestFormSuccessfulFragment;
        juristicRequestFormSuccessfulFragment.tvSentTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_sent_time, "field 'tvSentTime'", TextView.class);
        juristicRequestFormSuccessfulFragment.tvSentEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_sent_email, "field 'tvSentEmail'", TextView.class);
        juristicRequestFormSuccessfulFragment.btBackToHome = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_back_to_home, "field 'btBackToHome'", Button.class);
    }

    public final void read() {
        JuristicRequestFormSuccessfulFragment juristicRequestFormSuccessfulFragment = this.IconCompatParcelizer;
        if (juristicRequestFormSuccessfulFragment != null) {
            this.IconCompatParcelizer = null;
            juristicRequestFormSuccessfulFragment.tvSentTime = null;
            juristicRequestFormSuccessfulFragment.tvSentEmail = null;
            juristicRequestFormSuccessfulFragment.btBackToHome = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

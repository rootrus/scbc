package com.scb.phone.view.fragment.demo.ntb;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class NTBBankingServiceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private NTBBankingServiceFragment write;

    public NTBBankingServiceFragment_ViewBinding(NTBBankingServiceFragment nTBBankingServiceFragment, View view) {
        super(nTBBankingServiceFragment, view);
        this.write = nTBBankingServiceFragment;
        nTBBankingServiceFragment.cusIvProfile = (CustomProfileImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cus_iv_profile, "field 'cusIvProfile'", CustomProfileImageView.class);
        nTBBankingServiceFragment.tvHomeWelcomeHeadline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline, "field 'tvHomeWelcomeHeadline'", TextView.class);
        nTBBankingServiceFragment.tvHomeWelcomeUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome, "field 'tvHomeWelcomeUserName'", TextView.class);
        nTBBankingServiceFragment.rvBankingActions = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_banking_actions, "field 'rvBankingActions'", RecyclerView.class);
    }

    public final void read() {
        NTBBankingServiceFragment nTBBankingServiceFragment = this.write;
        if (nTBBankingServiceFragment != null) {
            this.write = null;
            nTBBankingServiceFragment.cusIvProfile = null;
            nTBBankingServiceFragment.tvHomeWelcomeHeadline = null;
            nTBBankingServiceFragment.tvHomeWelcomeUserName = null;
            nTBBankingServiceFragment.rvBankingActions = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

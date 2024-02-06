package com.scb.phone.view.fragment.hml.businessowner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlETBAccountSetupFragment;
import p040o.onGetStartedClick;

public final class HmlBusinessOwnerAccountSetupFragment extends HmlETBAccountSetupFragment {
    public static final read IconCompatParcelizer = new read((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        TextView textView = this.estatementEmailTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("estatementEmailTitle");
        }
        textView.setText(getString(R.string.hml_business_owner_loan_setup_email_title));
        TextView textView2 = this.estatementEmailDisclaimer;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("estatementEmailDisclaimer");
        }
        textView2.setVisibility(8);
        FrameLayout frameLayout = this.emailSeparator;
        if (frameLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("emailSeparator");
        }
        frameLayout.setVisibility(8);
        TextView textView3 = this.repaymentDateTitle;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentDateTitle");
        }
        textView3.setText(getString(R.string.hml_business_owner_loan_setup_repayment_title));
        onGetStartedClick.IconCompatParcelizer((Object) onCreateView, "super.onCreateView(infla…epayment_title)\n        }");
        return onCreateView;
    }
}

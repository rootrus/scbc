package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class EasycashScreenShotFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashScreenShotFragment write;

    public EasycashScreenShotFragment_ViewBinding(EasycashScreenShotFragment easycashScreenShotFragment, View view) {
        super(easycashScreenShotFragment, view);
        this.write = easycashScreenShotFragment;
        easycashScreenShotFragment.titleSuccessTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'titleSuccessTextView'", TextView.class);
        easycashScreenShotFragment.descriptionText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_desc, "field 'descriptionText'", TextView.class);
        easycashScreenShotFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'refIdTextView'", TextView.class);
        easycashScreenShotFragment.loanAppIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_app_id, "field 'loanAppIdTextView'", TextView.class);
        easycashScreenShotFragment.dateTimeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'dateTimeTextView'", TextView.class);
        easycashScreenShotFragment.successCommonView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.common_success_view, "field 'successCommonView'", FrameLayout.class);
    }

    public final void read() {
        EasycashScreenShotFragment easycashScreenShotFragment = this.write;
        if (easycashScreenShotFragment != null) {
            this.write = null;
            easycashScreenShotFragment.titleSuccessTextView = null;
            easycashScreenShotFragment.descriptionText = null;
            easycashScreenShotFragment.refIdTextView = null;
            easycashScreenShotFragment.loanAppIdTextView = null;
            easycashScreenShotFragment.dateTimeTextView = null;
            easycashScreenShotFragment.successCommonView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

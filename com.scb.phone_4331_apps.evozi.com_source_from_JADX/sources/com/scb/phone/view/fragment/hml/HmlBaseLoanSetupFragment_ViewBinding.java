package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBaseLoanSetupFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private HmlBaseLoanSetupFragment write;

    public HmlBaseLoanSetupFragment_ViewBinding(final HmlBaseLoanSetupFragment hmlBaseLoanSetupFragment, View view) {
        super(hmlBaseLoanSetupFragment, view);
        this.write = hmlBaseLoanSetupFragment;
        hmlBaseLoanSetupFragment.header = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_header, "field 'header'", ImageView.class);
        hmlBaseLoanSetupFragment.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_setup_title, "field 'title'", TextView.class);
        hmlBaseLoanSetupFragment.subtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_setup_subtitle, "field 'subtitle'", TextView.class);
        hmlBaseLoanSetupFragment.verifyEmailIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_verify_email_icon, "field 'verifyEmailIcon'", ImageView.class);
        hmlBaseLoanSetupFragment.verifyEmailChecked = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_verify_email_checked, "field 'verifyEmailChecked'", ImageView.class);
        hmlBaseLoanSetupFragment.verifyEmailIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_verify_email_indicator, "field 'verifyEmailIndicator'", ImageView.class);
        hmlBaseLoanSetupFragment.verifyEmailTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_verify_email, "field 'verifyEmailTextView'", TextView.class);
        hmlBaseLoanSetupFragment.openAccountIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_open_account_icon, "field 'openAccountIcon'", ImageView.class);
        hmlBaseLoanSetupFragment.openAccountChecked = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_open_account_checked, "field 'openAccountChecked'", ImageView.class);
        hmlBaseLoanSetupFragment.openAccountIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_open_account_indicator, "field 'openAccountIndicator'", ImageView.class);
        hmlBaseLoanSetupFragment.openAccountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_open_account, "field 'openAccountTextView'", TextView.class);
        hmlBaseLoanSetupFragment.setupAccountIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_setup_account_indicator, "field 'setupAccountIndicator'", ImageView.class);
        hmlBaseLoanSetupFragment.setupAccountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_setup_account, "field 'setupAccountTextView'", TextView.class);
        hmlBaseLoanSetupFragment.reviewLoanTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_review_loan, "field 'reviewLoanTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_loan_setup_next, "method 'onNextClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBaseLoanSetupFragment.this.onNextClicked();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_loan_setup_home, "method 'onHomeClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBaseLoanSetupFragment.this.onHomeClicked();
            }
        });
    }

    public final void read() {
        HmlBaseLoanSetupFragment hmlBaseLoanSetupFragment = this.write;
        if (hmlBaseLoanSetupFragment != null) {
            this.write = null;
            hmlBaseLoanSetupFragment.header = null;
            hmlBaseLoanSetupFragment.title = null;
            hmlBaseLoanSetupFragment.subtitle = null;
            hmlBaseLoanSetupFragment.verifyEmailIcon = null;
            hmlBaseLoanSetupFragment.verifyEmailChecked = null;
            hmlBaseLoanSetupFragment.verifyEmailIndicator = null;
            hmlBaseLoanSetupFragment.verifyEmailTextView = null;
            hmlBaseLoanSetupFragment.openAccountIcon = null;
            hmlBaseLoanSetupFragment.openAccountChecked = null;
            hmlBaseLoanSetupFragment.openAccountIndicator = null;
            hmlBaseLoanSetupFragment.openAccountTextView = null;
            hmlBaseLoanSetupFragment.setupAccountIndicator = null;
            hmlBaseLoanSetupFragment.setupAccountTextView = null;
            hmlBaseLoanSetupFragment.reviewLoanTextView = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

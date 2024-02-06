package com.scb.phone.view.fragment.emailverification;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ManageEmailVerificationSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ManageEmailVerificationSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public ManageEmailVerificationSuccessFragment_ViewBinding(final ManageEmailVerificationSuccessFragment manageEmailVerificationSuccessFragment, View view) {
        super(manageEmailVerificationSuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageEmailVerificationSuccessFragment;
        manageEmailVerificationSuccessFragment.textSuccessTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_success_title, "field 'textSuccessTitle'", TextView.class);
        manageEmailVerificationSuccessFragment.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnHomeClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageEmailVerificationSuccessFragment.this.onReturnHomeClick();
            }
        });
    }

    public final void read() {
        ManageEmailVerificationSuccessFragment manageEmailVerificationSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageEmailVerificationSuccessFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageEmailVerificationSuccessFragment.textSuccessTitle = null;
            manageEmailVerificationSuccessFragment.textDateTime = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

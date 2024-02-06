package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlVerifyEmailSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlVerifyEmailSuccessfulFragment MediaBrowserCompat$ItemReceiver;

    public HmlVerifyEmailSuccessfulFragment_ViewBinding(final HmlVerifyEmailSuccessfulFragment hmlVerifyEmailSuccessfulFragment, View view) {
        super(hmlVerifyEmailSuccessfulFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlVerifyEmailSuccessfulFragment;
        hmlVerifyEmailSuccessfulFragment.tvEmailVerifySuccessText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_email_verify_success_text, "field 'tvEmailVerifySuccessText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_hml_email_verify_success_button, "field 'btEmailVerifyButton' and method 'onNextClicked'");
        hmlVerifyEmailSuccessfulFragment.btEmailVerifyButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_hml_email_verify_success_button, "field 'btEmailVerifyButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlVerifyEmailSuccessfulFragment.this.onNextClicked();
            }
        });
    }

    public final void read() {
        HmlVerifyEmailSuccessfulFragment hmlVerifyEmailSuccessfulFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlVerifyEmailSuccessfulFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlVerifyEmailSuccessfulFragment.tvEmailVerifySuccessText = null;
            hmlVerifyEmailSuccessfulFragment.btEmailVerifyButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlVerifyEmailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlVerifyEmailFragment MediaBrowserCompat$ItemReceiver;

    public HmlVerifyEmailFragment_ViewBinding(final HmlVerifyEmailFragment hmlVerifyEmailFragment, View view) {
        super(hmlVerifyEmailFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlVerifyEmailFragment;
        hmlVerifyEmailFragment.emailView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_verify_email_text, "field 'emailView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_hml_verify_email_send_button, "field 'confirmButton' and method 'send'");
        hmlVerifyEmailFragment.confirmButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_hml_verify_email_send_button, "field 'confirmButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlVerifyEmailFragment.this.send();
            }
        });
    }

    public final void read() {
        HmlVerifyEmailFragment hmlVerifyEmailFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlVerifyEmailFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlVerifyEmailFragment.emailView = null;
            hmlVerifyEmailFragment.confirmButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.webview.SCBWebView;
import p040o.onCreateDialog;
import p040o.onStart;

public class TermsConditionsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TermsConditionsFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public TermsConditionsFragment_ViewBinding(final TermsConditionsFragment termsConditionsFragment, View view) {
        super(termsConditionsFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = termsConditionsFragment;
        termsConditionsFragment.webView = (SCBWebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.webview, "field 'webView'", SCBWebView.class);
        termsConditionsFragment.buttonsLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bottom_buttons, "field 'buttonsLayout'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_accept, "field 'buttonAccept' and method 'acceptTermsConditions'");
        termsConditionsFragment.buttonAccept = (Button) onStart.write(IconCompatParcelizer, R.id.button_accept, "field 'buttonAccept'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TermsConditionsFragment.this.acceptTermsConditions();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_decline, "field 'buttonDecline' and method 'declineTermsConditions'");
        termsConditionsFragment.buttonDecline = (Button) onStart.write(IconCompatParcelizer2, R.id.button_decline, "field 'buttonDecline'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TermsConditionsFragment.this.declineTermsConditions();
            }
        });
    }

    public final void read() {
        TermsConditionsFragment termsConditionsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (termsConditionsFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            termsConditionsFragment.webView = null;
            termsConditionsFragment.buttonsLayout = null;
            termsConditionsFragment.buttonAccept = null;
            termsConditionsFragment.buttonDecline = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

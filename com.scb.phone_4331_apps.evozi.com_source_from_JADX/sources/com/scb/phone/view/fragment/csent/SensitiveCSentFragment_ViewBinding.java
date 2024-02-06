package com.scb.phone.view.fragment.csent;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.scb.phone.R;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class SensitiveCSentFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private SensitiveCSentFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public SensitiveCSentFragment_ViewBinding(final SensitiveCSentFragment sensitiveCSentFragment, View view) {
        super(sensitiveCSentFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = sensitiveCSentFragment;
        sensitiveCSentFragment.wvConsent = (SCBWebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_sensitive_consent, "field 'wvConsent'", SCBWebView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'onNext'");
        sensitiveCSentFragment.nextButton = (AppCompatButton) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'nextButton'", AppCompatButton.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SensitiveCSentFragment.this.onNext();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rb_accept, "method 'onClickRadioButtonAccept'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SensitiveCSentFragment.this.onClickRadioButtonAccept();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.rb_decline, "method 'onClickRadioButtonDecline'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SensitiveCSentFragment.this.onClickRadioButtonDecline();
            }
        });
    }

    public final void read() {
        SensitiveCSentFragment sensitiveCSentFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sensitiveCSentFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            sensitiveCSentFragment.wvConsent = null;
            sensitiveCSentFragment.nextButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

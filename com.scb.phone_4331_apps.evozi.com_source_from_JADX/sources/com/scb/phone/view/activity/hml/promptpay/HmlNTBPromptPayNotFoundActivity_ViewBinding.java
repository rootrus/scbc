package com.scb.phone.view.activity.hml.promptpay;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBPromptPayNotFoundActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private HmlNTBPromptPayNotFoundActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public HmlNTBPromptPayNotFoundActivity_ViewBinding(final HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity, View view) {
        super(hmlNTBPromptPayNotFoundActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBPromptPayNotFoundActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenterClicked'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBPromptPayNotFoundActivity.this.onContactCallCenterClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onReturnHomeClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBPromptPayNotFoundActivity.this.onReturnHomeClicked();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.activity.etb;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ETBWelcomeAboardActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ETBWelcomeAboardActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public ETBWelcomeAboardActivity_ViewBinding(final ETBWelcomeAboardActivity eTBWelcomeAboardActivity, View view) {
        super(eTBWelcomeAboardActivity, view);
        this.IconCompatParcelizer = eTBWelcomeAboardActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_arrow_back, "method 'onNavigateBack'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBWelcomeAboardActivity.this.onNavigateBack();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_open_account, "method 'clickOpenAccount'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBWelcomeAboardActivity.this.clickOpenAccount();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.bt_register_easy_app, "method 'clickRegister'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBWelcomeAboardActivity.this.clickRegister();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

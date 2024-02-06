package com.scb.phone.view.activity.demo.ntb;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class WelcomeAboardActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private WelcomeAboardActivity write;

    public WelcomeAboardActivity_ViewBinding(final WelcomeAboardActivity welcomeAboardActivity, View view) {
        super(welcomeAboardActivity, view);
        this.write = welcomeAboardActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_loan, "field 'buttonLoan' and method 'clickLoan'");
        welcomeAboardActivity.buttonLoan = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_loan, "field 'buttonLoan'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                WelcomeAboardActivity.this.clickLoan();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.iv_arrow_back, "method 'onNavigateBack'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                WelcomeAboardActivity.this.onNavigateBack();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_explore_demo, "method 'clickExplore'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                WelcomeAboardActivity.this.clickExplore();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.bt_open_account, "method 'clickOpenAccount'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                WelcomeAboardActivity.this.clickOpenAccount();
            }
        });
    }

    public final void read() {
        WelcomeAboardActivity welcomeAboardActivity = this.write;
        if (welcomeAboardActivity != null) {
            this.write = null;
            welcomeAboardActivity.buttonLoan = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

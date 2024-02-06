package com.scb.phone.view.activity.scheduledtransaction;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScheduleLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ScheduleLandingActivity MediaBrowserCompat$ItemReceiver;

    public ScheduleLandingActivity_ViewBinding(final ScheduleLandingActivity scheduleLandingActivity, View view) {
        super(scheduleLandingActivity, view);
        this.MediaBrowserCompat$ItemReceiver = scheduleLandingActivity;
        scheduleLandingActivity.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
        scheduleLandingActivity.tabPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager, "field 'tabPager'", ViewPager.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_ok, "field 'okButton' and method 'onOkClick'");
        scheduleLandingActivity.okButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_ok, "field 'okButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScheduleLandingActivity.this.onOkClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_unschedule_transaction, "method 'onUnscheduleClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScheduleLandingActivity.this.onUnscheduleClick();
            }
        });
    }

    public final void read() {
        ScheduleLandingActivity scheduleLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (scheduleLandingActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            scheduleLandingActivity.tabLayout = null;
            scheduleLandingActivity.tabPager = null;
            scheduleLandingActivity.okButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class BulletThaiTextView_ViewBinding implements Unbinder {
    private BulletThaiTextView MediaBrowserCompat$ItemReceiver;

    public BulletThaiTextView_ViewBinding(BulletThaiTextView bulletThaiTextView, View view) {
        this.MediaBrowserCompat$ItemReceiver = bulletThaiTextView;
        bulletThaiTextView.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remarks, "field 'tvRemark'", TextView.class);
        bulletThaiTextView.tvBullet = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bullet, "field 'tvBullet'", TextView.class);
    }

    public final void read() {
        BulletThaiTextView bulletThaiTextView = this.MediaBrowserCompat$ItemReceiver;
        if (bulletThaiTextView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            bulletThaiTextView.tvRemark = null;
            bulletThaiTextView.tvBullet = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.RealWrapContentViewPager;
import p040o.onStart;

public class BaseAmortizationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseAmortizationActivity MediaBrowserCompat$ItemReceiver;

    public BaseAmortizationActivity_ViewBinding(BaseAmortizationActivity baseAmortizationActivity, View view) {
        super(baseAmortizationActivity, view);
        this.MediaBrowserCompat$ItemReceiver = baseAmortizationActivity;
        baseAmortizationActivity.btnScrollDown = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btnScrollDown, "field 'btnScrollDown'", ImageButton.class);
        baseAmortizationActivity.nsvRoot = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nsvRoot, "field 'nsvRoot'", NestedScrollView.class);
        baseAmortizationActivity.tabAmortization = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tabAmortization, "field 'tabAmortization'", CustomTabLayout.class);
        baseAmortizationActivity.vpAmortization = (RealWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vpAmortization, "field 'vpAmortization'", RealWrapContentViewPager.class);
        baseAmortizationActivity.tvMessageBottom = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvMessageBottom, "field 'tvMessageBottom'", TextView.class);
    }

    public void read() {
        BaseAmortizationActivity baseAmortizationActivity = this.MediaBrowserCompat$ItemReceiver;
        if (baseAmortizationActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseAmortizationActivity.btnScrollDown = null;
            baseAmortizationActivity.nsvRoot = null;
            baseAmortizationActivity.tabAmortization = null;
            baseAmortizationActivity.vpAmortization = null;
            baseAmortizationActivity.tvMessageBottom = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

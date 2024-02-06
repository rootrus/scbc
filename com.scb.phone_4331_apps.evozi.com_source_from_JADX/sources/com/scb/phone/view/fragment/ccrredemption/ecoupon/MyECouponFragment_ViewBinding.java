package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class MyECouponFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MyECouponFragment IconCompatParcelizer;

    public MyECouponFragment_ViewBinding(MyECouponFragment myECouponFragment, View view) {
        super(myECouponFragment, view);
        this.IconCompatParcelizer = myECouponFragment;
        myECouponFragment.rvCouponList = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_coupon_list, "field 'rvCouponList'", RecyclerView.class);
        myECouponFragment.ivErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_error_icon, "field 'ivErrorIcon'", ImageView.class);
        myECouponFragment.tvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_title, "field 'tvErrorTitle'", TextView.class);
        myECouponFragment.tvErrorGeneric = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_generic_error, "field 'tvErrorGeneric'", TextView.class);
        myECouponFragment.llErrorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_error_layout, "field 'llErrorLayout'", ViewGroup.class);
    }

    public final void read() {
        MyECouponFragment myECouponFragment = this.IconCompatParcelizer;
        if (myECouponFragment != null) {
            this.IconCompatParcelizer = null;
            myECouponFragment.rvCouponList = null;
            myECouponFragment.ivErrorIcon = null;
            myECouponFragment.tvErrorTitle = null;
            myECouponFragment.tvErrorGeneric = null;
            myECouponFragment.llErrorLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RequestToPayLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RequestToPayLandingFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public RequestToPayLandingFragment_ViewBinding(final RequestToPayLandingFragment requestToPayLandingFragment, View view) {
        super(requestToPayLandingFragment, view);
        this.MediaBrowserCompat$ItemReceiver = requestToPayLandingFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.request_money_tutorial_relative_layout, "field 'mRequestMoneyTutorialContainer' and method 'onTutorialClicked'");
        requestToPayLandingFragment.mRequestMoneyTutorialContainer = (RelativeLayout) onStart.write(IconCompatParcelizer, R.id.request_money_tutorial_relative_layout, "field 'mRequestMoneyTutorialContainer'", RelativeLayout.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RequestToPayLandingFragment.this.onTutorialClicked();
            }
        });
        requestToPayLandingFragment.mOverlayRequestMoneyTutorialImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_request_money_tutorial_image_view, "field 'mOverlayRequestMoneyTutorialImageView'", ImageView.class);
        requestToPayLandingFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root_test, "field 'mRootView'", RelativeLayout.class);
        requestToPayLandingFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.request_money_tab_layout, "field 'tabLayout'", TabLayout.class);
        requestToPayLandingFragment.tabPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.request_money_view_pager, "field 'tabPager'", ViewPager.class);
        requestToPayLandingFragment.tvRequestToPayTutorial = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_request_to_pay_tutorial, "field 'tvRequestToPayTutorial'", TextView.class);
    }

    public final void read() {
        RequestToPayLandingFragment requestToPayLandingFragment = this.MediaBrowserCompat$ItemReceiver;
        if (requestToPayLandingFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            requestToPayLandingFragment.mRequestMoneyTutorialContainer = null;
            requestToPayLandingFragment.mOverlayRequestMoneyTutorialImageView = null;
            requestToPayLandingFragment.mRootView = null;
            requestToPayLandingFragment.tabLayout = null;
            requestToPayLandingFragment.tabPager = null;
            requestToPayLandingFragment.tvRequestToPayTutorial = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

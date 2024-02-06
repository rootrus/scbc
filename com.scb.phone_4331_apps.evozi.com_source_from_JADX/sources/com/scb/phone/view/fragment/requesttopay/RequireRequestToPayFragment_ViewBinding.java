package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RequireRequestToPayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private RequireRequestToPayFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public RequireRequestToPayFragment_ViewBinding(final RequireRequestToPayFragment requireRequestToPayFragment, View view) {
        super(requireRequestToPayFragment, view);
        this.MediaBrowserCompat$ItemReceiver = requireRequestToPayFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.request_money_tutorial_relative_layout, "field 'mRequestMoneyTutotrialContainer' and method 'onTutorialClicked'");
        requireRequestToPayFragment.mRequestMoneyTutotrialContainer = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.request_money_tutorial_relative_layout, "field 'mRequestMoneyTutotrialContainer'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RequireRequestToPayFragment.this.onTutorialClicked();
            }
        });
        requireRequestToPayFragment.mOverlayRequestMoneyTutorialImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_request_money_tutorial_image_view, "field 'mOverlayRequestMoneyTutorialImageView'", ImageView.class);
        requireRequestToPayFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root_request_money, "field 'mRootView'", RelativeLayout.class);
        requireRequestToPayFragment.tvDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_detail, "field 'tvDetail'", TextView.class);
        requireRequestToPayFragment.tvHeaderDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_header_detail, "field 'tvHeaderDetail'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_request_to_pay_settings, "method 'onRequestToPaySettingsClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RequireRequestToPayFragment.this.onRequestToPaySettingsClick();
            }
        });
    }

    public final void read() {
        RequireRequestToPayFragment requireRequestToPayFragment = this.MediaBrowserCompat$ItemReceiver;
        if (requireRequestToPayFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            requireRequestToPayFragment.mRequestMoneyTutotrialContainer = null;
            requireRequestToPayFragment.mOverlayRequestMoneyTutorialImageView = null;
            requireRequestToPayFragment.mRootView = null;
            requireRequestToPayFragment.tvDetail = null;
            requireRequestToPayFragment.tvHeaderDetail = null;
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

package com.scb.phone.view.fragment.donations;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DonationsFoundationDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DonationsFoundationDetailsFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public DonationsFoundationDetailsFragment_ViewBinding(final DonationsFoundationDetailsFragment donationsFoundationDetailsFragment, View view) {
        super(donationsFoundationDetailsFragment, view);
        this.IconCompatParcelizer = donationsFoundationDetailsFragment;
        donationsFoundationDetailsFragment.mAppBarLayout = (AppBarLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.smooth_app_bar_layout, "field 'mAppBarLayout'", AppBarLayout.class);
        donationsFoundationDetailsFragment.mLogoImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.avatar_image_view, "field 'mLogoImageView'", ImageView.class);
        donationsFoundationDetailsFragment.mFoundationName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.foundation_name, "field 'mFoundationName'", TextView.class);
        donationsFoundationDetailsFragment.mHtmlDescriptionWebView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.htmlDescription, "field 'mHtmlDescriptionWebView'", WebView.class);
        donationsFoundationDetailsFragment.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.background_image, "field 'backgroundImageView'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_donate, "method 'onDonateButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DonationsFoundationDetailsFragment.this.onDonateButtonClick();
            }
        });
    }

    public final void read() {
        DonationsFoundationDetailsFragment donationsFoundationDetailsFragment = this.IconCompatParcelizer;
        if (donationsFoundationDetailsFragment != null) {
            this.IconCompatParcelizer = null;
            donationsFoundationDetailsFragment.mAppBarLayout = null;
            donationsFoundationDetailsFragment.mLogoImageView = null;
            donationsFoundationDetailsFragment.mFoundationName = null;
            donationsFoundationDetailsFragment.mHtmlDescriptionWebView = null;
            donationsFoundationDetailsFragment.backgroundImageView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

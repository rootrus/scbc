package com.scb.phone.view.fragment.landingpage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.custom.common.CustomScrollView;
import p040o.onCreateDialog;
import p040o.onStart;

public class LandingFragment_ViewBinding extends BaseDragAndDropFragment_ViewBinding {
    private View IconCompatParcelizer;
    private LandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public LandingFragment_ViewBinding(final LandingFragment landingFragment, View view) {
        super(landingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = landingFragment;
        landingFragment.tvHomeWelcomeHeadline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline, "field 'tvHomeWelcomeHeadline'", TextView.class);
        landingFragment.tvHomeWelcomeUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome, "field 'tvHomeWelcomeUserName'", TextView.class);
        landingFragment.tvHomeCity = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_city, "field 'tvHomeCity'", TextView.class);
        landingFragment.tvHomeWelcomeHeadlineInsight = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline_insight, "field 'tvHomeWelcomeHeadlineInsight'", TextView.class);
        landingFragment.tvHomeWelcomeInsight = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_insight, "field 'tvHomeWelcomeInsight'", TextView.class);
        landingFragment.llLayoutHomeWelcomeDetail = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_home_welcome_detail, "field 'llLayoutHomeWelcomeDetail'", LinearLayout.class);
        landingFragment.llLayoutHomeInsight = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_home_insight, "field 'llLayoutHomeInsight'", LinearLayout.class);
        landingFragment.cusIvProfile = (CustomProfileImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cus_iv_profile, "field 'cusIvProfile'", CustomProfileImageView.class);
        landingFragment.ivBgLanding = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_bg_landing, "field 'ivBgLanding'", ImageView.class);
        landingFragment.scrollView = (CustomScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", CustomScrollView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.qr_belt_create_button, "field 'scanBeltButton' and method 'onQRBeltCreateButtonClicked'");
        landingFragment.scanBeltButton = (ViewGroup) onStart.write(IconCompatParcelizer2, R.id.qr_belt_create_button, "field 'scanBeltButton'", ViewGroup.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LandingFragment.this.onQRBeltCreateButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.qr_belt_scan_button, "field 'qrCodeBeltButton' and method 'onQRBeltScanButtonClicked'");
        landingFragment.qrCodeBeltButton = (ViewGroup) onStart.write(IconCompatParcelizer3, R.id.qr_belt_scan_button, "field 'qrCodeBeltButton'", ViewGroup.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LandingFragment.this.onQRBeltScanButtonClicked();
            }
        });
        landingFragment.staticLoadingImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_static_loading, "field 'staticLoadingImageView'", ImageView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.static_tap_to_retry, "field 'staticTapToRetry' and method 'tapToRetryStatic'");
        landingFragment.staticTapToRetry = (LinearLayout) onStart.write(IconCompatParcelizer4, R.id.static_tap_to_retry, "field 'staticTapToRetry'", LinearLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LandingFragment.this.tapToRetryStatic();
            }
        });
        landingFragment.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
    }

    public final void read() {
        LandingFragment landingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (landingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            landingFragment.tvHomeWelcomeHeadline = null;
            landingFragment.tvHomeWelcomeUserName = null;
            landingFragment.tvHomeCity = null;
            landingFragment.tvHomeWelcomeHeadlineInsight = null;
            landingFragment.tvHomeWelcomeInsight = null;
            landingFragment.llLayoutHomeWelcomeDetail = null;
            landingFragment.llLayoutHomeInsight = null;
            landingFragment.cusIvProfile = null;
            landingFragment.ivBgLanding = null;
            landingFragment.scrollView = null;
            landingFragment.scanBeltButton = null;
            landingFragment.qrCodeBeltButton = null;
            landingFragment.staticLoadingImageView = null;
            landingFragment.staticTapToRetry = null;
            landingFragment.tvPrivacyNotice = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

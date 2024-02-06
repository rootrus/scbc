package com.scb.phone.view.fragment.demo.ntb;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.custom.common.CustomScrollView;
import com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NTBLifestyleLandingFragment_ViewBinding extends BaseDragAndDropFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private NTBLifestyleLandingFragment write;

    public NTBLifestyleLandingFragment_ViewBinding(final NTBLifestyleLandingFragment nTBLifestyleLandingFragment, View view) {
        super(nTBLifestyleLandingFragment, view);
        this.write = nTBLifestyleLandingFragment;
        nTBLifestyleLandingFragment.tvHomeWelcomeHeadline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline, "field 'tvHomeWelcomeHeadline'", TextView.class);
        nTBLifestyleLandingFragment.tvHomeWelcomeUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome, "field 'tvHomeWelcomeUserName'", TextView.class);
        nTBLifestyleLandingFragment.tvHomeCity = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_city, "field 'tvHomeCity'", TextView.class);
        nTBLifestyleLandingFragment.cusIvProfile = (CustomProfileImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cus_iv_profile, "field 'cusIvProfile'", CustomProfileImageView.class);
        nTBLifestyleLandingFragment.ivBgLanding = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_bg_landing, "field 'ivBgLanding'", ImageView.class);
        nTBLifestyleLandingFragment.scrollView = (CustomScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", CustomScrollView.class);
        nTBLifestyleLandingFragment.staticLoadingImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_static_loading, "field 'staticLoadingImageView'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.static_tap_to_retry, "field 'staticTapToRetry' and method 'tapToRetryStatic'");
        nTBLifestyleLandingFragment.staticTapToRetry = (LinearLayout) onStart.write(IconCompatParcelizer, R.id.static_tap_to_retry, "field 'staticTapToRetry'", LinearLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NTBLifestyleLandingFragment.this.tapToRetryStatic();
            }
        });
        nTBLifestyleLandingFragment.qrBelt = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_belt, "field 'qrBelt'", LinearLayout.class);
        nTBLifestyleLandingFragment.contentLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_content, "field 'contentLinearLayout'", LinearLayout.class);
        nTBLifestyleLandingFragment.alreadyHaveAccountLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_already_have_account, "field 'alreadyHaveAccountLinearLayout'", LinearLayout.class);
        nTBLifestyleLandingFragment.tvPrivacyNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_notice, "field 'tvPrivacyNotice'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_already_have_account, "method 'onClickUserAlreadyHaveAccount'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NTBLifestyleLandingFragment.this.onClickUserAlreadyHaveAccount();
            }
        });
    }

    public final void read() {
        NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.write;
        if (nTBLifestyleLandingFragment != null) {
            this.write = null;
            nTBLifestyleLandingFragment.tvHomeWelcomeHeadline = null;
            nTBLifestyleLandingFragment.tvHomeWelcomeUserName = null;
            nTBLifestyleLandingFragment.tvHomeCity = null;
            nTBLifestyleLandingFragment.cusIvProfile = null;
            nTBLifestyleLandingFragment.ivBgLanding = null;
            nTBLifestyleLandingFragment.scrollView = null;
            nTBLifestyleLandingFragment.staticLoadingImageView = null;
            nTBLifestyleLandingFragment.staticTapToRetry = null;
            nTBLifestyleLandingFragment.qrBelt = null;
            nTBLifestyleLandingFragment.contentLinearLayout = null;
            nTBLifestyleLandingFragment.alreadyHaveAccountLinearLayout = null;
            nTBLifestyleLandingFragment.tvPrivacyNotice = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

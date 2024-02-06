package com.scb.phone.view.fragment.sme;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SMELandingFragment_ViewBinding extends BaseDragAndDropFragment_ViewBinding {
    private SMELandingFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public SMELandingFragment_ViewBinding(final SMELandingFragment sMELandingFragment, View view) {
        super(sMELandingFragment, view);
        this.IconCompatParcelizer = sMELandingFragment;
        sMELandingFragment.tvHomeWelcomeHeadline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline, "field 'tvHomeWelcomeHeadline'", TextView.class);
        sMELandingFragment.tvHomeWelcomeUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome, "field 'tvHomeWelcomeUserName'", TextView.class);
        sMELandingFragment.tvHomeCity = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_city, "field 'tvHomeCity'", TextView.class);
        sMELandingFragment.cusIvProfile = (CustomProfileImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cus_iv_profile, "field 'cusIvProfile'", CustomProfileImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.qr_belt_create_button, "field 'scanBeltButton' and method 'onQRBeltCreateButtonClicked'");
        sMELandingFragment.scanBeltButton = (ViewGroup) onStart.write(IconCompatParcelizer2, R.id.qr_belt_create_button, "field 'scanBeltButton'", ViewGroup.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SMELandingFragment.this.onQRBeltCreateButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.qr_belt_scan_button, "field 'qrCodeBeltButton' and method 'onQRBeltScanButtonClicked'");
        sMELandingFragment.qrCodeBeltButton = (ViewGroup) onStart.write(IconCompatParcelizer3, R.id.qr_belt_scan_button, "field 'qrCodeBeltButton'", ViewGroup.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SMELandingFragment.this.onQRBeltScanButtonClicked();
            }
        });
    }

    public final void read() {
        SMELandingFragment sMELandingFragment = this.IconCompatParcelizer;
        if (sMELandingFragment != null) {
            this.IconCompatParcelizer = null;
            sMELandingFragment.tvHomeWelcomeHeadline = null;
            sMELandingFragment.tvHomeWelcomeUserName = null;
            sMELandingFragment.tvHomeCity = null;
            sMELandingFragment.cusIvProfile = null;
            sMELandingFragment.scanBeltButton = null;
            sMELandingFragment.qrCodeBeltButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

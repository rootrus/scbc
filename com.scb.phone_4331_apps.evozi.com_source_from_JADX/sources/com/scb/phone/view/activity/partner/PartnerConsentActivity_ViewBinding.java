package com.scb.phone.view.activity.partner;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PartnerConsentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PartnerConsentActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public PartnerConsentActivity_ViewBinding(final PartnerConsentActivity partnerConsentActivity, View view) {
        super(partnerConsentActivity, view);
        this.IconCompatParcelizer = partnerConsentActivity;
        partnerConsentActivity.imgIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_consent_icon, "field 'imgIcon'", ImageView.class);
        partnerConsentActivity.tvConsentDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_consent_detail, "field 'tvConsentDescription'", TextView.class);
        partnerConsentActivity.wvConsentDescription = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_consent_detail, "field 'wvConsentDescription'", WebView.class);
        partnerConsentActivity.viewHide = onStart.IconCompatParcelizer(view, R.id.activity_partner_consent_placeholder, "field 'viewHide'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_allow, "method 'onAllowClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PartnerConsentActivity.this.onAllowClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_deny, "method 'onDenyClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PartnerConsentActivity.this.onDenyClick();
            }
        });
    }

    public final void read() {
        PartnerConsentActivity partnerConsentActivity = this.IconCompatParcelizer;
        if (partnerConsentActivity != null) {
            this.IconCompatParcelizer = null;
            partnerConsentActivity.imgIcon = null;
            partnerConsentActivity.tvConsentDescription = null;
            partnerConsentActivity.wvConsentDescription = null;
            partnerConsentActivity.viewHide = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

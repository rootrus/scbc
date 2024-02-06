package com.scb.phone.view.activity.thirdparty;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ThirdPartyConsentFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private ThirdPartyConsentFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public ThirdPartyConsentFragment_ViewBinding(final ThirdPartyConsentFragment thirdPartyConsentFragment, View view) {
        super(thirdPartyConsentFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = thirdPartyConsentFragment;
        thirdPartyConsentFragment.imgIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_consent_icon, "field 'imgIcon'", ImageView.class);
        thirdPartyConsentFragment.tvConsentDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_consent_detail, "field 'tvConsentDetail'", TextView.class);
        thirdPartyConsentFragment.wvConsentDescription = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_consent_detail, "field 'wvConsentDescription'", WebView.class);
        thirdPartyConsentFragment.viewHide = onStart.IconCompatParcelizer(view, R.id.fragment_partner_consent_placeholder, "field 'viewHide'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_allow, "method 'onAllowClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ThirdPartyConsentFragment.this.onAllowClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_deny, "method 'onDenyClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ThirdPartyConsentFragment.this.onDenyClick();
            }
        });
    }

    public final void read() {
        ThirdPartyConsentFragment thirdPartyConsentFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (thirdPartyConsentFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            thirdPartyConsentFragment.imgIcon = null;
            thirdPartyConsentFragment.tvConsentDetail = null;
            thirdPartyConsentFragment.wvConsentDescription = null;
            thirdPartyConsentFragment.viewHide = null;
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

package com.scb.phone.view.activity.common;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;

public final class ThirdPartyWebActivity extends BaseActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private final String MediaBrowserCompat$SearchResultReceiver = "http://easyjs.com.s3-website-ap-southeast-1.amazonaws.com/webview.html";

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().putExtra("THIRD_PARTY_URL", this.MediaBrowserCompat$SearchResultReceiver);
        setContentView(R.layout.f80092131493234);
    }
}

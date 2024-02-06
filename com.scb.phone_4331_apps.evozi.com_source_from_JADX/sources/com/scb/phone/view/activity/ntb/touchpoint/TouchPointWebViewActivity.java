package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;

public final class TouchPointWebViewActivity extends BaseActivity {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    @BindView
    public WebView webView;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            Intent putExtra = new Intent(context, TouchPointWebViewActivity.class).putExtra("EXTRA_URL", str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi….putExtra(EXTRA_URL, url)");
            return putExtra;
        }
    }

    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.f80162131493241);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.auto_touchpoints_find_scb_easy_id);
        setTabContainer();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("EXTRA_URL")) != null) {
            WebView webView2 = this.webView;
            if (webView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("webView");
            }
            WebViewAsp.aspectOf();
            try {
                Context context = webView2.getContext();
                new onRotateClicked();
                String write2 = onRotateClicked.write(stringExtra);
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
                sb.append(write2);
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                webView2.loadUrl(write2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

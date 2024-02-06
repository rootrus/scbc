package com.scb.phone.view.activity.etb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onRotateClicked;
import p040o.verifyReferral;

public class PdfViewerActivity extends BaseActivity implements verifyReferral.write {
    @BindView
    WebView webView;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79232131493148);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setBuiltInZoomControls(true);
        this.webView.getSettings().setDisplayZoomControls(false);
        this.webView.setWebViewClient(new verifyReferral(this));
        this.webView.clearCache(true);
        this.webView.clearHistory();
        String stringExtra = getIntent().getStringExtra("com.scb.phone.view.activity.etb.EXTRA_HEADER");
        String stringExtra2 = getIntent().getStringExtra("com.scb.phone.view.activity.etb.EXTRA_URL");
        MediaSessionCompat$QueueItem(stringExtra);
        StringBuilder sb = new StringBuilder();
        sb.append("http://docs.google.com/viewer?embedded=true&url=");
        sb.append(stringExtra2);
        String obj = sb.toString();
        WebView webView2 = this.webView;
        WebViewAsp.aspectOf();
        try {
            Context context = webView2.getContext();
            new onRotateClicked();
            String write = onRotateClicked.write(obj);
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb2.append(write);
            sb2.append("\n with context ");
            sb2.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
            webView2.loadUrl(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }
}

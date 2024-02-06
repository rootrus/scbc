package com.scb.phone.view.activity.investment.discover;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StartJob;
import p040o.getMicrAmount;
import p040o.onRotateClicked;
import p040o.setRequestDomain;

public class DiscoverFundPerformanceActivity extends BaseActivity implements getMicrAmount.write {
    @HmlPinActivity
    public setRequestDomain discoverFundPerformancePresenter;
    @BindView
    WebView webView;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77442131492969);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.fund_performance);
        this.discoverFundPerformancePresenter.MediaBrowserCompat$ItemReceiver(this);
        setRequestDomain setrequestdomain = this.discoverFundPerformancePresenter;
        StartJob startJob = new StartJob(getIntent().getStringExtra("com.scb.phone.EXTRA_URL"));
        if (setrequestdomain.RatingCompat != null) {
            startJob.IconCompatParcelizer(setrequestdomain.RatingCompat);
        }
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                DiscoverFundPerformanceActivity.this.Keep();
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                DiscoverFundPerformanceActivity.this.ay_();
            }
        });
        this.webView.clearCache(true);
        this.webView.clearHistory();
        this.webView.getSettings().setJavaScriptEnabled(true);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.fund_performance);
    }

    public final void IconCompatParcelizer(String str) {
        WebView webView2 = this.webView;
        WebViewAsp.aspectOf();
        try {
            Context context = webView2.getContext();
            new onRotateClicked();
            String write = onRotateClicked.write(str);
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb.append(write);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            webView2.loadUrl(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        this.discoverFundPerformancePresenter.onDestroy();
        super.onDestroy();
    }
}

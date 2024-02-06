package com.scb.phone.view.activity.justforyou;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class JustForYouLandingActivity$MediaBrowserCompat$ItemReceiver extends WebViewClient {
    private /* synthetic */ JustForYouLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    JustForYouLandingActivity$MediaBrowserCompat$ItemReceiver(JustForYouLandingActivity justForYouLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = justForYouLandingActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        JustForYouLandingActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem();
        super.onPageFinished(webView, str);
    }
}

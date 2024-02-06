package com.thunderhead;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;

class WebViewActivity$MediaBrowserCompat$CustomActionResultReceiver extends WebViewClient {
    private /* synthetic */ WebViewActivity write;

    private WebViewActivity$MediaBrowserCompat$CustomActionResultReceiver(WebViewActivity webViewActivity) {
        this.write = webViewActivity;
    }

    /* synthetic */ WebViewActivity$MediaBrowserCompat$CustomActionResultReceiver(WebViewActivity webViewActivity, byte b) {
        this(webViewActivity);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewActivity.read(this.write);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.write.f3104x50fd9e4a.getProgress() > 80) {
            this.write.MediaSessionCompat$QueueItem.setText(webView.getTitle());
            this.write.MediaDescriptionCompat.setVisibility(0);
            this.write.MediaDescriptionCompat.setText(read(str));
            this.write.MediaBrowserCompat$ItemReceiver();
            WebViewActivity webViewActivity = this.write;
            Timer timer = webViewActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (timer != null) {
                timer.cancel();
                webViewActivity.MediaBrowserCompat$CustomActionResultReceiver = null;
                webViewActivity.IconCompatParcelizer.setVisibility(8);
            }
        }
        this.write.IconCompatParcelizer.setProgress(webView.getProgress());
    }

    private static String read(String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            url = null;
        }
        if (url != null) {
            return url.getHost().replace("www.", "");
        }
        return "";
    }
}

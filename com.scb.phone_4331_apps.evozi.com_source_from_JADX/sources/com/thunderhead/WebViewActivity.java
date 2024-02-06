package com.thunderhead;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import p040o.C1188xc0532a8d;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

public class WebViewActivity extends Activity {
    /* access modifiers changed from: package-private */
    public ProgressBar IconCompatParcelizer;
    Timer MediaBrowserCompat$CustomActionResultReceiver;
    private ImageView MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem = "";
    private TimerTask MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public WebView f3104x50fd9e4a;
    /* access modifiers changed from: private */
    public TextView MediaDescriptionCompat;
    private ImageView MediaMetadataCompat;
    /* access modifiers changed from: private */
    public TextView MediaSessionCompat$QueueItem;
    private boolean RatingCompat = true;
    final Handler read = new Handler();
    private ActionBar write;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6554xc460715d.th_activity_web_view);
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_in, C1188xc0532a8d.th_animation_activity_empty);
        this.IconCompatParcelizer = (ProgressBar) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_progress_bar);
        this.MediaBrowserCompat$MediaItem = getIntent().getStringExtra("TARGET_URL");
        ActionBar actionBar = getActionBar();
        this.write = actionBar;
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(false);
            this.write.setDisplayShowTitleEnabled(false);
            View inflate = LayoutInflater.from(this).inflate(C6554xc460715d.th_action_bar_web_view_layout, (ViewGroup) null);
            this.MediaSessionCompat$QueueItem = (TextView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_title);
            this.MediaDescriptionCompat = (TextView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_domain);
            this.MediaBrowserCompat$ItemReceiver = (ImageView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_btn_back);
            this.MediaMetadataCompat = (ImageView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_btn_forward);
            this.MediaSessionCompat$QueueItem.setText(getString(C6555xdccae8ee.th_loading_label));
            this.MediaBrowserCompat$ItemReceiver.setVisibility(8);
            this.MediaMetadataCompat.setVisibility(8);
            inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_btn_forward).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (WebViewActivity.this.f3104x50fd9e4a.canGoForward()) {
                        WebViewActivity.this.f3104x50fd9e4a.goForward();
                        WebViewActivity.this.MediaBrowserCompat$ItemReceiver();
                    }
                }
            });
            inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view_btn_back).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (WebViewActivity.this.f3104x50fd9e4a.canGoBack()) {
                        WebViewActivity.this.f3104x50fd9e4a.goBack();
                        WebViewActivity.this.MediaBrowserCompat$ItemReceiver();
                    }
                }
            });
            this.write.setCustomView(inflate);
            this.write.setDisplayShowCustomEnabled(true);
        }
        WebView webView = (WebView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.web_view);
        this.f3104x50fd9e4a = webView;
        webView.setWebViewClient(new WebViewActivity$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
        this.f3104x50fd9e4a.getSettings().setJavaScriptEnabled(true);
        this.f3104x50fd9e4a.getSettings().setDomStorageEnabled(true);
        this.f3104x50fd9e4a.getSettings().setSupportZoom(true);
        this.f3104x50fd9e4a.loadUrl(this.MediaBrowserCompat$MediaItem);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.f3104x50fd9e4a.canGoBack() || !this.RatingCompat) {
            finish();
            overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_animation_activity_out);
            return true;
        }
        this.f3104x50fd9e4a.goBack();
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.f3104x50fd9e4a.canGoBack() || this.f3104x50fd9e4a.canGoForward()) {
            this.MediaBrowserCompat$ItemReceiver.setVisibility(0);
            this.MediaMetadataCompat.setVisibility(0);
            if (!this.f3104x50fd9e4a.canGoBack()) {
                this.MediaBrowserCompat$ItemReceiver.setAlpha(0.5f);
            } else {
                this.MediaBrowserCompat$ItemReceiver.setAlpha(1.0f);
            }
            if (!this.f3104x50fd9e4a.canGoForward()) {
                this.MediaMetadataCompat.setAlpha(0.5f);
            } else {
                this.MediaMetadataCompat.setAlpha(1.0f);
            }
        } else {
            this.MediaBrowserCompat$ItemReceiver.setVisibility(8);
            this.MediaMetadataCompat.setVisibility(8);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat.th_menu_web_view, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.action_share) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.f3104x50fd9e4a.getTitle());
            intent.putExtra("android.intent.extra.TEXT", this.f3104x50fd9e4a.getUrl());
            startActivity(Intent.createChooser(intent, getString(C6555xdccae8ee.th_share_label)));
        } else if (itemId == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.action_close) {
            finish();
            overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_animation_activity_out);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    static /* synthetic */ void read(WebViewActivity webViewActivity) {
        webViewActivity.MediaBrowserCompat$CustomActionResultReceiver = new Timer();
        C62205 r2 = new TimerTask() {
            public final void run() {
                WebViewActivity.this.read.post(new Runnable() {
                    public final void run() {
                        WebViewActivity.this.IconCompatParcelizer.setProgress(WebViewActivity.this.f3104x50fd9e4a.getProgress());
                    }
                });
            }
        };
        webViewActivity.MediaBrowserCompat$SearchResultReceiver = r2;
        webViewActivity.MediaBrowserCompat$CustomActionResultReceiver.schedule(r2, 500, 500);
        webViewActivity.IconCompatParcelizer.setVisibility(0);
    }
}

package com.scb.phone.view.activity.privacypolicy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;

public final class ScbPrivacyPolicyActivity extends BaseActivity {
    public static final ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private final HmlVerifyEmailActivity Keep;
    /* access modifiers changed from: private */
    public final String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final String MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final String MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final String MediaSessionCompat$ResultReceiverWrapper = "javascript:";
    /* access modifiers changed from: private */
    public final String MediaSessionCompat$Token;
    private final String PlaybackStateCompat = "style.display='none'";
    @BindView
    public WebView wvPrivacyPolicy;

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2) {
        return ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver.read(context, str, str2);
    }

    public ScbPrivacyPolicyActivity() {
        StringBuilder sb = new StringBuilder();
        sb.append("document.getElementsByClassName('inner-header')[0].");
        sb.append(this.PlaybackStateCompat);
        sb.append(';');
        this.MediaMetadataCompat = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("document.getElementsByClassName('breadcrumb-outer')[0].");
        sb2.append(this.PlaybackStateCompat);
        sb2.append(';');
        this.MediaDescriptionCompat = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("document.getElementsByTagName('footer')[0].");
        sb3.append(this.PlaybackStateCompat);
        sb3.append(';');
        this.MediaBrowserCompat$SearchResultReceiver = sb3.toString();
        this.MediaSessionCompat$Token = "$('.responsivegrid').css('padding-top','0px')";
        FundActionsSuccessActivity write2 = new write(this);
        onGetStartedClick.write((Object) write2, "initializer");
        this.Keep = new HmlVerifyPhoneTermsConditionsActivity(write2);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79442131493169);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        String stringExtra = getIntent().getStringExtra("EXTRA_URL");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(EXTRA_URL)");
        WebView webView = this.wvPrivacyPolicy;
        if (webView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("wvPrivacyPolicy");
        }
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new read(this));
        WebSettings settings = webView.getSettings();
        onGetStartedClick.IconCompatParcelizer((Object) settings, "this.settings");
        settings.setJavaScriptEnabled(true);
        WebViewAsp.aspectOf();
        try {
            Context context = webView.getContext();
            new onRotateClicked();
            String write2 = onRotateClicked.write(stringExtra);
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb.append(write2);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            webView.loadUrl(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str = (String) this.Keep.MediaBrowserCompat$CustomActionResultReceiver();
        if (str != null) {
            MediaSessionCompat$QueueItem(str);
        } else {
            setTitle(R.string.auto_privacy_notice_title);
        }
    }

    public static final class read extends WebViewClient {
        private /* synthetic */ ScbPrivacyPolicyActivity MediaBrowserCompat$CustomActionResultReceiver;

        read(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = scbPrivacyPolicyActivity;
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            if (webView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat);
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token);
                webView.evaluateJavascript(sb.toString(), (ValueCallback) null);
            }
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93002131558402, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != R.id.menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<String> {
        private /* synthetic */ ScbPrivacyPolicyActivity MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = scbPrivacyPolicyActivity;
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.MediaBrowserCompat$CustomActionResultReceiver.getIntent();
            if (intent != null) {
                return intent.getStringExtra("EXTRA_TITLE");
            }
            return null;
        }
    }

    public static final Intent read(Context context, String str) {
        return ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver.read(context, str, (String) null);
    }
}

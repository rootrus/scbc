package com.scb.phone.view.activity.thirdparty;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.C4131c;
import p040o.CheckWorkflowActivity;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindECouponSaveSlipFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getEndedAt;
import p040o.getStartedAt;
import p040o.onRotateClicked;
import p040o.setTapText;
import p040o.zzmd;

public class ThirdPartyConsentActivity extends BaseActivity implements C5717xdc309df8, CheckWorkflowActivity {
    private String MediaBrowserCompat$MediaItem;
    private ThirdPartyConsentFragment MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public C4131c.C41333 partnerConsentPresenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, ThirdPartyConsentActivity.class);
        intent.putExtra("third_party_application_id", str);
        intent.putExtra("third_party_transaction_id", str2);
        intent.putExtra("third_party_callback_url", str3);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80082131493233);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.partnerConsentPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem("");
        setTabContainer();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.MediaBrowserCompat$SearchResultReceiver = ThirdPartyConsentFragment.IconCompatParcelizer();
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaBrowserCompat$SearchResultReceiver).write();
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this;
            this.MediaBrowserCompat$MediaItem = extras.getString("third_party_transaction_id", (String) null);
            this.partnerConsentPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, extras.getString("third_party_callback_url", (String) null));
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem("");
        setTabContainer();
    }

    public final void write(String str) {
        ThirdPartyConsentFragment thirdPartyConsentFragment = this.MediaBrowserCompat$SearchResultReceiver;
        thirdPartyConsentFragment.viewHide.setVisibility(8);
        thirdPartyConsentFragment.wvConsentDescription.setVisibility(0);
        thirdPartyConsentFragment.wvConsentDescription.setWebChromeClient(new WebChromeClient());
        thirdPartyConsentFragment.wvConsentDescription.setWebViewClient(new WebViewClient() {
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                new FragmentBuilder_BindECouponSaveSlipFragment().MediaBrowserCompat$CustomActionResultReceiver(ThirdPartyConsentFragment.this.getContext(), sslErrorHandler);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewAsp.aspectOf();
                try {
                    Context context = webView.getContext();
                    new onRotateClicked();
                    String write2 = onRotateClicked.write(str);
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
                    sb.append(write2);
                    sb.append("\n with context ");
                    sb.append(context.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                    webView.loadUrl(write2);
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return true;
                }
            }

            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                ThirdPartyConsentFragment.this.Keep();
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                ThirdPartyConsentFragment.this.ay_();
            }
        });
        thirdPartyConsentFragment.wvConsentDescription.getSettings().setJavaScriptEnabled(true);
        thirdPartyConsentFragment.wvConsentDescription.getSettings().setDomStorageEnabled(true);
        thirdPartyConsentFragment.wvConsentDescription.clearCache(true);
        thirdPartyConsentFragment.wvConsentDescription.clearHistory();
        WebView webView = thirdPartyConsentFragment.wvConsentDescription;
        WebViewAsp.aspectOf();
        ThirdPartyConsentFragment.read(webView, str);
        thirdPartyConsentFragment.wvConsentDescription.getSettings().setDomStorageEnabled(true);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(getBaseContext(), str, str2);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            finish();
        } catch (ActivityNotFoundException | NullPointerException unused) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if ("facebook.payment".equals(this.partnerConsentPresenter.IconCompatParcelizer)) {
            Intent write = FacebookConsentDeepLinkActivity.write(this, "user_cancel", (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) null);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, write).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            Intent intent = new Intent(this, SplashActivity.class);
            intent.addFlags(268468224);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                startActivity(read2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            finishAffinity();
        }
    }

    public void onBackPressed() {
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaSessionCompat$QueueItem() {
        this.partnerConsentPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, zzmd.zzk.zza.DENY_ACTION);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo34354x50fd9e4a() {
        this.partnerConsentPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, zzmd.zzk.zza.ALLOW_ACTION);
    }

    public final void read(getStartedAt getstartedat) {
        getEndedAt getendedat = getstartedat.MediaBrowserCompat$CustomActionResultReceiver;
        if (getendedat != null) {
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(getendedat.MediaBrowserCompat$ItemReceiver, getstartedat.read);
        }
    }
}

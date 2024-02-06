package com.scb.phone.view.activity.justforyou;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomViewProgressAnimationFull;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.FragmentBuilder_BindEasycashLandingFragment;
import p040o.GoodToKnowActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class JustForYouLandingActivity extends BaseActivity implements FragmentBuilder_BindEasycashLandingFragment {
    public static final C5657x1df7ecb1 MediaMetadataCompat = new C5657x1df7ecb1((byte) 0);
    @BindView
    public CustomViewProgressAnimationFull customLoading;
    @BindView
    public SCBWebView webViewJustForYou;

    /* renamed from: O_ */
    public final /* synthetic */ Boolean mo14724O_() {
        return null;
    }

    public final /* synthetic */ Integer ar_() {
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78502131493075);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.just_for_you_landing_title);
        setTabContainer();
        CustomViewProgressAnimationFull customViewProgressAnimationFull = this.customLoading;
        if (customViewProgressAnimationFull == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customLoading");
        }
        customViewProgressAnimationFull.setVisibility(0);
        SCBWebView sCBWebView = this.webViewJustForYou;
        if (sCBWebView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("webViewJustForYou");
        }
        sCBWebView.setAdvanceWebView(this);
        SCBWebView sCBWebView2 = this.webViewJustForYou;
        if (sCBWebView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("webViewJustForYou");
        }
        sCBWebView2.addJavascriptInterface(new read(), "androidwebview");
        SCBWebView sCBWebView3 = this.webViewJustForYou;
        if (sCBWebView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("webViewJustForYou");
        }
        WebSettings settings = sCBWebView3.getSettings();
        onGetStartedClick.IconCompatParcelizer((Object) settings, "webViewJustForYou.settings");
        settings.setMixedContentMode(2);
        SCBWebView sCBWebView4 = this.webViewJustForYou;
        if (sCBWebView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("webViewJustForYou");
        }
        WebSettings settings2 = sCBWebView4.getSettings();
        onGetStartedClick.IconCompatParcelizer((Object) settings2, "webViewJustForYou.settings");
        settings2.setTextZoom(100);
        SCBWebView sCBWebView5 = this.webViewJustForYou;
        if (sCBWebView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("webViewJustForYou");
        }
        sCBWebView5.setWebViewClient(new JustForYouLandingActivity$MediaBrowserCompat$ItemReceiver(this));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("URI");
        if (!(parcelableExtra instanceof Uri)) {
            parcelableExtra = null;
        }
        Uri uri = (Uri) parcelableExtra;
        if (uri != null) {
            SCBWebView sCBWebView6 = this.webViewJustForYou;
            if (sCBWebView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("webViewJustForYou");
            }
            String obj = uri.toString();
            if (obj != null) {
                WebViewAsp.aspectOf();
                SCBWebView.MediaBrowserCompat$ItemReceiver(sCBWebView6, obj);
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.just_for_you_landing_title);
        setTabContainer();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        MediaSessionCompat$Token();
        return true;
    }

    /* access modifiers changed from: private */
    public final void MediaSessionCompat$QueueItem() {
        CustomViewProgressAnimationFull customViewProgressAnimationFull = this.customLoading;
        if (customViewProgressAnimationFull == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customLoading");
        }
        customViewProgressAnimationFull.setVisibility(8);
        CustomViewProgressAnimationFull customViewProgressAnimationFull2 = this.customLoading;
        if (customViewProgressAnimationFull2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customLoading");
        }
        customViewProgressAnimationFull2.IconCompatParcelizer.cancel();
    }

    public final void onBackPressed() {
        MediaSessionCompat$Token();
    }

    private final void MediaSessionCompat$Token() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("scbeasy://lifestylelanding"));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onDestroy() {
        MediaSessionCompat$QueueItem();
        super.onDestroy();
    }

    public final class read {
        public read() {
        }

        @JavascriptInterface
        public final void openDeepLink(String str) {
            onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (!GoodToKnowActivity.read(str)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(603979776);
                    JustForYouLandingActivity justForYouLandingActivity = JustForYouLandingActivity.this;
                    IntentTidInjectionContextAspect.aspectOf();
                    try {
                        Intent read = setTapText.write(justForYouLandingActivity, intent).read();
                        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                        sb.append(read.getData());
                        sb.append("\n with context ");
                        sb.append(justForYouLandingActivity.hashCode());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                        justForYouLandingActivity.startActivity(read);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Exception e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                }
            }
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(JustForYouLandingActivity justForYouLandingActivity) {
        Toolbar toolbar = justForYouLandingActivity.mToolbar;
        if (toolbar != null) {
            toolbar.setVisibility(8);
        }
    }
}

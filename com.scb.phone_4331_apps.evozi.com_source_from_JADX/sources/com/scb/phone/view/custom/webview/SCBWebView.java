package com.scb.phone.view.custom.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesMHMCInformationFragment;
import p040o.FragmentBuilder_BindEasycashInputIncomeFragment;
import p040o.FragmentBuilder_BindEasycashLandingEmptyFragment;
import p040o.FragmentBuilder_BindEasycashLandingFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Objects;
import p040o.PooledExecutorsProvider;
import p040o.asFunction;
import p040o.checkArgument;
import p040o.createBooleanArray;
import p040o.createBooleanList;
import p040o.createByteArray;
import p040o.descendingIterator;
import p040o.dq$MediaBrowserCompat$ItemReceiver;
import p040o.getCause;
import p040o.getLongFlagValue;
import p040o.intern;
import p040o.isScrollGesturesEnabled;
import p040o.isScrollGesturesEnabledDuringRotateOrZoom;
import p040o.newWeakInterner;
import p040o.onFrontImageProcessed;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;
import p040o.setCompassEnabled;
import p040o.setLastBaselineToBottomHeight;
import p040o.zabr;
import p040o.zzh;
import p040o.zzk;

public final class SCBWebView extends WebView {
    public SCBWebView(Context context) {
        this(context, (byte) 0);
    }

    private /* synthetic */ SCBWebView(Context context, byte b) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCBWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCBWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(WebView webView, String str) {
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
            ((SCBWebView) webView).loadUrl(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "content");
        CharSequence charSequence = str2;
        String str3 = charSequence == null || charSequence.length() == 0 ? str : null;
        if (str3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
            sb.append(str2);
            sb.append("\"/>");
            sb.append(str);
            str3 = sb.toString();
        }
        loadDataWithBaseURL("file:///android_asset/", str3, "text/html", "utf-8", (String) null);
    }

    public final void setAdvanceWebView(FragmentBuilder_BindEasycashLandingFragment fragmentBuilder_BindEasycashLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindEasycashLandingFragment, "webViewConfig");
        setWebChromeClient(new WebChromeClient());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        Integer ar_ = fragmentBuilder_BindEasycashLandingFragment.ar_();
        if (ar_ != null) {
            settings.setTextZoom(ar_.intValue());
        }
        Boolean O_ = fragmentBuilder_BindEasycashLandingFragment.mo14724O_();
        if (O_ != null) {
            clearCache(O_.booleanValue());
            clearHistory();
        }
    }

    public final void setJavascriptInterface(FragmentBuilder_BindEasycashFeaturesMHMCInformationFragment fragmentBuilder_BindEasycashFeaturesMHMCInformationFragment, String str) {
        onGetStartedClick.write((Object) fragmentBuilder_BindEasycashFeaturesMHMCInformationFragment, "javaScriptCallbacks");
        onGetStartedClick.write((Object) str, "javaScripName");
        addJavascriptInterface(new FragmentBuilder_BindEasycashInputIncomeFragment(fragmentBuilder_BindEasycashFeaturesMHMCInformationFragment), str);
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(SCBWebView sCBWebView, FragmentBuilder_BindEasycashLandingEmptyFragment fragmentBuilder_BindEasycashLandingEmptyFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindEasycashLandingEmptyFragment, "webViewScriptConfig");
        onGetStartedClick.write((Object) "", "data");
        sCBWebView.post(new SCBWebView$MediaBrowserCompat$ItemReceiver(sCBWebView, "", fragmentBuilder_BindEasycashLandingEmptyFragment));
    }

    public final void setWebViewBackgroundColor(int i) {
        setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public static final class write implements onFrontImageProcessed {
        private final getCause IconCompatParcelizer;
        private final zzk MediaBrowserCompat$CustomActionResultReceiver;
        private final dq$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
        private final zzh read;
        private final String write;

        private write() {
        }

        @HmlPinActivity
        public write(String str, dq$MediaBrowserCompat$ItemReceiver dq_mediabrowsercompat_itemreceiver, zzk zzk, zzh zzh, getCause getcause) {
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = dq_mediabrowsercompat_itemreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzk;
            this.read = zzh;
            this.IconCompatParcelizer = getcause;
        }

        public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$ItemReceiver.write.acceptCardlessTnc().flatMap(createBooleanArray.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(asFunction asfunction) {
            return this.MediaBrowserCompat$ItemReceiver.write.getCancelWithdraw(asfunction).flatMap(createByteArray.IconCompatParcelizer);
        }

        public final DebitCardResetOtpActivity<isScrollGesturesEnabledDuringRotateOrZoom> write() {
            return this.MediaBrowserCompat$ItemReceiver.write.getCardlessInfo().map(descendingIterator.read).map(new getLongFlagValue(this.read));
        }

        public final DebitCardResetOtpActivity<isScrollGesturesEnabled> read(newWeakInterner newweakinterner) {
            return this.MediaBrowserCompat$ItemReceiver.write.getConfirmation(newweakinterner).map(checkArgument.read).map(new Objects(this.IconCompatParcelizer));
        }

        public final DebitCardResetOtpActivity<setCompassEnabled> write(intern intern) {
            intern.MediaBrowserCompat$SearchResultReceiver = this.write;
            zabr.IconCompatParcelizer("3014");
            return this.MediaBrowserCompat$ItemReceiver.write.getVerification(intern).map(new createBooleanList(this)).doFinally(PooledExecutorsProvider.MediaBrowserCompat$ItemReceiver);
        }
    }
}

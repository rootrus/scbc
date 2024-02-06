package com.scb.phone.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import okhttp3.Response;
import p040o.FragmentBuilder_BindECouponSaveSlipFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getSessionDeviceSize;
import p040o.onGetStartedClick;
import p040o.setTapText;

/* renamed from: com.scb.phone.view.fragment.TermsAndConditionsFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5845x5eaa0ec5 extends WebViewClient {
    private /* synthetic */ TermsAndConditionsFragment IconCompatParcelizer;

    C5845x5eaa0ec5(TermsAndConditionsFragment termsAndConditionsFragment) {
        this.IconCompatParcelizer = termsAndConditionsFragment;
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            FragmentBuilder_BindECouponSaveSlipFragment fragmentBuilder_BindECouponSaveSlipFragment = new FragmentBuilder_BindECouponSaveSlipFragment();
            Context context = this.IconCompatParcelizer.getContext();
            if (context == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            onGetStartedClick.IconCompatParcelizer((Object) context, "context!!");
            fragmentBuilder_BindECouponSaveSlipFragment.MediaBrowserCompat$CustomActionResultReceiver(context, sslErrorHandler);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return null;
        }
        TermsAndConditionsFragment termsAndConditionsFragment = this.IconCompatParcelizer;
        String obj = url.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "it.toString()");
        return termsAndConditionsFragment.read(obj);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str != null) {
            return this.IconCompatParcelizer.read(str);
        }
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (valueOf.length() > 0) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(valueOf));
            TermsAndConditionsFragment termsAndConditionsFragment = this.IconCompatParcelizer;
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = termsAndConditionsFragment.getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                termsAndConditionsFragment.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            TermsAndConditionsFragment termsAndConditionsFragment = this.IconCompatParcelizer;
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = termsAndConditionsFragment.getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                termsAndConditionsFragment.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return true;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        TermsAndConditionsFragment.read(this.IconCompatParcelizer, false);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        TermsAndConditionsFragment termsAndConditionsFragment = this.IconCompatParcelizer;
        Dialog dialog = termsAndConditionsFragment.write;
        if (dialog != null && dialog.isShowing()) {
            termsAndConditionsFragment.write.dismiss();
            termsAndConditionsFragment.write = null;
        }
        Response MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.RatingCompat;
        if (MediaBrowserCompat$ItemReceiver != null) {
            if (MediaBrowserCompat$ItemReceiver.code() >= 400) {
                getSessionDeviceSize getsessiondevicesize = this.IconCompatParcelizer.presenter;
                if (getsessiondevicesize == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                getsessiondevicesize.IconCompatParcelizer();
            } else {
                TermsAndConditionsFragment.read(this.IconCompatParcelizer, true);
            }
        }
        getSessionDeviceSize getsessiondevicesize2 = this.IconCompatParcelizer.presenter;
        if (getsessiondevicesize2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getsessiondevicesize2.write()) {
            TermsAndConditionsFragment.read(this.IconCompatParcelizer, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r2.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
        /*
            r0 = this;
            super.onReceivedHttpError(r1, r2, r3)
            com.scb.phone.view.fragment.TermsAndConditionsFragment r1 = r0.IconCompatParcelizer
            if (r2 == 0) goto L_0x0012
            android.net.Uri r2 = r2.getUrl()
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = r2.toString()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            com.scb.phone.view.fragment.TermsAndConditionsFragment.write(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.C5845x5eaa0ec5.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r2.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceivedError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceError r3) {
        /*
            r0 = this;
            super.onReceivedError(r1, r2, r3)
            com.scb.phone.view.fragment.TermsAndConditionsFragment r1 = r0.IconCompatParcelizer
            if (r2 == 0) goto L_0x0012
            android.net.Uri r2 = r2.getUrl()
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = r2.toString()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            com.scb.phone.view.fragment.TermsAndConditionsFragment.write(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.C5845x5eaa0ec5.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }
}

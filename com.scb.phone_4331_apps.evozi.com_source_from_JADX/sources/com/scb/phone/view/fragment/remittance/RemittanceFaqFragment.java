package com.scb.phone.view.fragment.remittance;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.remittance.RemittanceFaqActivity;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.WebViewAsp;
import okhttp3.Response;
import p040o.C5002nG;
import p040o.CharStreams;
import p040o.FragmentBuilder_BindEasycashLandingFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.LocalProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QueueFile;
import p040o.getICheckDeserializerRtti;
import p040o.nG$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;
import p040o.writeUInt64NoTag;

public final class RemittanceFaqFragment extends BaseFragment implements LocalProjectProvider.C69342 {
    public static final C6151x7239bb75 MediaBrowserCompat$CustomActionResultReceiver = new C6151x7239bb75((byte) 0);
    /* access modifiers changed from: private */
    public Response IconCompatParcelizer;
    @BindView
    public SCBWebView faqWebView;
    @HmlPinActivity
    public C5002nG presenter;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f89402131494167, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver(this, view);
        C5002nG nGVar = this.presenter;
        if (nGVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nGVar.MediaBrowserCompat$ItemReceiver(this);
        C5002nG nGVar2 = this.presenter;
        if (nGVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CharStreams.C31734 r4 = nGVar2.write;
        onGetStartedClick.write((Object) "v1/staticcontents/faq/remittance/latest", "path");
        String read2 = getICheckDeserializerRtti.read("v1/staticcontents/faq/remittance/latest", r4.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "Utilities.transformAssetUrl(path, baseStaticURL)");
        writeUInt64NoTag.IconCompatParcelizer ng_mediabrowsercompat_customactionresultreceiver = new nG$MediaBrowserCompat$CustomActionResultReceiver(read2);
        if (nGVar2.RatingCompat != null) {
            ng_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(nGVar2.RatingCompat);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        SCBWebView sCBWebView = this.faqWebView;
        if (sCBWebView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("faqWebView");
        }
        sCBWebView.setWebViewBackgroundColor(R.color.f70982131100254);
        sCBWebView.setAdvanceWebView(new read());
        sCBWebView.setWebViewClient(new write(this));
        WebViewAsp.aspectOf();
        try {
            Context context = sCBWebView.getContext();
            new onRotateClicked();
            String write2 = onRotateClicked.write(str);
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb.append(write2);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            sCBWebView.loadUrl(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final class read implements FragmentBuilder_BindEasycashLandingFragment {
        public final /* synthetic */ Integer ar_() {
            return null;
        }

        read() {
        }

        /* renamed from: O_ */
        public final Boolean mo14724O_() {
            return Boolean.TRUE;
        }
    }

    public static final class write extends WebViewClient {
        private /* synthetic */ RemittanceFaqFragment write;

        write(RemittanceFaqFragment remittanceFaqFragment) {
            this.write = remittanceFaqFragment;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                return null;
            }
            RemittanceFaqFragment remittanceFaqFragment = this.write;
            String obj = url.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "it.toString()");
            return RemittanceFaqFragment.read(remittanceFaqFragment, obj);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.write.write(new QueueFile());
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            RemittanceFaqFragment remittanceFaqFragment = this.write;
            Dialog dialog = remittanceFaqFragment.write;
            if (dialog != null && dialog.isShowing()) {
                remittanceFaqFragment.write.dismiss();
                remittanceFaqFragment.write = null;
            }
            Response MediaBrowserCompat$ItemReceiver = this.write.IconCompatParcelizer;
            if (MediaBrowserCompat$ItemReceiver != null && MediaBrowserCompat$ItemReceiver.code() >= 400) {
                C5002nG nGVar = this.write.presenter;
                if (nGVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                nGVar.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C5002nG.write(nGVar));
            }
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            RemittanceFaqFragment remittanceFaqFragment = this.write;
            Dialog dialog = remittanceFaqFragment.write;
            if (dialog != null && dialog.isShowing()) {
                remittanceFaqFragment.write.dismiss();
                remittanceFaqFragment.write = null;
            }
            C5002nG nGVar = this.write.presenter;
            if (nGVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nGVar.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C5002nG.write(nGVar));
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            RemittanceFaqFragment remittanceFaqFragment = this.write;
            Dialog dialog = remittanceFaqFragment.write;
            if (dialog != null && dialog.isShowing()) {
                remittanceFaqFragment.write.dismiss();
                remittanceFaqFragment.write = null;
            }
            C5002nG nGVar = this.write.presenter;
            if (nGVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nGVar.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C5002nG.write(nGVar));
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            RemittanceFaqFragment remittanceFaqFragment = this.write;
            Dialog dialog = remittanceFaqFragment.write;
            if (dialog != null && dialog.isShowing()) {
                remittanceFaqFragment.write.dismiss();
                remittanceFaqFragment.write = null;
            }
            C5002nG nGVar = this.write.presenter;
            if (nGVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nGVar.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C5002nG.write(nGVar));
        }
    }

    public final void onDestroyView() {
        C5002nG nGVar = this.presenter;
        if (nGVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nGVar.onDestroy();
        super.onDestroyView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r4 = r5.body();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ android.webkit.WebResourceResponse read(com.scb.phone.view.fragment.remittance.RemittanceFaqFragment r4, java.lang.String r5) {
        /*
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            if (r5 == 0) goto L_0x005c
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r5 = p040o.GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(r5)
            java.lang.String r5 = r5.toString()
            okhttp3.Request$Builder r5 = r1.url((java.lang.String) r5)
            o.nG r1 = r4.presenter
            if (r1 != 0) goto L_0x0023
            java.lang.String r2 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0023:
            android.content.SharedPreferences r1 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = "th"
            java.lang.String r3 = "com.scb.phone.pref.key.LANGUAGE"
            java.lang.String r1 = r1.getString(r3, r2)
            if (r1 == 0) goto L_0x0030
            r2 = r1
        L_0x0030:
            java.lang.String r1 = "Accept-Language"
            okhttp3.Request$Builder r5 = r5.addHeader(r1, r2)
            okhttp3.Request r5 = r5.build()
            okhttp3.Call r5 = r0.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            r4.IconCompatParcelizer = r5
            if (r5 == 0) goto L_0x0051
            okhttp3.ResponseBody r4 = r5.body()
            if (r4 == 0) goto L_0x0051
            java.io.InputStream r4 = r4.byteStream()
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse
            java.lang.String r0 = "text/html"
            java.lang.String r1 = "utf-8"
            r5.<init>(r0, r1, r4)
            return r5
        L_0x005c:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.CharSequence"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceFaqFragment.read(com.scb.phone.view.fragment.remittance.RemittanceFaqFragment, java.lang.String):android.webkit.WebResourceResponse");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof RemittanceFaqActivity)) {
            activity = null;
        }
        RemittanceFaqActivity remittanceFaqActivity = (RemittanceFaqActivity) activity;
        if (remittanceFaqActivity != null) {
            remittanceFaqActivity.finish();
        }
    }
}

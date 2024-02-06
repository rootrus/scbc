package com.thunderhead.android.aspects;

import android.content.Context;
import android.webkit.WebView;
import java.util.Map;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onRotateClicked;

public class WebViewAsp {
    private static /* synthetic */ Throwable IconCompatParcelizer;
    /* access modifiers changed from: private */
    public static /* synthetic */ WebViewAsp read;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_WebViewAsp$1$1cbe026dproceed */
    static /* synthetic */ void m3027x3d0e8fb1(WebView webView, String str, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_WebViewAsp$2$6eb16362proceed */
    static /* synthetic */ void m3028xaa525b00(WebView webView, String str, Map map, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static WebViewAsp aspectOf() {
        WebViewAsp webViewAsp = read;
        if (webViewAsp != null) {
            return webViewAsp;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_WebViewAsp", IconCompatParcelizer);
    }

    public static boolean hasAspect() {
        return read != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcLoadDuo$200(WebView webView, String str, Map<String, String> map) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcLoadUno$189(WebView webView, String str) {
    }

    static {
        try {
            read = new WebViewAsp();
        } catch (Throwable th) {
            IconCompatParcelizer = th;
        }
    }

    WebViewAsp() {
    }

    public void ajc$around$com_thunderhead_android_aspects_WebViewAsp$1$1cbe026d(WebView webView, String str, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Context context = webView.getContext();
            new onRotateClicked();
            String write = onRotateClicked.write(str);
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb.append(write);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            m3027x3d0e8fb1(webView, write, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void ajc$around$com_thunderhead_android_aspects_WebViewAsp$2$6eb16362(WebView webView, String str, Map<String, String> map, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Context context = webView.getContext();
            new onRotateClicked();
            String write = onRotateClicked.write(str);
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String, Map<String, String>), modified: ");
            sb.append(write);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            m3028xaa525b00(webView, write, map, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

package com.scb.phone.view.fragment.webview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.C1596uc;
import p040o.C6511x9873a16a;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiJsonBill;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;

public abstract class BaseWebViewFragment<V extends C1596uc, T extends RttiJsonBill<V>, U extends C6511x9873a16a> extends BaseFragment implements C1596uc {
    public abstract WebView MediaBrowserCompat$CustomActionResultReceiver();

    public abstract String MediaBrowserCompat$ItemReceiver();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public abstract U write();

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        WebView MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        WebViewAsp.aspectOf();
        try {
            Context context = MediaBrowserCompat$CustomActionResultReceiver.getContext();
            new onRotateClicked();
            String write = onRotateClicked.write(str);
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb.append(write);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            MediaBrowserCompat$CustomActionResultReceiver.loadUrl(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        WebSettings settings = MediaBrowserCompat$CustomActionResultReceiver().getSettings();
        onGetStartedClick.IconCompatParcelizer((Object) settings, "getWebView().settings");
        settings.setJavaScriptEnabled(true);
        MediaBrowserCompat$CustomActionResultReceiver().addJavascriptInterface(write(), MediaBrowserCompat$ItemReceiver());
    }
}

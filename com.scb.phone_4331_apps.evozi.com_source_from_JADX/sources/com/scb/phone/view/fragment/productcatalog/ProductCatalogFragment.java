package com.scb.phone.view.fragment.productcatalog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.WebViewAsp;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import kotlin.TypeCastException;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.getCountryFieldName;
import p040o.inject_extractorProvider;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;
import p040o.verifyReferral;
import p040o.writeUInt64NoTag;

public final class ProductCatalogFragment extends BaseFragment implements inject_extractorProvider.IconCompatParcelizer, verifyReferral.write {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private verifyReferral.write MediaDescriptionCompat;
    private boolean MediaMetadataCompat = true;
    @HmlPinActivity
    public getCountryFieldName presenter;

    private View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ verifyReferral.write MediaBrowserCompat$CustomActionResultReceiver(ProductCatalogFragment productCatalogFragment) {
        verifyReferral.write write2 = productCatalogFragment.MediaDescriptionCompat;
        if (write2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return write2;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onAttach(Context context) {
        onGetStartedClick.write((Object) context, "context");
        super.onAttach(context);
        this.MediaDescriptionCompat = (verifyReferral.write) context;
    }

    public final void onAttachFragment(Fragment fragment) {
        onGetStartedClick.write((Object) fragment, "childFragment");
        super.onAttachFragment(fragment);
        Context context = getContext();
        if (context != null) {
            this.MediaDescriptionCompat = (verifyReferral.write) context;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.custom.LoadingWebViewClient.LoadingDelegate");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f89022131494129, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.MediaBrowserCompat$MediaItem = arguments != null ? arguments.getString("ARGS_CATALOG_URL") : null;
        getCountryFieldName getcountryfieldname = this.presenter;
        if (getcountryfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getcountryfieldname.MediaBrowserCompat$ItemReceiver(this);
        getCountryFieldName getcountryfieldname2 = this.presenter;
        if (getcountryfieldname2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new getCountryFieldName.write(this.MediaBrowserCompat$MediaItem);
        if (getcountryfieldname2.RatingCompat != null) {
            write2.IconCompatParcelizer(getcountryfieldname2.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        WebView webView = (WebView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pdfWebView);
        onGetStartedClick.IconCompatParcelizer((Object) webView, "pdfWebView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(this.MediaMetadataCompat);
        settings.setBuiltInZoomControls(this.MediaMetadataCompat);
        settings.setDisplayZoomControls(!this.MediaMetadataCompat);
        WebView webView2 = (WebView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pdfWebView);
        onGetStartedClick.IconCompatParcelizer((Object) webView2, "pdfWebView");
        webView2.setWebChromeClient(new WebChromeClient());
        WebView webView3 = (WebView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pdfWebView);
        onGetStartedClick.IconCompatParcelizer((Object) webView3, "pdfWebView");
        webView3.setWebViewClient(new verifyReferral(this, new write(this), new IconCompatParcelizer(this)));
        ((WebView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pdfWebView)).clearCache(true);
        ((WebView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pdfWebView)).clearHistory();
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            StringBuilder sb = new StringBuilder();
            sb.append("https://docs.google.com/gview?embedded=true&url=");
            sb.append(encode);
            String obj = sb.toString();
            WebView webView4 = (WebView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pdfWebView);
            WebViewAsp.aspectOf();
            try {
                Context context = webView4.getContext();
                new onRotateClicked();
                String write2 = onRotateClicked.write(obj);
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
                sb2.append(write2);
                sb2.append("\n with context ");
                sb2.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                webView4.loadUrl(write2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    static final class IconCompatParcelizer implements verifyReferral.IconCompatParcelizer {
        private /* synthetic */ ProductCatalogFragment IconCompatParcelizer;

        IconCompatParcelizer(ProductCatalogFragment productCatalogFragment) {
            this.IconCompatParcelizer = productCatalogFragment;
        }

        public final void IconCompatParcelizer() {
            ProductCatalogFragment.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer).ay_();
        }
    }

    static final class write implements verifyReferral.IconCompatParcelizer {
        private /* synthetic */ ProductCatalogFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(ProductCatalogFragment productCatalogFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = productCatalogFragment;
        }

        public final void IconCompatParcelizer() {
            ProductCatalogFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver).Keep();
        }
    }
}

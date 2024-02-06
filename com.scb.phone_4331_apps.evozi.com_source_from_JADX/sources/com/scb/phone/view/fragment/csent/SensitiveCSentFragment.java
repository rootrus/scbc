package com.scb.phone.view.fragment.csent;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.csent.SensitiveCSentActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.WebViewAsp;
import java.util.Collections;
import java.util.List;
import p040o.C3735x47d79e53;
import p040o.CrashlyticsReportJsonTransform$$Lambda$5;
import p040o.CrashlyticsReportJsonTransform$$Lambda$6;
import p040o.EventBus;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIIdDeserializerRttiFactory;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.PreJava9ReflectionAccessor;
import p040o.PreJava9ReflectionAccessor$MediaBrowserCompat$MediaItem;
import p040o.expires;
import p040o.isCollected;
import p040o.onGetStartedClick;
import p040o.singletonIterator;
import p040o.singletonIterator$MediaBrowserCompat$ItemReceiver;
import p040o.waitForAccessTokenRefresh$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

public final class SensitiveCSentFragment extends BaseFragment implements IdCaptureModule_GetIIdDeserializerRttiFactory {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    @BindView
    public AppCompatButton nextButton;
    @HmlPinActivity
    public PreJava9ReflectionAccessor presenter;
    @BindView
    public SCBWebView wvConsent;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89862131494213, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.presenter;
        if (preJava9ReflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        preJava9ReflectionAccessor.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        Object obj = null;
        Object serializable = arguments != null ? arguments.getSerializable("activity.csent.EXTRA_SUB_TYPE") : null;
        if (serializable instanceof CrashlyticsReportJsonTransform$$Lambda$6) {
            obj = serializable;
        }
        CrashlyticsReportJsonTransform$$Lambda$6 crashlyticsReportJsonTransform$$Lambda$6 = (CrashlyticsReportJsonTransform$$Lambda$6) obj;
        if (crashlyticsReportJsonTransform$$Lambda$6 != null) {
            PreJava9ReflectionAccessor preJava9ReflectionAccessor2 = this.presenter;
            if (preJava9ReflectionAccessor2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) crashlyticsReportJsonTransform$$Lambda$6, "subType");
            preJava9ReflectionAccessor2.MediaBrowserCompat$MediaItem = crashlyticsReportJsonTransform$$Lambda$6;
            if (preJava9ReflectionAccessor2.RatingCompat != null) {
                preJava9ReflectionAccessor2.RatingCompat.AlertController$RecycleListView();
            }
            singletonIterator singletoniterator = preJava9ReflectionAccessor2.MediaBrowserCompat$ItemReceiver;
            PreJava9ReflectionAccessor preJava9ReflectionAccessor3 = preJava9ReflectionAccessor2;
            FundFactSheetActivity preJava9ReflectionAccessor$MediaBrowserCompat$MediaItem = new PreJava9ReflectionAccessor$MediaBrowserCompat$MediaItem(preJava9ReflectionAccessor3);
            FundFactSheetActivity mediaMetadataCompat = new PreJava9ReflectionAccessor.MediaMetadataCompat(preJava9ReflectionAccessor3);
            List singletonList = Collections.singletonList(new expires(CrashlyticsReportJsonTransform$$Lambda$5.SENSITIVE_CONSENT.name(), crashlyticsReportJsonTransform$$Lambda$6.name()));
            onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
            isCollected iscollected = new isCollected("EAPP", singletonList, "INDIVIDUAL");
            onGetStartedClick.write((Object) preJava9ReflectionAccessor$MediaBrowserCompat$MediaItem, "onSuccess");
            onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
            onGetStartedClick.write((Object) iscollected, "request");
            singletoniterator.MediaBrowserCompat$ItemReceiver(singletoniterator.read, preJava9ReflectionAccessor$MediaBrowserCompat$MediaItem, mediaMetadataCompat, new waitForAccessTokenRefresh$MediaBrowserCompat$ItemReceiver(iscollected), new singletonIterator$MediaBrowserCompat$ItemReceiver(singletoniterator.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "webUrl");
        SCBWebView sCBWebView = this.wvConsent;
        if (sCBWebView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("wvConsent");
        }
        sCBWebView.setScrollContainer(false);
        sCBWebView.setWebViewClient(new IconCompatParcelizer());
        if (str != null) {
            WebViewAsp.aspectOf();
            SCBWebView.MediaBrowserCompat$ItemReceiver(sCBWebView, str);
        }
    }

    @OnClick
    public final void onClickRadioButtonAccept() {
        PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.presenter;
        if (preJava9ReflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        preJava9ReflectionAccessor.read = true;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = PreJava9ReflectionAccessor.RatingCompat.write;
        if (preJava9ReflectionAccessor.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(preJava9ReflectionAccessor.RatingCompat);
        }
    }

    @OnClick
    public final void onClickRadioButtonDecline() {
        PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.presenter;
        if (preJava9ReflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = false;
        preJava9ReflectionAccessor.read = false;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = PreJava9ReflectionAccessor.RatingCompat.write;
        if (preJava9ReflectionAccessor.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(preJava9ReflectionAccessor.RatingCompat);
        }
    }

    public final void read() {
        AppCompatButton appCompatButton = this.nextButton;
        if (appCompatButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        appCompatButton.setEnabled(true);
    }

    @OnClick
    public final void onNext() {
        PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.presenter;
        if (preJava9ReflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (preJava9ReflectionAccessor.read) {
            preJava9ReflectionAccessor.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = PreJava9ReflectionAccessor.write.MediaBrowserCompat$ItemReceiver;
        if (preJava9ReflectionAccessor.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(preJava9ReflectionAccessor.RatingCompat);
        }
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ SensitiveCSentFragment IconCompatParcelizer;

        read(SensitiveCSentFragment sensitiveCSentFragment) {
            this.IconCompatParcelizer = sensitiveCSentFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.IconCompatParcelizer.presenter;
            if (preJava9ReflectionAccessor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            preJava9ReflectionAccessor.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String str;
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.auto_csent_sensitive_deny_header);
        PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.presenter;
        if (preJava9ReflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CrashlyticsReportJsonTransform$$Lambda$6 crashlyticsReportJsonTransform$$Lambda$6 = CrashlyticsReportJsonTransform$$Lambda$6.SENSITIVE_NEWREGISTER;
        CrashlyticsReportJsonTransform$$Lambda$6 crashlyticsReportJsonTransform$$Lambda$62 = preJava9ReflectionAccessor.MediaBrowserCompat$MediaItem;
        if (crashlyticsReportJsonTransform$$Lambda$62 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subType");
        }
        if (crashlyticsReportJsonTransform$$Lambda$6 == crashlyticsReportJsonTransform$$Lambda$62) {
            str = preJava9ReflectionAccessor.write.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_csent_sensitive_deny_message);
            onGetStartedClick.IconCompatParcelizer((Object) str, "resources.getString(R.st…t_sensitive_deny_message)");
        } else {
            str = preJava9ReflectionAccessor.write.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_csent_sensitive_ntb_deny_message);
            onGetStartedClick.IconCompatParcelizer((Object) str, "resources.getString(R.st…nsitive_ntb_deny_message)");
        }
        CustomDialog MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(str);
        CustomDialog MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2.read.getString(R.string.cancel), SensitiveCSentFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver3.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3.read.getString(R.string.confirm), new read(this)).show();
    }

    final class IconCompatParcelizer extends WebViewClient {
        public IconCompatParcelizer() {
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Uri uri;
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            PreJava9ReflectionAccessor preJava9ReflectionAccessor = SensitiveCSentFragment.this.presenter;
            if (preJava9ReflectionAccessor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            String valueOf = String.valueOf(uri);
            onGetStartedClick.write((Object) valueOf, "errorUrl");
            EventBus eventBus = preJava9ReflectionAccessor.IconCompatParcelizer;
            if (eventBus == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("sensitiveConsentDisplay");
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) eventBus.write, (Object) valueOf)) {
                preJava9ReflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.custom_error_title, Iterables$3$MediaBrowserCompat$MediaItem.custom_error_description, (Runnable) new C3735x47d79e53(preJava9ReflectionAccessor));
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SensitiveCSentFragment sensitiveCSentFragment = SensitiveCSentFragment.this;
            Dialog dialog = sensitiveCSentFragment.write;
            if (dialog != null && dialog.isShowing()) {
                sensitiveCSentFragment.write.dismiss();
                sensitiveCSentFragment.write = null;
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof SensitiveCSentActivity)) {
            activity = null;
        }
        SensitiveCSentActivity sensitiveCSentActivity = (SensitiveCSentActivity) activity;
        if (sensitiveCSentActivity != null) {
            if (z) {
                sensitiveCSentActivity.setResult(-1);
            }
            sensitiveCSentActivity.finish();
        }
    }
}

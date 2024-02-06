package com.scb.phone.view.fragment.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.common.C5580xe75847fb;
import com.scb.phone.view.activity.common.ThirdPartySlipActivity;
import com.scb.phone.view.fragment.webview.BaseWebViewFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6511x9873a16a;
import p040o.FragmentBuilder_BindEasycashLoanAccountFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IdCaptureModule_GetExtractionParametersFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TreeTypeAdapter;
import p040o.onGetStartedClick;
import p040o.requestLocationUpdates;
import p040o.setTapText;

public final class PrintSlipWebFragment extends BaseWebViewFragment<IdCaptureModule_GetExtractionParametersFactory, TreeTypeAdapter.SingleTypeFactory, FragmentBuilder_BindEasycashLoanAccountFragment> implements IdCaptureModule_GetExtractionParametersFactory {
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver = "WebviewJS";
    @HmlPinActivity
    public TreeTypeAdapter.SingleTypeFactory mPresenter;
    @BindView
    public WebView mWebView;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: q_ */
    public final void mo15015q_(String str) {
        onGetStartedClick.write((Object) str, "rquId");
    }

    public PrintSlipWebFragment() {
        FundActionsSuccessActivity printSlipWebFragment$MediaBrowserCompat$CustomActionResultReceiver = new C5895x73737e64(this);
        onGetStartedClick.write((Object) printSlipWebFragment$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(printSlipWebFragment$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90352131494262, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        TreeTypeAdapter.SingleTypeFactory singleTypeFactory = this.mPresenter;
        if (singleTypeFactory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        singleTypeFactory.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = r3.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            super.onViewCreated(r3, r4)
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x001b
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L_0x001b
            java.lang.String r4 = "THIRD_PARTY_URL"
            java.lang.String r3 = r3.getStringExtra(r4)
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 == 0) goto L_0x0063
            android.webkit.WebView r4 = r2.mWebView
            java.lang.String r0 = "mWebView"
            if (r4 != 0) goto L_0x0027
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0027:
            android.webkit.WebChromeClient r1 = new android.webkit.WebChromeClient
            r1.<init>()
            r4.setWebChromeClient(r1)
            android.webkit.WebView r4 = r2.mWebView
            if (r4 != 0) goto L_0x0036
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0036:
            com.scb.phone.view.fragment.common.PrintSlipWebFragment$MediaBrowserCompat$ItemReceiver r0 = new com.scb.phone.view.fragment.common.PrintSlipWebFragment$MediaBrowserCompat$ItemReceiver
            r0.<init>(r2)
            android.webkit.WebViewClient r0 = (android.webkit.WebViewClient) r0
            r4.setWebViewClient(r0)
            o.TreeTypeAdapter$SingleTypeFactory r4 = r2.mPresenter
            if (r4 != 0) goto L_0x0049
            java.lang.String r0 = "mPresenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0049:
            java.lang.String r0 = "url"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            o.RttiJsonBill$MediaBrowserCompat$ItemReceiver r0 = new o.RttiJsonBill$MediaBrowserCompat$ItemReceiver
            r0.<init>(r3)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x005b
            r3 = 1
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 == 0) goto L_0x0063
            T r3 = r4.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.common.PrintSlipWebFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: p_ */
    public final void mo15014p_(String str) {
        onGetStartedClick.write((Object) str, "refId");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C5580xe75847fb thirdPartySlipActivity$MediaBrowserCompat$CustomActionResultReceiver = ThirdPartySlipActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) activity, "it");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = C5580xe75847fb.MediaBrowserCompat$CustomActionResultReceiver(activity, str, requestLocationUpdates.DISPLAY);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity2, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void at_() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, HomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            activity.finish();
        }
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final WebView MediaBrowserCompat$CustomActionResultReceiver() {
        WebView webView = this.mWebView;
        if (webView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mWebView");
        }
        return webView;
    }

    public final /* synthetic */ C6511x9873a16a write() {
        return (FragmentBuilder_BindEasycashLoanAccountFragment) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

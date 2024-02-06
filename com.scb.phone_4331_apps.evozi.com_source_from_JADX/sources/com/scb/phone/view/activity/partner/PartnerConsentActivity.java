package com.scb.phone.view.activity.partner;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import com.thunderhead.android.aspects.WebViewAsp;
import java.net.MalformedURLException;
import java.net.URL;
import p040o.C4295dq;
import p040o.FragmentBuilder_BindEBillSubscriptionFragment;
import p040o.FragmentBuilder_BindECouponSaveSlipFragment;
import p040o.FragmentBuilder_BindEStatementsSuccessfulFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.access$2800;
import p040o.dq$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.dq$MediaBrowserCompat$MediaItem;
import p040o.getBelowMinFrontImageSize;
import p040o.getEndedAt;
import p040o.getStartedAt;
import p040o.maximumSize;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;
import p040o.setMyLocationEnabled;
import p040o.setTapText;
import p040o.zzmd;

public class PartnerConsentActivity extends BaseActivity implements getBelowMinFrontImageSize, FragmentBuilder_BindEBillSubscriptionFragment {
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    @BindView
    ImageView imgIcon;
    @HmlPinActivity
    public C4295dq partnerConsentPresenter;
    @BindView
    TextView tvConsentDescription;
    @BindView
    View viewHide;
    @BindView
    WebView wvConsentDescription;

    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((PartnerConsentActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Intent IconCompatParcelizer(Context context, String str, boolean z, String str2) {
        Intent intent = new Intent(context, PartnerConsentActivity.class);
        intent.putExtra("consent_session_id", str);
        intent.putExtra("IS_NEED_HISTORY_STACK", z);
        intent.putExtra("deny_url", str2);
        return intent;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [o.dr] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            r9 = 2131493143(0x7f0c0117, float:1.8609758E38)
            r8.setContentView(r9)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r8)
            r8.setStackedBackground()
            java.lang.String r9 = ""
            r8.MediaSessionCompat$QueueItem(r9)
            r8.setTabContainer()
            o.dq r0 = r8.partnerConsentPresenter
            r0.MediaBrowserCompat$ItemReceiver(r8)
            android.content.Intent r0 = r8.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "verifyCitizen"
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0068
            android.content.Intent r0 = r8.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r4 = "consent_session_id"
            java.lang.String r0 = r0.getString(r4, r3)
            r8.MediaMetadataCompat = r0
            android.content.Intent r0 = r8.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r4 = "deny_url"
            java.lang.String r0 = r0.getString(r4, r3)
            r8.MediaBrowserCompat$SearchResultReceiver = r0
            android.content.Intent r0 = r8.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r0 = r0.getString(r1, r9)
            r8.MediaBrowserCompat$MediaItem = r0
            android.content.Intent r0 = r8.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r4 = "IS_NEED_HISTORY_STACK"
            boolean r0 = r0.getBoolean(r4, r2)
            r8.MediaDescriptionCompat = r0
        L_0x0068:
            o.dq r0 = r8.partnerConsentPresenter
            java.lang.String r4 = r8.MediaMetadataCompat
            boolean r5 = r8.MediaDescriptionCompat
            java.lang.String r6 = r8.MediaBrowserCompat$MediaItem
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r1)
            r1 = 1
            java.lang.String r7 = "Thai"
            boolean r6 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r6, r7, r1)
            if (r6 == 0) goto L_0x00ab
            o.forMap r6 = r0.MediaBrowserCompat$ItemReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.GoogleMap$OnMarkerDragListener r6 = r6.AppCompatDelegateImpl$ListMenuDecorView()
            if (r6 == 0) goto L_0x0088
            java.lang.String r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0088:
            java.lang.String r6 = "P1"
            boolean r3 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r6, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x00ab
            o.dq$ParcelableVolumeInfo r9 = p040o.C4295dq.ParcelableVolumeInfo.write
            o.FundFactSheetActivity r9 = (p040o.FundFactSheetActivity) r9
            if (r9 == 0) goto L_0x009c
            o.dr r3 = new o.dr
            r3.<init>(r9)
            r9 = r3
        L_0x009c:
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x00a3
            r2 = r1
        L_0x00a3:
            if (r2 == 0) goto L_0x00aa
            T r0 = r0.RatingCompat
            r9.IconCompatParcelizer(r0)
        L_0x00aa:
            return
        L_0x00ab:
            if (r4 != 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r9 = r4
        L_0x00af:
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x00b4
            r2 = r1
        L_0x00b4:
            if (r2 == 0) goto L_0x00bb
            T r1 = r0.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x00bb:
            o.forMap r1 = r0.MediaBrowserCompat$ItemReceiver
            r1.IconCompatParcelizer(r9)
            o.forMap r9 = r0.MediaBrowserCompat$ItemReceiver
            o.dq$write r1 = new o.dq$write
            r1.<init>(r5)
            o.IndoorBuilding$MediaBrowserCompat$ItemReceiver r1 = (p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver) r1
            r9.IconCompatParcelizer(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerConsentActivity.onCreate(android.os.Bundle):void");
    }

    public void onBackPressed() {
        if (this.MediaDescriptionCompat) {
            super.onBackPressed();
        } else {
            this.partnerConsentPresenter.read(this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    @OnClick
    public void onAllowClick() {
        C4295dq dqVar = this.partnerConsentPresenter;
        String str = this.MediaMetadataCompat;
        boolean z = this.MediaDescriptionCompat;
        getStartedAt getstartedat = dqVar.write;
        if (getstartedat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerConsentDisplay");
        }
        String str2 = getstartedat.MediaBrowserCompat$ItemReceiver;
        String str3 = zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.write;
        Uri parse = Uri.parse(str2);
        dqVar.write(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "scbsonboard", (Object) parse != null ? parse.getQueryParameter(str3) : null), dq$MediaBrowserCompat$MediaItem.IconCompatParcelizer);
        dqVar.IconCompatParcelizer(new maximumSize(str, Integer.valueOf(zzmd.zzk.zza.ALLOW_ACTION.action)), (IndoorBuilding$MediaBrowserCompat$ItemReceiver<setMyLocationEnabled>) new dq$MediaBrowserCompat$CustomActionResultReceiver(dqVar, z));
        this.scbAnalytics.write("partner_consent", new ZSYR2K("source", "scbs"), new ZSYR2K("button", "allow"));
    }

    @OnClick
    public void onDenyClick() {
        C4295dq dqVar = this.partnerConsentPresenter;
        String str = this.MediaMetadataCompat;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        getStartedAt getstartedat = dqVar.write;
        if (getstartedat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerConsentDisplay");
        }
        String str3 = getstartedat.MediaBrowserCompat$ItemReceiver;
        String str4 = zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.write;
        Uri parse = Uri.parse(str3);
        dqVar.write(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "scbsonboard", (Object) parse != null ? parse.getQueryParameter(str4) : null), C4295dq.MediaDescriptionCompat.IconCompatParcelizer);
        dqVar.IconCompatParcelizer(new maximumSize(str, Integer.valueOf(zzmd.zzk.zza.DENY_ACTION.action)), (IndoorBuilding$MediaBrowserCompat$ItemReceiver<setMyLocationEnabled>) new C4295dq.IconCompatParcelizer(str2));
        this.scbAnalytics.write("partner_consent", new ZSYR2K("source", "scbs"), new ZSYR2K("button", "deny"));
    }

    public final void read(getStartedAt getstartedat) {
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(0);
        }
        this.viewHide.setVisibility(8);
        getEndedAt getendedat = getstartedat.MediaBrowserCompat$CustomActionResultReceiver;
        if (getendedat != null) {
            if (TextUtils.isEmpty(getendedat.MediaBrowserCompat$ItemReceiver)) {
                this.imgIcon.setVisibility(8);
            } else {
                this.imgIcon.setVisibility(0);
                FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(getendedat.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.shape_gray_rectangle).IconCompatParcelizer((int) R.drawable.shape_gray_rectangle);
                IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment((int) getResources().getDimension(R.dimen.f73472131165730), 0, 0));
                IconCompatParcelizer.read(this.imgIcon, (FragmentBuilder_BindEkycFragment) null);
            }
            String str = getstartedat.read;
            this.tvConsentDescription.setVisibility(0);
            this.tvConsentDescription.setText(str);
            if (!TextUtils.isEmpty(getendedat.read)) {
                this.scbAnalytics.write("partner_consent", new ZSYR2K("source", getendedat.read));
            }
        }
    }

    public final void IconCompatParcelizer(String str, String str2) {
        MediaBrowserCompat$SearchResultReceiver(str);
        if (getBaseContext() != null) {
            Intent read = PartnerDiscoverWebViewActivity.read(getBaseContext(), str, str2);
            read.putExtras(getIntent());
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, read).read();
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
            finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        MediaBrowserCompat$SearchResultReceiver(str);
        Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(getBaseContext(), str, str2);
        MediaBrowserCompat$ItemReceiver.putExtras(getIntent());
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

    public final void IconCompatParcelizer(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
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
            if (this.MediaDescriptionCompat) {
                finish();
                return;
            }
            Intent intent2 = new Intent(this, SplashActivity.class);
            intent2.addFlags(268468224);
            IntentTidInjectionContextAspect.aspectOf();
            MediaBrowserCompat$ItemReceiver((Context) this, intent2);
            finish();
        }
    }

    public final void read() {
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2300.read = access$2300.write.CUSTOM;
        access$2800 access_2800 = new access$2800(this);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = access_2800;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.partner_consent_citizen_title);
        access_2200.IconCompatParcelizer = getString(R.string.partner_consent_citizen_message);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void IconCompatParcelizer() {
        if (this.MediaDescriptionCompat) {
            finish();
            return;
        }
        Intent intent = new Intent(this, SplashActivity.class);
        intent.addFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        MediaBrowserCompat$ItemReceiver((Context) this, intent);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(this, SplashActivity.class);
        intent.addFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        MediaBrowserCompat$ItemReceiver((Context) this, intent);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaSessionCompat$QueueItem() {
        onBackPressed();
    }

    public final void read(String str) {
        mo13676d_(str);
    }

    private void MediaBrowserCompat$SearchResultReceiver(String str) {
        String stringExtra = getIntent().getStringExtra("EXTRA_CLEAR_COOKIES_PARAMETER");
        if (str != null && stringExtra != null) {
            CookieManager instance = CookieManager.getInstance();
            try {
                URL url = new URL(str);
                StringBuilder sb = new StringBuilder();
                sb.append(url.getProtocol());
                sb.append("://");
                sb.append(url.getHost());
                instance.setCookie(sb.toString(), stringExtra);
            } catch (MalformedURLException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
    }

    public void onDestroy() {
        this.partnerConsentPresenter.onDestroy();
        super.onDestroy();
    }

    public final void write(String str) {
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(0);
        }
        this.viewHide.setVisibility(8);
        this.wvConsentDescription.setVisibility(0);
        this.wvConsentDescription.setWebChromeClient(new WebChromeClient());
        this.wvConsentDescription.setWebViewClient(new WebViewClient() {
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                new FragmentBuilder_BindECouponSaveSlipFragment().MediaBrowserCompat$CustomActionResultReceiver(PartnerConsentActivity.this, sslErrorHandler);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.clearCache(true);
                WebViewAsp.aspectOf();
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
                    webView.loadUrl(write);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return true;
            }

            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                webView.clearCache(true);
                super.onPageStarted(webView, str, bitmap);
                PartnerConsentActivity.this.Keep();
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                PartnerConsentActivity.this.ay_();
            }
        });
        this.wvConsentDescription.getSettings().setJavaScriptEnabled(true);
        this.wvConsentDescription.getSettings().setDomStorageEnabled(true);
        this.wvConsentDescription.clearCache(true);
        this.wvConsentDescription.clearHistory();
        WebView webView = this.wvConsentDescription;
        WebViewAsp.aspectOf();
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
            webView.loadUrl(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.wvConsentDescription.getSettings().setDomStorageEnabled(true);
    }
}

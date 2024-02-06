package com.scb.phone.view.activity.partner;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.common.ThirdPartySlipActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.custom.webview.SCBWebView$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import com.thunderhead.android.aspects.WebViewAsp;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_FilesPayload_File;
import p040o.C4299ds;
import p040o.C4303dv;
import p040o.FragmentBuilder_BindEBillSubscriptionFragment;
import p040o.FragmentBuilder_BindECouponSaveSlipFragment;
import p040o.FragmentBuilder_BindEasycashLandingEmptyFragment;
import p040o.FragmentBuilder_BindEasycashLandingFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetExtractionParametersFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TreeTypeAdapter;
import p040o.commit;
import p040o.getBundleVersion;
import p040o.getInnerThrowables;
import p040o.getThemeAccentColor;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onRotateClicked;
import p040o.requestLocationUpdates;
import p040o.setBaselineAligned;
import p040o.setEvents;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.showOtherMonths;
import p040o.writeUInt64NoTag;

public class SCBUniversalWebViewActivity extends BaseActivity implements FragmentBuilder_BindEBillSubscriptionFragment, getBundleVersion.IconCompatParcelizer, IdCaptureModule_GetExtractionParametersFactory, getInnerThrowables, FragmentBuilder_BindEasycashLandingFragment {
    private boolean MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$SearchResultReceiver;
    protected LocationManager MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public LocationListener MediaSessionCompat$ResultReceiverWrapper = new write(this, (byte) 0);
    private GoogleSignInClient MediaSessionCompat$Token;
    @BindView
    SCBWebView partnerWebView;
    @HmlPinActivity
    public C4303dv presenter;
    @HmlPinActivity
    public TreeTypeAdapter.SingleTypeFactory printSlipWebViewPresenter;
    @HmlPinActivity
    public C4299ds signinAndLocationPresenter;

    /* renamed from: q_ */
    public final void mo15015q_(String str) {
    }

    public static final /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((SCBUniversalWebViewActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void read(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((SCBUniversalWebViewActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, SCBUniversalWebViewActivity.class);
        intent.putExtra(ImagesContract.URL, str);
        return intent;
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2) {
        Intent intent = new Intent(context, SCBUniversalWebViewActivity.class);
        intent.putExtra(ImagesContract.URL, str);
        intent.putExtra(MessageBundle.TITLE_ENTRY, str2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("EXTRA_IS_FROM_PRIVACY_MANAGEMENT_LANDING", false)) {
            setTheme(R.style.f93472131820562);
        }
        setContentView(R.layout.f79192131493144);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        if (getIntent().getExtras() != null) {
            str = getIntent().getExtras().getString(MessageBundle.TITLE_ENTRY, "");
        } else {
            str = "";
        }
        MediaSessionCompat$QueueItem(str);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.printSlipWebViewPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.signinAndLocationPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = getIntent().getExtras().getBoolean("IS_NEED_HISTORY_STACK", false);
        String string = getIntent().getExtras().getString(ImagesContract.URL, "");
        this.MediaBrowserCompat$SearchResultReceiver = string;
        if (C4303dv.read(string)) {
            this.presenter.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver, this.MediaMetadataCompat);
            return;
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        this.partnerWebView.setWebViewClient(new WebViewClient() {
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                new FragmentBuilder_BindECouponSaveSlipFragment().MediaBrowserCompat$CustomActionResultReceiver(SCBUniversalWebViewActivity.this, sslErrorHandler);
            }

            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (SCBUniversalWebViewActivity.this.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(webResourceRequest.getUrl().toString())) {
                    SCBUniversalWebViewActivity.this.mo15004x50fd9e4a();
                }
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.clearCache(true);
                if (str.startsWith("https://play.google.com/store/apps") || str.startsWith("market://")) {
                    SCBUniversalWebViewActivity.this.MediaBrowserCompat$ItemReceiver(str, false);
                } else if (str.startsWith("http")) {
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
                } else if (C4303dv.read(str)) {
                    SCBUniversalWebViewActivity.this.presenter.MediaBrowserCompat$ItemReceiver(str, SCBUniversalWebViewActivity.this.MediaMetadataCompat);
                } else if (str.startsWith("intent:")) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        if (SCBUniversalWebViewActivity.this.getPackageManager().resolveActivity(parseUri, 65536) != null) {
                            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = SCBUniversalWebViewActivity.this;
                            IntentTidInjectionContextAspect.aspectOf();
                            try {
                                Intent read = setTapText.write(sCBUniversalWebViewActivity, parseUri).read();
                                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                                sb2.append(read.getData());
                                sb2.append("\n with context ");
                                sb2.append(sCBUniversalWebViewActivity.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                                sCBUniversalWebViewActivity.startActivity(read);
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        return true;
                    } catch (URISyntaxException e) {
                        onCheckBoxClick.IconCompatParcelizer(e);
                        return false;
                    }
                } else {
                    SCBUniversalWebViewActivity.this.MediaBrowserCompat$ItemReceiver(str, true);
                }
                return true;
            }

            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                webView.clearCache(true);
                super.onPageStarted(webView, str, bitmap);
                SCBUniversalWebViewActivity.this.Keep();
            }

            public final void onPageFinished(WebView webView, String str) {
                SCBUniversalWebViewActivity.this.ay_();
                super.onPageFinished(webView, str);
            }
        });
        this.partnerWebView.setDownloadListener(new getThemeAccentColor(this));
        this.partnerWebView.setAdvanceWebView(this);
        this.partnerWebView.setJavascriptInterface(new commit(this), "WebviewJS");
        SCBWebView sCBWebView = this.partnerWebView;
        if (str2 != null) {
            WebViewAsp.aspectOf();
            SCBWebView.MediaBrowserCompat$ItemReceiver(sCBWebView, str2);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93002131558402, menu);
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_close).getIcon().mutate());
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null && extras.getBoolean("EXTRA_IS_FROM_PRIVACY_MANAGEMENT_LANDING", false)) {
            z = true;
        }
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(this, z ? R.color.f67252131099881 : R.color.f71012131100257));
        menu.findItem(R.id.menu_close).setIcon(MediaBrowserCompat$MediaItem2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.MediaBrowserCompat$MediaItem) {
            SplashActivity.IconCompatParcelizer(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.signinAndLocationPresenter.onDestroy();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public void mo15004x50fd9e4a() {
        this.partnerWebView.setVisibility(8);
    }

    public final Integer ar_() {
        return 100;
    }

    /* renamed from: O_ */
    public final Boolean mo14724O_() {
        return Boolean.TRUE;
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            IntentTidInjectionContextAspect.aspectOf();
            read(this, intent);
            this.MediaBrowserCompat$MediaItem = z;
        } catch (ActivityNotFoundException e) {
            this.MediaBrowserCompat$MediaItem = false;
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public void onBackPressed() {
        if (this.partnerWebView.canGoBack()) {
            this.partnerWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [o.dz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r0 = 4432(0x1150, float:6.21E-42)
            if (r5 != r0) goto L_0x00a4
            r5 = -1
            r0 = 1
            r1 = 0
            if (r6 != r5) goto L_0x007f
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.auth.api.signin.GoogleSignIn.getSignedInAccountFromIntent(r7)
            o.ds r6 = r4.signinAndLocationPresenter
            r7 = 2131756985(0x7f1007b9, float:1.9144893E38)
            java.lang.String r7 = r4.getString(r7)
            java.lang.String r2 = "completedTask"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r2)
            java.lang.String r2 = "clientId"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r2)
            java.lang.Class<com.google.android.gms.common.api.ApiException> r2 = com.google.android.gms.common.api.ApiException.class
            java.lang.Object r5 = r5.getResult(r2)     // Catch:{ ApiException -> 0x002c }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5     // Catch:{ ApiException -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            if (r5 == 0) goto L_0x007b
            o.ds$read r2 = p040o.C4299ds.read.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            if (r2 == 0) goto L_0x003b
            o.dz r3 = new o.dz
            r3.<init>(r2)
            r2 = r3
        L_0x003b:
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r3 = r6.RatingCompat
            if (r3 == 0) goto L_0x0043
            r3 = r0
            goto L_0x0044
        L_0x0043:
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            T r3 = r6.RatingCompat
            r2.IconCompatParcelizer(r3)
        L_0x004b:
            java.lang.String r2 = r5.getEmail()
            r6.read = r2
            java.lang.String r5 = r5.getServerAuthCode()
            if (r5 == 0) goto L_0x007e
            java.lang.String r2 = "authToken"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r2)
            T r2 = r6.RatingCompat
            if (r2 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            if (r0 == 0) goto L_0x0069
            T r0 = r6.RatingCompat
            r0.AlertController$RecycleListView()
        L_0x0069:
            o.orientation r0 = r6.MediaBrowserCompat$ItemReceiver
            r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r7)
            o.orientation r5 = r6.MediaBrowserCompat$ItemReceiver
            o.ds$MediaBrowserCompat$ItemReceiver r7 = new o.ds$MediaBrowserCompat$ItemReceiver
            r7.<init>(r6)
            o.IndoorBuilding$MediaBrowserCompat$ItemReceiver r7 = (p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver) r7
            r5.IconCompatParcelizer(r7)
            return
        L_0x007b:
            r6.write()
        L_0x007e:
            return
        L_0x007f:
            o.ds r5 = r4.signinAndLocationPresenter
            o.setEvents r6 = new o.setEvents
            java.lang.String r7 = "unidentifiedError"
            java.lang.String r2 = "ERROR"
            r6.<init>(r7, r2)
            o.getGenerator r7 = new o.getGenerator
            r7.<init>(r6)
            o.ds$IconCompatParcelizer r6 = new o.ds$IconCompatParcelizer
            r6.<init>(r5, r7)
            o.writeUInt64NoTag$IconCompatParcelizer r6 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r6
            T r7 = r5.RatingCompat
            if (r7 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r0 = r1
        L_0x009d:
            if (r0 == 0) goto L_0x00a4
            T r5 = r5.RatingCompat
            r6.IconCompatParcelizer(r5)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        showOtherMonths.MediaBrowserCompat$ItemReceiver(this, i, iArr);
    }

    public final void MediaSessionCompat$QueueItem() {
        onBackPressed();
    }

    public final void MediaMetadataCompat(String str) {
        try {
            Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, addFlags).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            finish();
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    /* renamed from: n_ */
    public final void mo15012n_(String str) {
        MediaBrowserCompat$ItemReceiver(str, true);
    }

    /* renamed from: p_ */
    public final void mo15014p_(String str) {
        Intent IconCompatParcelizer = ThirdPartySlipActivity.IconCompatParcelizer(this, str, requestLocationUpdates.DISPLAY);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void at_() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaDescriptionCompat(String str) {
        SCBWebView sCBWebView = this.partnerWebView;
        if (str != null) {
            WebViewAsp.aspectOf();
            SCBWebView.MediaBrowserCompat$ItemReceiver(sCBWebView, str);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new Scope(list.get(i)));
            }
        }
        GoogleSignInClient client = GoogleSignIn.getClient((Activity) this, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(getResources().getString(R.string.default_web_client_id)).requestServerAuthCode(getResources().getString(R.string.default_web_client_id), true).requestEmail().requestScopes(new Scope(Scopes.EMAIL), (Scope[]) arrayList.toArray(new Scope[0])).build());
        this.MediaSessionCompat$Token = client;
        Intent signInIntent = client.getSignInIntent();
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, signInIntent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 4432);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: o_ */
    public final void mo15013o_(String str) {
        SCBWebView sCBWebView = this.partnerWebView;
        C10971 r1 = new FragmentBuilder_BindEasycashLandingEmptyFragment() {
            public final String IconCompatParcelizer() {
                return "requestExternalLoginCallback";
            }

            public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver() {
                return "WebJS";
            }

            public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(String str) {
                return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((FragmentBuilder_BindEasycashLandingEmptyFragment) this, str);
            }

            public final /* synthetic */ String write() {
                return "";
            }

            public final /* synthetic */ String read() {
                return MediaBrowserCompat$CustomActionResultReceiver(write());
            }
        };
        onGetStartedClick.write((Object) r1, "webViewScriptConfig");
        onGetStartedClick.write((Object) str, "data");
        sCBWebView.post(new SCBWebView$MediaBrowserCompat$ItemReceiver(sCBWebView, str, r1));
    }

    public final void as_() {
        GoogleSignInClient googleSignInClient = this.MediaSessionCompat$Token;
        if (googleSignInClient != null) {
            googleSignInClient.signOut();
        }
    }

    public final void MediaSessionCompat$Token() {
        try {
            LocationManager locationManager = (LocationManager) getSystemService("location");
            this.MediaDescriptionCompat = locationManager;
            locationManager.requestLocationUpdates("gps", 5000, BitmapDescriptorFactory.HUE_RED, this.MediaSessionCompat$ResultReceiverWrapper);
            this.MediaDescriptionCompat.requestLocationUpdates("network", 5000, BitmapDescriptorFactory.HUE_RED, this.MediaSessionCompat$ResultReceiverWrapper);
        } catch (SecurityException unused) {
            C4299ds dsVar = this.signinAndLocationPresenter;
            boolean z = false;
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C4299ds.MediaMetadataCompat(dsVar.write.toJson((Object) new AutoValue_CrashlyticsReport_FilesPayload_File.C30621(false, (String) null, (String) null, new setEvents("invalidMessage", "ERROR"))));
            if (dsVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                mediaMetadataCompat.IconCompatParcelizer(dsVar.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        SCBWebView sCBWebView = this.partnerWebView;
        C10983 r1 = new FragmentBuilder_BindEasycashLandingEmptyFragment() {
            public final String IconCompatParcelizer() {
                return "getCurrentLocationCallback";
            }

            public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver() {
                return "WebJS";
            }

            public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(String str) {
                return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((FragmentBuilder_BindEasycashLandingEmptyFragment) this, str);
            }

            public final /* synthetic */ String write() {
                return "";
            }

            public final /* synthetic */ String read() {
                return MediaBrowserCompat$CustomActionResultReceiver(write());
            }
        };
        onGetStartedClick.write((Object) r1, "webViewScriptConfig");
        onGetStartedClick.write((Object) str, "data");
        sCBWebView.post(new SCBWebView$MediaBrowserCompat$ItemReceiver(sCBWebView, str, r1));
    }

    public final void aq_() {
        showOtherMonths.IconCompatParcelizer(this);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [o.dz] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 2
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 1
            switch(r0) {
                case -817602545: goto L_0x0035;
                case -603780584: goto L_0x002b;
                case -254525002: goto L_0x0021;
                case 1656718901: goto L_0x0017;
                case 1964808552: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "onRecieved"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = r1
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "onSlipRender"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = r4
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "onTracking"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = r5
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "getCurrentLocation"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = r2
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "requestExternalLogin"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = r3
            goto L_0x0040
        L_0x003f:
            r8 = -1
        L_0x0040:
            if (r8 == 0) goto L_0x0129
            if (r8 == r5) goto L_0x0129
            if (r8 == r1) goto L_0x0129
            java.lang.String r0 = "message"
            r1 = 0
            if (r8 == r3) goto L_0x00e9
            if (r8 != r2) goto L_0x012e
            o.ds r8 = r7.signinAndLocationPresenter
            java.lang.String r2 = "location"
            java.lang.Object r2 = r7.getSystemService(r2)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            java.lang.String r3 = "gps"
            boolean r3 = r2.isProviderEnabled(r3)
            if (r3 != 0) goto L_0x0069
            java.lang.String r3 = "network"
            boolean r2 = r2.isProviderEnabled(r3)
            if (r2 != 0) goto L_0x0069
            r2 = r4
            goto L_0x006a
        L_0x0069:
            r2 = r5
        L_0x006a:
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = p040o.setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(r7, r3)
            if (r3 != 0) goto L_0x0074
            r3 = r5
            goto L_0x0075
        L_0x0074:
            r3 = r4
        L_0x0075:
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            com.google.gson.Gson r0 = r8.write     // Catch:{ JsonSyntaxException -> 0x0087 }
            java.lang.Class<o.setGeneratorType> r6 = p040o.setGeneratorType.class
            java.lang.Object r9 = r0.fromJson((java.lang.String) r9, r6)     // Catch:{ JsonSyntaxException -> 0x0087 }
            o.setGeneratorType r9 = (p040o.setGeneratorType) r9     // Catch:{ JsonSyntaxException -> 0x0087 }
            if (r9 == 0) goto L_0x0087
            java.lang.Boolean r9 = r9.read     // Catch:{ JsonSyntaxException -> 0x0087 }
            goto L_0x0088
        L_0x0087:
            r9 = r1
        L_0x0088:
            if (r9 == 0) goto L_0x00c0
            if (r2 == 0) goto L_0x00bc
            boolean r9 = r9.booleanValue()
            if (r3 == 0) goto L_0x00a4
            o.ds$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.ds$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x009b
            r4 = r5
        L_0x009b:
            if (r4 == 0) goto L_0x012e
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
            goto L_0x012e
        L_0x00a4:
            if (r9 == 0) goto L_0x00b8
            o.ds$MediaDescriptionCompat r9 = p040o.C4299ds.MediaDescriptionCompat.write
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x00af
            r4 = r5
        L_0x00af:
            if (r4 == 0) goto L_0x012e
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
            goto L_0x012e
        L_0x00b8:
            r8.MediaBrowserCompat$ItemReceiver(r1, r1)
            return
        L_0x00bc:
            r8.MediaBrowserCompat$ItemReceiver(r1, r1)
            return
        L_0x00c0:
            o.setEvents r9 = new o.setEvents
            java.lang.String r0 = "unidentifiedError"
            java.lang.String r2 = "ERROR"
            r9.<init>(r0, r2)
            o.AutoValue_CrashlyticsReport_FilesPayload_File$1 r0 = new o.AutoValue_CrashlyticsReport_FilesPayload_File$1
            r0.<init>(r4, r1, r1, r9)
            com.google.gson.Gson r9 = r8.write
            java.lang.String r9 = r9.toJson((java.lang.Object) r0)
            o.ds$MediaSessionCompat$Token r0 = new o.ds$MediaSessionCompat$Token
            r0.<init>(r9)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r9 = r8.RatingCompat
            if (r9 == 0) goto L_0x00e1
            r4 = r5
        L_0x00e1:
            if (r4 == 0) goto L_0x00e8
            T r8 = r8.RatingCompat
            r0.IconCompatParcelizer(r8)
        L_0x00e8:
            return
        L_0x00e9:
            o.ds r8 = r7.signinAndLocationPresenter
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            com.google.gson.Gson r0 = r8.write     // Catch:{ JsonSyntaxException -> 0x00f9 }
            java.lang.Class<o.setEndedAt> r2 = p040o.setEndedAt.class
            java.lang.Object r9 = r0.fromJson((java.lang.String) r9, r2)     // Catch:{ JsonSyntaxException -> 0x00f9 }
            o.setEndedAt r9 = (p040o.setEndedAt) r9     // Catch:{ JsonSyntaxException -> 0x00f9 }
            r1 = r9
        L_0x00f9:
            o.ds$MediaBrowserCompat$MediaItem r9 = p040o.ds$MediaBrowserCompat$MediaItem.read
            o.FundFactSheetActivity r9 = (p040o.FundFactSheetActivity) r9
            if (r9 == 0) goto L_0x0105
            o.dz r0 = new o.dz
            r0.<init>(r9)
            r9 = r0
        L_0x0105:
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x010d
            r0 = r5
            goto L_0x010e
        L_0x010d:
            r0 = r4
        L_0x010e:
            if (r0 == 0) goto L_0x0115
            T r0 = r8.RatingCompat
            r9.IconCompatParcelizer(r0)
        L_0x0115:
            o.ds$MediaBrowserCompat$SearchResultReceiver r9 = new o.ds$MediaBrowserCompat$SearchResultReceiver
            r9.<init>(r1)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x0121
            r4 = r5
        L_0x0121:
            if (r4 == 0) goto L_0x0128
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x0128:
            return
        L_0x0129:
            o.TreeTypeAdapter$SingleTypeFactory r8 = r7.printSlipWebViewPresenter
            r8.MediaBrowserCompat$ItemReceiver(r9)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(java.lang.String, java.lang.String):void");
    }

    class write implements LocationListener {
        public final void onProviderDisabled(String str) {
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        private write() {
        }

        /* synthetic */ write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, byte b) {
            this();
        }

        public final void onLocationChanged(Location location) {
            SCBUniversalWebViewActivity.this.MediaDescriptionCompat.removeUpdates(SCBUniversalWebViewActivity.this.MediaSessionCompat$ResultReceiverWrapper);
            SCBUniversalWebViewActivity.this.signinAndLocationPresenter.MediaBrowserCompat$ItemReceiver(String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude()));
        }
    }
}

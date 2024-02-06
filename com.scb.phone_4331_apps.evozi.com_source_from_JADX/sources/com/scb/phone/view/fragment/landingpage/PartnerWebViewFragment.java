package com.scb.phone.view.fragment.landingpage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.akexorcist.localizationactivity.LocalizationActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import com.thunderhead.android.aspects.WebViewAsp;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_ContributeDebitWithdrawalLimitActivity;
import p040o.ActivityBuilder_ContributeDepositExportStatementActivity;
import p040o.ActivityBuilder_ContributeDepositOpenAccountActivity;
import p040o.ActivityBuilder_ContributeDirectDebitInputActivity;
import p040o.ActivityBuilder_ContributeECouponCommonActivity;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10829Sizeof;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.LicenseOverlayView_Factory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlacePhotoMetadataResult;
import p040o.ProxySourceAdapter$ItemViewHolder;
import p040o.StreetViewPanoramaFragment;
import p040o.ZTBMV;
import p040o.access$2200;
import p040o.access$2300;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getOversizeImage;
import p040o.getPiggybackDocument;
import p040o.getValueSet;
import p040o.nContextSetPriority;
import p040o.onCheckBoxClick;
import p040o.onRotateClicked;
import p040o.setCheckType;
import p040o.setCurrentSession;
import p040o.setOnUs;
import p040o.setOnUs1;
import p040o.setTapText;
import p040o.zzwi;

public class PartnerWebViewFragment extends BaseFragment implements getPiggybackDocument {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private int IconCompatParcelizer = 0;
    /* access modifiers changed from: private */
    public ValueCallback<Uri[]> MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f3092x50fd9e4a;
    private String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean RatingCompat;
    @BindView
    FloatingActionButton eKycFab;
    @BindView
    WebView mBaseWebView;
    @HmlPinActivity
    public C10829Sizeof.SizeOfNewObject staticTilePresenter;

    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((PartnerWebViewFragment) fragment).startActivityForResult(intent, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public PartnerWebViewFragment() {
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88822131494109, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        ParcelableVolumeInfo("");
        this.mBaseWebView.setWebChromeClient(new IconCompatParcelizer(this, (byte) 0));
        this.mBaseWebView.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (TextUtils.equals(PartnerWebViewFragment.this.f3092x50fd9e4a, str)) {
                    BulkTransferDeepLinkActivity unused = PartnerWebViewFragment.this.MediaBrowserCompat$ItemReceiver = DebitCardResetOtpActivity.timer(1, TimeUnit.MINUTES).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_ContributeDebitWithdrawalLimitActivity(this), ActivityBuilder_ContributeDirectDebitInputActivity.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }

            public final void onPageFinished(WebView webView, String str) {
                if (PartnerWebViewFragment.this.MediaBrowserCompat$ItemReceiver != null && !PartnerWebViewFragment.this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                    PartnerWebViewFragment.this.MediaBrowserCompat$ItemReceiver.dispose();
                }
                super.onPageFinished(webView, str);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!(str.startsWith("market:") || str.startsWith("wemusic:") || str.matches("^(http|https)://play.google.com/store/apps/details.*") || str.startsWith("intent:"))) {
                    String unused = PartnerWebViewFragment.this.MediaBrowserCompat$SearchResultReceiver = webView.getOriginalUrl();
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
                } else if (str.startsWith("intent:")) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        if (PartnerWebViewFragment.this.getContext().getPackageManager().resolveActivity(parseUri, 65536) != null) {
                            Context context2 = PartnerWebViewFragment.this.getContext();
                            IntentTidInjectionContextAspect.aspectOf();
                            try {
                                Intent read2 = setTapText.write(context2, parseUri).read();
                                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                                sb2.append(read2.getData());
                                sb2.append("\n with context ");
                                sb2.append(context2.hashCode());
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                                context2.startActivity(read2);
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        return true;
                    } catch (URISyntaxException e) {
                        onCheckBoxClick.IconCompatParcelizer(e);
                        return false;
                    }
                } else if (!str.matches("^(http|https)://play.google.com/store/apps/details.*")) {
                    boolean unused2 = PartnerWebViewFragment.this.RatingCompat = true;
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        PartnerWebViewFragment partnerWebViewFragment = PartnerWebViewFragment.this;
                        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                        try {
                            FragmentActivity activity = partnerWebViewFragment.getActivity();
                            if (activity != null) {
                                intent = setTapText.write(activity, intent).read();
                            }
                            MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                            StringBuilder sb3 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                            sb3.append(intent.getData());
                            sb3.append("\n with context ");
                            sb3.append(activity.hashCode());
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb3.toString());
                            partnerWebViewFragment.startActivity(intent);
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    } catch (ActivityNotFoundException e2) {
                        onCheckBoxClick.IconCompatParcelizer(e2);
                        return false;
                    }
                } else if (PartnerWebViewFragment.this.MediaBrowserCompat$SearchResultReceiver == null || !PartnerWebViewFragment.this.RatingCompat) {
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        PartnerWebViewFragment partnerWebViewFragment2 = PartnerWebViewFragment.this;
                        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                        try {
                            FragmentActivity activity2 = partnerWebViewFragment2.getActivity();
                            if (activity2 != null) {
                                intent2 = setTapText.write(activity2, intent2).read();
                            }
                            MyECouponActivity_ViewBinding.write write5 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                            StringBuilder sb4 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                            sb4.append(intent2.getData());
                            sb4.append("\n with context ");
                            sb4.append(activity2.hashCode());
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(write5, sb4.toString());
                            partnerWebViewFragment2.startActivity(intent2);
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    } catch (ActivityNotFoundException e3) {
                        onCheckBoxClick.IconCompatParcelizer(e3);
                        return false;
                    }
                } else {
                    String MediaBrowserCompat$ItemReceiver = PartnerWebViewFragment.this.MediaBrowserCompat$SearchResultReceiver;
                    WebViewAsp.aspectOf();
                    try {
                        Context context3 = webView.getContext();
                        new onRotateClicked();
                        String write6 = onRotateClicked.write(MediaBrowserCompat$ItemReceiver);
                        MyECouponActivity_ViewBinding.write write7 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb5 = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
                        sb5.append(write6);
                        sb5.append("\n with context ");
                        sb5.append(context3.hashCode());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write7, sb5.toString());
                        webView.loadUrl(write6);
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
                return true;
            }
        });
        this.mBaseWebView.getSettings().setJavaScriptEnabled(true);
        this.mBaseWebView.getSettings().setDomStorageEnabled(true);
        this.mBaseWebView.addJavascriptInterface(new ZTBMV(new ActivityBuilder_ContributeDepositOpenAccountActivity(this)), "androidbridge");
        this.staticTilePresenter.MediaBrowserCompat$ItemReceiver(this);
        C10829Sizeof.SizeOfNewObject sizeOfNewObject = this.staticTilePresenter;
        setCurrentSession setcurrentsession = (getActivity() == null || getActivity().getIntent() == null || getActivity().getIntent().getExtras() == null) ? null : (setCurrentSession) getActivity().getIntent().getParcelableExtra("com.scb.phone.EXTRA_DISPLAY");
        long j = -1;
        if (!(getActivity() == null || getActivity().getIntent() == null || getActivity().getIntent().getExtras() == null)) {
            j = getActivity().getIntent().getLongExtra("com.scb.phone.EXTRA_PARTNER_ID", -1);
        }
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) getActivity().getIntent().getParcelableExtra("com.scb.phone.EXTRA_NTB_WEB_DATA");
        String D_ = ((LocalizationActivity) getActivity()).mo3026D_();
        if (discardoldlogfiles_mediabrowsercompat_itemreceiver != null) {
            if (sizeOfNewObject.RatingCompat != null) {
                setCheckType setchecktype = new setCheckType(sizeOfNewObject, discardoldlogfiles_mediabrowsercompat_itemreceiver, D_);
                if (sizeOfNewObject.RatingCompat != null) {
                    setchecktype.IconCompatParcelizer(sizeOfNewObject.RatingCompat);
                }
                zzwi write = sizeOfNewObject.read.read.write();
                if (!(write == null || write.f3005x50fd9e4a == null || write.f3005x50fd9e4a.IconCompatParcelizer == null || write.f3005x50fd9e4a.IconCompatParcelizer.length() == 0)) {
                    setOnUs setonus = new setOnUs(sizeOfNewObject, write.f3005x50fd9e4a.IconCompatParcelizer);
                    if (sizeOfNewObject.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        setonus.IconCompatParcelizer(sizeOfNewObject.RatingCompat);
                    }
                }
                return inflate;
            }
        }
        if (setcurrentsession != null) {
            setOnUs1 setonus1 = new setOnUs1(setcurrentsession);
            if (sizeOfNewObject.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setonus1.IconCompatParcelizer(sizeOfNewObject.RatingCompat);
            }
        } else {
            PlacePhotoMetadataResult read = sizeOfNewObject.IconCompatParcelizer.read(j, false);
            if (read != null) {
                getValueSet getvalueset = new getValueSet(sizeOfNewObject, read);
                if (sizeOfNewObject.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getvalueset.IconCompatParcelizer(sizeOfNewObject.RatingCompat);
                }
            } else {
                LicenseOverlayView_Factory licenseOverlayView_Factory = LicenseOverlayView_Factory.MediaBrowserCompat$ItemReceiver;
                if (sizeOfNewObject.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    licenseOverlayView_Factory.IconCompatParcelizer(sizeOfNewObject.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public final String setStackedBackground() {
        return ((LocalizationActivity) getActivity()).mo3026D_();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo("");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.f93002131558402, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getActivity() == null) {
            return true;
        }
        getActivity().finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        this.RatingCompat = false;
        this.MediaBrowserCompat$SearchResultReceiver = null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && this.IconCompatParcelizer == 1) {
            String str = this.MediaMetadataCompat;
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.fragment_easy_bonus, str, getoversizeimage);
            }
        }
    }

    public final void read(setCurrentSession setcurrentsession) {
        Keep();
        this.f3092x50fd9e4a = setcurrentsession.MediaMetadataCompat;
        if (setcurrentsession.write == 1) {
            this.mBaseWebView.getSettings().setUserAgentString(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver());
        }
        if (setcurrentsession.MediaBrowserCompat$SearchResultReceiver == 1) {
            this.MediaMetadataCompat = setcurrentsession.RatingCompat;
            this.IconCompatParcelizer = setcurrentsession.MediaBrowserCompat$SearchResultReceiver;
        }
        if (setcurrentsession.read) {
            FloatingActionButton floatingActionButton = this.eKycFab;
            if (floatingActionButton.IconCompatParcelizer == null) {
                floatingActionButton.IconCompatParcelizer = floatingActionButton.write();
            }
            floatingActionButton.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((nContextSetPriority.IconCompatParcelizer) null, true);
        }
        WebView webView = this.mBaseWebView;
        String str = this.f3092x50fd9e4a;
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
        ParcelableVolumeInfo(setcurrentsession.MediaBrowserCompat$MediaItem);
    }

    public final void read(String str) {
        Intent intent = new Intent(getActivity(), FavouriteSelectedActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAY_METHOD", StreetViewPanoramaFragment.zzb.PROFILE);
        boolean z = false;
        if (!(str.length() == 0)) {
            intent.putExtra("source", str);
        }
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if ((getActivity() instanceof BaseActivity) && ((BaseActivity) getActivity()).setGroupDividerEnabled()) {
            if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
                z = ((BaseActivity) getActivity()).mo13022E_();
            }
            if (!z) {
                getActivity().finish();
            }
        }
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$SearchResultReceiver();
    }

    public final void write(String str) {
        if (this.eKycFab != null) {
            Picasso.read().write(str).read(this.eKycFab, (FragmentBuilder_BindEkycFragment) null);
            FloatingActionButton floatingActionButton = this.eKycFab;
            getResources();
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(0));
            FloatingActionButton floatingActionButton2 = this.eKycFab;
            if (floatingActionButton2.IconCompatParcelizer == null) {
                floatingActionButton2.IconCompatParcelizer = floatingActionButton2.write();
            }
            floatingActionButton2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((nContextSetPriority.IconCompatParcelizer) null, true);
            this.eKycFab.setOnClickListener(new ActivityBuilder_ContributeDepositExportStatementActivity(this));
        }
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        access$2200 access_2200 = new access$2200();
        access_2200.IconCompatParcelizer = getString(R.string.error_generic_resource);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.NAVIGATE_BACK;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 1 || this.MediaBrowserCompat$MediaItem == null) {
            super.onActivityResult(i, i2, intent);
            getActivity().finish();
            return;
        }
        if (i2 == -1) {
            if (intent == null) {
                String str = this.MediaDescriptionCompat;
                if (str != null) {
                    uriArr = new Uri[]{Uri.parse(str)};
                    this.MediaBrowserCompat$MediaItem.onReceiveValue(uriArr);
                    this.MediaBrowserCompat$MediaItem = null;
                }
            } else {
                String dataString = intent.getDataString();
                if (dataString != null) {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                    this.MediaBrowserCompat$MediaItem.onReceiveValue(uriArr);
                    this.MediaBrowserCompat$MediaItem = null;
                }
            }
        }
        uriArr = null;
        this.MediaBrowserCompat$MediaItem.onReceiveValue(uriArr);
        this.MediaBrowserCompat$MediaItem = null;
    }

    private static File MediaBrowserCompat$ItemReceiver() throws IOException {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("JPEG_");
        sb.append(format);
        sb.append("_");
        return File.createTempFile(sb.toString(), ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    class IconCompatParcelizer extends WebChromeClient {
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(PartnerWebViewFragment partnerWebViewFragment, byte b) {
            this();
        }

        public final void onProgressChanged(WebView webView, int i) {
            if (i >= 20) {
                PartnerWebViewFragment.this.ay_();
            }
        }

        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (PartnerWebViewFragment.this.MediaBrowserCompat$MediaItem != null) {
                PartnerWebViewFragment.this.MediaBrowserCompat$MediaItem.onReceiveValue((Object) null);
            }
            ValueCallback unused = PartnerWebViewFragment.this.MediaBrowserCompat$MediaItem = valueCallback;
            if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(PartnerWebViewFragment.this.getContext(), PartnerWebViewFragment.MediaBrowserCompat$CustomActionResultReceiver)) {
                PartnerWebViewFragment.this.MediaBrowserCompat$CustomActionResultReceiver();
                return true;
            }
            ActivityBuilder_ContributeECouponCommonActivity.MediaBrowserCompat$ItemReceiver(PartnerWebViewFragment.this);
            PartnerWebViewFragment.this.MediaBrowserCompat$MediaItem.onReceiveValue((Object) null);
            ValueCallback unused2 = PartnerWebViewFragment.this.MediaBrowserCompat$MediaItem = null;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r0.<init>(r1)
            android.content.Context r1 = r5.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            r2 = 0
            if (r1 == 0) goto L_0x004d
            java.io.File r1 = MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x0024 }
            java.lang.String r3 = "PhotoPath"
            java.lang.String r4 = r5.MediaDescriptionCompat     // Catch:{ IOException -> 0x0022 }
            r0.putExtra(r3, r4)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0029
        L_0x0022:
            r3 = move-exception
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            r1 = r2
        L_0x0026:
            p040o.onCheckBoxClick.write((java.lang.Throwable) r3)
        L_0x0029:
            if (r1 == 0) goto L_0x004c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file:"
            r2.append(r3)
            java.lang.String r3 = r1.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.MediaDescriptionCompat = r2
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            java.lang.String r2 = "output"
            r0.putExtra(r2, r1)
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.GET_CONTENT"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r1.addCategory(r2)
            java.lang.String r2 = "image/*"
            r1.setType(r2)
            r2 = 0
            if (r0 == 0) goto L_0x0067
            r3 = 1
            android.content.Intent[] r3 = new android.content.Intent[r3]
            r3[r2] = r0
            goto L_0x0069
        L_0x0067:
            android.content.Intent[] r3 = new android.content.Intent[r2]
        L_0x0069:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.CHOOSER"
            r0.<init>(r2)
            java.lang.String r2 = "android.intent.extra.INTENT"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "android.intent.extra.TITLE"
            java.lang.String r2 = "Image Chooser"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "android.intent.extra.INITIAL_INTENTS"
            r0.putExtra(r1, r3)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            MediaBrowserCompat$ItemReceiver((androidx.fragment.app.Fragment) r5, (android.content.Intent) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.landingpage.PartnerWebViewFragment.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public static /* synthetic */ void RatingCompat(PartnerWebViewFragment partnerWebViewFragment) {
        partnerWebViewFragment.mBaseWebView.stopLoading();
        partnerWebViewFragment.MediaBrowserCompat$SearchResultReceiver();
    }
}

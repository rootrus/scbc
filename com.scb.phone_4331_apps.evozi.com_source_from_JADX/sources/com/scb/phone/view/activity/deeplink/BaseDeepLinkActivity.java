package com.scb.phone.view.activity.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.activity.p038tc.JuristicEasyAppTermsAndConditionsActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.fragment.prelogin.PreloadConfigFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import dagger.Lazy;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7536ud;
import p040o.C7538uf;
import p040o.C7541ui;
import p040o.C7542uj;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_KtaExceptionResponseDeserializer_Factory;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceAutocompleteFragment;
import p040o.PlaceEntity;
import p040o.RegularImmutableBiMap;
import p040o.ResultPair;
import p040o.ZTRSM;
import p040o.cancelSubmission;
import p040o.createBundleFromClientSettings;
import p040o.getEventLogSize;
import p040o.getServerTimeout;
import p040o.join;
import p040o.nativeAreEdgesInView;
import p040o.nativeGetDocumentRectangle;
import p040o.nativeGetTurnGuidance;
import p040o.nativeGetVerticalMovementGuidance;
import p040o.nativeGetZoomGuidance;
import p040o.nativeIsAspectRatioWithinLimits;
import p040o.nativeIsInternalContrastLowerThanThreshold;
import p040o.removeIfFromRandomAccessList;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.zzmd;

public abstract class BaseDeepLinkActivity extends BaseActivity implements IdCaptureModule_KtaExceptionResponseDeserializer_Factory {
    public BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat = "deepLinkId";
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @HmlPinActivity
    public nativeIsAspectRatioWithinLimits baseDeepLinkPresenter;
    @HmlPinActivity
    public createBundleFromClientSettings ctaCase;
    @HmlPinActivity
    public Lazy<RegularImmutableBiMap> errorDisplayMapperLazy;
    @HmlPinActivity
    public join getShowInputDialogRequiredCase;
    @HmlPinActivity
    public zzmd pidAppKillChecker;

    /* access modifiers changed from: protected */
    public void ActionMenuPresenter$OverflowMenuButton() {
    }

    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(Intent intent, String str);

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract boolean mo14202x50fd9e4a();

    /* access modifiers changed from: protected */
    public int MediaSessionCompat$Token() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public boolean setMenu() {
        return false;
    }

    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Activity activity, Intent intent) {
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((BaseDeepLinkActivity) activity).startActivityForResult(read, 102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        ActionMenuPresenter$OverflowMenuButton();
        this.baseDeepLinkPresenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        ZTRSM ztrsm = new ZTRSM();
        Uri data = intent.getData();
        if (data != null) {
            String host = data.getHost();
            String path = data.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(path);
            ztrsm.read("domain", sb.toString());
            if (!data.isOpaque()) {
                for (String next : data.getQueryParameterNames()) {
                    ztrsm.read(next, data.getQueryParameter(next));
                }
            }
        }
        this.scbAnalytics.IconCompatParcelizer = ztrsm.write();
        ztrsm.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "deeplink");
        nativeIsAspectRatioWithinLimits nativeisaspectratiowithinlimits = this.baseDeepLinkPresenter;
        boolean MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo14202x50fd9e4a();
        boolean z2 = false;
        if (nativeisaspectratiowithinlimits.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver()) {
            nativeGetTurnGuidance nativegetturnguidance = nativeGetTurnGuidance.IconCompatParcelizer;
            if (nativeisaspectratiowithinlimits.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                nativegetturnguidance.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
            }
        } else {
            if (nativeisaspectratiowithinlimits.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()) {
                String IconCompatParcelizer = nativeisaspectratiowithinlimits.write.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
                if (!(!(IconCompatParcelizer == null || IconCompatParcelizer.length() == 0))) {
                    nativeIsInternalContrastLowerThanThreshold nativeisinternalcontrastlowerthanthreshold = nativeIsInternalContrastLowerThanThreshold.write;
                    if (nativeisaspectratiowithinlimits.RatingCompat != null) {
                        z2 = true;
                    }
                    if (z2) {
                        nativeisinternalcontrastlowerthanthreshold.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
                    }
                }
            }
            createBundleFromClientSettings createbundlefromclientsettings = nativeisaspectratiowithinlimits.write;
            if (!(!createbundlefromclientsettings.MediaMetadataCompat.IconCompatParcelizer.IconCompatParcelizer() || createbundlefromclientsettings.IconCompatParcelizer.read())) {
                if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver() - nativeisaspectratiowithinlimits.MediaDescriptionCompat.IconCompatParcelizer.read() <= 300000 || !nativeisaspectratiowithinlimits.write.MediaMetadataCompat.IconCompatParcelizer.IconCompatParcelizer()) {
                    z = false;
                } else {
                    nativeisaspectratiowithinlimits.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(false);
                    z = true;
                }
                if (!z) {
                    if (!MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                        nativeGetDocumentRectangle nativegetdocumentrectangle = nativeGetDocumentRectangle.write;
                        if (nativeisaspectratiowithinlimits.RatingCompat != null) {
                            z2 = true;
                        }
                        if (z2) {
                            nativegetdocumentrectangle.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
                        }
                    } else if (nativeisaspectratiowithinlimits.write.MediaMetadataCompat.IconCompatParcelizer.IconCompatParcelizer()) {
                        nativeGetDocumentRectangle nativegetdocumentrectangle2 = nativeGetDocumentRectangle.write;
                        if (nativeisaspectratiowithinlimits.RatingCompat != null) {
                            z2 = true;
                        }
                        if (z2) {
                            nativegetdocumentrectangle2.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
                        }
                    }
                }
            }
            nativeisaspectratiowithinlimits.read = true;
            nativeGetVerticalMovementGuidance nativegetverticalmovementguidance = nativeGetVerticalMovementGuidance.IconCompatParcelizer;
            if (nativeisaspectratiowithinlimits.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                nativegetverticalmovementguidance.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
            }
        }
        this.pidAppKillChecker.read.edit().putInt("PROCESS_ID", Process.myPid()).apply();
    }

    @Deprecated
    private boolean MediaSessionCompat$QueueItem() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.getBoolean("IS_NEED_HISTORY_STACK", false)) {
            return false;
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        nativeIsAspectRatioWithinLimits nativeisaspectratiowithinlimits = this.baseDeepLinkPresenter;
        boolean MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo14202x50fd9e4a();
        int MediaSessionCompat$Token = MediaSessionCompat$Token();
        String stringExtra = getIntent().getStringExtra("userMode");
        if (!nativeisaspectratiowithinlimits.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver()) {
            boolean IconCompatParcelizer = nativeisaspectratiowithinlimits.IconCompatParcelizer(MediaSessionCompat$Token, stringExtra);
            boolean z = true;
            if (!nativeisaspectratiowithinlimits.read && MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver && !nativeisaspectratiowithinlimits.write.MediaMetadataCompat.IconCompatParcelizer.IconCompatParcelizer() && IconCompatParcelizer) {
                nativeGetZoomGuidance nativegetzoomguidance = nativeGetZoomGuidance.MediaBrowserCompat$ItemReceiver;
                if (nativeisaspectratiowithinlimits.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    nativegetzoomguidance.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
                }
            } else if (!nativeisaspectratiowithinlimits.read && !IconCompatParcelizer && !nativeisaspectratiowithinlimits.IconCompatParcelizer) {
                nativeAreEdgesInView nativeareedgesinview = nativeAreEdgesInView.IconCompatParcelizer;
                if (nativeisaspectratiowithinlimits.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    nativeareedgesinview.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
                }
            }
        }
    }

    public final void IconCompatParcelizer(String str, String str2, boolean z) {
        if (z) {
            if (this.ParcelableVolumeInfo != null) {
                getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
                geteventlogsize.read = true;
                geteventlogsize.MediaSessionCompat$QueueItem.RatingCompat.IconCompatParcelizer(true);
            }
            ad_();
            return;
        }
        AlertController$RecycleListView();
        if (str == null && this.ParcelableVolumeInfo != null) {
            str = this.ParcelableVolumeInfo.write(this);
        }
        this.MediaMetadataCompat = this.ctaCase.MediaBrowserCompat$ItemReceiver(str, str2).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new C7541ui(this), new cancelSubmission(this));
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(PlaceEntity.zzb zzb) throws Exception {
        aj_();
        LogFileManager.DirectoryProvider MediaBrowserCompat$ItemReceiver = this.baseDeepLinkPresenter.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(zzb);
        if (MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper == PlaceAutocompleteFragment.DEVICE_IS_REGISTERED) {
            boolean IconCompatParcelizer = this.baseDeepLinkPresenter.IconCompatParcelizer(MediaSessionCompat$Token(), getIntent().getStringExtra("userMode"));
            if (!MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem) {
                if (!IconCompatParcelizer) {
                    aa_();
                } else if (mo14202x50fd9e4a()) {
                    Intent write = PinLoginActivity.write((Context) this);
                    IntentTidInjectionActivityAspect.aspectOf();
                    MediaBrowserCompat$ItemReceiver(this, write);
                } else {
                    Intent intent = getIntent();
                    IconCompatParcelizer(intent, intent.getStringExtra(this.MediaDescriptionCompat));
                }
            } else if (setTitleOptional() == zzmd.zzm.zzb.zza.INDIVIDUAL) {
                Intent read = PinLoginActivity.read(this, MediaBrowserCompat$ItemReceiver);
                IntentTidInjectionActivityAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(this, read).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                    sb.append(read2.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    startActivityForResult(read2, 103);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                Intent read3 = JuristicEasyAppTermsAndConditionsActivity.read(this, MediaBrowserCompat$ItemReceiver, true);
                IntentTidInjectionActivityAspect.aspectOf();
                try {
                    Intent read4 = setTapText.write(this, read3).read();
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                    sb2.append(read4.getData());
                    sb2.append("\n with context ");
                    sb2.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                    startActivityForResult(read4, 104);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        } else if (zzb.AppCompatDelegateImpl$ListMenuDecorView == PlaceAutocompleteFragment.NTB) {
            Intent intent2 = getIntent();
            IconCompatParcelizer(intent2, intent2.getStringExtra(this.MediaDescriptionCompat));
        } else {
            this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(zzb);
            this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final /* synthetic */ void setUiOptions() throws Exception {
        getIntent();
        aj_();
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            MediaSessionCompat$ResultReceiverWrapper();
        } else {
            mo14210S_();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            if (i2 == -1) {
                Intent intent2 = getIntent();
                IconCompatParcelizer(intent2, intent2.getStringExtra(this.MediaDescriptionCompat));
            } else {
                Intent intent3 = getIntent();
                if (DiskLruCache.VERSION_1.equals(intent3 != null ? intent3.getStringExtra("inApp") : null) || MediaSessionCompat$QueueItem()) {
                    finish();
                } else {
                    mo14210S_();
                }
            }
        }
        if (i == 101) {
            if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
                MediaSessionCompat$ResultReceiverWrapper();
            } else if (setMenu()) {
                Intent flags = new Intent(this, SplashActivity.class).setFlags(268468224);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(this, flags).read();
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
            } else {
                mo14210S_();
            }
        }
        if (i != 103 && i != 104) {
            return;
        }
        if (i2 == -1) {
            Intent intent4 = getIntent();
            IconCompatParcelizer(intent4, intent4.getStringExtra(this.MediaDescriptionCompat));
            return;
        }
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        Intent putExtra = new Intent(this, HomeActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.notification_tab);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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

    /* access modifiers changed from: protected */
    /* renamed from: S_ */
    public void mo14210S_() {
        Intent intent = new Intent(getApplicationContext(), setOverlayMode() ? NTBLandingActivity.class : HomeActivity.class);
        intent.addFlags(268468224).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
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
        finishAffinity();
    }

    /* access modifiers changed from: protected */
    public boolean setOverlayMode() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity.EXTRA_FROM_NTB", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: R_ */
    public final void mo14209R_() {
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("fragment_config");
        if (findFragmentByTag != null) {
            supportFragmentManager.read().write(findFragmentByTag).write();
        }
        this.MediaBrowserCompat$MediaItem = setChildDrawingOrderCallback.IconCompatParcelizer(this, new IntentFilter("com.scb.phone/BROADCAST_PRELOAD_CONFIG")).subscribe(new C7536ud(this), C7542uj.MediaBrowserCompat$CustomActionResultReceiver);
        PreloadConfigFragment preloadConfigFragment = new PreloadConfigFragment();
        preloadConfigFragment.setCancelable(false);
        preloadConfigFragment.show(supportFragmentManager, "fragment_config");
    }

    /* renamed from: V_ */
    public final void mo14213V_() {
        Intent write = PinLoginActivity.write((Context) this);
        IntentTidInjectionActivityAspect.aspectOf();
        MediaBrowserCompat$ItemReceiver(this, write);
    }

    /* renamed from: T_ */
    public final void mo14211T_() {
        nativeIsAspectRatioWithinLimits nativeisaspectratiowithinlimits = this.baseDeepLinkPresenter;
        int MediaSessionCompat$Token = MediaSessionCompat$Token();
        String stringExtra = getIntent().getStringExtra("userMode");
        boolean z = true;
        nativeisaspectratiowithinlimits.IconCompatParcelizer = true;
        if (nativeisaspectratiowithinlimits.IconCompatParcelizer(MediaSessionCompat$Token, stringExtra)) {
            ResultPair resultPair = ResultPair.write;
            if (nativeisaspectratiowithinlimits.RatingCompat == null) {
                z = false;
            }
            if (z) {
                resultPair.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
                return;
            }
            return;
        }
        nativeAreEdgesInView nativeareedgesinview = nativeAreEdgesInView.IconCompatParcelizer;
        if (nativeisaspectratiowithinlimits.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nativeareedgesinview.IconCompatParcelizer(nativeisaspectratiowithinlimits.RatingCompat);
        }
    }

    /* renamed from: W_ */
    public final void mo14214W_() {
        Intent intent = getIntent();
        IconCompatParcelizer(intent, intent.getStringExtra(this.MediaDescriptionCompat));
    }

    /* renamed from: U_ */
    public final void mo14212U_() {
        IconCompatParcelizer((String) null, (String) null, false);
    }

    /* access modifiers changed from: protected */
    public final void read(Intent intent) {
        boolean MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        Intent intent2 = getIntent();
        boolean equals = DiskLruCache.VERSION_1.equals(intent2 != null ? intent2.getStringExtra("inApp") : null);
        if (MediaSessionCompat$QueueItem || equals) {
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
            return;
        }
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb2.append(read2.getData());
            sb2.append("\n with context ");
            sb2.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
            startActivityForResult(read2, 101);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: a_ */
    public final void mo14215a_(Throwable th) {
        aj_();
        write(this.errorDisplayMapperLazy.get().MediaBrowserCompat$ItemReceiver(th, (Runnable) new getServerTimeout(this, th)));
    }

    public final /* synthetic */ void setWindowCallback() {
        getIntent();
        aj_();
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            MediaSessionCompat$ResultReceiverWrapper();
        } else {
            mo14210S_();
        }
    }

    public final void aa_() {
        write(this.errorDisplayMapperLazy.get().MediaBrowserCompat$ItemReceiver(R.string.deep_link_switch_user_mode_dialog_title, R.string.deep_link_switch_user_mode_dialog_message, new C7538uf(this)));
    }

    public final /* synthetic */ void ActionMenuView() {
        getIntent();
        aj_();
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            MediaSessionCompat$ResultReceiverWrapper();
        } else {
            mo14210S_();
        }
    }

    /* renamed from: Z_ */
    public final void mo13803Z_() {
        SplashActivity.IconCompatParcelizer(this);
    }
}

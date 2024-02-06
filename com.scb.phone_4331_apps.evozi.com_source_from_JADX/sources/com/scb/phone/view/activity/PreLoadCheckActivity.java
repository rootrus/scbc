package com.scb.phone.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.akexorcist.localizationactivity.LocalizationActivity;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.scb.phone.R;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.activity.demo.ntb.RegistrationActivity;
import com.scb.phone.view.activity.forgotpin.PinLockActivity;
import com.scb.phone.view.activity.hml.HmlNTBPinDisabledActivity;
import com.scb.phone.view.activity.maintenance.MaintenanceActivity;
import com.scb.phone.view.activity.p038tc.EasyAppTermsAndConditionsActivity;
import com.scb.phone.view.activity.p038tc.JuristicEasyAppTermsAndConditionsActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.activity.registration.RegistrationTermsAndConsActivity;
import com.scb.phone.view.activity.registration.preregistration.PreregistrationLandingActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.activity.theme.ThemesActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.FullScreenProgressDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Locale;
import java.util.Set;
import p040o.AlertController$RecycleListView;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceAutocompleteFragment;
import p040o.QueueFile;
import p040o.ZipFileBundle;
import p040o.getBelowMinRearImageSize;
import p040o.getEventLogSize;
import p040o.getEventLogSize$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getEventLogSize$MediaBrowserCompat$ItemReceiver;
import p040o.onCheckBoxClick;
import p040o.onGetLayoutInflater;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzmd;

public abstract class PreLoadCheckActivity extends LocalizationActivity implements getBelowMinRearImageSize, getEventLogSize$MediaBrowserCompat$ItemReceiver {
    private Handler IconCompatParcelizer;
    private Runnable MediaBrowserCompat$ItemReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    boolean f2526x50fd9e4a = false;
    public Runnable MediaSessionCompat$QueueItem = new ZipFileBundle.C7091b(this);
    public getEventLogSize ParcelableVolumeInfo;
    public boolean RatingCompat = true;
    private FullScreenProgressDialog write;

    public void af_() {
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((PreLoadCheckActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void ActionBarContextView() {
        Runnable runnable = this.MediaBrowserCompat$ItemReceiver;
        if (runnable != null) {
            runOnUiThread(runnable);
        }
    }

    public void onDestroy() {
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        if (geteventlogsize != null) {
            geteventlogsize.onDestroy();
        }
        this.ParcelableVolumeInfo = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaSessionCompat$QueueItem = null;
        Handler handler = this.IconCompatParcelizer;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.IconCompatParcelizer = null;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(getEventLogSize geteventlogsize, getBelowMinRearImageSize getbelowminrearimagesize) {
        this.ParcelableVolumeInfo = geteventlogsize;
        if (geteventlogsize != null) {
            geteventlogsize.MediaDescriptionCompat = this;
            this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(getbelowminrearimagesize);
            this.ParcelableVolumeInfo.MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.RatingCompat(getClass().getName());
            this.ParcelableVolumeInfo.PlaybackStateCompat$CustomAction = true;
            this.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem = true ^ (this instanceof PinLoginActivity);
        }
    }

    /* renamed from: g_ */
    public final void mo13812g_(String str) {
        if (str != null) {
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
    }

    public final void MediaBrowserCompat$MediaItem(LogFileManager.DirectoryProvider directoryProvider) {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToLandingPage", new Object[0]);
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        if (this.ParcelableVolumeInfo.read()) {
            write(ThemesActivity.MediaBrowserCompat$CustomActionResultReceiver(this, directoryProvider));
        } else {
            HomeActivity.read((Context) this, directoryProvider);
        }
    }

    public void MediaSessionCompat$QueueItem(LogFileManager.DirectoryProvider directoryProvider) {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToLandingPage", new Object[0]);
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
    }

    private void write(Intent intent) {
        AlertController$RecycleListView();
        Handler handler = new Handler();
        this.IconCompatParcelizer = handler;
        handler.postDelayed(new PreLoadCheckActivity$MediaBrowserCompat$ItemReceiver(this, intent), 200);
    }

    public final void MediaMetadataCompat(LogFileManager.DirectoryProvider directoryProvider) {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToLockPin", new Object[0]);
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        Intent intent = new Intent(this, PinLockActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("JURISTIC_MODE_KEY", zzmd.zzm.zzb.zza.JURISTIC.equals(setTitleOptional()));
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
    }

    public final void IconCompatParcelizer(LogFileManager.DirectoryProvider directoryProvider, boolean z) {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToTermsAndConditions", new Object[0]);
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        write(EasyAppTermsAndConditionsActivity.IconCompatParcelizer(this, directoryProvider, z));
    }

    public final void RatingCompat(LogFileManager.DirectoryProvider directoryProvider) {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToJuristicTermsAndConditions", new Object[0]);
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        write(JuristicEasyAppTermsAndConditionsActivity.read(this, directoryProvider, false));
    }

    public final void ParcelableVolumeInfo(LogFileManager.DirectoryProvider directoryProvider) {
        Intent read = PinLoginActivity.read(this, directoryProvider);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void ai_() {
        boolean z = false;
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToDeviceNotFound", new Object[0]);
        this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(zzmd.zzm.zzb.zza.INDIVIDUAL);
        this.ParcelableVolumeInfo.AlertController$RecycleListView.edit().putString("com.scb.phone.pref.key.LANGUAGE", "th").apply();
        onGetLayoutInflater.MediaBrowserCompat$CustomActionResultReceiver(new Locale("th").getLanguage());
        read(new Locale("th"));
        Intent intent = new Intent(this, RegistrationActivity.class);
        intent.addFlags(268468224);
        if (getIntent() != null) {
            boolean equals = "android.intent.action.MAIN".equals(getIntent().getAction());
            Set<String> categories = getIntent().getCategories();
            boolean z2 = categories != null && categories.contains("android.intent.category.LAUNCHER");
            if (equals && z2) {
                z = true;
            }
        }
        if (z) {
            write(intent);
            return;
        }
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
    }

    public final void setHideOnContentScrollEnabled() {
        Intent IconCompatParcelizer2 = RegistrationTermsAndConsActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer2).read();
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

    public final void ah_() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("redirectToBranchRegistrationActivation", new Object[0]);
        Intent intent = new Intent(this, PreregistrationLandingActivity.class);
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
    }

    /* renamed from: Z_ */
    public void mo13803Z_() {
        SplashActivity.IconCompatParcelizer(this);
    }

    public final void MediaDescriptionCompat(LogFileManager.DirectoryProvider directoryProvider) {
        Intent intent = new Intent(this, MaintenanceActivity.class);
        intent.putExtra("TAG_DATA", directoryProvider);
        intent.addFlags(268468224);
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
    }

    public final void MediaBrowserCompat$ItemReceiver(LogFileManager.DirectoryProvider directoryProvider) {
        if (getApplicationContext() != null && directoryProvider != null && directoryProvider.MediaSessionCompat$ResultReceiverWrapper != null) {
            Intent IconCompatParcelizer2 = ErrorPageActivity.IconCompatParcelizer(this, directoryProvider.MediaSessionCompat$ResultReceiverWrapper.code, directoryProvider.MediaMetadataCompat, directoryProvider.MediaDescriptionCompat);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, IconCompatParcelizer2).read();
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
    }

    /* access modifiers changed from: protected */
    public final void ActionBarOverlayLayout() {
        if (this.ParcelableVolumeInfo != null && AlertController$RecycleListView.RatingCompat(getClass().getName())) {
            if (this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()) {
                MediaSessionCompat$Token(false);
                return;
            }
            getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
            geteventlogsize.write(geteventlogsize.write(this), geteventlogsize.MediaSessionCompat$QueueItem.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(), this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaBrowserCompat$ItemReceiver(), this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaDescriptionCompat());
        }
    }

    /* access modifiers changed from: protected */
    public final void setLogo() {
        if (this.ParcelableVolumeInfo == null || !AlertController$RecycleListView.RatingCompat(getClass().getName())) {
            getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
            if (geteventlogsize != null) {
                geteventlogsize.read(geteventlogsize.write(this), (String) null, this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaBrowserCompat$ItemReceiver(), this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaDescriptionCompat());
                return;
            }
            return;
        }
        getEventLogSize geteventlogsize2 = this.ParcelableVolumeInfo;
        geteventlogsize2.read(geteventlogsize2.write(this), geteventlogsize2.MediaSessionCompat$QueueItem.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(), this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaBrowserCompat$ItemReceiver(), this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaDescriptionCompat());
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$Token(LogFileManager.DirectoryProvider directoryProvider) {
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        if (geteventlogsize != null) {
            geteventlogsize.f2831x50fd9e4a = directoryProvider;
        }
    }

    /* access modifiers changed from: protected */
    public final void setHasNonEmbeddedTabs() {
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        if (geteventlogsize != null) {
            geteventlogsize.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* access modifiers changed from: protected */
    public final void ParcelableVolumeInfo(boolean z) {
        this.f2526x50fd9e4a = z;
    }

    /* access modifiers changed from: protected */
    public final boolean setActionBarHideOffset() {
        return this.f2526x50fd9e4a;
    }

    public void aj_() {
        FullScreenProgressDialog fullScreenProgressDialog;
        if (!isFinishing() && (fullScreenProgressDialog = this.write) != null && fullScreenProgressDialog.isShowing()) {
            this.write.dismiss();
            this.write = null;
        }
    }

    public final void setCustomView() {
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        if (geteventlogsize.RatingCompat != null) {
            geteventlogsize.RatingCompat.AlertController$RecycleListView();
        }
        geteventlogsize.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver();
        geteventlogsize.MediaSessionCompat$Token.IconCompatParcelizer(new getEventLogSize$MediaBrowserCompat$CustomActionResultReceiver(geteventlogsize, (byte) 0));
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            applicationContext.deleteDatabase("webview.db");
            applicationContext.deleteDatabase("webviewCache.db");
        }
    }

    public zzmd.zzm.zzb.zza setTitleOptional() {
        return this.ParcelableVolumeInfo.write();
    }

    public final void write(zzmd.zzm.zzb.zza zza) {
        this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(zza);
    }

    public final void setShowingForActionMode() {
        this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(zzmd.zzm.zzb.zza.INDIVIDUAL);
        MediaSessionCompat$Token(true);
    }

    public final void setMenuPrepared() {
        this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(zzmd.zzm.zzb.zza.JURISTIC);
        MediaSessionCompat$Token(true);
    }

    public void MediaSessionCompat$Token(boolean z) {
        ZipFileBundle.C7090a aVar = new ZipFileBundle.C7090a(this);
        this.MediaBrowserCompat$ItemReceiver = aVar;
        if (z) {
            runOnUiThread(aVar);
        }
    }

    public final void ag_() {
        runOnUiThread(this.MediaSessionCompat$QueueItem);
    }

    /* renamed from: f_ */
    public final void mo13811f_(String str) {
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        geteventlogsize.read(geteventlogsize.write(this), str, this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaBrowserCompat$ItemReceiver(), this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.RatingCompat.MediaDescriptionCompat());
    }

    /* renamed from: h_ */
    public final void mo13813h_(String str) {
        mo3028a_(str);
    }

    /* renamed from: y_ */
    public final boolean mo13825y_() {
        return !AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
    }

    public final void ae_() {
        finishAffinity();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(i2);
            finish();
        }
    }

    public final /* synthetic */ void setActionBarVisibilityCallback() {
        if (!this.RatingCompat) {
            this.MediaBrowserCompat$ItemReceiver = null;
        } else if (isFinishing()) {
            this.MediaBrowserCompat$ItemReceiver = null;
        } else {
            if (!isFinishing() && !this.f2526x50fd9e4a) {
                this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.write();
                aj_();
                mo13803Z_();
            }
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    /* renamed from: a_ */
    public final void mo13804a_(LogFileManager.DirectoryProvider directoryProvider) {
        if (this.RatingCompat || !isFinishing()) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
            String string = IconCompatParcelizer2.read.getString(R.string.common_error);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                IconCompatParcelizer2.mTitleTextView.setText(string);
            }
            String str = directoryProvider.MediaBrowserCompat$ItemReceiver;
            if (true ^ (str == null || str.length() == 0)) {
                IconCompatParcelizer2.mTextTextView.setVisibility(0);
                IconCompatParcelizer2.mTextTextView.setText(str);
            }
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ok), new ZipFileBundle(this, directoryProvider));
            IconCompatParcelizer3.setCancelable(false);
            IconCompatParcelizer3.show();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(LogFileManager.DirectoryProvider directoryProvider) {
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        HmlNTBPinDisabledActivity.write write2 = HmlNTBPinDisabledActivity.MediaBrowserCompat$MediaItem;
        boolean z = directoryProvider.MediaSessionCompat$ResultReceiverWrapper == PlaceAutocompleteFragment.NTB_PIN_DISABLED_ALT;
        onGetStartedClick.write((Object) this, "context");
        Intent putExtra = new Intent(this, HmlNTBPinDisabledActivity.class).putExtra("PIN_EXPIRED_FLAG", z);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBPi…RED_FLAG, pinExpiredFlag)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaSessionCompat$ResultReceiverWrapper(LogFileManager.DirectoryProvider directoryProvider) {
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        Intent intent = new Intent(this, NTBLandingActivity.class);
        intent.putExtra("NTB_DATA", directoryProvider.MediaBrowserCompat$MediaItem);
        intent.addFlags(268468224);
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
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13794x50fd9e4a(LogFileManager.DirectoryProvider directoryProvider) {
        this.ParcelableVolumeInfo.read(directoryProvider, mo3026D_());
        Intent intent = new Intent(this, OnBoardingTutorialActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_WHITE_TUTORIAL", directoryProvider);
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
        overridePendingTransition(0, 0);
    }

    public void AlertController$RecycleListView() {
        write(new QueueFile());
    }

    public final void write(QueueFile queueFile) {
        if (this.RatingCompat || !isFinishing()) {
            if (this.write == null) {
                FullScreenProgressDialog fullScreenProgressDialog = new FullScreenProgressDialog(this);
                fullScreenProgressDialog.title.setText(queueFile.MediaBrowserCompat$ItemReceiver);
                fullScreenProgressDialog.description.setText(queueFile.write);
                this.write = fullScreenProgressDialog;
            }
            if (!isFinishing() && !this.f2526x50fd9e4a && !this.write.isShowing()) {
                this.write.show();
            }
        }
    }
}

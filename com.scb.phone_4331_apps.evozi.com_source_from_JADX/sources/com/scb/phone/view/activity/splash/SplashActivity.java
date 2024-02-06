package com.scb.phone.view.activity.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.service.SCBClearAppFromRecentService;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.ContactUsActivity_ViewBinding;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.computeSInt32SizeNoTag;
import p040o.getClsId;
import p040o.getEventLogSize;
import p040o.getPercentAverageImageContrast;
import p040o.getThreadSize;
import p040o.infoWindowAnchor;
import p040o.onCheckBoxClick;
import p040o.onGetLayoutInflater;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.synthesizeReportFile;
import p040o.zzrp;

public class SplashActivity extends BaseActivity implements getPercentAverageImageContrast {
    @HmlPinActivity
    public getThreadSize splashPresenter;

    public final void MenuItemWrapperICS$CollapsibleActionViewWrapper() {
    }

    public static void IconCompatParcelizer(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        intent.setFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        Boolean bool;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        mo3028a_(this.splashPresenter.read.write.setCheckable());
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 4194304) != 0) {
            finish();
            return;
        }
        boolean z = true;
        requestWindowFeature(1);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setContentHeight();
        this.splashPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (!AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(getApplicationContext())) {
            MediaSessionCompat$Token(getString(R.string.error_connection));
            return;
        }
        if (this.ParcelableVolumeInfo != null) {
            getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
            infoWindowAnchor infowindowanchor = geteventlogsize.MediaMetadataCompat;
            infowindowanchor.MediaBrowserCompat$ItemReceiver(infowindowanchor.write(), new synthesizeReportFile(geteventlogsize));
        }
        getThreadSize getthreadsize = this.splashPresenter;
        zzrp MediaBrowserCompat$ItemReceiver = getthreadsize.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            bool = MediaBrowserCompat$ItemReceiver.read;
        } else {
            bool = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
            computeSInt32SizeNoTag computesint32sizenotag = new computeSInt32SizeNoTag(getthreadsize);
            if (getthreadsize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                computesint32sizenotag.IconCompatParcelizer(getthreadsize.RatingCompat);
            }
        }
        try {
            startService(new Intent(this, SCBClearAppFromRecentService.class));
        } catch (IllegalStateException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("ISE, due Baground limitation in version Oreo onwards", new Object[0]);
        }
    }

    public void attachBaseContext(Context context) {
        onGetLayoutInflater.write(context, onGetLayoutInflater.read(context));
        super.attachBaseContext(ContactUsActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(onGetLayoutInflater.write(context)));
    }

    public final void af_() {
        super.af_();
        getClsId getclsid = (getClsId) getIntent().getParcelableExtra("com.scb.phone.EXTRA_CONFIG");
        if (this.ParcelableVolumeInfo == null || getclsid == null) {
            setLogo();
        } else {
            this.ParcelableVolumeInfo.read(getclsid.MediaBrowserCompat$ItemReceiver, getclsid.MediaDescriptionCompat, getclsid.RatingCompat, getclsid.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public void onDestroy() {
        this.splashPresenter.onDestroy();
        super.onDestroy();
    }

    public final void write(String str, String str2, String str3) {
        this.scbAnalytics.write("starting_application_delay", new ZSYR2K("errorDateTime", str), new ZSYR2K("delayTime", str2), new ZSYR2K("errorCount", str3));
    }

    public void onStop() {
        super.onStop();
        this.splashPresenter.onDestroy();
        finish();
    }
}

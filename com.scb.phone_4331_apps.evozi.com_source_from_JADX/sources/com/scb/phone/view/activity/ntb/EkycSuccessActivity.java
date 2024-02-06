package com.scb.phone.view.activity.ntb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.registration.RegistrationOtpActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.C4067bB;
import p040o.C4179cg;
import p040o.C9866bN;
import p040o.C9878cb;
import p040o.HmlPinActivity;
import p040o.Injector;
import p040o.Iterables;
import p040o.KtaJsonCheck;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.getFiles;
import p040o.getInjector;
import p040o.getSurfaceView;
import p040o.getVideoPlayerCameraRecorder;
import p040o.logEventNoInterceptor;
import p040o.setTapText;

public class EkycSuccessActivity extends BaseActivity implements KtaJsonCheck.ParcelableVolumeInfo {
    private blend MediaMetadataCompat = new blend();
    @BindView
    LinearLayout accountTypeLayout;
    @HmlPinActivity
    public C4179cg ekycSuccessPresenter;
    @BindView
    LinearLayout remarkLayout;
    @BindView
    public TextView successTitle;
    @BindView
    TextView textAccountNumber;
    @BindView
    TextView textDateTime;
    @BindView
    TextView textFullName;
    @BindView
    TextView textHomeBranch;
    @BindView
    TextView tvAccountType;
    @BindView
    TextView tvFixedRemark;
    @BindView
    TextView tvRemark;

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77742131492999);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.ekycSuccessPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4179cg cgVar = this.ekycSuccessPresenter;
        getFiles getfiles = (getFiles) getIntent().getParcelableExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_CONFIRMATION_DISPLAY");
        cgVar.MediaMetadataCompat = getfiles.MediaBrowserCompat$SearchResultReceiver;
        boolean z = false;
        if (getfiles.MediaBrowserCompat$CustomActionResultReceiver != null && !getfiles.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            C4067bB bBVar = new C4067bB(getfiles);
            if (cgVar.RatingCompat != null) {
                bBVar.IconCompatParcelizer(cgVar.RatingCompat);
            }
        }
        if (getfiles.MediaBrowserCompat$MediaItem != null && !getfiles.MediaBrowserCompat$MediaItem.isEmpty()) {
            Injector injector = new Injector(getfiles);
            if (cgVar.RatingCompat != null) {
                injector.IconCompatParcelizer(cgVar.RatingCompat);
            }
        }
        getSurfaceView getsurfaceview = new getSurfaceView(getfiles);
        if (cgVar.RatingCompat != null) {
            getsurfaceview.IconCompatParcelizer(cgVar.RatingCompat);
        }
        String MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo34009x50fd9e4a();
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == null || MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.length() == 0) {
            z = true;
        }
        if (!z) {
            blend blend = this.MediaMetadataCompat;
            String write = this.ekycSuccessPresenter.IconCompatParcelizer.write();
            blend.read("source", MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            if (write != null && "touchpoint".equals(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver)) {
                blend.read("customer_group", write);
            }
        }
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ekyc_success");
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String mo34009x50fd9e4a() {
        return getIntent().getStringExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_FIREBASE_SOURCE");
    }

    public final void write(String str, String str2, String str3, String str4) {
        this.textDateTime.setText(str);
        this.textFullName.setText(str2);
        this.textAccountNumber.setText(str3);
        this.textHomeBranch.setText(str4);
    }

    @OnClick
    public void onClick() {
        C4179cg cgVar = this.ekycSuccessPresenter;
        if (cgVar != null) {
            if (cgVar.write.IconCompatParcelizer.MediaBrowserCompat$MediaItem() != null) {
                cgVar.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer(cgVar.write.IconCompatParcelizer.MediaBrowserCompat$MediaItem().booleanValue());
            } else if (cgVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat() != null) {
                cgVar.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer(cgVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat().booleanValue());
            } else if (cgVar.read.MediaBrowserCompat$CustomActionResultReceiver.write().MediaSessionCompat$QueueItem != null) {
                cgVar.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer(cgVar.read.MediaBrowserCompat$CustomActionResultReceiver.write().MediaSessionCompat$QueueItem.booleanValue());
            }
            if (Iterables.C35284.BANKING_SERVICES.name().equals(cgVar.IconCompatParcelizer.IconCompatParcelizer())) {
                logEventNoInterceptor logeventnointerceptor = cgVar.MediaBrowserCompat$SearchResultReceiver;
                logeventnointerceptor.read(logeventnointerceptor.read(), new getVideoPlayerCameraRecorder(cgVar), new getInjector(cgVar));
                return;
            }
            boolean z = true;
            if (cgVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver()) {
                C9866bN bNVar = C9866bN.MediaBrowserCompat$CustomActionResultReceiver;
                if (cgVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bNVar.IconCompatParcelizer(cgVar.RatingCompat);
                }
            } else if (!DiskLruCache.VERSION_1.equals(cgVar.MediaMetadataCompat) || cgVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver()) {
                C9878cb cbVar = C9878cb.MediaBrowserCompat$ItemReceiver;
                if (cgVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cbVar.IconCompatParcelizer(cgVar.RatingCompat);
                }
            } else {
                C9866bN bNVar2 = C9866bN.MediaBrowserCompat$CustomActionResultReceiver;
                if (cgVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bNVar2.IconCompatParcelizer(cgVar.RatingCompat);
                }
            }
        }
    }

    public final void read() {
        setHideOnContentScrollEnabled();
    }

    public final void IconCompatParcelizer(String str) {
        this.accountTypeLayout.setVisibility(0);
        this.tvAccountType.setText(str);
    }

    public final void write(String str) {
        this.remarkLayout.setVisibility(0);
        this.tvFixedRemark.setVisibility(8);
        this.tvRemark.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HomeActivity.write((Context) this, true);
    }

    public final void write() {
        Intent intent = new Intent(this, RegistrationOtpActivity.class);
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
    }
}

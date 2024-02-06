package com.scb.phone.view.activity.remittance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.remittance.RemittanceInputActivity;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C5005nI;
import p040o.HmlPinActivity;
import p040o.Lists;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setImportance;
import p040o.setTapText;

public final class RemittanceOtpActivity extends BaseOtpActivity implements ServerProjectProvider.Error {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    private Unbinder MediaBrowserCompat$MediaItem;
    private setImportance MediaDescriptionCompat;
    @HmlPinActivity
    public C5005nI presenter;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78042131493029);
        Unbinder MediaBrowserCompat$ItemReceiver = ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "ButterKnife.bind(this)");
        this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver;
        this.MediaDescriptionCompat = (setImportance) getIntent().getParcelableExtra("EXTRA_REVIEW_DISPLAY");
        C5005nI nIVar = this.presenter;
        if (nIVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nIVar.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().findFragmentById(R.id.container) instanceof OtpPinFragment) {
            super.onBackPressed();
        } else {
            read();
        }
    }

    public final void write(String str, String str2) {
        setImportance setimportance = this.MediaDescriptionCompat;
        if (setimportance != null) {
            C5005nI nIVar = this.presenter;
            if (nIVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setimportance, "reviewDisplay");
            if (nIVar.RatingCompat != null) {
                nIVar.RatingCompat.AlertController$RecycleListView();
            }
            Lists.TransformingSequentialList.C35951 r3 = nIVar.read;
            String str3 = setimportance.PlaybackStateCompat$CustomAction;
            if (str3 == null) {
                str3 = "";
            }
            r3.read(str3, str2, str, new C5005nI.IconCompatParcelizer(nIVar, setimportance), new C5005nI.read(nIVar));
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        write(this, R.id.container, str, getOversizeImage.ERROR);
    }

    public final void write(setImportance setimportance) {
        onGetStartedClick.write((Object) setimportance, "successDisplay");
        RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver remittanceSuccessActivity$MediaBrowserCompat$ItemReceiver = RemittanceSuccessActivity.MediaDescriptionCompat;
        Intent read = RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver.read(this, setimportance);
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
    }

    public final void read() {
        RemittanceInputActivity.read read = RemittanceInputActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, RemittanceInputActivity.class);
        intent.setFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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
    }

    public final void onDestroy() {
        super.onDestroy();
        Unbinder unbinder = this.MediaBrowserCompat$MediaItem;
        if (unbinder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unbinder");
        }
        unbinder.read();
    }
}

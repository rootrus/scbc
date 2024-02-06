package com.scb.phone.view.activity.hml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.C5987x6eec40cb;
import com.scb.phone.view.fragment.hml.HmlETBCalculatorFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerCalculatorFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.AlertController$RecycleListView;
import p040o.C4025ah;
import p040o.HmlPinActivity;
import p040o.IdentityServiceException;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.trimSessionFiles;
import p040o.zzct;
import p040o.zzjx;

public final class HmlETBLandingActivity extends BaseHmlLandingActivity {
    public static final C5607x23cfbb87 MediaBrowserCompat$MediaItem = new C5607x23cfbb87((byte) 0);
    @HmlPinActivity
    public C4025ah presenter;

    public final void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        C4025ah ahVar = this.presenter;
        if (ahVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ahVar.MediaBrowserCompat$ItemReceiver(this);
        C4025ah ahVar2 = this.presenter;
        if (ahVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ahVar2.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(trimSessionFiles trimsessionfiles) {
        onGetStartedClick.write((Object) trimsessionfiles, "display");
        Intent read = HmlSimulatorTutorialActivity.read(getApplicationContext(), trimsessionfiles);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            C4025ah ahVar = this.presenter;
            if (ahVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            ahVar.IconCompatParcelizer();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C5987x6eec40cb hmlETBCalculatorFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlETBCalculatorFragment.RatingCompat;
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Enum enumR = zzjx.zza.zzb.GENERAL;
        int intExtra = intent.getIntExtra("PRODUCT_TYPE_ARG", -1);
        if (intExtra >= 0) {
            enumR = zzjx.zza.zzb.values()[intExtra];
        }
        zzjx.zza.zzb zzb = (zzjx.zza.zzb) enumR;
        String stringExtra = getIntent().getStringExtra("LEAD_TYPE");
        onGetStartedClick.write((Object) zzb, "productType");
        HmlETBCalculatorFragment hmlETBCalculatorFragment = new HmlETBCalculatorFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PRODUCT_TYPE_ARG", zzb);
        if (stringExtra != null) {
            bundle.putString("LEAD_TYPE", stringExtra);
        }
        hmlETBCalculatorFragment.setArguments(bundle);
        Fragment fragment = hmlETBCalculatorFragment;
        onGetStartedClick.write((Object) fragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, fragment, (String) null).write();
    }

    public final void read() {
        HmlBusinessOwnerCalculatorFragment.write write = HmlBusinessOwnerCalculatorFragment.MediaDescriptionCompat;
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Enum enumR = zzjx.zza.zzb.GENERAL;
        int intExtra = intent.getIntExtra("PRODUCT_TYPE_ARG", -1);
        if (intExtra >= 0) {
            enumR = zzjx.zza.zzb.values()[intExtra];
        }
        zzjx.zza.zzb zzb = (zzjx.zza.zzb) enumR;
        onGetStartedClick.write((Object) zzb, "productType");
        HmlBusinessOwnerCalculatorFragment hmlBusinessOwnerCalculatorFragment = new HmlBusinessOwnerCalculatorFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PRODUCT_TYPE_ARG", zzb);
        hmlBusinessOwnerCalculatorFragment.setArguments(bundle);
        Fragment fragment = hmlBusinessOwnerCalculatorFragment;
        onGetStartedClick.write((Object) fragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, fragment, (String) null).write();
    }

    public final void onDestroy() {
        C4025ah ahVar = this.presenter;
        if (ahVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ahVar.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "customerType");
        int i = IdentityServiceException.IconCompatParcelizer[zza.ordinal()];
        if (i == 1) {
            MediaSessionCompat$QueueItem(getString(R.string.hml_landing_title));
        } else if (i == 2) {
            MediaSessionCompat$QueueItem(getString(R.string.hml_business_owner_landing_title));
        }
    }
}

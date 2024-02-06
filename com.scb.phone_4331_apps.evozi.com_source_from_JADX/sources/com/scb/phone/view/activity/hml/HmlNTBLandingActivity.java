package com.scb.phone.view.activity.hml;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.fragment.hml.C5994x28b99a94;
import com.scb.phone.view.fragment.hml.HmlNTBCalculatorFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.C4025ah;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.trimSessionFiles;
import p040o.zzjx;

public final class HmlNTBLandingActivity extends BaseHmlLandingActivity {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    @HmlPinActivity
    public C4025ah presenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent write(Context context, zzjx.zza.zzb zzb) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) zzb, "productType");
            Intent putExtra = new Intent(context, HmlNTBLandingActivity.class).putExtra("PRODUCT_TYPE_ARG", zzb);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBLa…CT_TYPE_ARG, productType)");
            return putExtra;
        }
    }

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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C5994x28b99a94 hmlNTBCalculatorFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCalculatorFragment.MediaBrowserCompat$SearchResultReceiver;
        Serializable serializableExtra = getIntent().getSerializableExtra("PRODUCT_TYPE_ARG");
        if (serializableExtra != null) {
            zzjx.zza.zzb zzb = (zzjx.zza.zzb) serializableExtra;
            String stringExtra = getIntent().getStringExtra("LEAD_TYPE");
            onGetStartedClick.write((Object) zzb, "productType");
            HmlNTBCalculatorFragment hmlNTBCalculatorFragment = new HmlNTBCalculatorFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("PRODUCT_TYPE_ARG", zzb);
            if (stringExtra != null) {
                bundle.putString("LEAD_TYPE", stringExtra);
            }
            hmlNTBCalculatorFragment.setArguments(bundle);
            Fragment fragment = hmlNTBCalculatorFragment;
            onGetStartedClick.write((Object) fragment, "fragment");
            getSupportFragmentManager().read().write(R.id.container, fragment, (String) null).write();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.hml.HmlProductType");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(trimSessionFiles trimsessionfiles) {
        onGetStartedClick.write((Object) trimsessionfiles, "display");
        HmlNTBSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver hmlNTBSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver = HmlNTBSimulatorTutorialActivity.MediaBrowserCompat$MediaItem;
        Context applicationContext = getApplicationContext();
        onGetStartedClick.IconCompatParcelizer((Object) applicationContext, "applicationContext");
        onGetStartedClick.write((Object) applicationContext, "context");
        onGetStartedClick.write((Object) trimsessionfiles, "simulatorTutorialDisplay");
        Intent putExtra = new Intent(applicationContext, HmlNTBSimulatorTutorialActivity.class).putExtra("SIMULATOR_DISPLAY", trimsessionfiles);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBSi…simulatorTutorialDisplay)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void onDestroy() {
        C4025ah ahVar = this.presenter;
        if (ahVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ahVar.onDestroy();
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, NTBLandingActivity.class);
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
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }
}

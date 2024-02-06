package com.scb.phone.view.activity.partner;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ParseException;
import android.net.Uri;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import p040o.C4301du;
import p040o.Functions;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2300;
import p040o.du$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getAboveMaxRearImageSize;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

public final class PartnerAuthorizationActivity extends BaseActivity implements getAboveMaxRearImageSize {
    public static final PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public C4301du presenter;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        return PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(context, str);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.MediaBrowserCompat$MediaItem = getIntent().getStringExtra("com.scb.phone.view.activity.partner.EXTRA_DENY_URL");
        HashMap hashMap = null;
        if (getIntent().getStringExtra(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) != null) {
            str = getIntent().getStringExtra(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        } else if (getIntent().getSerializableExtra("EXTRA_PARAMS") != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_PARAMS");
            if (serializableExtra != null) {
                str = (String) ((HashMap) serializableExtra).get(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any?> /* = java.util.HashMap<kotlin.String, kotlin.Any?> */");
            }
        } else {
            str = null;
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra("EXTRA_PARAMS");
        if (serializableExtra2 instanceof HashMap) {
            hashMap = serializableExtra2;
        }
        HashMap hashMap2 = hashMap;
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        C4301du duVar = this.presenter;
        if (duVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        duVar.MediaBrowserCompat$ItemReceiver(this);
        C4301du duVar2 = this.presenter;
        if (duVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str2 = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) hashMap2, "queryMap");
        boolean z = true;
        if (duVar2.RatingCompat != null) {
            duVar2.RatingCompat.AlertController$RecycleListView();
        }
        if (str != null) {
            LinkedListMultimap.ValueForKeyIterator valueForKeyIterator = duVar2.IconCompatParcelizer;
            FundFactSheetActivity iconCompatParcelizer = new C4301du.IconCompatParcelizer(duVar2, str2);
            FundFactSheetActivity du_mediabrowsercompat_customactionresultreceiver = new du$MediaBrowserCompat$CustomActionResultReceiver(duVar2);
            onGetStartedClick.write((Object) iconCompatParcelizer, "onSuccess");
            onGetStartedClick.write((Object) du_mediabrowsercompat_customactionresultreceiver, "onError");
            onGetStartedClick.write((Object) str, "appId");
            onGetStartedClick.write((Object) hashMap2, "queryMap");
            hashMap2.remove(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            valueForKeyIterator.IconCompatParcelizer(valueForKeyIterator.read, iconCompatParcelizer, du_mediabrowsercompat_customactionresultreceiver, new Functions.read(str, hashMap2));
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C4301du.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (duVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(duVar2.RatingCompat);
        }
    }

    public final void write(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.putExtras(getIntent());
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
        } catch (ParseException unused) {
            finish();
        } catch (ActivityNotFoundException unused2) {
            finish();
        } catch (NullPointerException unused3) {
            finish();
        }
    }

    public final void IconCompatParcelizer() {
        C4301du duVar = this.presenter;
        if (duVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        duVar.MediaBrowserCompat$ItemReceiver(R.string.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }
}

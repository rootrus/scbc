package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C1160x44733d2;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getLegacySharedPrefs;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class EasycashInputIncomeActivity extends BaseActivity implements C1160x44733d2 {
    public static final EasycashInputIncomeActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new EasycashInputIncomeActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public static final void MediaBrowserCompat$ItemReceiver(Context context, getLegacySharedPrefs getlegacysharedprefs) {
        MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(context, getlegacysharedprefs);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77552131492980);
    }

    public final getLegacySharedPrefs write() {
        return (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        if (getIntent().getStringExtra("com.scb.phone.view.activity.easycash.EXTRA_TRANSACTION_ID") == null) {
            return "";
        }
        String stringExtra = getIntent().getStringExtra("com.scb.phone.view.activity.easycash.EXTRA_TRANSACTION_ID");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(EXTRA_TRANSACTION_ID)");
        return stringExtra;
    }

    public static final void MediaBrowserCompat$CustomActionResultReceiver(Context context, getLegacySharedPrefs getlegacysharedprefs, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) getlegacysharedprefs, "tileDisplay");
        onGetStartedClick.write((Object) str, "ncbTransactionId");
        Intent intent = new Intent(context, EasycashInputIncomeActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_TRANSACTION_ID", str);
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

    public final String read() {
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
        if (getlegacysharedprefs != null) {
            return getlegacysharedprefs.MediaMetadataCompat;
        }
        return null;
    }

    public final String IconCompatParcelizer() {
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
        if (getlegacysharedprefs != null) {
            return getlegacysharedprefs.MediaSessionCompat$Token;
        }
        return null;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
        if (getlegacysharedprefs != null) {
            return getlegacysharedprefs.MediaDescriptionCompat;
        }
        return null;
    }

    public final String MediaMetadataCompat() {
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
        if (getlegacysharedprefs != null) {
            return getlegacysharedprefs.MediaBrowserCompat$MediaItem;
        }
        return null;
    }
}

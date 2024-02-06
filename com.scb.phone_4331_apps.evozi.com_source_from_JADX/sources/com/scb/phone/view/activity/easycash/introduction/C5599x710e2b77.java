package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import p040o.Onboarding;
import p040o.getLegacySharedPrefs;

/* renamed from: com.scb.phone.view.activity.easycash.introduction.EasycashMCMCIntroductionActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5599x710e2b77 {
    private C5599x710e2b77() {
    }

    public /* synthetic */ C5599x710e2b77(byte b) {
        this();
    }

    public static Intent read(Context context, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        Intent intent = new Intent(context, EasycashMCMCIntroductionActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        return intent;
    }
}

package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.investment.scbs.AddAccountInfoFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.getPitch;
import p040o.onGetStartedClick;

public final class AddAccountInfoActivity extends BaseActivityWithFragment {
    public static final AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public getPitch presenter;

    public final String au_() {
        Bundle extras;
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Context context = this;
        Intent intent = getIntent();
        int i = 0;
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            i = extras.getInt("EXTRA_FLOW_TYPE", 0);
        }
        return getPitch.IconCompatParcelizer(context, i);
    }

    public static final void write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, AddAccountInfoActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", 0);
        IntentTidInjectionContextAspect.aspectOf();
        AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver.write(context, intent);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        Bundle extras;
        Intent intent = getIntent();
        int i = 0;
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            i = extras.getInt("EXTRA_FLOW_TYPE", 0);
        }
        AddAccountInfoFragment IconCompatParcelizer = AddAccountInfoFragment.IconCompatParcelizer(i);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "AddAccountInfoFragment.newInstance(flowType)");
        return IconCompatParcelizer;
    }
}

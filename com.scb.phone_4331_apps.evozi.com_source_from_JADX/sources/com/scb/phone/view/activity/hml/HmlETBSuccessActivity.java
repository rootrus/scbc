package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.hml.HmlETBOfflineSuccessFragment;
import com.scb.phone.view.fragment.hml.HmlETBOnlineSuccessFragment;
import com.scb.phone.view.fragment.hml.businessowner.C6017xfbbdecc7;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerProgressFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerProgressSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlETBSuccessActivity extends HmlBaseSuccessActivity {
    public static final C5610xd0499873 MediaMetadataCompat = new C5610xd0499873((byte) 0);

    public final String MediaSessionCompat$QueueItem() {
        return "etb";
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlETBOnlineSuccessFragment.write write = HmlETBOnlineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
        HmlETBOnlineSuccessFragment hmlETBOnlineSuccessFragment = new HmlETBOnlineSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putString("intent", getIntent().getStringExtra("intent"));
        bundle.putString("utm_content", getIntent().getStringExtra("utm_content"));
        bundle.putString("utm_campaign", getIntent().getStringExtra("utm_campaign"));
        bundle.putString("utm_source", getIntent().getStringExtra("utm_source"));
        bundle.putString("utm_medium", getIntent().getStringExtra("utm_medium"));
        hmlETBOnlineSuccessFragment.setArguments(bundle);
        Fragment fragment = hmlETBOnlineSuccessFragment;
        onGetStartedClick.write((Object) fragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, fragment, (String) null).write();
    }

    public final void IconCompatParcelizer() {
        HmlETBOfflineSuccessFragment.write write = HmlETBOfflineSuccessFragment.IconCompatParcelizer;
        Fragment hmlETBOfflineSuccessFragment = new HmlETBOfflineSuccessFragment();
        onGetStartedClick.write((Object) hmlETBOfflineSuccessFragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, hmlETBOfflineSuccessFragment, (String) null).write();
    }

    public final void write() {
        HmlBusinessOwnerProgressFragment.read read = HmlBusinessOwnerProgressFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Fragment hmlBusinessOwnerProgressFragment = new HmlBusinessOwnerProgressFragment();
        onGetStartedClick.write((Object) hmlBusinessOwnerProgressFragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, hmlBusinessOwnerProgressFragment, (String) null).write();
    }

    public final void read() {
        C6017xfbbdecc7 hmlBusinessOwnerProgressSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOwnerProgressSuccessFragment.IconCompatParcelizer;
        Fragment hmlBusinessOwnerProgressSuccessFragment = new HmlBusinessOwnerProgressSuccessFragment();
        onGetStartedClick.write((Object) hmlBusinessOwnerProgressSuccessFragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, hmlBusinessOwnerProgressSuccessFragment, (String) null).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer(getBaseContext());
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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

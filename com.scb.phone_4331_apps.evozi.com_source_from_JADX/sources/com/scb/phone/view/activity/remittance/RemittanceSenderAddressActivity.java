package com.scb.phone.view.activity.remittance;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.RemittanceInputFragment;
import com.scb.phone.view.fragment.remittance.RemittanceSenderAddressFragment;
import p040o.C5000nE;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.onGetStartedClick;
import p040o.setBackground;

public final class RemittanceSenderAddressActivity extends BaseActivityWithFragment implements FragmentBuilder_BindChangeChannelStatementReviewFragment.write {
    public static final RemittanceSenderAddressActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new RemittanceSenderAddressActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final void am_() {
    }

    public final void write(Fragment fragment) {
    }

    public final void write(String str) {
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        RemittanceSenderAddressFragment.IconCompatParcelizer iconCompatParcelizer = RemittanceSenderAddressFragment.MediaBrowserCompat$CustomActionResultReceiver;
        RemittanceSenderAddressFragment remittanceSenderAddressFragment = new RemittanceSenderAddressFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_ADDRESS_TYPE", 0);
        bundle.putParcelable("KEY_ADDRESS_DISPLAY", (setBackground) getIntent().getParcelableExtra("EXTRA_ADDRESS"));
        remittanceSenderAddressFragment.setArguments(bundle);
        return remittanceSenderAddressFragment;
    }

    public final String au_() {
        String string = getString(R.string.remittance_sender_address_page_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…ender_address_page_title)");
        return string;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onDestroy() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof RemittanceInputFragment) {
            C5000nE nEVar = ((RemittanceInputFragment) findFragmentById).presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nEVar.MediaMetadataCompat.write.IconCompatParcelizer();
            nEVar.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
        super.onDestroy();
    }
}

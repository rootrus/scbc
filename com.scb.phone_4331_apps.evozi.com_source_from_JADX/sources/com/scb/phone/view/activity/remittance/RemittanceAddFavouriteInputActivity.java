package com.scb.phone.view.activity.remittance;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.remittance.RemittanceInputFragment;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.onGetStartedClick;

public final class RemittanceAddFavouriteInputActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        RemittanceInputFragment.read read = RemittanceInputFragment.IconCompatParcelizer;
        return RemittanceInputFragment.read.IconCompatParcelizer(C3092xce3d994b.Builder.ADD_FAVOURITE, (C3088x7e3e3ebd.C30891) null);
    }

    public final String au_() {
        String string = getString(R.string.remittance_input_add_favourite_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…nput_add_favourite_title)");
        return string;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }
}

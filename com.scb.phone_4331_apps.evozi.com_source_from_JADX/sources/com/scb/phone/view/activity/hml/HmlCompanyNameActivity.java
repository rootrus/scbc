package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlCompanyNameFragment;
import com.scb.phone.view.fragment.hml.HmlCompanyNameFragment$MediaBrowserCompat$ItemReceiver;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;
import p040o.onGetStartedClick;

public class HmlCompanyNameActivity extends BaseActivityWithFragment implements FragmentBuilder_BindBaseGiftTransferInputFragment {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_company_search_activity_title);
        if (string == null) {
            string = "";
        }
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_c…rch_activity_title) ?: \"\"");
        return string;
    }

    public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        setResult(0, new Intent());
        finish();
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, HmlCompanyNameActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlCompanyNameFragment$MediaBrowserCompat$ItemReceiver hmlCompanyNameFragment$MediaBrowserCompat$ItemReceiver = HmlCompanyNameFragment.IconCompatParcelizer;
        return new HmlCompanyNameFragment();
    }

    public void onBackPressed() {
        setResult(0, new Intent());
        finish();
    }
}

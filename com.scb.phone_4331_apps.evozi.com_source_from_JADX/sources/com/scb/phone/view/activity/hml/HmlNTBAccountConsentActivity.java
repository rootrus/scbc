package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlNTBAccountConsentFragment;
import p040o.AlertController$RecycleListView;
import p040o.onGetStartedClick;

public final class HmlNTBAccountConsentActivity extends BaseActivityWithFragment {
    public static final C5612xf9bffa7e MediaDescriptionCompat = new C5612xf9bffa7e((byte) 0);

    public final int MediaSessionCompat$Token() {
        return R.layout.f77942131493019;
    }

    public final String au_() {
        String string = getString(R.string.hml_consent_terms_and_conditions);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_c…ent_terms_and_conditions)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlNTBAccountConsentFragment.read read = HmlNTBAccountConsentFragment.IconCompatParcelizer;
        Intent intent = getIntent();
        Bundle bundle = null;
        String write = AlertController$RecycleListView.write(intent != null ? intent.getExtras() : null, "BUNDLE_PRODUCT_CODE");
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bundle = intent2.getExtras();
        }
        String write2 = AlertController$RecycleListView.write(bundle, "BUNDLE_OBJECTIVE_ID");
        onGetStartedClick.write((Object) write, "depositProductCode");
        onGetStartedClick.write((Object) write2, "objectiveCode");
        Bundle bundle2 = new Bundle();
        bundle2.putString("BUNDLE_PRODUCT_CODE", write);
        bundle2.putString("BUNDLE_OBJECTIVE_ID", write2);
        bundle2.putBoolean("BUNDLE_ACCOUNT_OPEN_CONSENT_FRAGMENT", true);
        HmlNTBAccountConsentFragment hmlNTBAccountConsentFragment = new HmlNTBAccountConsentFragment();
        hmlNTBAccountConsentFragment.setArguments(bundle2);
        return hmlNTBAccountConsentFragment;
    }
}

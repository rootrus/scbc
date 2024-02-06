package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.RegistrationCardDetailFragment;
import java.io.Serializable;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.KtaServiceCaller;
import p040o.onGetStartedClick;
import p040o.parseProcMapsJsonFromStream;

public final class RegistrationDeadCardActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public KtaServiceCaller.C35611 presenter;

    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public final String au_() {
        return "";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KtaServiceCaller.C35611 r2 = this.presenter;
        if (r2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        r2.MediaBrowserCompat$ItemReceiver(this);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        String stringExtra = getIntent().getStringExtra("EXTRA_CARD_NO");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(EXTRA_CARD_NO)");
        String stringExtra2 = getIntent().getStringExtra("EXTRA_LIMIT");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(EXTRA_LIMIT)");
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_FLOW_TYPE");
        onGetStartedClick.IconCompatParcelizer((Object) serializableExtra, "intent.getSerializableExtra(EXTRA_FLOW_TYPE)");
        RegistrationCardDetailFragment read = RegistrationCardDetailFragment.read(KtaServiceCaller.C35611.MediaBrowserCompat$ItemReceiver(serializableExtra), stringExtra, stringExtra2);
        onGetStartedClick.IconCompatParcelizer((Object) read, "RegistrationCardDetailFr… flowType, cardNo, limit)");
        return read;
    }

    public static final Intent read(Context context, String str, String str2, parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "cardNo");
        onGetStartedClick.write((Object) str2, "limit");
        onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flowType");
        Intent intent = new Intent(context, RegistrationDeadCardActivity.class);
        intent.putExtra("EXTRA_CARD_NO", str);
        intent.putExtra("EXTRA_LIMIT", str2);
        intent.putExtra("EXTRA_FLOW_TYPE", parseprocmapsjsonfromstream);
        return intent;
    }
}

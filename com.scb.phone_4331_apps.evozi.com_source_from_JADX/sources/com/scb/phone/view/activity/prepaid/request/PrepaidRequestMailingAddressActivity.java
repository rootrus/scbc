package com.scb.phone.view.activity.prepaid.request;

import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import p040o.FragmentBuilder_BindCcSofSuccessFragment;
import p040o.getRam;
import p040o.onGetStartedClick;

public final class PrepaidRequestMailingAddressActivity extends BaseActivityWithFragment implements FragmentBuilder_BindCcSofSuccessFragment {
    public static final C5699x8a3f8ad4 MediaDescriptionCompat = new C5699x8a3f8ad4((byte) 0);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.getExtras();
     */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment mo13702x50fd9e4a() {
        /*
            r4 = this;
            com.scb.phone.view.fragment.prepaid.request.PrepaidRequestMailingAddressFragment$write r0 = com.scb.phone.view.fragment.prepaid.request.PrepaidRequestMailingAddressFragment.MediaBrowserCompat$CustomActionResultReceiver
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "EXTRA_PREPAID_REQUEST_MAILING_ADDRESS"
            if (r0 == 0) goto L_0x0017
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0017
            android.os.Parcelable r0 = r0.getParcelable(r1)
            o.AutoValue_CrashlyticsReport_CustomAttribute r0 = (p040o.AutoValue_CrashlyticsReport_CustomAttribute) r0
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            com.scb.phone.view.fragment.prepaid.request.PrepaidRequestMailingAddressFragment r2 = new com.scb.phone.view.fragment.prepaid.request.PrepaidRequestMailingAddressFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.putParcelable(r1, r0)
            r2.setArguments(r3)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.prepaid.request.PrepaidRequestMailingAddressActivity.mo13702x50fd9e4a():androidx.fragment.app.Fragment");
    }

    public final String au_() {
        String string = getString(R.string.prepaid_request_mailing_address_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…st_mailing_address_title)");
        return string;
    }

    public final void read(getRam getram) {
        onGetStartedClick.write((Object) getram, "mailingAddressDisplay");
        Intent putExtra = new Intent().putExtra("EXTRA_PREPAID_REQUEST_MAILING_ADDRESS", getram);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent().putExtra(EXTRA_…S, mailingAddressDisplay)");
        setResult(-1, putExtra);
        finish();
    }
}

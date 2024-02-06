package com.scb.phone.view.activity.csent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.csent.SensitiveCSentFragment;
import java.io.Serializable;
import p040o.CrashlyticsReportJsonTransform$$Lambda$6;
import p040o.onGetStartedClick;

public final class SensitiveCSentActivity extends BaseActivityWithFragment {
    public static final read MediaBrowserCompat$SearchResultReceiver = new read((byte) 0);

    public static final Intent read(Context context, CrashlyticsReportJsonTransform$$Lambda$6 crashlyticsReportJsonTransform$$Lambda$6) {
        return read.MediaBrowserCompat$ItemReceiver(context, crashlyticsReportJsonTransform$$Lambda$6);
    }

    public final String au_() {
        return "";
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, CrashlyticsReportJsonTransform$$Lambda$6 crashlyticsReportJsonTransform$$Lambda$6) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) crashlyticsReportJsonTransform$$Lambda$6, "subType");
            Intent intent = new Intent(context, SensitiveCSentActivity.class);
            intent.putExtra("activity.csent.EXTRA_SUB_TYPE", crashlyticsReportJsonTransform$$Lambda$6);
            return intent;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        SensitiveCSentFragment.write write = SensitiveCSentFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Serializable serializableExtra = getIntent().getSerializableExtra("activity.csent.EXTRA_SUB_TYPE");
        if (!(serializableExtra instanceof CrashlyticsReportJsonTransform$$Lambda$6)) {
            serializableExtra = null;
        }
        SensitiveCSentFragment sensitiveCSentFragment = new SensitiveCSentFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("activity.csent.EXTRA_SUB_TYPE", (CrashlyticsReportJsonTransform$$Lambda$6) serializableExtra);
        sensitiveCSentFragment.setArguments(bundle);
        return sensitiveCSentFragment;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("activity.csent.EXTRA_SUB_TYPE");
        if (!(serializableExtra instanceof CrashlyticsReportJsonTransform$$Lambda$6)) {
            serializableExtra = null;
        }
        CrashlyticsReportJsonTransform$$Lambda$6 crashlyticsReportJsonTransform$$Lambda$6 = (CrashlyticsReportJsonTransform$$Lambda$6) serializableExtra;
        if (crashlyticsReportJsonTransform$$Lambda$6 != null && (str = crashlyticsReportJsonTransform$$Lambda$6.firebaseTag) != null) {
            mo13676d_(str);
        }
    }
}

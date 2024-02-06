package com.scb.phone.view.activity.hml.submission;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.submission.C6028x5f422799;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentSubmissionFragment;
import com.scb.phone.view.fragment.hml.submission.HmlNTBDocumentSubmissionFragment;
import p040o.onGetStartedClick;
import p040o.setPersonalShortCuts;

public final class HmlNTBDocumentSubmissionActivity extends HmlDocumentSubmissionActivity {
    public static final C5636xa7b1c218 MediaMetadataCompat = new C5636xa7b1c218((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        C6028x5f422799 hmlNTBDocumentSubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionFragment.IconCompatParcelizer;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_SUBMISSTION_TYPE");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(HML_SUBMISSTION_TYPE)");
        return C6028x5f422799.MediaBrowserCompat$ItemReceiver((setPersonalShortCuts) parcelableExtra);
    }

    public final /* synthetic */ HmlDocumentSubmissionFragment setContentView() {
        C6028x5f422799 hmlNTBDocumentSubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionFragment.IconCompatParcelizer;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_SUBMISSTION_TYPE");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(HML_SUBMISSTION_TYPE)");
        return C6028x5f422799.MediaBrowserCompat$ItemReceiver((setPersonalShortCuts) parcelableExtra);
    }
}

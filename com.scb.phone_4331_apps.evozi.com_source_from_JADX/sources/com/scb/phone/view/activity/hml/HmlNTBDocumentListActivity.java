package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlNTBDocumentListFragment;
import kotlin.TypeCastException;
import p040o.CrashlyticsController;
import p040o.onGetStartedClick;
import p040o.zzwe;

public final class HmlNTBDocumentListActivity extends HmlDocumentListActivity {
    public static final C5616x989c1ea MediaBrowserCompat$MediaItem = new C5616x989c1ea((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlNTBDocumentListFragment.read read = HmlNTBDocumentListFragment.MediaBrowserCompat$SearchResultReceiver;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_DOC_INFO");
        if (parcelableExtra != null) {
            CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) parcelableExtra;
            Parcelable parcelableExtra2 = getIntent().getParcelableExtra("HML_DOC_FILE_VALIDATION_LIMIT");
            if (parcelableExtra2 != null) {
                zzwe.read read2 = (zzwe.read) parcelableExtra2;
                onGetStartedClick.write((Object) fileNameContainsFilter, "hmlSelectedSubmissionDocument");
                onGetStartedClick.write((Object) read2, "limit");
                HmlNTBDocumentListFragment hmlNTBDocumentListFragment = new HmlNTBDocumentListFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("HML_DOC_INFO", fileNameContainsFilter);
                bundle.putParcelable("HML_DOC_FILE_VALIDATION_LIMIT", read2);
                hmlNTBDocumentListFragment.setArguments(bundle);
                return hmlNTBDocumentListFragment;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.HMLDocumentUploads.HMLDocumentValidation");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.submission.HmlSelectedSubmissionDocument");
    }
}

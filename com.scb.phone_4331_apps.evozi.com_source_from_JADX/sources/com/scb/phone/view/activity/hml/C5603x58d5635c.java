package com.scb.phone.view.activity.hml;

import android.os.Parcelable;
import kotlin.TypeCastException;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsController;
import p040o.FundActionsSuccessActivity;

/* renamed from: com.scb.phone.view.activity.hml.HmlDocumentListActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5603x58d5635c extends CheckEligibilityActivity implements FundActionsSuccessActivity<CrashlyticsController.FileNameContainsFilter> {
    private /* synthetic */ HmlDocumentListActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5603x58d5635c(HmlDocumentListActivity hmlDocumentListActivity) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlDocumentListActivity;
    }

    public final /* synthetic */ Object invoke() {
        Parcelable parcelableExtra = this.MediaBrowserCompat$CustomActionResultReceiver.getIntent().getParcelableExtra("HML_DOC_INFO");
        if (parcelableExtra != null) {
            return (CrashlyticsController.FileNameContainsFilter) parcelableExtra;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.submission.HmlSelectedSubmissionDocument");
    }
}

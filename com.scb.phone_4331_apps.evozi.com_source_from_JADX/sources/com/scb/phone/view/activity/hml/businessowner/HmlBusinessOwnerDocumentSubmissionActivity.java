package com.scb.phone.view.activity.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentSubmissionFragment;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;
import p040o.setDoubleTapZoomDpi;
import p040o.setPersonalShortCuts;

public final class HmlBusinessOwnerDocumentSubmissionActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent IconCompatParcelizer(Context context, setPersonalShortCuts setpersonalshortcuts) {
            onGetStartedClick.write((Object) setpersonalshortcuts, "flowType");
            Intent putExtra = new Intent(context, HmlBusinessOwnerDocumentSubmissionActivity.class).putExtra("HML_SUBMISSTION_TYPE", setpersonalshortcuts);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(ctx, HmlBusinessO…, flowType as Parcelable)");
            return putExtra;
        }
    }

    public final String au_() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_SUBMISSTION_TYPE");
        if (parcelableExtra == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.presenter.hml.SubmissionFlowType");
        } else if (setDoubleTapZoomDpi.MediaBrowserCompat$CustomActionResultReceiver[((setPersonalShortCuts) parcelableExtra).ordinal()] != 1) {
            String string = getString(R.string.hml_document_submission_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_d…ment_submission_activity)");
            return string;
        } else {
            String string2 = getString(R.string.hml_document_re_submission_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_d…t_re_submission_activity)");
            return string2;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlDocumentSubmissionFragment.IconCompatParcelizer iconCompatParcelizer = HmlDocumentSubmissionFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_SUBMISSTION_TYPE");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(HML_SUBMISSTION_TYPE)");
        return HmlDocumentSubmissionFragment.IconCompatParcelizer.read((setPersonalShortCuts) parcelableExtra);
    }
}

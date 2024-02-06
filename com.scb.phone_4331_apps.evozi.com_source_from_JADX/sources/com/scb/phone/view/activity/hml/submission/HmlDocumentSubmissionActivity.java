package com.scb.phone.view.activity.hml.submission;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentSubmissionFragment;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;
import p040o.setMaxScale;
import p040o.setPersonalShortCuts;

public class HmlDocumentSubmissionActivity extends BaseActivityWithFragment {
    public static final write MediaDescriptionCompat = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, setPersonalShortCuts setpersonalshortcuts) {
            onGetStartedClick.write((Object) setpersonalshortcuts, "flowType");
            Intent putExtra = new Intent(context, HmlDocumentSubmissionActivity.class).putExtra("HML_SUBMISSTION_TYPE", setpersonalshortcuts);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(ctx, HmlDocumentS…, flowType as Parcelable)");
            return putExtra;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: setContentView */
    public HmlDocumentSubmissionFragment mo13702x50fd9e4a() {
        HmlDocumentSubmissionFragment.IconCompatParcelizer iconCompatParcelizer = HmlDocumentSubmissionFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_SUBMISSTION_TYPE");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(HML_SUBMISSTION_TYPE)");
        return HmlDocumentSubmissionFragment.IconCompatParcelizer.read((setPersonalShortCuts) parcelableExtra);
    }

    public final String au_() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("HML_SUBMISSTION_TYPE");
        if (parcelableExtra == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.presenter.hml.SubmissionFlowType");
        } else if (setMaxScale.read[((setPersonalShortCuts) parcelableExtra).ordinal()] != 1) {
            String string = getString(R.string.hml_document_submission_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_d…ment_submission_activity)");
            return string;
        } else {
            String string2 = getString(R.string.hml_document_re_submission_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_d…t_re_submission_activity)");
            return string2;
        }
    }
}

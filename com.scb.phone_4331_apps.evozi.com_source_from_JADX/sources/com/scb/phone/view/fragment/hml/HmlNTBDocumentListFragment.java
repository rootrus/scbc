package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5614x389c0c48;
import com.scb.phone.view.activity.hml.HmlNTBCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.submission.C5635x9aabe7dc;
import com.scb.phone.view.activity.hml.submission.C5637xbdb9ef55;
import com.scb.phone.view.activity.hml.submission.HmlNTBCropDocumentActivity;
import com.scb.phone.view.activity.hml.submission.HmlNTBDocumentSubmissionTutorialsActivity;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.zzfe;
import p040o.zzfy;

public final class HmlNTBDocumentListFragment extends HmlDocumentListFragment {
    public static final read MediaBrowserCompat$SearchResultReceiver = new read((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzfy.zzd zzd, zzfe.zzc zzc) {
        onGetStartedClick.write((Object) zzd, "submitted");
        if (zzc != null) {
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "ntb"), new ZSYR2K("feature", "your_loan"), new ZSYR2K("document_type", zzc.name()), new ZSYR2K("document_status", zzd.name())};
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("document_list", zsyr2kArr);
            }
        }
    }

    public final Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "selectedDocumentCode");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5635x9aabe7dc hmlNTBCropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCropDocumentActivity.MediaMetadataCompat;
        return C5635x9aabe7dc.MediaBrowserCompat$CustomActionResultReceiver(context, str, str2, str3, str4, str5, true);
    }

    public final Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5614x389c0c48 hmlNTBCaptureDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCaptureDocumentActivity.MediaBrowserCompat$MediaItem;
        return C5614x389c0c48.read(context, str, str2, str3, str4);
    }

    public final Intent read(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5637xbdb9ef55 hmlNTBDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionTutorialsActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        Intent MediaBrowserCompat$ItemReceiver = C5637xbdb9ef55.MediaBrowserCompat$ItemReceiver(context, str, str2, str3, str4);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "KOFAX_INSTRUCTION_STEP");
        return MediaBrowserCompat$ItemReceiver;
    }

    public final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5637xbdb9ef55 hmlNTBDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionTutorialsActivity.MediaDescriptionCompat;
        return C5637xbdb9ef55.write(context, str, str2, str3, str4);
    }
}

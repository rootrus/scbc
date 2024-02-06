package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.submission.C5636xa7b1c218;
import com.scb.phone.view.activity.hml.submission.HmlNTBDocumentSubmissionActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.setPersonalShortCuts;
import p040o.setTapText;

public final class HmlNTBOutcomeResubmissionFragment extends HmlOutcomeResubmissionFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onResubmitDocuments() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "ntb"), new ZSYR2K("button", "resubmitDocument")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_application_outcome", zsyr2kArr);
        }
        C5636xa7b1c218 hmlNTBDocumentSubmissionActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionActivity.MediaMetadataCompat;
        Intent MediaBrowserCompat$ItemReceiver = C5636xa7b1c218.MediaBrowserCompat$ItemReceiver(getContext(), setPersonalShortCuts.RESUBMISSION);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

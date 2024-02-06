package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerDocumentSubmissionActivity;
import com.scb.phone.view.fragment.hml.HmlDocumentUploadGuidelineFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setPersonalShortCuts;
import p040o.setTapText;

public class HmlBusinessOwnerGuidelinesFragment extends HmlDocumentUploadGuidelineFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public void IconCompatParcelizer() {
        HmlBusinessOwnerDocumentSubmissionActivity.IconCompatParcelizer iconCompatParcelizer = HmlBusinessOwnerDocumentSubmissionActivity.MediaBrowserCompat$MediaItem;
        Intent IconCompatParcelizer2 = HmlBusinessOwnerDocumentSubmissionActivity.IconCompatParcelizer.IconCompatParcelizer(requireContext(), setPersonalShortCuts.SUBMISSION);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

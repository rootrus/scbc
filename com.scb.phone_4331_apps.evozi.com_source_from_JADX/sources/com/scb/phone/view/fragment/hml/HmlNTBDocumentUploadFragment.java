package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.C5614x389c0c48;
import com.scb.phone.view.activity.hml.C5615xdcfcfbb1;
import com.scb.phone.view.activity.hml.HmlNTBCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.activity.hml.HmlNTBDocumentInstructionsActivity;
import com.scb.phone.view.activity.hml.submission.C5635x9aabe7dc;
import com.scb.phone.view.activity.hml.submission.HmlNTBCropDocumentActivity;
import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.FragmentBuilder_BindDealsBuyReviewFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzfe;
import p040o.zzwd;

public final class HmlNTBDocumentUploadFragment extends DocumentUploadFragment {
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5614x389c0c48 hmlNTBCaptureDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCaptureDocumentActivity.MediaBrowserCompat$MediaItem;
        return C5614x389c0c48.read(context, str, str2, str3, str4);
    }

    public final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5615xdcfcfbb1 hmlNTBDocumentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentInstructionsActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5615xdcfcfbb1.IconCompatParcelizer(context, z, FragmentBuilder_BindDealsBuyReviewFragment.HML_PAYSLIP.name(), zzwd);
    }

    public final Intent write(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5615xdcfcfbb1 hmlNTBDocumentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentInstructionsActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5615xdcfcfbb1.IconCompatParcelizer(context, z, FragmentBuilder_BindDealsBuyReviewFragment.HML_BANK.name(), zzwd);
    }

    public final Intent MediaBrowserCompat$ItemReceiver(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5615xdcfcfbb1 hmlNTBDocumentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentInstructionsActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5615xdcfcfbb1.IconCompatParcelizer(context, z, FragmentBuilder_BindDealsBuyReviewFragment.HML_CID.name(), zzwd);
    }

    public final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "selectedDocumentCode");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5635x9aabe7dc hmlNTBCropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCropDocumentActivity.MediaMetadataCompat;
        return C5635x9aabe7dc.MediaBrowserCompat$CustomActionResultReceiver(context, str, str2, str3, str4, str5, true);
    }

    public final void write() {
        HmlNTBConsentActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBConsentActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent MediaBrowserCompat$ItemReceiver = HmlNTBConsentActivity.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(requireContext, zzfe.zza.NCB_CONSENT, (immediateFailedFuture) null);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

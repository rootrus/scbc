package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzfe;

public final class HmlDocumentUploadFragment extends DocumentUploadFragment {
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void write() {
        HmlConsentActivity.read read = HmlConsentActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent write = HmlConsentActivity.read.write(requireContext, zzfe.zza.NCB_CONSENT, (immediateFailedFuture) null);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver hmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver = HmlCaptureDocumentActivity.MediaMetadataCompat;
        return HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(context, str, str2, str3, str4);
    }
}

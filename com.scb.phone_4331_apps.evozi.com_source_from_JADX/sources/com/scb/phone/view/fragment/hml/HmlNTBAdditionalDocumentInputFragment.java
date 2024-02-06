package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentInputFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzfe;

public final class HmlNTBAdditionalDocumentInputFragment extends AdditionDocumentInputFragment {
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
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

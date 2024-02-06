package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5605xdf22db18;
import com.scb.phone.view.activity.hml.C5620xe00a0a13;
import com.scb.phone.view.activity.hml.HmlETBAccountSetupActivity;
import com.scb.phone.view.activity.hml.HmlNoDepositAccountActivity;
import com.scb.phone.view.activity.hml.HmlVerifyEmailActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_BindEBillSubscriptionReviewActivity;
import p040o.ExtractionParameters;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProcessingParameters;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setCurrentImageIndex;
import p040o.setTapText;
import p040o.sha256Hash;
import p040o.zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver;

public class HmlETBLoanSetupFragment extends HmlBaseLoanSetupFragment<ProcessingParameters> implements ProcessingParameters {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    @HmlPinActivity
    public sha256Hash<ProcessingParameters> presenterETB;

    public final int MediaBrowserCompat$MediaItem() {
        return R.string.hml_etb_loan_setup_step_4;
    }

    public int MediaBrowserCompat$SearchResultReceiver() {
        return R.string.hml_etb_loan_setup_step_3;
    }

    public int RatingCompat() {
        return R.string.hml_etb_loan_setup_step_2;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void read(String str, boolean z, zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) str, "customerType");
        onGetStartedClick.write((Object) zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver, "action");
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb"), new ZSYR2K("loan_type", str)};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_loan_setup", zsyr2kArr);
        }
        if (z) {
            int[] iArr = ActivityBuilder_BindEBillSubscriptionReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C5620xe00a0a13 hmlNoDepositAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNoDepositAccountActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNoDepositAccountActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void write() {
        C5605xdf22db18 hmlETBAccountSetupActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBAccountSetupActivity.MediaDescriptionCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlETBAccountSetupActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        mo15340x50fd9e4a(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = HmlVerifyEmailActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ setCurrentImageIndex MediaMetadataCompat() {
        sha256Hash<ProcessingParameters> sha256hash = this.presenterETB;
        if (sha256hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterETB");
        }
        return sha256hash;
    }

    public final /* bridge */ /* synthetic */ ExtractionParameters MediaSessionCompat$Token() {
        return this;
    }
}

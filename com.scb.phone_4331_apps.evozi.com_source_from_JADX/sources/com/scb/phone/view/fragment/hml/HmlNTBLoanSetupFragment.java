package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBAccountSetupActivity;
import com.scb.phone.view.activity.hml.HmlNTBVerifyEmailActivity;
import com.scb.phone.view.activity.hml.HmlVerifyIdentifyActivity;
import com.scb.phone.view.activity.hml.fatca.HmlNTBOnboardingFatcaQuestionsActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_BindEBillSubscriptionSearchActivity;
import p040o.ExtractionParameters;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getIPassportDeserializerKta;
import p040o.onGetStartedClick;
import p040o.setCurrentImageIndex;
import p040o.setProfileShortCuts;
import p040o.setTapText;
import p040o.zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver;

public final class HmlNTBLoanSetupFragment extends HmlBaseLoanSetupFragment<getIPassportDeserializerKta> implements getIPassportDeserializerKta {
    public static final read IconCompatParcelizer = new read((byte) 0);
    @HmlPinActivity
    public setProfileShortCuts<getIPassportDeserializerKta> presenterNTB;

    public final int MediaBrowserCompat$MediaItem() {
        return R.string.hml_ntb_loan_setup_step_4;
    }

    public final int MediaBrowserCompat$SearchResultReceiver() {
        return R.string.hml_ntb_loan_setup_step_3;
    }

    public final int RatingCompat() {
        return R.string.hml_ntb_loan_setup_step_2;
    }

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

    public final void read(String str, boolean z, zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) str, "customerType");
        onGetStartedClick.write((Object) zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver, "action");
        if (z) {
            int[] iArr = ActivityBuilder_BindEBillSubscriptionSearchActivity.write;
        }
    }

    public final void read() {
        setSplitBackground();
    }

    public final void write() {
        HmlNTBAccountSetupActivity.write write = HmlNTBAccountSetupActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBAccountSetupActivity.class);
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

    public final void MediaDescriptionCompat() {
        HmlVerifyIdentifyActivity.write write = HmlVerifyIdentifyActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) "BRANCH", "ekycMethod");
        Intent putExtra = new Intent(requireContext, HmlVerifyIdentifyActivity.class).putExtra("HML_IDENTIFY_EKYC_METHOD", "BRANCH");
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(\n                …_EKYC_METHOD, ekycMethod)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBOnboardingFatcaQuestionsActivity.write write = HmlNTBOnboardingFatcaQuestionsActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBOnboardingFatcaQuestionsActivity.class);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent MediaBrowserCompat$ItemReceiver = HmlNTBVerifyEmailActivity.MediaBrowserCompat$ItemReceiver(getContext());
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

    public final /* synthetic */ setCurrentImageIndex MediaMetadataCompat() {
        setProfileShortCuts<getIPassportDeserializerKta> setprofileshortcuts = this.presenterNTB;
        if (setprofileshortcuts == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterNTB");
        }
        return setprofileshortcuts;
    }

    public final /* bridge */ /* synthetic */ ExtractionParameters MediaSessionCompat$Token() {
        return this;
    }
}

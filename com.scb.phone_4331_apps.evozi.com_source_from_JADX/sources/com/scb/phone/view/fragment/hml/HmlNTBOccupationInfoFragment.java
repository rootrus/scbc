package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlCompanyNameActivity;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.activity.hml.HmlNTBDocumentUploadGuidelineActivity;
import com.scb.phone.view.activity.hml.HmlNTBWorkAddressActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Arrays;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzfe;

public final class HmlNTBOccupationInfoFragment extends HmlOccupationInfoFragment {
    public static final C5998x440e4a6b IconCompatParcelizer = new C5998x440e4a6b((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        String[] stringArray = getResources().getStringArray(R.array.f64702130903049);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
        this.breadcrumbnsNtb.setStates(Arrays.asList((String[]) Arrays.copyOf(stringArray, stringArray.length)));
        ProgressStateBar progressStateBar = this.breadcrumbnsNtb;
        onGetStartedClick.IconCompatParcelizer((Object) progressStateBar, "breadcrumbnsNtb");
        progressStateBar.setVisibility(0);
        this.breadcrumbnsNtb.setCurrentState(2);
        return onCreateView;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlNTBWorkAddressActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            HmlCompanyNameActivity.IconCompatParcelizer iconCompatParcelizer = HmlCompanyNameActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlCompanyNameActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(intent, 1003);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer() {
        HmlNTBDocumentUploadGuidelineActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBDocumentUploadGuidelineActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBDocumentUploadGuidelineActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
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

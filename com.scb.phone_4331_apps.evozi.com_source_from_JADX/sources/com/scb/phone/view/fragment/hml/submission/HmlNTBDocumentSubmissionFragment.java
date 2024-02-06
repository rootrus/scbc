package com.scb.phone.view.fragment.hml.submission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5616x989c1ea;
import com.scb.phone.view.activity.hml.HmlNTBApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.activity.hml.HmlNTBDocumentListActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CrashlyticsController;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setBackendType;
import p040o.setPersonalShortCuts;
import p040o.setTapText;
import p040o.zzfe;
import p040o.zzwe;

public final class HmlNTBDocumentSubmissionFragment extends HmlDocumentSubmissionFragment {
    public static final C6028x5f422799 IconCompatParcelizer = new C6028x5f422799((byte) 0);
    @BindView
    public ProgressStateBar breadcrumbsNtb;

    public final String IconCompatParcelizer() {
        return "ntb";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setPersonalShortCuts setpersonalshortcuts;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        setBackendType setbackendtype = this.presenter;
        if (setbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setPersonalShortCuts setpersonalshortcuts2 = setbackendtype.read;
        if (setpersonalshortcuts2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        if (setpersonalshortcuts2 == setPersonalShortCuts.SUBMISSION) {
            ProgressStateBar progressStateBar = this.breadcrumbsNtb;
            if (progressStateBar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
            }
            String[] stringArray = progressStateBar.getResources().getStringArray(R.array.f64702130903049);
            onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
            progressStateBar.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
            progressStateBar.setVisibility(0);
            progressStateBar.setCurrentState(2);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (setpersonalshortcuts = (setPersonalShortCuts) arguments.getParcelable("HML_SUBMISSTION_TYPE")) == null) {
            setpersonalshortcuts = setPersonalShortCuts.SUBMISSION;
        }
        MediaBrowserCompat$CustomActionResultReceiver(setpersonalshortcuts);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(setPersonalShortCuts setpersonalshortcuts) {
        onGetStartedClick.write((Object) setpersonalshortcuts, "flow");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[3];
        zsyr2kArr[0] = new ZSYR2K("user_type", "ntb");
        zsyr2kArr[1] = new ZSYR2K("feature", "your_loan");
        zsyr2kArr[2] = new ZSYR2K("document_status", setpersonalshortcuts == setPersonalShortCuts.SUBMISSION ? "INITIAL" : "RESUBMIT");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("document_submission", zsyr2kArr);
        }
    }

    public final void IconCompatParcelizer(CrashlyticsController.FileNameContainsFilter fileNameContainsFilter, zzwe.read read) {
        onGetStartedClick.write((Object) fileNameContainsFilter, "documentInfo");
        onGetStartedClick.write((Object) read, "limit");
        C5616x989c1ea hmlNTBDocumentListActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentListActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) fileNameContainsFilter, "documentInfo");
        onGetStartedClick.write((Object) read, "limit");
        Intent putExtra = new Intent(requireContext, HmlNTBDocumentListActivity.class).putExtra("HML_DOC_INFO", fileNameContainsFilter).putExtra("HML_DOC_FILE_VALIDATION_LIMIT", read);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBDo…_VALIDATION_LIMIT, limit)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(putExtra);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = getContext();
        if (context != null) {
            HmlNTBApplicationOutcomeActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplicationOutcomeActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            onGetStartedClick.write((Object) context, "context");
            Intent putExtra = new Intent(context, HmlNTBApplicationOutcomeActivity.class).putExtra("SHOW_PENDING_STATE", false);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBAp…_EXTRA, showPendingState)");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    putExtra = setTapText.write(activity, putExtra).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(putExtra.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(putExtra);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

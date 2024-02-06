package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlSensitiveConsentActivity;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionActivity;
import com.scb.phone.view.fragment.ContactCallCenterFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetExtractionParametersFactory;
import p040o.ZSYR2K;
import p040o.getIntFromValue;
import p040o.getIntFromValue$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.registerAnalyticsListener;
import p040o.setPersonalShortCuts;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public class HmlOutcomeResubmissionFragment extends ContactCallCenterFragment implements PassportCaptureModule_GetExtractionParametersFactory {
    @BindView
    public TextView dateText;
    @HmlPinActivity
    public getIntFromValue presenter;

    public static final HmlOutcomeResubmissionFragment IconCompatParcelizer(registerAnalyticsListener registeranalyticslistener) {
        onGetStartedClick.write((Object) registeranalyticslistener, "display");
        HmlOutcomeResubmissionFragment hmlOutcomeResubmissionFragment = new HmlOutcomeResubmissionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_RESUBMISSION_EXTRA", registeranalyticslistener);
        hmlOutcomeResubmissionFragment.setArguments(bundle);
        return hmlOutcomeResubmissionFragment;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88052131494032, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        registerAnalyticsListener registeranalyticslistener;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        getIntFromValue getintfromvalue = this.presenter;
        if (getintfromvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getintfromvalue.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && (registeranalyticslistener = (registerAnalyticsListener) arguments.getParcelable("HML_OUTCOME_RESUBMISSION_EXTRA")) != null) {
            getIntFromValue getintfromvalue2 = this.presenter;
            if (getintfromvalue2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) registeranalyticslistener, "display");
            onGetStartedClick.write((Object) registeranalyticslistener, "display");
            getintfromvalue2.read = registeranalyticslistener;
            writeUInt64NoTag.IconCompatParcelizer getintfromvalue_mediabrowsercompat_customactionresultreceiver = new getIntFromValue$MediaBrowserCompat$CustomActionResultReceiver(registeranalyticslistener);
            if (getintfromvalue2.RatingCompat != null) {
                getintfromvalue_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getintfromvalue2.RatingCompat);
            }
        }
    }

    public final void write(registerAnalyticsListener registeranalyticslistener) {
        onGetStartedClick.write((Object) registeranalyticslistener, "display");
        TextView textView = this.dateText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateText");
        }
        textView.setVisibility(registeranalyticslistener.read == null ? 8 : 0);
        TextView textView2 = this.dateText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateText");
        }
        textView2.setText(registeranalyticslistener.read);
    }

    @OnClick
    public final void onButtonReturnHomeClicked() {
        mo15340x50fd9e4a(true);
    }

    @OnClick
    public final void onContactCallCenter() {
        aK_();
    }

    @OnClick
    public void onResubmitDocuments() {
        getIntFromValue getintfromvalue = this.presenter;
        if (getintfromvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        registerAnalyticsListener registeranalyticslistener = getintfromvalue.read;
        if (registeranalyticslistener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        boolean z = true;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) registeranalyticslistener.IconCompatParcelizer, (Object) Boolean.TRUE)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new getIntFromValue.IconCompatParcelizer(getintfromvalue);
            if (getintfromvalue.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getintfromvalue.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getIntFromValue.read.MediaBrowserCompat$ItemReceiver;
        if (getintfromvalue.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(getintfromvalue.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        if (str != null) {
            HmlSensitiveConsentActivity.IconCompatParcelizer iconCompatParcelizer = HmlSensitiveConsentActivity.MediaMetadataCompat;
            Context requireContext = requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
            onGetStartedClick.write((Object) requireContext, "context");
            onGetStartedClick.write((Object) str, "subConsentType");
            Intent intent = new Intent(requireContext, HmlSensitiveConsentActivity.class);
            intent.putExtra("HML_CONSENT_TYPE", zzfe.zza.SENSITIVE_CONSENT);
            intent.putExtra("HML_SUB_CONSENT_TYPE", str);
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
    }

    public final void read() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb"), new ZSYR2K("button", "resubmitDocument")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_application_outcome", zsyr2kArr);
        }
        HmlDocumentSubmissionActivity.write write = HmlDocumentSubmissionActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$ItemReceiver = HmlDocumentSubmissionActivity.write.MediaBrowserCompat$ItemReceiver(requireContext(), setPersonalShortCuts.RESUBMISSION);
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

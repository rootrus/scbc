package com.scb.phone.view.fragment.hml.businessowner;

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
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerDocumentSubmissionActivity;
import com.scb.phone.view.fragment.ContactCallCenterFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.registerAnalyticsListener;
import p040o.setPersonalShortCuts;
import p040o.setTapText;

public final class HmlBusinessOwnerResubmissionFragment extends ContactCallCenterFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    @BindView
    public TextView checkStatus;
    @BindView
    public TextView dateText;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @OnClick
    public final void onResubmitDocuments() {
        HmlBusinessOwnerDocumentSubmissionActivity.IconCompatParcelizer iconCompatParcelizer = HmlBusinessOwnerDocumentSubmissionActivity.MediaBrowserCompat$MediaItem;
        Intent IconCompatParcelizer2 = HmlBusinessOwnerDocumentSubmissionActivity.IconCompatParcelizer.IconCompatParcelizer(requireContext(), setPersonalShortCuts.RESUBMISSION);
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

    @OnClick
    public final void onButtonReturnHomeClicked() {
        mo15340x50fd9e4a(true);
    }

    @OnClick
    public final void onContactCallCenter() {
        aK_();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        registerAnalyticsListener registeranalyticslistener;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f88052131494032, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        Bundle arguments = getArguments();
        if (!(arguments == null || (registeranalyticslistener = (registerAnalyticsListener) arguments.getParcelable("HML_OUTCOME_RESUBMISSION_EXTRA")) == null)) {
            onGetStartedClick.IconCompatParcelizer((Object) registeranalyticslistener, "display");
            TextView textView = this.dateText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateText");
            }
            if (registeranalyticslistener.read == null) {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.dateText;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateText");
            }
            textView2.setText(registeranalyticslistener.read);
            TextView textView3 = this.checkStatus;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("checkStatus");
            }
            textView3.setText(getString(R.string.hml_business_owner_outcome_pending_notified_content));
        }
        return inflate;
    }
}

package com.scb.phone.view.fragment.hml.ekyc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.HmlPinActivity;
import p040o.PassportCaptureModule;
import p040o.onGetStartedClick;
import p040o.setUseErrorMsgAsOnlyMessage;

public final class HmlNTBEkycVerifyIdentifyBranchFragment extends BaseFragment implements PassportCaptureModule {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    @HmlPinActivity
    public setUseErrorMsgAsOnlyMessage presenter;
    @BindView
    public TextView tvDate;
    @BindView
    public TextView tvVerifyNationalIdDescription;
    @BindView
    public TextView tvVerifyNationalIdMessage;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88122131494039, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        setUseErrorMsgAsOnlyMessage setuseerrormsgasonlymessage = this.presenter;
        if (setuseerrormsgasonlymessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuseerrormsgasonlymessage.MediaBrowserCompat$ItemReceiver(this);
        setUseErrorMsgAsOnlyMessage setuseerrormsgasonlymessage2 = this.presenter;
        if (setuseerrormsgasonlymessage2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuseerrormsgasonlymessage2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        setuseerrormsgasonlymessage2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setUseErrorMsgAsOnlyMessage.write(setuseerrormsgasonlymessage2));
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("p10x1_kyc_branch");
        }
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…KYC_BRANCH)\n            }");
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        TextView textView = this.tvVerifyNationalIdMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvVerifyNationalIdMessage");
        }
        textView.setText(getString(R.string.hml_ntb_ekyc_verify_identify_branch_main_title));
        TextView textView2 = this.tvVerifyNationalIdDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvVerifyNationalIdDescription");
        }
        textView2.setText(getString(R.string.hml_ntb_ekyc_verify_identify_branch_subtitle));
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "date");
        TextView textView = this.tvDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDate");
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    @OnClick
    public final void onNextButtonClick() {
        FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), false);
    }
}

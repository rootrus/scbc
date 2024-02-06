package com.scb.phone.view.fragment.hml;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onCheckBoxClick;
import p040o.setTapText;
import p040o.submitAllReports;
import p040o.zzct;

public class HmlOutcomeRejectFragment extends HmlBaseOutcomeFragment {
    private submitAllReports MediaBrowserCompat$CustomActionResultReceiver = null;
    @BindView
    ImageView background;
    @BindView
    TextView financialHealthDescriptionTv;
    @BindView
    TextView financialHealthTitleTv;
    @BindView
    CardView healthSection;
    @BindView
    TextView reapplyDateTime;
    @BindView
    TextView rejectRemark;
    @BindView
    ImageView rejectedBackground;

    @OnClick
    public void onLearnMoreButtonClicked() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity.EXTRA_FROM_NTB", true);
                intent.setData(Uri.parse(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
                intent.setFlags(603979776);
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
            } catch (ActivityNotFoundException | NullPointerException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
    }

    @OnClick
    public void onButtonReturnHomeClicked(View view) {
        MediaBrowserCompat$ItemReceiver();
    }

    public static HmlOutcomeRejectFragment IconCompatParcelizer(submitAllReports submitallreports, zzct.zza zza) {
        HmlOutcomeRejectFragment hmlOutcomeRejectFragment = new HmlOutcomeRejectFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_REJECT_EXTRA", submitallreports);
        bundle.putString("HML_CUSTOMER_TYPE_EXTRA", zza.toString());
        hmlOutcomeRejectFragment.setArguments(bundle);
        return hmlOutcomeRejectFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88042131494031, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            submitAllReports submitallreports = (submitAllReports) getArguments().getParcelable("HML_OUTCOME_REJECT_EXTRA");
            this.MediaBrowserCompat$CustomActionResultReceiver = submitallreports;
            if (submitallreports != null) {
                if (!(submitallreports.IconCompatParcelizer == null || getContext() == null)) {
                    Picasso.read().write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer).IconCompatParcelizer((int) R.drawable.reject_placeholder).read(this.background, (FragmentBuilder_BindEkycFragment) null);
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    this.reapplyDateTime.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                } else {
                    this.rejectRemark.setText(R.string.auto_bo_reject_date_desc);
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver.read) {
                    this.healthSection.setVisibility(0);
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.write != null) {
                        Glide.MediaBrowserCompat$ItemReceiver(requireContext()).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.write).MediaBrowserCompat$ItemReceiver(this.rejectedBackground);
                    }
                }
            }
            if ("BUSINESS_OWNER".equalsIgnoreCase(getArguments().getString("HML_CUSTOMER_TYPE_EXTRA", "CONSUMER"))) {
                this.financialHealthTitleTv.setText(R.string.loan_10X1_app_outcome_rejected_health_business_title);
                this.financialHealthDescriptionTv.setText(R.string.loan_10X1_app_outcome_rejected_health_business_description);
            }
        }
        return inflate;
    }
}

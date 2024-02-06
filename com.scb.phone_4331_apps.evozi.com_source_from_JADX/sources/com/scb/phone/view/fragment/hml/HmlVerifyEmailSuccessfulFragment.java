package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.businessowner.C5624xf154595d;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerLoanSetupActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlPinActivity;
import p040o.ImageService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetIPassportDeserializerRttiFactory;
import p040o.SendImageResponse;
import p040o.ZSYR2K;
import p040o.getClassificationAlternatives;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzct;

public class HmlVerifyEmailSuccessfulFragment extends BaseFragment implements PassportCaptureModule_GetIPassportDeserializerRttiFactory {
    @BindView
    Button btEmailVerifyButton;
    @HmlPinActivity
    public SendImageResponse presenter;
    @BindView
    TextView tvEmailVerifySuccessText;

    /* access modifiers changed from: protected */
    public String MediaBrowserCompat$CustomActionResultReceiver() {
        return "etb";
    }

    public static HmlVerifyEmailSuccessfulFragment IconCompatParcelizer(String str) {
        HmlVerifyEmailSuccessfulFragment hmlVerifyEmailSuccessfulFragment = new HmlVerifyEmailSuccessfulFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL", str);
        hmlVerifyEmailSuccessfulFragment.setArguments(bundle);
        return hmlVerifyEmailSuccessfulFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88112131494038, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        SendImageResponse sendImageResponse = this.presenter;
        ImageService.UseableImageMemoryLimit useableImageMemoryLimit = new ImageService.UseableImageMemoryLimit(sendImageResponse, getArguments().getString("EMAIL"));
        if (sendImageResponse.RatingCompat != null) {
            z = true;
        }
        if (z) {
            useableImageMemoryLimit.IconCompatParcelizer(sendImageResponse.RatingCompat);
        }
        return inflate;
    }

    @OnClick
    public void onNextClicked() {
        SendImageResponse sendImageResponse = this.presenter;
        getClassificationAlternatives getclassificationalternatives = new getClassificationAlternatives(sendImageResponse);
        if (sendImageResponse.RatingCompat != null) {
            getclassificationalternatives.IconCompatParcelizer(sendImageResponse.RatingCompat);
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public void IconCompatParcelizer(zzct.zza zza) {
        Intent intent;
        if (getContext() != null) {
            if (zza == zzct.zza.CONSUMER) {
                HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlETBLoanSetupActivity.MediaDescriptionCompat;
                Context context = getContext();
                onGetStartedClick.write((Object) context, "ctx");
                intent = new Intent(context, HmlETBLoanSetupActivity.class);
            } else {
                C5624xf154595d hmlBusinessOwnerLoanSetupActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOwnerLoanSetupActivity.MediaMetadataCompat;
                Context context2 = getContext();
                onGetStartedClick.write((Object) context2, "ctx");
                intent = new Intent(context2, HmlBusinessOwnerLoanSetupActivity.class);
            }
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

    public final void write(String str) {
        this.tvEmailVerifySuccessText.setText(Html.fromHtml(getString(R.string.hml_verify_email_success_text, str)));
    }

    public final void write(boolean z) {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver());
        zsyr2kArr[1] = new ZSYR2K("loan_type", z ? "business_owner" : "consumer");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_email_verify_successful", zsyr2kArr);
        }
    }
}

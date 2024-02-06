package com.scb.phone.view.fragment.registration.preregistration;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.PrivacyCSentWebViewActivity;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import com.scb.phone.view.activity.registration.preregistration.PreregistrationInformationActivity;
import com.scb.phone.view.activity.registration.preregistration.PreregistrationPinActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Locale;
import p039io.github.inflationx.calligraphy3.TypefaceUtils;
import p040o.ActivityBuilder_ContributeNtbOpenAccountLandingActivity;
import p040o.ActivityBuilder_ContributeOrderChequeLandingActivity;
import p040o.ActivityBuilder_ContributePartnerBillPaymentInputActivity;
import p040o.ActivityBuilder_ContributePartnerConsentActivity;
import p040o.ActivityBuilder_ContributePartnerLandingActivity;
import p040o.C10081nr;
import p040o.C5064nk;
import p040o.C5065nl;
import p040o.C5066nn;
import p040o.C5072nu;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnDeviceExtractionServer;
import p040o.PrepaidActivationService;
import p040o.extractFields;
import p040o.getFaceRightPadding;
import p040o.getKernelIDDstOver;
import p040o.onGetLayoutInflater;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class PreregistrationInformationFragment extends BaseFragment implements getFaceRightPadding {
    private getKernelIDDstOver IconCompatParcelizer = new getKernelIDDstOver();
    @BindView
    TextView mobileNumberTextView;
    @HmlPinActivity
    public C5072nu presenter;
    @BindView
    TextView tvPrivacyNotice;
    @BindView
    TextView tvSwitchToEng;
    @BindView
    TextView tvSwitchToThai;
    @BindView
    TextView userNameTextView;

    public static PreregistrationInformationFragment MediaDescriptionCompat() {
        Bundle bundle = new Bundle();
        PreregistrationInformationFragment preregistrationInformationFragment = new PreregistrationInformationFragment();
        preregistrationInformationFragment.setArguments(bundle);
        return preregistrationInformationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88992131494126, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C5072nu nuVar = this.presenter;
        String stackedBackground = setStackedBackground();
        C5065nl nlVar = new C5065nl(nuVar);
        if (nuVar.RatingCompat != null) {
            nlVar.IconCompatParcelizer(nuVar.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = "th".equals(stackedBackground) ? C5066nn.MediaBrowserCompat$CustomActionResultReceiver : OnDeviceExtractionServer.C3716a.MediaBrowserCompat$CustomActionResultReceiver;
        if (nuVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nuVar.RatingCompat);
        }
        String MediaBrowserCompat$CustomActionResultReceiver = nuVar.read.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            z = true;
        }
        nuVar.write(z, new C5064nk(MediaBrowserCompat$CustomActionResultReceiver));
        getKernelIDDstOver getkerneliddstover = this.IconCompatParcelizer;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_preregistration");
        }
        return inflate;
    }

    @OnClick
    public void onNextButtonClick() {
        C5072nu nuVar = this.presenter;
        C10081nr nrVar = C10081nr.MediaBrowserCompat$CustomActionResultReceiver;
        if (nuVar.RatingCompat != null) {
            nrVar.IconCompatParcelizer(nuVar.RatingCompat);
        }
    }

    @OnClick
    public void onNotMeLinkClick() {
        C5072nu nuVar = this.presenter;
        extractFields extractfields = extractFields.write;
        if (nuVar.RatingCompat != null) {
            extractfields.IconCompatParcelizer(nuVar.RatingCompat);
        }
    }

    @OnClick
    public void onBackClick() {
        C5072nu nuVar = this.presenter;
        OnDeviceExtractionServer.C37155 r1 = OnDeviceExtractionServer.C37155.write;
        if (nuVar.RatingCompat != null) {
            r1.IconCompatParcelizer(nuVar.RatingCompat);
        }
    }

    @OnClick
    public void clickSwitchToEng() {
        if (getActivity() != null) {
            this.presenter.MediaBrowserCompat$ItemReceiver.read("en");
            onGetLayoutInflater.MediaBrowserCompat$CustomActionResultReceiver(new Locale("en").getLanguage());
            ((PreregistrationInformationActivity) getActivity()).mo3029b_("en");
        }
    }

    @OnClick
    public void clickSwitchToThai() {
        if (getActivity() != null) {
            this.presenter.MediaBrowserCompat$ItemReceiver.read("th");
            onGetLayoutInflater.MediaBrowserCompat$CustomActionResultReceiver(new Locale("th").getLanguage());
            ((PreregistrationInformationActivity) getActivity()).mo3029b_("th");
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void read() {
        if (getContext() != null) {
            PreregistrationPinActivity.MediaBrowserCompat$ItemReceiver(getContext());
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RegistrationPersonalInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }

    public final void write() {
        CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.preregister_not_me_title).IconCompatParcelizer((int) R.string.preregister_not_me_text).IconCompatParcelizer(getString(R.string.preregister_registration_button), new ActivityBuilder_ContributePartnerLandingActivity(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.preregister_not_now_button), ActivityBuilder_ContributeOrderChequeLandingActivity.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void read(String str, String str2) {
        this.userNameTextView.setText(str);
        this.mobileNumberTextView.setText(str2);
    }

    public final void RatingCompat() {
        if (getContext() != null) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.registration_landing_exit_title).IconCompatParcelizer((int) R.string.registration_tc_exit_content);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.registration_tc_exit_yes), new ActivityBuilder_ContributeNtbOpenAccountLandingActivity(this));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.registration_tc_exit_notnow), ActivityBuilder_ContributePartnerBillPaymentInputActivity.MediaBrowserCompat$ItemReceiver).show();
        }
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.tvSwitchToEng;
        if (getActivity() != null) {
            textView.setTextAppearance(R.style.f98212131821041);
            textView.setTypeface(TypefaceUtils.load(getActivity().getAssets(), "fonts/db_heavent_medium.ttf"));
        }
    }

    public final void MediaMetadataCompat() {
        TextView textView = this.tvSwitchToThai;
        if (getActivity() != null) {
            textView.setTextAppearance(R.style.f98212131821041);
            textView.setTypeface(TypefaceUtils.load(getActivity().getAssets(), "fonts/db_heavent_medium.ttf"));
        }
    }

    public final void read(String str) {
        TextView textView = this.tvPrivacyNotice;
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(str, 0));
        } else {
            textView.setText(Html.fromHtml(str));
        }
        this.tvPrivacyNotice.setMovementMethod(new PrepaidActivationService(new ActivityBuilder_ContributePartnerConsentActivity(this)));
    }

    public final void IconCompatParcelizer(String str) {
        if (getContext() != null) {
            Intent MediaBrowserCompat$CustomActionResultReceiver = PrivacyCSentWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), str);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).mo13676d_("privacy_notice_pre_regis");
            }
        }
    }
}

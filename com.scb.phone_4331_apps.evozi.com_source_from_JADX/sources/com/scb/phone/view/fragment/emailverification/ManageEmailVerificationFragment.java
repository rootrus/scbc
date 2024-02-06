package com.scb.phone.view.fragment.emailverification;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationSuccessActivity;
import com.scb.phone.view.activity.hml.HmlVerifyEmailSuccessfulActivity;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinTextInput;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.DeepLinkModule_ContributeHmlCalculatorDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBLAS;
import p040o.ZHPR2;
import p040o.access$2100;
import p040o.getUsable;
import p040o.isShadowed;
import p040o.setTapText;

public class ManageEmailVerificationFragment extends BaseFragment implements getUsable.IconCompatParcelizer, MerchantService {
    public ScriptIntrinsicBLAS.Uplo IconCompatParcelizer;
    public write MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaMetadataCompat = false;
    private boolean RatingCompat = false;
    @BindView
    CustomKeypad customKeypad;
    @BindView
    CustomPinTextInput customPinInput;
    @BindView
    TextView didNotReceiveTextView;
    @HmlPinActivity
    public EmailOtpPresenter emailOtpPresenter;
    @BindView
    public TextView enterOtpMessage;
    @BindView
    TextView errorMessage;
    @BindView
    public TextView refCodeTextView;

    public interface write {
        void IconCompatParcelizer(String str);

        void write(String str);
    }

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87282131493955, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = (write) getActivity();
        this.emailOtpPresenter.MediaBrowserCompat$ItemReceiver(this);
        ScriptIntrinsicBLAS.Uplo uplo = new ScriptIntrinsicBLAS.Uplo();
        this.IconCompatParcelizer = uplo;
        if (getActivity() != null) {
            uplo.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "emailverification_verify");
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            String string = arguments.getString("BUNDLE_EMAIL");
            String string2 = arguments.getString("BUNDLE_UUID");
            String string3 = arguments.getString("BUNDLE_REFCODE");
            this.RatingCompat = arguments.getBoolean("FLOW", false);
            this.MediaMetadataCompat = arguments.getBoolean("FROM_NOTI", false);
            this.MediaBrowserCompat$SearchResultReceiver = arguments.getBoolean("EXTRA_IS_REQUESTED_FOR_RESULT", false);
            EmailOtpPresenter emailOtpPresenter2 = this.emailOtpPresenter;
            Boolean valueOf = Boolean.valueOf(this.RatingCompat);
            emailOtpPresenter2.read = string;
            emailOtpPresenter2.MediaDescriptionCompat = string2;
            emailOtpPresenter2.MediaBrowserCompat$SearchResultReceiver = string3;
            emailOtpPresenter2.MediaMetadataCompat = valueOf;
            isShadowed isshadowed = new isShadowed(emailOtpPresenter2);
            if (emailOtpPresenter2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                isshadowed.IconCompatParcelizer(emailOtpPresenter2.RatingCompat);
            }
        }
        setTransitioning();
        this.customPinInput.setPinInputListener(this);
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
        this.customKeypad.setKeypadListener(this.customPinInput);
        this.errorMessage.setText("");
        MediaBrowserCompat$SearchResultReceiver(getString(R.string.manage_email_verification_didnt_receive_message));
        return inflate;
    }

    public void onDestroy() {
        this.emailOtpPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        String str;
        super.setTransitioning();
        setActionBarVisibilityCallback();
        if (this.RatingCompat) {
            str = getString(R.string.manage_email_verification_title_hml);
        } else {
            str = getString(R.string.manage_email_verification_title);
        }
        ParcelableVolumeInfo(str);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("  ");
        sb.append(getString(R.string.manage_email_otp_resend));
        this.didNotReceiveTextView.setText(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(str, sb.toString(), getResources(), new DeepLinkModule_ContributeHmlCalculatorDeepLinkActivity(this), false, 1));
        this.didNotReceiveTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.didNotReceiveTextView.setHighlightColor(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        read(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public void read(String str, String str2, String str3) {
        this.refCodeTextView.setText(getString(R.string.manage_email_otp_reference_code, str3));
        this.enterOtpMessage.setText(getString(R.string.manage_email_verification_input_message, str));
        this.errorMessage.setText("");
    }

    public final void IconCompatParcelizer(String str) {
        this.errorMessage.setText(str);
    }

    public void read(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(getString(R.string.manage_email_verification_resend_otp_description));
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaBrowserCompat$CustomActionResultReceiver.write(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2100 access_2100) {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            Intent write2 = ManageEmailVerificationSuccessActivity.write(getActivity(), access_2100);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    write2 = setTapText.write(activity, write2).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(write2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivityForResult(write2, 10001);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = ManageEmailVerificationSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity(), access_2100, this.MediaMetadataCompat);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity2, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb2.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb2.append("\n with context ");
                sb2.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb2.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void write(String str) {
        Intent write2 = HmlVerifyEmailSuccessfulActivity.write(getContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write2 = setTapText.write(activity, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void al_() {
        this.errorMessage.setText("");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
        EmailOtpPresenter emailOtpPresenter2 = this.emailOtpPresenter;
        if (emailOtpPresenter2.RatingCompat != null) {
            emailOtpPresenter2.RatingCompat.AlertController$RecycleListView();
        }
        if (emailOtpPresenter2.MediaMetadataCompat.booleanValue()) {
            emailOtpPresenter2.IconCompatParcelizer.write(emailOtpPresenter2.read, emailOtpPresenter2.MediaDescriptionCompat, str);
            emailOtpPresenter2.IconCompatParcelizer.IconCompatParcelizer(new EmailOtpPresenter.IconCompatParcelizer(emailOtpPresenter2, (byte) 0));
            return;
        }
        emailOtpPresenter2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(emailOtpPresenter2.MediaDescriptionCompat, str);
        emailOtpPresenter2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new EmailOtpPresenter.write(emailOtpPresenter2, (byte) 0));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentActivity activity = getActivity();
        if (i == 10001 && activity != null) {
            activity.setResult(i2, intent);
            activity.finish();
        }
    }
}

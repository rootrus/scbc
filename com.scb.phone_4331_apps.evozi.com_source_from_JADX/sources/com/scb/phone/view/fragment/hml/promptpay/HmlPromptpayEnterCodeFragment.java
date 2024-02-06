package com.scb.phone.view.fragment.hml.promptpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlNTBOccupationInfoActivity;
import com.scb.phone.view.activity.hml.promptpay.HmlPromptPayAboutActivity;
import com.scb.phone.view.custom.hml.CustomDecimalAmountVerification;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import kotlin.NoWhenBranchMatchedException;
import p040o.ActivityBuilder_BindGiftSelectionActivity;
import p040o.C5291x899552e6;
import p040o.CircularRevealFrameLayout;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_OnDevicePassportDeserializer_Factory;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setDataStoreName;
import p040o.setDataStoreName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlPromptpayEnterCodeFragment extends BaseFragment implements PassportCaptureModule_OnDevicePassportDeserializer_Factory {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    @BindView
    public ImageView aboutImg;
    @BindView
    public TextView errorText;
    @BindView
    public CustomDecimalAmountVerification firstCode;
    @HmlPinActivity
    public setDataStoreName presenter;
    @BindView
    public CustomDecimalAmountVerification secondCode;
    @BindView
    public CustomDecimalAmountVerification thirdCode;
    @BindView
    public Button verifyBtn;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89102131494137, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setDataStoreName setdatastorename = this.presenter;
        if (setdatastorename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setdatastorename.MediaBrowserCompat$ItemReceiver(this);
        setDataStoreName setdatastorename2 = this.presenter;
        if (setdatastorename2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5291x899552e6.write;
        if (setdatastorename2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(setdatastorename2.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setDataStoreName.read read2 = setDataStoreName.read.FIRST;
        CustomDecimalAmountVerification customDecimalAmountVerification = this.firstCode;
        if (customDecimalAmountVerification == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("firstCode");
        }
        CustomDecimalAmountVerification customDecimalAmountVerification2 = this.secondCode;
        if (customDecimalAmountVerification2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("secondCode");
        }
        customDecimalAmountVerification.setInputCodeListener(new HmlPromptpayEnterCodeFragment$MediaBrowserCompat$ItemReceiver(this, read2, customDecimalAmountVerification2, customDecimalAmountVerification));
        setDataStoreName.read read3 = setDataStoreName.read.SECOND;
        CustomDecimalAmountVerification customDecimalAmountVerification3 = this.secondCode;
        if (customDecimalAmountVerification3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("secondCode");
        }
        CustomDecimalAmountVerification customDecimalAmountVerification4 = this.thirdCode;
        if (customDecimalAmountVerification4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("thirdCode");
        }
        customDecimalAmountVerification3.setInputCodeListener(new HmlPromptpayEnterCodeFragment$MediaBrowserCompat$ItemReceiver(this, read3, customDecimalAmountVerification4, customDecimalAmountVerification3));
        setDataStoreName.read read4 = setDataStoreName.read.THIRD;
        CustomDecimalAmountVerification customDecimalAmountVerification5 = this.thirdCode;
        if (customDecimalAmountVerification5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("thirdCode");
        }
        customDecimalAmountVerification5.setInputCodeListener(new HmlPromptpayEnterCodeFragment$MediaBrowserCompat$ItemReceiver(this, read4, (CustomDecimalAmountVerification) null, customDecimalAmountVerification5));
        ImageView imageView = this.aboutImg;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("aboutImg");
        }
        imageView.setOnClickListener(new read(this));
        Button button = this.verifyBtn;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyBtn");
        }
        button.setOnClickListener(new write(this));
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ HmlPromptpayEnterCodeFragment MediaBrowserCompat$CustomActionResultReceiver;

        read(HmlPromptpayEnterCodeFragment hmlPromptpayEnterCodeFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlPromptpayEnterCodeFragment;
        }

        public final void onClick(View view) {
            setDataStoreName setdatastorename = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (setdatastorename == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setDataStoreName$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (setdatastorename.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setdatastorename.RatingCompat);
            }
        }
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ HmlPromptpayEnterCodeFragment read;

        write(HmlPromptpayEnterCodeFragment hmlPromptpayEnterCodeFragment) {
            this.read = hmlPromptpayEnterCodeFragment;
        }

        public final void onClick(View view) {
            setDataStoreName setdatastorename = this.read.presenter;
            if (setdatastorename == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            CircularRevealFrameLayout circularRevealFrameLayout = setdatastorename.MediaMetadataCompat;
            String[] strArr = new String[3];
            StringBuilder sb = new StringBuilder();
            sb.append("0.");
            String str = setdatastorename.MediaBrowserCompat$ItemReceiver;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            sb.append(str);
            boolean z = false;
            strArr[0] = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0.");
            String str2 = setdatastorename.IconCompatParcelizer;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            sb2.append(str2);
            strArr[1] = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("0.");
            String str3 = setdatastorename.write;
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            sb3.append(str3);
            strArr[2] = sb3.toString();
            DebitCardResetOtpActivity<Void> MediaBrowserCompat$CustomActionResultReceiver = circularRevealFrameLayout.MediaBrowserCompat$CustomActionResultReceiver(strArr);
            if (setdatastorename.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setdatastorename.RatingCompat.AlertController$RecycleListView();
            }
            setdatastorename.MediaMetadataCompat.write(MediaBrowserCompat$CustomActionResultReceiver, new setDataStoreName.RatingCompat(setdatastorename));
        }
    }

    public final void IconCompatParcelizer(boolean z, setDataStoreName.read read2) {
        onGetStartedClick.write((Object) read2, "code");
        int i = ActivityBuilder_BindGiftSelectionActivity.MediaBrowserCompat$ItemReceiver[read2.ordinal()];
        if (i == 1) {
            CustomDecimalAmountVerification customDecimalAmountVerification = this.firstCode;
            if (customDecimalAmountVerification == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("firstCode");
            }
            customDecimalAmountVerification.MediaBrowserCompat$ItemReceiver(z);
        } else if (i == 2) {
            CustomDecimalAmountVerification customDecimalAmountVerification2 = this.secondCode;
            if (customDecimalAmountVerification2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("secondCode");
            }
            customDecimalAmountVerification2.MediaBrowserCompat$ItemReceiver(z);
        } else if (i == 3) {
            CustomDecimalAmountVerification customDecimalAmountVerification3 = this.thirdCode;
            if (customDecimalAmountVerification3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("thirdCode");
            }
            customDecimalAmountVerification3.MediaBrowserCompat$ItemReceiver(z);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        TextView textView = this.errorText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("errorText");
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer(boolean z) {
        Button button = this.verifyBtn;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyBtn");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBOccupationInfoActivity.write write2 = HmlNTBOccupationInfoActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBOccupationInfoActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void write() {
        HmlPromptPayAboutActivity.read read2 = HmlPromptPayAboutActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "ctx");
        Intent intent = new Intent(requireContext, HmlPromptPayAboutActivity.class);
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

    public final void read() {
        Activity requireActivity = requireActivity();
        String string = getString(R.string.hml_promptpay_verification_snackbar_incorrect);
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(requireActivity, R.id.view_group_root, string, getoversizeimage);
        }
    }

    public final void IconCompatParcelizer() {
        Activity requireActivity = requireActivity();
        String string = getString(R.string.hml_promptpay_verification_snackbar_expired);
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(requireActivity, R.id.view_group_root, string, getoversizeimage);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Activity requireActivity = requireActivity();
        String string = getString(R.string.hml_promptpay_verification_snackbar_max_attemp);
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(requireActivity, R.id.view_group_root, string, getoversizeimage);
        }
    }

    public final void onDestroy() {
        setDataStoreName setdatastorename = this.presenter;
        if (setdatastorename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setdatastorename.onDestroy();
        super.onDestroy();
    }
}

package com.scb.phone.view.fragment.hml;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5617x4e60e68a;
import com.scb.phone.view.activity.hml.HmlNTBExternalInstructionActivity;
import com.scb.phone.view.activity.hml.HmlOTAinfoActivity;
import com.scb.phone.view.activity.hml.HmlVerifyPhoneValidateOtpActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CommonInputViewGroup$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_BindEasyAppTermsAndConditionsActivity;
import p040o.CheckableImageButton;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProcessingParameters;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setErrorMessage;
import p040o.setErrorMessage$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setErrorMessage$MediaBrowserCompat$ItemReceiver;
import p040o.setErrorMessage$MediaBrowserCompat$MediaItem;
import p040o.setErrorMessage$MediaBrowserCompat$SearchResultReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlNTBExternalAuthenticationFragment extends BaseFragment implements ProcessingParameters.ProcessingType {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    @BindView
    public CommonInputViewGroup etOta;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public setErrorMessage presenter;
    @BindView
    public CommonInputViewGroup vwNationalId;

    static final class RatingCompat implements CustomEditText.IconCompatParcelizer {
        public static final RatingCompat IconCompatParcelizer = new RatingCompat();

        RatingCompat() {
        }

        public final boolean IconCompatParcelizer(CustomEditText customEditText, String str) {
            return true;
        }
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
        View inflate = layoutInflater.inflate(R.layout.f87852131494012, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        CommonInputViewGroup commonInputViewGroup = this.vwNationalId;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup.mEditText.setKeyListener(DigitsKeyListener.getInstance("1234567890-"));
        CommonInputViewGroup commonInputViewGroup2 = this.vwNationalId;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup2.setOnPasteListener(RatingCompat.IconCompatParcelizer);
        CommonInputViewGroup commonInputViewGroup3 = this.vwNationalId;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        CommonInputViewGroup commonInputViewGroup4 = this.vwNationalId;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup4.mEditText, "X-XXXX-XXXXX-XX-X", new C5997x77474804(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = new C5996x1f97c875(this);
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.write = true;
        TextWatcher textWatcher = fragmentBuilder_BindEasycashFeaturesCardInformationFragment;
        commonInputViewGroup3.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup3.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        CommonInputViewGroup commonInputViewGroup5 = this.etOta;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        commonInputViewGroup5.setIconListener(new read(this));
        CommonInputViewGroup commonInputViewGroup6 = this.etOta;
        if (commonInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        TextWatcher write2 = new write(this);
        commonInputViewGroup6.mEditText.addTextChangedListener(write2);
        commonInputViewGroup6.MediaBrowserCompat$CustomActionResultReceiver.add(write2);
        setErrorMessage seterrormessage = this.presenter;
        if (seterrormessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seterrormessage.MediaBrowserCompat$ItemReceiver(this);
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setOnClickListener(new MediaMetadataCompat(this));
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…text, etOta.text) }\n    }");
        return inflate;
    }

    static final class read implements CommonInputViewGroup$MediaBrowserCompat$ItemReceiver {
        private /* synthetic */ HmlNTBExternalAuthenticationFragment IconCompatParcelizer;

        read(HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment) {
            this.IconCompatParcelizer = hmlNTBExternalAuthenticationFragment;
        }

        public final void read() {
            setErrorMessage seterrormessage = this.IconCompatParcelizer.presenter;
            if (seterrormessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setErrorMessage$MediaBrowserCompat$ItemReceiver.write;
            if (seterrormessage.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(seterrormessage.RatingCompat);
            }
        }
    }

    public static final class write extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private /* synthetic */ HmlNTBExternalAuthenticationFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBExternalAuthenticationFragment;
        }

        public final void afterTextChanged(Editable editable) {
            setErrorMessage seterrormessage = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (seterrormessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String valueOf = String.valueOf(editable);
            onGetStartedClick.write((Object) valueOf, "code");
            boolean z = true;
            if (valueOf.length() == 0) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setErrorMessage$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
                if (seterrormessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(seterrormessage.RatingCompat);
                }
            } else if (valueOf.length() < 6) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setErrorMessage$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (seterrormessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(seterrormessage.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = setErrorMessage.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
                if (seterrormessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer3.IconCompatParcelizer(seterrormessage.RatingCompat);
                }
            }
        }
    }

    static final class MediaMetadataCompat implements View.OnClickListener {
        private /* synthetic */ HmlNTBExternalAuthenticationFragment MediaBrowserCompat$CustomActionResultReceiver;

        MediaMetadataCompat(HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBExternalAuthenticationFragment;
        }

        public final void onClick(View view) {
            setErrorMessage seterrormessage = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (seterrormessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$CustomActionResultReceiver.vwNationalId;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
            }
            String obj = commonInputViewGroup.mEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "vwNationalId.text");
            CommonInputViewGroup commonInputViewGroup2 = this.MediaBrowserCompat$CustomActionResultReceiver.etOta;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
            }
            String obj2 = commonInputViewGroup2.mEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj2, "etOta.text");
            onGetStartedClick.write((Object) obj, "nationalId");
            onGetStartedClick.write((Object) obj2, "ota");
            if (seterrormessage.RatingCompat != null) {
                seterrormessage.RatingCompat.AlertController$RecycleListView();
            }
            CheckableImageButton checkableImageButton = seterrormessage.read;
            checkableImageButton.write(checkableImageButton.MediaBrowserCompat$ItemReceiver(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(obj, "-", "", false), obj2), new setErrorMessage.MediaDescriptionCompat(seterrormessage));
        }
    }

    public final void read(setErrorMessage$MediaBrowserCompat$CustomActionResultReceiver seterrormessage_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) seterrormessage_mediabrowsercompat_customactionresultreceiver, "nextScreen");
        int i = ActivityBuilder_BindEasyAppTermsAndConditionsActivity.IconCompatParcelizer[seterrormessage_mediabrowsercompat_customactionresultreceiver.ordinal()];
        if (i == 1) {
            HmlOTAinfoActivity.read read2 = HmlOTAinfoActivity.MediaBrowserCompat$SearchResultReceiver;
            Context requireContext = requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
            onGetStartedClick.write((Object) requireContext, "context");
            Intent intent = new Intent(requireContext, HmlOTAinfoActivity.class);
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
        } else if (i == 2) {
            C5617x4e60e68a hmlNTBExternalInstructionActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBExternalInstructionActivity.MediaDescriptionCompat;
            Context requireContext2 = requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext2, "requireContext()");
            onGetStartedClick.write((Object) requireContext2, "context");
            Intent intent2 = new Intent(requireContext2, HmlNTBExternalInstructionActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent2 = setTapText.write(activity2, intent2).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb2.append(intent2.getData());
                sb2.append("\n with context ");
                sb2.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                startActivity(intent2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } else if (i == 3) {
            HmlVerifyPhoneValidateOtpActivity.write write4 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$SearchResultReceiver;
            Context requireContext3 = requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext3, "requireContext()");
            onGetStartedClick.write((Object) requireContext3, "context");
            Intent intent3 = new Intent(requireContext3, HmlVerifyPhoneValidateOtpActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    intent3 = setTapText.write(activity3, intent3).read();
                }
                MyECouponActivity_ViewBinding.write write5 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb3 = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb3.append(intent3.getData());
                sb3.append("\n with context ");
                sb3.append(activity3.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write5, sb3.toString());
                startActivityForResult(intent3, 1234);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1234 && i2 == -1) {
            setErrorMessage seterrormessage = this.presenter;
            if (seterrormessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setErrorMessage.MediaMetadataCompat.IconCompatParcelizer;
            if (seterrormessage.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(seterrormessage.RatingCompat);
            }
        }
    }

    public final void read() {
        CommonInputViewGroup commonInputViewGroup = this.vwNationalId;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_external_authentication_id_field_error));
        CommonInputViewGroup commonInputViewGroup2 = this.vwNationalId;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.vwNationalId;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_external_authentication_id_field_error));
        CommonInputViewGroup commonInputViewGroup2 = this.vwNationalId;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.vwNationalId;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwNationalId");
        }
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$MediaItem() {
        CommonInputViewGroup commonInputViewGroup = this.etOta;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_external_authentication_ota_field_error));
        CommonInputViewGroup commonInputViewGroup2 = this.etOta;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void write() {
        CommonInputViewGroup commonInputViewGroup = this.etOta;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_external_authentication_ota_field_error));
        CommonInputViewGroup commonInputViewGroup2 = this.etOta;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer() {
        CommonInputViewGroup commonInputViewGroup = this.etOta;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etOta");
        }
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        Activity requireActivity = requireActivity();
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(requireActivity, R.id.view_group_root, str, getoversizeimage);
        }
    }

    public final void onDestroyView() {
        setErrorMessage seterrormessage = this.presenter;
        if (seterrormessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seterrormessage.onDestroy();
        super.onDestroyView();
    }
}

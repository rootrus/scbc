package com.scb.phone.view.fragment.registration.friends;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.registration.onboarding.RegistrationOnboardingActivity;
import com.scb.phone.view.custom.common.ClearableFullWidthEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.C4571xeb61486d;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindBaseMapTabFragment;
import p040o.FragmentBuilder_BindEasycashCommercialLoanAccountFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.Lists;
import p040o.ProviderInstaller;
import p040o.ZSYR2K;
import p040o.getFileSHA;
import p040o.getProcessName;
import p040o.getProcessName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getProcessName$MediaBrowserCompat$ItemReceiver;
import p040o.getProcessName$MediaBrowserCompat$MediaItem;
import p040o.getProcessName$MediaBrowserCompat$SearchResultReceiver;
import p040o.onFaceExtracted;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class FriendsRegistrationFragment extends BaseFragment implements onFaceExtracted {
    private final FragmentBuilder_BindEasycashCommercialLoanAccountFragment MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindEasycashCommercialLoanAccountFragment(new IconCompatParcelizer(this));
    @BindView
    public ClearableFullWidthEditText inputReferralCode;
    @BindView
    public Button okButton;
    @HmlPinActivity
    public getProcessName presenter;
    @BindView
    public ConstraintLayout rootView;
    @BindView
    public TextView titleDetail;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ FriendsRegistrationFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(FriendsRegistrationFragment friendsRegistrationFragment) {
            super(1);
            this.read = friendsRegistrationFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "code");
            getProcessName getprocessname = this.read.presenter;
            if (getprocessname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "code");
            boolean z = true;
            writeUInt64NoTag.IconCompatParcelizer write = new getProcessName.write(str.length() == 6 && ProviderInstaller.ProviderInstallListener.write(str));
            if (getprocessname.RatingCompat == null) {
                z = false;
            }
            if (z) {
                write.IconCompatParcelizer(getprocessname.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89332131494160, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getProcessName getprocessname = this.presenter;
        if (getprocessname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getprocessname.MediaBrowserCompat$ItemReceiver(this);
        Button button = this.okButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("okButton");
        }
        button.setEnabled(false);
        ClearableFullWidthEditText clearableFullWidthEditText = this.inputReferralCode;
        if (clearableFullWidthEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        clearableFullWidthEditText.inputEditText.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        clearableFullWidthEditText.setEditTextKeyboardActionListener(new FriendsRegistrationFragment$MediaBrowserCompat$ItemReceiver(this));
        ClearableFullWidthEditText clearableFullWidthEditText2 = this.inputReferralCode;
        if (clearableFullWidthEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        clearableFullWidthEditText2.setErrorVisible(false);
        ConstraintLayout constraintLayout = this.rootView;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootView");
        }
        constraintLayout.requestFocus();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            onGetStartedClick.IconCompatParcelizer((Object) activity, "act");
            Serializable serializableExtra = activity.getIntent().getSerializableExtra("SUCCESS_PAGE_DYNAMIC_TYPE");
            if (serializableExtra != null && (serializableExtra instanceof getFileSHA)) {
                getProcessName getprocessname2 = this.presenter;
                if (getprocessname2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                getFileSHA getfilesha = (getFileSHA) serializableExtra;
                onGetStartedClick.write((Object) getfilesha, "type");
                if (getfilesha == getFileSHA.DEAD_CARD) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getProcessName.MediaDescriptionCompat.write;
                    if (getprocessname2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(getprocessname2.RatingCompat);
                    }
                }
            }
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("friends_get_friends_registration_success");
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.okButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("okButton");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        RegistrationOnboardingActivity.write(getContext());
    }

    public final void read(boolean z) {
        ClearableFullWidthEditText clearableFullWidthEditText = this.inputReferralCode;
        if (clearableFullWidthEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        clearableFullWidthEditText.setErrorVisible(z);
    }

    @OnClick
    public final void onClickSkipButton() {
        boolean z = true;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("button", "skip")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("friends_get_friends_button", zsyr2kArr);
        }
        getProcessName getprocessname = this.presenter;
        if (getprocessname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getProcessName$MediaBrowserCompat$CustomActionResultReceiver.read;
        if (getprocessname.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(getprocessname.RatingCompat);
        }
    }

    @OnClick
    public final void onClickOkButton() {
        boolean z = true;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("button", "ok")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("friends_get_friends_button", zsyr2kArr);
        }
        getProcessName getprocessname = this.presenter;
        if (getprocessname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ClearableFullWidthEditText clearableFullWidthEditText = this.inputReferralCode;
        if (clearableFullWidthEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        String obj = clearableFullWidthEditText.inputEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "inputReferralCode.text");
        onGetStartedClick.write((Object) obj, "code");
        if (getprocessname.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getprocessname.RatingCompat.AlertController$RecycleListView();
        }
        Lists.OnePlusArrayList onePlusArrayList = getprocessname.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity getprocessname_mediabrowsercompat_itemreceiver = new getProcessName$MediaBrowserCompat$ItemReceiver(getprocessname);
        FundFactSheetActivity iconCompatParcelizer = new getProcessName.IconCompatParcelizer(getprocessname);
        onGetStartedClick.write((Object) getprocessname_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) obj, "referCode");
        onePlusArrayList.IconCompatParcelizer(onePlusArrayList.read, getprocessname_mediabrowsercompat_itemreceiver, iconCompatParcelizer, new C4571xeb61486d(obj));
    }

    public final void read() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.registration_completed_referral_skip_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.registration_completed_referral_skip_text)).IconCompatParcelizer(getString(R.string.registration_completed_referral_skip_ok), new write(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.registration_completed_referral_skip_cancel), read.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ FriendsRegistrationFragment read;

        write(FriendsRegistrationFragment friendsRegistrationFragment) {
            this.read = friendsRegistrationFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            getProcessName getprocessname = this.read.presenter;
            if (getprocessname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getProcessName$MediaBrowserCompat$MediaItem.IconCompatParcelizer;
            if (getprocessname.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getprocessname.RatingCompat);
            }
            dialogInterface.dismiss();
        }
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomDialog write2 = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.registration_completed_referral_success_title)).write(getString(R.string.registration_completed_referral_success_ok), new C9487xebdb882c(this));
        write2.setCanceledOnTouchOutside(false);
        write2.show();
    }

    public final void IconCompatParcelizer() {
        TextView textView = this.titleDetail;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleDetail");
        }
        textView.setText(getResources().getString(R.string.friend_get_friends_regis_successful_success_cc_activation_register));
    }

    public final void onDestroy() {
        ClearableFullWidthEditText clearableFullWidthEditText = this.inputReferralCode;
        if (clearableFullWidthEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        clearableFullWidthEditText.inputEditText.removeTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        clearableFullWidthEditText.setEditTextKeyboardActionListener((FragmentBuilder_BindBaseMapTabFragment) null);
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(FriendsRegistrationFragment friendsRegistrationFragment) {
        ClearableFullWidthEditText clearableFullWidthEditText = friendsRegistrationFragment.inputReferralCode;
        if (clearableFullWidthEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        ClearableFullWidthEditText clearableFullWidthEditText2 = friendsRegistrationFragment.inputReferralCode;
        if (clearableFullWidthEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
        }
        String obj = clearableFullWidthEditText2.inputEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "inputReferralCode.text");
        if (obj != null) {
            String upperCase = obj.toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            clearableFullWidthEditText.setText(upperCase);
            getProcessName getprocessname = friendsRegistrationFragment.presenter;
            if (getprocessname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            ClearableFullWidthEditText clearableFullWidthEditText3 = friendsRegistrationFragment.inputReferralCode;
            if (clearableFullWidthEditText3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("inputReferralCode");
            }
            String obj2 = clearableFullWidthEditText3.inputEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj2, "inputReferralCode.text");
            onGetStartedClick.write((Object) obj2, "code");
            boolean z = false;
            writeUInt64NoTag.IconCompatParcelizer getprocessname_mediabrowsercompat_searchresultreceiver = new getProcessName$MediaBrowserCompat$SearchResultReceiver(!(obj2.length() == 6 && ProviderInstaller.ProviderInstallListener.write(obj2)));
            if (getprocessname.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getprocessname_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(getprocessname.RatingCompat);
            }
            Button button = friendsRegistrationFragment.okButton;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("okButton");
            }
            View view = button;
            onGetStartedClick.write((Object) view, "$this$clearInputFocus");
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            friendsRegistrationFragment.PlaybackStateCompat$CustomAction();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}

package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5602xb52cebc;
import com.scb.phone.view.activity.hml.HmlBusinessEmailAboutActivity;
import com.scb.phone.view.activity.hml.HmlBusinessOccupationInfoActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomEditText;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.jmrtd.cbeff.ISO781611;
import p040o.C5388xbb871c72;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.FragmentBuilder_BindProductDetailFragment;
import p040o.HmlPinActivity;
import p040o.IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.IParameters;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.addFrameListener;
import p040o.getHintPickerIntent;
import p040o.getProjectAsync;
import p040o.listSessionBeginFiles$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.processPendingCleanup;
import p040o.recordExpirationTime;
import p040o.removeIfFromRandomAccessList;
import p040o.save;
import p040o.setSessionTimeoutDuration;
import p040o.setTapText;
import p040o.setUserEmailAddress;
import p040o.setUserEmailAddress$MediaBrowserCompat$SearchResultReceiver;
import p040o.writeCharArray;
import p040o.writeDouble;
import p040o.writeDoubleArray;
import p040o.writeDoubleSparseArray;
import p040o.writeUInt64NoTag;
import p040o.zzap;

public final class HmlBusinessOwnerETBPersonalInfoFragment extends HmlETBPersonalInfoFragment implements IParameters {
    @HmlPinActivity
    public setUserEmailAddress<IParameters> businessPresenter;
    @BindView
    public View incomeSection;
    @BindView
    public TextView spouseCitizenError;
    @BindView
    public TextView spouseCitizenFooter;
    @BindView
    public CustomAcceptDeclineButtons spouseCitizenToggler;
    @BindView
    public CommonInputViewGroup spouseFirstNameInput;
    @BindView
    public TextView spouseHeaderLabel;
    @BindView
    public CommonInputViewGroup spouseLastNameInput;
    @BindView
    public CommonInputViewGroup spouseNIDInput;
    @BindView
    public View spouseSeparator;

    public final int AppCompatDialogFragment() {
        return R.layout.f87782131494005;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read implements getProjectAsync {
        public final FragmentBuilder_BindProductDetailFragment MediaBrowserCompat$CustomActionResultReceiver;
        private final IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver read;
        public final getHintPickerIntent write;

        private read() {
        }

        @HmlPinActivity
        public read(IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver iFaceDetector$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindProductDetailFragment fragmentBuilder_BindProductDetailFragment, save save, getHintPickerIntent gethintpickerintent) {
            this.read = iFaceDetector$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindProductDetailFragment;
            this.write = gethintpickerintent;
        }

        public final DebitCardResetOtpActivity<setSessionTimeoutDuration> read(processPendingCleanup processpendingcleanup) {
            return this.read.write.getConfirmRequest(processpendingcleanup).flatMap(new writeDoubleArray(this));
        }

        public final DebitCardResetOtpActivity<zzap.zzb> IconCompatParcelizer(int i) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.write < i) {
                return this.read.write.getEBillSubscription(i).doOnNext(new writeDoubleSparseArray(this, i)).flatMap(new writeDouble(this));
            }
            return DebitCardResetOtpActivity.just(save.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver));
        }

        public final DebitCardResetOtpActivity<zzap.zzb> MediaBrowserCompat$CustomActionResultReceiver() {
            return DebitCardResetOtpActivity.just(save.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver));
        }

        public final int IconCompatParcelizer() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write;
        }

        public final int write() {
            FragmentBuilder_BindProductDetailFragment fragmentBuilder_BindProductDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            SingleDataEntity<addFrameListener> singleDataEntity = fragmentBuilder_BindProductDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (singleDataEntity == null || singleDataEntity.getData() == null) {
                return 1;
            }
            return fragmentBuilder_BindProductDetailFragment.MediaBrowserCompat$CustomActionResultReceiver.getData().MediaBrowserCompat$ItemReceiver;
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(recordExpirationTime recordexpirationtime) {
            return this.read.write.getUnsubcribeRequest(recordexpirationtime).flatMap(writeCharArray.IconCompatParcelizer);
        }

        public final void read() {
            FragmentBuilder_BindProductDetailFragment fragmentBuilder_BindProductDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindProductDetailFragment.write = 0;
            fragmentBuilder_BindProductDetailFragment.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        setUserEmailAddress<IParameters> setuseremailaddress = this.businessPresenter;
        if (setuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        setuseremailaddress.MediaBrowserCompat$ItemReceiver(this);
        setUserEmailAddress<IParameters> setuseremailaddress2 = this.businessPresenter;
        if (setuseremailaddress2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        MediaBrowserCompat$CustomActionResultReceiver(setuseremailaddress2);
        this.tvETBExpiryDateTitle.setVisibility(0);
        this.baseExpiredDate.setVisibility(0);
        this.laserIdInput.setLaserIdButtonVisibility(false);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_business_verification_personal_info", zsyr2kArr);
        }
        setUserEmailAddress<IParameters> setuseremailaddress3 = this.businessPresenter;
        if (setuseremailaddress3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
        }
        setuseremailaddress3.MediaBrowserCompat$CustomActionResultReceiver();
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.spouseCitizenToggler;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenToggler");
        }
        TextView textView = customAcceptDeclineButtons.tvLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
        }
        textView.setVisibility(8);
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        CustomEditText customEditText = commonInputViewGroup.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText, "spouseFirstNameInput.editText");
        customEditText.setInputType(524432);
        CommonInputViewGroup commonInputViewGroup2 = this.spouseFirstNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        CustomEditText customEditText2 = commonInputViewGroup2.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText2, "spouseFirstNameInput.editText");
        customEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ISO781611.BIOMETRIC_SUBTYPE_TAG)});
        CommonInputViewGroup commonInputViewGroup3 = this.spouseLastNameInput;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        CustomEditText customEditText3 = commonInputViewGroup3.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText3, "spouseLastNameInput.editText");
        customEditText3.setInputType(524432);
        CommonInputViewGroup commonInputViewGroup4 = this.spouseLastNameInput;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        CustomEditText customEditText4 = commonInputViewGroup4.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText4, "spouseLastNameInput.editText");
        customEditText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        CommonInputViewGroup commonInputViewGroup5 = this.spouseNIDInput;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup5.setErrorText(getString(R.string.auto_bo_spouse_id_card_error_invalid));
        CommonInputViewGroup commonInputViewGroup6 = this.spouseNIDInput;
        if (commonInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        CustomEditText customEditText5 = commonInputViewGroup6.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText5, "spouseNIDInput.editText");
        customEditText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        CommonInputViewGroup commonInputViewGroup7 = this.spouseNIDInput;
        if (commonInputViewGroup7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        CustomEditText customEditText6 = commonInputViewGroup7.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText6, "spouseNIDInput.editText");
        customEditText6.setInputType(2);
        CommonInputViewGroup commonInputViewGroup8 = this.spouseNIDInput;
        if (commonInputViewGroup8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        CustomEditText customEditText7 = commonInputViewGroup8.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText7, "spouseNIDInput.editText");
        customEditText7.setKeyListener(DigitsKeyListener.getInstance("1234567890-"));
        CommonInputViewGroup commonInputViewGroup9 = this.spouseNIDInput;
        if (commonInputViewGroup9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup9.setOnPasteListener(new IconCompatParcelizer(this));
        CommonInputViewGroup commonInputViewGroup10 = this.spouseNIDInput;
        if (commonInputViewGroup10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        CommonInputViewGroup commonInputViewGroup11 = this.spouseNIDInput;
        if (commonInputViewGroup11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        TextWatcher fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup11.mEditText, "X-XXXX-XXXXX-XX-X", new write(this));
        commonInputViewGroup10.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        commonInputViewGroup10.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        CommonInputViewGroup commonInputViewGroup12 = this.spouseNIDInput;
        if (commonInputViewGroup12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup12.setFocusListener(new C5970x59d839b2(this));
        CommonInputViewGroup commonInputViewGroup13 = this.spouseNIDInput;
        if (commonInputViewGroup13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup13.setOnBackListener(new MediaMetadataCompat(this));
        CommonInputViewGroup commonInputViewGroup14 = this.spouseNIDInput;
        if (commonInputViewGroup14 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup14.setOnEditorActionListener(new RatingCompat(this));
        IconCompatParcelizer("p10x1_business_verif_personal_info", new ZSYR2K("user_type", "etb"));
        return onCreateView;
    }

    static final class IconCompatParcelizer implements CustomEditText.IconCompatParcelizer {
        private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment IconCompatParcelizer;

        IconCompatParcelizer(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
            this.IconCompatParcelizer = hmlBusinessOwnerETBPersonalInfoFragment;
        }

        public final boolean IconCompatParcelizer(CustomEditText customEditText, String str) {
            setUserEmailAddress<IParameters> setuseremailaddress = this.IconCompatParcelizer.businessPresenter;
            if (setuseremailaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) str, "text");
            onGetStartedClick.write((Object) str, "text");
            int i = 17;
            if (str.length() < 17) {
                i = str.length();
            }
            writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_searchresultreceiver = new setUserEmailAddress$MediaBrowserCompat$SearchResultReceiver(str, i);
            boolean z = false;
            if (setuseremailaddress.RatingCompat != null) {
                setuseremailaddress_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
            }
            writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_customactionresultreceiver = new C5388xbb871c72(setuseremailaddress);
            if (setuseremailaddress.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setuseremailaddress_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
            }
            return true;
        }
    }

    static final class write implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
        private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment write;

        write(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
            this.write = hmlBusinessOwnerETBPersonalInfoFragment;
        }

        public final String MediaBrowserCompat$ItemReceiver(String str) {
            if (this.write.businessPresenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessPresenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) str, "input");
            onGetStartedClick.write((Object) str, "nationalId");
            String read = removeIfFromRandomAccessList.read(str, "[^0-9]", "X-XXXX-XXXXX-XX-X");
            onGetStartedClick.IconCompatParcelizer((Object) read, "formatCitizenCase.formatString(nationalId)");
            return read;
        }
    }

    static final class MediaMetadataCompat implements CustomEditText.write {
        private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment write;

        MediaMetadataCompat(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
            this.write = hmlBusinessOwnerETBPersonalInfoFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment = this.write;
            hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusable(true);
            hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusableInTouchMode(true);
            hmlBusinessOwnerETBPersonalInfoFragment.root.requestFocus();
        }
    }

    static final class RatingCompat implements TextView.OnEditorActionListener {
        private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

        RatingCompat(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerETBPersonalInfoFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction();
            HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusable(true);
            hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusableInTouchMode(true);
            hmlBusinessOwnerETBPersonalInfoFragment.root.requestFocus();
            return true;
        }
    }

    public final void read(boolean z, boolean z2) {
        TextView textView = this.spouseHeaderLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseHeaderLabel");
        }
        View view = textView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        int i = 0;
        view.setVisibility(z ? 0 : 8);
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.spouseCitizenToggler;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenToggler");
        }
        View view2 = customAcceptDeclineButtons;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        view2.setVisibility(z ? 0 : 8);
        TextView textView2 = this.spouseCitizenError;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenError");
        }
        View view3 = textView2;
        onGetStartedClick.write((Object) view3, "$this$isVisible");
        view3.setVisibility(8);
        TextView textView3 = this.spouseCitizenFooter;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenFooter");
        }
        View view4 = textView3;
        onGetStartedClick.write((Object) view4, "$this$isVisible");
        view4.setVisibility(z ? 0 : 8);
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        View view5 = commonInputViewGroup;
        onGetStartedClick.write((Object) view5, "$this$isVisible");
        view5.setVisibility(z ? 0 : 8);
        CommonInputViewGroup commonInputViewGroup2 = this.spouseLastNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        View view6 = commonInputViewGroup2;
        onGetStartedClick.write((Object) view6, "$this$isVisible");
        view6.setVisibility(z ? 0 : 8);
        CommonInputViewGroup commonInputViewGroup3 = this.spouseNIDInput;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        View view7 = commonInputViewGroup3;
        onGetStartedClick.write((Object) view7, "$this$isVisible");
        view7.setVisibility(z ? 0 : 8);
        View view8 = this.spouseSeparator;
        if (view8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseSeparator");
        }
        onGetStartedClick.write((Object) view8, "$this$isVisible");
        if (!z) {
            i = 8;
        }
        view8.setVisibility(i);
    }

    public final void MediaDescriptionCompat() {
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.spouseCitizenToggler;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenToggler");
        }
        CustomAcceptDeclineButtons.setText$default(customAcceptDeclineButtons, getString(R.string.hml_business_owner_personal_info_spouse_thai_button_toggle), getString(R.string.hml_business_owner_personal_info_spouse_non_thai_button_toggle), (String) null, 4, (Object) null);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.spouseCitizenToggler;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenToggler");
        }
        customAcceptDeclineButtons2.setOnButtonClickListener(new C5972x58503f98(this));
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup.setFocusListener(new C5973x867f77d3(this));
        CommonInputViewGroup commonInputViewGroup2 = this.spouseFirstNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup2.setOnEditorActionListener(new MediaDescriptionCompat(this));
        CommonInputViewGroup commonInputViewGroup3 = this.spouseFirstNameInput;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup3.setOnBackListener(new C5975x7fce45b3(this));
        CommonInputViewGroup commonInputViewGroup4 = this.spouseLastNameInput;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup4.setFocusListener(new C5974xf11df18b(this));
        CommonInputViewGroup commonInputViewGroup5 = this.spouseLastNameInput;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup5.setOnEditorActionListener(new HmlBusinessOwnerETBPersonalInfoFragment$MediaSessionCompat$Token(this));
        CommonInputViewGroup commonInputViewGroup6 = this.spouseLastNameInput;
        if (commonInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup6.setOnBackListener(new C5976x3331c936(this));
    }

    static final class MediaDescriptionCompat implements TextView.OnEditorActionListener {
        private /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment) {
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerETBPersonalInfoFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction();
            HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment = this.MediaBrowserCompat$ItemReceiver;
            hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusable(true);
            hmlBusinessOwnerETBPersonalInfoFragment.root.setFocusableInTouchMode(true);
            hmlBusinessOwnerETBPersonalInfoFragment.root.requestFocus();
            return true;
        }
    }

    public final void read(boolean z) {
        TextView textView = this.spouseCitizenFooter;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenFooter");
        }
        View view = textView;
        boolean z2 = !z;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        int i = 0;
        view.setVisibility(z2 ? 0 : 8);
        TextView textView2 = this.spouseCitizenError;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenError");
        }
        View view2 = textView2;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo37527x50fd9e4a() {
        View view = this.incomeSection;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSection");
        }
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(8);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "text");
        CommonInputViewGroup commonInputViewGroup = this.spouseNIDInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup.setText(str);
    }

    public final void RatingCompat() {
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_business_owner_personal_info_spouse_first_name_blank_error));
        CommonInputViewGroup commonInputViewGroup2 = this.spouseFirstNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaSessionCompat$Token() {
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_business_owner_personal_info_spouse_first_name_not_valid_error));
        CommonInputViewGroup commonInputViewGroup2 = this.spouseFirstNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaSessionCompat$QueueItem() {
        CommonInputViewGroup commonInputViewGroup = this.spouseLastNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_business_owner_personal_info_spouse_last_name_blank_error));
        CommonInputViewGroup commonInputViewGroup2 = this.spouseLastNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        CommonInputViewGroup commonInputViewGroup = this.spouseLastNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_business_owner_personal_info_spouse_last_name_not_valid_error));
        CommonInputViewGroup commonInputViewGroup2 = this.spouseLastNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void setContentView() {
        CommonInputViewGroup commonInputViewGroup = this.spouseLastNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        CommonInputViewGroup commonInputViewGroup = this.spouseNIDInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        if (z) {
            commonInputViewGroup.MediaBrowserCompat$ItemReceiver();
        } else {
            commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Context context = getContext();
        if (context != null) {
            C5602xb52cebc hmlBusinessOccupationInfoActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOccupationInfoActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlBusinessOccupationInfoActivity.class);
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
    }

    /* access modifiers changed from: protected */
    public final void setChecked() {
        Intent intent;
        Context context = getContext();
        if (context != null) {
            HmlBusinessEmailAboutActivity.IconCompatParcelizer iconCompatParcelizer = HmlBusinessEmailAboutActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            intent = new Intent(context, HmlBusinessEmailAboutActivity.class);
        } else {
            intent = null;
        }
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

    public final void IconCompatParcelizer(boolean z) {
        if (!z) {
            this.root.setFocusable(true);
            this.root.setFocusableInTouchMode(true);
            this.root.requestFocus();
            CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
            }
            commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
            CommonInputViewGroup commonInputViewGroup2 = this.spouseLastNameInput;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
            }
            commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver();
            CommonInputViewGroup commonInputViewGroup3 = this.spouseNIDInput;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
            }
            commonInputViewGroup3.MediaBrowserCompat$CustomActionResultReceiver();
        }
        CommonInputViewGroup commonInputViewGroup4 = this.spouseFirstNameInput;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup4.setEnabled(z);
        CommonInputViewGroup commonInputViewGroup5 = this.spouseFirstNameInput;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup5.setForegroundFontEnabled(z);
        CommonInputViewGroup commonInputViewGroup6 = this.spouseLastNameInput;
        if (commonInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup6.setEnabled(z);
        CommonInputViewGroup commonInputViewGroup7 = this.spouseLastNameInput;
        if (commonInputViewGroup7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup7.setForegroundFontEnabled(z);
        CommonInputViewGroup commonInputViewGroup8 = this.spouseNIDInput;
        if (commonInputViewGroup8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup8.setEnabled(z);
        CommonInputViewGroup commonInputViewGroup9 = this.spouseNIDInput;
        if (commonInputViewGroup9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup9.setForegroundFontEnabled(z);
    }

    public final void IconCompatParcelizer(listSessionBeginFiles$MediaBrowserCompat$ItemReceiver listsessionbeginfiles_mediabrowsercompat_itemreceiver) {
        onGetStartedClick.write((Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver, "info");
        Boolean bool = listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            CustomAcceptDeclineButtons customAcceptDeclineButtons = this.spouseCitizenToggler;
            if (customAcceptDeclineButtons == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseCitizenToggler");
            }
            customAcceptDeclineButtons.write(booleanValue);
        }
        CommonInputViewGroup commonInputViewGroup = this.spouseFirstNameInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseFirstNameInput");
        }
        commonInputViewGroup.setText(listsessionbeginfiles_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
        CommonInputViewGroup commonInputViewGroup2 = this.spouseLastNameInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseLastNameInput");
        }
        commonInputViewGroup2.setText(listsessionbeginfiles_mediabrowsercompat_itemreceiver.read);
        CommonInputViewGroup commonInputViewGroup3 = this.spouseNIDInput;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spouseNIDInput");
        }
        commonInputViewGroup3.setText(listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

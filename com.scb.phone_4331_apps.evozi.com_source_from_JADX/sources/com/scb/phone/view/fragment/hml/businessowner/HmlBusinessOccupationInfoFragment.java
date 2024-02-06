package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.C5606xa099befc;
import com.scb.phone.view.activity.hml.HmlBusinessAddressActivity;
import com.scb.phone.view.activity.hml.HmlCompanyNameActivity;
import com.scb.phone.view.activity.hml.HmlETBBusinessInformationActivity;
import com.scb.phone.view.custom.CustomExternalSelector;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Arrays;
import p040o.AlertController$RecycleListView;
import p040o.C4543x83a7f79;
import p040o.C5393xf81ef25a;
import p040o.CheckEligibilityActivity;
import p040o.ExtractionCredentials;
import p040o.FragmentBuilder_BindEasycashCommercialLoanAccountFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCurrentTimestampSeconds;
import p040o.getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver;
import p040o.getEligibility;
import p040o.getICheckDeserializerRtti;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setContentDescription;
import p040o.setTapText;
import p040o.setUserLoggedIn;
import p040o.setUserLoggedIn$MediaBrowserCompat$MediaItem;
import p040o.writeUInt64NoTag;

public class HmlBusinessOccupationInfoFragment extends BaseFragment implements ExtractionCredentials {
    public static final write IconCompatParcelizer = new write((byte) 0);
    @BindView
    public CustomExternalSelector addressSelector;
    @BindView
    public CheckBox cbProfession;
    @BindView
    public TextView experienceError;
    @BindView
    public CustomPhoneNumberInput ivgContactNumber;
    @BindView
    public CustomExternalSelector ivgRegistered;
    @BindView
    public CustomSpinnerWithTitle monthsSpinner;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public setUserLoggedIn<ExtractionCredentials> presenter;
    @BindView
    public CustomAcceptDeclineButtons professionButtons;
    @BindView
    public TextView tvNameFooter;
    @BindView
    public TextView tvProfessionError;
    @BindView
    public TextView tvProfessionFooter;
    @BindView
    public TextView tvProfessionLabel;
    @BindView
    public CustomSpinnerWithTitle yearsSpinner;

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlBusinessOccupationInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOccupationInfoFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "it");
            setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (setuserloggedin == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "inputPhone");
            if (str != null && !str.equals("")) {
                str = str.replace("-", "");
            }
            setuserloggedin.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str;
            boolean z = true;
            writeUInt64NoTag.IconCompatParcelizer sethasdecor = new setUserLoggedIn.setHasDecor(setuserloggedin, true);
            if (setuserloggedin.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sethasdecor.IconCompatParcelizer(setuserloggedin.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<EditText, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ HmlBusinessOccupationInfoFragment MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessOccupationInfoFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final EditText editText = (EditText) obj;
            onGetStartedClick.IconCompatParcelizer((Object) editText, "it");
            AlertController$RecycleListView.IconCompatParcelizer(editText, true);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                private /* synthetic */ RatingCompat IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final void onFocusChange(View view, boolean z) {
                    boolean z2 = false;
                    if (z) {
                        EditText editText = editText;
                        onGetStartedClick.IconCompatParcelizer((Object) editText, "it");
                        AlertController$RecycleListView.IconCompatParcelizer(editText, false);
                        return;
                    }
                    EditText editText2 = editText;
                    onGetStartedClick.IconCompatParcelizer((Object) editText2, "it");
                    AlertController$RecycleListView.IconCompatParcelizer(editText2, false);
                    setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.presenter;
                    if (setuserloggedin == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    writeUInt64NoTag.IconCompatParcelizer sethasdecor = new setUserLoggedIn.setHasDecor(setuserloggedin, false);
                    if (setuserloggedin.RatingCompat != null) {
                        z2 = true;
                    }
                    if (z2) {
                        sethasdecor.IconCompatParcelizer(setuserloggedin.RatingCompat);
                    }
                }
            });
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85922131493819, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.presenter;
        if (setuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin.MediaBrowserCompat$ItemReceiver(this);
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.professionButtons;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("professionButtons");
        }
        TextView textView = customAcceptDeclineButtons.tvLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
        }
        textView.setVisibility(8);
        CustomSpinnerWithTitle customSpinnerWithTitle = this.yearsSpinner;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearsSpinner");
        }
        write(customSpinnerWithTitle, R.array.f64732130903052);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.monthsSpinner;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthsSpinner");
        }
        write(customSpinnerWithTitle2, R.array.f64722130903051);
        CheckBox checkBox = this.cbProfession;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbProfession");
        }
        checkBox.setOnCheckedChangeListener(new C6013xc2e3343d(this));
        CustomExternalSelector customExternalSelector = this.addressSelector;
        if (customExternalSelector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressSelector");
        }
        View.OnClickListener read2 = new read(this);
        onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        View view = customExternalSelector.container;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view.setOnClickListener(read2);
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setOnClickListener(new C6014x742371cc(this));
        CustomPhoneNumberInput customPhoneNumberInput = this.ivgContactNumber;
        if (customPhoneNumberInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgContactNumber");
        }
        TextWatcher fragmentBuilder_BindEasycashCommercialLoanAccountFragment = new FragmentBuilder_BindEasycashCommercialLoanAccountFragment(new IconCompatParcelizer(this));
        customPhoneNumberInput.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashCommercialLoanAccountFragment);
        customPhoneNumberInput.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashCommercialLoanAccountFragment);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.professionButtons;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("professionButtons");
        }
        customAcceptDeclineButtons2.setOnButtonClickListener(new HmlBusinessOccupationInfoFragment$MediaBrowserCompat$MediaItem(this));
        CustomExternalSelector customExternalSelector2 = this.ivgRegistered;
        if (customExternalSelector2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgRegistered");
        }
        View.OnClickListener mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) mediaMetadataCompat, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        View view2 = customExternalSelector2.container;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view2.setOnClickListener(mediaMetadataCompat);
        CustomExternalSelector customExternalSelector3 = this.ivgRegistered;
        if (customExternalSelector3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgRegistered");
        }
        String string = getString(R.string.hml_business_occupation_registered_name_error);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…on_registered_name_error)");
        customExternalSelector3.setErrorText(string);
        CustomPhoneNumberInput customPhoneNumberInput2 = this.ivgContactNumber;
        if (customPhoneNumberInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgContactNumber");
        }
        new RatingCompat(this).invoke(customPhoneNumberInput2.mEditText);
        CustomExternalSelector customExternalSelector4 = this.ivgRegistered;
        if (customExternalSelector4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgRegistered");
        }
        customExternalSelector4.clearFocus();
        CustomPhoneNumberInput customPhoneNumberInput3 = this.ivgContactNumber;
        if (customPhoneNumberInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgContactNumber");
        }
        customPhoneNumberInput3.clearFocus();
        CustomPhoneNumberInput customPhoneNumberInput4 = this.ivgContactNumber;
        if (customPhoneNumberInput4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgContactNumber");
        }
        customPhoneNumberInput4.mEditText.setOnFocusChangeListener(new getEligibility(customPhoneNumberInput4, customPhoneNumberInput4.getOnFocusChangeListener(), 10, false));
        Button button2 = this.nextButton;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button2.requestFocus();
        CustomExternalSelector customExternalSelector5 = this.addressSelector;
        if (customExternalSelector5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressSelector");
        }
        String string2 = getString(R.string.hml_business_occupation_address_error);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_b…occupation_address_error)");
        customExternalSelector5.setErrorText(string2);
        CustomAcceptDeclineButtons customAcceptDeclineButtons3 = this.professionButtons;
        if (customAcceptDeclineButtons3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("professionButtons");
        }
        customAcceptDeclineButtons3.setText(getString(R.string.hml_business_occupation_profession_doctor), getString(R.string.hml_business_occupation_profession_dentist), getString(R.string.hml_business_occupation_profession_footer));
        setUserLoggedIn<ExtractionCredentials> setuserloggedin2 = this.presenter;
        if (setuserloggedin2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin2.MediaBrowserCompat$SearchResultReceiver = true;
        setuserloggedin2.MediaBrowserCompat$ItemReceiver(false);
        if (setuserloggedin2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setuserloggedin2.RatingCompat.AlertController$RecycleListView();
        }
        setuserloggedin2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C5393xf81ef25a(setuserloggedin2), new setUserLoggedIn.PlaybackStateCompat.CustomAction(setuserloggedin2), new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), setuserloggedin2.IconCompatParcelizer);
        return inflate;
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ HmlBusinessOccupationInfoFragment IconCompatParcelizer;

        read(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
            this.IconCompatParcelizer = hmlBusinessOccupationInfoFragment;
        }

        public final void onClick(View view) {
            setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.IconCompatParcelizer.presenter;
            if (setuserloggedin == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setUserLoggedIn.read.write;
            if (setuserloggedin.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setuserloggedin.RatingCompat);
            }
        }
    }

    static final class MediaMetadataCompat implements View.OnClickListener {
        private /* synthetic */ HmlBusinessOccupationInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

        MediaMetadataCompat(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOccupationInfoFragment;
        }

        public final void onClick(View view) {
            setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (setuserloggedin == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setUserLoggedIn$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
            if (setuserloggedin.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setuserloggedin.RatingCompat);
            }
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "businessName");
        CustomExternalSelector customExternalSelector = this.ivgRegistered;
        if (customExternalSelector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgRegistered");
        }
        customExternalSelector.setSelected(str);
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public Intent write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        C5606xa099befc hmlETBBusinessInformationActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBBusinessInformationActivity.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, HmlETBBusinessInformationActivity.class);
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            Intent write2 = write(context);
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
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "address");
        CustomExternalSelector customExternalSelector = this.addressSelector;
        if (customExternalSelector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressSelector");
        }
        customExternalSelector.setSelected(str);
        setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.presenter;
        if (setuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin.write(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = getContext();
        if (context != null) {
            HmlBusinessAddressActivity.write write2 = HmlBusinessAddressActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            setContentDescription.write write3 = setContentDescription.write.BUSINESS;
            Integer valueOf = Integer.valueOf(R.string.hml_business_info_address_title);
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) write3, "addressType");
            Intent putExtra = new Intent(context, HmlBusinessAddressActivity.class).putExtra("com.scb.phone.EXTRA_ADDRESS_TYPE", write3).putExtra("EXTRA_DISPLAY", valueOf);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlBusin…ra(EXTRA_TITLE, titleRes)");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    putExtra = setTapText.write(activity, putExtra).read();
                }
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(putExtra.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb.toString());
                startActivityForResult(putExtra, 101);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(boolean z) {
        int i = z ? 0 : 8;
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.professionButtons;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("professionButtons");
        }
        customAcceptDeclineButtons.setVisibility(i);
        TextView textView = this.tvProfessionLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfessionLabel");
        }
        textView.setVisibility(i);
        TextView textView2 = this.tvProfessionFooter;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfessionFooter");
        }
        textView2.setVisibility(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1) {
            if (i == 101) {
                String stringExtra2 = intent.getStringExtra("com.scb.phone.EXTRA_RESULT_ADDRESS");
                if (stringExtra2 != null) {
                    setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.presenter;
                    if (setuserloggedin == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    onGetStartedClick.write((Object) stringExtra2, "address");
                    writeUInt64NoTag.IconCompatParcelizer write2 = new setUserLoggedIn.write(stringExtra2);
                    if (setuserloggedin.RatingCompat != null) {
                        write2.IconCompatParcelizer(setuserloggedin.RatingCompat);
                    }
                }
            } else if (i == 102 && (stringExtra = intent.getStringExtra("EXTRA_COMPANY_NAME")) != null) {
                setUserLoggedIn<ExtractionCredentials> setuserloggedin2 = this.presenter;
                if (setuserloggedin2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setuserloggedin2.IconCompatParcelizer(stringExtra);
            }
        }
    }

    public final void IconCompatParcelizer() {
        Context context = getContext();
        if (context != null) {
            HmlCompanyNameActivity.IconCompatParcelizer iconCompatParcelizer = HmlCompanyNameActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlCompanyNameActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(intent, 102);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        CustomExternalSelector customExternalSelector = this.ivgRegistered;
        if (customExternalSelector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgRegistered");
        }
        customExternalSelector.read(z);
        TextView textView = this.tvNameFooter;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNameFooter");
        }
        textView.setVisibility(z ? 8 : 0);
    }

    public final void IconCompatParcelizer(boolean z) {
        CustomPhoneNumberInput customPhoneNumberInput = this.ivgContactNumber;
        if (customPhoneNumberInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgContactNumber");
        }
        if (z) {
            customPhoneNumberInput.MediaBrowserCompat$ItemReceiver();
        } else {
            customPhoneNumberInput.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(boolean z) {
        CustomExternalSelector customExternalSelector = this.addressSelector;
        if (customExternalSelector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressSelector");
        }
        customExternalSelector.read(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, boolean z2) {
        TextView textView = this.tvProfessionError;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfessionError");
        }
        int i = 0;
        textView.setVisibility(z ? 0 : 8);
        TextView textView2 = this.tvProfessionFooter;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfessionFooter");
        }
        if (z || !z2) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        TextView textView = this.experienceError;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("experienceError");
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Context context = getContext();
        if (context != null) {
            CustomDialog.IconCompatParcelizer(context).MediaBrowserCompat$ItemReceiver((int) R.string.hml_business_info_2_empty_fields_title).IconCompatParcelizer((int) R.string.hml_business_info_2_empty_fields_content).write(getString(R.string.ok), MediaDescriptionCompat.write).show();
        }
    }

    static final class MediaDescriptionCompat implements DialogInterface.OnClickListener {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public void onDestroy() {
        setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.presenter;
        if (setuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin.onDestroy();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        setUserLoggedIn<ExtractionCredentials> setuserloggedin = this.presenter;
        if (setuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setuserloggedin.MediaBrowserCompat$SearchResultReceiver = true;
    }

    private final void write(CustomSpinnerWithTitle customSpinnerWithTitle, int i) {
        customSpinnerWithTitle.IconCompatParcelizer = false;
        if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            customSpinnerWithTitle.spinner.setSelection(0);
        }
        String[] stringArray = getResources().getStringArray(i);
        customSpinnerWithTitle.setItems(Arrays.asList((String[]) Arrays.copyOf(stringArray, stringArray.length)), true, false);
        customSpinnerWithTitle.setMandatory(true);
        customSpinnerWithTitle.setOnCustomSpinnerWithTitleCompletion(new C6015xe7cff69e(this, customSpinnerWithTitle));
    }

    public final void IconCompatParcelizer(getCurrentTimestampSeconds getcurrenttimestampseconds) {
        Integer valueOf;
        Integer valueOf2;
        onGetStartedClick.write((Object) getcurrenttimestampseconds, "display");
        String str = getcurrenttimestampseconds.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            CustomExternalSelector customExternalSelector = this.ivgRegistered;
            if (customExternalSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgRegistered");
            }
            customExternalSelector.setSelected(str);
        }
        String str2 = getcurrenttimestampseconds.read.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            CustomPhoneNumberInput customPhoneNumberInput = this.ivgContactNumber;
            if (customPhoneNumberInput == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgContactNumber");
            }
            customPhoneNumberInput.setText(getICheckDeserializerRtti.IconCompatParcelizer(false, true, str2));
        }
        String str3 = getcurrenttimestampseconds.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            read(str3);
        }
        getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver getcurrenttimestampseconds_mediabrowsercompat_itemreceiver = getcurrenttimestampseconds.write;
        CheckBox checkBox = this.cbProfession;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbProfession");
        }
        checkBox.setChecked(getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
        write(getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
        Boolean bool = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.read, (Object) Boolean.TRUE) ? Boolean.TRUE : onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, (Object) Boolean.TRUE) ? Boolean.FALSE : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            CustomAcceptDeclineButtons customAcceptDeclineButtons = this.professionButtons;
            if (customAcceptDeclineButtons == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("professionButtons");
            }
            customAcceptDeclineButtons.write(booleanValue);
        }
        C4543x83a7f79 getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver = getcurrenttimestampseconds.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        if (!(str4 == null || (valueOf2 = Integer.valueOf(Integer.parseInt(str4))) == null)) {
            CustomSpinnerWithTitle customSpinnerWithTitle = this.monthsSpinner;
            if (customSpinnerWithTitle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthsSpinner");
            }
            customSpinnerWithTitle.setSelectionIndex(valueOf2.intValue() + 1);
        }
        String str5 = getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver.write;
        if (str5 != null && (valueOf = Integer.valueOf(Integer.parseInt(str5))) != null) {
            CustomSpinnerWithTitle customSpinnerWithTitle2 = this.yearsSpinner;
            if (customSpinnerWithTitle2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearsSpinner");
            }
            customSpinnerWithTitle2.setSelectionIndex(valueOf.intValue() + 1);
        }
    }
}

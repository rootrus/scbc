package com.scb.phone.view.fragment.ntb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import com.scb.phone.view.activity.registration.preregistration.PreregistrationOtpActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableSet;
import p040o.LifestyleCustomizationActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver;
import p040o.getContents;
import p040o.getICheckDeserializerRtti;
import p040o.getShadowContours;
import p040o.ofInstance;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class PreregisteredMobileFragment extends BaseFragment implements getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver {
    public static final write IconCompatParcelizer = new write((byte) 0);
    public InputFilter[] MediaBrowserCompat$CustomActionResultReceiver;
    private final View.OnFocusChangeListener MediaBrowserCompat$MediaItem = new IconCompatParcelizer(this);
    private final read MediaBrowserCompat$SearchResultReceiver = new read(this);
    private final TextView.OnEditorActionListener MediaMetadataCompat = new PreregisteredMobileFragment$MediaBrowserCompat$ItemReceiver(this);
    @BindView
    public Button btnNext;
    @BindView
    public CommonInputViewGroup mobileNumberInput;
    @HmlPinActivity
    public getShadowContours presenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88982131494125, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver(this, view);
        CommonInputViewGroup commonInputViewGroup = this.mobileNumberInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        TextWatcher textWatcher = this.MediaBrowserCompat$SearchResultReceiver;
        commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        commonInputViewGroup.setOnEditorActionListener(this.MediaMetadataCompat);
        commonInputViewGroup.setFocusListener(this.MediaBrowserCompat$MediaItem);
        CustomEditText customEditText = commonInputViewGroup.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText, "editText");
        customEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
        CustomEditText customEditText2 = commonInputViewGroup.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText2, "editText");
        InputFilter[] filters = customEditText2.getFilters();
        onGetStartedClick.IconCompatParcelizer((Object) filters, "editText.filters");
        this.MediaBrowserCompat$CustomActionResultReceiver = filters;
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("registration_input_mobile_number", zsyr2kArr);
        }
        getShadowContours getshadowcontours = this.presenter;
        if (getshadowcontours == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getshadowcontours.MediaBrowserCompat$ItemReceiver(this);
    }

    public static final class read implements TextWatcher {
        private /* synthetic */ PreregisteredMobileFragment MediaBrowserCompat$CustomActionResultReceiver;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        read(PreregisteredMobileFragment preregisteredMobileFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = preregisteredMobileFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r9) {
            /*
                r8 = this;
                java.lang.String r0 = "editable"
                p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
                com.scb.phone.view.custom.common.CommonInputViewGroup r0 = r0.mobileNumberInput
                java.lang.String r1 = "mobileNumberInput"
                if (r0 != 0) goto L_0x0010
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x0010:
                com.scb.phone.view.custom.common.CustomEditText r0 = r0.mEditText
                r2 = r8
                android.text.TextWatcher r2 = (android.text.TextWatcher) r2
                r0.removeTextChangedListener(r2)
                java.lang.String r0 = r9.toString()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                o.LifestyleCustomizationActivity r3 = new o.LifestyleCustomizationActivity
                java.lang.String r4 = "-"
                r3.<init>((java.lang.String) r4)
                java.lang.String r4 = ""
                java.lang.String r0 = r3.read(r0, r4)
                int r3 = r9.length()
                r5 = 10
                r6 = 1
                java.lang.String r7 = "presenter"
                if (r3 != r5) goto L_0x0059
                java.lang.String r9 = r9.toString()
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
                o.getShadowContours r3 = r3.presenter
                if (r3 != 0) goto L_0x0043
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
            L_0x0043:
                java.lang.String r3 = r3.read
                boolean r9 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r9, r3, r6)
                if (r9 != 0) goto L_0x0059
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                o.getShadowContours r9 = r9.presenter
                if (r9 != 0) goto L_0x0054
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
            L_0x0054:
                r9.IconCompatParcelizer((java.lang.String) r0)
                goto L_0x00d6
            L_0x0059:
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                o.getShadowContours r9 = r9.presenter
                if (r9 != 0) goto L_0x0062
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
            L_0x0062:
                java.lang.String r9 = r9.read
                boolean r9 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r9, r6)
                if (r9 != 0) goto L_0x00d6
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                o.getShadowContours r9 = r9.presenter
                if (r9 != 0) goto L_0x0073
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
            L_0x0073:
                r9.read = r4
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                android.widget.Button r9 = r9.btnNext
                if (r9 != 0) goto L_0x0080
                java.lang.String r3 = "btnNext"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
            L_0x0080:
                r3 = 0
                r9.setEnabled(r3)
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                com.scb.phone.view.custom.common.CommonInputViewGroup r9 = r9.mobileNumberInput
                if (r9 != 0) goto L_0x008d
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x008d:
                com.scb.phone.view.custom.common.CustomEditText r9 = r9.mEditText
                java.lang.String r3 = "mobileNumberInput.editText"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r3)
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
                android.text.InputFilter[] r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
                if (r4 != 0) goto L_0x009f
                java.lang.String r5 = "originalMobileNumberInputFilter"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
            L_0x009f:
                r9.setFilters(r4)
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                com.scb.phone.view.custom.common.CommonInputViewGroup r9 = r9.mobileNumberInput
                if (r9 != 0) goto L_0x00ab
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x00ab:
                com.scb.phone.view.custom.common.CustomEditText r9 = r9.mEditText
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r9.setText(r0)
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                com.scb.phone.view.custom.common.CommonInputViewGroup r9 = r9.mobileNumberInput
                if (r9 != 0) goto L_0x00bb
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x00bb:
                com.scb.phone.view.custom.common.CustomEditText r9 = r9.mEditText
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
                com.scb.phone.view.custom.common.CommonInputViewGroup r0 = r0.mobileNumberInput
                if (r0 != 0) goto L_0x00c6
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x00c6:
                com.scb.phone.view.custom.common.CustomEditText r0 = r0.mEditText
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
                android.text.Editable r0 = r0.getText()
                int r0 = r0.length()
                r9.setSelection(r0)
            L_0x00d6:
                com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
                com.scb.phone.view.custom.common.CommonInputViewGroup r9 = r9.mobileNumberInput
                if (r9 != 0) goto L_0x00df
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x00df:
                com.scb.phone.view.custom.common.CustomEditText r9 = r9.mEditText
                r9.addTextChangedListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ntb.PreregisteredMobileFragment.read.afterTextChanged(android.text.Editable):void");
        }
    }

    static final class IconCompatParcelizer implements View.OnFocusChangeListener {
        private /* synthetic */ PreregisteredMobileFragment MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(PreregisteredMobileFragment preregisteredMobileFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = preregisteredMobileFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                getShadowContours getshadowcontours = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
                if (getshadowcontours == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$CustomActionResultReceiver.mobileNumberInput;
                if (commonInputViewGroup == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
                }
                getshadowcontours.IconCompatParcelizer(new LifestyleCustomizationActivity("-").read(commonInputViewGroup.mEditText.getText().toString().toString(), ""));
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.mobileNumberInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(commonInputViewGroup.MediaBrowserCompat$ItemReceiver + 2)};
        CustomEditText customEditText = commonInputViewGroup.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText, "editText");
        customEditText.setFilters(inputFilterArr);
        CustomEditText customEditText2 = commonInputViewGroup.mEditText;
        CustomEditText customEditText3 = commonInputViewGroup.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText3, "editText");
        customEditText2.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver("MOB", customEditText3.getText().toString()));
        CustomEditText customEditText4 = commonInputViewGroup.mEditText;
        CustomEditText customEditText5 = commonInputViewGroup.mEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customEditText5, "editText");
        customEditText4.setSelection(customEditText5.getText().length());
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(z);
    }

    public final void write() {
        CommonInputViewGroup commonInputViewGroup = this.mobileNumberInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        commonInputViewGroup.setErrorText(getString(R.string.incomplete_information));
        CommonInputViewGroup commonInputViewGroup2 = this.mobileNumberInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.mobileNumberInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        commonInputViewGroup.setErrorText(getString(R.string.invalid_format_please_try_again));
        CommonInputViewGroup commonInputViewGroup2 = this.mobileNumberInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    @OnClick
    public final void onNextButtonClick() {
        getShadowContours getshadowcontours = this.presenter;
        if (getshadowcontours == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getshadowcontours.RatingCompat != null) {
            getshadowcontours.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableSet immutableSet = new ImmutableSet(getshadowcontours.read);
        ofInstance ofinstance = getshadowcontours.write;
        onGetStartedClick.write((Object) immutableSet, "request");
        DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver = ofinstance.write.MediaBrowserCompat$ItemReceiver(immutableSet);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "registrationRepositoryCo…reregisterMobile(request)");
        ofinstance.write(MediaBrowserCompat$ItemReceiver, new getShadowContours.write(getshadowcontours));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getContents getcontents) {
        onGetStartedClick.write((Object) getcontents, "mobileNumberDisplay");
        Context context = getContext();
        if (context != null) {
            PreregistrationOtpActivity.write write2 = PreregistrationOtpActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) getcontents, "mobileNumberDisplay");
            Intent putExtra = new Intent(context, PreregistrationOtpActivity.class).putExtra("EXTRA_MOBILE_NUMBER_DISPLAY", getcontents);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, Preregis…LAY, mobileNumberDisplay)");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    putExtra = setTapText.write(activity, putExtra).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(putExtra.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivity(putExtra);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        if (getContext() != null) {
            RegistrationPersonalInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        }
    }

    public final void onDestroyView() {
        getShadowContours getshadowcontours = this.presenter;
        if (getshadowcontours == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getshadowcontours.onDestroy();
        CommonInputViewGroup commonInputViewGroup = this.mobileNumberInput;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        commonInputViewGroup.setFocusListener((View.OnFocusChangeListener) null);
        CommonInputViewGroup commonInputViewGroup2 = this.mobileNumberInput;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumberInput");
        }
        TextWatcher textWatcher = this.MediaBrowserCompat$SearchResultReceiver;
        commonInputViewGroup2.mEditText.removeTextChangedListener(textWatcher);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.remove(textWatcher);
        super.onDestroyView();
    }
}

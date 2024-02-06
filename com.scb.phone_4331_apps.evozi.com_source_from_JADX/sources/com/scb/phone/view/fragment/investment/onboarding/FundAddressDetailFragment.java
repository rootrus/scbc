package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.AddressSearchActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4219ct;
import p040o.C4223cy;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FundAddressDetailFragment extends BaseAddressFragment {
    private int IconCompatParcelizer = 10002;
    FundAddressDetailFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaSessionCompat$QueueItem = false;
    private boolean MediaSessionCompat$ResultReceiverWrapper = false;
    private boolean MediaSessionCompat$Token = false;
    private boolean ParcelableVolumeInfo = false;

    public final int IconCompatParcelizer() {
        return R.layout.f88422131494069;
    }

    public static FundAddressDetailFragment read(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute, int i, boolean z, boolean z2, boolean z3) {
        FundAddressDetailFragment fundAddressDetailFragment = new FundAddressDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_ADDRESS", autoValue_CrashlyticsReport_CustomAttribute);
        bundle.putInt("BUNDLE_ADDRESS_TYPE", i);
        bundle.putInt("BUNDLE_ADDRESS_ORIGINAL_FEATURE", 1);
        bundle.putBoolean("ARG_HOME_REGISTERED_SAME_FLAG", z);
        bundle.putBoolean("ARG_MAIL_REGISTERED_SAME_FLAG", z2);
        bundle.putBoolean("ARG_MAIL_HOME_SAME_FLAG", z3);
        fundAddressDetailFragment.setArguments(bundle);
        return fundAddressDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C4223cy cyVar = this.presenter;
        boolean z = true;
        C4219ct ctVar = new C4219ct(true);
        if (cyVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ctVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        this.MediaDescriptionCompat = "TH";
        this.layoutCustomSpinner.setVisibility(8);
        return onCreateView;
    }

    public void onStart() {
        Bundle arguments;
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
        super.onStart();
        if (!this.MediaSessionCompat$Token && (arguments = getArguments()) != null) {
            if (arguments.containsKey("ARG_ADDRESS") && (autoValue_CrashlyticsReport_CustomAttribute = (AutoValue_CrashlyticsReport_CustomAttribute) arguments.getParcelable("ARG_ADDRESS")) != null) {
                this.MediaMetadataCompat = autoValue_CrashlyticsReport_CustomAttribute;
                IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute, true);
            }
            if (arguments.containsKey("ARG_HOME_REGISTERED_SAME_FLAG")) {
                this.ParcelableVolumeInfo = arguments.getBoolean("ARG_HOME_REGISTERED_SAME_FLAG");
            }
            if (arguments.containsKey("ARG_MAIL_REGISTERED_SAME_FLAG")) {
                this.MediaSessionCompat$QueueItem = arguments.getBoolean("ARG_MAIL_REGISTERED_SAME_FLAG");
            }
            if (arguments.containsKey("ARG_MAIL_HOME_SAME_FLAG")) {
                this.MediaSessionCompat$ResultReceiverWrapper = arguments.getBoolean("ARG_MAIL_HOME_SAME_FLAG");
            }
        }
    }

    @OnClick
    public void onSelectProvinceClick() {
        this.MediaSessionCompat$Token = true;
        Intent read = AddressSearchActivity.read(getContext(), getActivity() instanceof BaseActivity ? ((BaseActivity) getActivity()).setTitle() : "");
        int i = this.IconCompatParcelizer;
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNextButtonClick() {
        /*
            r23 = this;
            r0 = r23
            o.cy r1 = r0.presenter
            int r2 = r0.RatingCompat
            java.lang.String r3 = r0.MediaDescriptionCompat
            com.scb.phone.view.custom.common.CustomAddressInput r4 = r0.houseNo
            android.widget.EditText r4 = r4.inputTextField
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r5 = r0.moo
            android.widget.EditText r5 = r5.inputTextField
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r6 = r0.roadTH
            android.widget.EditText r6 = r6.inputTextField
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r7 = r0.floor
            android.widget.EditText r7 = r7.inputTextField
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r8 = r0.unit
            android.widget.EditText r8 = r8.inputTextField
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r9 = r0.village
            android.widget.EditText r9 = r9.inputTextField
            android.text.Editable r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r10 = r0.alley
            android.widget.EditText r10 = r10.inputTextField
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.trim()
            android.widget.TextView r11 = r0.subDistrictLabel
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            android.widget.TextView r12 = r0.districtLabel
            java.lang.CharSequence r12 = r12.getText()
            java.lang.String r12 = r12.toString()
            android.widget.TextView r13 = r0.provinceLabel
            java.lang.CharSequence r13 = r13.getText()
            java.lang.String r13 = r13.toString()
            android.widget.TextView r14 = r0.postalCodeLabel
            java.lang.CharSequence r14 = r14.getText()
            java.lang.String r14 = r14.toString()
            com.scb.phone.view.custom.common.CustomAddressInput r15 = r0.otherCountryDistrict
            android.widget.EditText r15 = r15.inputTextField
            android.text.Editable r15 = r15.getText()
            java.lang.String r15 = r15.toString()
            java.lang.String r15 = r15.trim()
            r20 = r1
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.otherCountryRoad
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r16 = r1.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.city
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r17 = r1.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.state
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r18 = r1.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.zipCode
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r19 = r1.trim()
            boolean r1 = r0.ParcelableVolumeInfo
            r21 = r2
            boolean r2 = r0.MediaSessionCompat$QueueItem
            r22 = r2
            boolean r2 = r0.MediaSessionCompat$ResultReceiverWrapper
            o.standardSubSet r3 = p040o.C4223cy.read(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            o.CustomConcurrentHashMap$WeakExpirableEvictableEntry r4 = p040o.CustomConcurrentHashMap.WeakExpirableEvictableEntry.MediaBrowserCompat$ItemReceiver()
            java.lang.String r5 = "0"
            java.lang.String r6 = "1"
            if (r1 == 0) goto L_0x010c
            r1 = r6
            goto L_0x010d
        L_0x010c:
            r1 = r5
        L_0x010d:
            r4.read = r1
            if (r22 == 0) goto L_0x0113
            r1 = r6
            goto L_0x0114
        L_0x0113:
            r1 = r5
        L_0x0114:
            r4.MediaBrowserCompat$CustomActionResultReceiver = r1
            if (r2 == 0) goto L_0x0119
            r5 = r6
        L_0x0119:
            r4.MediaBrowserCompat$ItemReceiver = r5
            r1 = 1
            r2 = 0
            if (r21 == 0) goto L_0x0129
            r5 = 3
            r6 = r21
            if (r6 == r5) goto L_0x0126
            r3 = r1
            goto L_0x012c
        L_0x0126:
            r4.IconCompatParcelizer = r3
            goto L_0x012b
        L_0x0129:
            r4.write = r3
        L_0x012b:
            r3 = r2
        L_0x012c:
            if (r3 != 0) goto L_0x014b
            r3 = r20
            T r5 = r3.RatingCompat
            if (r5 == 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r1 = r2
        L_0x0136:
            if (r1 == 0) goto L_0x013d
            T r1 = r3.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x013d:
            o.LatLng r1 = r3.write
            o.DebitCardResetOtpActivity r4 = r1.MediaBrowserCompat$ItemReceiver(r4)
            o.cy$read r5 = new o.cy$read
            r5.<init>(r3, r2)
            r1.write(r4, r5)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.onboarding.FundAddressDetailFragment.onNextButtonClick():void");
    }

    public final void write() {
        if (getActivity() instanceof FundAppFormActivity) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != this.unit) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            }
            this.MediaSessionCompat$Token = false;
            getActivity().onBackPressed();
        }
    }
}

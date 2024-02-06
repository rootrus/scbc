package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4219ct;
import p040o.C4223cy;
import p040o.setContentDescription;

public class HmlAddressFragment extends BaseAddressFragment {
    private HmlAddressFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;

    public static HmlAddressFragment MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute, setContentDescription.write write) {
        HmlAddressFragment hmlAddressFragment = new HmlAddressFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY", autoValue_CrashlyticsReport_CustomAttribute);
        bundle.putSerializable("com.scb.phone.EXTRA_ADDRESS_TYPE", write);
        hmlAddressFragment.setArguments(bundle);
        return hmlAddressFragment;
    }

    public void onStart() {
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
        super.onStart();
        Bundle arguments = getArguments();
        if (!this.MediaBrowserCompat$CustomActionResultReceiver && arguments != null && arguments.containsKey("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY") && (autoValue_CrashlyticsReport_CustomAttribute = (AutoValue_CrashlyticsReport_CustomAttribute) arguments.getParcelable("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY")) != null) {
            this.MediaMetadataCompat = autoValue_CrashlyticsReport_CustomAttribute;
            IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute, true);
        }
    }

    @OnClick
    public void onSelectProvinceClick() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        super.onSelectProvinceClick();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof HmlAddressFragment$MediaBrowserCompat$ItemReceiver) {
            this.IconCompatParcelizer = (HmlAddressFragment$MediaBrowserCompat$ItemReceiver) getParentFragment();
        } else if (context instanceof HmlAddressFragment$MediaBrowserCompat$ItemReceiver) {
            this.IconCompatParcelizer = (HmlAddressFragment$MediaBrowserCompat$ItemReceiver) context;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement HmlAddressListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onDetach() {
        this.IconCompatParcelizer = null;
        super.onDetach();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            bundle.putInt("BUNDLE_ADDRESS_TYPE", 0);
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C4223cy cyVar = this.presenter;
        C4219ct ctVar = new C4219ct(true);
        if (cyVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ctVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        this.MediaDescriptionCompat = "TH";
        this.layoutCustomSpinner.setVisibility(8);
        if (getArguments() != null && getArguments().containsKey("com.scb.phone.EXTRA_ADDRESS_TYPE")) {
            try {
                int i = C59575.MediaBrowserCompat$CustomActionResultReceiver[((setContentDescription.write) getArguments().getSerializable("com.scb.phone.EXTRA_ADDRESS_TYPE")).ordinal()];
                if (i == 1) {
                    RatingCompat(getString(R.string.hml_personal_info_home_address));
                } else if (i == 2) {
                    RatingCompat(getString(R.string.hml_personal_info_mailing_address));
                } else if (i == 3) {
                    RatingCompat(getString(R.string.hml_occupation_work_address));
                } else if (i == 4) {
                    RatingCompat(getString(R.string.hml_business_info_address_title));
                }
            } catch (ClassCastException unused) {
            }
        }
        return onCreateView;
    }

    /* renamed from: com.scb.phone.view.fragment.hml.HmlAddressFragment$5 */
    static /* synthetic */ class C59575 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.setContentDescription$write[] r0 = p040o.setContentDescription.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.setContentDescription$write r1 = p040o.setContentDescription.write.HOME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setContentDescription$write r1 = p040o.setContentDescription.write.MAILING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setContentDescription$write r1 = p040o.setContentDescription.write.WORK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setContentDescription$write r1 = p040o.setContentDescription.write.BUSINESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlAddressFragment.C59575.<clinit>():void");
        }
    }

    public void onNextButtonClick() {
        C4223cy cyVar = this.presenter;
        setContentDescription.write write = getArguments() != null ? (setContentDescription.write) getArguments().getSerializable("com.scb.phone.EXTRA_ADDRESS_TYPE") : setContentDescription.write.MAILING;
        String stackedBackground = setStackedBackground();
        String trim = this.unit.inputTextField.getText().toString().trim();
        String trim2 = this.floor.inputTextField.getText().toString().trim();
        String trim3 = this.houseNo.inputTextField.getText().toString().trim();
        String trim4 = this.village.inputTextField.getText().toString().trim();
        String trim5 = this.moo.inputTextField.getText().toString().trim();
        String trim6 = this.alley.inputTextField.getText().toString().trim();
        String trim7 = this.roadTH.inputTextField.getText().toString().trim();
        String replaceAll = this.subDistrictLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        String replaceAll2 = this.districtLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        String replaceAll3 = this.provinceLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        String replaceAll4 = this.postalCodeLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        if (cyVar.RatingCompat != null) {
            cyVar.RatingCompat.AlertController$RecycleListView();
        }
        cyVar.MediaBrowserCompat$ItemReceiver.read(write, stackedBackground, trim, trim2, trim3, trim4, trim5, trim6, trim7, replaceAll, replaceAll2, replaceAll3, replaceAll4);
        cyVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4223cy.IconCompatParcelizer(cyVar, (byte) 0));
    }

    public final void write(String str) {
        super.write(str);
        this.IconCompatParcelizer.IconCompatParcelizer(str);
    }

    public void onDestroyView() {
        this.presenter.onDestroy();
        super.onDestroyView();
    }
}

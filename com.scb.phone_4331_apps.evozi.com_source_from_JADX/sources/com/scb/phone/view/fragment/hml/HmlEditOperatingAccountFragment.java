package com.scb.phone.view.fragment.hml;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.util.Arrays;
import java.util.List;
import p040o.C6977x9bb0870b;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.ZSYR2K;
import p040o.executeKMSSoapCall;
import p040o.getSheetID;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.zziu;

public final class HmlEditOperatingAccountFragment extends HmlBaseOperatingAccountFragment<executeKMSSoapCall, C6977x9bb0870b> implements C6977x9bb0870b {
    public static final C5989xccf8719a IconCompatParcelizer = new C5989xccf8719a((byte) 0);
    final HmlVerifyEmailActivity MediaBrowserCompat$CustomActionResultReceiver;
    private Button MediaBrowserCompat$MediaItem;
    private Button MediaDescriptionCompat;
    @HmlPinActivity
    public executeKMSSoapCall editPresenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public HmlEditOperatingAccountFragment() {
        FundActionsSuccessActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        onGetStartedClick.write((Object) iconCompatParcelizer, "initializer");
        this.MediaBrowserCompat$CustomActionResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(iconCompatParcelizer);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        executeKMSSoapCall executekmssoapcall = (executeKMSSoapCall) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        Bundle arguments = getArguments();
        executekmssoapcall.MediaBrowserCompat$ItemReceiver(arguments != null ? (zziu.zzc) arguments.getParcelable("OPERATING_ACCOUNT_KEY") : null);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_business_main_op_account_num_edit", zsyr2kArr);
        }
        return onCreateView;
    }

    public final void write(boolean z) {
        Button button = this.MediaBrowserCompat$MediaItem;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveButton");
        }
        button.setEnabled(z);
    }

    public final List<Button> write() {
        String string = getString(R.string.hml_business_operating_account_remove);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…operating_account_remove)");
        Button write2 = write(string, R.color.f67252131099881, R.drawable.bg_button_outline, new HmlEditOperatingAccountFragment$MediaBrowserCompat$ItemReceiver(this));
        this.MediaDescriptionCompat = write2;
        write2.setEnabled(true);
        String string2 = getString(R.string.hml_business_operating_account_save);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_b…s_operating_account_save)");
        this.MediaBrowserCompat$MediaItem = write(string2, R.color.f71012131100257, R.drawable.bg_button_primary, new write(this));
        Button[] buttonArr = new Button[2];
        Button button = this.MediaDescriptionCompat;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("removeButton");
        }
        buttonArr[0] = button;
        Button button2 = this.MediaBrowserCompat$MediaItem;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveButton");
        }
        buttonArr[1] = button2;
        onGetStartedClick.write((Object) buttonArr, "elements");
        onGetStartedClick.write((Object) buttonArr, "$this$asList");
        List<Button> asList = Arrays.asList(buttonArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ FundActionsSuccessActivity IconCompatParcelizer;

        read(FundActionsSuccessActivity fundActionsSuccessActivity) {
            this.IconCompatParcelizer = fundActionsSuccessActivity;
        }

        public final void onClick(View view) {
            this.IconCompatParcelizer.invoke();
        }
    }

    private final Button write(String str, int i, int i2, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        Button button = new Button(getContext());
        button.setOnClickListener(new read(fundActionsSuccessActivity));
        button.setTextColor(setLastBaselineToBottomHeight.read(button.getContext(), i));
        button.setText(str);
        button.setAllCaps(false);
        button.setEnabled(false);
        button.setBackground(setLastBaselineToBottomHeight.write(button.getContext(), i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int dimensionPixelSize = button.getResources().getDimensionPixelSize(R.dimen.f72472131165407);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        button.setLayoutParams(layoutParams);
        return button;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_business_main_operating_account_number_edit", zsyr2kArr);
        }
    }

    public final void aJ_() {
        if (getContext() != null) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.hml_main_operating_acc_remove_acc_title).IconCompatParcelizer((int) R.string.hml_main_operating_acc_remove_acc_description);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.hml_main_operating_acc_remove_acc_confirm_button), new MediaMetadataCompat(this));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.hml_occupation_back_dialog_cancel), RatingCompat.MediaBrowserCompat$ItemReceiver).show();
        }
    }

    static final class MediaMetadataCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlEditOperatingAccountFragment MediaBrowserCompat$ItemReceiver;

        MediaMetadataCompat(HmlEditOperatingAccountFragment hmlEditOperatingAccountFragment) {
            this.MediaBrowserCompat$ItemReceiver = hmlEditOperatingAccountFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((executeKMSSoapCall) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).IconCompatParcelizer();
            dialogInterface.dismiss();
        }
    }

    static final class RatingCompat implements DialogInterface.OnClickListener {
        public static final RatingCompat MediaBrowserCompat$ItemReceiver = new RatingCompat();

        RatingCompat() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<executeKMSSoapCall> {
        private /* synthetic */ HmlEditOperatingAccountFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(HmlEditOperatingAccountFragment hmlEditOperatingAccountFragment) {
            super(0);
            this.read = hmlEditOperatingAccountFragment;
        }

        public final /* synthetic */ Object invoke() {
            executeKMSSoapCall executekmssoapcall = this.read.editPresenter;
            if (executekmssoapcall == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("editPresenter");
            }
            executekmssoapcall.MediaBrowserCompat$ItemReceiver(this.read);
            return executekmssoapcall;
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlEditOperatingAccountFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HmlEditOperatingAccountFragment hmlEditOperatingAccountFragment) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlEditOperatingAccountFragment;
        }

        public final /* synthetic */ Object invoke() {
            ((executeKMSSoapCall) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final /* bridge */ /* synthetic */ getSheetID MediaBrowserCompat$CustomActionResultReceiver() {
        return (executeKMSSoapCall) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

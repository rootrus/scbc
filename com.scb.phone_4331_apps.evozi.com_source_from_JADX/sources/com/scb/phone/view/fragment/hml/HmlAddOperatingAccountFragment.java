package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import java.util.Collections;
import java.util.List;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.PassportCaptureModule;
import p040o.ZSYR2K;
import p040o.getSheetID;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setOptions;

public final class HmlAddOperatingAccountFragment extends HmlBaseOperatingAccountFragment<setOptions, PassportCaptureModule.C6975b> {
    public static final read IconCompatParcelizer = new read((byte) 0);
    final HmlVerifyEmailActivity MediaBrowserCompat$CustomActionResultReceiver;
    private Button MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public setOptions addPresenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public HmlAddOperatingAccountFragment() {
        FundActionsSuccessActivity write2 = new write(this);
        onGetStartedClick.write((Object) write2, "initializer");
        this.MediaBrowserCompat$CustomActionResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(write2);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((setOptions) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).write();
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_business_main_op_account_number", zsyr2kArr);
        }
        return onCreateView;
    }

    public final List<Button> write() {
        Button button = new Button(getContext());
        button.setOnClickListener(new HmlAddOperatingAccountFragment$MediaBrowserCompat$ItemReceiver(this));
        button.setTextColor(setLastBaselineToBottomHeight.read(button.getContext(), R.color.f71012131100257));
        button.setText(getString(R.string.hml_business_operating_account_add_account));
        button.setAllCaps(false);
        button.setEnabled(false);
        button.setBackground(setLastBaselineToBottomHeight.write(button.getContext(), R.drawable.bg_button_primary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int dimensionPixelSize = button.getResources().getDimensionPixelSize(R.dimen.f72472131165407);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        button.setLayoutParams(layoutParams);
        this.MediaBrowserCompat$MediaItem = button;
        List<Button> singletonList = Collections.singletonList(button);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public final void write(boolean z) {
        Button button = this.MediaBrowserCompat$MediaItem;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addButton");
        }
        button.setEnabled(z);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_business_main_operating_account_number", zsyr2kArr);
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<setOptions> {
        private /* synthetic */ HmlAddOperatingAccountFragment write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HmlAddOperatingAccountFragment hmlAddOperatingAccountFragment) {
            super(0);
            this.write = hmlAddOperatingAccountFragment;
        }

        public final /* synthetic */ Object invoke() {
            setOptions setoptions = this.write.addPresenter;
            if (setoptions == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("addPresenter");
            }
            setoptions.MediaBrowserCompat$ItemReceiver(this.write);
            return setoptions;
        }
    }

    public final /* bridge */ /* synthetic */ getSheetID MediaBrowserCompat$CustomActionResultReceiver() {
        return (setOptions) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

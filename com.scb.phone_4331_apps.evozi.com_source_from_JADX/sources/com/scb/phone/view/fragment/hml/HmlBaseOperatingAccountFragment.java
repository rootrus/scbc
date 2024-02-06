package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.PassportCaptureModule;
import p040o.PassportCaptureModule.C6975b;
import p040o.getSheetID;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zziu;

public abstract class HmlBaseOperatingAccountFragment<T extends getSheetID<V>, V extends PassportCaptureModule.C6975b> extends BaseFragment implements PassportCaptureModule.C6975b {
    @BindView
    public CommonInputViewGroup accountEditText;
    @BindView
    public ImageView bankLogo;
    @BindView
    public TextView bankName;
    @BindView
    public LinearLayout buttonsContainer;

    public abstract T MediaBrowserCompat$CustomActionResultReceiver();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public abstract List<Button> write();

    public abstract void write(boolean z);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.f87982131494025, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        for (Button button : write()) {
            LinearLayout linearLayout = this.buttonsContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonsContainer");
            }
            linearLayout.addView(button);
        }
        return inflate;
    }

    public final void read(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "logo");
        onGetStartedClick.write((Object) str2, "bank");
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        ImageView imageView = this.bankLogo;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankLogo");
        }
        write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
        TextView textView = this.bankName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankName");
        }
        textView.setText(str2);
        CommonInputViewGroup commonInputViewGroup = this.accountEditText;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountEditText");
        }
        commonInputViewGroup.setErrorText(getString(R.string.hml_business_operating_account_error));
        CommonInputViewGroup commonInputViewGroup2 = this.accountEditText;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountEditText");
        }
        TextWatcher iconCompatParcelizer = new IconCompatParcelizer(this);
        commonInputViewGroup2.mEditText.addTextChangedListener(iconCompatParcelizer);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(iconCompatParcelizer);
        if (str3 != null) {
            CommonInputViewGroup commonInputViewGroup3 = this.accountEditText;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountEditText");
            }
            commonInputViewGroup3.setText(str3);
        }
    }

    public static final class IconCompatParcelizer extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private /* synthetic */ HmlBaseOperatingAccountFragment read;

        IconCompatParcelizer(HmlBaseOperatingAccountFragment hmlBaseOperatingAccountFragment) {
            this.read = hmlBaseOperatingAccountFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            getSheetID MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            onGetStartedClick.write((Object) str, "accountNo");
            MediaBrowserCompat$CustomActionResultReceiver.read = str;
            writeUInt64NoTag.IconCompatParcelizer read2 = new getSheetID.read(str);
            if (MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
                read2.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.accountEditText;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountEditText");
        }
        commonInputViewGroup.MediaBrowserCompat$ItemReceiver();
        write(false);
    }

    public final void IconCompatParcelizer() {
        CommonInputViewGroup commonInputViewGroup = this.accountEditText;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountEditText");
        }
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
        write(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zziu.zzc zzc, boolean z) {
        onGetStartedClick.write((Object) zzc, "account");
        Bundle bundle = new Bundle();
        bundle.putParcelable("OPERATING_ACCOUNT_RESULT", zzc);
        bundle.putBoolean("OPERATING_ACCOUNT_EDIT_ACTION", z);
        if (getActivity() instanceof FragmentBuilder_BindBaseGiftTransferInputFragment) {
            ((FragmentBuilder_BindBaseGiftTransferInputFragment) getActivity()).MediaBrowserCompat$ItemReceiver(bundle);
        }
    }
}

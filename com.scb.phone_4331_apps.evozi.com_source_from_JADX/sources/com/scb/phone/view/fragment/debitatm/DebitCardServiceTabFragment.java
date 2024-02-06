package com.scb.phone.view.fragment.debitatm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.debitatm.DebitWithdrawalLimitActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6909xbc088368;
import p040o.CameraPreview;
import p040o.EasycashLoanFeatureInformationService;
import p040o.HmlPinActivity;
import p040o.Lazy;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ReedSolomonException;
import p040o.TypeToken;
import p040o.consumeNonExecutePrefix;
import p040o.getFeatureOperativeAccount;
import p040o.getStringValues;
import p040o.nativeLoadFromFile;
import p040o.nonNull;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMarginFraction;
import p040o.setPreviewScalingStrategy;
import p040o.setReferenceCounted;
import p040o.setTapText;
import p040o.validateCardEligibility;
import p040o.validateSpeedyLoanEligibility;

public class DebitCardServiceTabFragment extends BaseFragment implements C6909xbc088368 {
    public Lazy IconCompatParcelizer;
    public C1117x5be075b9 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView cardLockTextNoAllowTag;
    @BindView
    TextView cardLockTextView;
    @BindView
    RelativeLayout layoutCardStatus;
    @BindView
    SwitchCompat switchCardStatus;
    @HmlPinActivity
    public getStringValues tabDebitCardServicePresenter;

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((DebitCardServiceTabFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static DebitCardServiceTabFragment IconCompatParcelizer() {
        return new DebitCardServiceTabFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86492131493876, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.tabDebitCardServicePresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void write() {
        this.cardLockTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
        this.switchCardStatus.setEnabled(false);
        this.cardLockTextNoAllowTag.setVisibility(0);
        this.cardLockTextNoAllowTag.setText(getString(R.string.debit_atm_tab_service_card_not_allow));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.cardLockTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
        this.switchCardStatus.setEnabled(true);
        this.cardLockTextNoAllowTag.setVisibility(z ? 0 : 8);
        this.cardLockTextNoAllowTag.setText(getString(R.string.auto_debit_card_lock_card_menu_description));
    }

    public final void write(boolean z) {
        this.switchCardStatus.setChecked(z);
    }

    public final void read(boolean z) {
        C1117x5be075b9 debitCardServiceTabFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (debitCardServiceTabFragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return;
        }
        if (z) {
            debitCardServiceTabFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token();
        } else {
            debitCardServiceTabFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    /* access modifiers changed from: package-private */
    @OnCheckedChanged
    public void onCardLockToggleChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            boolean z2 = true;
            boolean z3 = !z;
            compoundButton.setChecked(z3);
            getStringValues getstringvalues = this.tabDebitCardServicePresenter;
            if (z3) {
                TypeToken typeToken = TypeToken.read;
                if (getstringvalues.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    typeToken.IconCompatParcelizer(getstringvalues.RatingCompat);
                    return;
                }
                return;
            }
            consumeNonExecutePrefix consumenonexecuteprefix = consumeNonExecutePrefix.MediaBrowserCompat$CustomActionResultReceiver;
            if (getstringvalues.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                consumenonexecuteprefix.IconCompatParcelizer(getstringvalues.RatingCompat);
            }
        }
    }

    @OnClick
    public void onClickManageLimit() {
        getStringValues getstringvalues = this.tabDebitCardServicePresenter;
        nativeLoadFromFile nativeloadfromfile = nativeLoadFromFile.read;
        if (getstringvalues.RatingCompat != null) {
            nativeloadfromfile.IconCompatParcelizer(getstringvalues.RatingCompat);
        }
        setReferenceCounted setreferencecounted = getstringvalues.MediaBrowserCompat$ItemReceiver;
        setreferencecounted.read(setreferencecounted.IconCompatParcelizer.write(), new CameraPreview(getstringvalues), new setPreviewScalingStrategy(getstringvalues));
    }

    @OnClick
    public void onClickResetPin() {
        Lazy lazy = this.IconCompatParcelizer;
        if (lazy != null) {
            getStringValues getstringvalues = this.tabDebitCardServicePresenter;
            String str = lazy.MediaBrowserCompat$MediaItem;
            nativeLoadFromFile nativeloadfromfile = nativeLoadFromFile.read;
            if (getstringvalues.RatingCompat != null) {
                nativeloadfromfile.IconCompatParcelizer(getstringvalues.RatingCompat);
            }
            setReferenceCounted setreferencecounted = getstringvalues.MediaBrowserCompat$ItemReceiver;
            setreferencecounted.read(setreferencecounted.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str), new setMarginFraction(getstringvalues), new ReedSolomonException(getstringvalues));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        read(getString(R.string.auto_debit_card_lock_card_popup_title), getString(R.string.auto_debit_card_lock_card_popup_message), getString(R.string.auto_debit_card_lock_card_popup_lock_button_title), getString(R.string.auto_debit_card_lock_card_popup_cancel_button_title), new validateCardEligibility(this));
    }

    public final void read() {
        read(getString(R.string.debit_atm_tab_service_manage_card_limit_dialog_unlock_title), getString(R.string.debit_atm_tab_service_manage_card_limit_dialog_unlock_description), getString(R.string.debit_atm_tab_service_manage_card_limit_dialog_unlock_btn), getString(R.string.debit_atm_tab_service_manage_card_limit_dialog_unlock_cancel_btn), new validateSpeedyLoanEligibility(this));
    }

    public final void IconCompatParcelizer(boolean z) {
        read(getString(R.string.auto_debit_card_confirm_change_pin_popup_title), getString(R.string.auto_debit_card_confirm_change_pin_popup_message), getString(R.string.ok), getString(R.string.cancel), new getFeatureOperativeAccount(this, z));
    }

    private void read(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2).IconCompatParcelizer(str3, onClickListener).MediaBrowserCompat$ItemReceiver(str4, EasycashLoanFeatureInformationService.read).show();
    }

    public final void write(nonNull nonnull) {
        Intent IconCompatParcelizer2 = DebitWithdrawalLimitActivity.IconCompatParcelizer(getContext(), nonnull);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

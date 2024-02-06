package com.scb.phone.view.fragment.bulktransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CounterEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomLimit;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IidStore;
import p040o.InstallationTokenResult;
import p040o.StateListener;
import p040o.UncaughtExceptionHandlers;
import p040o.deleteTile;
import p040o.getBytesFromUUID;
import p040o.getFavouriteAll;
import p040o.getFavouriteTopUp;
import p040o.getFid;
import p040o.getFid$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getICheckDeserializerRtti;
import p040o.getRegisteredAccounts;
import p040o.isErrored;
import p040o.isValidApiKeyFormat;
import p040o.proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem;
import p040o.setFisError;
import p040o.setLastBaselineToBottomHeight;
import p040o.waitForValue;

public class EditRecipientFragment extends BaseFragment implements proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected TextView accountNumberText;
    @BindView
    protected AmountEditText amountEditText;
    @BindView
    protected TextInputLayout amountInputLayout;
    @BindView
    protected ImageView bankIcon;
    @BindView
    protected TextView bankName;
    @BindView
    protected CustomLimit customLimit;
    @HmlPinActivity
    public getFid editRecipientPresenter;
    @BindView
    protected CounterEditText nickNameCounterEditText;
    @BindView
    protected DefaultButton saveButton;

    public static EditRecipientFragment MediaBrowserCompat$ItemReceiver(String str, UncaughtExceptionHandlers uncaughtExceptionHandlers) {
        EditRecipientFragment editRecipientFragment = new EditRecipientFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_RECIPIENT", uncaughtExceptionHandlers);
        bundle.putString("com.scb.phone.EXTRA_GROUP_ID", str);
        editRecipientFragment.setArguments(bundle);
        return editRecipientFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87262131493953, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.editRecipientPresenter.MediaBrowserCompat$ItemReceiver(this);
        getFid getfid = this.editRecipientPresenter;
        UncaughtExceptionHandlers uncaughtExceptionHandlers = (UncaughtExceptionHandlers) getArguments().getParcelable("com.scb.phone.EXTRA_RECIPIENT");
        getfid.IconCompatParcelizer = uncaughtExceptionHandlers;
        if (getfid.RatingCompat != null) {
            if ("OTHER".equalsIgnoreCase(uncaughtExceptionHandlers.RatingCompat)) {
                isErrored iserrored = isErrored.MediaBrowserCompat$ItemReceiver;
                if (getfid.RatingCompat != null) {
                    iserrored.IconCompatParcelizer(getfid.RatingCompat);
                }
                getfid.MediaBrowserCompat$ItemReceiver.read();
                getfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getFid$MediaBrowserCompat$CustomActionResultReceiver(getfid, (byte) 0));
            }
            StateListener stateListener = new StateListener(uncaughtExceptionHandlers);
            if (getfid.RatingCompat != null) {
                z = true;
            }
            if (z) {
                stateListener.IconCompatParcelizer(getfid.RatingCompat);
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new getFavouriteAll(this), getRegisteredAccounts.read);
        this.amountEditText.setMaximumDecimalDigit(15);
        this.amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                getFid getfid = EditRecipientFragment.this.editRecipientPresenter;
                boolean z = true;
                if (TextUtils.isEmpty(EditRecipientFragment.this.amountEditText.getText().toString())) {
                    InstallationTokenResult.Builder builder = InstallationTokenResult.Builder.read;
                    if (getfid.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        builder.IconCompatParcelizer(getfid.RatingCompat);
                    }
                } else if (d == 0.0d) {
                    getBytesFromUUID getbytesfromuuid = getBytesFromUUID.MediaBrowserCompat$CustomActionResultReceiver;
                    if (getfid.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getbytesfromuuid.IconCompatParcelizer(getfid.RatingCompat);
                    }
                } else {
                    setFisError setfiserror = setFisError.read;
                    if (getfid.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setfiserror.IconCompatParcelizer(getfid.RatingCompat);
                    }
                }
            }
        });
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.amountInputLayout.setError(getString(i));
    }

    public final void read() {
        this.amountInputLayout.setError((CharSequence) null);
    }

    public final void read(String str) {
        this.customLimit.setText(str);
    }

    public final void write() {
        CustomLimit customLimit2 = this.customLimit;
        customLimit2.mLimitProgress.setVisibility(8);
        customLimit2.remainingLimit.setVisibility(0);
        customLimit2.remainingLimit.setText(R.string.limit_not_available);
    }

    public final void write(UncaughtExceptionHandlers uncaughtExceptionHandlers) {
        this.amountEditText.setFormattedAmount(uncaughtExceptionHandlers.MediaBrowserCompat$ItemReceiver);
        this.bankName.setText(uncaughtExceptionHandlers.MediaBrowserCompat$CustomActionResultReceiver);
        this.accountNumberText.setText(uncaughtExceptionHandlers.read);
        this.nickNameCounterEditText.setText(uncaughtExceptionHandlers.MediaMetadataCompat);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((Context) getActivity(), (int) R.drawable.shape_circle_lighter_gray_background, this.bankIcon, uncaughtExceptionHandlers.IconCompatParcelizer, getActivity().getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(getActivity(), R.color.f66402131099796));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CounterEditText counterEditText = this.nickNameCounterEditText;
        counterEditText.errorText.setVisibility(0);
        counterEditText.editText.setBackground(setLastBaselineToBottomHeight.write(counterEditText.getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_RELOAD_MANAGE_RECIPIENTS_GROUP_BULK_TRANSFER");
        getActivity().sendBroadcast(intent);
        getActivity().finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CustomLimit customLimit2 = this.customLimit;
        customLimit2.mLimitProgress.setVisibility(0);
        customLimit2.remainingLimit.setVisibility(8);
    }

    @OnClick
    public void navigateBack() {
        getActivity().finish();
    }

    @OnClick
    public void onSaveButtonClick() {
        getFid getfid = this.editRecipientPresenter;
        String string = getArguments().getString("com.scb.phone.EXTRA_GROUP_ID");
        String obj = this.nickNameCounterEditText.editText.getText().toString();
        String obj2 = this.amountEditText.getText().toString();
        boolean z = true;
        if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj).matches()) {
            long j = getfid.IconCompatParcelizer.MediaDescriptionCompat;
            waitForValue MediaBrowserCompat$ItemReceiver = waitForValue.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj2).doubleValue();
            MediaBrowserCompat$ItemReceiver.read = obj;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = string;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = j;
            if (getfid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getfid.RatingCompat.AlertController$RecycleListView();
            }
            getfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver);
            getfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getFid.read(getfid, (byte) 0));
            return;
        }
        IidStore iidStore = IidStore.MediaBrowserCompat$CustomActionResultReceiver;
        if (getfid.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iidStore.IconCompatParcelizer(getfid.RatingCompat);
        }
    }

    @OnClick
    public void onDeleteButtonClick() {
        getFid getfid = this.editRecipientPresenter;
        isValidApiKeyFormat isvalidapikeyformat = new isValidApiKeyFormat(getfid);
        if (getfid.RatingCompat != null) {
            isvalidapikeyformat.IconCompatParcelizer(getfid.RatingCompat);
        }
    }

    public final void write(String str) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.delete_recipient_dialog, str)).MediaBrowserCompat$ItemReceiver(getString(R.string.are_you_sure_want_delete_recipient, str));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm_delete_recipient), new deleteTile(this));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel_delete_recipient), getFavouriteTopUp.write).show();
    }

    public void onDestroyView() {
        super.onDestroyView();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
        this.editRecipientPresenter.onDestroy();
    }

    public static /* synthetic */ void read(EditRecipientFragment editRecipientFragment) {
        boolean z = !TextUtils.isEmpty(editRecipientFragment.amountEditText.getText()) && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(editRecipientFragment.amountEditText.getText().toString()) && !TextUtils.isEmpty(editRecipientFragment.nickNameCounterEditText.editText.getText().toString());
        if (editRecipientFragment.saveButton.isEnabled() != z) {
            editRecipientFragment.saveButton.setButtonEnabled(z);
        }
    }
}

package com.scb.phone.view.fragment.bulktransfer;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.bulktransfer.AddNewRecipientActivity;
import com.scb.phone.view.activity.bulktransfer.EditRecipientActivity;
import com.scb.phone.view.activity.bulktransfer.SelectRecipientFromFavouriteActivity;
import com.scb.phone.view.adapter.bulktransfer.ManageGroupAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AutoValue_InstallationResponse;
import p040o.AutoValue_PersistedInstallationEntry;
import p040o.BulkTransferDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.PersistedInstallation;
import p040o.SwitchCompat;
import p040o.UncaughtExceptionHandlers;
import p040o.findInterruptibleMethods;
import p040o.getFavouriteBillPayment;
import p040o.getFavouriteTransfer;
import p040o.getFisError;
import p040o.getLandingPageTileList;
import p040o.getMobileList;
import p040o.getPromptPayVersion;
import p040o.getPromptpayProfiles;
import p040o.getRefreshToken;
import p040o.getRegisteredAccounts;
import p040o.getRegistrationsAddresses;
import p040o.isAuthTokenExpired;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.setChildDrawingOrderCallback;

public class ManageRecipientGroupFragment extends BaseFragment implements proxyGetICheckDeserializerRtti.MediaDescriptionCompat {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    public CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    DefaultButton buttonAddFromFavourite;
    @BindView
    DefaultButton buttonAddNewRecipient;
    @BindView
    TextView counterRecipients;
    @BindView
    TextView groupName;
    @HmlPinActivity
    public AutoValue_InstallationResponse manageRecipientGroupPresenter;
    @BindView
    TextView recipientsNumber;
    @BindView
    RecyclerView recipientsRecycler;

    public static ManageRecipientGroupFragment read(String str, String str2) {
        ManageRecipientGroupFragment manageRecipientGroupFragment = new ManageRecipientGroupFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.EXTRA_GROUP_ID", str);
        bundle.putString("com.scb.phone.EXTRA_PARENT_BROADCAST", str2);
        manageRecipientGroupFragment.setArguments(bundle);
        return manageRecipientGroupFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88342131494061, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.manageRecipientGroupPresenter.MediaBrowserCompat$ItemReceiver(this);
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.manageRecipientGroupPresenter;
        String string = getArguments().getString("com.scb.phone.EXTRA_GROUP_ID");
        String stackedBackground = setStackedBackground();
        autoValue_InstallationResponse.read = string;
        autoValue_InstallationResponse.read(stackedBackground);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_RELOAD_MANAGE_RECIPIENTS_GROUP_BULK_TRANSFER")).subscribe(new getPromptpayProfiles(this), getRegisteredAccounts.read);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.manageRecipientGroupPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        Intent intent = new Intent();
        intent.setAction(getArguments().getString("com.scb.phone.EXTRA_PARENT_BROADCAST"));
        getContext().sendBroadcast(intent);
    }

    @OnClick
    public void onEdit() {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.manageRecipientGroupPresenter;
        getRefreshToken getrefreshtoken = new getRefreshToken(autoValue_InstallationResponse);
        if (autoValue_InstallationResponse.RatingCompat != null) {
            getrefreshtoken.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                ManageRecipientGroupFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mErrorTextView.setVisibility(8);
            }
        });
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        CustomInputDialog customInputDialog2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string = getString(R.string.group_name);
        if (string != null) {
            customInputDialog2.mTitleTextView.setVisibility(0);
            customInputDialog2.mTitleTextView.setText(string);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.setCanceledOnTouchOutside(false);
        this.MediaBrowserCompat$CustomActionResultReceiver.read(str);
        CustomInputDialog customInputDialog3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), getMobileList.MediaBrowserCompat$ItemReceiver);
        CustomInputDialog customInputDialog4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string2 = getString(R.string.edit_favourite);
        getPromptPayVersion getpromptpayversion = new getPromptPayVersion(this);
        if (string2 != null) {
            customInputDialog4.mPositiveButton.setText(string2);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, getpromptpayversion, false));
        }
        customInputDialog4.show();
    }

    @OnClick
    public void onAddFromFavourite() {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.manageRecipientGroupPresenter;
        isAuthTokenExpired isauthtokenexpired = new isAuthTokenExpired(autoValue_InstallationResponse);
        if (autoValue_InstallationResponse.RatingCompat != null) {
            isauthtokenexpired.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }

    @OnClick
    public void onAddNewRecipient() {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.manageRecipientGroupPresenter;
        getFisError getfiserror = new getFisError(autoValue_InstallationResponse);
        if (autoValue_InstallationResponse.RatingCompat != null) {
            getfiserror.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }

    @OnClick
    public void onDone() {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.manageRecipientGroupPresenter;
        PersistedInstallation persistedInstallation = PersistedInstallation.MediaBrowserCompat$CustomActionResultReceiver;
        if (autoValue_InstallationResponse.RatingCompat != null) {
            persistedInstallation.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }

    @OnClick
    public void onDelete() {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.manageRecipientGroupPresenter;
        AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry = new AutoValue_PersistedInstallationEntry(autoValue_InstallationResponse);
        if (autoValue_InstallationResponse.RatingCompat != null) {
            autoValue_PersistedInstallationEntry.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }

    public final void write(String str, boolean z) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.delete_recipients_group, str)).IconCompatParcelizer(z ? R.string.are_you_sure_want_delete_scheduled_group : R.string.are_you_sure_want_delete_group);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.confirm_delete_group), new getFavouriteTransfer(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel_delete_group), getLandingPageTileList.MediaBrowserCompat$ItemReceiver).show();
    }

    public final void read(String str, int i) {
        SelectRecipientFromFavouriteActivity.write(getContext(), str, i);
    }

    public final void read(String str) {
        AddNewRecipientActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        getActivity().finish();
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_GROUP_DELETED_BULK_TRANSFER");
        getContext().sendBroadcast(intent);
    }

    public final void read() {
        getActivity().finish();
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_GROUP_DELETED_BULK_TRANSFER");
        getContext().sendBroadcast(intent);
    }

    public final void write(String str) {
        this.groupName.setText(str);
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
    }

    public final void write() {
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
    }

    public final void read(findInterruptibleMethods findinterruptiblemethods) {
        this.groupName.setText(findinterruptiblemethods.MediaBrowserCompat$ItemReceiver);
        this.counterRecipients.setText(findinterruptiblemethods.MediaDescriptionCompat);
        this.buttonAddFromFavourite.setButtonEnabled(!findinterruptiblemethods.MediaMetadataCompat);
        this.buttonAddNewRecipient.setButtonEnabled(!findinterruptiblemethods.MediaMetadataCompat);
    }

    public final void MediaBrowserCompat$ItemReceiver(findInterruptibleMethods findinterruptiblemethods) {
        this.recipientsNumber.setText(findinterruptiblemethods.RatingCompat);
        getContext();
        this.recipientsRecycler.setLayoutManager(new LinearLayoutManager(1, false));
        SwitchCompat.IconCompatParcelizer((View) this.recipientsRecycler, false);
        this.recipientsRecycler.setAdapter(new ManageGroupAdapter(findinterruptiblemethods.MediaBrowserCompat$SearchResultReceiver, new getFavouriteBillPayment(this)));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(UncaughtExceptionHandlers uncaughtExceptionHandlers, String str) {
        EditRecipientActivity.MediaBrowserCompat$ItemReceiver(getContext(), str, uncaughtExceptionHandlers);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.manageRecipientGroupPresenter.MediaBrowserCompat$ItemReceiver = false;
    }
}

package com.scb.phone.view.fragment.bulktransfer;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CounterEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p040o.AutoValue_InstallationTokenResult;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.compute;
import p040o.deleteRegisteredAccount;
import p040o.getICheckDeserializerRtti;
import p040o.getRegisteredAccounts;
import p040o.getTokenExpirationTimestamp;
import p040o.isRegistered;
import p040o.isRegistered$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.isRegistered$MediaBrowserCompat$ItemReceiver;
import p040o.parseFile;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.readPublicKeyFromLocalStorageAndCalculateInstanceId;
import p040o.setLastBaselineToBottomHeight;
import p040o.setToken;
import p040o.setTokenCreationTimestamp;
import p040o.setValueReference;
import p040o.shouldAttemptMigration;

public class AddNewRecipientFragment extends BaseFragment implements proxyGetICheckDeserializerRtti.IconCompatParcelizer {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    @BindView
    protected EditText accountNumberEditText;
    @HmlPinActivity
    public isRegistered addNewRecipientPresenter;
    @BindView
    protected AmountEditText amountEditText;
    @BindView
    protected TextInputLayout amountInputLayout;
    @BindView
    protected ImageView bankIcon;
    @BindView
    protected TextView bankName;
    @BindView
    protected CounterEditText nickNameCounterEditText;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected DefaultButton reviewButton;
    @BindView
    protected TextView textRemainingLimit;

    public static AddNewRecipientFragment IconCompatParcelizer(String str, parseFile parsefile) {
        AddNewRecipientFragment addNewRecipientFragment = new AddNewRecipientFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_BANK", parsefile);
        bundle.putString("com.scb.phone.EXTRA_GROUP_ID", str);
        addNewRecipientFragment.setArguments(bundle);
        return addNewRecipientFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85632131493790, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.addNewRecipientPresenter.MediaBrowserCompat$ItemReceiver(this);
        isRegistered isregistered = this.addNewRecipientPresenter;
        parseFile parsefile = (parseFile) getArguments().getParcelable("com.scb.phone.EXTRA_BANK");
        isregistered.IconCompatParcelizer = parsefile;
        if (parsefile.read != null) {
            str = parsefile.read.write;
        } else {
            str = "";
        }
        if (!"014".equalsIgnoreCase(str)) {
            if (isregistered.RatingCompat != null) {
                isregistered.RatingCompat.Keep();
            }
            isregistered.write.read();
            isregistered.write.IconCompatParcelizer(new isRegistered$MediaBrowserCompat$CustomActionResultReceiver(isregistered, (byte) 0));
        }
        setToken settoken = new setToken(parsefile);
        if (isregistered.RatingCompat != null) {
            z = true;
        }
        if (z) {
            settoken.IconCompatParcelizer(isregistered.RatingCompat);
        }
        this.IconCompatParcelizer = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new deleteRegisteredAccount(this), getRegisteredAccounts.read);
        this.amountEditText.setMaximumDecimalDigit(15);
        this.amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                isRegistered isregistered = AddNewRecipientFragment.this.addNewRecipientPresenter;
                boolean z = true;
                if (TextUtils.isEmpty(AddNewRecipientFragment.this.amountEditText.getText().toString())) {
                    getTokenExpirationTimestamp gettokenexpirationtimestamp = getTokenExpirationTimestamp.MediaBrowserCompat$CustomActionResultReceiver;
                    if (isregistered.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        gettokenexpirationtimestamp.IconCompatParcelizer(isregistered.RatingCompat);
                    }
                } else if (d == 0.0d) {
                    setTokenCreationTimestamp settokencreationtimestamp = setTokenCreationTimestamp.read;
                    if (isregistered.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        settokencreationtimestamp.IconCompatParcelizer(isregistered.RatingCompat);
                    }
                } else {
                    AutoValue_InstallationTokenResult autoValue_InstallationTokenResult = AutoValue_InstallationTokenResult.write;
                    if (isregistered.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        autoValue_InstallationTokenResult.IconCompatParcelizer(isregistered.RatingCompat);
                    }
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                isRegistered isregistered = AddNewRecipientFragment.this.addNewRecipientPresenter;
                shouldAttemptMigration shouldattemptmigration = shouldAttemptMigration.write;
                if (isregistered.RatingCompat != null) {
                    shouldattemptmigration.IconCompatParcelizer(isregistered.RatingCompat);
                }
            }
        });
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.amountInputLayout.setError(getString(i));
        this.amountInputLayout.setErrorEnabled(true);
    }

    public final void write() {
        this.amountInputLayout.setError((CharSequence) null);
        this.amountInputLayout.setErrorEnabled(false);
    }

    public final void read(String str) {
        write(true);
        this.remainingLimit.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        write(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(parseFile parsefile) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), (int) R.drawable.bankicon_place_holder, this.bankIcon, parsefile.IconCompatParcelizer, getContext().getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        this.bankName.setText(parsefile.MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer() {
        CounterEditText counterEditText = this.nickNameCounterEditText;
        counterEditText.errorText.setVisibility(0);
        counterEditText.editText.setBackground(setLastBaselineToBottomHeight.write(counterEditText.getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public final void read() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_RELOAD_MANAGE_RECIPIENTS_GROUP_BULK_TRANSFER");
        getActivity().sendBroadcast(intent);
        getActivity().finish();
    }

    private void write(boolean z) {
        int i = 8;
        this.remainingLimitError.setVisibility(z ? 8 : 0);
        this.textRemainingLimit.setVisibility(z ? 0 : 8);
        this.remainingLimit.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.remainingLimitLinearLayout;
        if (z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    @OnClick
    public void navigateBack() {
        getContext().sendBroadcast(new Intent("com.scb.phone.ACTION_ADD_RECIPIENT_BACK"));
    }

    @OnClick
    public void onReviewButtonClick() {
        String str;
        isRegistered isregistered = this.addNewRecipientPresenter;
        String string = getArguments().getString("com.scb.phone.EXTRA_GROUP_ID");
        String obj = this.accountNumberEditText.getText().toString();
        String obj2 = this.nickNameCounterEditText.editText.getText().toString();
        String obj3 = this.amountEditText.getText().toString();
        boolean z = true;
        if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj2).matches()) {
            if (isregistered.RatingCompat != null) {
                isregistered.RatingCompat.AlertController$RecycleListView();
            }
            if (isregistered.IconCompatParcelizer.read != null) {
                str = isregistered.IconCompatParcelizer.read.write;
            } else {
                str = "";
            }
            setValueReference MediaBrowserCompat$ItemReceiver = setValueReference.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = obj;
            MediaBrowserCompat$ItemReceiver.read = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj3).doubleValue();
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = obj2;
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = isregistered.IconCompatParcelizer.read.write;
            MediaBrowserCompat$ItemReceiver.write = "014".equalsIgnoreCase(str) ? "SCB" : "OTHER";
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(MediaBrowserCompat$ItemReceiver);
            compute MediaBrowserCompat$CustomActionResultReceiver = compute.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.read = arrayList;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = string;
            isregistered.write.write(MediaBrowserCompat$CustomActionResultReceiver);
            isregistered.write.IconCompatParcelizer(new isRegistered$MediaBrowserCompat$ItemReceiver(isregistered, (byte) 0));
            return;
        }
        readPublicKeyFromLocalStorageAndCalculateInstanceId readpublickeyfromlocalstorageandcalculateinstanceid = readPublicKeyFromLocalStorageAndCalculateInstanceId.read;
        if (isregistered.RatingCompat == null) {
            z = false;
        }
        if (z) {
            readpublickeyfromlocalstorageandcalculateinstanceid.IconCompatParcelizer(isregistered.RatingCompat);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        this.addNewRecipientPresenter.onDestroy();
    }

    public static /* synthetic */ void IconCompatParcelizer(AddNewRecipientFragment addNewRecipientFragment) {
        boolean z = !TextUtils.isEmpty(addNewRecipientFragment.amountEditText.getText()) && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(addNewRecipientFragment.amountEditText.getText().toString()) && !TextUtils.isEmpty(addNewRecipientFragment.nickNameCounterEditText.editText.getText().toString()) && !TextUtils.isEmpty(addNewRecipientFragment.accountNumberEditText.getText());
        if (addNewRecipientFragment.reviewButton.isEnabled() != z) {
            addNewRecipientFragment.reviewButton.setButtonEnabled(z);
        }
    }
}

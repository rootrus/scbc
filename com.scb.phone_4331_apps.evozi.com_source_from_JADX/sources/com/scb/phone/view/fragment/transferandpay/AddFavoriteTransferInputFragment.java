package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.regex.Pattern;
import p040o.ActivityBuilder_ContributeRiskFormSheetActivity;
import p040o.ActivityBuilder_ContributeRoboAdvisorLandingActivity;
import p040o.ActivityBuilder_ContributesHmlEtbConfirmationOtpActivity;
import p040o.C4316e;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.access$2200;
import p040o.eventFromJson;
import p040o.eventToJson;
import p040o.getRegistrationsAddresses;
import p040o.getShortName;
import p040o.getTopLeftCornerWidth;
import p040o.parseSession;
import p040o.setLastBaselineToBottomHeight;

public class AddFavoriteTransferInputFragment extends BaseFragment implements getTopLeftCornerWidth.write {
    public String IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$MediaItem;
    public parseSession MediaBrowserCompat$SearchResultReceiver;
    private Drawable MediaDescriptionCompat;
    public CustomInputDialog MediaMetadataCompat;
    @BindView
    protected DefaultButton buttonAddFavorite;
    @BindView
    protected EditText editAccountNumber;
    @BindView
    protected AmountEditText editAmount;
    @BindView
    protected ImageView editImageView;
    @BindView
    protected ImageView imageIcon;
    @BindView
    TextInputLayout inputLayout;
    @HmlPinActivity
    public C4316e.C43171 presenter;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected TextView textAccountNumber;
    @BindView
    protected TextView textRemainingLimit;
    @BindView
    protected TextView textTitle;
    @BindView
    protected ViewGroup viewGroupAccountNumber;

    public static AddFavoriteTransferInputFragment IconCompatParcelizer(parseSession parsesession, String str, getShortName getshortname, double d) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", parsesession);
        bundle.putString("com.scb.phone.EXTRA_ACCOUNT_NUMBER", str);
        bundle.putSerializable("com.scb.phone.EXTRA_ACCOUNT_TYPE", getshortname);
        bundle.putDouble("com.scb.phone.EXTRA_ACCOUNT_BALANCE", d);
        AddFavoriteTransferInputFragment addFavoriteTransferInputFragment = new AddFavoriteTransferInputFragment();
        addFavoriteTransferInputFragment.setArguments(bundle);
        return addFavoriteTransferInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85622131493789, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.editAmount.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_place_holder);
        Bundle arguments = getArguments();
        this.MediaBrowserCompat$SearchResultReceiver = (parseSession) arguments.getParcelable("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA");
        this.MediaBrowserCompat$MediaItem = arguments.getString("com.scb.phone.EXTRA_ACCOUNT_NUMBER");
        parseSession parsesession = this.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = parsesession;
        this.buttonAddFavorite.setButtonEnabled(false);
        this.textTitle.setText(parsesession.MediaDescriptionCompat);
        String str = parsesession.write;
        this.textAccountNumber.setText(str);
        this.buttonAddFavorite.setButtonEnabled(!TextUtils.isEmpty(str));
        int i = 8;
        if (parsesession instanceof eventToJson) {
            this.IconCompatParcelizer = parsesession.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z2 = !TextUtils.isEmpty(str);
            this.textAccountNumber.setVisibility(z2 ? 0 : 8);
            ViewGroup viewGroup2 = this.viewGroupAccountNumber;
            if (!z2) {
                i = 0;
            }
            viewGroup2.setVisibility(i);
        } else if (parsesession instanceof eventFromJson) {
            this.IconCompatParcelizer = ((eventFromJson) parsesession).MediaBrowserCompat$ItemReceiver;
            this.textAccountNumber.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            this.viewGroupAccountNumber.setVisibility(8);
            this.buttonAddFavorite.setButtonEnabled(true);
        }
        Context context = getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, this.MediaDescriptionCompat, this.imageIcon, parsesession.read, context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
        this.editAccountNumber.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() != 0) {
                    AddFavoriteTransferInputFragment.this.buttonAddFavorite.setButtonEnabled(true);
                } else {
                    AddFavoriteTransferInputFragment.this.buttonAddFavorite.setButtonEnabled(false);
                }
                String unused = AddFavoriteTransferInputFragment.this.IconCompatParcelizer = charSequence.toString();
            }
        });
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                AddFavoriteTransferInputFragment.this.MediaBrowserCompat$CustomActionResultReceiver = d;
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                AddFavoriteTransferInputFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.editAmount.setHandleDismissKeyboard(new ActivityBuilder_ContributesHmlEtbConfirmationOtpActivity(this));
        C4316e.C43171 r11 = this.presenter;
        IGoogleMapDelegate iGoogleMapDelegate = this.MediaBrowserCompat$SearchResultReceiver.RatingCompat;
        if (r11.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r11.RatingCompat.Keep();
        }
        r11.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        r11.IconCompatParcelizer.IconCompatParcelizer(new C4316e.C43171.read(iGoogleMapDelegate));
        return inflate;
    }

    @OnClick
    public void navigateBack() {
        getContext().sendBroadcast(new Intent("com.scb.phone/BROADCAST_TRANSFER_BACK_STEP"));
    }

    @OnClick
    public void addFavorite() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver;
        String string = getString(R.string.add_to_favorite);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        this.MediaMetadataCompat.mEditTextView.setHint(R.string.enter_a_nickname);
        CustomInputDialog customInputDialog = this.MediaMetadataCompat;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(AddFavoriteTransferInputFragment.this.MediaMetadataCompat.mEditTextView.getText())).matches()) {
                    CustomInputDialog read = AddFavoriteTransferInputFragment.this.MediaMetadataCompat;
                    String string = AddFavoriteTransferInputFragment.this.getString(R.string.favorite_invalid_character);
                    read.mErrorTextView.setVisibility(0);
                    read.mErrorTextView.setText(string);
                    AddFavoriteTransferInputFragment.this.MediaMetadataCompat.mPositiveButton.setEnabled(false);
                    return;
                }
                AddFavoriteTransferInputFragment.this.MediaMetadataCompat.mErrorTextView.setVisibility(8);
                AddFavoriteTransferInputFragment.this.MediaMetadataCompat.mPositiveButton.setEnabled(true);
            }
        });
        CustomInputDialog customInputDialog2 = this.MediaMetadataCompat;
        customInputDialog2.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.MediaMetadataCompat.setCanceledOnTouchOutside(false);
        this.MediaMetadataCompat.mEditTextView.setVisibility(0);
        CustomInputDialog customInputDialog3 = this.MediaMetadataCompat;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), ActivityBuilder_ContributeRoboAdvisorLandingActivity.read);
        CustomInputDialog customInputDialog4 = this.MediaMetadataCompat;
        String string2 = getString(R.string.done);
        ActivityBuilder_ContributeRiskFormSheetActivity activityBuilder_ContributeRiskFormSheetActivity = new ActivityBuilder_ContributeRiskFormSheetActivity(this);
        if (string2 != null) {
            customInputDialog4.mPositiveButton.setText(string2);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, activityBuilder_ContributeRiskFormSheetActivity, false));
        }
        if (isAdded() && getContext() != null) {
            this.MediaMetadataCompat.show();
        }
    }

    public final void read() {
        IconCompatParcelizer(false);
    }

    private void IconCompatParcelizer(boolean z) {
        int i = 0;
        this.remainingLimitLinearLayout.setVisibility(z ? 0 : 8);
        this.remainingLimitError.setVisibility(z ? 8 : 0);
        this.textRemainingLimit.setVisibility(z ? 0 : 8);
        TextView textView = this.remainingLimit;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void read(String str) {
        IconCompatParcelizer(true);
        this.textRemainingLimit.setText(R.string.transfer_limit);
        this.remainingLimit.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        CustomInputDialog customInputDialog = this.MediaMetadataCompat;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
        write(access_2200);
    }

    public final void IconCompatParcelizer() {
        CustomInputDialog customInputDialog = this.MediaMetadataCompat;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "TRANSFER");
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        if (this.MediaBrowserCompat$ItemReceiver != null && !this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }
        CustomInputDialog customInputDialog = this.MediaMetadataCompat;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
            this.MediaMetadataCompat = null;
        }
        super.onDestroy();
    }
}

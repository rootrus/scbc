package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomNoteEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import java.util.regex.Pattern;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.MerchantWalletService;
import p040o.createQr;
import p040o.editMerchantAccount;
import p040o.getCheckAccountEligibility;
import p040o.getMerchantLanding;
import p040o.getMerchantStatic;
import p040o.getMerchantTermsAndConditions;
import p040o.getShopInfo;
import p040o.getSignal;
import p040o.setLastBaselineToBottomHeight;
import p040o.updateDevice;

public class AccountManagementItemCustomView extends AccountManagementItem {
    public getSignal MediaBrowserCompat$CustomActionResultReceiver;
    public updateDevice.read MediaBrowserCompat$ItemReceiver;
    @BindView
    public TextView accountNicknameText;
    @BindView
    public TextView accountNoText;
    @BindView
    public TextView accountTypeText;
    @BindView
    ImageView deleteButton;
    @BindView
    ImageView deleteSCBSButton;
    @BindView
    DefaultButton doneButton;
    @BindView
    ImageView editButton;
    @BindView
    View editButtons;
    @BindView
    ImageButton editClearButton;
    @BindView
    View editField;
    @BindView
    public CustomNoteEditText editText;
    @BindView
    TextView mErrorText;
    @BindView
    public View separator;

    public void setListener(updateDevice.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public AccountManagementItemCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AccountManagementItemCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountManagementItemCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80882131493314, this, true);
        setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f71012131100257));
        ButterKnife.IconCompatParcelizer(this);
        this.mErrorText.setVisibility(8);
        this.editText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        this.editButton.setOnClickListener(new getCheckAccountEligibility(this));
        this.doneButton.setOnClickListener(new createQr(this));
        this.editClearButton.setOnClickListener(new getMerchantTermsAndConditions(this));
        this.deleteButton.setOnClickListener(new getShopInfo(this));
        this.deleteSCBSButton.setOnClickListener(new getMerchantLanding(this));
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20), new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("[^\\u200b]")});
        this.editText.addTextChangedListener(new TextWatcher(new editMerchantAccount(this)) {
            private /* synthetic */ IconCompatParcelizer write;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.write = r1;
            }

            public final void afterTextChanged(Editable editable) {
                this.write.IconCompatParcelizer(editable.toString());
            }
        });
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (getSignal) builder;
        getMerchantStatic getmerchantstatic = new getMerchantStatic(this);
        MerchantWalletService merchantWalletService = new MerchantWalletService(this, builder);
        int i = 0;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat) {
            this.editButton.setVisibility(8);
            this.accountNoText.setVisibility(8);
            this.accountNicknameText.setVisibility(8);
            this.deleteButton.setVisibility(8);
            ImageView imageView = this.deleteSCBSButton;
            if (z) {
                i = 4;
            }
            imageView.setVisibility(i);
            getmerchantstatic.run();
            return;
        }
        merchantWalletService.run();
        this.editButton.setVisibility(0);
        this.accountNoText.setVisibility(0);
        this.accountNicknameText.setVisibility(0);
        ImageView imageView2 = this.deleteButton;
        if (z) {
            i = 8;
        }
        imageView2.setVisibility(i);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        boolean z = TextUtils.isEmpty(str) || Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(str).matches();
        if (z) {
            this.mErrorText.setVisibility(8);
            this.editText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        } else {
            this.mErrorText.setVisibility(0);
            this.editText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
        }
        this.doneButton.setButtonEnabled(z);
        return z;
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = z;
        int i = 0;
        this.editButtons.setVisibility(!z ? 0 : 8);
        View view = this.editField;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver == null || this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                this.editText.setText("");
            } else {
                this.editText.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }
}

package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomNoteEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import java.util.regex.Pattern;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.MutualFundsService;
import p040o.calculateRiskAssessment;
import p040o.cancelFundTransaction;
import p040o.confirmRiskAssessment;
import p040o.getDetails;
import p040o.getDevices;
import p040o.getSignal;
import p040o.setLastBaselineToBottomHeight;

public class AddedAccountManagementSuccessItemCustomView extends ConstraintLayout implements getDetails {
    public getDevices.write IconCompatParcelizer;
    @BindView
    TextView accountNicknameText;
    @BindView
    TextView accountNoText;
    @BindView
    TextView accountTypeText;
    @BindView
    DefaultButton doneButton;
    @BindView
    Button editButton;
    @BindView
    ImageButton editClearButton;
    @BindView
    public CustomNoteEditText editText;
    @BindView
    TextView mErrorText;
    public getSignal write;

    public void setListener(getDevices.write write2) {
        this.IconCompatParcelizer = write2;
    }

    public AddedAccountManagementSuccessItemCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddedAccountManagementSuccessItemCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddedAccountManagementSuccessItemCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80892131493315, this, true);
        setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        ButterKnife.IconCompatParcelizer(this);
        this.mErrorText.setVisibility(8);
        this.editText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        this.editButton.setOnClickListener(new confirmRiskAssessment(this));
        this.doneButton.setOnClickListener(new MutualFundsService(this));
        this.editClearButton.setOnClickListener(new cancelFundTransaction(this));
        this.editText.addTextChangedListener(new TextWatcher(new calculateRiskAssessment(this)) {
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
        read(false);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        getSignal getsignal = (getSignal) builder;
        this.write = getsignal;
        this.accountNicknameText.setText(getsignal.MediaBrowserCompat$CustomActionResultReceiver);
        this.accountNoText.setText(this.write.MediaBrowserCompat$SearchResultReceiver);
        this.accountTypeText.setText(this.write.read);
        this.editText.setHint(this.write.MediaBrowserCompat$CustomActionResultReceiver);
        read(this.write.MediaMetadataCompat);
        this.accountNicknameText.setVisibility(TextUtils.isEmpty(this.write.MediaBrowserCompat$CustomActionResultReceiver) ^ true ? 0 : 8);
        this.editText.setHint(getContext().getString(R.string.account_management_nickname_placeholder));
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
        int i = 8;
        this.accountNicknameText.setVisibility(!z ? 0 : 8);
        this.editButton.setVisibility(!z ? 0 : 4);
        this.editText.setVisibility(z ? 0 : 8);
        this.editClearButton.setVisibility(z ? 0 : 8);
        DefaultButton defaultButton = this.doneButton;
        if (z) {
            i = 0;
        }
        defaultButton.setVisibility(i);
        getSignal getsignal = this.write;
        if (getsignal != null) {
            getsignal.MediaMetadataCompat = z;
            if (z) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.write);
                this.editText.setText(this.write.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }
}

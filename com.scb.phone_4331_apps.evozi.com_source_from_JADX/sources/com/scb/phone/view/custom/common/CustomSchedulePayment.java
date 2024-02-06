package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import java.util.List;
import p040o.C5462x904c0edb;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getRegistrationsProfiles;
import p040o.setLastBaselineToBottomHeight;
import p040o.submitAddressInformationFundAppForm;
import p040o.submitFundAccount;
import p040o.submitFundSource;

public class CustomSchedulePayment extends ConstraintLayout {
    public boolean IconCompatParcelizer = true;
    @BindView
    View clickableSpinner;
    @BindView
    ConstraintLayout container;
    @BindView
    public AmountEditText etAmount;
    @BindView
    ImageView ivSpinnerArrow;
    @BindView
    public Spinner spinner;
    @BindView
    TextView tvCurrency;
    @BindView
    TextView tvError;
    @BindView
    TextView tvExtraInfo;
    @BindView
    View vSeparator;
    /* access modifiers changed from: private */
    public IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver(C5462x904c0edb writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver);
    }

    public static /* synthetic */ void read() {
    }

    public CustomSchedulePayment(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver((AttributeSet) null);
    }

    public CustomSchedulePayment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver(attributeSet);
    }

    public CustomSchedulePayment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver(attributeSet);
    }

    private void MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet) {
        String str;
        LayoutInflater.from(getContext()).inflate(R.layout.f84692131493696, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.ScheduledPaymentLayout, 0, 0);
            str = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        if (str == null || str.isEmpty()) {
            this.tvCurrency.setText(R.string.hml_baht_curreny);
        } else {
            this.tvCurrency.setText(str);
        }
        this.etAmount.setImeOptions(6);
        this.etAmount.setOnHandleDismissKeyboardListener(new getRegistrationsProfiles(this));
        this.etAmount.setCustomHint(getResources().getString(R.string.transfer_to_account_amount_hint));
        this.etAmount.setOnEditorActionListener(new submitFundAccount(this));
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (CustomSchedulePayment.this.write != null) {
                    CustomSchedulePayment.this.write.MediaBrowserCompat$ItemReceiver((C5462x904c0edb) adapterView.getSelectedItem());
                }
            }
        });
    }

    public final void IconCompatParcelizer() {
        this.container.setFocusable(true);
        this.container.setFocusableInTouchMode(true);
        this.container.requestFocus();
        IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public void setListener(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public void setExtraInfo(String str) {
        this.tvExtraInfo.setText(str);
    }

    public void setError(String str) {
        this.tvError.setText(str);
    }

    public final void IconCompatParcelizer(boolean z) {
        int i = 0;
        this.tvError.setVisibility(z ? 0 : 8);
        TextView textView = this.tvExtraInfo;
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setInstallment(List<?> list) {
        this.spinner.setAdapter(new ArrayAdapter(getContext(), R.layout.f84832131493710, list));
        if (list.size() <= 1) {
            this.clickableSpinner.setOnClickListener(submitFundSource.MediaBrowserCompat$CustomActionResultReceiver);
            this.ivSpinnerArrow.setVisibility(8);
            return;
        }
        this.clickableSpinner.setOnClickListener(new submitAddressInformationFundAppForm(this));
        this.ivSpinnerArrow.setVisibility(0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.spinner.setEnabled(z);
        this.ivSpinnerArrow.setEnabled(z);
        this.IconCompatParcelizer = z;
        this.etAmount.setEnabled(z);
        this.container.setEnabled(z);
        View view = this.vSeparator;
        Context context = getContext();
        int i = R.color.f66402131099796;
        view.setBackgroundColor(setLastBaselineToBottomHeight.read(context, z ? R.color.f66192131099774 : R.color.f66402131099796));
        TextView textView = this.tvCurrency;
        Context context2 = getContext();
        if (z) {
            i = R.color.f66092131099764;
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(context2, i));
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.etAmount.setOnFocusChangeListener(onFocusChangeListener);
    }

    @OnClick
    public void onClickArrow() {
        if (this.IconCompatParcelizer) {
            this.spinner.performClick();
        }
    }
}

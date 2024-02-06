package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindCardlessSuccessfulRequestFragment;
import p040o.FragmentBuilder_BindCloseAccountSelectionOtherFragment;

public class ScheduleDate extends RelativeLayout {
    @BindView
    ImageView arrowIcon;
    @BindView
    ImageButton calendarButton;
    @BindView
    public EditText dateField;
    @BindView
    TextView dateLabel;
    @BindView
    EditText paymentField;
    private FragmentBuilder_BindCloseAccountSelectionOtherFragment read;
    private FragmentBuilder_BindCardlessSuccessfulRequestFragment write;

    public ScheduleDate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84662131493693, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDateHint(String str) {
        this.dateField.setHint(str);
    }

    public void setPaymentHint(String str) {
        this.paymentField.setHint(str);
    }

    public void setLabel(String str) {
        this.dateLabel.setText(str);
    }

    public void setDateField(String str) {
        this.dateField.setText(str);
    }

    public void setPaymentField(String str) {
        this.paymentField.setText(str);
    }

    public void setDateFieldVisible(int i) {
        this.dateField.setVisibility(i);
    }

    public void setPaymentFieldVisible(int i) {
        this.paymentField.setVisibility(i);
    }

    public void setCalendarButtonVisible(int i) {
        this.calendarButton.setVisibility(i);
    }

    public void setArrowIconVisible(int i) {
        this.arrowIcon.setVisibility(i);
    }

    public void setOnSelectDateListener(FragmentBuilder_BindCloseAccountSelectionOtherFragment fragmentBuilder_BindCloseAccountSelectionOtherFragment) {
        this.read = fragmentBuilder_BindCloseAccountSelectionOtherFragment;
    }

    public void setOnMakePaymentEveryListener(FragmentBuilder_BindCardlessSuccessfulRequestFragment fragmentBuilder_BindCardlessSuccessfulRequestFragment) {
        this.write = fragmentBuilder_BindCardlessSuccessfulRequestFragment;
    }

    @OnClick
    public void onFieldClick() {
        FragmentBuilder_BindCloseAccountSelectionOtherFragment fragmentBuilder_BindCloseAccountSelectionOtherFragment = this.read;
        if (fragmentBuilder_BindCloseAccountSelectionOtherFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionOtherFragment.read();
        }
    }

    @OnClick
    public void onCalendarClick() {
        FragmentBuilder_BindCloseAccountSelectionOtherFragment fragmentBuilder_BindCloseAccountSelectionOtherFragment = this.read;
        if (fragmentBuilder_BindCloseAccountSelectionOtherFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionOtherFragment.read();
        }
    }

    @OnClick
    public void onPaymentFieldClick() {
        FragmentBuilder_BindCardlessSuccessfulRequestFragment fragmentBuilder_BindCardlessSuccessfulRequestFragment = this.write;
        if (fragmentBuilder_BindCardlessSuccessfulRequestFragment != null) {
            fragmentBuilder_BindCardlessSuccessfulRequestFragment.read();
        }
    }
}

package com.scb.phone.view.custom.investment.scbs.open;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.List;
import p040o.setLastBaselineToBottomHeight;

public class OnboardingAddressInformationItemCustomView extends LinearLayout {
    private write MediaBrowserCompat$ItemReceiver;
    @BindView
    public RelativeLayout addressTextBoxLayout;
    @BindView
    TextView addressTextView;
    @BindView
    ImageView arrowImageView;
    @BindView
    TextView hintTextView;
    @BindViews
    List<CheckBox> sameOptionCheckBoxes;
    @BindView
    View separator;
    @BindView
    TextView titleTextView;

    public interface write {
        void IconCompatParcelizer();
    }

    public OnboardingAddressInformationItemCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f83492131493575, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setEnabledClickedAddressTextBox(false);
        setEnabledCheckBox(0, false);
        setEnabledCheckBox(1, false);
        setEnabledCheckBox(2, false);
    }

    public void setTitle(int i) {
        this.titleTextView.setText(getContext().getString(i));
    }

    public void setTextHint(int i) {
        this.hintTextView.setText(getContext().getString(i));
    }

    public void setEnabledTextHint(boolean z) {
        this.hintTextView.setVisibility(z ? 0 : 8);
    }

    public void setOnAddressChangedListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public void setAddress(String str) {
        this.addressTextView.setText(str);
        write write2 = this.MediaBrowserCompat$ItemReceiver;
        if (write2 != null) {
            write2.IconCompatParcelizer();
        }
    }

    public void setEnabledAddress(boolean z) {
        this.addressTextView.setVisibility(z ? 0 : 8);
    }

    public void setEnabledForNextStep(boolean z) {
        int read = setLastBaselineToBottomHeight.read(getContext(), z ? R.color.f66092131099764 : R.color.f66182131099773);
        this.titleTextView.setTextColor(read);
        ImageView imageView = this.arrowImageView;
        if (z) {
            read = 0;
        }
        imageView.setColorFilter(read);
        this.arrowImageView.setEnabled(z);
        setEnabledTextHint(!z);
        setEnabledAddress(z);
        for (int i = 0; i != 3; i++) {
            setEnabledClickOnCheckBox(i, z);
            if (!z) {
                setCheckboxChecked(i, false);
            }
        }
    }

    public void setEnabledClickedAddressTextBox(boolean z) {
        int read = setLastBaselineToBottomHeight.read(getContext(), z ? R.color.f66092131099764 : R.color.f66182131099773);
        ImageView imageView = this.arrowImageView;
        if (z) {
            read = 0;
        }
        imageView.setColorFilter(read);
        this.arrowImageView.setEnabled(z);
        setEnabled(z);
    }

    public void setEnabledCheckBox(int i, boolean z) {
        this.sameOptionCheckBoxes.get(i).setVisibility(z ? 0 : 8);
    }

    public void setCheckboxChecked(int i, boolean z) {
        this.sameOptionCheckBoxes.get(i).setChecked(z);
    }

    public void setCheckBoxText(int i, int i2) {
        this.sameOptionCheckBoxes.get(i2).setText(getContext().getString(i));
    }

    public void setCheckBoxListener(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.sameOptionCheckBoxes.get(i).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setEnabledClickOnCheckBox(int i, boolean z) {
        int read = setLastBaselineToBottomHeight.read(getContext(), z ? R.color.f66092131099764 : R.color.f66182131099773);
        this.sameOptionCheckBoxes.get(i).setEnabled(z);
        this.sameOptionCheckBoxes.get(i).setTextColor(read);
    }

    public void setEnabledSeparator(boolean z) {
        this.separator.setVisibility(z ? 0 : 8);
    }

    public void setTitleWithMandatory(int i) {
        String string = getContext().getString(i);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("*");
        String obj = sb.toString();
        getResources();
        SpannableString spannableString = new SpannableString(obj);
        spannableString.setSpan(new ForegroundColorSpan(-1024159), obj.length() - 1, obj.length(), 0);
        this.titleTextView.setText(spannableString);
    }
}

package com.scb.phone.view.custom.cardmanagement;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.getObjectives;
import p040o.verifyPurposefulFeatures;

public class TermsAndConditionsView extends LinearLayout {
    getObjectives MediaBrowserCompat$ItemReceiver;
    verifyPurposefulFeatures read;
    @BindView
    public CheckBox termsCheckBox;
    @BindView
    TextView txvTermsAndConditions;

    public TermsAndConditionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f91792131494406, this, true);
        ButterKnife.IconCompatParcelizer(this);
        SpannableString spannableString = new SpannableString(getContext().getResources().getString(R.string.agree_to_label));
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                TermsAndConditionsView.this.termsCheckBox.toggle();
                if (TermsAndConditionsView.this.MediaBrowserCompat$ItemReceiver != null) {
                    TermsAndConditionsView.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(TermsAndConditionsView.this.termsCheckBox.isChecked());
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                TermsAndConditionsView.this.getResources();
                textPaint.setColor(-9212296);
            }
        }, 0, spannableString.length(), 33);
        this.txvTermsAndConditions.setText(spannableString);
        SpannableString spannableString2 = new SpannableString(getContext().getResources().getString(R.string.terms_and_conditions));
        spannableString2.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                if (TermsAndConditionsView.this.read != null) {
                    TermsAndConditionsView.this.read.MediaBrowserCompat$SearchResultReceiver();
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(true);
                TermsAndConditionsView.this.getResources();
                textPaint.setColor(-9031231);
            }
        }, 0, spannableString2.length(), 33);
        this.txvTermsAndConditions.append(spannableString2);
        this.txvTermsAndConditions.setMovementMethod(LinkMovementMethod.getInstance());
        this.txvTermsAndConditions.setHighlightColor(0);
    }

    public void setTermsCheckboxListener(getObjectives getobjectives) {
        this.MediaBrowserCompat$ItemReceiver = getobjectives;
    }

    public void setTermsAndConditionsListener(verifyPurposefulFeatures verifypurposefulfeatures) {
        this.read = verifypurposefulfeatures;
    }

    @OnClick
    public void onCheckBoxClick() {
        getObjectives getobjectives = this.MediaBrowserCompat$ItemReceiver;
        if (getobjectives != null) {
            getobjectives.IconCompatParcelizer(this.termsCheckBox.isChecked());
        }
    }
}

package com.scb.phone.view.custom.common;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.EligibilityService;
import p040o.FragmentBuilder_BindDirectDebitInputSelectedFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.getFastPayProfiles;
import p040o.setLastBaselineToBottomHeight;
import p040o.updateFastPayProfile;

public class CustomCardInformationInput extends RelativeLayout {
    /* access modifiers changed from: private */
    public boolean IconCompatParcelizer;
    public CustomCardInformationInput$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ScbEditText cardNoInputField;
    @BindView
    protected ImageButton clearButton;
    @BindView
    public TextView headerLabel;
    @BindView
    protected TextView mErrorValidation;

    public CustomCardInformationInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81092131493335, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.clearButton.setFocusable(false);
        this.cardNoInputField.setLongClickable(false);
        this.cardNoInputField.setTextIsSelectable(false);
        this.cardNoInputField.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        this.cardNoInputField.setBlockInsertion(true);
        ScbEditText scbEditText = this.cardNoInputField;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(scbEditText, "XXXX XXXX XXXX XXXX", new getFastPayProfiles(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                String replace = str.replace(" ", "");
                CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.read(true);
                CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.write(replace);
            }

            public final void write(String str) {
                String replace = str.replace(" ", "");
                Integer valueOf = Integer.valueOf(replace.length());
                if ((CustomCardInformationInput.this.IconCompatParcelizer && !replace.isEmpty()) || (!CustomCardInformationInput.this.IconCompatParcelizer && replace.isEmpty())) {
                    boolean unused = CustomCardInformationInput.this.IconCompatParcelizer = replace.isEmpty();
                    CustomCardInformationInput$MediaBrowserCompat$ItemReceiver unused2 = CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver;
                    boolean unused3 = CustomCardInformationInput.this.IconCompatParcelizer;
                }
                if (valueOf.intValue() > 0) {
                    if (valueOf.intValue() == 6) {
                        CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.read(replace);
                        CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.read(false);
                    } else if (valueOf.intValue() < 6) {
                        CustomCardInformationInput.this.setIcon((int) R.drawable.ic_sample_card);
                        CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.read(false);
                        CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(false);
                    } else {
                        CustomCardInformationInput.this.setErrorValidationVisibility(8);
                        CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.write();
                        CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.read(false);
                    }
                    CustomCardInformationInput.this.clearButton.setVisibility(0);
                    return;
                }
                CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.read(replace);
                CustomCardInformationInput.this.clearButton.setVisibility(8);
                CustomCardInformationInput.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(replace.isEmpty());
            }
        };
        scbEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        this.cardNoInputField.setOnFocusChangeListener(new updateFastPayProfile(this));
    }

    public void setRegularText() {
        if (getContext() != null) {
            this.cardNoInputField.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/db_heavent_regular.ttf"));
        }
    }

    public void setStyle(int i, int i2) {
        if (getContext() != null) {
            this.cardNoInputField.setBackground(setLastBaselineToBottomHeight.write(getContext(), i));
            this.cardNoInputField.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i2));
        }
    }

    public void setCardNoEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.cardNoInputField.setOnEditorActionListener(onEditorActionListener);
    }

    public void setCardInputListener(CustomCardInformationInput$MediaBrowserCompat$ItemReceiver customCardInformationInput$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customCardInformationInput$MediaBrowserCompat$ItemReceiver;
    }

    public void setIcon(int i) {
        this.cardNoInputField.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public void setIcon(Drawable drawable) {
        this.cardNoInputField.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setLabel(String str) {
        this.headerLabel.setText(str);
    }

    public void setHint(String str) {
        this.cardNoInputField.setHint(str);
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z) {
        int i = 8;
        if (z) {
            ImageButton imageButton = this.clearButton;
            if (!TextUtils.isEmpty(this.cardNoInputField.getText())) {
                i = 0;
            }
            imageButton.setVisibility(i);
            return;
        }
        this.clearButton.setVisibility(8);
    }

    public void setErrorValidationVisibility(int i) {
        this.mErrorValidation.setVisibility(i);
    }

    public void setErrorInLine(int i) {
        this.mErrorValidation.setText(i);
    }

    public void setHeaderVisibility(int i) {
        this.headerLabel.setVisibility(i);
    }

    public void setCardNumber(String str) {
        this.cardNoInputField.setText(str);
    }

    @OnClick
    public void onClearButtonClick() {
        setErrorValidationVisibility(8);
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
        this.MediaBrowserCompat$CustomActionResultReceiver.read(false);
        this.cardNoInputField.setText("");
    }

    public void setOnFocusLostListener(Runnable runnable) {
        this.cardNoInputField.setOnFocusChangeListener(new EligibilityService(this, runnable));
    }

    public final /* synthetic */ void IconCompatParcelizer(Runnable runnable, boolean z) {
        int i = 8;
        if (!z) {
            this.clearButton.setVisibility(8);
            runnable.run();
            return;
        }
        ImageButton imageButton = this.clearButton;
        if (!TextUtils.isEmpty(this.cardNoInputField.getText())) {
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.clearButton.setVisibility(8);
    }
}

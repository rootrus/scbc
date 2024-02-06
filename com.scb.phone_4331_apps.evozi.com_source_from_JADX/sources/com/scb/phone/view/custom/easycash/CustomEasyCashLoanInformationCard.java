package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.RestrictedComponentContainer;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.publish;

public class CustomEasyCashLoanInformationCard extends LinearLayout {
    @BindView
    protected CustomSeparatedViews detailViews;
    @BindView
    protected ImageTextView loanName;
    @BindView
    protected CustomDeltaSliderPressed slider;

    public CustomEasyCashLoanInformationCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomEasyCashLoanInformationCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public CustomEasyCashLoanInformationCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81742131493400, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomEasyCashLoanInformationCard, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            CharSequence text = obtainStyledAttributes.getText(2);
            obtainStyledAttributes.recycle();
            ButterKnife.IconCompatParcelizer(this);
            setLoanImageSize(dimensionPixelSize);
            setLoanImage(drawable);
            setLoanName(text);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setLoanImage(Drawable drawable) {
        if (drawable != null) {
            this.loanName.setDrawable(drawable);
        }
    }

    public void setLoanImageFromUrl(String str) {
        if (str != null) {
            getContext();
            FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(this.loanName, str);
        }
    }

    public void setLoanImageSize(int i) {
        this.loanName.setImageSize(i);
    }

    public void setSlider(publish publish, final C5831xe6dd7682 customEasyCashLoanInformationCard$MediaBrowserCompat$ItemReceiver) {
        if (!(publish == null || customEasyCashLoanInformationCard$MediaBrowserCompat$ItemReceiver == null)) {
            this.slider.read(publish, (CustomDeltaSlider$MediaBrowserCompat$ItemReceiver) new CustomDeltaSlider$MediaBrowserCompat$ItemReceiver() {
                public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                }

                public final void IconCompatParcelizer(double d) {
                    C5831xe6dd7682.this.MediaBrowserCompat$CustomActionResultReceiver();
                }

                public final void MediaBrowserCompat$ItemReceiver(double d) {
                    C5831xe6dd7682.this.MediaBrowserCompat$CustomActionResultReceiver(d);
                }
            });
        }
        CustomDeltaSliderPressed customDeltaSliderPressed = this.slider;
        getResources();
        customDeltaSliderPressed.setBackgroundColor(-1);
    }

    public void setLoanDetails(List<RestrictedComponentContainer> list) {
        this.detailViews.IconCompatParcelizer(list, R.layout.f84732131493700);
    }

    public void setEnableSlider(boolean z) {
        this.slider.setEnable(z);
    }

    public void setLoanName(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            this.loanName.setText(charSequence);
        }
    }
}

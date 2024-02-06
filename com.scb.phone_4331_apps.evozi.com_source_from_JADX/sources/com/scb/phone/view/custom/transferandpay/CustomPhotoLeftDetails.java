package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomPhotoLeftDetails extends ConstraintLayout {
    private boolean IconCompatParcelizer;
    @BindView
    public View dividirFullView;
    @BindView
    public View dividirView;
    @BindView
    TextView fourthText;
    @BindView
    TextView header;
    @BindView
    ImageView imageView;
    @BindView
    TextView secondText;
    @BindView
    TextView thirdText;
    @BindView
    TextView title;

    public CustomPhotoLeftDetails(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomPhotoLeftDetails, 0, 0);
        this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(this.IconCompatParcelizer ? R.layout.f91922131494419 : R.layout.f91592131494386, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setImageView(String str) {
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.imageView, str);
    }

    public void setTitle(String str) {
        this.title.setVisibility(0);
        this.title.setText(str);
    }

    public void setSecondText(String str) {
        this.secondText.setVisibility(0);
        this.secondText.setText(str);
    }

    public void setThirdText(String str) {
        this.thirdText.setVisibility(0);
        this.thirdText.setText(str);
    }

    public void setFourth(String str) {
        this.fourthText.setVisibility(0);
        this.fourthText.setText(str);
    }

    public void setHeader(String str) {
        this.header.setText(str);
    }

    public void setLandscapeImageSize() {
        this.imageView.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.f73282131165583);
        this.imageView.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.f73292131165584);
        this.imageView.requestLayout();
    }
}

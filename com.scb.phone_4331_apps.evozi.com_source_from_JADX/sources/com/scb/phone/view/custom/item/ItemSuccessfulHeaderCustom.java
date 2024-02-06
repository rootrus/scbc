package com.scb.phone.view.custom.item;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.custom.common.MultiLineNoPaddingTextView;
import p040o.capSessionCount;
import p040o.setLastBaselineToBottomHeight;

public class ItemSuccessfulHeaderCustom extends ItemCustom<capSessionCount> {
    @BindView
    TextView componentExtra;
    @BindView
    ImageView componentIcon;
    @BindView
    TextView componentMoreExtra;
    @BindView
    TextView componentSubtitle;
    @BindView
    MultiLineNoPaddingTextView componentTitle;
    protected Context write;

    public ItemSuccessfulHeaderCustom(Context context) {
        super(context);
    }

    public ItemSuccessfulHeaderCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSuccessfulHeaderCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setUpWithDisplay(capSessionCount capsessioncount) {
        this.componentTitle.setText(capsessioncount.MediaDescriptionCompat);
        if (capsessioncount.MediaBrowserCompat$MediaItem > 0) {
            this.componentTitle.setTextColor(setLastBaselineToBottomHeight.read(getContext(), capsessioncount.MediaBrowserCompat$MediaItem));
        }
        if (capsessioncount.RatingCompat != null) {
            this.componentSubtitle.setVisibility(0);
            this.componentSubtitle.setText(capsessioncount.RatingCompat);
        }
        if (capsessioncount.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.componentExtra.setVisibility(0);
            this.componentExtra.setText(capsessioncount.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            this.componentExtra.setVisibility(8);
        }
        this.componentIcon.setImageDrawable(setLastBaselineToBottomHeight.write(getContext(), capsessioncount.read));
        if (capsessioncount.IconCompatParcelizer > 0) {
            this.componentIcon.setColorFilter(setLastBaselineToBottomHeight.read(getContext(), capsessioncount.IconCompatParcelizer), PorterDuff.Mode.SRC_ATOP);
        }
        if (capsessioncount.MediaMetadataCompat != null) {
            this.componentMoreExtra.setVisibility(0);
            this.componentMoreExtra.setText(capsessioncount.MediaMetadataCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.f81542131493380, this, true);
            this.write = context;
            ButterKnife.IconCompatParcelizer(this);
        }
    }
}

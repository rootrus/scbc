package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import p040o.capFileCount;
import p040o.setLastBaselineToBottomHeight;

public class ItemSimpleBottomCustom extends ItemCustom<capFileCount> {
    @BindView
    TextView componentBottom;
    @BindView
    TextView componentBottomExtra;
    @BindView
    TextView componentBottomExtraPSL;
    @BindView
    TextView componentBottomLong;
    @BindView
    TextView componentBottomPSL;
    @BindView
    TextView componentLabel;
    @BindView
    View iconAndLabelLayout;
    @BindView
    ImageView iconImage;
    @BindView
    TextView iconLabel;
    @BindView
    Space spaceBottom;
    @BindView
    Space spaceTop;

    public ItemSimpleBottomCustom(Context context) {
        super(context);
    }

    public ItemSimpleBottomCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSimpleBottomCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81502131493376, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setUpWithDisplay(capFileCount capfilecount) {
        if (capfilecount.RatingCompat == null || capfilecount.RatingCompat.isEmpty()) {
            this.componentLabel.setVisibility(8);
        } else {
            this.componentLabel.setVisibility(0);
            this.componentLabel.setText(capfilecount.RatingCompat);
        }
        if (capfilecount.read != null) {
            if (capfilecount.f2804x50fd9e4a) {
                this.componentBottomPSL.setVisibility(0);
                this.componentBottomPSL.setText(capfilecount.read);
                this.componentBottomPSL.setPadding(0, 0, 0, 0);
            } else {
                this.componentBottom.setVisibility(0);
                this.componentBottom.setText(capfilecount.read);
            }
        }
        if (capfilecount.MediaBrowserCompat$ItemReceiver != null) {
            if (capfilecount.f2804x50fd9e4a) {
                this.componentBottomExtraPSL.setVisibility(0);
                this.componentBottomExtraPSL.setText(capfilecount.MediaBrowserCompat$ItemReceiver);
            } else {
                this.componentBottomExtra.setVisibility(0);
                this.componentBottomExtra.setText(capfilecount.MediaBrowserCompat$ItemReceiver);
            }
        }
        if (capfilecount.IconCompatParcelizer != null) {
            this.componentBottomLong.setVisibility(0);
            this.componentBottomLong.setText(capfilecount.IconCompatParcelizer);
        }
        if (capfilecount.MediaMetadataCompat > 0 && capfilecount.MediaBrowserCompat$SearchResultReceiver != null) {
            this.iconAndLabelLayout.setVisibility(0);
            this.iconImage.setImageResource(capfilecount.MediaMetadataCompat);
            this.iconLabel.setText(capfilecount.MediaBrowserCompat$SearchResultReceiver);
        }
        if (capfilecount.MediaBrowserCompat$MediaItem) {
            this.spaceBottom.setVisibility(8);
        }
        if (capfilecount.MediaDescriptionCompat) {
            this.spaceTop.setVisibility(8);
        }
        if (capfilecount.MediaBrowserCompat$CustomActionResultReceiver != 0) {
            this.componentBottom.setTextColor(setLastBaselineToBottomHeight.read(getContext(), capfilecount.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }
}

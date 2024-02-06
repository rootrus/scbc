package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.UserMetadata;

public class ItemPhotoDetailCustom extends ItemCustom<UserMetadata> {
    @BindView
    TextView componentExtra;
    @BindView
    TextView componentExtraDetails;
    @BindView
    TextView componentLabel;
    @BindView
    ImageView photo;

    public ItemPhotoDetailCustom(Context context) {
        super(context);
    }

    public ItemPhotoDetailCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPhotoDetailCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setUpWithDisplay(UserMetadata userMetadata) {
        this.componentLabel.setText(userMetadata.RatingCompat);
        this.componentExtra.setText(userMetadata.MediaBrowserCompat$SearchResultReceiver);
        if (userMetadata.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.componentExtraDetails.setText(userMetadata.MediaBrowserCompat$CustomActionResultReceiver);
            this.componentExtraDetails.setVisibility(0);
        }
        String str = userMetadata.read;
        if (!str.isEmpty()) {
            getContext();
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.photo, str);
            this.photo.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81472131493373, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}

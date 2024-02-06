package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import p040o.race;
import p040o.setLastBaselineToBottomHeight;

public class ItemSimpleRightFocusCustom extends ItemCustom<race> {
    @BindView
    TextView componentExtra;
    @BindView
    TextView componentLabel;

    public ItemSimpleRightFocusCustom(Context context) {
        super(context);
    }

    public ItemSimpleRightFocusCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSimpleRightFocusCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81522131493378, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setUpWithDisplay(race race) {
        if (race.MediaMetadataCompat) {
            this.componentExtra.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
        }
        if (race.MediaBrowserCompat$MediaItem > 0) {
            this.componentLabel.setTextColor(race.MediaBrowserCompat$MediaItem);
        }
        this.componentLabel.setText(race.RatingCompat);
        this.componentExtra.setText(race.MediaBrowserCompat$SearchResultReceiver);
    }
}

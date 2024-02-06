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

public class ItemSimpleCustom extends ItemCustom<race> {
    @BindView
    TextView componentExtra;
    @BindView
    TextView componentLabel;

    public ItemSimpleCustom(Context context) {
        super(context);
    }

    public ItemSimpleCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSimpleCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81512131493377, this, true);
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

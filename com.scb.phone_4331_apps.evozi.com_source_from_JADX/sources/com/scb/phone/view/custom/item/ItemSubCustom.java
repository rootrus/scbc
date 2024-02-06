package com.scb.phone.view.custom.item;

import android.content.Context;
import android.view.LayoutInflater;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ForwardingFuture;
import p040o.onGetStartedClick;
import p040o.race;
import p040o.setLastBaselineToBottomHeight;

public final class ItemSubCustom extends ItemRevampSimpleCustom {
    public final /* bridge */ /* synthetic */ void setUpWithDisplay(ForwardingFuture forwardingFuture) {
        setUpWithDisplay((race) forwardingFuture);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemSubCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setUpWithDisplay(race race) {
        super.setUpWithDisplay(race);
        if (race != null && race.MediaMetadataCompat) {
            this.componentLabel.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81532131493379, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}

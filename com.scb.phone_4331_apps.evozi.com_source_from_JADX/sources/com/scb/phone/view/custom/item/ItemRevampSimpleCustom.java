package com.scb.phone.view.custom.item;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Space;
import butterknife.BindView;
import p040o.ForwardingFuture;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;
import p040o.race;

public class ItemRevampSimpleCustom extends ItemSimpleCustom {
    @BindView
    protected LinearLayout layoutCustomSimpleItem;
    @BindView
    protected Space spaceBottom;
    @BindView
    protected Space spaceTop;

    public /* bridge */ /* synthetic */ void setUpWithDisplay(ForwardingFuture forwardingFuture) {
        setUpWithDisplay((race) forwardingFuture);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ItemRevampSimpleCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    public void setUpWithDisplay(race race) {
        super.setUpWithDisplay(race);
        if (race != null) {
            if (race.MediaSessionCompat$Token) {
                Space space = this.spaceTop;
                if (space == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("spaceTop");
                }
                space.setVisibility(8);
            }
            if (race.MediaDescriptionCompat) {
                Space space2 = this.spaceBottom;
                if (space2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("spaceBottom");
                }
                space2.setVisibility(8);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            Space space = this.spaceTop;
            if (space == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spaceTop");
            }
            space.setVisibility(8);
            LinearLayout linearLayout = this.layoutCustomSimpleItem;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutCustomSimpleItem");
            }
            linearLayout.setVisibility(8);
        }
    }
}

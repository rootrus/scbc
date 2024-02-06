package androidx.appcompat.widget;

import android.view.View;
import p040o.setSwitchPadding;
import p040o.setSwitchTypeface;

public class AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver implements setSwitchTypeface {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver = false;
    final /* synthetic */ AbsActionBarView read;

    protected AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver(AbsActionBarView absActionBarView) {
        this.read = absActionBarView;
    }

    public final AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver read(setSwitchPadding setswitchpadding, int i) {
        this.read.RatingCompat = setswitchpadding;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        return this;
    }

    public final void write(View view) {
        AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver.super.setVisibility(0);
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.read.RatingCompat = null;
            AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver.super.setVisibility(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        this.MediaBrowserCompat$ItemReceiver = true;
    }
}

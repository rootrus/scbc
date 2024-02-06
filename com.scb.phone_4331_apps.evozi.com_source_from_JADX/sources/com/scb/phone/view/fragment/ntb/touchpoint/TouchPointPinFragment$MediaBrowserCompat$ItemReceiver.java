package com.scb.phone.view.fragment.ntb.touchpoint;

import android.view.View;
import android.widget.ImageView;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.onGetStartedClick;

public final class TouchPointPinFragment$MediaBrowserCompat$ItemReceiver implements FragmentBuilder_BindEkycFragment {
    private /* synthetic */ TouchPointPinFragment read;

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    TouchPointPinFragment$MediaBrowserCompat$ItemReceiver(TouchPointPinFragment touchPointPinFragment) {
        this.read = touchPointPinFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
        onGetStartedClick.write((Object) exc, "exception");
        ImageView imageView = this.read.pinAvatar;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pinAvatar");
        }
        View view = imageView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(8);
    }
}

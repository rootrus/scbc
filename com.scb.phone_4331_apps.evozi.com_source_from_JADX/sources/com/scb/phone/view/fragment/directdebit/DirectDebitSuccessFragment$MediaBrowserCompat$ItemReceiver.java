package com.scb.phone.view.fragment.directdebit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import java.util.List;
import p040o.ForwardingFuture;
import p040o.Iterables;
import p040o.callTask;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class DirectDebitSuccessFragment$MediaBrowserCompat$ItemReceiver extends PurchaseSuccessFragment.PurchaseScreenshotDisplay {
    private final Iterables.C352414 MediaBrowserCompat$MediaItem;
    private final standardStartAndWait read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectDebitSuccessFragment$MediaBrowserCompat$ItemReceiver(String str, standardStartAndWait standardstartandwait, boolean z, Iterables.C352414 r12, boolean z2) {
        super(R.layout.f91692131494396, str, standardstartandwait, z, r12, z2);
        onGetStartedClick.write((Object) str, "filename");
        onGetStartedClick.write((Object) r12, "factory");
        this.read = standardstartandwait;
        this.MediaBrowserCompat$MediaItem = r12;
    }

    public final void read(View view) {
        List<ForwardingFuture> list;
        standardStartAndWait standardstartandwait = this.read;
        String str = null;
        if (standardstartandwait != null) {
            list = standardstartandwait.MediaDescriptionCompat;
        } else {
            list = null;
        }
        MediaBrowserCompat$CustomActionResultReceiver(list, view != null ? view.getContext() : null);
        ForwardingFuture calltask = new callTask(true);
        ItemCustom MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(view != null ? view.getContext() : null, calltask);
        MediaBrowserCompat$CustomActionResultReceiver.setUpWithDisplay(calltask);
        this.container.addView(MediaBrowserCompat$CustomActionResultReceiver);
        this.container.addView(LayoutInflater.from(view != null ? view.getContext() : null).inflate(R.layout.f91742131494401, (ViewGroup) null));
        standardStartAndWait standardstartandwait2 = this.read;
        if (standardstartandwait2 != null) {
            str = standardstartandwait2.IconCompatParcelizer;
        }
        read(str);
    }
}

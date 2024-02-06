package com.scb.phone.view.adapter.investment.discover;

import android.net.Uri;
import com.squareup.picasso.Picasso;
import p040o.CrashlyticsUncaughtExceptionHandler;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.adapter.investment.discover.HighlightRecycleAdapter$MyViewHolder$MediaBrowserCompat$ItemReceiver */
public final class C5765x7bbeeed implements FragmentBuilder_BindEkycFragment {
    private /* synthetic */ CrashlyticsUncaughtExceptionHandler write;

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    C5765x7bbeeed(CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler) {
        this.write = crashlyticsUncaughtExceptionHandler;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
        Uri parse;
        onGetStartedClick.write((Object) exc, "exception");
        Picasso read = Picasso.read();
        String str = this.write.MediaBrowserCompat$ItemReceiver;
        if (str != null && (parse = Uri.parse(str)) != null) {
            read.read.MediaBrowserCompat$ItemReceiver(parse.toString());
        }
    }
}

package p040o;

import android.view.View;
import p040o.getNCBInquiry;

/* renamed from: o.getNCBInquiry$MediaBrowserCompat$ItemReceiver */
final class getNCBInquiry$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ chain MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ getNCBInquiry.write read;

    getNCBInquiry$MediaBrowserCompat$ItemReceiver(getNCBInquiry.write write, chain chain, int i) {
        this.read = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = chain;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        this.read.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}

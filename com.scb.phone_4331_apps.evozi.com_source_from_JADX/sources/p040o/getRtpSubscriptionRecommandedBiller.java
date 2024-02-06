package p040o;

import com.scb.phone.view.adapter.BaseHorizontalBubbleAdapter;
import p040o.dispatchCrashlyticsOriginEvent;

/* renamed from: o.getRtpSubscriptionRecommandedBiller */
public final class getRtpSubscriptionRecommandedBiller extends BaseHorizontalBubbleAdapter {
    private dispatchCrashlyticsOriginEvent MediaMetadataCompat;
    private dispatchCrashlyticsOriginEvent.write read;

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == this.MediaBrowserCompat$ItemReceiver) {
            return 0;
        }
        return (this.read == null || !read(this.write.get(i))) ? 2 : 1;
    }

    public final void IconCompatParcelizer(Double d) {
        boolean z = false;
        int i = 0;
        while (d != null && !z && i < this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.size()) {
            dispatchCrashlyticsOriginEvent.write write = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.get(i);
            if (write.read.doubleValue() <= d.doubleValue() && d.doubleValue() <= write.MediaBrowserCompat$CustomActionResultReceiver.doubleValue()) {
                read(write);
                z = true;
            }
            i++;
        }
        if (!z) {
            read((dispatchCrashlyticsOriginEvent.write) null);
        }
        this.IconCompatParcelizer.write();
    }

    private void read(dispatchCrashlyticsOriginEvent.write write) {
        this.read = write;
        if (this.MediaBrowserCompat$ItemReceiver != -1 && !read(this.write.get(this.MediaBrowserCompat$ItemReceiver))) {
            this.MediaBrowserCompat$ItemReceiver = -1;
        }
    }

    private boolean read(Integer num) {
        if (this.read == null) {
            return false;
        }
        boolean z = false;
        int i = 0;
        while (!z && i < this.read.MediaBrowserCompat$ItemReceiver.size()) {
            z = this.read.MediaBrowserCompat$ItemReceiver.get(i) == num;
            i++;
        }
        return z;
    }

    public final void read() {
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.IconCompatParcelizer.write();
    }

    public getRtpSubscriptionRecommandedBiller(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent, BaseHorizontalBubbleAdapter.IconCompatParcelizer iconCompatParcelizer) {
        super(dispatchcrashlyticsoriginevent.read, iconCompatParcelizer);
        this.MediaMetadataCompat = dispatchcrashlyticsoriginevent;
        IconCompatParcelizer((Double) null);
    }
}

package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.addImageClassificationCompletedEventListener */
public final /* synthetic */ class addImageClassificationCompletedEventListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ BackgroundPriorityRunnable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ addImageClassificationCompletedEventListener(BackgroundPriorityRunnable backgroundPriorityRunnable) {
        this.MediaBrowserCompat$ItemReceiver = backgroundPriorityRunnable;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.PlaybackStateCompat.CustomAction) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}

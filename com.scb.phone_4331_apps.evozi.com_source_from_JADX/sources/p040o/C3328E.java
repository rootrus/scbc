package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.E */
public final /* synthetic */ class C3328E implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageBitmapInternal IconCompatParcelizer;

    public /* synthetic */ C3328E(setImageBitmapInternal setimagebitmapinternal) {
        this.IconCompatParcelizer = setimagebitmapinternal;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.IconCompatParcelizer;
        CheckExtractActivity_MembersInjector.setItemInvoker setiteminvoker = (CheckExtractActivity_MembersInjector.setItemInvoker) obj;
        setiteminvoker.read(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) setimagebitmapinternal.read.MediaBrowserCompat$CustomActionResultReceiver.get(0)));
        setiteminvoker.MediaBrowserCompat$ItemReceiver((int) setimagebitmapinternal.MediaBrowserCompat$MediaItem);
        setiteminvoker.MediaBrowserCompat$ItemReceiver(setimagebitmapinternal.MediaBrowserCompat$MediaItem);
        setiteminvoker.IconCompatParcelizer(setimagebitmapinternal.MediaMetadataCompat);
        setiteminvoker.MediaBrowserCompat$CustomActionResultReceiver(setimagebitmapinternal.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
    }
}

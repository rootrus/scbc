package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.C */
public final /* synthetic */ class C3138C implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageBitmapInternal IconCompatParcelizer;
    private final /* synthetic */ access$1400 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C3138C(setImageBitmapInternal setimagebitmapinternal, access$1400 access_1400) {
        this.IconCompatParcelizer = setimagebitmapinternal;
        this.MediaBrowserCompat$CustomActionResultReceiver = access_1400;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.IconCompatParcelizer;
        access$1400 access_1400 = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckExtractActivity_MembersInjector.setItemInvoker setiteminvoker = (CheckExtractActivity_MembersInjector.setItemInvoker) obj;
        setiteminvoker.read(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) setimagebitmapinternal.read.MediaBrowserCompat$CustomActionResultReceiver.get(0)));
        setiteminvoker.MediaBrowserCompat$ItemReceiver(Double.valueOf(setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver).doubleValue());
        setiteminvoker.IconCompatParcelizer(setimagebitmapinternal.write);
        setiteminvoker.MediaBrowserCompat$CustomActionResultReceiver(access_1400.MediaBrowserCompat$ItemReceiver);
    }
}

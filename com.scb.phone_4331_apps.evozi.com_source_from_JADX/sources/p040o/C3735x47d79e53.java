package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.PreJava9ReflectionAccessor$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3735x47d79e53 implements Runnable {
    private /* synthetic */ PreJava9ReflectionAccessor MediaBrowserCompat$CustomActionResultReceiver;

    public C3735x47d79e53(PreJava9ReflectionAccessor preJava9ReflectionAccessor) {
        this.MediaBrowserCompat$CustomActionResultReceiver = preJava9ReflectionAccessor;
    }

    public final void run() {
        PreJava9ReflectionAccessor preJava9ReflectionAccessor = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C37362.MediaBrowserCompat$CustomActionResultReceiver;
        if (preJava9ReflectionAccessor.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(preJava9ReflectionAccessor.RatingCompat);
        }
    }
}

package p040o;

import p040o.LogFileManager;
import p040o.writeUInt64NoTag;

/* renamed from: o.ReflectionAccessor */
public final class ReflectionAccessor extends RttiJsonBill<proxyGetIExceptionResponseDeserializerOnDevice> {
    public LogFileManager.DirectoryProvider MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.ReflectionAccessor$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIExceptionResponseDeserializerOnDevice> {
        private /* synthetic */ ReflectionAccessor MediaBrowserCompat$ItemReceiver;

        public read(ReflectionAccessor reflectionAccessor) {
            this.MediaBrowserCompat$ItemReceiver = reflectionAccessor;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((proxyGetIExceptionResponseDeserializerOnDevice) obj).write(ReflectionAccessor.write(this.MediaBrowserCompat$ItemReceiver));
        }
    }

    public static final /* synthetic */ LogFileManager.DirectoryProvider write(ReflectionAccessor reflectionAccessor) {
        LogFileManager.DirectoryProvider directoryProvider = reflectionAccessor.MediaBrowserCompat$ItemReceiver;
        if (directoryProvider == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preloadCheckDisplay");
        }
        return directoryProvider;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ReflectionAccessor(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    /* renamed from: o.ReflectionAccessor$write */
    public static final class write implements Runnable {
        private /* synthetic */ ReflectionAccessor write;

        public write(ReflectionAccessor reflectionAccessor) {
            this.write = reflectionAccessor;
        }

        public final void run() {
            ReflectionAccessor reflectionAccessor = this.write;
            writeUInt64NoTag.IconCompatParcelizer read = new read(reflectionAccessor);
            if (reflectionAccessor.RatingCompat != null) {
                read.IconCompatParcelizer(reflectionAccessor.RatingCompat);
            }
        }
    }
}

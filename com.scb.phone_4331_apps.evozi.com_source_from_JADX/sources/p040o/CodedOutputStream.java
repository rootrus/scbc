package p040o;

import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.CodedOutputStream */
public final /* synthetic */ class CodedOutputStream implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ CodedOutputStream write = new CodedOutputStream();

    private /* synthetic */ CodedOutputStream() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).write(Iterables.C35273.read.transparent);
    }

    /* renamed from: o.CodedOutputStream$OutOfSpaceException */
    public abstract class OutOfSpaceException<V extends C1152x3c012820> extends writeUInt64NoTag<V> {
        public String IconCompatParcelizer = "";
        public String write = "";

        public abstract Iterables.C35317<?, ?> IconCompatParcelizer();

        public abstract void IconCompatParcelizer(String str);

        public abstract void MediaBrowserCompat$CustomActionResultReceiver();

        /* renamed from: o.CodedOutputStream$OutOfSpaceException$IconCompatParcelizer */
        public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<V> {
            public static final IconCompatParcelizer read = new IconCompatParcelizer();

            IconCompatParcelizer() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C1152x3c012820 checkCaptureModule_GetICheckDetectorFactory$MediaBrowserCompat$ItemReceiver = (C1152x3c012820) obj;
                checkCaptureModule_GetICheckDetectorFactory$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                checkCaptureModule_GetICheckDetectorFactory$MediaBrowserCompat$ItemReceiver.write();
            }
        }

        /* renamed from: o.CodedOutputStream$OutOfSpaceException$read */
        public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<V> {
            public static final read IconCompatParcelizer = new read();

            read() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C1152x3c012820) obj).MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        /* renamed from: o.CodedOutputStream$OutOfSpaceException$write */
        public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<V> {
            public static final write read = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C1152x3c012820) obj).write();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OutOfSpaceException(RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            Iterables.C35317<?, ?> IconCompatParcelizer2 = IconCompatParcelizer();
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = IconCompatParcelizer2.write;
            if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
                IconCompatParcelizer2.IconCompatParcelizer = false;
                bulkTransferDeepLinkActivity.dispose();
            }
        }

        public void onDestroy() {
            IconCompatParcelizer().IconCompatParcelizer();
            super.onDestroy();
        }
    }
}

package p039io.realm.internal;

import p040o.HmlNTBAdditionalDocumentActivity_ViewBinding;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.OsObjectSchemaInfo */
public class OsObjectSchemaInfo implements HmlNTBMonthlyIncomeAboutActivity {
    private static final long IconCompatParcelizer = nativeGetFinalizerPtr();
    public long write;

    /* access modifiers changed from: private */
    public static native void nativeAddProperties(long j, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str);

    private static native long nativeGetFinalizerPtr();

    public static native long nativeGetMaxColumnIndex(long j);

    public static native long nativeGetProperty(long j, String str);

    /* synthetic */ OsObjectSchemaInfo(String str, byte b) {
        this(str);
    }

    /* renamed from: io.realm.internal.OsObjectSchemaInfo$write */
    public static class write {
        private final String IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver = 0;
        private int MediaBrowserCompat$ItemReceiver = 0;
        private final long[] read;
        private final long[] write;

        public write(String str, int i) {
            this.IconCompatParcelizer = str;
            this.read = new long[i];
            this.write = new long[0];
        }

        public final write MediaBrowserCompat$CustomActionResultReceiver(String str, HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str, Property.write(hmlNTBAdditionalDocumentActivity_ViewBinding, false), false, false);
            long[] jArr = this.read;
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            jArr[i] = nativeCreatePersistedProperty;
            this.MediaBrowserCompat$CustomActionResultReceiver = i + 1;
            return this;
        }

        public final OsObjectSchemaInfo write() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == -1 || this.MediaBrowserCompat$ItemReceiver == -1) {
                throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
            }
            OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.IconCompatParcelizer, (byte) 0);
            OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.write, this.read, this.write);
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            this.MediaBrowserCompat$ItemReceiver = -1;
            return osObjectSchemaInfo;
        }
    }

    private OsObjectSchemaInfo(String str) {
        this(nativeCreateRealmObjectSchema(str));
    }

    public OsObjectSchemaInfo(long j) {
        this.write = j;
        new NativeObjectReference(HmlNTBOperatingAccountActivity.write, this, HmlNTBOperatingAccountActivity.read);
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public final long read() {
        return IconCompatParcelizer;
    }
}

package p039io.realm.internal;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p039io.realm.CompactOnLaunchCallback;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.log.RealmLog;
import p040o.HmlNTBAdditionalDocumentActivity;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;
import p040o.HmlNTBPinDisabledActivity_ViewBinding;

/* renamed from: io.realm.internal.OsRealmConfig */
public class OsRealmConfig implements HmlNTBMonthlyIncomeAboutActivity {
    private static final long write = nativeGetFinalizerPtr();
    final long IconCompatParcelizer;
    final HmlNTBOperatingAccountActivity MediaBrowserCompat$ItemReceiver;

    private static native long nativeCreate(String str, String str2, boolean z, boolean z2);

    private static native String nativeCreateAndSetSyncConfig(long j, String str, String str2, String str3, String str4, boolean z, byte b, String str5, String str6, String[] strArr, byte b2);

    private static native void nativeEnableChangeNotification(long j, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j, byte[] bArr);

    private static native void nativeSetInMemory(long j, boolean z);

    private native void nativeSetInitializationCallback(long j, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j, byte b, long j2, long j3, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j, byte b, String str, int i);

    private static native void nativeSetSyncConfigSslSettings(long j, boolean z, String str);

    /* synthetic */ OsRealmConfig(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, byte b) {
        this(hmlNTBAdditionalDocumentActivity, str, z, osSchemaInfo, migrationCallback, initializationCallback);
    }

    /* renamed from: io.realm.internal.OsRealmConfig$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        FULL(0),
        MEM_ONLY(1);
        
        final int value;

        private IconCompatParcelizer(int i) {
            this.value = i;
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$write */
    public static class write {
        public String IconCompatParcelizer = "";
        public boolean MediaBrowserCompat$CustomActionResultReceiver = false;
        public OsSchemaInfo MediaBrowserCompat$ItemReceiver = null;
        private HmlNTBAdditionalDocumentActivity MediaBrowserCompat$MediaItem;
        public OsSharedRealm.InitializationCallback read = null;
        public OsSharedRealm.MigrationCallback write = null;

        public write(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
            this.MediaBrowserCompat$MediaItem = hmlNTBAdditionalDocumentActivity;
        }

        public final OsRealmConfig IconCompatParcelizer() {
            return new OsRealmConfig(this.MediaBrowserCompat$MediaItem, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.write, this.read, (byte) 0);
        }
    }

    private OsRealmConfig(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback) {
        URI uri;
        URI uri2;
        HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity2 = hmlNTBAdditionalDocumentActivity;
        OsSchemaInfo osSchemaInfo2 = osSchemaInfo;
        OsSharedRealm.InitializationCallback initializationCallback2 = initializationCallback;
        this.MediaBrowserCompat$ItemReceiver = new HmlNTBOperatingAccountActivity();
        this.IconCompatParcelizer = nativeCreate(hmlNTBAdditionalDocumentActivity2.IconCompatParcelizer, str, false, true);
        new NativeObjectReference(HmlNTBOperatingAccountActivity.write, this, HmlNTBOperatingAccountActivity.read);
        HmlNTBPinDisabledActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
        Object[] MediaBrowserCompat$CustomActionResultReceiver = HmlNTBPinDisabledActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
        String str2 = (String) MediaBrowserCompat$CustomActionResultReceiver[0];
        String str3 = (String) MediaBrowserCompat$CustomActionResultReceiver[1];
        String str4 = (String) MediaBrowserCompat$CustomActionResultReceiver[2];
        String str5 = (String) MediaBrowserCompat$CustomActionResultReceiver[3];
        boolean equals = Boolean.TRUE.equals(MediaBrowserCompat$CustomActionResultReceiver[4]);
        String str6 = (String) MediaBrowserCompat$CustomActionResultReceiver[5];
        Byte b = (Byte) MediaBrowserCompat$CustomActionResultReceiver[6];
        boolean equals2 = Boolean.TRUE.equals(MediaBrowserCompat$CustomActionResultReceiver[7]);
        String str7 = (String) MediaBrowserCompat$CustomActionResultReceiver[8];
        String str8 = (String) MediaBrowserCompat$CustomActionResultReceiver[9];
        Byte b2 = (Byte) MediaBrowserCompat$CustomActionResultReceiver[11];
        Map map = (Map) MediaBrowserCompat$CustomActionResultReceiver[10];
        String[] strArr = new String[(map != null ? map.size() << 1 : 0)];
        if (map != null) {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i] = (String) entry.getKey();
                strArr[i + 1] = (String) entry.getValue();
                i += 2;
            }
        }
        byte[] bArr = hmlNTBAdditionalDocumentActivity2.MediaBrowserCompat$MediaItem;
        byte[] copyOf = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        if (copyOf != null) {
            nativeSetEncryptionKey(this.IconCompatParcelizer, copyOf);
        }
        nativeSetInMemory(this.IconCompatParcelizer, hmlNTBAdditionalDocumentActivity2.MediaBrowserCompat$CustomActionResultReceiver == IconCompatParcelizer.MEM_ONLY);
        nativeEnableChangeNotification(this.IconCompatParcelizer, z);
        OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver osRealmConfig$MediaBrowserCompat$CustomActionResultReceiver = OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver.SCHEMA_MODE_MANUAL;
        if (hmlNTBAdditionalDocumentActivity2.MediaMetadataCompat) {
            osRealmConfig$MediaBrowserCompat$CustomActionResultReceiver = OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver.SCHEMA_MODE_READONLY;
        } else if (str3 != null) {
            osRealmConfig$MediaBrowserCompat$CustomActionResultReceiver = OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver.SCHEMA_MODE_ADDITIVE;
        } else if (hmlNTBAdditionalDocumentActivity2.read) {
            osRealmConfig$MediaBrowserCompat$CustomActionResultReceiver = OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver.SCHEMA_MODE_RESET_FILE;
        }
        String[] strArr2 = strArr;
        String str9 = str6;
        nativeSetSchemaConfig(this.IconCompatParcelizer, osRealmConfig$MediaBrowserCompat$CustomActionResultReceiver.value, hmlNTBAdditionalDocumentActivity2.MediaSessionCompat$Token, osSchemaInfo2 == null ? 0 : osSchemaInfo2.IconCompatParcelizer, migrationCallback);
        CompactOnLaunchCallback compactOnLaunchCallback = hmlNTBAdditionalDocumentActivity2.write;
        if (compactOnLaunchCallback != null) {
            nativeSetCompactOnLaunchCallback(this.IconCompatParcelizer, compactOnLaunchCallback);
        }
        if (initializationCallback2 != null) {
            nativeSetInitializationCallback(this.IconCompatParcelizer, initializationCallback2);
        }
        if (str3 != null) {
            boolean z2 = equals;
            String nativeCreateAndSetSyncConfig = nativeCreateAndSetSyncConfig(this.IconCompatParcelizer, str3, str4, str2, str5, equals2, b.byteValue(), str7, str8, strArr2, b2.byteValue());
            try {
                uri = new URI(nativeCreateAndSetSyncConfig);
            } catch (URISyntaxException e) {
                RealmLog.MediaBrowserCompat$CustomActionResultReceiver(e, "Cannot create a URI from the Realm URL address", new Object[0]);
                uri = null;
            }
            nativeSetSyncConfigSslSettings(this.IconCompatParcelizer, z2, str9);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (uri != null && proxySelector != null) {
                try {
                    uri2 = new URI(nativeCreateAndSetSyncConfig.replaceFirst("realm", "http"));
                } catch (URISyntaxException e2) {
                    RealmLog.MediaBrowserCompat$CustomActionResultReceiver(e2, "Cannot create a URI from the Realm URL address", new Object[0]);
                    uri2 = null;
                }
                List<Proxy> select = proxySelector.select(uri2);
                if (select != null && !select.isEmpty()) {
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b3 = C11253.write[proxy.type().ordinal()] == 1 ? (byte) 0 : -1;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                nativeSetSyncConfigProxySettings(this.IconCompatParcelizer, b3, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unsupported proxy socket address type: ");
                            sb.append(address.getClass().getName());
                            RealmLog.MediaBrowserCompat$ItemReceiver(sb.toString(), new Object[0]);
                            return;
                        }
                        RealmLog.MediaBrowserCompat$ItemReceiver("SOCKS proxies are not supported.", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$3 */
    static /* synthetic */ class C11253 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            write = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return write;
    }
}

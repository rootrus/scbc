package p039io.realm.internal;

/* renamed from: io.realm.internal.OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver */
public enum OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver {
    SCHEMA_MODE_AUTOMATIC((byte) 0),
    SCHEMA_MODE_IMMUTABLE((byte) 1),
    SCHEMA_MODE_READONLY((byte) 2),
    SCHEMA_MODE_RESET_FILE((byte) 3),
    SCHEMA_MODE_ADDITIVE((byte) 4),
    SCHEMA_MODE_MANUAL((byte) 5);
    
    final byte value;

    private OsRealmConfig$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this.value = b;
    }
}

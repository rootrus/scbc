package p039io.realm.internal;

import java.util.Date;
import p040o.HmlNTBAdditionalDocumentActivity_ViewBinding;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.UncheckedRow */
public class UncheckedRow implements HmlNTBMonthlyIncomeAboutActivity, Row {
    private static final long write = nativeGetFinalizerPtr();
    private final Table MediaBrowserCompat$CustomActionResultReceiver;
    final long MediaBrowserCompat$ItemReceiver;

    private static native long nativeGetFinalizerPtr();

    /* access modifiers changed from: protected */
    public native boolean nativeGetBoolean(long j, long j2);

    /* access modifiers changed from: protected */
    public native byte[] nativeGetByteArray(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetColumnCount(long j);

    /* access modifiers changed from: protected */
    public native long nativeGetColumnIndex(long j, String str);

    /* access modifiers changed from: protected */
    public native String nativeGetColumnName(long j, long j2);

    /* access modifiers changed from: protected */
    public native int nativeGetColumnType(long j, long j2);

    /* access modifiers changed from: protected */
    public native double nativeGetDouble(long j, long j2);

    /* access modifiers changed from: protected */
    public native float nativeGetFloat(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetIndex(long j);

    /* access modifiers changed from: protected */
    public native long nativeGetLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetLong(long j, long j2);

    /* access modifiers changed from: protected */
    public native String nativeGetString(long j, long j2);

    /* access modifiers changed from: protected */
    public native long nativeGetTimestamp(long j, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeHasColumn(long j, String str);

    /* access modifiers changed from: protected */
    public native boolean nativeIsAttached(long j);

    /* access modifiers changed from: protected */
    public native boolean nativeIsNull(long j, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeIsNullLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native void nativeNullifyLink(long j, long j2);

    /* access modifiers changed from: protected */
    public native void nativeSetBoolean(long j, long j2, boolean z);

    /* access modifiers changed from: protected */
    public native void nativeSetByteArray(long j, long j2, byte[] bArr);

    /* access modifiers changed from: protected */
    public native void nativeSetDouble(long j, long j2, double d);

    /* access modifiers changed from: protected */
    public native void nativeSetFloat(long j, long j2, float f);

    /* access modifiers changed from: protected */
    public native void nativeSetLink(long j, long j2, long j3);

    /* access modifiers changed from: protected */
    public native void nativeSetLong(long j, long j2, long j3);

    /* access modifiers changed from: protected */
    public native void nativeSetNull(long j, long j2);

    /* access modifiers changed from: protected */
    public native void nativeSetString(long j, long j2, String str);

    /* access modifiers changed from: protected */
    public native void nativeSetTimestamp(long j, long j2, long j3);

    public UncheckedRow(HmlNTBOperatingAccountActivity hmlNTBOperatingAccountActivity, Table table, long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = table;
        this.MediaBrowserCompat$ItemReceiver = j;
        new NativeObjectReference(hmlNTBOperatingAccountActivity, this, HmlNTBOperatingAccountActivity.read);
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final long read() {
        return write;
    }

    public long getColumnCount() {
        return nativeGetColumnCount(this.MediaBrowserCompat$ItemReceiver);
    }

    public String getColumnName(long j) {
        return nativeGetColumnName(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public long getColumnIndex(String str) {
        if (str != null) {
            return nativeGetColumnIndex(this.MediaBrowserCompat$ItemReceiver, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public HmlNTBAdditionalDocumentActivity_ViewBinding getColumnType(long j) {
        return HmlNTBAdditionalDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(nativeGetColumnType(this.MediaBrowserCompat$ItemReceiver, j));
    }

    public Table getTable() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public long getIndex() {
        return nativeGetIndex(this.MediaBrowserCompat$ItemReceiver);
    }

    public long getLong(long j) {
        return nativeGetLong(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public boolean getBoolean(long j) {
        return nativeGetBoolean(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public float getFloat(long j) {
        return nativeGetFloat(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public double getDouble(long j) {
        return nativeGetDouble(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public Date getDate(long j) {
        return new Date(nativeGetTimestamp(this.MediaBrowserCompat$ItemReceiver, j));
    }

    public String getString(long j) {
        return nativeGetString(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public byte[] getBinaryByteArray(long j) {
        return nativeGetByteArray(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public long getLink(long j) {
        return nativeGetLink(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public boolean isNullLink(long j) {
        return nativeIsNullLink(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public OsList getModelList(long j) {
        return new OsList(this, j);
    }

    public OsList getValueList(long j, HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding) {
        return new OsList(this, j);
    }

    public void setLong(long j, long j2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetLong(this.MediaBrowserCompat$ItemReceiver, j, j2);
    }

    public void setBoolean(long j, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetBoolean(this.MediaBrowserCompat$ItemReceiver, j, z);
    }

    public void setFloat(long j, float f) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetFloat(this.MediaBrowserCompat$ItemReceiver, j, f);
    }

    public void setDouble(long j, double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetDouble(this.MediaBrowserCompat$ItemReceiver, j, d);
    }

    public void setDate(long j, Date date) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        if (date != null) {
            nativeSetTimestamp(this.MediaBrowserCompat$ItemReceiver, j, date.getTime());
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    public void setString(long j, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        if (str == null) {
            nativeSetNull(this.MediaBrowserCompat$ItemReceiver, j);
            return;
        }
        nativeSetString(this.MediaBrowserCompat$ItemReceiver, j, str);
    }

    public void setBinaryByteArray(long j, byte[] bArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetByteArray(this.MediaBrowserCompat$ItemReceiver, j, bArr);
    }

    public void setLink(long j, long j2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetLink(this.MediaBrowserCompat$ItemReceiver, j, j2);
    }

    public void nullifyLink(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeNullifyLink(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public boolean isNull(long j) {
        return nativeIsNull(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public void setNull(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        nativeSetNull(this.MediaBrowserCompat$ItemReceiver, j);
    }

    public boolean isAttached() {
        long j = this.MediaBrowserCompat$ItemReceiver;
        return j != 0 && nativeIsAttached(j);
    }

    public void checkIfAttached() {
        if (!isAttached()) {
            throw new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
        }
    }

    public boolean hasColumn(String str) {
        return nativeHasColumn(this.MediaBrowserCompat$ItemReceiver, str);
    }
}

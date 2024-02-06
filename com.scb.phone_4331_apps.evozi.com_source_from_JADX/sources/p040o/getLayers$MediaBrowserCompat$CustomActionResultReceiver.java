package p040o;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: o.getLayers$MediaBrowserCompat$CustomActionResultReceiver */
public final class getLayers$MediaBrowserCompat$CustomActionResultReceiver {
    public final String IconCompatParcelizer;
    public final byte[] MediaBrowserCompat$CustomActionResultReceiver;
    public rsnScriptForEach[] MediaBrowserCompat$ItemReceiver;
    public Map<rsnInvokeClosureCreate, Object> read;
    public final rsnIncAllocationCreateTyped write;

    private getLayers$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public getLayers$MediaBrowserCompat$CustomActionResultReceiver(String str, byte[] bArr, rsnScriptForEach[] rsnscriptforeachArr, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, byte b) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
        this.MediaBrowserCompat$ItemReceiver = rsnscriptforeachArr;
        this.write = rsnincallocationcreatetyped;
        this.read = null;
    }

    public getLayers$MediaBrowserCompat$CustomActionResultReceiver(String str, byte[] bArr, rsnScriptForEach[] rsnscriptforeachArr, rsnIncAllocationCreateTyped rsnincallocationcreatetyped) {
        this(str, bArr, rsnscriptforeachArr, rsnincallocationcreatetyped, System.currentTimeMillis());
    }

    private getLayers$MediaBrowserCompat$CustomActionResultReceiver(String str, byte[] bArr, rsnScriptForEach[] rsnscriptforeachArr, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, long j) {
        this(str, bArr, rsnscriptforeachArr, rsnincallocationcreatetyped, (byte) 0);
    }

    public final void read(rsnInvokeClosureCreate rsninvokeclosurecreate, Object obj) {
        if (this.read == null) {
            this.read = new EnumMap(rsnInvokeClosureCreate.class);
        }
        this.read.put(rsninvokeclosurecreate, obj);
    }

    public final String toString() {
        return this.IconCompatParcelizer;
    }
}

package p040o;

import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subI16 */
public abstract class subI16 extends subI64 {
    public subI16(rsnAllocationRead1D.write write, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        super(write, iconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$ItemReceiver(addI8 addi8, subDouble2 subdouble2) {
        if (addi8 == null) {
            return false;
        }
        float write = (float) subdouble2.write(addi8);
        if (addi8 == null || write >= ((float) subdouble2.PlaybackStateCompat$CustomAction()) * this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
            return false;
        }
        return true;
    }
}

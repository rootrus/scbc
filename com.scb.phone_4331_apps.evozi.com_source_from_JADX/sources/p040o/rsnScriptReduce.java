package p040o;

import com.google.zxing.NotFoundException;

/* renamed from: o.rsnScriptReduce */
public abstract class rsnScriptReduce {
    private static rsnScriptReduce IconCompatParcelizer = new rsnScriptSetVarF();

    public abstract rsnScriptSetVarI IconCompatParcelizer(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    public abstract rsnScriptSetVarI IconCompatParcelizer(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, replaceInParent$MediaBrowserCompat$ItemReceiver replaceinparent_mediabrowsercompat_itemreceiver) throws NotFoundException;

    public static rsnScriptReduce MediaBrowserCompat$CustomActionResultReceiver() {
        return IconCompatParcelizer;
    }
}

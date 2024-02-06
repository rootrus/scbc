package p040o;

import p040o.CommonUtils;

/* renamed from: o.setCountImpl */
public final /* synthetic */ class setCountImpl implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ setCountImpl(String str) {
        this.IconCompatParcelizer = str;
    }

    public final boolean write(Object obj) {
        return this.IconCompatParcelizer.equals(((CommonUtils.C31811) obj).IconCompatParcelizer);
    }
}

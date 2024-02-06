package p040o;

import p040o.AndroidApplication;

/* renamed from: o.postMessage */
public final /* synthetic */ class postMessage {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[AndroidApplication.write.values().length];
        IconCompatParcelizer = iArr;
        iArr[AndroidApplication.write.LOADING.ordinal()] = 1;
        IconCompatParcelizer[AndroidApplication.write.REFRESH.ordinal()] = 2;
        IconCompatParcelizer[AndroidApplication.write.NO_ITEMS.ordinal()] = 3;
        IconCompatParcelizer[AndroidApplication.write.ITEM.ordinal()] = 4;
    }
}

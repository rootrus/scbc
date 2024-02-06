package p040o;

import com.scb.phone.view.adapter.transferandpay.HistoryAdapter;

/* renamed from: o.getNcbMultiproduct */
public final /* synthetic */ class getNcbMultiproduct {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[HistoryAdapter.IconCompatParcelizer.values().length];
        write = iArr;
        iArr[HistoryAdapter.IconCompatParcelizer.LOADING.ordinal()] = 1;
        write[HistoryAdapter.IconCompatParcelizer.ERROR.ordinal()] = 2;
        write[HistoryAdapter.IconCompatParcelizer.NONE.ordinal()] = 3;
    }
}

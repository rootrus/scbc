package p040o;

import java.util.Comparator;

/* renamed from: o.AccountTransfer */
public final /* synthetic */ class AccountTransfer implements Comparator {
    public static final /* synthetic */ AccountTransfer read = new AccountTransfer();

    private /* synthetic */ AccountTransfer() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((getSnippet) obj).read - ((getSnippet) obj2).read;
    }
}

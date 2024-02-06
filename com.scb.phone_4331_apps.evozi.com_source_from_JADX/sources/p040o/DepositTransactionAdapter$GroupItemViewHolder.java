package p040o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.DepositTransactionAdapter$GroupItemViewHolder */
public final class DepositTransactionAdapter$GroupItemViewHolder {
    public final String IconCompatParcelizer;
    public final List<C6431x12296157> MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public DepositTransactionAdapter$GroupItemViewHolder() {
    }

    public static <T> T IconCompatParcelizer(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" may not be null");
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T extends CharSequence> T IconCompatParcelizer(T t, String str) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" may not be null");
            throw new IllegalArgumentException(sb.toString());
        } else if (!FatcaQuestionnaireAdapter$ViewHolder.read(t)) {
            return t;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" may not be blank");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static <E, T extends Collection<E>> T read(T t, String str) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" may not be null");
            throw new IllegalArgumentException(sb.toString());
        } else if (!t.isEmpty()) {
            return t;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" may not be empty");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static int write(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" may not be negative or zero");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" may not be negative");
        throw new IllegalArgumentException(sb.toString());
    }

    public static long read(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" may not be negative");
        throw new IllegalArgumentException(sb.toString());
    }

    public DepositTransactionAdapter$GroupItemViewHolder(String str, String str2, List<C6431x12296157> list) {
        onGetStartedClick.write((Object) list, "debitCardList");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}

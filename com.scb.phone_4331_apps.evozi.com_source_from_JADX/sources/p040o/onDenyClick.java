package p040o;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: o.onDenyClick */
public final class onDenyClick {
    private static final Pattern write = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    public static String IconCompatParcelizer(boolean z, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty((CharSequence) null) && !TextUtils.isEmpty((CharSequence) null)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        } else if (TextUtils.isEmpty((CharSequence) null) || write.matcher((CharSequence) null).matches()) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("SELECT ");
            sb.append("* ");
            sb.append("FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append(" WHERE ");
                sb.append((String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append(" GROUP BY ");
                sb.append((String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append(" HAVING ");
                sb.append((String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append(" ORDER BY ");
                sb.append((String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append(" LIMIT ");
                sb.append((String) null);
            }
            return sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid LIMIT clauses:");
            sb2.append((String) null);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}

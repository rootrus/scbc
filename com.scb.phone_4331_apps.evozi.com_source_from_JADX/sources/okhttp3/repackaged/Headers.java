package okhttp3.repackaged;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.repackaged.internal.http.HttpDate;

public final class Headers {
    private final String[] ahK;

    private Headers(Builder builder) {
        this.ahK = (String[]) builder.namesAndValues.toArray(new String[builder.namesAndValues.size()]);
    }

    private Headers(String[] strArr) {
        this.ahK = strArr;
    }

    public final String get(String str) {
        return m5833a(this.ahK, str);
    }

    public final Date getDate(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return HttpDate.parse(str2);
        }
        return null;
    }

    public final int size() {
        return this.ahK.length / 2;
    }

    public final String name(int i) {
        return this.ahK[i << 1];
    }

    public final String value(int i) {
        return this.ahK[(i << 1) + 1];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        Collections.addAll(builder.namesAndValues, this.ahK);
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(name(i));
            sb.append(": ");
            sb.append(value(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Map<String, List<String>> toMultimap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            List list = (List) linkedHashMap.get(name);
            if (list == null) {
                list = new ArrayList(2);
                linkedHashMap.put(name, list);
            }
            list.add(value(i));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static String m5833a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: of */
    public static Headers m5835of(String... strArr) {
        if (strArr == null || strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int i = 0;
        while (i < strArr2.length) {
            if (strArr2[i] != null) {
                strArr2[i] = strArr2[i].trim();
                i++;
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        int i2 = 0;
        while (i2 < strArr2.length) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                i2 += 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected header: ");
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new Headers(strArr2);
    }

    /* renamed from: of */
    public static Headers m5834of(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() << 1)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() == null || next.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) next.getKey()).trim();
                String trim2 = ((String) next.getValue()).trim();
                if (trim.length() != 0 && trim.indexOf(0) == -1 && trim2.indexOf(0) == -1) {
                    strArr[i] = trim;
                    strArr[i + 1] = trim2;
                    i += 2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected header: ");
                    sb.append(trim);
                    sb.append(": ");
                    sb.append(trim2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return new Headers(strArr);
        }
        throw new IllegalArgumentException("Expected map with header names and values");
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public final List<String> namesAndValues = new ArrayList(20);

        /* access modifiers changed from: package-private */
        /* renamed from: aT */
        public final Builder mo58373aT(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return mo58372U(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return mo58372U("", str.substring(1));
            }
            return mo58372U("", str);
        }

        public final Builder add(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return add(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder add(String str, String str2) {
            m5836V(str, str2);
            return mo58372U(str, str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public final Builder mo58372U(String str, String str2) {
            this.namesAndValues.add(str);
            this.namesAndValues.add(str2.trim());
            return this;
        }

        public final Builder removeAll(String str) {
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, String str2) {
            m5836V(str, str2);
            removeAll(str);
            mo58372U(str, str2);
            return this;
        }

        /* renamed from: V */
        private void m5836V(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        public final String get(String str) {
            for (int size = this.namesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
            }
            return null;
        }

        public final Headers build() {
            return new Headers(this);
        }
    }
}

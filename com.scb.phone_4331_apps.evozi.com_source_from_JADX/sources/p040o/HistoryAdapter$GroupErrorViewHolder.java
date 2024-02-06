package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.threeten.p041bp.zone.ZoneRulesException;

/* renamed from: o.HistoryAdapter$GroupErrorViewHolder */
public final class HistoryAdapter$GroupErrorViewHolder extends HistoryAdapter$GroupItemViewHolder {
    private Set<String> loadedUrls = new CopyOnWriteArraySet();
    private List<String> regionIds;
    private final ConcurrentNavigableMap<String, C6881x60251890> versions = new ConcurrentSkipListMap();

    public final String toString() {
        return "TZDB";
    }

    public HistoryAdapter$GroupErrorViewHolder() {
        if (!load(HistoryAdapter$GroupItemViewHolder.class.getClassLoader())) {
            throw new ZoneRulesException("No time-zone rules found for 'TZDB'");
        }
    }

    public HistoryAdapter$GroupErrorViewHolder(URL url) {
        try {
            if (!load(url)) {
                StringBuilder sb = new StringBuilder();
                sb.append("No time-zone rules found: ");
                sb.append(url);
                throw new ZoneRulesException(sb.toString());
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to load TZDB time-zone rules: ");
            sb2.append(url);
            throw new ZoneRulesException(sb2.toString(), e);
        }
    }

    public HistoryAdapter$GroupErrorViewHolder(InputStream inputStream) {
        try {
            load(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    /* access modifiers changed from: protected */
    public final Set<String> provideZoneIds() {
        return new HashSet(this.regionIds);
    }

    /* access modifiers changed from: protected */
    public final HistoryAdapter$ChildViewHolder provideRules(String str, boolean z) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "zoneId");
        HistoryAdapter$ChildViewHolder rules = ((C6881x60251890) this.versions.lastEntry().getValue()).getRules(str);
        if (rules != null) {
            return rules;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown time-zone ID: ");
        sb.append(str);
        throw new ZoneRulesException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final NavigableMap<String, HistoryAdapter$ChildViewHolder> provideVersions(String str) {
        TreeMap treeMap = new TreeMap();
        for (C6881x60251890 historyAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver : this.versions.values()) {
            HistoryAdapter$ChildViewHolder rules = historyAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver.getRules(str);
            if (rules != null) {
                treeMap.put(historyAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver.versionId, rules);
            }
        }
        return treeMap;
    }

    private boolean load(ClassLoader classLoader) {
        URL url;
        try {
            Enumeration<URL> resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            boolean z = false;
            while (resources.hasMoreElements()) {
                url = resources.nextElement();
                try {
                    z |= load(url);
                    URL url2 = url;
                } catch (Exception e) {
                    e = e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to load TZDB time-zone rules: ");
                    sb.append(url);
                    throw new ZoneRulesException(sb.toString(), e);
                }
            }
            return z;
        } catch (Exception e2) {
            e = e2;
            url = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to load TZDB time-zone rules: ");
            sb2.append(url);
            throw new ZoneRulesException(sb2.toString(), e);
        }
    }

    private boolean load(URL url) throws ClassNotFoundException, IOException, ZoneRulesException {
        boolean z = false;
        if (this.loadedUrls.add(url.toExternalForm())) {
            InputStream inputStream = null;
            try {
                inputStream = url.openStream();
                z = false | load(inputStream);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        return z;
    }

    private boolean load(InputStream inputStream) throws IOException, StreamCorruptedException {
        boolean z = false;
        for (C6881x60251890 next : loadData(inputStream)) {
            C6881x60251890 historyAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver = (C6881x60251890) this.versions.putIfAbsent(next.versionId, next);
            if (historyAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver == null || historyAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver.versionId.equals(next.versionId)) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Data already loaded for TZDB time-zone rules version: ");
                sb.append(next.versionId);
                throw new ZoneRulesException(sb.toString());
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Iterable<p040o.C6881x60251890> loadData(java.io.InputStream r13) throws java.io.IOException, java.io.StreamCorruptedException {
        /*
            r12 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r13)
            byte r13 = r0.readByte()
            java.lang.String r1 = "File format not recognised"
            r2 = 1
            if (r13 != r2) goto L_0x0099
            java.lang.String r13 = r0.readUTF()
            java.lang.String r2 = "TZDB"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x0093
            short r13 = r0.readShort()
            java.lang.String[] r1 = new java.lang.String[r13]
            r2 = 0
            r3 = r2
        L_0x0022:
            if (r3 >= r13) goto L_0x002d
            java.lang.String r4 = r0.readUTF()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002d:
            short r3 = r0.readShort()
            java.lang.String[] r4 = new java.lang.String[r3]
            r5 = r2
        L_0x0034:
            if (r5 >= r3) goto L_0x003f
            java.lang.String r6 = r0.readUTF()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0034
        L_0x003f:
            java.util.List r3 = java.util.Arrays.asList(r4)
            r12.regionIds = r3
            short r3 = r0.readShort()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = r2
        L_0x004c:
            if (r6 >= r3) goto L_0x005c
            short r7 = r0.readShort()
            byte[] r7 = new byte[r7]
            r0.readFully(r7)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r13)
            r6 = r2
        L_0x0067:
            if (r6 >= r13) goto L_0x0092
            short r7 = r0.readShort()
            java.lang.String[] r8 = new java.lang.String[r7]
            short[] r9 = new short[r7]
            r10 = r2
        L_0x0072:
            if (r10 >= r7) goto L_0x0085
            short r11 = r0.readShort()
            r11 = r4[r11]
            r8[r10] = r11
            short r11 = r0.readShort()
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x0072
        L_0x0085:
            o.HistoryAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver r7 = new o.HistoryAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver
            r10 = r1[r6]
            r7.<init>(r10, r8, r9, r3)
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0092:
            return r5
        L_0x0093:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        L_0x0099:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HistoryAdapter$GroupErrorViewHolder.loadData(java.io.InputStream):java.lang.Iterable");
    }
}

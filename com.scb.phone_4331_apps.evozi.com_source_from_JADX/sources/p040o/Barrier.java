package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o.Barrier */
public final class Barrier {
    private static final Object MediaBrowserCompat$ItemReceiver = new Object();
    private static Barrier read;
    final Context IconCompatParcelizer;
    final HashMap<BroadcastReceiver, ArrayList<IconCompatParcelizer>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();
    private final Handler MediaBrowserCompat$SearchResultReceiver;
    private final HashMap<String, ArrayList<IconCompatParcelizer>> MediaDescriptionCompat = new HashMap<>();
    final ArrayList<Barrier$MediaBrowserCompat$ItemReceiver> write = new ArrayList<>();

    /* renamed from: o.Barrier$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        final BroadcastReceiver IconCompatParcelizer;
        final IntentFilter MediaBrowserCompat$ItemReceiver;
        boolean read;
        boolean write;

        IconCompatParcelizer(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.MediaBrowserCompat$ItemReceiver = intentFilter;
            this.IconCompatParcelizer = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.IconCompatParcelizer);
            sb.append(" filter=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            if (this.read) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public static Barrier MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Barrier barrier;
        synchronized (MediaBrowserCompat$ItemReceiver) {
            if (read == null) {
                read = new Barrier(context.getApplicationContext());
            }
            barrier = read;
        }
        return barrier;
    }

    private Barrier(Context context) {
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$SearchResultReceiver = new Handler(context.getMainLooper()) {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
                r3 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
                if (r3 >= r1) goto L_0x000b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
                r4 = r2[r3];
                r5 = r4.IconCompatParcelizer.size();
                r6 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
                if (r6 >= r5) goto L_0x004c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
                r7 = r4.IconCompatParcelizer.get(r6);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
                if (r7.read != false) goto L_0x0049;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
                r7.IconCompatParcelizer.onReceive(r11.IconCompatParcelizer, r4.MediaBrowserCompat$CustomActionResultReceiver);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
                r6 = r6 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
                r3 = r3 + 1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r11) {
                /*
                    r10 = this;
                    int r0 = r11.what
                    r1 = 1
                    if (r0 == r1) goto L_0x0009
                    super.handleMessage(r11)
                    return
                L_0x0009:
                    o.Barrier r11 = p040o.Barrier.this
                L_0x000b:
                    java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o.Barrier$IconCompatParcelizer>> r0 = r11.MediaBrowserCompat$CustomActionResultReceiver
                    monitor-enter(r0)
                    java.util.ArrayList<o.Barrier$MediaBrowserCompat$ItemReceiver> r1 = r11.write     // Catch:{ all -> 0x004f }
                    int r1 = r1.size()     // Catch:{ all -> 0x004f }
                    if (r1 > 0) goto L_0x0018
                    monitor-exit(r0)
                    return
                L_0x0018:
                    o.Barrier$MediaBrowserCompat$ItemReceiver[] r2 = new p040o.Barrier$MediaBrowserCompat$ItemReceiver[r1]     // Catch:{ all -> 0x004f }
                    java.util.ArrayList<o.Barrier$MediaBrowserCompat$ItemReceiver> r3 = r11.write     // Catch:{ all -> 0x004f }
                    r3.toArray(r2)     // Catch:{ all -> 0x004f }
                    java.util.ArrayList<o.Barrier$MediaBrowserCompat$ItemReceiver> r3 = r11.write     // Catch:{ all -> 0x004f }
                    r3.clear()     // Catch:{ all -> 0x004f }
                    monitor-exit(r0)
                    r0 = 0
                    r3 = r0
                L_0x0027:
                    if (r3 >= r1) goto L_0x000b
                    r4 = r2[r3]
                    java.util.ArrayList<o.Barrier$IconCompatParcelizer> r5 = r4.IconCompatParcelizer
                    int r5 = r5.size()
                    r6 = r0
                L_0x0032:
                    if (r6 >= r5) goto L_0x004c
                    java.util.ArrayList<o.Barrier$IconCompatParcelizer> r7 = r4.IconCompatParcelizer
                    java.lang.Object r7 = r7.get(r6)
                    o.Barrier$IconCompatParcelizer r7 = (p040o.Barrier.IconCompatParcelizer) r7
                    boolean r8 = r7.read
                    if (r8 != 0) goto L_0x0049
                    android.content.BroadcastReceiver r7 = r7.IconCompatParcelizer
                    android.content.Context r8 = r11.IconCompatParcelizer
                    android.content.Intent r9 = r4.MediaBrowserCompat$CustomActionResultReceiver
                    r7.onReceive(r8, r9)
                L_0x0049:
                    int r6 = r6 + 1
                    goto L_0x0032
                L_0x004c:
                    int r3 = r3 + 1
                    goto L_0x0027
                L_0x004f:
                    r11 = move-exception
                    monitor-exit(r0)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.Barrier.C11455.handleMessage(android.os.Message):void");
            }
        };
    }

    public final void IconCompatParcelizer(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.MediaBrowserCompat$CustomActionResultReceiver.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.MediaBrowserCompat$CustomActionResultReceiver.put(broadcastReceiver, arrayList);
            }
            arrayList.add(iconCompatParcelizer);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.MediaDescriptionCompat.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.MediaDescriptionCompat.put(action, arrayList2);
                }
                arrayList2.add(iconCompatParcelizer);
            }
        }
    }

    public final void IconCompatParcelizer(BroadcastReceiver broadcastReceiver) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            ArrayList remove = this.MediaBrowserCompat$CustomActionResultReceiver.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) remove.get(size);
                    iconCompatParcelizer.read = true;
                    for (int i = 0; i < iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.countActions(); i++) {
                        String action = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getAction(i);
                        ArrayList arrayList = this.MediaDescriptionCompat.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) arrayList.get(size2);
                                if (iconCompatParcelizer2.IconCompatParcelizer == broadcastReceiver) {
                                    iconCompatParcelizer2.read = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.MediaDescriptionCompat.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0177, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0179, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o.Barrier$IconCompatParcelizer>> r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x017b }
            android.content.Context r3 = r1.IconCompatParcelizer     // Catch:{ all -> 0x017b }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x017b }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x017b }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x017b }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x017b }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x017b }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x017b }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = r9
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            if (r16 == 0) goto L_0x0057
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r3.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Resolving type "
            r3.append(r4)     // Catch:{ all -> 0x017b }
            r3.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = " scheme "
            r3.append(r4)     // Catch:{ all -> 0x017b }
            r3.append(r13)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = " of intent "
            r3.append(r4)     // Catch:{ all -> 0x017b }
            r3.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017b }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x017b }
        L_0x0057:
            java.util.HashMap<java.lang.String, java.util.ArrayList<o.Barrier$IconCompatParcelizer>> r3 = r1.MediaDescriptionCompat     // Catch:{ all -> 0x017b }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x017b }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x017b }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x017b }
            if (r8 == 0) goto L_0x0178
            if (r16 == 0) goto L_0x007e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r3.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Action list: "
            r3.append(r4)     // Catch:{ all -> 0x017b }
            r3.append(r8)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017b }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x017b }
        L_0x007e:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x0081:
            int r3 = r8.size()     // Catch:{ all -> 0x017b }
            if (r6 >= r3) goto L_0x0148
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x017b }
            r5 = r3
            o.Barrier$IconCompatParcelizer r5 = (p040o.Barrier.IconCompatParcelizer) r5     // Catch:{ all -> 0x017b }
            if (r16 == 0) goto L_0x00a8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r3.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Matching against filter "
            r3.append(r4)     // Catch:{ all -> 0x017b }
            android.content.IntentFilter r4 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x017b }
            r3.append(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017b }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x017b }
        L_0x00a8:
            boolean r3 = r5.write     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x00c1
            if (r16 == 0) goto L_0x00b5
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = "  Filter's target already added"
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x017b }
        L_0x00b5:
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r10 = r7
            r11 = r9
            goto L_0x013c
        L_0x00c1:
            android.content.IntentFilter r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x017b }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x017b }
            if (r3 < 0) goto L_0x0108
            if (r16 == 0) goto L_0x00f9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "  Filter matched!  match=0x"
            r4.append(r5)     // Catch:{ all -> 0x017b }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x017b }
            r4.append(r3)     // Catch:{ all -> 0x017b }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "LocalBroadcastManager"
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x017b }
        L_0x00f9:
            if (r10 != 0) goto L_0x0101
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x017b }
            r7.<init>()     // Catch:{ all -> 0x017b }
            goto L_0x0102
        L_0x0101:
            r7 = r10
        L_0x0102:
            r7.add(r15)     // Catch:{ all -> 0x017b }
            r15.write = r11     // Catch:{ all -> 0x017b }
            goto L_0x013d
        L_0x0108:
            if (r16 == 0) goto L_0x013c
            r4 = -4
            if (r3 == r4) goto L_0x0124
            r4 = -3
            if (r3 == r4) goto L_0x0121
            r4 = -2
            if (r3 == r4) goto L_0x011e
            r4 = -1
            if (r3 == r4) goto L_0x011a
            java.lang.String r3 = "unknown reason"
            goto L_0x0126
        L_0x011a:
            java.lang.String r3 = "type"
            goto L_0x0126
        L_0x011e:
            java.lang.String r3 = "data"
            goto L_0x0126
        L_0x0121:
            java.lang.String r3 = "action"
            goto L_0x0126
        L_0x0124:
            java.lang.String r3 = "category"
        L_0x0126:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "  Filter did not match: "
            r4.append(r5)     // Catch:{ all -> 0x017b }
            r4.append(r3)     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x017b }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x017b }
        L_0x013c:
            r7 = r10
        L_0x013d:
            int r6 = r18 + 1
            r9 = r11
            r10 = r19
            r8 = r20
            r11 = r21
            goto L_0x0081
        L_0x0148:
            r10 = r7
            r11 = r9
            if (r10 == 0) goto L_0x0178
            r3 = 0
        L_0x014d:
            int r4 = r10.size()     // Catch:{ all -> 0x017b }
            if (r3 >= r4) goto L_0x015f
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x017b }
            o.Barrier$IconCompatParcelizer r4 = (p040o.Barrier.IconCompatParcelizer) r4     // Catch:{ all -> 0x017b }
            r5 = 0
            r4.write = r5     // Catch:{ all -> 0x017b }
            int r3 = r3 + 1
            goto L_0x014d
        L_0x015f:
            java.util.ArrayList<o.Barrier$MediaBrowserCompat$ItemReceiver> r3 = r1.write     // Catch:{ all -> 0x017b }
            o.Barrier$MediaBrowserCompat$ItemReceiver r4 = new o.Barrier$MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x017b }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x017b }
            r3.add(r4)     // Catch:{ all -> 0x017b }
            android.os.Handler r0 = r1.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x017b }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x0176
            android.os.Handler r0 = r1.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x017b }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x017b }
        L_0x0176:
            monitor-exit(r2)
            return r11
        L_0x0178:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x017b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Barrier.MediaBrowserCompat$CustomActionResultReceiver(android.content.Intent):boolean");
    }
}

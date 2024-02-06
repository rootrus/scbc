package p040o;

import android.app.PendingIntent;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.nIncObjDestroy */
public class nIncObjDestroy {
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final PendingIntent MediaBrowserCompat$MediaItem;
    private final PendingIntent read;
    private final int write;

    public nIncObjDestroy() {
    }

    public PendingIntent MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read;
    }

    public int read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public PendingIntent write() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public int MediaDescriptionCompat() {
        return this.write;
    }

    public nIncObjDestroy(String str, int i, int i2, int i3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this();
        if (str != null) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.write = i2;
            this.IconCompatParcelizer = i3;
            this.read = pendingIntent;
            this.MediaBrowserCompat$MediaItem = pendingIntent2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof p040o.nIncObjDestroy
            if (r1 == 0) goto L_0x0055
            o.nIncObjDestroy r4 = (p040o.nIncObjDestroy) r4
            java.lang.String r1 = r3.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = r4.MediaBrowserCompat$ItemReceiver()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0055
            int r1 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r4.read()
            if (r1 != r2) goto L_0x0055
            int r1 = r3.write
            int r2 = r4.MediaDescriptionCompat()
            if (r1 != r2) goto L_0x0055
            int r1 = r3.IconCompatParcelizer
            int r2 = r4.IconCompatParcelizer()
            if (r1 != r2) goto L_0x0055
            android.app.PendingIntent r1 = r3.read
            if (r1 != 0) goto L_0x0039
            android.app.PendingIntent r1 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            if (r1 != 0) goto L_0x0055
            goto L_0x0043
        L_0x0039:
            android.app.PendingIntent r2 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0055
        L_0x0043:
            android.app.PendingIntent r1 = r3.MediaBrowserCompat$MediaItem
            android.app.PendingIntent r4 = r4.write()
            if (r1 != 0) goto L_0x004e
            if (r4 != 0) goto L_0x0055
            goto L_0x0054
        L_0x004e:
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0055
        L_0x0054:
            return r0
        L_0x0055:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nIncObjDestroy.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = this.MediaBrowserCompat$ItemReceiver.hashCode();
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = this.write;
        int i3 = this.IconCompatParcelizer;
        PendingIntent pendingIntent = this.read;
        int i4 = 0;
        int hashCode2 = pendingIntent == null ? 0 : pendingIntent.hashCode();
        PendingIntent pendingIntent2 = this.MediaBrowserCompat$MediaItem;
        if (pendingIntent2 != null) {
            i4 = pendingIntent2.hashCode();
        }
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ hashCode2) * 1000003) ^ i4;
    }

    public String toString() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = this.write;
        int i3 = this.IconCompatParcelizer;
        String valueOf = String.valueOf(this.read);
        String valueOf2 = String.valueOf(this.MediaBrowserCompat$MediaItem);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

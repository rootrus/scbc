package p040o;

import java.util.NoSuchElementException;
import org.apache.http.ParseException;

/* renamed from: o.AccountTargetAdapter$AccountViewHolder */
public final class AccountTargetAdapter$AccountViewHolder implements AccountManagementActivity {
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private int read = read(-1);
    private PrepaidResetPinSuccessActivity write;

    public AccountTargetAdapter$AccountViewHolder(PrepaidResetPinSuccessActivity prepaidResetPinSuccessActivity) {
        this.write = (PrepaidResetPinSuccessActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidResetPinSuccessActivity, "Header iterator");
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$ItemReceiver != null;
    }

    public final String MediaBrowserCompat$ItemReceiver() throws NoSuchElementException, ParseException {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            this.read = read(this.read);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final Object next() throws NoSuchElementException, ParseException {
        return MediaBrowserCompat$ItemReceiver();
    }

    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    private int read(int i) throws ParseException {
        int i2;
        if (i >= 0) {
            i2 = MediaBrowserCompat$CustomActionResultReceiver(i);
        } else if (!this.write.hasNext()) {
            return -1;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$ItemReceiver();
            i2 = 0;
        }
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i2);
        if (MediaBrowserCompat$ItemReceiver2 < 0) {
            this.MediaBrowserCompat$ItemReceiver = null;
            return -1;
        }
        int write2 = write(MediaBrowserCompat$ItemReceiver2);
        this.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.substring(MediaBrowserCompat$ItemReceiver2, write2);
        return write2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if ((" ,;=()<>@:\\\"/[]?{}\t".indexOf(r1) >= 0) != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x005c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int MediaBrowserCompat$ItemReceiver(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Search position"
            int r7 = p040o.DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r7, r0)
            r0 = 0
            r1 = r0
        L_0x0008:
            if (r1 != 0) goto L_0x009e
            java.lang.String r2 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x009e
            int r2 = r2.length()
            r3 = 1
        L_0x0013:
            if (r1 != 0) goto L_0x0080
            if (r7 >= r2) goto L_0x0080
            java.lang.String r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            char r4 = r4.charAt(r7)
            r5 = 44
            if (r4 != r5) goto L_0x0023
            r5 = r3
            goto L_0x0024
        L_0x0023:
            r5 = r0
        L_0x0024:
            if (r5 != 0) goto L_0x007d
            r5 = 9
            if (r4 == r5) goto L_0x0032
            boolean r4 = java.lang.Character.isSpaceChar(r4)
            if (r4 != 0) goto L_0x0032
            r4 = r0
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            if (r4 != 0) goto L_0x007d
            java.lang.String r1 = r6.MediaBrowserCompat$CustomActionResultReceiver
            char r1 = r1.charAt(r7)
            boolean r4 = java.lang.Character.isLetterOrDigit(r1)
            if (r4 != 0) goto L_0x0057
            boolean r4 = java.lang.Character.isISOControl(r1)
            if (r4 == 0) goto L_0x0049
        L_0x0047:
            r1 = r0
            goto L_0x0058
        L_0x0049:
            java.lang.String r4 = " ,;=()<>@:\\\"/[]?{}\t"
            int r1 = r4.indexOf(r1)
            if (r1 < 0) goto L_0x0053
            r1 = r3
            goto L_0x0054
        L_0x0053:
            r1 = r0
        L_0x0054:
            if (r1 == 0) goto L_0x0057
            goto L_0x0047
        L_0x0057:
            r1 = r3
        L_0x0058:
            if (r1 == 0) goto L_0x005c
            r1 = r3
            goto L_0x0013
        L_0x005c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid character before token (pos "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = "): "
            r0.append(r7)
            java.lang.String r7 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.append(r7)
            org.apache.http.ParseException r7 = new org.apache.http.ParseException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x007d:
            int r7 = r7 + 1
            goto L_0x0013
        L_0x0080:
            if (r1 != 0) goto L_0x0008
            o.PrepaidResetPinSuccessActivity r2 = r6.write
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x0099
            o.PrepaidResetPinSuccessActivity r7 = r6.write
            o.PrepaidRequestMarketConductActivity r7 = r7.MediaBrowserCompat$ItemReceiver()
            java.lang.String r7 = r7.MediaBrowserCompat$ItemReceiver()
            r6.MediaBrowserCompat$CustomActionResultReceiver = r7
            r7 = r0
            goto L_0x0008
        L_0x0099:
            r2 = 0
            r6.MediaBrowserCompat$CustomActionResultReceiver = r2
            goto L_0x0008
        L_0x009e:
            if (r1 != 0) goto L_0x00a1
            r7 = -1
        L_0x00a1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountTargetAdapter$AccountViewHolder.MediaBrowserCompat$ItemReceiver(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if ((" ,;=()<>@:\\\"/[]?{}\t".indexOf(r4) >= 0) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int MediaBrowserCompat$CustomActionResultReceiver(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Search position"
            int r7 = p040o.DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r7, r0)
            java.lang.String r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 != 0) goto L_0x0094
            if (r7 >= r0) goto L_0x0094
            java.lang.String r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            char r4 = r4.charAt(r7)
            r5 = 44
            if (r4 != r5) goto L_0x001f
            r5 = r1
            goto L_0x0020
        L_0x001f:
            r5 = r2
        L_0x0020:
            if (r5 == 0) goto L_0x0024
            r3 = r1
            goto L_0x000f
        L_0x0024:
            r5 = 9
            if (r4 == r5) goto L_0x0030
            boolean r5 = java.lang.Character.isSpaceChar(r4)
            if (r5 != 0) goto L_0x0030
            r5 = r2
            goto L_0x0031
        L_0x0030:
            r5 = r1
        L_0x0031:
            if (r5 == 0) goto L_0x0036
            int r7 = r7 + 1
            goto L_0x000f
        L_0x0036:
            boolean r0 = java.lang.Character.isLetterOrDigit(r4)
            if (r0 != 0) goto L_0x0052
            boolean r0 = java.lang.Character.isISOControl(r4)
            if (r0 == 0) goto L_0x0044
        L_0x0042:
            r1 = r2
            goto L_0x0052
        L_0x0044:
            java.lang.String r0 = " ,;=()<>@:\\\"/[]?{}\t"
            int r0 = r0.indexOf(r4)
            if (r0 < 0) goto L_0x004e
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            goto L_0x0042
        L_0x0052:
            java.lang.String r0 = "): "
            if (r1 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Tokens without separator (pos "
            r1.append(r2)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r1.append(r7)
            org.apache.http.ParseException r7 = new org.apache.http.ParseException
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x0075:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid character after token (pos "
            r1.append(r2)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r1.append(r7)
            org.apache.http.ParseException r7 = new org.apache.http.ParseException
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x0094:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountTargetAdapter$AccountViewHolder.MediaBrowserCompat$CustomActionResultReceiver(int):int");
    }

    private int write(int i) {
        boolean z;
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Search position");
        int length = this.MediaBrowserCompat$CustomActionResultReceiver.length();
        do {
            z = true;
            i++;
            if (i >= length) {
                break;
            }
            char charAt = this.MediaBrowserCompat$CustomActionResultReceiver.charAt(i);
            if (!Character.isLetterOrDigit(charAt)) {
                if (!Character.isISOControl(charAt)) {
                    if (!(" ,;=()<>@:\\\"/[]?{}\t".indexOf(charAt) >= 0)) {
                        continue;
                    }
                }
                z = false;
                continue;
            }
        } while (z);
        return i;
    }
}

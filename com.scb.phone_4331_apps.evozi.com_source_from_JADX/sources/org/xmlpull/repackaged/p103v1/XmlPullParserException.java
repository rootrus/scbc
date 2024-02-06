package org.xmlpull.repackaged.p103v1;

import java.io.PrintStream;

/* renamed from: org.xmlpull.repackaged.v1.XmlPullParserException */
public class XmlPullParserException extends Exception {
    private Throwable MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XmlPullParserException(java.lang.String r4, p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            if (r4 != 0) goto L_0x000b
            r4 = r1
            goto L_0x001c
        L_0x000b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x001c:
            r0.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "(position:"
            r4.append(r2)
            java.lang.String r2 = r5.MediaBrowserCompat$SearchResultReceiver()
            r4.append(r2)
            java.lang.String r2 = ") "
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            if (r6 != 0) goto L_0x003f
            goto L_0x0050
        L_0x003f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "caused by: "
            r4.append(r1)
            r4.append(r6)
            java.lang.String r1 = r4.toString()
        L_0x0050:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            r5.MediaMetadataCompat()
            r5.MediaBrowserCompat$CustomActionResultReceiver()
            r3.MediaBrowserCompat$CustomActionResultReceiver = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.repackaged.p103v1.XmlPullParserException.<init>(java.lang.String, o.HistoryAdapter$GroupErrorViewHolder_ViewBinding, java.lang.Throwable):void");
    }

    public void printStackTrace() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append(super.getMessage());
            sb.append("; nested exception is:");
            printStream.println(sb.toString());
            this.MediaBrowserCompat$CustomActionResultReceiver.printStackTrace();
        }
    }
}

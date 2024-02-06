package p040o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setFullDivider */
public class setFullDivider {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = setFullDivider.class.getName();
    private String IconCompatParcelizer;
    private setDivider MediaBrowserCompat$ItemReceiver = new setDivider();
    private List<String> read = new ArrayList();
    /* access modifiers changed from: private */
    public setRemainingLimit<String> write;

    public setFullDivider(String str, setRemainingLimit<String> setremaininglimit) {
        this.write = setremaininglimit;
        try {
            MediaBrowserCompat$ItemReceiver(str);
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$ItemReceiver(java.lang.String r12) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            r11 = this;
            java.util.List<java.lang.String> r0 = r11.read
            r0.clear()
            r0 = 1
            if (r12 == 0) goto L_0x02a8
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.p042v1.XmlPullParserFactory.newInstance()
            r2 = 0
            r1.setNamespaceAware(r2)
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r12)
            r1.setInput(r3)
            int r12 = r1.getEventType()
            java.lang.String r3 = ""
            r4 = r3
        L_0x0023:
            if (r12 == r0) goto L_0x02a8
            java.lang.String r5 = r1.getName()
            r6 = 3
            r7 = 4
            if (r12 == r6) goto L_0x0037
            if (r12 == r7) goto L_0x0031
            goto L_0x02a2
        L_0x0031:
            java.lang.String r4 = r1.getText()
            goto L_0x02a2
        L_0x0037:
            java.lang.String r12 = "SUBJECT_ID"
            boolean r12 = r5.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x005c
            java.lang.String r12 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "SUBJECT_ID = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r12, r5)
            java.util.List<java.lang.String> r12 = r11.read
            r12.add(r4)
            goto L_0x02a2
        L_0x005c:
            java.lang.String r12 = "Operation"
            boolean r12 = r5.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x02a2
            java.lang.String r12 = r4.toUpperCase()
            java.lang.String r12 = r12.toUpperCase()
            int r5 = r12.hashCode()
            r8 = 5
            r9 = 2
            switch(r5) {
                case -1718677371: goto L_0x00a8;
                case -618475286: goto L_0x009e;
                case -322499786: goto L_0x0094;
                case -123623535: goto L_0x008a;
                case 832880155: goto L_0x0080;
                case 1602343886: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00b2
        L_0x0076:
            java.lang.String r5 = "DELETION"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00b2
            r12 = r7
            goto L_0x00b3
        L_0x0080:
            java.lang.String r5 = "VERIFICATION"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00b2
            r12 = r9
            goto L_0x00b3
        L_0x008a:
            java.lang.String r5 = "AUTHENTICATION_BIOMETRIC"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00b2
            r12 = r8
            goto L_0x00b3
        L_0x0094:
            java.lang.String r5 = "ENROLLMENT_WITHOUT_DUP_CHECK"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00b2
            r12 = r2
            goto L_0x00b3
        L_0x009e:
            java.lang.String r5 = "ENROLLMENT_WITH_DUP_CHECK"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00b2
            r12 = r0
            goto L_0x00b3
        L_0x00a8:
            java.lang.String r5 = "UPDATE_WITH_DUP_CHECK"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x00b2
            r12 = r6
            goto L_0x00b3
        L_0x00b2:
            r12 = -1
        L_0x00b3:
            if (r12 == 0) goto L_0x027e
            if (r12 == r0) goto L_0x026f
            java.lang.String r5 = "updated photo null"
            java.lang.String r10 = "updated photo not null"
            if (r12 == r9) goto L_0x0218
            if (r12 == r6) goto L_0x0170
            if (r12 == r7) goto L_0x00d3
            if (r12 != r8) goto L_0x028c
            o.setFullDivider$7 r12 = new o.setFullDivider$7
            r12.<init>()
            p040o.setRecipients.MediaMetadataCompat()
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            r5.MediaSessionCompat$QueueItem = r12
            goto L_0x028c
        L_0x00d3:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            r12.setShortcut = r9
            o.setFullDivider$2 r12 = new o.setFullDivider$2
            r12.<init>()
            p040o.setRecipients.MediaMetadataCompat()
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r5 = r5.ParcelableVolumeInfo
            java.lang.String r6 = "deleted photo not null"
            if (r5 == 0) goto L_0x0123
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r5 = r5.ParcelableVolumeInfo
            int r5 = r5.length
            if (r5 <= 0) goto L_0x0123
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.ParcelableVolumeInfo
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            android.content.Context r5 = r5.MediaDescriptionCompat
            android.app.Activity r5 = (android.app.Activity) r5
            o.CustomRecipientsList_ViewBinding r6 = new o.CustomRecipientsList_ViewBinding
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.ParcelableVolumeInfo
            r6.<init>(r5, r7, r12)
            java.lang.Void[] r12 = new java.lang.Void[r2]
            r6.execute(r12)
            goto L_0x028c
        L_0x0123:
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r5 = r5.AppCompatDelegateImpl$ListMenuDecorView
            if (r5 == 0) goto L_0x0163
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r5 = r5.AppCompatDelegateImpl$ListMenuDecorView
            int r5 = r5.length
            if (r5 <= 0) goto L_0x0163
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.AppCompatDelegateImpl$ListMenuDecorView
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            android.content.Context r5 = r5.MediaDescriptionCompat
            android.app.Activity r5 = (android.app.Activity) r5
            o.CustomRecipientsList_ViewBinding r6 = new o.CustomRecipientsList_ViewBinding
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.AppCompatDelegateImpl$ListMenuDecorView
            r6.<init>(r5, r7, r12)
            java.lang.Void[] r12 = new java.lang.Void[r2]
            r6.execute(r12)
            goto L_0x028c
        L_0x0163:
            java.lang.String r5 = "deleted photo null"
            android.util.Log.d(r5, r3)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            r5.MediaSessionCompat$QueueItem = r12
            goto L_0x028c
        L_0x0170:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            byte r12 = r12.setShortcut
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r6 = "operation update"
            android.util.Log.i(r6, r12)
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            r6 = 6
            r12.setShortcut = r6
            o.setFullDivider$3 r12 = new o.setFullDivider$3
            r12.<init>()
            p040o.setRecipients.MediaMetadataCompat()
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.ExpandedMenuView
            if (r6 == 0) goto L_0x01ce
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.ExpandedMenuView
            int r6 = r6.length
            if (r6 <= 0) goto L_0x01ce
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.ExpandedMenuView
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r10, r5)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            android.content.Context r5 = r5.MediaDescriptionCompat
            android.app.Activity r5 = (android.app.Activity) r5
            o.CustomRecipientsList_ViewBinding r6 = new o.CustomRecipientsList_ViewBinding
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.ExpandedMenuView
            r6.<init>(r5, r7, r12)
            java.lang.Void[] r12 = new java.lang.Void[r2]
            r6.execute(r12)
            goto L_0x028c
        L_0x01ce:
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            if (r6 == 0) goto L_0x020e
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            int r6 = r6.length
            if (r6 <= 0) goto L_0x020e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r10, r5)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            android.content.Context r5 = r5.MediaDescriptionCompat
            android.app.Activity r5 = (android.app.Activity) r5
            o.CustomRecipientsList_ViewBinding r6 = new o.CustomRecipientsList_ViewBinding
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.AppCompatDelegateImpl$ListMenuDecorView
            r6.<init>(r5, r7, r12)
            java.lang.Void[] r12 = new java.lang.Void[r2]
            r6.execute(r12)
            goto L_0x028c
        L_0x020e:
            android.util.Log.d(r5, r3)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            r5.MediaSessionCompat$QueueItem = r12
            goto L_0x028c
        L_0x0218:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            r12.setShortcut = r2
            o.setFullDivider$5 r12 = new o.setFullDivider$5
            r12.<init>()
            p040o.setRecipients.MediaMetadataCompat()
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            if (r6 == 0) goto L_0x0265
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            int r6 = r6.length
            if (r6 <= 0) goto L_0x0265
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.setRecipients r6 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r10, r5)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            android.content.Context r5 = r5.MediaDescriptionCompat
            android.app.Activity r5 = (android.app.Activity) r5
            o.CustomRecipientsList_ViewBinding r6 = new o.CustomRecipientsList_ViewBinding
            o.setRecipients r7 = p040o.setRecipients.MediaMetadataCompat()
            byte[] r7 = r7.AppCompatDelegateImpl$ListMenuDecorView
            r6.<init>(r5, r7, r12)
            java.lang.Void[] r12 = new java.lang.Void[r2]
            r6.execute(r12)
            goto L_0x028c
        L_0x0265:
            android.util.Log.d(r5, r3)
            o.setRecipients r5 = p040o.setRecipients.MediaMetadataCompat()
            r5.MediaSessionCompat$QueueItem = r12
            goto L_0x028c
        L_0x026f:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            r12.setShortcut = r0
            o.setFullDivider$1 r12 = new o.setFullDivider$1
            r12.<init>()
            p040o.setDivider.MediaBrowserCompat$CustomActionResultReceiver(r12)
            goto L_0x028c
        L_0x027e:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            r12.setShortcut = r7
            o.setFullDivider$4 r12 = new o.setFullDivider$4
            r12.<init>()
            p040o.setDivider.MediaBrowserCompat$CustomActionResultReceiver(r12)
        L_0x028c:
            java.lang.String r12 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "OPERATION = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r12, r5)
        L_0x02a2:
            int r12 = r1.next()
            goto L_0x0023
        L_0x02a8:
            java.util.List<java.lang.String> r12 = r11.read
            if (r12 == 0) goto L_0x02c2
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x02c2
            java.util.List<java.lang.String> r12 = r11.read
            int r1 = r12.size()
            int r1 = r1 - r0
            java.lang.Object r12 = r12.get(r1)
            java.lang.String r12 = (java.lang.String) r12
            r11.IconCompatParcelizer = r12
            goto L_0x02c6
        L_0x02c2:
            java.lang.String r12 = "SubjectID"
            r11.IconCompatParcelizer = r12
        L_0x02c6:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()
            java.lang.String r0 = r11.IconCompatParcelizer
            r12.setForceShowIcon = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setFullDivider.MediaBrowserCompat$ItemReceiver(java.lang.String):void");
    }
}

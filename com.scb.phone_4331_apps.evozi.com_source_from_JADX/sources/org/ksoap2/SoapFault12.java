package org.ksoap2;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.ETBSelectionAdapter$OneButtonHolder;
import p040o.ETBSelectionAdapter$TwoButtonHolder;

public class SoapFault12 extends SoapFault {
    private ETBSelectionAdapter$OneButtonHolder MediaBrowserCompat$ItemReceiver;
    private ETBSelectionAdapter$OneButtonHolder MediaBrowserCompat$MediaItem;
    private ETBSelectionAdapter$OneButtonHolder MediaMetadataCompat;

    public SoapFault12() {
    }

    public SoapFault12(byte b) {
    }

    public String getMessage() {
        ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$ItemReceiver2 = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver("http://www.w3.org/2003/05/soap-envelope", "Text");
        if (MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(0)) {
            return (String) MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver.elementAt(0);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            o.ETBSelectionAdapter$OneButtonHolder r0 = r6.MediaMetadataCompat
            java.lang.String r1 = "http://www.w3.org/2003/05/soap-envelope"
            java.lang.String r2 = "Text"
            o.ETBSelectionAdapter$TwoButtonHolder r0 = r0.MediaBrowserCompat$ItemReceiver(r1, r2)
            r2 = 0
            boolean r3 = r0.IconCompatParcelizer(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001b
            java.util.Vector r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r0 = r0.elementAt(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001c
        L_0x001b:
            r0 = r4
        L_0x001c:
            o.ETBSelectionAdapter$OneButtonHolder r3 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.String r5 = "Value"
            o.ETBSelectionAdapter$TwoButtonHolder r1 = r3.MediaBrowserCompat$ItemReceiver(r1, r5)
            boolean r3 = r1.IconCompatParcelizer(r2)
            if (r3 == 0) goto L_0x0033
            java.util.Vector r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r1.elementAt(r2)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Code: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", Reason: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ksoap2.SoapFault12.toString():java.lang.String");
    }

    public final void write(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str;
        String str2;
        xmlPullParser.require(2, "http://www.w3.org/2003/05/soap-envelope", "Fault");
        while (xmlPullParser.nextTag() == 2) {
            String name = xmlPullParser.getName();
            String namespace = xmlPullParser.getNamespace();
            xmlPullParser.nextTag();
            if (name.toLowerCase().equals("Code".toLowerCase())) {
                ETBSelectionAdapter$OneButtonHolder eTBSelectionAdapter$OneButtonHolder = new ETBSelectionAdapter$OneButtonHolder();
                this.MediaBrowserCompat$ItemReceiver = eTBSelectionAdapter$OneButtonHolder;
                eTBSelectionAdapter$OneButtonHolder.write(xmlPullParser);
            } else if (name.toLowerCase().equals("Reason".toLowerCase())) {
                ETBSelectionAdapter$OneButtonHolder eTBSelectionAdapter$OneButtonHolder2 = new ETBSelectionAdapter$OneButtonHolder();
                this.MediaMetadataCompat = eTBSelectionAdapter$OneButtonHolder2;
                eTBSelectionAdapter$OneButtonHolder2.write(xmlPullParser);
            } else if (name.toLowerCase().equals("Node".toLowerCase())) {
                new ETBSelectionAdapter$OneButtonHolder().write(xmlPullParser);
            } else if (name.toLowerCase().equals("Role".toLowerCase())) {
                new ETBSelectionAdapter$OneButtonHolder().write(xmlPullParser);
            } else if (name.toLowerCase().equals("Detail".toLowerCase())) {
                ETBSelectionAdapter$OneButtonHolder eTBSelectionAdapter$OneButtonHolder3 = new ETBSelectionAdapter$OneButtonHolder();
                this.MediaBrowserCompat$MediaItem = eTBSelectionAdapter$OneButtonHolder3;
                eTBSelectionAdapter$OneButtonHolder3.write(xmlPullParser);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected tag:");
                sb.append(name);
                throw new RuntimeException(sb.toString());
            }
            xmlPullParser.require(3, namespace, name);
        }
        xmlPullParser.require(3, "http://www.w3.org/2003/05/soap-envelope", "Fault");
        xmlPullParser.nextTag();
        ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver("http://www.w3.org/2003/05/soap-envelope", KtaJsonExactionHelper.VALUE);
        if (MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(0)) {
            str = (String) MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver.elementAt(0);
        } else {
            str = null;
        }
        this.IconCompatParcelizer = str;
        ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$ItemReceiver3 = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver("http://www.w3.org/2003/05/soap-envelope", "Text");
        if (MediaBrowserCompat$ItemReceiver3.IconCompatParcelizer(0)) {
            str2 = (String) MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$CustomActionResultReceiver.elementAt(0);
        } else {
            str2 = null;
        }
        this.write = str2;
        this.read = this.MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }
}

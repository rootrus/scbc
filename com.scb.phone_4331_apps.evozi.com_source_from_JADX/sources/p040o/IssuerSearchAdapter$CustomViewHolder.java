package p040o;

import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import org.ksoap2.SoapFault;
import org.ksoap2.SoapFault12;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.IssuerSearchAdapter$CustomViewHolder */
public class IssuerSearchAdapter$CustomViewHolder {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver = "http://www.w3.org/2003/05/soap-envelope";
    public String MediaBrowserCompat$MediaItem = "http://www.w3.org/2001/XMLSchema";
    private ETBSelectionAdapter$TwoButtonHolder[] MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    public String MediaMetadataCompat = "http://www.w3.org/2001/XMLSchema-instance";
    public int read = 120;
    public String write = "http://www.w3.org/2003/05/soap-encoding";

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals(DiskLruCache.VERSION_1) || lowerCase.equals("true")) {
            return true;
        }
        return false;
    }

    public IssuerSearchAdapter$CustomViewHolder(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: o.ETBSelectionAdapter$TwoButtonHolder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(org.xmlpull.p042v1.XmlPullParser r13) throws java.io.IOException, org.xmlpull.p042v1.XmlPullParserException {
        /*
            r12 = this;
            r13.nextTag()
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "Envelope"
            r2 = 2
            r13.require(r2, r0, r1)
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = "encodingStyle"
            java.lang.String r0 = r13.getAttributeValue(r0, r3)
            r12.MediaDescriptionCompat = r0
            r13.nextTag()
            int r0 = r13.getEventType()
            r4 = 3
            if (r0 != r2) goto L_0x0099
            java.lang.String r0 = r13.getNamespace()
            java.lang.String r5 = r12.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r13.getName()
            java.lang.String r5 = "Header"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0099
            r13.nextTag()
            o.ETBSelectionAdapter$OneButtonHolder r0 = new o.ETBSelectionAdapter$OneButtonHolder
            r0.<init>()
            r0.write(r13)
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x0045:
            java.util.Vector r9 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 != 0) goto L_0x004b
            r9 = r6
            goto L_0x004f
        L_0x004b:
            int r9 = r9.size()
        L_0x004f:
            r10 = 0
            if (r7 >= r9) goto L_0x0066
            java.util.Vector r9 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r9 = r9.elementAt(r7)
            boolean r11 = r9 instanceof p040o.ETBSelectionAdapter$TwoButtonHolder
            if (r11 == 0) goto L_0x005f
            r10 = r9
            o.ETBSelectionAdapter$TwoButtonHolder r10 = (p040o.ETBSelectionAdapter$TwoButtonHolder) r10
        L_0x005f:
            if (r10 == 0) goto L_0x0063
            int r8 = r8 + 1
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x0045
        L_0x0066:
            o.ETBSelectionAdapter$TwoButtonHolder[] r7 = new p040o.ETBSelectionAdapter$TwoButtonHolder[r8]
            r12.MediaBrowserCompat$SearchResultReceiver = r7
            r7 = r6
            r8 = r7
        L_0x006c:
            java.util.Vector r9 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 != 0) goto L_0x0072
            r9 = r6
            goto L_0x0076
        L_0x0072:
            int r9 = r9.size()
        L_0x0076:
            if (r7 >= r9) goto L_0x0091
            java.util.Vector r9 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r9 = r9.elementAt(r7)
            boolean r11 = r9 instanceof p040o.ETBSelectionAdapter$TwoButtonHolder
            if (r11 == 0) goto L_0x0085
            o.ETBSelectionAdapter$TwoButtonHolder r9 = (p040o.ETBSelectionAdapter$TwoButtonHolder) r9
            goto L_0x0086
        L_0x0085:
            r9 = r10
        L_0x0086:
            if (r9 == 0) goto L_0x008e
            o.ETBSelectionAdapter$TwoButtonHolder[] r11 = r12.MediaBrowserCompat$SearchResultReceiver
            r11[r8] = r9
            int r8 = r8 + 1
        L_0x008e:
            int r7 = r7 + 1
            goto L_0x006c
        L_0x0091:
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            r13.require(r4, r0, r5)
            r13.nextTag()
        L_0x0099:
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r5 = "Body"
            r13.require(r2, r0, r5)
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = r13.getAttributeValue(r0, r3)
            r12.MediaDescriptionCompat = r0
            r12.read(r13)
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            r13.require(r4, r0, r5)
            r13.nextTag()
            java.lang.String r0 = r12.MediaBrowserCompat$ItemReceiver
            r13.require(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.IssuerSearchAdapter$CustomViewHolder.IconCompatParcelizer(org.xmlpull.v1.XmlPullParser):void");
    }

    public void read(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        SoapFault soapFault;
        xmlPullParser.nextTag();
        if (xmlPullParser.getEventType() != 2 || !xmlPullParser.getNamespace().equals(this.MediaBrowserCompat$ItemReceiver) || !xmlPullParser.getName().equals("Fault")) {
            Object obj = this.MediaBrowserCompat$CustomActionResultReceiver;
            ETBSelectionAdapter$OneButtonHolder eTBSelectionAdapter$OneButtonHolder = obj instanceof ETBSelectionAdapter$OneButtonHolder ? (ETBSelectionAdapter$OneButtonHolder) obj : new ETBSelectionAdapter$OneButtonHolder();
            eTBSelectionAdapter$OneButtonHolder.write(xmlPullParser);
            this.MediaBrowserCompat$CustomActionResultReceiver = eTBSelectionAdapter$OneButtonHolder;
            return;
        }
        if (this.read < 120) {
            soapFault = new SoapFault((byte) 0);
        } else {
            soapFault = new SoapFault12((byte) 0);
        }
        soapFault.write(xmlPullParser);
        this.MediaBrowserCompat$CustomActionResultReceiver = soapFault;
    }

    public void MediaBrowserCompat$ItemReceiver(XmlSerializer xmlSerializer) throws IOException {
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            xmlSerializer.attribute(this.MediaBrowserCompat$ItemReceiver, "encodingStyle", str);
        }
        ((ETBSelectionAdapter$OneButtonHolder) this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(xmlSerializer);
    }
}

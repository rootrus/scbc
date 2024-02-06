package p040o;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.ETBSelectionAdapter$TwoButtonHolder */
public final class ETBSelectionAdapter$TwoButtonHolder extends ETBSelectionAdapter$OneButtonHolder {
    ETBSelectionAdapter$OneButtonHolder IconCompatParcelizer;
    private Vector MediaBrowserCompat$ItemReceiver;
    private Vector MediaBrowserCompat$SearchResultReceiver;
    protected String read;
    protected String write;

    public final ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        ETBSelectionAdapter$OneButtonHolder eTBSelectionAdapter$OneButtonHolder = this.IconCompatParcelizer;
        return eTBSelectionAdapter$OneButtonHolder == null ? super.MediaBrowserCompat$CustomActionResultReceiver(str, str2) : eTBSelectionAdapter$OneButtonHolder.MediaBrowserCompat$CustomActionResultReceiver(str, str2);
    }

    public final String read() {
        return this.read;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public final void write(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i;
        int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth() - 1);
        while (true) {
            if (namespaceCount >= xmlPullParser.getNamespaceCount(xmlPullParser.getDepth())) {
                break;
            }
            String namespacePrefix = xmlPullParser.getNamespacePrefix(namespaceCount);
            String namespaceUri = xmlPullParser.getNamespaceUri(namespaceCount);
            if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                this.MediaBrowserCompat$SearchResultReceiver = new Vector();
            }
            this.MediaBrowserCompat$SearchResultReceiver.addElement(new String[]{namespacePrefix, namespaceUri});
            namespaceCount++;
        }
        for (i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            MediaBrowserCompat$CustomActionResultReceiver(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
        }
        if (xmlPullParser.isEmptyElementTag()) {
            xmlPullParser.nextToken();
        } else {
            xmlPullParser.nextToken();
            super.write(xmlPullParser);
            if (write() == 0) {
                read(7, "");
            }
        }
        xmlPullParser.require(3, this.write, this.read);
        xmlPullParser.nextToken();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = new Vector();
        }
        if (str == null) {
            str = "";
        }
        int size = this.MediaBrowserCompat$ItemReceiver.size() - 1;
        while (size >= 0) {
            String[] strArr = (String[]) this.MediaBrowserCompat$ItemReceiver.elementAt(size);
            if (!strArr[0].equals(str) || !strArr[1].equals(str2)) {
                size--;
            } else if (str3 == null) {
                this.MediaBrowserCompat$ItemReceiver.removeElementAt(size);
                return;
            } else {
                strArr[2] = str3;
                return;
            }
        }
        this.MediaBrowserCompat$ItemReceiver.addElement(new String[]{str, str2, str3});
    }

    public final void MediaBrowserCompat$ItemReceiver(XmlSerializer xmlSerializer) throws IOException {
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            for (int i = 0; i < this.MediaBrowserCompat$SearchResultReceiver.size(); i++) {
                xmlSerializer.setPrefix(((String[]) this.MediaBrowserCompat$SearchResultReceiver.elementAt(i))[0], ((String[]) this.MediaBrowserCompat$SearchResultReceiver.elementAt(i))[1]);
            }
        }
        xmlSerializer.startTag(this.write, this.read);
        Vector vector = this.MediaBrowserCompat$ItemReceiver;
        int size = vector == null ? 0 : vector.size();
        for (int i2 = 0; i2 < size; i2++) {
            xmlSerializer.attribute(((String[]) this.MediaBrowserCompat$ItemReceiver.elementAt(i2))[0], ((String[]) this.MediaBrowserCompat$ItemReceiver.elementAt(i2))[1], ((String[]) this.MediaBrowserCompat$ItemReceiver.elementAt(i2))[2]);
        }
        read(xmlSerializer);
        xmlSerializer.endTag(this.write, this.read);
    }
}

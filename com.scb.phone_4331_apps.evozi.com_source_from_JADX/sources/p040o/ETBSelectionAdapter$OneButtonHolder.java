package p040o;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.ETBSelectionAdapter$OneButtonHolder */
public class ETBSelectionAdapter$OneButtonHolder {
    public Vector MediaBrowserCompat$CustomActionResultReceiver;
    private StringBuffer MediaBrowserCompat$ItemReceiver;

    public ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        ETBSelectionAdapter$TwoButtonHolder eTBSelectionAdapter$TwoButtonHolder = new ETBSelectionAdapter$TwoButtonHolder();
        if (str == null) {
            str = "";
        }
        eTBSelectionAdapter$TwoButtonHolder.write = str;
        eTBSelectionAdapter$TwoButtonHolder.read = str2;
        return eTBSelectionAdapter$TwoButtonHolder;
    }

    public final int write() {
        Vector vector = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public final ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$ItemReceiver(String str, String str2) {
        int read = read(str, str2, 0);
        int read2 = read(str, str2, read + 1);
        if (read == -1 || read2 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Element {");
            sb.append(str);
            sb.append("}");
            sb.append(str2);
            sb.append(read == -1 ? " not found in " : " more than once in ");
            sb.append(this);
            throw new RuntimeException(sb.toString());
        }
        Object elementAt = this.MediaBrowserCompat$CustomActionResultReceiver.elementAt(read);
        if (elementAt instanceof ETBSelectionAdapter$TwoButtonHolder) {
            return (ETBSelectionAdapter$TwoButtonHolder) elementAt;
        }
        return null;
    }

    public void write(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        boolean z = false;
        do {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    ETBSelectionAdapter$TwoButtonHolder MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    read(2, MediaBrowserCompat$CustomActionResultReceiver2);
                    MediaBrowserCompat$CustomActionResultReceiver2.write(xmlPullParser);
                    continue;
                } else if (eventType != 3) {
                    if (xmlPullParser.getText() != null) {
                        if (eventType == 6) {
                            eventType = 4;
                        }
                        read(eventType, xmlPullParser.getText());
                    } else if (eventType == 6 && xmlPullParser.getName() != null) {
                        read(6, xmlPullParser.getName());
                    }
                    xmlPullParser.nextToken();
                    continue;
                }
            }
            z = true;
            continue;
        } while (!z);
    }

    public void MediaBrowserCompat$ItemReceiver(XmlSerializer xmlSerializer) throws IOException {
        read(xmlSerializer);
        xmlSerializer.flush();
    }

    public final void read(XmlSerializer xmlSerializer) throws IOException {
        Vector vector = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (vector != null) {
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                char charAt = this.MediaBrowserCompat$ItemReceiver.charAt(i);
                Object elementAt = this.MediaBrowserCompat$CustomActionResultReceiver.elementAt(i);
                switch (charAt) {
                    case 2:
                        ((ETBSelectionAdapter$TwoButtonHolder) elementAt).MediaBrowserCompat$ItemReceiver(xmlSerializer);
                        break;
                    case 4:
                        xmlSerializer.text((String) elementAt);
                        break;
                    case 5:
                        xmlSerializer.cdsect((String) elementAt);
                        break;
                    case 6:
                        xmlSerializer.entityRef((String) elementAt);
                        break;
                    case 7:
                        xmlSerializer.ignorableWhitespace((String) elementAt);
                        break;
                    case 8:
                        xmlSerializer.processingInstruction((String) elementAt);
                        break;
                    case 9:
                        xmlSerializer.comment((String) elementAt);
                        break;
                    case 10:
                        xmlSerializer.docdecl((String) elementAt);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Illegal type: ");
                        sb.append(charAt);
                        throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    public final void read(int i, Object obj) {
        Vector vector = this.MediaBrowserCompat$CustomActionResultReceiver;
        int size = vector == null ? 0 : vector.size();
        if (obj != null) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = new Vector();
                this.MediaBrowserCompat$ItemReceiver = new StringBuffer();
            }
            if (i == 2) {
                if (obj instanceof ETBSelectionAdapter$TwoButtonHolder) {
                    ((ETBSelectionAdapter$TwoButtonHolder) obj).IconCompatParcelizer = this;
                } else {
                    throw new RuntimeException("Element obj expected)");
                }
            } else if (!(obj instanceof String)) {
                throw new RuntimeException("String expected");
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.insertElementAt(obj, size);
            this.MediaBrowserCompat$ItemReceiver.insert(size, (char) i);
            return;
        }
        throw null;
    }

    private int read(String str, String str2, int i) {
        Vector vector = this.MediaBrowserCompat$CustomActionResultReceiver;
        int size = vector == null ? 0 : vector.size();
        while (i < size) {
            Object elementAt = this.MediaBrowserCompat$CustomActionResultReceiver.elementAt(i);
            ETBSelectionAdapter$TwoButtonHolder eTBSelectionAdapter$TwoButtonHolder = elementAt instanceof ETBSelectionAdapter$TwoButtonHolder ? (ETBSelectionAdapter$TwoButtonHolder) elementAt : null;
            if (eTBSelectionAdapter$TwoButtonHolder != null && str2.equals(eTBSelectionAdapter$TwoButtonHolder.read()) && (str == null || str.equals(eTBSelectionAdapter$TwoButtonHolder.MediaBrowserCompat$ItemReceiver()))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean IconCompatParcelizer(int i) {
        char charAt = this.MediaBrowserCompat$ItemReceiver.charAt(0);
        return charAt == 4 || charAt == 7 || charAt == 5;
    }
}

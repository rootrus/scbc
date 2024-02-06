package org.ksoap2;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.ETBSelectionAdapter$OneButtonHolder;

public class SoapFault extends IOException {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public ETBSelectionAdapter$OneButtonHolder read;
    public String write;

    public SoapFault() {
    }

    public SoapFault(byte b) {
    }

    public void write(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        while (xmlPullParser.nextTag() == 2) {
            String name = xmlPullParser.getName();
            if (name.equals(ProductAction.ACTION_DETAIL)) {
                ETBSelectionAdapter$OneButtonHolder eTBSelectionAdapter$OneButtonHolder = new ETBSelectionAdapter$OneButtonHolder();
                this.read = eTBSelectionAdapter$OneButtonHolder;
                eTBSelectionAdapter$OneButtonHolder.write(xmlPullParser);
                if (xmlPullParser.getNamespace().equals("http://schemas.xmlsoap.org/soap/envelope/") && xmlPullParser.getName().equals("Fault")) {
                    break;
                }
            } else {
                if (name.equals("faultcode")) {
                    this.IconCompatParcelizer = xmlPullParser.nextText();
                } else if (name.equals("faultstring")) {
                    this.write = xmlPullParser.nextText();
                } else if (name.equals("faultactor")) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = xmlPullParser.nextText();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected tag:");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
                xmlPullParser.require(3, (String) null, name);
            }
        }
        xmlPullParser.require(3, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        xmlPullParser.nextTag();
    }

    public String getMessage() {
        return this.write;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SoapFault - faultcode: '");
        sb.append(this.IconCompatParcelizer);
        sb.append("' faultstring: '");
        sb.append(this.write);
        sb.append("' faultactor: '");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("' detail: ");
        sb.append(this.read);
        return sb.toString();
    }
}

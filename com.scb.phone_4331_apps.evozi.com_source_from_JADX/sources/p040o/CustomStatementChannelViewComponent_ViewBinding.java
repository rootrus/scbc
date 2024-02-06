package p040o;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: o.CustomStatementChannelViewComponent_ViewBinding */
public final class CustomStatementChannelViewComponent_ViewBinding extends DefaultHandler {
    private StringBuilder IconCompatParcelizer;
    private List<setOnRecipientChangeListener> MediaBrowserCompat$ItemReceiver = null;
    private setOnRecipientChangeListener write = null;

    public final void startDocument() throws SAXException {
        this.MediaBrowserCompat$ItemReceiver = new ArrayList();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.IconCompatParcelizer = new StringBuilder();
        if (!str2.equals("Action_Result") && !str2.equals("Return_Code") && !str2.equals("Return_Msg") && !str2.equals("Subject_ID") && str2.equals("FR")) {
            this.write = new setOnRecipientChangeListener();
        }
    }

    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2.equals("FR")) {
            this.MediaBrowserCompat$ItemReceiver.add(this.write);
        }
    }

    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.IconCompatParcelizer.append(new String(cArr, i, i2));
    }
}

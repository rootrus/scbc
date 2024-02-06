package p040o;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import org.xmlpull.p042v1.XmlPullParserFactory;

/* renamed from: o.setTvTitle */
public class setTvTitle {
    private static final String MediaBrowserCompat$ItemReceiver = setTvTitle.class.getName();
    private setHeader IconCompatParcelizer = new setHeader();
    private String MediaBrowserCompat$CustomActionResultReceiver;

    public setTvTitle(String str) {
        new ArrayList();
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = new CustomRecipientsList();
    }

    public final setHeader MediaBrowserCompat$ItemReceiver() throws XmlPullParserException, IOException {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(false);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new StringReader(this.MediaBrowserCompat$CustomActionResultReceiver));
            String str = "";
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                String name = newPullParser.getName();
                if (eventType != 3) {
                    if (eventType == 4) {
                        str = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase("Error_Code")) {
                    this.IconCompatParcelizer.read = str;
                } else if (!name.equalsIgnoreCase("Description")) {
                    if (name.equalsIgnoreCase("Token_ID")) {
                        setRecipients.MediaMetadataCompat().setTitle = str;
                        Log.d(MediaBrowserCompat$ItemReceiver, setRecipients.MediaMetadataCompat().setTitle);
                    } else if (name.equalsIgnoreCase("Token_Counter")) {
                        setRecipients.MediaMetadataCompat().setGroupDividerEnabled = str;
                    } else if (name.equalsIgnoreCase("Biometric_Key")) {
                        setRecipients.MediaMetadataCompat().MediaBrowserCompat$MediaItem = str;
                        Log.d(MediaBrowserCompat$ItemReceiver, setRecipients.MediaMetadataCompat().MediaBrowserCompat$MediaItem);
                    } else if (!name.equalsIgnoreCase("Clear_Result") && !name.equalsIgnoreCase("Encrypt_Result") && !name.equalsIgnoreCase("Subject_ID")) {
                        if (name.equalsIgnoreCase("Encrypted_Retrieved_Biometric")) {
                            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str;
                        } else if (name.equalsIgnoreCase("Subject_Biographic")) {
                            final String[] split = str.replace("\"", "").split(":");
                            new HashMap<String, String>() {
                                {
                                    String[] strArr = split;
                                    put(strArr[0], strArr[1]);
                                }
                            };
                        }
                    }
                }
            }
        }
        return this.IconCompatParcelizer;
    }
}

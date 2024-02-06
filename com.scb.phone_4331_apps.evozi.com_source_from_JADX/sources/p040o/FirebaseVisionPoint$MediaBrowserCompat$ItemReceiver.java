package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AnalyticsConnector;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionPoint$MediaBrowserCompat$ItemReceiver */
final class FirebaseVisionPoint$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionServer> {
    private /* synthetic */ chain IconCompatParcelizer;
    private /* synthetic */ String read;
    private /* synthetic */ FirebaseVisionPoint write;

    FirebaseVisionPoint$MediaBrowserCompat$ItemReceiver(chain chain, FirebaseVisionPoint firebaseVisionPoint, String str) {
        this.IconCompatParcelizer = chain;
        this.write = firebaseVisionPoint;
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        setExtractionServer setextractionserver = (setExtractionServer) obj;
        setextractionserver.write();
        String str = this.read;
        Collection arrayList = new ArrayList();
        for (AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener : this.write.MediaBrowserCompat$ItemReceiver) {
            StringBuilder sb = new StringBuilder();
            sb.append(analyticsConnectorListener.read);
            sb.append(' ');
            sb.append(analyticsConnectorListener.MediaBrowserCompat$CustomActionResultReceiver);
            String obj2 = sb.toString();
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        setextractionserver.IconCompatParcelizer(str, HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList), this.IconCompatParcelizer);
    }
}

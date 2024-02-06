package p040o;

import java.util.ArrayList;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionImage$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9738xc6b4f539<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver> {
    private /* synthetic */ FirebaseVisionImage IconCompatParcelizer;
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ ArrayList MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;
    private /* synthetic */ String write;

    public C9738xc6b4f539(FirebaseVisionImage firebaseVisionImage, String str, String str2, String str3, ArrayList arrayList) {
        this.IconCompatParcelizer = firebaseVisionImage;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = arrayList;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer(FirebaseVisionImage.IconCompatParcelizer(this.IconCompatParcelizer), FirebaseVisionImage.write(this.IconCompatParcelizer), this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.read, this.MediaBrowserCompat$ItemReceiver);
    }
}

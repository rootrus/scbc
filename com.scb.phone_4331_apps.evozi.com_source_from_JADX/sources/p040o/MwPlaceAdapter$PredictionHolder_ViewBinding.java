package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.util.p102io.pem.PemGenerationException;

/* renamed from: o.MwPlaceAdapter$PredictionHolder_ViewBinding */
public final class MwPlaceAdapter$PredictionHolder_ViewBinding implements MwShopTypeAdapter$ShopTypeViewHolder {
    private static final List MediaBrowserCompat$CustomActionResultReceiver = Collections.unmodifiableList(new ArrayList());
    byte[] MediaBrowserCompat$ItemReceiver;
    List read;
    String write;

    public final MwPlaceAdapter$PredictionHolder_ViewBinding read() throws PemGenerationException {
        return this;
    }

    public MwPlaceAdapter$PredictionHolder_ViewBinding(String str, byte[] bArr) {
        this(str, MediaBrowserCompat$CustomActionResultReceiver, bArr);
    }

    private MwPlaceAdapter$PredictionHolder_ViewBinding(String str, List list, byte[] bArr) {
        this.write = str;
        this.read = Collections.unmodifiableList(list);
        this.MediaBrowserCompat$ItemReceiver = bArr;
    }
}

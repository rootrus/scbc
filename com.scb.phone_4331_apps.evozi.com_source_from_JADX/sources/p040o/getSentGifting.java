package p040o;

import com.scb.phone.view.custom.common.UnitsEditText;
import java.math.BigDecimal;
import p040o.C6510x49ff895f;

/* renamed from: o.getSentGifting */
public final /* synthetic */ class getSentGifting implements C6510x49ff895f.IconCompatParcelizer {
    private final /* synthetic */ UnitsEditText MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getSentGifting(UnitsEditText unitsEditText) {
        this.MediaBrowserCompat$ItemReceiver = unitsEditText;
    }

    public final void IconCompatParcelizer(BigDecimal bigDecimal) {
        UnitsEditText.read(this.MediaBrowserCompat$ItemReceiver, bigDecimal);
    }
}

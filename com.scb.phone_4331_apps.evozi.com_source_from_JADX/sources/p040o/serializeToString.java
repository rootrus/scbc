package p040o;

import android.location.Location;

/* renamed from: o.serializeToString */
public final /* synthetic */ class serializeToString implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ serializeToString read = new serializeToString();

    private /* synthetic */ serializeToString() {
    }

    public final Object write(Object obj) {
        Location location = (Location) obj;
        return new zzro(location.getLatitude(), location.getLongitude(), (double) location.getAccuracy());
    }
}

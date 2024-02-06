package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.RegistrationMethods;

/* renamed from: o.zzfn */
public final /* synthetic */ class zzfn implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ RegistrationMethods.Builder read;

    public /* synthetic */ zzfn(RegistrationMethods.Builder builder) {
        this.read = builder;
    }

    public final Object write(Object obj) {
        setRotateGesturesEnabled setrotategesturesenabled;
        RegistrationMethods.Builder builder = this.read;
        zzah zzah = (zzah) ((SingleDataEntity) obj).getData();
        if (zzah == null) {
            return new setIndoorLevelPickerEnabled();
        }
        String str = zzah.IconCompatParcelizer;
        double d = 0.0d;
        double doubleValue = str != null ? Double.valueOf(str).doubleValue() : 0.0d;
        String str2 = zzah.MediaDescriptionCompat;
        double doubleValue2 = str2 != null ? Double.valueOf(str2).doubleValue() : 0.0d;
        String str3 = zzah.MediaBrowserCompat$SearchResultReceiver;
        double doubleValue3 = str3 != null ? Double.valueOf(str3).doubleValue() : 0.0d;
        String str4 = zzah.RatingCompat;
        double doubleValue4 = str4 != null ? Double.valueOf(str4).doubleValue() : 0.0d;
        String str5 = zzah.MediaMetadataCompat;
        if (str5 != null) {
            d = Double.valueOf(str5).doubleValue();
        }
        double d2 = d;
        uncaughtException uncaughtexception = zzah.write;
        setRotateGesturesEnabled setrotategesturesenabled2 = null;
        if (uncaughtexception != null) {
            setrotategesturesenabled = new setRotateGesturesEnabled(uncaughtexception.MediaBrowserCompat$CustomActionResultReceiver, uncaughtexception.write, uncaughtexception.MediaBrowserCompat$ItemReceiver);
        } else {
            setrotategesturesenabled = null;
        }
        uncaughtException uncaughtexception2 = zzah.MediaBrowserCompat$ItemReceiver;
        if (uncaughtexception2 != null) {
            setrotategesturesenabled2 = new setRotateGesturesEnabled(uncaughtexception2.MediaBrowserCompat$CustomActionResultReceiver, uncaughtexception2.write, uncaughtexception2.MediaBrowserCompat$ItemReceiver);
        }
        return new setIndoorLevelPickerEnabled(doubleValue, doubleValue2, doubleValue3, doubleValue4, d2, setrotategesturesenabled, setrotategesturesenabled2, builder.write(zzah.MediaBrowserCompat$CustomActionResultReceiver), zzah.read, zzah.MediaBrowserCompat$MediaItem);
    }
}

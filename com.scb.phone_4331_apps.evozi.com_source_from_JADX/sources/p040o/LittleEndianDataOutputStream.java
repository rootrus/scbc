package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;
import p040o.zzbt;

/* renamed from: o.LittleEndianDataOutputStream */
public final class LittleEndianDataOutputStream extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public LittleEndianDataOutputStream(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.LittleEndianDataOutputStream$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ getAccountTypesSet read;

        private write() {
        }

        public /* synthetic */ write(getAccountTypesSet getaccounttypesset) {
            this.read = getaccounttypesset;
        }

        public final Object IconCompatParcelizer(Object obj) {
            getAccountTypesSet getaccounttypesset = this.read;
            rawResCacheKey rawrescachekey = (rawResCacheKey) obj;
            zzbt$zze$MediaBrowserCompat$CustomActionResultReceiver zzbt_zze_mediabrowsercompat_customactionresultreceiver = new zzbt$zze$MediaBrowserCompat$CustomActionResultReceiver();
            zzbt_zze_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = getAccountTypesSet.write(rawrescachekey.read, new lambdaFactory$$MediaBrowserCompat$ItemReceiver(getaccounttypesset));
            String str = rawrescachekey.IconCompatParcelizer;
            double d = 0.0d;
            zzbt_zze_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = Double.valueOf(str != null ? Double.valueOf(str).doubleValue() : 0.0d);
            String str2 = rawrescachekey.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                d = Double.valueOf(str2).doubleValue();
            }
            zzbt_zze_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = Double.valueOf(d);
            return new zzbt.zze(zzbt_zze_mediabrowsercompat_customactionresultreceiver, (byte) 0);
        }
    }

    public static setLog IconCompatParcelizer(GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        String str;
        GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener2 = onIndoorStateChangeListener;
        String str2 = onIndoorStateChangeListener2.MediaMetadataCompat;
        String str3 = onIndoorStateChangeListener2.ParcelableVolumeInfo;
        String str4 = onIndoorStateChangeListener2.MediaBrowserCompat$ItemReceiver;
        String str5 = onIndoorStateChangeListener2.MediaSessionCompat$Token;
        String str6 = onIndoorStateChangeListener2.RatingCompat;
        String str7 = onIndoorStateChangeListener2.f2717x50fd9e4a;
        String str8 = onIndoorStateChangeListener2.write;
        String str9 = onIndoorStateChangeListener2.MediaBrowserCompat$MediaItem;
        String str10 = onIndoorStateChangeListener2.MediaBrowserCompat$CustomActionResultReceiver;
        String str11 = onIndoorStateChangeListener2.MediaSessionCompat$ResultReceiverWrapper;
        String str12 = onIndoorStateChangeListener2.MediaDescriptionCompat;
        String str13 = onIndoorStateChangeListener2.IconCompatParcelizer;
        String str14 = onIndoorStateChangeListener2.MediaBrowserCompat$SearchResultReceiver;
        List<String> list = onIndoorStateChangeListener2.read;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!GoodToKnowActivity.read((String) next)) {
                    arrayList.add(next);
                }
            }
            str = AlertController$RecycleListView.write((List<String>) (List) arrayList, "\n");
        } else {
            str = null;
        }
        return new setLog(str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str);
    }
}

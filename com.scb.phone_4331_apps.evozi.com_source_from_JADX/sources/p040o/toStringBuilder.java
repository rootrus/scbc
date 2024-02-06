package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session;
import p040o.SignedBytes;
import p040o.zzev;

/* renamed from: o.toStringBuilder */
public class toStringBuilder extends SignedBytes.LexicographicalComparator {
    private final String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public toStringBuilder(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str2) {
        super(resources, sharedPreferences, str2);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "language");
        onGetStartedClick.write((Object) str2, "baseAssetsURL");
        this.read = str;
    }

    public final List<setGenerator> IconCompatParcelizer(List<? extends PlacePhotoMetadataResult> list, boolean z) {
        onGetStartedClick.write((Object) list, "tiles");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (write((PlacePhotoMetadataResult) next)) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (PlacePhotoMetadataResult MediaBrowserCompat$CustomActionResultReceiver : (List) arrayList) {
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList2, MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver, z, (PlacePhotoMetadataResult) null));
        }
        return (List) arrayList2;
    }

    public final List<setGenerator> MediaBrowserCompat$CustomActionResultReceiver(PlacePhotoMetadataResult placePhotoMetadataResult, boolean z, PlacePhotoMetadataResult placePhotoMetadataResult2) {
        onGetStartedClick.write((Object) placePhotoMetadataResult, "tile");
        List<setGenerator> MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver(placePhotoMetadataResult));
        if (placePhotoMetadataResult2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver(placePhotoMetadataResult2));
        }
        String str = placePhotoMetadataResult.setShortcut;
        if (str != null) {
            switch (str.hashCode()) {
                case -2131401768:
                    if (str.equals("FUNCTION")) {
                        MediaBrowserCompat$CustomActionResultReceiver.add(IconCompatParcelizer(placePhotoMetadataResult, z));
                        break;
                    }
                    break;
                case -1842543390:
                    if (str.equals("CARD_TILE_CAROUSEL")) {
                        List<zzvm> list = placePhotoMetadataResult.MediaBrowserCompat$ItemReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) list, "tile.adsList");
                        MediaBrowserCompat$CustomActionResultReceiver.add(new AutoValue_CrashlyticsReport_Session.Builder(placePhotoMetadataResult, MediaBrowserCompat$ItemReceiver(list), placePhotoMetadataResult.AlertController$RecycleListView));
                        break;
                    }
                    break;
                case 465373944:
                    if (str.equals("CARD_TILE_VERTICAL")) {
                        List<PlacePhotoMetadataResult> list2 = placePhotoMetadataResult.setGroupDividerEnabled;
                        onGetStartedClick.IconCompatParcelizer((Object) list2, "tile.tiles");
                        MediaBrowserCompat$CustomActionResultReceiver.addAll(write(list2, z));
                        break;
                    }
                    break;
                case 1729844006:
                    if (str.equals("CARD_TILE_HORIZONTAL")) {
                        MediaBrowserCompat$CustomActionResultReceiver.add(read(placePhotoMetadataResult, z));
                        break;
                    }
                    break;
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    private final List<setCrashed> write(List<? extends PlacePhotoMetadataResult> list, boolean z) {
        Iterable<PlacePhotoMetadataResult> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (PlacePhotoMetadataResult IconCompatParcelizer2 : iterable) {
            arrayList.add(IconCompatParcelizer(IconCompatParcelizer2, z));
        }
        return HmlNTBBusinessURLInformationActivity.write((List) arrayList, new IconCompatParcelizer());
    }

    private final List<isCrashed> MediaBrowserCompat$ItemReceiver(List<zzvm> list) {
        String str;
        int i = 10;
        Iterable<zzvm> MediaBrowserCompat$ItemReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list, 10);
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "$this$collectionSizeOrDefault");
        if (MediaBrowserCompat$ItemReceiver instanceof Collection) {
            i = ((Collection) MediaBrowserCompat$ItemReceiver).size();
        }
        Collection arrayList = new ArrayList(i);
        for (zzvm zzvm : MediaBrowserCompat$ItemReceiver) {
            toStringBuilder tostringbuilder = this;
            String str2 = zzvm.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
            String str3 = zzvm.MediaDescriptionCompat.read;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) tostringbuilder.read, (Object) "th")) {
                str2 = str3;
            }
            if (str2 == null) {
                str2 = "";
            }
            String c_ = tostringbuilder.mo26549c_(str2);
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(adsBan…dsBannerInfo.imageUrl.en)");
            int i2 = Iterables$3$MediaBrowserCompat$ItemReceiver.donations_place_holder;
            String str4 = zzvm.MediaBrowserCompat$ItemReceiver;
            String str5 = zzvm.write;
            String str6 = zzvm.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            String str7 = zzvm.IconCompatParcelizer.read;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) tostringbuilder.read, (Object) "th")) {
                str6 = str7;
            }
            if (str6 == null) {
                str = "";
            } else {
                str = str6;
            }
            arrayList.add(new isCrashed(c_, i2, str4, str5, str));
        }
        return (List) arrayList;
    }

    /* renamed from: o.toStringBuilder$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((setGenerator) t).MediaBrowserCompat$SearchResultReceiver);
            Comparable valueOf2 = Integer.valueOf(((setGenerator) t2).MediaBrowserCompat$SearchResultReceiver);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /* renamed from: o.toStringBuilder$read */
    public static final class read implements findFragmentByWho {
        private final /* synthetic */ setForNewAccount read;

        private read() {
        }

        public /* synthetic */ read(setForNewAccount setfornewaccount) {
            this.read = setfornewaccount;
        }

        public final Object IconCompatParcelizer(Object obj) {
            stop stop = (stop) obj;
            zzev$zzb$MediaBrowserCompat$CustomActionResultReceiver zzev_zzb_mediabrowsercompat_customactionresultreceiver = new zzev$zzb$MediaBrowserCompat$CustomActionResultReceiver();
            zzev_zzb_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = stop.IconCompatParcelizer;
            zzev_zzb_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = stop.MediaBrowserCompat$CustomActionResultReceiver;
            zzev_zzb_mediabrowsercompat_customactionresultreceiver.read = stop.read;
            return new zzev.zzb(zzev_zzb_mediabrowsercompat_customactionresultreceiver);
        }
    }

    private static boolean write(PlacePhotoMetadataResult placePhotoMetadataResult) {
        String str;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) placePhotoMetadataResult.setItemInvoker, (Object) "GROUP") || (str = placePhotoMetadataResult.setShortcut) == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1842543390) {
            if (hashCode != 465373944) {
                if (hashCode != 1729844006 || !str.equals("CARD_TILE_HORIZONTAL")) {
                    return false;
                }
            } else if (!str.equals("CARD_TILE_VERTICAL")) {
                return false;
            }
            Collection collection = placePhotoMetadataResult.setGroupDividerEnabled;
            if (collection == null || collection.isEmpty()) {
                return false;
            }
        } else if (!str.equals("CARD_TILE_CAROUSEL")) {
            return false;
        } else {
            List<zzvm> list = placePhotoMetadataResult.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) list, "tile.adsList");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                zzvm zzvm = (zzvm) next;
                onGetStartedClick.write((Object) zzvm, "ad");
                if (zzvm.MediaBrowserCompat$MediaItem == zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE) {
                    arrayList.add(next);
                }
            }
            if (((List) arrayList).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private final AutoValue_CrashlyticsReport_Session.C30631 MediaBrowserCompat$CustomActionResultReceiver(PlacePhotoMetadataResult placePhotoMetadataResult) {
        String str = placePhotoMetadataResult.setIcon;
        String str2 = placePhotoMetadataResult.ActionMenuItemView;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) "th")) {
            str = str2;
        }
        if (str == null) {
            str = "";
        }
        return new setGenerator(placePhotoMetadataResult, str, placePhotoMetadataResult.AlertController$RecycleListView) {
            public final String IconCompatParcelizer;
        };
    }

    private final setApp read(PlacePhotoMetadataResult placePhotoMetadataResult, boolean z) {
        List<PlacePhotoMetadataResult> list = placePhotoMetadataResult.setGroupDividerEnabled;
        onGetStartedClick.IconCompatParcelizer((Object) list, "tile.tiles");
        Iterable<PlacePhotoMetadataResult> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (PlacePhotoMetadataResult placePhotoMetadataResult2 : iterable) {
            onGetStartedClick.IconCompatParcelizer((Object) placePhotoMetadataResult2, "it");
            arrayList.add(IconCompatParcelizer(placePhotoMetadataResult2, z));
        }
        return new setApp(placePhotoMetadataResult, (List) arrayList, placePhotoMetadataResult.AlertController$RecycleListView);
    }

    private final setCrashed IconCompatParcelizer(PlacePhotoMetadataResult placePhotoMetadataResult, boolean z) {
        String str;
        setIdentifier setidentifier;
        String c_ = mo26549c_(placePhotoMetadataResult.f2771x50fd9e4a);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "it");
        if (!(c_.length() > 0)) {
            c_ = null;
        }
        String str2 = c_;
        String str3 = placePhotoMetadataResult.setIcon;
        String str4 = placePhotoMetadataResult.ActionMenuItemView;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) "th")) {
            str3 = str4;
        }
        String str5 = str3 == null ? "" : str3;
        String str6 = placePhotoMetadataResult.setHasDecor;
        String str7 = placePhotoMetadataResult.PlaybackStateCompat;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) "th")) {
            str6 = str7;
        }
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        boolean z2 = placePhotoMetadataResult.MediaSessionCompat$QueueItem == 1;
        if (z) {
            setidentifier = setIdentifier.NTB;
        } else {
            setidentifier = setIdentifier.ETB;
        }
        return new setCrashed(placePhotoMetadataResult, str2, str5, str, z2, setidentifier, placePhotoMetadataResult.AlertController$RecycleListView);
    }

    public final String IconCompatParcelizer(PlacePhotoMetadataResult placePhotoMetadataResult) {
        String str;
        String str2 = null;
        if (placePhotoMetadataResult != null) {
            str = placePhotoMetadataResult.AppCompatActivity;
        } else {
            str = null;
        }
        if (placePhotoMetadataResult != null) {
            str2 = placePhotoMetadataResult.AppCompatDelegateImpl$ListMenuDecorView;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) "th")) {
            str = str2;
        }
        return str == null ? "" : str;
    }

    public final String MediaBrowserCompat$ItemReceiver(PlacePhotoMetadataResult placePhotoMetadataResult) {
        String str;
        String str2 = null;
        if (placePhotoMetadataResult != null) {
            str = placePhotoMetadataResult.setIcon;
        } else {
            str = null;
        }
        if (placePhotoMetadataResult != null) {
            str2 = placePhotoMetadataResult.ActionMenuItemView;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) "th")) {
            str = str2;
        }
        return str == null ? "" : str;
    }
}

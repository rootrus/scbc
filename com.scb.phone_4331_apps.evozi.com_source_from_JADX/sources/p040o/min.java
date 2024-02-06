package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AnalyticsConnectorReceiver;
import p040o.AnalyticsReceiver;
import p040o.zzcb;

/* renamed from: o.min */
public final class min extends constrainedListMultimap {
    private static final List<AnalyticsReceiver.CrashlyticsOriginEventListener> IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public min(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.min$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ retrieveData MediaBrowserCompat$ItemReceiver;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(retrieveData retrievedata) {
            this.MediaBrowserCompat$ItemReceiver = retrievedata;
        }

        public final Object IconCompatParcelizer(Object obj) {
            getFonts getfonts = (getFonts) obj;
            activate activate = new activate();
            activate.MediaBrowserCompat$ItemReceiver = getfonts.write;
            activate.MediaDescriptionCompat = getfonts.IconCompatParcelizer.IconCompatParcelizer();
            activate.MediaBrowserCompat$SearchResultReceiver = getfonts.IconCompatParcelizer.write();
            activate.MediaBrowserCompat$MediaItem = FragmentBuilder_BindSummaryFragment.write(getfonts.MediaDescriptionCompat, (OffsetDateTime) null);
            activate.ParcelableVolumeInfo = getfonts.MediaDescriptionCompat;
            activate.MediaBrowserCompat$CustomActionResultReceiver = isFlat.read(getfonts.MediaBrowserCompat$MediaItem);
            activate.MediaSessionCompat$ResultReceiverWrapper = getfonts.RatingCompat;
            activate.RatingCompat = getfonts.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            activate.MediaMetadataCompat = getfonts.MediaBrowserCompat$ItemReceiver.write();
            activate.write = getfonts.read;
            activate.read = getfonts.MediaBrowserCompat$CustomActionResultReceiver;
            activate.f2796x50fd9e4a = getfonts.MediaMetadataCompat;
            return activate;
        }
    }

    static {
        AnalyticsReceiver.CrashlyticsOriginEventListener[] crashlyticsOriginEventListenerArr = {AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_NATIONAL_ID, AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_TITLE, AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_FIRST_NAME, AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_LAST_NAME};
        onGetStartedClick.write((Object) crashlyticsOriginEventListenerArr, "elements");
        onGetStartedClick.write((Object) crashlyticsOriginEventListenerArr, "$this$asList");
        List<AnalyticsReceiver.CrashlyticsOriginEventListener> asList = Arrays.asList(crashlyticsOriginEventListenerArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        IconCompatParcelizer = asList;
    }

    public final List<onCrashlyticsOriginEvent> read(List<zzcb.zza> list) {
        List<String> list2;
        List<onCrashlyticsOriginEvent> arrayList = new ArrayList<>();
        for (zzcb.zza zza : HmlNTBBusinessURLInformationActivity.write(list, new read())) {
            C3017x4396634b analyticsReceiver$CrashlyticsOriginEventListener$MediaBrowserCompat$CustomActionResultReceiver = AnalyticsReceiver.CrashlyticsOriginEventListener.Companion;
            AnalyticsReceiver.CrashlyticsOriginEventListener IconCompatParcelizer2 = C3017x4396634b.IconCompatParcelizer(zza.write);
            if (IconCompatParcelizer2 != null) {
                int i = identityHashCode.read[IconCompatParcelizer2.ordinal()];
                if (i == 1) {
                    String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.company_name_inline_error);
                    onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.company_name_inline_error)");
                    arrayList.add(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, zza, string, 1, this.MediaBrowserCompat$CustomActionResultReceiver.getInteger(Iterables$3$MediaBrowserCompat$CustomActionResultReceiver.scb_one_company_name_counter_max), "^[0-9\\u0E01-\\u0E39\\u0E40-\\u0E4Ca-zA-Z _*\"#&()@,.'\\-/]+$"));
                } else if (i == 2) {
                    String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.business_and_marital_number_of_employees_inline_error);
                    onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.busin…f_employees_inline_error)");
                    arrayList.add(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, zza, string2, 2, this.MediaBrowserCompat$CustomActionResultReceiver.getInteger(Iterables$3$MediaBrowserCompat$CustomActionResultReceiver.scb_one_number_employee_limit), "^[0-9]+$"));
                } else if (i == 3) {
                    zzcb.zza.C10764zza MediaDescriptionCompat2 = MediaDescriptionCompat(zza.MediaBrowserCompat$CustomActionResultReceiver);
                    String str = zza.read;
                    String IconCompatParcelizer3 = IconCompatParcelizer(MediaDescriptionCompat2);
                    String str2 = null;
                    if (MediaDescriptionCompat2 != null) {
                        list2 = MediaDescriptionCompat2.MediaBrowserCompat$ItemReceiver;
                    } else {
                        list2 = null;
                    }
                    Collection collection = list2;
                    if (!(collection == null || collection.isEmpty()) && list2.size() >= 2) {
                        str2 = MediaDescriptionCompat2.MediaBrowserCompat$ItemReceiver.get(1);
                    }
                    arrayList.add(new getHttpRequest(IconCompatParcelizer2, str, IconCompatParcelizer3, str2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: o.min$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((zzcb.zza.C10764zza) t).read);
            Comparable valueOf2 = Integer.valueOf(((zzcb.zza.C10764zza) t2).read);
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

    /* renamed from: o.min$MediaMetadataCompat */
    public static final class MediaMetadataCompat<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((zzcb.zza.C10764zza) t).read);
            Comparable valueOf2 = Integer.valueOf(((zzcb.zza.C10764zza) t2).read);
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

    /* renamed from: o.min$read */
    public static final class read<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((zzcb.zza) t).IconCompatParcelizer);
            Comparable valueOf2 = Integer.valueOf(((zzcb.zza) t2).IconCompatParcelizer);
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

    /* renamed from: o.min$write */
    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((zzcb.zza) t).IconCompatParcelizer);
            Comparable valueOf2 = Integer.valueOf(((zzcb.zza) t2).IconCompatParcelizer);
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

    public final List<onCrashlyticsOriginEvent> MediaBrowserCompat$CustomActionResultReceiver(List<zzcb.zza> list) {
        List<onCrashlyticsOriginEvent> arrayList = new ArrayList<>();
        for (zzcb.zza zza : HmlNTBBusinessURLInformationActivity.write(list, new write())) {
            C3017x4396634b analyticsReceiver$CrashlyticsOriginEventListener$MediaBrowserCompat$CustomActionResultReceiver = AnalyticsReceiver.CrashlyticsOriginEventListener.Companion;
            AnalyticsReceiver.CrashlyticsOriginEventListener IconCompatParcelizer2 = C3017x4396634b.IconCompatParcelizer(zza.write);
            if (IconCompatParcelizer2 != null) {
                int i = identityHashCode.IconCompatParcelizer[IconCompatParcelizer2.ordinal()];
                if (i == 1) {
                    String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.business_and_marital_national_id_inline_error);
                    onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.busin…national_id_inline_error)");
                    arrayList.add(new AutoValue_CrashlyticsReportWithSessionId(IconCompatParcelizer2, zza.read, zza.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$MediaItem(zza.MediaBrowserCompat$CustomActionResultReceiver), string, 2, this.MediaBrowserCompat$CustomActionResultReceiver.getInteger(Iterables$3$MediaBrowserCompat$CustomActionResultReceiver.scb_one_id_card_limit), "^[0-9]+$"));
                } else if (i == 2) {
                    String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.business_and_marital_must_be_thai_inline_error);
                    onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.busin…ust_be_thai_inline_error)");
                    arrayList.add(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, zza, string2, 1, this.MediaBrowserCompat$CustomActionResultReceiver.getInteger(Iterables$3$MediaBrowserCompat$CustomActionResultReceiver.scb_one_first_name_limit), "^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$"));
                } else if (i == 3) {
                    String string3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.business_and_marital_must_be_thai_inline_error);
                    onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(R.string.busin…ust_be_thai_inline_error)");
                    arrayList.add(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, zza, string3, 1, this.MediaBrowserCompat$CustomActionResultReceiver.getInteger(Iterables$3$MediaBrowserCompat$CustomActionResultReceiver.scb_one_last_name_limit), "^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$"));
                } else if (i == 4) {
                    List<zzcb.zza.C10764zza> list2 = zza.MediaBrowserCompat$CustomActionResultReceiver;
                    arrayList.add(new AppData(IconCompatParcelizer2, zza.read, zza.MediaBrowserCompat$ItemReceiver, RatingCompat(list2), MediaBrowserCompat$SearchResultReceiver(list2), MediaBrowserCompat$MediaItem(list2)));
                } else if (i == 5) {
                    List<zzcb.zza.C10764zza> list3 = zza.MediaBrowserCompat$CustomActionResultReceiver;
                    arrayList.add(new AbstractSpiCall(IconCompatParcelizer2, zza.read, MediaMetadataCompat(list3), MediaBrowserCompat$MediaItem(list3)));
                }
            }
        }
        return arrayList;
    }

    private static List<overrideProtocolAndHost> MediaMetadataCompat(List<zzcb.zza.C10764zza> list) {
        Iterable<zzcb.zza.C10764zza> write2 = HmlNTBBusinessURLInformationActivity.write(list, new MediaMetadataCompat());
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(write2 instanceof Collection ? ((Collection) write2).size() : 10);
        for (zzcb.zza.C10764zza zza : write2) {
            arrayList.add(new overrideProtocolAndHost((String) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(zza.MediaBrowserCompat$ItemReceiver), (String) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(zza.MediaBrowserCompat$CustomActionResultReceiver)));
        }
        return (List) arrayList;
    }

    private static List<String> RatingCompat(List<zzcb.zza.C10764zza> list) {
        Iterable<zzcb.zza.C10764zza> write2 = HmlNTBBusinessURLInformationActivity.write(list, new MediaDescriptionCompat());
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(write2 instanceof Collection ? ((Collection) write2).size() : 10);
        for (zzcb.zza.C10764zza zza : write2) {
            arrayList.add((String) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(zza.MediaBrowserCompat$ItemReceiver));
        }
        return (List) arrayList;
    }

    private static List<String> MediaBrowserCompat$SearchResultReceiver(List<zzcb.zza.C10764zza> list) {
        Iterable<zzcb.zza.C10764zza> write2 = HmlNTBBusinessURLInformationActivity.write(list, new min$MediaBrowserCompat$CustomActionResultReceiver());
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(write2 instanceof Collection ? ((Collection) write2).size() : 10);
        for (zzcb.zza.C10764zza zza : write2) {
            arrayList.add((String) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(zza.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return (List) arrayList;
    }

    private final String MediaBrowserCompat$MediaItem(List<zzcb.zza.C10764zza> list) {
        return IconCompatParcelizer(MediaDescriptionCompat(list));
    }

    private static zzcb.zza.C10764zza MediaDescriptionCompat(List<zzcb.zza.C10764zza> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zzcb.zza.C10764zza) obj).IconCompatParcelizer) {
                break;
            }
        }
        return (zzcb.zza.C10764zza) obj;
    }

    public static List<onCrashlyticsOriginEvent> write(List<? extends onCrashlyticsOriginEvent> list) {
        onGetStartedClick.write((Object) list, "displayList");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (IconCompatParcelizer.contains(((onCrashlyticsOriginEvent) next).MediaBrowserCompat$ItemReceiver)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public static List<onCrashlyticsOriginEvent> MediaBrowserCompat$ItemReceiver(List<? extends onCrashlyticsOriginEvent> list) {
        onGetStartedClick.write((Object) list, "displayList");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (!IconCompatParcelizer.contains(((onCrashlyticsOriginEvent) next).MediaBrowserCompat$ItemReceiver)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public static List<onCrashlyticsOriginEvent> write(List<? extends onCrashlyticsOriginEvent> list, List<? extends onCrashlyticsOriginEvent> list2) {
        onGetStartedClick.write((Object) list, "displayList");
        onGetStartedClick.write((Object) list2, "filterList");
        List[] listArr = {list, list2};
        onGetStartedClick.write((Object) listArr, "elements");
        onGetStartedClick.write((Object) listArr, "$this$asList");
        List asList = Arrays.asList(listArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        Iterable<Iterable> iterable = asList;
        onGetStartedClick.write((Object) iterable, "$this$flatten");
        ArrayList arrayList = new ArrayList();
        for (Iterable MediaBrowserCompat$CustomActionResultReceiver : iterable) {
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList, MediaBrowserCompat$CustomActionResultReceiver);
        }
        return arrayList;
    }

    private static String IconCompatParcelizer(zzcb.zza.C10764zza zza) {
        List<String> list;
        String str = null;
        if (zza != null) {
            list = zza.MediaBrowserCompat$ItemReceiver;
        } else {
            list = null;
        }
        if (list != null) {
            onGetStartedClick.write((Object) list, "$this$firstOrNull");
            if (!list.isEmpty()) {
                str = list.get(0);
            }
            String str2 = str;
            return str2 == null ? "" : str2;
        }
    }

    private final AnalyticsConnectorReceiver.BreadcrumbHandler MediaBrowserCompat$ItemReceiver(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, zzcb.zza zza, String str, int i, int i2, String str2) {
        return new AnalyticsConnectorReceiver.BreadcrumbHandler(crashlyticsOriginEventListener, zza.read, zza.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer(MediaDescriptionCompat(zza.MediaBrowserCompat$CustomActionResultReceiver)), str, i, i2, str2);
    }
}

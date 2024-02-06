package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LottieDrawable;
import p040o.zzcb;

/* renamed from: o.getFamilyName */
public final class getFamilyName extends FragmentBuilder_BindSummaryFragment {
    public final List<zzcb.zzb> MediaBrowserCompat$CustomActionResultReceiver(List<LottieDrawable.C361410> list) {
        if (list != null) {
            Iterable<LottieDrawable.C361410> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (LottieDrawable.C361410 r1 : iterable) {
                String str = r1.read;
                if (str != null) {
                    String str2 = r1.MediaBrowserCompat$ItemReceiver;
                    if (str2 != null) {
                        Integer num = r1.MediaBrowserCompat$CustomActionResultReceiver;
                        if (num != null) {
                            int intValue = num.intValue();
                            arrayList.add(new zzcb.zzb(str, str2, r1.IconCompatParcelizer, read(r1.write), intValue));
                        } else {
                            throw new EntityMappingException("component.sequence can't be null");
                        }
                    } else {
                        throw new EntityMappingException("component.label can't be null");
                    }
                } else {
                    throw new EntityMappingException("component.key can't be null");
                }
            }
            return (List) arrayList;
        }
        throw new EntityMappingException("component can't be null");
    }

    private final List<zzcb.zza> read(List<LottieDrawable.C361713> list) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            Iterable<LottieDrawable.C361713> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (LottieDrawable.C361713 IconCompatParcelizer : iterable) {
                arrayList.add(IconCompatParcelizer(IconCompatParcelizer));
            }
            return (List) arrayList;
        }
        throw new EntityMappingException("component.sectionInfo can't be null");
    }

    private static zzcb.zza.C10764zza IconCompatParcelizer(LottieDrawable.C361814 r11) {
        List<String> list = r11.write;
        if (list != null) {
            Iterable<String> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            int i = 10;
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (String add : iterable) {
                arrayList.add(add);
            }
            List list2 = (List) arrayList;
            List<String> list3 = r11.MediaBrowserCompat$CustomActionResultReceiver;
            if (list3 != null) {
                Iterable<String> iterable2 = list3;
                onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
                if (iterable2 instanceof Collection) {
                    i = ((Collection) iterable2).size();
                }
                Collection arrayList2 = new ArrayList(i);
                for (String add2 : iterable2) {
                    arrayList2.add(add2);
                }
                List list4 = (List) arrayList2;
                Integer num = r11.MediaBrowserCompat$ItemReceiver;
                if (num != null) {
                    int intValue = num.intValue();
                    Boolean bool = r11.read;
                    if (bool != null) {
                        return new zzcb.zza.C10764zza(list4, list2, bool.booleanValue(), intValue, r11.IconCompatParcelizer);
                    }
                    throw new EntityMappingException("value.selectedOption can't be null");
                }
                throw new EntityMappingException("value.sequence can't be null");
            }
            throw new EntityMappingException("value.rawValue can't be null");
        }
        throw new EntityMappingException("value.displayValue can't be null");
    }

    private static zzcb.zza IconCompatParcelizer(LottieDrawable.C361713 r7) {
        String str = r7.read;
        if (str != null) {
            String str2 = r7.IconCompatParcelizer;
            if (str2 != null) {
                Integer num = r7.MediaBrowserCompat$CustomActionResultReceiver;
                if (num != null) {
                    int intValue = num.intValue();
                    List<LottieDrawable.C361814> list = r7.RatingCompat;
                    if (list != null) {
                        Iterable<LottieDrawable.C361814> iterable = list;
                        int i = 10;
                        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                        if (iterable instanceof Collection) {
                            i = ((Collection) iterable).size();
                        }
                        Collection arrayList = new ArrayList(i);
                        for (LottieDrawable.C361814 IconCompatParcelizer : iterable) {
                            arrayList.add(IconCompatParcelizer(IconCompatParcelizer));
                        }
                        return new zzcb.zza(str, str2, intValue, (List) arrayList, r7.MediaBrowserCompat$ItemReceiver, r7.write);
                    }
                    throw new EntityMappingException("sectionInfo.value can't be null");
                }
                throw new EntityMappingException("sectionInfo.sequence can't be null");
            }
            throw new EntityMappingException("sectionInfo.label can't be null");
        }
        throw new EntityMappingException("sectionInfo.key can't be null");
    }
}

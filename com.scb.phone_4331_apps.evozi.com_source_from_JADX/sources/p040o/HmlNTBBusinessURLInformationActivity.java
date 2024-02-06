package p040o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;

/* renamed from: o.HmlNTBBusinessURLInformationActivity */
public final class HmlNTBBusinessURLInformationActivity extends HmlNTBPinConsentPresenterModule {

    /* renamed from: o.HmlNTBBusinessURLInformationActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements BaseJuristicPinActivity_ViewBinding<T> {
        private /* synthetic */ Iterable MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(Iterable iterable) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iterable;
        }

        public final Iterator<T> read() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.iterator();
        }
    }

    private static <T> T MediaBrowserCompat$SearchResultReceiver(Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$first");
        if (iterable instanceof List) {
            return MediaBrowserCompat$ItemReceiver((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T MediaBrowserCompat$ItemReceiver(List<? extends T> list) {
        onGetStartedClick.write((Object) list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T MediaBrowserCompat$CustomActionResultReceiver(List<? extends T> list, int i) {
        onGetStartedClick.write((Object) list, "$this$getOrNull");
        if (i >= 0) {
            onGetStartedClick.write((Object) list, "$this$lastIndex");
            if (i <= list.size() - 1) {
                return list.get(i);
            }
        }
        return null;
    }

    public static final <C extends Collection<? super T>, T> C MediaBrowserCompat$CustomActionResultReceiver(Iterable<? extends T> iterable, C c) {
        onGetStartedClick.write((Object) iterable, "$this$filterNotNullTo");
        onGetStartedClick.write((Object) c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    public static final <T extends Comparable<? super T>> List<T> IconCompatParcelizer(Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$sorted");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return MediaBrowserCompat$CustomActionResultReceiver(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                Comparable[] comparableArr = (Comparable[]) array;
                if (comparableArr != null) {
                    Object[] objArr = (Object[]) comparableArr;
                    onGetStartedClick.write((Object) objArr, "$this$sort");
                    if (objArr.length > 1) {
                        Arrays.sort(objArr);
                    }
                    onGetStartedClick.write((Object) objArr, "$this$asList");
                    List<T> asList = Arrays.asList(objArr);
                    onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                    return asList;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(iterable);
            onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "$this$sort");
            if (MediaBrowserCompat$ItemReceiver.size() > 1) {
                Collections.sort(MediaBrowserCompat$ItemReceiver);
            }
            return MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final <T> List<T> write(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        onGetStartedClick.write((Object) iterable, "$this$sortedWith");
        onGetStartedClick.write((Object) comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return MediaBrowserCompat$CustomActionResultReceiver(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                onGetStartedClick.write((Object) array, "$this$sortWith");
                onGetStartedClick.write((Object) comparator, "comparator");
                if (array.length > 1) {
                    Arrays.sort(array, comparator);
                }
                onGetStartedClick.write((Object) array, "$this$asList");
                List<T> asList = Arrays.asList(array);
                onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                return asList;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(iterable);
            onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "$this$sortWith");
            onGetStartedClick.write((Object) comparator, "comparator");
            if (MediaBrowserCompat$ItemReceiver.size() > 1) {
                Collections.sort(MediaBrowserCompat$ItemReceiver, comparator);
            }
            return MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final int[] IconCompatParcelizer(Collection<Integer> collection) {
        onGetStartedClick.write((Object) collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    public static <T, C extends Collection<? super T>> C IconCompatParcelizer(Iterable<? extends T> iterable, C c) {
        onGetStartedClick.write((Object) iterable, "$this$toCollection");
        onGetStartedClick.write((Object) c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    public static final <T> List<T> MediaBrowserCompat$CustomActionResultReceiver(Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return write(MediaBrowserCompat$ItemReceiver(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        if (size != 1) {
            onGetStartedClick.write((Object) collection, "$this$toMutableList");
            return new ArrayList<>(collection);
        }
        List<T> singletonList = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final <T> List<T> MediaBrowserCompat$ItemReceiver(Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$toMutableList");
        if (!(iterable instanceof Collection)) {
            return (List) IconCompatParcelizer(iterable, new ArrayList());
        }
        Collection collection = (Collection) iterable;
        onGetStartedClick.write((Object) collection, "$this$toMutableList");
        return new ArrayList<>(collection);
    }

    public static final <T> Set<T> write(Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$toSet");
        if (!(iterable instanceof Collection)) {
            return HmlNTBAccountSuccessActivity.MediaBrowserCompat$ItemReceiver((Set) IconCompatParcelizer(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (size != 1) {
            return (Set) IconCompatParcelizer(iterable, new LinkedHashSet(HmlNdidSelectIdpActivity.read(collection.size())));
        }
        Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        onGetStartedClick.IconCompatParcelizer((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    public static final <T extends Comparable<? super T>> T read(Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$min");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> List<T> MediaBrowserCompat$ItemReceiver(Collection<? extends T> collection, T t) {
        onGetStartedClick.write((Object) collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> write(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) collection, "$this$plus");
        onGetStartedClick.write((Object) iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        MediaBrowserCompat$CustomActionResultReceiver(arrayList2, iterable);
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static <T, A extends Appendable> A MediaBrowserCompat$CustomActionResultReceiver(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, FundFactSheetActivity<? super T, ? extends CharSequence> fundFactSheetActivity) {
        onGetStartedClick.write((Object) iterable, "$this$joinTo");
        onGetStartedClick.write((Object) a, "buffer");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            GoodToKnowActivity.IconCompatParcelizer(a, next, fundFactSheetActivity);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String MediaBrowserCompat$ItemReceiver(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, FundFactSheetActivity fundFactSheetActivity, int i2) {
        if ((i2 & 1) != 0) {
        }
        CharSequence charSequence5 = charSequence;
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        CharSequence charSequence6 = charSequence2;
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        CharSequence charSequence7 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence8 = charSequence4;
        if ((i2 & 32) != 0) {
            fundFactSheetActivity = null;
        }
        return write(iterable, charSequence5, charSequence6, charSequence7, i3, charSequence8, fundFactSheetActivity);
    }

    public static final <T> String write(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, FundFactSheetActivity<? super T, ? extends CharSequence> fundFactSheetActivity) {
        onGetStartedClick.write((Object) iterable, "$this$joinToString");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        String obj = ((StringBuilder) MediaBrowserCompat$CustomActionResultReceiver(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, fundFactSheetActivity)).toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "joinTo(StringBuilder(), …ed, transform).toString()");
        return obj;
    }

    public static final <T> List<T> MediaBrowserCompat$ItemReceiver(Iterable<? extends T> iterable, int i) {
        onGetStartedClick.write((Object) iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return MediaBrowserCompat$CustomActionResultReceiver(iterable);
                }
                if (i == 1) {
                    List<T> singletonList = Collections.singletonList(MediaBrowserCompat$SearchResultReceiver(iterable));
                    onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
                    return singletonList;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return write(arrayList);
        }
    }
}

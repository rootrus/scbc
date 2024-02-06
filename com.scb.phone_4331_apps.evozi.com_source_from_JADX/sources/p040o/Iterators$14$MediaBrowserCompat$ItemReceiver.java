package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.C10827Iterators;
import p040o.Maps;
import p040o.setTvRemark;

/* renamed from: o.Iterators$14$MediaBrowserCompat$ItemReceiver */
public final class Iterators$14$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends setTvRemark.write>, ensureReceiverRegistered> {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String MediaBrowserCompat$SearchResultReceiver;
    private /* synthetic */ C10827Iterators.C353914 RatingCompat;
    private /* synthetic */ boolean read = false;
    private /* synthetic */ ConcurrentHashMultiset write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Iterators$14$MediaBrowserCompat$ItemReceiver(C10827Iterators.C353914 r1, ConcurrentHashMultiset concurrentHashMultiset, String str, String str2, String str3, String str4, boolean z) {
        super(1);
        this.RatingCompat = r1;
        this.write = concurrentHashMultiset;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.IconCompatParcelizer = str4;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Double d;
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "it");
        Maps.C36412 r2 = this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.write.write;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        String str5 = this.IconCompatParcelizer;
        boolean z = this.read;
        onGetStartedClick.write((Object) list, "list");
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str4, "transferAmount");
        onGetStartedClick.write((Object) str5, "toAccountNumber");
        Iterable<setTvRemark.write> iterable = list;
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            obj2 = null;
        } else {
            obj2 = it.next();
            if (it.hasNext()) {
                double d2 = ((setTvRemark.write) obj2).MediaBrowserCompat$CustomActionResultReceiver;
                do {
                    Object next = it.next();
                    double d3 = ((setTvRemark.write) next).MediaBrowserCompat$CustomActionResultReceiver;
                    if (Double.compare(d2, d3) < 0) {
                        obj2 = next;
                        d2 = d3;
                    }
                } while (it.hasNext());
            }
        }
        setTvRemark.write write2 = (setTvRemark.write) obj2;
        Double valueOf = write2 != null ? Double.valueOf(write2.MediaBrowserCompat$CustomActionResultReceiver) : null;
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            obj3 = null;
        } else {
            obj3 = it2.next();
            if (it2.hasNext()) {
                double d4 = ((setTvRemark.write) obj3).MediaBrowserCompat$ItemReceiver;
                do {
                    Object next2 = it2.next();
                    Object obj5 = obj3;
                    double d5 = ((setTvRemark.write) next2).MediaBrowserCompat$ItemReceiver;
                    if (Double.compare(d4, d5) < 0) {
                        d4 = d5;
                        obj3 = next2;
                    } else {
                        obj3 = obj5;
                    }
                } while (it2.hasNext());
            }
        }
        setTvRemark.write write3 = (setTvRemark.write) obj3;
        Double valueOf2 = write3 != null ? Double.valueOf(write3.MediaBrowserCompat$ItemReceiver) : null;
        Iterator it3 = iterable.iterator();
        if (!it3.hasNext()) {
            obj4 = null;
        } else {
            obj4 = it3.next();
            if (it3.hasNext()) {
                double d6 = ((setTvRemark.write) obj4).write;
                do {
                    Object next3 = it3.next();
                    Object obj6 = next3;
                    double d7 = ((setTvRemark.write) next3).write;
                    if (Double.compare(d6, d7) < 0) {
                        d6 = d7;
                        obj4 = obj6;
                    }
                } while (it3.hasNext());
            }
        }
        setTvRemark.write write4 = (setTvRemark.write) obj4;
        if (write4 != null) {
            d = Double.valueOf(write4.write);
        } else {
            d = null;
        }
        ensureReceiverRegistered ensurereceiverregistered = new ensureReceiverRegistered();
        String write5 = Maps.C36412.write(valueOf);
        String str6 = "";
        if (write5 == null) {
            write5 = str6;
        }
        ensurereceiverregistered.MediaBrowserCompat$MediaItem = write5;
        String write6 = Maps.C36412.write(valueOf2);
        if (write6 == null) {
            write6 = str6;
        }
        ensurereceiverregistered.MediaMetadataCompat = write6;
        String write7 = Maps.C36412.write(d);
        if (write7 != null) {
            str6 = write7;
        }
        ensurereceiverregistered.MediaBrowserCompat$SearchResultReceiver = str6;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (setTvRemark.write write8 : iterable) {
            arrayList.add(Maps.C36412.write(write8));
        }
        ensurereceiverregistered.MediaDescriptionCompat = (List) arrayList;
        ensurereceiverregistered.MediaBrowserCompat$CustomActionResultReceiver = str;
        ensurereceiverregistered.write = str2;
        ensurereceiverregistered.MediaBrowserCompat$ItemReceiver = str3;
        ensurereceiverregistered.RatingCompat = str4;
        ensurereceiverregistered.read = str5;
        ensurereceiverregistered.IconCompatParcelizer = z;
        return ensurereceiverregistered;
    }
}

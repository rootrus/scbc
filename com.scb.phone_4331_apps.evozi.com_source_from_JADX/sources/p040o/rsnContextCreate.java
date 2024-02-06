package p040o;

import com.google.android.gms.maps.model.LatLng;
import com.scb.phone.data.p033di.easycash.C1067x8ceb5283;
import com.scb.phone.data.p033di.easycash.C1068xa4368296;
import com.scb.phone.data.p033di.search.SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.rsnElementGetSubElements;

/* renamed from: o.rsnContextCreate */
public final class rsnContextCreate<T extends IdCaptureBackActivity_MembersInjector> implements rsnClosureSetGlobal<T> {
    /* access modifiers changed from: private */
    public static final SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver(1.0d);
    private final rsnElementGetSubElements<read<T>> IconCompatParcelizer = new rsnElementGetSubElements<>();
    private final Collection<read<T>> read = new HashSet();
    private int write = 100;

    public final void IconCompatParcelizer(Collection<T> collection) {
        for (T read2 : collection) {
            read read3 = new read(read2, (byte) 0);
            synchronized (this.IconCompatParcelizer) {
                this.read.add(read3);
                rsnElementGetSubElements<read<T>> rsnelementgetsubelements = this.IconCompatParcelizer;
                C1068xa4368296 MediaBrowserCompat$CustomActionResultReceiver2 = read3.MediaBrowserCompat$CustomActionResultReceiver();
                if (rsnelementgetsubelements.write.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver)) {
                    rsnelementgetsubelements.read(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver, read3);
                }
            }
        }
    }

    public final void read() {
        synchronized (this.IconCompatParcelizer) {
            this.read.clear();
            rsnElementGetSubElements<read<T>> rsnelementgetsubelements = this.IconCompatParcelizer;
            rsnelementgetsubelements.read = null;
            Set<T> set = rsnelementgetsubelements.MediaBrowserCompat$CustomActionResultReceiver;
            if (set != null) {
                set.clear();
            }
        }
    }

    public final Set<? extends rsnClosureCreate<T>> MediaBrowserCompat$CustomActionResultReceiver(double d) {
        rsnContextCreate rsncontextcreate = this;
        double d2 = 2.0d;
        double pow = (((double) rsncontextcreate.write) / Math.pow(2.0d, (double) ((int) d))) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (rsncontextcreate.IconCompatParcelizer) {
            Iterator<read<T>> it = rsncontextcreate.read.iterator();
            while (it.hasNext()) {
                read next = it.next();
                if (!hashSet.contains(next)) {
                    C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver = next.write;
                    double d3 = pow / d2;
                    C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver = r15;
                    C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2 = new C1067x8ceb5283(easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer - d3, easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer + d3, easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver - d3, easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver + d3);
                    rsnElementGetSubElements<read<T>> rsnelementgetsubelements = rsncontextcreate.IconCompatParcelizer;
                    ArrayList arrayList = new ArrayList();
                    rsnelementgetsubelements.write(easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, arrayList);
                    if (arrayList.size() == 1) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                        d2 = 2.0d;
                    } else {
                        rsnContextSendMessage rsncontextsendmessage = new rsnContextSendMessage(next.read.MediaBrowserCompat$ItemReceiver());
                        hashSet2.add(rsncontextsendmessage);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            read read2 = (read) it2.next();
                            Double d4 = (Double) hashMap.get(read2);
                            C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2 = read2.write;
                            C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3 = next.write;
                            double d5 = pow;
                            Iterator<read<T>> it3 = it;
                            read read3 = next;
                            rsnContextSendMessage rsncontextsendmessage2 = rsncontextsendmessage;
                            Iterator it4 = it2;
                            double d6 = (easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer) * (easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer);
                            double d7 = easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver;
                            double d8 = easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver;
                            HashSet hashSet3 = hashSet;
                            double d9 = d6 + (d7 * (d8 - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver));
                            if (d4 != null) {
                                if (d4.doubleValue() < d9) {
                                    hashSet = hashSet3;
                                    pow = d5;
                                    it = it3;
                                    next = read3;
                                    rsncontextsendmessage = rsncontextsendmessage2;
                                    it2 = it4;
                                } else {
                                    ((rsnContextSendMessage) hashMap2.get(read2)).IconCompatParcelizer.remove(read2.read);
                                }
                            }
                            hashMap.put(read2, Double.valueOf(d9));
                            rsnContextSendMessage rsncontextsendmessage3 = rsncontextsendmessage2;
                            rsncontextsendmessage3.IconCompatParcelizer.add(read2.read);
                            hashMap2.put(read2, rsncontextsendmessage3);
                            rsncontextsendmessage = rsncontextsendmessage3;
                            hashSet = hashSet3;
                            pow = d5;
                            it = it3;
                            next = read3;
                            it2 = it4;
                        }
                        double d10 = pow;
                        Iterator<read<T>> it5 = it;
                        hashSet.addAll(arrayList);
                        d2 = 2.0d;
                        rsncontextcreate = this;
                        pow = d10;
                        it = it5;
                    }
                }
            }
        }
        return hashSet2;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    /* renamed from: o.rsnContextCreate$read */
    static class read<T extends IdCaptureBackActivity_MembersInjector> implements rsnElementGetSubElements.write, rsnClosureCreate<T> {
        private final LatLng IconCompatParcelizer;
        private Set<T> MediaBrowserCompat$ItemReceiver;
        final T read;
        final C1068xa4368296 write;

        public final int write() {
            return 1;
        }

        /* synthetic */ read(IdCaptureBackActivity_MembersInjector idCaptureBackActivity_MembersInjector, byte b) {
            this(idCaptureBackActivity_MembersInjector);
        }

        private read(T t) {
            this.read = t;
            this.IconCompatParcelizer = t.MediaBrowserCompat$ItemReceiver();
            this.write = rsnContextCreate.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            this.MediaBrowserCompat$ItemReceiver = Collections.singleton(this.read);
        }

        public final C1068xa4368296 MediaBrowserCompat$CustomActionResultReceiver() {
            return this.write;
        }

        public final LatLng MediaBrowserCompat$ItemReceiver() {
            return this.IconCompatParcelizer;
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            return ((read) obj).read.equals(this.read);
        }

        public final /* bridge */ /* synthetic */ Collection read() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }
}

package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C10827Iterators;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMaxResults */
public final class getMaxResults extends writeUInt64NoTag<CreditCardParameters_MembersInjector> {
    /* access modifiers changed from: private */
    public final transformValues IconCompatParcelizer;
    public final C10827Iterators.C353712 MediaBrowserCompat$ItemReceiver;
    public List<FirebaseOptions> read;
    public final safeGet write;

    /* renamed from: o.getMaxResults$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters_MembersInjector> {
        private /* synthetic */ List write;

        public read(List list) {
            this.write = list;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CreditCardParameters_MembersInjector creditCardParameters_MembersInjector = (CreditCardParameters_MembersInjector) obj;
            creditCardParameters_MembersInjector.read((FirebaseTooManyRequestsException) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(this.write));
            Iterable<FirebaseOptions> iterable = this.write;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (FirebaseOptions firebaseOptions : iterable) {
                String str = firebaseOptions.read;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            creditCardParameters_MembersInjector.IconCompatParcelizer((List) arrayList);
        }
    }

    /* renamed from: o.getMaxResults$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<constrainedSortedSet> {
        final /* synthetic */ getMaxResults IconCompatParcelizer;
        final /* synthetic */ normalize read;
        final /* synthetic */ chain write;

        public IconCompatParcelizer(getMaxResults getmaxresults, chain chain, normalize normalize) {
            this.IconCompatParcelizer = getmaxresults;
            this.write = chain;
            this.read = normalize;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final constrainedSortedSet constrainedsortedset = (constrainedSortedSet) obj;
            getMaxResults getmaxresults = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters_MembersInjector>(this) {
                private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    CreditCardParameters_MembersInjector creditCardParameters_MembersInjector = (CreditCardParameters_MembersInjector) obj;
                    creditCardParameters_MembersInjector.aj_();
                    creditCardParameters_MembersInjector.write(this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(constrainedsortedset.MediaBrowserCompat$ItemReceiver, constrainedsortedset.IconCompatParcelizer, this.IconCompatParcelizer.write, this.IconCompatParcelizer.read));
                }
            };
            if (getmaxresults.RatingCompat != null) {
                r1.IconCompatParcelizer(getmaxresults.RatingCompat);
            }
        }
    }

    /* renamed from: o.getMaxResults$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters_MembersInjector> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CreditCardParameters_MembersInjector) obj).AlertController$RecycleListView();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getMaxResults(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C353712 r3, safeGet safeget, transformValues transformvalues) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "controller");
        onGetStartedClick.write((Object) safeget, "deejungInstallmentsTokenRequestMapper");
        onGetStartedClick.write((Object) transformvalues, "deejungInstallmentsReviewDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = r3;
        this.write = safeget;
        this.IconCompatParcelizer = transformvalues;
    }

    public final void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        super.onDestroy();
    }
}

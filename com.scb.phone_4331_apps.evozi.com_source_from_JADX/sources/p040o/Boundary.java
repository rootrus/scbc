package p040o;

import p040o.Finalizer;
import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.Boundary */
public final class Boundary extends writeUInt64NoTag<IdParameters_MembersInjector> {
    /* access modifiers changed from: private */
    public final Finalizer.C33661 IconCompatParcelizer;
    public final Iterables.C352212 write;

    /* renamed from: o.Boundary$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters_MembersInjector> {
        private /* synthetic */ Boundary MediaBrowserCompat$CustomActionResultReceiver;

        public write(Boundary boundary) {
            this.MediaBrowserCompat$CustomActionResultReceiver = boundary;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdParameters_MembersInjector) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.read.read());
        }
    }

    /* renamed from: o.Boundary$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters_MembersInjector> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdParameters_MembersInjector) obj).read();
        }
    }

    /* renamed from: o.Boundary$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters_MembersInjector> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdParameters_MembersInjector) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Boundary(Finalizer.C33661 r2, Iterables.C352212 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "isYourLoanOnboardingCase");
        onGetStartedClick.write((Object) r3, "ekycEntryPointCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = r2;
        this.write = r3;
    }
}

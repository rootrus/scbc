package p040o;

import java.util.Collections;
import java.util.List;
import p040o.getImportance;
import p040o.writeUInt64NoTag;

/* renamed from: o.nz */
public final class C5081nz extends writeUInt64NoTag<setFaceBottomPadding> {
    public List<? extends getImportance> IconCompatParcelizer;
    public final containsAll MediaBrowserCompat$ItemReceiver;
    public final hasParent write;

    /* renamed from: o.nz$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceBottomPadding> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setFaceBottomPadding) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.nz$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceBottomPadding> {
        private /* synthetic */ List read;

        public IconCompatParcelizer(List list) {
            this.read = list;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setFaceBottomPadding) obj).IconCompatParcelizer(this.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5081nz(RegularImmutableBiMap regularImmutableBiMap, containsAll containsall, getTcpNoDelay<getCode> gettcpnodelay, hasParent hasparent) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) containsall, "countriesCase");
        onGetStartedClick.write((Object) gettcpnodelay, "smartSearch");
        onGetStartedClick.write((Object) hasparent, "countryListDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = containsall;
        this.write = hasparent;
        List<? extends getImportance> singletonList = Collections.singletonList(getImportance.read.write);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        this.IconCompatParcelizer = singletonList;
    }
}

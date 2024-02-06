package p040o;

import p040o.TabLayout;
import p040o.writeUInt64NoTag;

/* renamed from: o.startJob  reason: case insensitive filesystem */
public final class C10867startJob extends writeUInt64NoTag<PassportExtractActivity_MembersInjector> {
    public final TabLayout.TabView IconCompatParcelizer;

    /* renamed from: o.startJob$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractActivity_MembersInjector> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractActivity_MembersInjector) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.startJob$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractActivity_MembersInjector> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractActivity_MembersInjector) obj).read();
        }
    }

    /* renamed from: o.startJob$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractActivity_MembersInjector> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractActivity_MembersInjector) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C10867startJob(RegularImmutableBiMap regularImmutableBiMap, TabLayout.TabView tabView) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tabView, "disclaimerCase");
        this.IconCompatParcelizer = tabView;
    }
}

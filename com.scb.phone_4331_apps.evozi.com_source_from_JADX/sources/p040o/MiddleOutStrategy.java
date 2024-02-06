package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.MiddleOutStrategy */
public final class MiddleOutStrategy extends writeUInt64NoTag<RttiCheckExtractor> {
    public final isRepeatingSequence read;

    /* renamed from: o.MiddleOutStrategy$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<RttiCheckExtractor> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((RttiCheckExtractor) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public MiddleOutStrategy(RegularImmutableBiMap regularImmutableBiMap, isRepeatingSequence isrepeatingsequence) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) isrepeatingsequence, "serviceAtBankingAgentCoachMarkPresenter");
        this.read = isrepeatingsequence;
    }
}

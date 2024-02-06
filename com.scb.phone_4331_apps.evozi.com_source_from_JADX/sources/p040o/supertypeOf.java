package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.supertypeOf */
public final class supertypeOf extends writeUInt64NoTag<getIIdExtractionServerKta$MediaBrowserCompat$ItemReceiver> {
    public lambda$processSetComponents$1 MediaBrowserCompat$ItemReceiver;
    public String read;

    /* renamed from: o.supertypeOf$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdExtractionServerKta$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ supertypeOf IconCompatParcelizer;
        private /* synthetic */ jsonFromMapEntryString MediaBrowserCompat$CustomActionResultReceiver;

        public read(supertypeOf supertypeof, jsonFromMapEntryString jsonfrommapentrystring) {
            this.IconCompatParcelizer = supertypeof;
            this.MediaBrowserCompat$CustomActionResultReceiver = jsonfrommapentrystring;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdExtractionServerKta$MediaBrowserCompat$ItemReceiver) obj).write(supertypeOf.read(this.IconCompatParcelizer), this.IconCompatParcelizer.read, correctDataPath.CREDIT_CARD.index, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public static final /* synthetic */ lambda$processSetComponents$1 read(supertypeOf supertypeof) {
        lambda$processSetComponents$1 lambda_processsetcomponents_1 = supertypeof.MediaBrowserCompat$ItemReceiver;
        if (lambda_processsetcomponents_1 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPurchaseSourceOfFundDisplay");
        }
        return lambda_processsetcomponents_1;
    }

    @HmlPinActivity
    public supertypeOf(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }
}

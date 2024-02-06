package p040o;

/* renamed from: o.setMasked */
public final /* synthetic */ class setMasked implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String write;

    public /* synthetic */ setMasked(String str) {
        this.write = str;
    }

    public final boolean write(Object obj) {
        return ((DataTransportState) obj).MediaSessionCompat$ResultReceiverWrapper.toLowerCase().contains(this.write.toLowerCase());
    }
}

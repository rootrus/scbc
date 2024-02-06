package p040o;

/* renamed from: o.newBillExtractor */
public final /* synthetic */ class newBillExtractor implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String write;

    public /* synthetic */ newBillExtractor(String str) {
        this.write = str;
    }

    public final boolean write(Object obj) {
        return this.write.equals(((parseFile) obj).read.write);
    }
}

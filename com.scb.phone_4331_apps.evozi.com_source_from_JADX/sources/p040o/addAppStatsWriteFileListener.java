package p040o;

/* renamed from: o.addAppStatsWriteFileListener */
public final /* synthetic */ class addAppStatsWriteFileListener implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String write;

    public /* synthetic */ addAppStatsWriteFileListener(String str) {
        this.write = str;
    }

    public final boolean write(Object obj) {
        return ((expandIfNecessary) obj).write.equalsIgnoreCase(this.write);
    }
}

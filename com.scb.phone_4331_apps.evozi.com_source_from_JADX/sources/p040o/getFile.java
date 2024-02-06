package p040o;

/* renamed from: o.getFile */
public final /* synthetic */ class getFile implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String write;

    public /* synthetic */ getFile(String str) {
        this.write = str;
    }

    public final boolean write(Object obj) {
        return ((onInfoWindowLongClick) obj).AlertController$RecycleListView.equalsIgnoreCase(this.write);
    }
}

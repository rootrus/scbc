package p040o;

/* renamed from: o.onCreateOptionsMenu */
public interface onCreateOptionsMenu<T> {

    /* renamed from: o.onCreateOptionsMenu$IconCompatParcelizer */
    public interface IconCompatParcelizer<T> {
        void MediaBrowserCompat$CustomActionResultReceiver(Exception exc);

        void read(T t);
    }

    void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, IconCompatParcelizer<? super T> iconCompatParcelizer);

    void MediaBrowserCompat$CustomActionResultReceiver();

    isPostponed MediaBrowserCompat$ItemReceiver();

    void read();

    Class<T> write();
}

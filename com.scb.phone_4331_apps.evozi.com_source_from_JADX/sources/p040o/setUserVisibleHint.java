package p040o;

import p040o.onCreateOptionsMenu;

/* renamed from: o.setUserVisibleHint */
public final class setUserVisibleHint<Model> implements setSharedElementEnterTransition<Model, Model> {
    private static final setUserVisibleHint<?> read = new setUserVisibleHint<>();

    public final boolean write(Model model) {
        return true;
    }

    public static <T> setUserVisibleHint<T> MediaBrowserCompat$ItemReceiver() {
        return read;
    }

    public final C1536x6a517a85<Model> IconCompatParcelizer(Model model, int i, int i2, onActivityResult onactivityresult) {
        return new C1536x6a517a85<>(new unregisterListener(model), new IconCompatParcelizer(model));
    }

    /* renamed from: o.setUserVisibleHint$IconCompatParcelizer */
    static class IconCompatParcelizer<Model> implements onCreateOptionsMenu<Model> {
        private final Model MediaBrowserCompat$CustomActionResultReceiver;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final void read() {
        }

        IconCompatParcelizer(Model model) {
            this.MediaBrowserCompat$CustomActionResultReceiver = model;
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super Model> iconCompatParcelizer) {
            iconCompatParcelizer.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final Class<Model> write() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getClass();
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return isPostponed.LOCAL;
        }
    }

    /* renamed from: o.setUserVisibleHint$write */
    public static class write<Model> implements setReenterTransition<Model, Model> {
        private static final write<?> read = new write<>();

        public static <T> write<T> MediaBrowserCompat$CustomActionResultReceiver() {
            return read;
        }

        public final setSharedElementEnterTransition<Model, Model> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return setUserVisibleHint.MediaBrowserCompat$ItemReceiver();
        }
    }
}

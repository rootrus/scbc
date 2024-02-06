package p040o;

/* renamed from: o.performCreate */
public abstract class performCreate {
    public static final performCreate IconCompatParcelizer = new performCreate() {
        public final boolean IconCompatParcelizer() {
            return true;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return true;
        }

        public final boolean read(isPostponed ispostponed) {
            return ispostponed == isPostponed.REMOTE;
        }

        public final boolean IconCompatParcelizer(boolean z, isPostponed ispostponed, isRemoving isremoving) {
            return ((z && ispostponed == isPostponed.DATA_DISK_CACHE) || ispostponed == isPostponed.LOCAL) && isremoving == isRemoving.TRANSFORMED;
        }
    };
    public static final performCreate MediaBrowserCompat$ItemReceiver = new performCreate() {
        public final boolean IconCompatParcelizer() {
            return false;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return true;
        }

        public final boolean read(isPostponed ispostponed) {
            return false;
        }

        public final boolean IconCompatParcelizer(boolean z, isPostponed ispostponed, isRemoving isremoving) {
            return (ispostponed == isPostponed.RESOURCE_DISK_CACHE || ispostponed == isPostponed.MEMORY_CACHE) ? false : true;
        }
    };
    public static final performCreate read = new performCreate() {
        public final boolean IconCompatParcelizer() {
            return false;
        }

        public final boolean IconCompatParcelizer(boolean z, isPostponed ispostponed, isRemoving isremoving) {
            return false;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return false;
        }

        public final boolean read(isPostponed ispostponed) {
            return false;
        }
    };
    public static final performCreate write = new performCreate() {
        public final boolean IconCompatParcelizer() {
            return true;
        }

        public final boolean IconCompatParcelizer(boolean z, isPostponed ispostponed, isRemoving isremoving) {
            return false;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return false;
        }

        public final boolean read(isPostponed ispostponed) {
            return (ispostponed == isPostponed.DATA_DISK_CACHE || ispostponed == isPostponed.MEMORY_CACHE) ? false : true;
        }
    };

    public abstract boolean IconCompatParcelizer();

    public abstract boolean IconCompatParcelizer(boolean z, isPostponed ispostponed, isRemoving isremoving);

    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver();

    public abstract boolean read(isPostponed ispostponed);
}

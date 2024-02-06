package p040o;

/* renamed from: o.rotate  reason: case insensitive filesystem */
public abstract class C10885rotate {

    /* renamed from: o.rotate$read */
    public enum read {
        UNKNOWN,
        ANDROID_FIREBASE;

        static {
            UNKNOWN = new read("UNKNOWN", 0);
            ANDROID_FIREBASE = new read("ANDROID_FIREBASE", 1);
        }
    }

    public abstract Long4 IconCompatParcelizer();

    public abstract read read();
}

package p040o;

/* renamed from: o.SettingsDataProvider */
public final /* synthetic */ class SettingsDataProvider implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String read;

    public /* synthetic */ SettingsDataProvider(String str) {
        this.read = str;
    }

    public final boolean write(Object obj) {
        return ((addDelayedShutdownHook) obj).MediaDescriptionCompat.toLowerCase().contains(this.read);
    }
}

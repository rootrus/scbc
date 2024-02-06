package p040o;

/* renamed from: o.FragmentBuilder_BindHmlLandingFragment */
public interface FragmentBuilder_BindHmlLandingFragment {
    String IconCompatParcelizer();

    String MediaBrowserCompat$CustomActionResultReceiver();

    C6552xadbb583e MediaBrowserCompat$ItemReceiver();

    String MediaBrowserCompat$MediaItem();

    String read();

    String write();

    /* renamed from: o.FragmentBuilder_BindHmlLandingFragment$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        EXTERNAL("external"),
        IN_APP("in_app");
        
        String textValue;

        private IconCompatParcelizer(String str) {
            this.textValue = str;
        }

        public final String toString() {
            return this.textValue;
        }
    }
}

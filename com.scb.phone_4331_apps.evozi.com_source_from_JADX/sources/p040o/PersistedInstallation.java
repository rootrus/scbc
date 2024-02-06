package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.PersistedInstallation */
public final /* synthetic */ class PersistedInstallation implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ PersistedInstallation MediaBrowserCompat$CustomActionResultReceiver = new PersistedInstallation();

    /* renamed from: o.PersistedInstallation$RegistrationStatus */
    public final /* synthetic */ class RegistrationStatus implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ RegistrationStatus MediaBrowserCompat$ItemReceiver = new RegistrationStatus();

        private /* synthetic */ RegistrationStatus() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((proxyGetICheckDeserializerRtti.IconCompatParcelizer) obj).ay_();
        }
    }

    private /* synthetic */ PersistedInstallation() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj).MediaBrowserCompat$CustomActionResultReceiver();
    }
}

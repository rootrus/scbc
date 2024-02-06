package p040o;

import java.net.InetAddress;

/* renamed from: o.previewButton */
public interface previewButton {

    /* renamed from: o.previewButton$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        PLAIN,
        LAYERED
    }

    /* renamed from: o.previewButton$read */
    public enum read {
        PLAIN,
        TUNNELLED
    }

    InetAddress IconCompatParcelizer();

    PrivacyManagementLandingViewHolder MediaBrowserCompat$CustomActionResultReceiver();

    boolean MediaBrowserCompat$ItemReceiver();

    boolean MediaDescriptionCompat();

    boolean MediaMetadataCompat();

    PrivacyManagementLandingViewHolder read();

    int write();

    PrivacyManagementLandingViewHolder write(int i);
}

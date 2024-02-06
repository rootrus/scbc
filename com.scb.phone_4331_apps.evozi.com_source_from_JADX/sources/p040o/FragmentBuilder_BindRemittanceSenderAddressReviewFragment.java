package p040o;

import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import java.net.URI;

/* renamed from: o.FragmentBuilder_BindRemittanceSenderAddressReviewFragment */
final class FragmentBuilder_BindRemittanceSenderAddressReviewFragment {
    final DeviceInfo IconCompatParcelizer;
    final URI MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver;
    final String read;
    final Long write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindRemittanceSenderAddressReviewFragment)) {
            return false;
        }
        FragmentBuilder_BindRemittanceSenderAddressReviewFragment fragmentBuilder_BindRemittanceSenderAddressReviewFragment = (FragmentBuilder_BindRemittanceSenderAddressReviewFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindRemittanceSenderAddressReviewFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindRemittanceSenderAddressReviewFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindRemittanceSenderAddressReviewFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindRemittanceSenderAddressReviewFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindRemittanceSenderAddressReviewFragment.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        URI uri = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = uri != null ? uri.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        DeviceInfo deviceInfo = this.IconCompatParcelizer;
        int hashCode4 = deviceInfo != null ? deviceInfo.hashCode() : 0;
        Long l = this.write;
        if (l != null) {
            i = l.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallbackData(rawSiteKey=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", touchpointWithAndroidScheme=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", thinstanceHost=");
        sb.append(this.read);
        sb.append(", interactionRequestDeviceInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", appInstallTimeOrNow=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindRemittanceSenderAddressReviewFragment(String str, URI uri, String str2, DeviceInfo deviceInfo, Long l) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = uri;
        this.read = str2;
        this.IconCompatParcelizer = deviceInfo;
        this.write = l;
    }
}

package p040o;

import java.util.List;

/* renamed from: o.PlacePicker */
public final class PlacePicker {
    public final List<List<String>> MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final List<setLatLngBounds> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacePicker)) {
            return false;
        }
        PlacePicker placePicker = (PlacePicker) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) placePicker.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) placePicker.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) placePicker.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<List<String>> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<setLatLngBounds> list2 = this.write;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressConfirmationDetailsResponse(newAddressUsage=");
        sb.append(this.read);
        sb.append(", formattedAddresses=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", requestProduct=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public PlacePicker(String str, List<? extends List<String>> list, List<setLatLngBounds> list2) {
        onGetStartedClick.write((Object) str, "newAddressUsage");
        onGetStartedClick.write((Object) list, "formattedAddresses");
        onGetStartedClick.write((Object) list2, "requestProduct");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = list2;
    }

    /* renamed from: o.PlacePicker$IntentBuilder */
    public final class IntentBuilder {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntentBuilder)) {
                return false;
            }
            IntentBuilder intentBuilder = (IntentBuilder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) intentBuilder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) intentBuilder.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MailingAddressProductTypeResponse(code=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", description=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public IntentBuilder(String str, String str2) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "description");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
        }
    }
}

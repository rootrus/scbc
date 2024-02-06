package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ComponentFactory */
public final class ComponentFactory implements Parcelable {
    public static final ComponentFactory$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new ComponentFactory$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final processInstanceComponents MediaBrowserCompat$CustomActionResultReceiver;
    public final List<ComponentRuntime> MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentFactory)) {
            return false;
        }
        ComponentFactory componentFactory = (ComponentFactory) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) componentFactory.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) componentFactory.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) componentFactory.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        processInstanceComponents processinstancecomponents = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = processinstancecomponents != null ? processinstancecomponents.hashCode() : 0;
        List<ComponentRuntime> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantMetaDataDisplay(callbackUrl=");
        sb.append(this.read);
        sb.append(", merchantInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", paymentInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ComponentFactory(String str, processInstanceComponents processinstancecomponents, List<ComponentRuntime> list) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = processinstancecomponents;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComponentFactory(Parcel parcel) {
        this(parcel.readString(), (processInstanceComponents) parcel.readParcelable(processInstanceComponents.class.getClassLoader()), parcel.createTypedArrayList(ComponentRuntime.CREATOR));
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }
}

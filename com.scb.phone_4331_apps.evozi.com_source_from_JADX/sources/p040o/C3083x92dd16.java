package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.C3080xc2f5febc;
import p040o.ComponentDiscovery;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3083x92dd16 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new Parcelable((lambda$processSetComponents$1) parcel.readParcelable(C3080xc2f5febc.C30811.class.getClassLoader()), (chain) parcel.readParcelable(C3080xc2f5febc.C30811.class.getClassLoader()), parcel.readString(), (ComponentDiscovery.RegistrarNameRetriever) parcel.readParcelable(C3080xc2f5febc.C30811.class.getClassLoader()), (getFrames) getFrames.CREATOR.createFromParcel(parcel), parcel.readInt()) {
            public static final Parcelable.Creator CREATOR = new C3083x92dd16();
            public final lambda$processSetComponents$1 IconCompatParcelizer;
            public final getFrames MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final ComponentDiscovery.RegistrarNameRetriever MediaBrowserCompat$MediaItem;
            public final chain read;
            public final int write;

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C30811)) {
                    return false;
                }
                C30811 r3 = (C30811) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && this.write == r3.write;
            }

            public final int hashCode() {
                lambda$processSetComponents$1 lambda_processsetcomponents_1 = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = lambda_processsetcomponents_1 != null ? lambda_processsetcomponents_1.hashCode() : 0;
                chain chain = this.read;
                int hashCode2 = chain != null ? chain.hashCode() : 0;
                String str = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str != null ? str.hashCode() : 0;
                ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever = this.MediaBrowserCompat$MediaItem;
                int hashCode4 = registrarNameRetriever != null ? registrarNameRetriever.hashCode() : 0;
                getFrames getframes = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (getframes != null) {
                    i = getframes.hashCode();
                }
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + this.write;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PurchaseCcsofInputDisplay(prepaidCcSofDisplay=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", creditCardDisplay=");
                sb.append(this.read);
                sb.append(", note=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", selectedItem=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", purchaseCcSofVerification=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", cardType=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                onGetStartedClick.write((Object) parcel, "parcel");
                parcel.writeParcelable(this.IconCompatParcelizer, i);
                parcel.writeParcelable(this.read, i);
                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
                this.MediaBrowserCompat$CustomActionResultReceiver.writeToParcel(parcel, 0);
                parcel.writeInt(this.write);
            }

            {
                onGetStartedClick.write((Object) r2, "prepaidCcSofDisplay");
                onGetStartedClick.write((Object) r3, "creditCardDisplay");
                onGetStartedClick.write((Object) r6, "purchaseCcSofVerification");
                this.IconCompatParcelizer = r2;
                this.read = r3;
                this.MediaBrowserCompat$ItemReceiver = r4;
                this.MediaBrowserCompat$MediaItem = r5;
                this.MediaBrowserCompat$CustomActionResultReceiver = r6;
                this.write = r7;
            }
        };
    }

    public final Object[] newArray(int i) {
        return new C3080xc2f5febc.C30811[i];
    }
}

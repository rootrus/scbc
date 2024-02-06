package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.CycleDetector */
public final class CycleDetector extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<CycleDetector> CREATOR = new Parcelable.Creator<CycleDetector>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CycleDetector(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CycleDetector[i];
        }
    };
    public String IconCompatParcelizer;
    public String read;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.CycleDetector$ComponentNode */
    public final class ComponentNode {
        public final MissingDependencyException IconCompatParcelizer;
        public final addDependency MediaBrowserCompat$CustomActionResultReceiver;
        public final MissingDependencyException MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String read;
        public final MissingDependencyException write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComponentNode)) {
                return false;
            }
            ComponentNode componentNode = (ComponentNode) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) componentNode.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) componentNode.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) componentNode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) componentNode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) componentNode.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) componentNode.MediaBrowserCompat$SearchResultReceiver);
        }

        public final int hashCode() {
            MissingDependencyException missingDependencyException = this.write;
            int i = 0;
            int hashCode = missingDependencyException != null ? missingDependencyException.hashCode() : 0;
            MissingDependencyException missingDependencyException2 = this.IconCompatParcelizer;
            int hashCode2 = missingDependencyException2 != null ? missingDependencyException2.hashCode() : 0;
            MissingDependencyException missingDependencyException3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = missingDependencyException3 != null ? missingDependencyException3.hashCode() : 0;
            addDependency adddependency = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = adddependency != null ? adddependency.hashCode() : 0;
            String str = this.read;
            int hashCode5 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CloseAccountReviewDisplay(closingAccountDataDisplay=");
            sb.append(this.write);
            sb.append(", depositTypeDataDisplay=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", receivingAccountDataDisplay=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", amountDataDisplay=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", contactInformation=");
            sb.append(this.read);
            sb.append(", remarks=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ComponentNode(MissingDependencyException missingDependencyException, MissingDependencyException missingDependencyException2, MissingDependencyException missingDependencyException3, addDependency adddependency, String str, String str2) {
            onGetStartedClick.write((Object) missingDependencyException, "closingAccountDataDisplay");
            onGetStartedClick.write((Object) missingDependencyException2, "depositTypeDataDisplay");
            onGetStartedClick.write((Object) missingDependencyException3, "receivingAccountDataDisplay");
            onGetStartedClick.write((Object) adddependency, "amountDataDisplay");
            onGetStartedClick.write((Object) str, "contactInformation");
            onGetStartedClick.write((Object) str2, "remarks");
            this.write = missingDependencyException;
            this.IconCompatParcelizer = missingDependencyException2;
            this.MediaBrowserCompat$ItemReceiver = missingDependencyException3;
            this.MediaBrowserCompat$CustomActionResultReceiver = adddependency;
            this.read = str;
            this.MediaBrowserCompat$SearchResultReceiver = str2;
        }
    }

    /* renamed from: o.CycleDetector$Dep */
    public final class Dep implements Parcelable {
        public static final Parcelable.Creator CREATOR = new CycleDetector$Dep$MediaBrowserCompat$CustomActionResultReceiver();
        public requestLocationUpdates IconCompatParcelizer;
        public String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) dep.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) dep.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            requestLocationUpdates requestlocationupdates = this.IconCompatParcelizer;
            if (requestlocationupdates != null) {
                i = requestlocationupdates.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ThirdPartySlipGenerateIntent(id=");
            sb.append(this.write);
            sb.append(", function=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer.name());
        }

        public Dep(String str, requestLocationUpdates requestlocationupdates) {
            onGetStartedClick.write((Object) str, Name.MARK);
            onGetStartedClick.write((Object) requestlocationupdates, "function");
            this.write = str;
            this.IconCompatParcelizer = requestlocationupdates;
        }
    }

    /* renamed from: o.CycleDetector$1 */
    public final class C33061 extends getUuidUtf8Bytes {
        public static final Parcelable.Creator<C33061> CREATOR = new CycleDetector$1$MediaBrowserCompat$CustomActionResultReceiver();
        public String IconCompatParcelizer;
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder MediaBrowserCompat$CustomActionResultReceiver;
        public List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> read;
        public String write;

        public final int describeContents() {
            return 0;
        }

        public C33061() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33061(Parcel parcel) {
            super(parcel);
            onGetStartedClick.write((Object) parcel, "source");
            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
            String readString = parcel.readString();
            String str = "";
            this.write = readString == null ? str : readString;
            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
            String readString2 = parcel.readString();
            this.IconCompatParcelizer = readString2 != null ? readString2 : str;
            CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = (CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder) parcel.readParcelable(CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder.class.getClassLoader());
            this.MediaBrowserCompat$CustomActionResultReceiver = builder == null ? new CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder() : builder;
            this.read = parcel.createTypedArrayList(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.CREATOR);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            super.writeToParcel(parcel, i);
            String str = this.write;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentId");
            }
            parcel.writeString(str);
            String str2 = this.IconCompatParcelizer;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionToken");
            }
            parcel.writeString(str2);
            CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (builder == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentPartnerReviewDisplay");
            }
            parcel.writeParcelable(builder, 0);
            parcel.writeTypedList(this.read);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }

    public CycleDetector() {
    }

    protected CycleDetector(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
    }
}

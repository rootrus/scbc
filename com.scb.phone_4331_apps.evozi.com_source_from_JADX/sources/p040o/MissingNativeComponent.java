package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsReport;

/* renamed from: o.MissingNativeComponent */
public final class MissingNativeComponent implements Parcelable {
    public static final Parcelable.Creator<MissingNativeComponent> CREATOR = new MissingNativeComponent$MediaBrowserCompat$ItemReceiver();
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final OffsetDateTime read;
    public final OffsetDateTime write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissingNativeComponent)) {
            return false;
        }
        MissingNativeComponent missingNativeComponent = (MissingNativeComponent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) missingNativeComponent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) missingNativeComponent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) missingNativeComponent.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.read;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.write;
        if (offsetDateTime2 != null) {
            i = offsetDateTime2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatementPreRequestDisplay(email=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", startDate=");
        sb.append(this.read);
        sb.append(", endDate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.MissingNativeComponent$MissingNativeSessionFileProvider */
    public final class MissingNativeSessionFileProvider implements Parcelable {
        public static final Parcelable.Creator CREATOR = new write();
        public final CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver;
        public final String read;
        public final String write;

        /* renamed from: o.MissingNativeComponent$MissingNativeSessionFileProvider$write */
        public static final class write implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new MissingNativeSessionFileProvider((CrashlyticsReport.Session.Event.Application.Execution) parcel.readParcelable(MissingNativeSessionFileProvider.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new MissingNativeSessionFileProvider[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MissingNativeSessionFileProvider)) {
                return false;
            }
            MissingNativeSessionFileProvider missingNativeSessionFileProvider = (MissingNativeSessionFileProvider) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) missingNativeSessionFileProvider.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) missingNativeSessionFileProvider.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) missingNativeSessionFileProvider.write);
        }

        public final int hashCode() {
            CrashlyticsReport.Session.Event.Application.Execution execution = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = execution != null ? execution.hashCode() : 0;
            String str = this.read;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectDebitInputDisplay(billPaymentBillerDisplay=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", accountSourceNumber=");
            sb.append(this.read);
            sb.append(", transactionToken=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
            parcel.writeString(this.read);
            parcel.writeString(this.write);
        }

        public MissingNativeSessionFileProvider(CrashlyticsReport.Session.Event.Application.Execution execution, String str, String str2) {
            onGetStartedClick.write((Object) execution, "billPaymentBillerDisplay");
            onGetStartedClick.write((Object) str, "accountSourceNumber");
            this.MediaBrowserCompat$CustomActionResultReceiver = execution;
            this.read = str;
            this.write = str2;
        }
    }

    public MissingNativeComponent(String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) offsetDateTime, "startDate");
        onGetStartedClick.write((Object) offsetDateTime2, "endDate");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = offsetDateTime;
        this.write = offsetDateTime2;
    }

    /* renamed from: o.MissingNativeComponent$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ requestScopes MediaBrowserCompat$CustomActionResultReceiver;

        private write() {
        }

        public /* synthetic */ write(requestScopes requestscopes) {
            this.MediaBrowserCompat$CustomActionResultReceiver = requestscopes;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return requestScopes.read((isInverted) obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MissingNativeComponent(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = r4.readString()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = ""
        L_0x0012:
            java.io.Serializable r1 = r4.readSerializable()
            java.lang.String r2 = "null cannot be cast to non-null type org.threeten.bp.OffsetDateTime"
            if (r1 == 0) goto L_0x002e
            org.threeten.bp.OffsetDateTime r1 = (org.threeten.p041bp.OffsetDateTime) r1
            java.io.Serializable r4 = r4.readSerializable()
            if (r4 == 0) goto L_0x0028
            org.threeten.bp.OffsetDateTime r4 = (org.threeten.p041bp.OffsetDateTime) r4
            r3.<init>(r0, r1, r4)
            return
        L_0x0028:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            r4.<init>(r2)
            throw r4
        L_0x002e:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            r4.<init>(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MissingNativeComponent.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeSerializable(this.read);
        parcel.writeSerializable(this.write);
    }
}

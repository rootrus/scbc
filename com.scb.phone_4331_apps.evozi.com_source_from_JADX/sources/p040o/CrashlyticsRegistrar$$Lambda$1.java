package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.CrashlyticsRegistrar$$Lambda$1 */
public final class CrashlyticsRegistrar$$Lambda$1 extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<CrashlyticsRegistrar$$Lambda$1> CREATOR = new write();
    public final String IconCompatParcelizer;
    public final List<Lazy> MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public CrashlyticsRegistrar$$Lambda$1(String str, String str2, List<Lazy> list) {
        onGetStartedClick.write((Object) list, "debitCardList");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CrashlyticsRegistrar$$Lambda$1(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = r4.readString()
            android.os.Parcelable$Creator<o.Lazy> r2 = p040o.Lazy.CREATOR
            java.util.ArrayList r4 = r4.createTypedArrayList(r2)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x001b
            o.HmlNationalIdActivity r4 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r4 = (java.util.List) r4
        L_0x001b:
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CrashlyticsRegistrar$$Lambda$1.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.CrashlyticsRegistrar$$Lambda$1$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(HomeActivity homeActivity, onPageClick onpageclick, FragmentBuilder_ContributePromptPayManagementLandingFragment fragmentBuilder_ContributePromptPayManagementLandingFragment, FragmentBuilder_BindVerifyIdentityTipsFragment fragmentBuilder_BindVerifyIdentityTipsFragment) {
            onGetStartedClick.write((Object) homeActivity, "occupationEntityMapper");
            onGetStartedClick.write((Object) onpageclick, "sourceOfIncomeMapper");
            onGetStartedClick.write((Object) fragmentBuilder_ContributePromptPayManagementLandingFragment, "addressEntityMapper");
            onGetStartedClick.write((Object) fragmentBuilder_BindVerifyIdentityTipsFragment, "experienceEntityMapper");
        }
    }

    /* renamed from: o.CrashlyticsRegistrar$$Lambda$1$write */
    public static final class write implements Parcelable.Creator<CrashlyticsRegistrar$$Lambda$1> {
        write() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new CrashlyticsRegistrar$$Lambda$1(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CrashlyticsRegistrar$$Lambda$1[i];
        }
    }
}

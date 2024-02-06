package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FragmentBuilder_BindCreditCardDisplayFragment$MediaBrowserCompat$ItemReceiver */
public final class C6488x317a9a54 implements Parcelable.Creator<FragmentBuilder_BindCreditCardDisplayFragment> {
    private C6488x317a9a54() {
    }

    public /* synthetic */ C6488x317a9a54(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new FragmentBuilder_BindCreditCardDisplayFragment(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FragmentBuilder_BindCreditCardDisplayFragment[i];
    }
}

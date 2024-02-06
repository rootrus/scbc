package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FragmentBuilder_BindCreditCardTabFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9746xeff06c58 implements Parcelable.Creator<FragmentBuilder_BindCreditCardTabFragment> {
    private C9746xeff06c58() {
    }

    public /* synthetic */ C9746xeff06c58(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new FragmentBuilder_BindCreditCardTabFragment(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FragmentBuilder_BindCreditCardTabFragment[i];
    }
}

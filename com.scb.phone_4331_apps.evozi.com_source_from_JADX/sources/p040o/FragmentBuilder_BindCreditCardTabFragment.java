package p040o;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setFilename;

/* renamed from: o.FragmentBuilder_BindCreditCardTabFragment */
public final class FragmentBuilder_BindCreditCardTabFragment implements setFilename.IconCompatParcelizer {
    public static final C9746xeff06c58 CREATOR = new C9746xeff06c58((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
    }

    public FragmentBuilder_BindCreditCardTabFragment() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentBuilder_BindCreditCardTabFragment(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Intent IconCompatParcelizer = RegistrationPersonalInformationActivity.IconCompatParcelizer(context, "REGISTER_INPUT_FLOW_TOUCH_POINT");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

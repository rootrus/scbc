package p040o;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setFilename;

/* renamed from: o.FragmentBuilder_BindCreditCardReviewFragment */
public final class FragmentBuilder_BindCreditCardReviewFragment implements setFilename.IconCompatParcelizer {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
    }

    public FragmentBuilder_BindCreditCardReviewFragment() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentBuilder_BindCreditCardReviewFragment(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Intent IconCompatParcelizer2 = RegistrationPersonalInformationActivity.IconCompatParcelizer(context, "REGISTER_INPUT_FLOW_NDID");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, IconCompatParcelizer2).read();
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

    /* renamed from: o.FragmentBuilder_BindCreditCardReviewFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<FragmentBuilder_BindCreditCardReviewFragment> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new FragmentBuilder_BindCreditCardReviewFragment(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentBuilder_BindCreditCardReviewFragment[i];
        }
    }
}

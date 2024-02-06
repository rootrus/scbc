package p040o;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointWebViewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setFilename;

/* renamed from: o.FragmentBuilder_BindCreditCardDisplayFragment */
public final class FragmentBuilder_BindCreditCardDisplayFragment implements setFilename.IconCompatParcelizer {
    public static final C6488x317a9a54 CREATOR = new C6488x317a9a54((byte) 0);
    private final String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
    }

    public FragmentBuilder_BindCreditCardDisplayFragment() {
        this.MediaBrowserCompat$ItemReceiver = "https://www.scb.co.th/th/personal-banking/other-services/scb-easy-id.html";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentBuilder_BindCreditCardDisplayFragment(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        TouchPointWebViewActivity.write write = TouchPointWebViewActivity.MediaBrowserCompat$MediaItem;
        Intent MediaBrowserCompat$CustomActionResultReceiver = TouchPointWebViewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(context, this.MediaBrowserCompat$ItemReceiver);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

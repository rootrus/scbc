package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ccrredemption.ecoupon.MyECouponFragment;
import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import java.util.List;

/* renamed from: o.verifyResetPinOtp */
public final class verifyResetPinOtp extends setCardElevation {
    private final String IconCompatParcelizer;
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean MediaBrowserCompat$ItemReceiver;
    private final List<Integer> write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public verifyResetPinOtp(setTitleMarginStart settitlemarginstart, Context context, List<Integer> list, String str, boolean z) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) settitlemarginstart, "fm");
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) list, "titleTabs");
        onGetStartedClick.write((Object) str, "cardRef");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.write = list;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    /* renamed from: o.verifyResetPinOtp$write */
    public static final class write implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ EasycashCommonReviewFragment.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

        private write() {
        }

        public /* synthetic */ write(EasycashCommonReviewFragment.IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        }

        public final boolean write(Object obj) {
            return EasycashCommonReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(((zzvo) obj).MediaDescriptionCompat, "PROMPTPAY_FUNCTION");
        }
    }

    public final Fragment read(int i) {
        if (i != 0) {
            MyECouponFragment.IconCompatParcelizer iconCompatParcelizer = MyECouponFragment.IconCompatParcelizer;
            return MyECouponFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, false, this.MediaBrowserCompat$ItemReceiver);
        }
        MyECouponFragment.IconCompatParcelizer iconCompatParcelizer2 = MyECouponFragment.IconCompatParcelizer;
        return MyECouponFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, true, this.MediaBrowserCompat$ItemReceiver);
    }

    public final int getCount() {
        return this.write.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(this.write.get(i).intValue());
    }
}

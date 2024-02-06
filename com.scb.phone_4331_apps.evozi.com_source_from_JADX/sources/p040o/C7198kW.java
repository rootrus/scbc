package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p040o.C7200kZ;

/* renamed from: o.kW */
public abstract class C7198kW<T, VH extends C7200kZ<T>> extends RecyclerView.IconCompatParcelizer<VH> {
    public static final /* synthetic */ clickNext[] read = {FundOnboardingLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver((FundAppFormActivity) new FatcaActivity(FundOnboardingLandingActivity_ViewBinding.write(C7198kW.class), "list", "getList()Ljava/util/List;"))};
    final FundFactSheetActivity<T, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver;
    public final FundRedeemLandingActivity write;

    public C7198kW() {
        this((byte) 0);
    }

    public abstract void IconCompatParcelizer(VH vh, T t);

    private /* synthetic */ C7198kW(byte b) {
        this((FundFactSheetActivity) null);
    }

    public final /* synthetic */ void IconCompatParcelizer(RecyclerView.setContentView setcontentview) {
        C7200kZ kZVar = (C7200kZ) setcontentview;
        onGetStartedClick.write((Object) kZVar, "holder");
        super.IconCompatParcelizer(kZVar);
        kZVar.write.setOnClickListener(new read(this, kZVar));
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        C7200kZ kZVar = (C7200kZ) setcontentview;
        onGetStartedClick.write((Object) kZVar, "holder");
        super.MediaBrowserCompat$CustomActionResultReceiver(kZVar);
        kZVar.write.setOnClickListener((View.OnClickListener) null);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        C7200kZ kZVar = (C7200kZ) setcontentview;
        onGetStartedClick.write((Object) kZVar, "holder");
        T t = ((List) this.write.read(read[0])).get(i);
        onGetStartedClick.write((Object) t, "<set-?>");
        kZVar.setHasDecor = t;
        IconCompatParcelizer(kZVar, t);
    }

    public C7198kW(FundFactSheetActivity<? super T, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        FundRedeemOtpActivity fundRedeemOtpActivity = FundRedeemOtpActivity.read;
        this.write = new kW$MediaBrowserCompat$CustomActionResultReceiver(HmlNationalIdActivity.IconCompatParcelizer, this);
    }

    /* renamed from: o.kW$read */
    static final class read implements View.OnClickListener {
        private /* synthetic */ C7198kW IconCompatParcelizer;
        private /* synthetic */ C7200kZ write;

        read(C7198kW kWVar, C7200kZ kZVar) {
            this.IconCompatParcelizer = kWVar;
            this.write = kZVar;
        }

        public final void onClick(View view) {
            FundFactSheetActivity<T, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (fundFactSheetActivity != null) {
                T t = this.write.setHasDecor;
                if (t == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("item");
                }
                fundFactSheetActivity.invoke(t);
            }
        }
    }

    public final int IconCompatParcelizer() {
        return ((List) this.write.read(read[0])).size();
    }
}

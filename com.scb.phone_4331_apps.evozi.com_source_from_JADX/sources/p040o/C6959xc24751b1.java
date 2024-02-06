package p040o;

import java.util.List;
import p040o.zzcb;

/* renamed from: o.MerchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder */
public class C6959xc24751b1 {
    private final String IconCompatParcelizer;
    private final List<zzcb.zzc.zza> read;
    private final String write;

    public C6959xc24751b1() {
    }

    public C6959xc24751b1(String str, String str2, List<zzcb.zzc.zza> list) {
        onGetStartedClick.write((Object) str, "totalLoanAmount");
        onGetStartedClick.write((Object) str2, "totalMonthlyPayment");
        onGetStartedClick.write((Object) list, "product");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = list;
    }

    public List<zzcb.zzc.zza> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read;
    }

    public String MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public String write() {
        return this.IconCompatParcelizer;
    }
}

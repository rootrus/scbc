package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.Iterables;
import p040o.zzxc;

/* renamed from: o.asEnumeration */
public final class asEnumeration extends Iterables.C35339 {
    final getConcurrencyLevel read;
    public final C4414f_ write;

    /* renamed from: o.asEnumeration$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends zzxc.zzb>, List<? extends sameThreadExecutor>> {
        private /* synthetic */ asEnumeration IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(asEnumeration asenumeration) {
            super(1);
            this.IconCompatParcelizer = asenumeration;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            List list = (List) obj;
            onGetStartedClick.write((Object) list, "list");
            getConcurrencyLevel getconcurrencylevel = this.IconCompatParcelizer.read;
            onGetStartedClick.write((Object) list, "list");
            Iterable<zzxc.zzb> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (zzxc.zzb zzb : iterable) {
                String str2 = zzb.write;
                if (zzb == null || (str = zzb.MediaBrowserCompat$ItemReceiver) == null) {
                    str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.banking_agent_placeholder).toString();
                }
                String c_ = getconcurrencylevel.mo26549c_(str);
                onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(\n     …g()\n                    )");
                String str3 = zzb.IconCompatParcelizer;
                double d = zzb.MediaBrowserCompat$MediaItem;
                double d2 = zzb.MediaBrowserCompat$CustomActionResultReceiver;
                double d3 = zzb.read;
                getConcurrencyLevel getconcurrencylevel2 = getconcurrencylevel;
                String write = getConcurrencyLevel.write(Double.valueOf(zzb.MediaBrowserCompat$MediaItem));
                onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(it.minAmount)");
                String write2 = getConcurrencyLevel.write(Double.valueOf(zzb.MediaBrowserCompat$CustomActionResultReceiver));
                onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(it.maxAmount)");
                String write3 = getConcurrencyLevel.write(Double.valueOf(zzb.read));
                onGetStartedClick.IconCompatParcelizer((Object) write3, "transformFund(it.limitPerDay)");
                arrayList.add(new sameThreadExecutor(str2, c_, str3, d, d2, d3, write, write2, write3));
                getconcurrencylevel = getconcurrencylevel2;
            }
            return (List) arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public asEnumeration(C4414f_ f_Var, getConcurrencyLevel getconcurrencylevel) {
        super((byte) 0);
        onGetStartedClick.write((Object) f_Var, "getBankingAgentsCase");
        onGetStartedClick.write((Object) getconcurrencylevel, "bankingAgentDisplayMapper");
        this.write = f_Var;
        this.read = getconcurrencylevel;
    }
}

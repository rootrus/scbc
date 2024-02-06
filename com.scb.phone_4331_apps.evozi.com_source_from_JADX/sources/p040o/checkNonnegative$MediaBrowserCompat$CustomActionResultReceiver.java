package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.MoreExecutors;
import p040o.getConcurrencyLevel;

/* renamed from: o.checkNonnegative$MediaBrowserCompat$CustomActionResultReceiver */
public final class checkNonnegative$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzsj, List<? extends MoreExecutors.C36611>> {
    private /* synthetic */ checkNonnegative MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public checkNonnegative$MediaBrowserCompat$CustomActionResultReceiver(checkNonnegative checknonnegative, String str) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = checknonnegative;
        this.read = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list;
        zzsj zzsj = (zzsj) obj;
        onGetStartedClick.write((Object) zzsj, "deposits");
        getConcurrencyLevel getconcurrencylevel = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        zzvf RatingCompat = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat();
        if (RatingCompat != null) {
            list = RatingCompat.MediaBrowserCompat$ItemReceiver;
        } else {
            list = new ArrayList();
        }
        onGetStartedClick.IconCompatParcelizer((Object) list, "accountSummaryCase.cachedDepositList");
        String str = this.read;
        boolean itemInvoker = this.MediaBrowserCompat$ItemReceiver.RatingCompat.read.setItemInvoker();
        onGetStartedClick.write((Object) zzsj, "deposits");
        onGetStartedClick.write((Object) list, "depositAccounts");
        onGetStartedClick.write((Object) str, "postingType");
        List<zzvo> list2 = zzsj.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) list2, "deposits.depositSummaryList");
        Iterable iterable = list2;
        onGetStartedClick.write((Object) iterable, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
        FundFactSheetActivity read2 = new getConcurrencyLevel.read(str);
        onGetStartedClick.write((Object) iconCompatParcelizer, "$this$filter");
        onGetStartedClick.write((Object) read2, "predicate");
        BaseJuristicPinActivity_ViewBinding setupScheduleActivity = new SetupScheduleActivity(iconCompatParcelizer, true, read2);
        FundFactSheetActivity getconcurrencylevel_mediabrowsercompat_customactionresultreceiver = new C4527x4a474b74(getconcurrencylevel, list, itemInvoker);
        onGetStartedClick.write((Object) setupScheduleActivity, "$this$map");
        onGetStartedClick.write((Object) getconcurrencylevel_mediabrowsercompat_customactionresultreceiver, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity = new JuristicSetupNewPinActivity(setupScheduleActivity, getconcurrencylevel_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$toList");
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$toMutableList");
        return HmlNTBBusinessURLInformationActivity.write((List) JuristicRequestFormActivity.read(juristicSetupNewPinActivity, new ArrayList()));
    }
}

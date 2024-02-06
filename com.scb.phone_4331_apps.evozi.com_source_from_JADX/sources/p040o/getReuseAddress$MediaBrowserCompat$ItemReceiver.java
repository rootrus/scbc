package p040o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.JuristicRequestFormActivity;
import p040o.PersonalizeActivity;

/* renamed from: o.getReuseAddress$MediaBrowserCompat$ItemReceiver */
public final class getReuseAddress$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final getReuseAddress$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new getReuseAddress$MediaBrowserCompat$ItemReceiver();

    getReuseAddress$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        C5111open open = (C5111open) obj;
        onGetStartedClick.write((Object) open, "it");
        List<PersonalizeActivity.IconCompatParcelizer> list = open.read;
        onGetStartedClick.IconCompatParcelizer((Object) list, "it.categories");
        Iterable iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
        FundFactSheetActivity fundFactSheetActivity = C46403.IconCompatParcelizer;
        onGetStartedClick.write((Object) iconCompatParcelizer, "$this$filter");
        onGetStartedClick.write((Object) fundFactSheetActivity, "predicate");
        BaseJuristicPinActivity_ViewBinding setupScheduleActivity = new SetupScheduleActivity(iconCompatParcelizer, true, fundFactSheetActivity);
        Comparator getreuseaddress_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver = new C4641x7c7a898e();
        onGetStartedClick.write((Object) setupScheduleActivity, "$this$sortedWith");
        onGetStartedClick.write((Object) getreuseaddress_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver, "comparator");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer2 = new JuristicRequestFormActivity.IconCompatParcelizer(setupScheduleActivity, getreuseaddress_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver);
        onGetStartedClick.write((Object) iconCompatParcelizer2, "$this$toList");
        onGetStartedClick.write((Object) iconCompatParcelizer2, "$this$toMutableList");
        return new C5111open(HmlNTBBusinessURLInformationActivity.write((List) JuristicRequestFormActivity.read(iconCompatParcelizer2, new ArrayList())));
    }
}

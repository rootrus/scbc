package p040o;

import java.util.Iterator;

/* renamed from: o.SetupScheduleActivity */
public final class SetupScheduleActivity<T> implements BaseJuristicPinActivity_ViewBinding<T> {
    final boolean IconCompatParcelizer;
    final FundFactSheetActivity<T, Boolean> read;
    final BaseJuristicPinActivity_ViewBinding<T> write;

    public SetupScheduleActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, boolean z, FundFactSheetActivity<? super T, Boolean> fundFactSheetActivity) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        onGetStartedClick.write((Object) fundFactSheetActivity, "predicate");
        this.write = baseJuristicPinActivity_ViewBinding;
        this.IconCompatParcelizer = z;
        this.read = fundFactSheetActivity;
    }

    public final Iterator<T> read() {
        return new SetupScheduleActivity$MediaBrowserCompat$ItemReceiver(this);
    }
}

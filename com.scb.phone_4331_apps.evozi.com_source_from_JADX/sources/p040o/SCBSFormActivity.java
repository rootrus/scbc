package p040o;

/* renamed from: o.SCBSFormActivity */
public interface SCBSFormActivity<T, R> extends clickNext<R>, FundFactSheetActivity<T, R> {

    /* renamed from: o.SCBSFormActivity$write */
    public interface write<T, R> extends clickNext$MediaBrowserCompat$CustomActionResultReceiver<R>, FundFactSheetActivity<T, R> {
    }

    R IconCompatParcelizer(T t);

    write<T, R> IconCompatParcelizer();
}

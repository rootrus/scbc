package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.PinCase;

/* renamed from: o.StatsEvent */
public final /* synthetic */ class StatsEvent implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ StatsEvent read = new StatsEvent();

    private /* synthetic */ StatsEvent() {
    }

    /* renamed from: o.StatsEvent$Types */
    public final /* synthetic */ class Types implements findFragmentByWho {
        public static final /* synthetic */ Types IconCompatParcelizer = new Types();

        private /* synthetic */ Types() {
        }

        public final Object IconCompatParcelizer(Object obj) {
            zzrt zzrt = (zzrt) obj;
            sortedCopy MediaBrowserCompat$ItemReceiver = sortedCopy.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = zzrt.read;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = zzrt.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            return MediaBrowserCompat$ItemReceiver;
        }
    }

    public final Object write(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException.write == RetrofitException.read.API_ERROR) {
                ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
                if (iLocationSourceDelegate.write != null) {
                    String str = iLocationSourceDelegate.write.IconCompatParcelizer;
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != 1507516) {
                        if (hashCode == 1507522 && str.equals("1036")) {
                            c = 0;
                        }
                    } else if (str.equals("1030")) {
                        c = 1;
                    }
                    if (c == 0) {
                        return DebitCardResetOtpActivity.error((Throwable) new PinCase.PinIncorrectLimitReachedException());
                    }
                    if (c == 1) {
                        return DebitCardResetOtpActivity.error((Throwable) new PinCase.PinIncorrectException(iLocationSourceDelegate.write.read));
                    }
                }
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }
}

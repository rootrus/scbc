package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.LottieDrawable;

/* renamed from: o.zzu */
public final /* synthetic */ class zzu implements findFragmentByWho {
    public static final /* synthetic */ zzu IconCompatParcelizer = new zzu();

    private /* synthetic */ zzu() {
    }

    public final Object IconCompatParcelizer(Object obj) {
        return Integer.valueOf(((LottieDrawable.C361511) obj).write);
    }

    /* renamed from: o.zzu$zza */
    public final /* synthetic */ class zza implements DebitCardMarketConductDeepLinkActivity {
        public static final /* synthetic */ zza write = new zza();

        private /* synthetic */ zza() {
        }

        public final void IconCompatParcelizer(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof RetrofitException) {
                RetrofitException retrofitException = (RetrofitException) th;
                if (retrofitException.IconCompatParcelizer != null && retrofitException.IconCompatParcelizer.write != null && retrofitException.IconCompatParcelizer.write.IconCompatParcelizer != null) {
                    if (retrofitException.IconCompatParcelizer.write.IconCompatParcelizer.equals("3006") || retrofitException.IconCompatParcelizer.write.IconCompatParcelizer.equals("3008")) {
                        Thread.sleep(3000);
                    }
                }
            }
        }
    }
}

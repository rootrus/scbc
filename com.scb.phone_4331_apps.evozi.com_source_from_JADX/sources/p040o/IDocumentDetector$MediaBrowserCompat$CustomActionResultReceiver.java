package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.ILocationSourceDelegate;
import p040o.writeUInt64NoTag;

/* renamed from: o.IDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver */
public final class IDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ IDocumentDetector MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver(IDocumentDetector iDocumentDetector) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = iDocumentDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        boolean z;
        final String str2;
        final String str3;
        ILocationSourceDelegate.zza zza;
        ILocationSourceDelegate.zza zza2;
        int i;
        ILocationSourceDelegate.zza zza3;
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        if (th instanceof RetrofitException) {
            Iterable IconCompatParcelizer = IDocumentDetector.write;
            RetrofitException retrofitException = (RetrofitException) th;
            ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza3 = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza3.IconCompatParcelizer;
            }
            onGetStartedClick.write((Object) IconCompatParcelizer, "$this$contains");
            boolean z2 = true;
            if (IconCompatParcelizer instanceof Collection) {
                z = ((Collection) IconCompatParcelizer).contains(str);
            } else {
                onGetStartedClick.write((Object) IconCompatParcelizer, "$this$indexOf");
                if (!(IconCompatParcelizer instanceof List)) {
                    Iterator it = IconCompatParcelizer.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next = it.next();
                        if (i2 < 0) {
                            throw new ArithmeticException("Index overflow has happened.");
                        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, next)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    i = ((List) IconCompatParcelizer).indexOf(str);
                }
                z = i >= 0;
            }
            if (z) {
                ILocationSourceDelegate iLocationSourceDelegate2 = retrofitException.IconCompatParcelizer;
                if (iLocationSourceDelegate2 == null || (zza2 = iLocationSourceDelegate2.write) == null || (str2 = zza2.write) == null) {
                    str2 = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
                }
                ILocationSourceDelegate iLocationSourceDelegate3 = retrofitException.IconCompatParcelizer;
                if (iLocationSourceDelegate3 == null || (zza = iLocationSourceDelegate3.write) == null || (str3 = zza.read) == null) {
                    str3 = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
                }
                IDocumentDetector.MediaDescriptionCompat(this.MediaBrowserCompat$ItemReceiver);
                IDocumentDetector iDocumentDetector = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer r2 = new writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.PlaybackStateCompat>(this) {
                    private /* synthetic */ IDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver write;

                    {
                        this.write = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        ((CheckExtractActivity_MembersInjector.PlaybackStateCompat) obj).read(this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(str2, str3, this.write.MediaBrowserCompat$ItemReceiver.read.write()));
                    }
                };
                if (iDocumentDetector.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    r2.IconCompatParcelizer(iDocumentDetector.RatingCompat);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
            private /* synthetic */ IDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }

            public final void run() {
                IDocumentDetector iDocumentDetector = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C97612.write;
                if (iDocumentDetector.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(iDocumentDetector.RatingCompat);
                }
            }
        }));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

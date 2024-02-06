package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.HmlPromptPayVerificationActivity;
import p040o.onNotNowClick;

/* renamed from: o.HmlMoaActivity */
public final class HmlMoaActivity implements HmlPromptPayVerificationActivity, Serializable {
    private final HmlPromptPayVerificationActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlPromptPayVerificationActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.HmlMoaActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<HmlVerifyPhoneValidateOtpActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlPromptPayVerificationActivity[] IconCompatParcelizer;
        private /* synthetic */ onNotNowClick.write MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(HmlPromptPayVerificationActivity[] hmlPromptPayVerificationActivityArr, onNotNowClick.write write) {
            super(2);
            this.IconCompatParcelizer = hmlPromptPayVerificationActivityArr;
            this.MediaBrowserCompat$CustomActionResultReceiver = write;
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
            onGetStartedClick.write((Object) (HmlVerifyPhoneValidateOtpActivity) obj, "<anonymous parameter 0>");
            onGetStartedClick.write((Object) iconCompatParcelizer, "element");
            HmlPromptPayVerificationActivity[] hmlPromptPayVerificationActivityArr = this.IconCompatParcelizer;
            onNotNowClick.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = write.MediaBrowserCompat$CustomActionResultReceiver;
            write.MediaBrowserCompat$CustomActionResultReceiver = i + 1;
            hmlPromptPayVerificationActivityArr[i] = iconCompatParcelizer;
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public HmlMoaActivity(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, RttiJsonExactionHelper.LEFT);
        onGetStartedClick.write((Object) iconCompatParcelizer, "element");
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlPromptPayVerificationActivity;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return hmlPromptPayVerificationActivity != HmlPromptPayAboutActivity.IconCompatParcelizer ? (HmlPromptPayVerificationActivity) hmlPromptPayVerificationActivity.read(this, C6894x2375c6f.write) : this;
    }

    public final <E extends HmlPromptPayVerificationActivity.IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = this;
        while (true) {
            HmlMoaActivity hmlMoaActivity = (HmlMoaActivity) hmlPromptPayVerificationActivity;
            E IconCompatParcelizer2 = hmlMoaActivity.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);
            if (IconCompatParcelizer2 != null) {
                return IconCompatParcelizer2;
            }
            hmlPromptPayVerificationActivity = hmlMoaActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(hmlPromptPayVerificationActivity instanceof HmlMoaActivity)) {
                return hmlPromptPayVerificationActivity.IconCompatParcelizer(hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final <R> R read(R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlPromptPayVerificationActivity.IconCompatParcelizer, ? extends R> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        return baseDiscoverFundFilterActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read(r, baseDiscoverFundFilterActivity), this.MediaBrowserCompat$ItemReceiver);
    }

    public final HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) != null) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        HmlPromptPayVerificationActivity read = this.MediaBrowserCompat$CustomActionResultReceiver.read(hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);
        if (read == this.MediaBrowserCompat$CustomActionResultReceiver) {
            return this;
        }
        if (read == HmlPromptPayAboutActivity.IconCompatParcelizer) {
            return this.MediaBrowserCompat$ItemReceiver;
        }
        return new HmlMoaActivity(read, this.MediaBrowserCompat$ItemReceiver);
    }

    private final int write() {
        HmlMoaActivity hmlMoaActivity = this;
        int i = 2;
        while (true) {
            HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = hmlMoaActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(hmlPromptPayVerificationActivity instanceof HmlMoaActivity)) {
                hmlPromptPayVerificationActivity = null;
            }
            hmlMoaActivity = (HmlMoaActivity) hmlPromptPayVerificationActivity;
            if (hmlMoaActivity == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof HmlMoaActivity)) {
                return false;
            }
            HmlMoaActivity hmlMoaActivity = (HmlMoaActivity) obj;
            if (hmlMoaActivity.write() != write()) {
                return false;
            }
            HmlMoaActivity hmlMoaActivity2 = this;
            while (true) {
                HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = hmlMoaActivity2.MediaBrowserCompat$ItemReceiver;
                if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) hmlMoaActivity.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver()), (Object) iconCompatParcelizer)) {
                    z = false;
                    break;
                }
                HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = hmlMoaActivity2.MediaBrowserCompat$CustomActionResultReceiver;
                if (hmlPromptPayVerificationActivity instanceof HmlMoaActivity) {
                    hmlMoaActivity2 = (HmlMoaActivity) hmlPromptPayVerificationActivity;
                } else if (hmlPromptPayVerificationActivity != null) {
                    HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer2 = (HmlPromptPayVerificationActivity.IconCompatParcelizer) hmlPromptPayVerificationActivity;
                    z = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) hmlMoaActivity.IconCompatParcelizer(iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver()), (Object) iconCompatParcelizer2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() + this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity = HmlMoaActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        sb.append((String) baseDiscoverFundFilterActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read("", baseDiscoverFundFilterActivity), this.MediaBrowserCompat$ItemReceiver));
        sb.append("]");
        return sb.toString();
    }

    private final Object writeReplace() {
        int write2 = write();
        HmlPromptPayVerificationActivity[] hmlPromptPayVerificationActivityArr = new HmlPromptPayVerificationActivity[write2];
        onNotNowClick.write write3 = new onNotNowClick.write();
        boolean z = false;
        write3.MediaBrowserCompat$CustomActionResultReceiver = 0;
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        BaseDiscoverFundFilterActivity iconCompatParcelizer = new IconCompatParcelizer(hmlPromptPayVerificationActivityArr, write3);
        onGetStartedClick.write((Object) iconCompatParcelizer, "operation");
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read(hmlVerifyPhoneValidateOtpActivity, iconCompatParcelizer), this.MediaBrowserCompat$ItemReceiver);
        if (write3.MediaBrowserCompat$CustomActionResultReceiver == write2) {
            z = true;
        }
        if (z) {
            return new write(hmlPromptPayVerificationActivityArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: o.HmlMoaActivity$write */
    static final class write implements Serializable {
        private final HmlPromptPayVerificationActivity[] IconCompatParcelizer;

        /* renamed from: o.HmlMoaActivity$write$write  reason: collision with other inner class name */
        public static final class C10783write {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$MediaItem;
            public final String MediaMetadataCompat;
            public final String read;
            public final String write;

            private C10783write() {
            }

            public C10783write(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.read = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.IconCompatParcelizer = str3;
                this.MediaBrowserCompat$ItemReceiver = str4;
                this.MediaBrowserCompat$MediaItem = str5;
                this.MediaMetadataCompat = str6;
                this.write = str7;
            }
        }

        public write(HmlPromptPayVerificationActivity[] hmlPromptPayVerificationActivityArr) {
            onGetStartedClick.write((Object) hmlPromptPayVerificationActivityArr, "elements");
            this.IconCompatParcelizer = hmlPromptPayVerificationActivityArr;
        }

        private final Object readResolve() {
            HmlPromptPayVerificationActivity[] hmlPromptPayVerificationActivityArr = this.IconCompatParcelizer;
            HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = HmlPromptPayAboutActivity.IconCompatParcelizer;
            for (HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver : hmlPromptPayVerificationActivityArr) {
                hmlPromptPayVerificationActivity = hmlPromptPayVerificationActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
            }
            return hmlPromptPayVerificationActivity;
        }
    }
}

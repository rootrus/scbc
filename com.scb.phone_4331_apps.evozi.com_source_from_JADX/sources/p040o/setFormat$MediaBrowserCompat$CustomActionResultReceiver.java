package p040o;

import java.util.Iterator;
import java.util.List;
import p040o.PersonalizeActivity;
import p040o.writeUInt64NoTag;
import p040o.zzrc;

/* renamed from: o.setFormat$MediaBrowserCompat$CustomActionResultReceiver */
public final class setFormat$MediaBrowserCompat$CustomActionResultReceiver<T> implements DebitCardMarketConductDeepLinkActivity<HmlVerifyEmailSuccessfulActivity<? extends C5111open, ? extends List<? extends zzrc.zza>>> {
    private /* synthetic */ setFormat read;

    public setFormat$MediaBrowserCompat$CustomActionResultReceiver(setFormat setformat) {
        this.read = setformat;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final int i;
        final HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
        setFormat setformat = this.read;
        List<zzrc.zza> list = (List) hmlVerifyEmailSuccessfulActivity.write;
        onGetStartedClick.write((Object) list, "<set-?>");
        setformat.MediaDescriptionCompat = list;
        this.read.IconCompatParcelizer = ((C5111open) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver).read;
        List<? extends PersonalizeActivity.IconCompatParcelizer> list2 = this.read.IconCompatParcelizer;
        boolean z = true;
        if (list2 != null) {
            Iterator<? extends PersonalizeActivity.IconCompatParcelizer> it = list2.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i2 = ((PersonalizeActivity.IconCompatParcelizer) it.next()).MediaBrowserCompat$CustomActionResultReceiver;
                Integer num = this.read.read;
                if (num != null && i2 == num.intValue()) {
                    break;
                }
                i++;
            }
        } else {
            i = 0;
        }
        setFormat setformat2 = this.read;
        writeUInt64NoTag.IconCompatParcelizer r4 = new writeUInt64NoTag.IconCompatParcelizer<ExceptionResponseImpl>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((ExceptionResponseImpl) obj).write((C5111open) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, i);
            }
        };
        if (setformat2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r4.IconCompatParcelizer(setformat2.RatingCompat);
        }
        setFormat.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}

package p040o;

import com.pingan.p031ai.face.common.PaFaceConstants;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p040o.inject_stringIdGenerator;
import p040o.writeUInt64NoTag;

/* renamed from: o.tA */
public final /* synthetic */ class C7494tA implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ inject_stringIdGenerator.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ isScrollGesturesEnabledDuringRotateOrZoom write;

    public /* synthetic */ C7494tA(inject_stringIdGenerator.IconCompatParcelizer iconCompatParcelizer, isScrollGesturesEnabledDuringRotateOrZoom isscrollgesturesenabledduringrotateorzoom) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.write = isscrollgesturesenabledduringrotateorzoom;
    }

    public final void IconCompatParcelizer(Object obj) {
        inject_stringIdGenerator.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        isScrollGesturesEnabledDuringRotateOrZoom isscrollgesturesenabledduringrotateorzoom = this.write;
        getTopLeftCornerWidth$MediaSessionCompat$Token gettopleftcornerwidth_mediasessioncompat_token = (getTopLeftCornerWidth$MediaSessionCompat$Token) obj;
        inject_stringIdGenerator inject_stringidgenerator = inject_stringIdGenerator.this;
        parseCustomAttribute unused = inject_stringidgenerator.MediaBrowserCompat$ItemReceiver = inject_stringidgenerator.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(isscrollgesturesenabledduringrotateorzoom);
        inject_stringIdGenerator inject_stringidgenerator2 = inject_stringIdGenerator.this;
        Calendar instance = GregorianCalendar.getInstance();
        onGetStartedClick.write((Object) instance, "now");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("Asia/Bangkok"));
        gregorianCalendar.clear();
        gregorianCalendar.set(PaFaceConstants.EnvironmentalTips.COVER_MOUTH, 6, 1);
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
        inject_stringidgenerator2.write(!(gregorianCalendar.compareTo(instance) <= 0), inject_imageStorage.IconCompatParcelizer);
        if (inject_stringIdGenerator.this.MediaBrowserCompat$ItemReceiver.write) {
            gettopleftcornerwidth_mediasessioncompat_token.MediaBrowserCompat$MediaItem();
        } else {
            gettopleftcornerwidth_mediasessioncompat_token.aP_();
        }
    }
}

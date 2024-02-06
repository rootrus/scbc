package p040o;

import java.text.NumberFormat;
import java.util.Locale;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTable */
public final /* synthetic */ class getTable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigure MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setTransparency write;

    public /* synthetic */ getTable(nativeConfigure nativeconfigure, setTransparency settransparency) {
        this.MediaBrowserCompat$ItemReceiver = nativeconfigure;
        this.write = settransparency;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure nativeconfigure = this.MediaBrowserCompat$ItemReceiver;
        setTransparency settransparency = this.write;
        IdCaptureModule_GetIParametersFactory idCaptureModule_GetIParametersFactory = (IdCaptureModule_GetIParametersFactory) obj;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        idCaptureModule_GetIParametersFactory.read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(settransparency.read));
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance2.setMinimumFractionDigits(2);
        currencyInstance2.setMaximumFractionDigits(2);
        idCaptureModule_GetIParametersFactory.MediaDescriptionCompat(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(settransparency.MediaBrowserCompat$ItemReceiver));
        NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance3.setMinimumFractionDigits(2);
        currencyInstance3.setMaximumFractionDigits(2);
        idCaptureModule_GetIParametersFactory.IconCompatParcelizer(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance3).format(settransparency.IconCompatParcelizer));
        if ("en".equalsIgnoreCase(nativeconfigure.f2896x50fd9e4a)) {
            nativeConfigure.read(idCaptureModule_GetIParametersFactory, nativeconfigure.MediaDescriptionCompat.RatingCompat);
            nativeconfigure.MediaBrowserCompat$ItemReceiver(idCaptureModule_GetIParametersFactory, nativeconfigure.MediaDescriptionCompat.read);
            return;
        }
        nativeConfigure.read(idCaptureModule_GetIParametersFactory, nativeconfigure.MediaDescriptionCompat.f2855x50fd9e4a);
        nativeconfigure.MediaBrowserCompat$ItemReceiver(idCaptureModule_GetIParametersFactory, nativeconfigure.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

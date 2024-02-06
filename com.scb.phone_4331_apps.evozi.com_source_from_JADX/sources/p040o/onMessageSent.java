package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.onMessageSent */
public final /* synthetic */ class onMessageSent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getContour read;
    private final /* synthetic */ chain write;

    public /* synthetic */ onMessageSent(getContour getcontour, chain chain) {
        this.read = getcontour;
        this.write = chain;
    }

    public final void IconCompatParcelizer(Object obj) {
        getContour getcontour = this.read;
        chain chain = this.write;
        setResultDeserializer setresultdeserializer = (setResultDeserializer) obj;
        setresultdeserializer.read();
        boolean z = false;
        if (chain == null || !chain.setVisibility) {
            setresultdeserializer.RatingCompat(false);
            return;
        }
        setresultdeserializer.RatingCompat(chain.setVisibility);
        setresultdeserializer.IconCompatParcelizer(!chain.AppCompatDialogFragment);
        onSendError onsenderror = new onSendError(getcontour, chain);
        if (getcontour.RatingCompat != null) {
            z = true;
        }
        if (z) {
            onsenderror.IconCompatParcelizer(getcontour.RatingCompat);
        }
    }
}

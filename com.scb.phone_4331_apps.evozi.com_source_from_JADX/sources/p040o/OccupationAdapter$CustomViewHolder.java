package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.Serializable;

/* renamed from: o.OccupationAdapter$CustomViewHolder */
public final class OccupationAdapter$CustomViewHolder implements Serializable, Cloneable, C9698x5b61c61d {
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;

    public OccupationAdapter$CustomViewHolder(String str, String str2) {
        this.read = (String) C6431x12296157.write(str, KtaJsonExactionHelper.NAME);
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding introductionViewPagerAdapter$IntroductionItemHolder_ViewBinding = IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        return IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding.read(this).toString();
    }
}

package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.setHandler */
public final class setHandler extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.setHandler$read */
    public static final class read {
        final byte[] IconCompatParcelizer;
        private int write;

        private read() {
        }

        read(int i) {
            this.IconCompatParcelizer = new byte[i];
            this.write = 0;
        }

        public final void IconCompatParcelizer(boolean z, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.write;
                this.write = i3 + 1;
                this.IconCompatParcelizer[i3] = z ? (byte) 1 : 0;
            }
        }
    }

    public static setOnMapLongClickListener MediaBrowserCompat$ItemReceiver(renderPath renderpath) {
        if (renderpath != null) {
            CharSequence charSequence = renderpath.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = false;
            if (!((charSequence == null || charSequence.length() == 0) || renderpath.IconCompatParcelizer == null || renderpath.read == null)) {
                CharSequence charSequence2 = renderpath.write;
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    CharSequence charSequence3 = renderpath.MediaBrowserCompat$ItemReceiver;
                    if (!(charSequence3 == null || charSequence3.length() == 0) && renderpath.RatingCompat != null) {
                        CharSequence charSequence4 = renderpath.MediaBrowserCompat$MediaItem;
                        if (!(charSequence4 == null || charSequence4.length() == 0)) {
                            CharSequence charSequence5 = renderpath.MediaMetadataCompat;
                            if (charSequence5 == null || charSequence5.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                return new setOnMapLongClickListener(renderpath.MediaBrowserCompat$CustomActionResultReceiver, renderpath.IconCompatParcelizer.doubleValue(), renderpath.read.doubleValue(), renderpath.write, renderpath.MediaBrowserCompat$ItemReceiver, renderpath.RatingCompat.doubleValue(), renderpath.MediaBrowserCompat$MediaItem, renderpath.MediaMetadataCompat);
                            }
                        }
                    }
                }
            }
        }
        throw new EntityMappingException("data must not be null or empty");
    }
}

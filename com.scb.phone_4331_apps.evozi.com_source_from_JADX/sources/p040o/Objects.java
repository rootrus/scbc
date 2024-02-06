package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.Objects */
public final /* synthetic */ class Objects implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getCause IconCompatParcelizer;

    /* renamed from: o.Objects$ToStringHelper */
    public final /* synthetic */ class ToStringHelper implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ FragmentBuilder_BindPurchaseDepositFragment MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ ToStringHelper(FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment) {
            this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindPurchaseDepositFragment;
        }

        public final void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver((OECF_sRGB) obj);
        }
    }

    public /* synthetic */ Objects(getCause getcause) {
        this.IconCompatParcelizer = getcause;
    }

    public final Object write(Object obj) {
        pathSegments pathsegments = (pathSegments) obj;
        isScrollGesturesEnabled isscrollgesturesenabled = new isScrollGesturesEnabled();
        isscrollgesturesenabled.write = FragmentBuilder_BindSummaryFragment.write(pathsegments.read, (OffsetDateTime) null);
        isscrollgesturesenabled.read = pathsegments.write;
        isscrollgesturesenabled.IconCompatParcelizer = FragmentBuilder_BindSummaryFragment.write(pathsegments.MediaBrowserCompat$CustomActionResultReceiver, (OffsetDateTime) null);
        return isscrollgesturesenabled;
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.HitBuilders;
import p040o.zzxg;
import p040o.zzxj;

/* renamed from: o.configure */
public final /* synthetic */ class configure implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlCommonCustomDialog.IconCompatParcelizer write;

    public /* synthetic */ configure(HmlCommonCustomDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        HitBuilders.TransactionBuilder transactionBuilder = this.write.IconCompatParcelizer;
        parse parse = (parse) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) parse, "entity");
        zzxj.IconCompatParcelizer iconCompatParcelizer = new zzxj.IconCompatParcelizer((byte) 0);
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = parse.MediaBrowserCompat$ItemReceiver;
        Iterable<queryStringToNamesAndValues> iterable = parse.write;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (queryStringToNamesAndValues querystringtonamesandvalues : iterable) {
            zzxg.write write2 = new zzxg.write((byte) 0);
            write2.MediaBrowserCompat$CustomActionResultReceiver = querystringtonamesandvalues.MediaBrowserCompat$ItemReceiver;
            write2.IconCompatParcelizer = querystringtonamesandvalues.read;
            write2.write = querystringtonamesandvalues.IconCompatParcelizer;
            write2.MediaBrowserCompat$SearchResultReceiver = querystringtonamesandvalues.MediaBrowserCompat$SearchResultReceiver;
            write2.read = querystringtonamesandvalues.MediaBrowserCompat$CustomActionResultReceiver;
            write2.MediaMetadataCompat = querystringtonamesandvalues.MediaMetadataCompat;
            write2.write = querystringtonamesandvalues.IconCompatParcelizer;
            write2.MediaDescriptionCompat = querystringtonamesandvalues.RatingCompat;
            write2.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindSummaryFragment.write(querystringtonamesandvalues.write, (OffsetDateTime) null);
            arrayList.add(new zzxg(write2, (byte) 0));
        }
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = (List) arrayList;
        zzxj zzxj = new zzxj(iconCompatParcelizer, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) zzxj, "BondSelectionList.newBui…nd))\n            .build()");
        return zzxj;
    }
}

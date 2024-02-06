package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.investment.funddetails.DividendTabFragment;
import com.scb.phone.view.fragment.investment.funddetails.LtfTabFragment;
import java.util.List;
import java.util.concurrent.Callable;
import p040o.AbstractMultimap;

/* renamed from: o.getTransferEligibleAmount */
public final class getTransferEligibleAmount extends setCardElevation {
    private final List<DataCollectionArbiter> IconCompatParcelizer;
    private final List<getCurrentTimeMillis> MediaBrowserCompat$CustomActionResultReceiver;
    private final Context MediaBrowserCompat$ItemReceiver;
    private int[] read;
    private final String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getTransferEligibleAmount(setTitleMarginStart settitlemarginstart, Context context, List<DataCollectionArbiter> list, List<? extends getCurrentTimeMillis> list2, String str, int[] iArr) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "fundType");
        onGetStartedClick.write((Object) iArr, "titleTabs");
        this.MediaBrowserCompat$ItemReceiver = context;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        this.write = str;
        this.read = iArr;
    }

    public final Fragment read(int i) {
        if (i != 0) {
            DividendTabFragment IconCompatParcelizer2 = DividendTabFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "DividendTabFragment.newInstance(dividendList)");
            return IconCompatParcelizer2;
        }
        LtfTabFragment read2 = LtfTabFragment.read(this.IconCompatParcelizer, this.write);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "LtfTabFragment.newInstance(ltfList, fundType)");
        return read2;
    }

    public final int getCount() {
        return this.read.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.getString(this.read[i]);
    }

    /* renamed from: o.getTransferEligibleAmount$write */
    public static final class write implements Callable {
        private final /* synthetic */ String IconCompatParcelizer;
        private final /* synthetic */ C6514xb47b5894 write;

        private write() {
        }

        public /* synthetic */ write(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, String str) {
            this.write = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.IconCompatParcelizer = str;
        }

        public final Object call() {
            C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            String str = this.IconCompatParcelizer;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = AbstractMultimap.AsMap.AsMapEntries.LOADING;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = AbstractMultimap.AsMap.AsMapEntries.ERROR;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = AbstractMultimap.AsMap.AsMapEntries.LOADING;
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read = AbstractMultimap.AsMap.AsMapEntries.ERROR;
            ContentModelParser contentModelParser = new ContentModelParser();
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = contentModelParser;
            return fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(contentModelParser, str, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read);
        }
    }
}

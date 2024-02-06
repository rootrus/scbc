package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.ccrredemption.product.PaginationViewFooterHolder;

/* renamed from: o.postAddressesValidation */
public abstract class postAddressesValidation extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private PaginationViewFooterHolder MediaBrowserCompat$ItemReceiver;
    public View.OnClickListener MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat = false;
    public postProductList MediaMetadataCompat = postProductList.UNKNOWN;

    /* access modifiers changed from: protected */
    public abstract int write();

    /* access modifiers changed from: protected */
    public abstract RecyclerView.setContentView write(ViewGroup viewGroup);

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return write(viewGroup);
        }
        this.MediaBrowserCompat$ItemReceiver = new PaginationViewFooterHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f92352131494462, viewGroup, false));
        MediaBrowserCompat$CustomActionResultReceiver();
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int IconCompatParcelizer() {
        int write = write();
        return this.MediaDescriptionCompat ? write + 1 : write;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i == write() ? 1 : 0;
    }

    /* renamed from: o.postAddressesValidation$1 */
    static /* synthetic */ class C73761 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.postProductList[] r0 = p040o.postProductList.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.postProductList r1 = p040o.postProductList.SHOWING_LOADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.postProductList r1 = p040o.postProductList.SHOWING_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.postProductList r1 = p040o.postProductList.HIDDEN_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.postProductList r1 = p040o.postProductList.HIDDEN_LOADER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.postProductList r1 = p040o.postProductList.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.postAddressesValidation.C73761.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            int i = C73761.read[this.MediaMetadataCompat.ordinal()];
            if (i == 1) {
                PaginationViewFooterHolder paginationViewFooterHolder = this.MediaBrowserCompat$ItemReceiver;
                paginationViewFooterHolder.paginationStatusView.setVisibility(0);
                paginationViewFooterHolder.inlineLoader.setVisibility(0);
            } else if (i == 2) {
                PaginationViewFooterHolder paginationViewFooterHolder2 = this.MediaBrowserCompat$ItemReceiver;
                View.OnClickListener onClickListener = this.MediaBrowserCompat$SearchResultReceiver;
                paginationViewFooterHolder2.paginationStatusView.setVisibility(0);
                paginationViewFooterHolder2.tapToRetryView.setVisibility(0);
                paginationViewFooterHolder2.tapToRetryView.setOnClickListener(onClickListener);
            } else if (i == 3) {
                PaginationViewFooterHolder paginationViewFooterHolder3 = this.MediaBrowserCompat$ItemReceiver;
                paginationViewFooterHolder3.paginationStatusView.setVisibility(8);
                paginationViewFooterHolder3.tapToRetryView.setVisibility(8);
            } else if (i == 4) {
                PaginationViewFooterHolder paginationViewFooterHolder4 = this.MediaBrowserCompat$ItemReceiver;
                paginationViewFooterHolder4.paginationStatusView.setVisibility(8);
                paginationViewFooterHolder4.inlineLoader.setVisibility(8);
            } else if (i == 5) {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }
}

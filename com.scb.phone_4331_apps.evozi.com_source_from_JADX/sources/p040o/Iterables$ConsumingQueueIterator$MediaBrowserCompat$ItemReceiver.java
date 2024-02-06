package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.Iterables;
import p040o.zzcb;
import p040o.zzfb;

/* renamed from: o.Iterables$ConsumingQueueIterator$MediaBrowserCompat$ItemReceiver */
public final class Iterables$ConsumingQueueIterator$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzfb.zza, BytesBackedNativeSessionFile> {
    private /* synthetic */ Iterables.ConsumingQueueIterator write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Iterables$ConsumingQueueIterator$MediaBrowserCompat$ItemReceiver(Iterables.ConsumingQueueIterator consumingQueueIterator) {
        super(1);
        this.write = consumingQueueIterator;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zzfb.zza zza = (zzfb.zza) obj;
        onGetStartedClick.write((Object) zza, "it");
        NullsFirstOrdering nullsFirstOrdering = this.write.IconCompatParcelizer;
        onGetStartedClick.write((Object) zza, "operativeAccount");
        List arrayList = new ArrayList();
        String str = null;
        for (C6960x24be0e72 merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding : zza.read) {
            String str2 = "DIRECT_DEBIT";
            if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding instanceof zzcb.zzh.zza) {
                zzcb.zzh.zza zza2 = (zzcb.zzh.zza) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding;
                nullsFirstOrdering.MediaBrowserCompat$ItemReceiver = zza2.read;
                getStream write2 = nullsFirstOrdering.write((zzcb.zzi) zza2);
                arrayList.add(write2);
                NullsFirstOrdering.write(arrayList, zza2);
                arrayList.add(new getBatteryVelocity((Boolean) null, write2.write.get(0).MediaBrowserCompat$ItemReceiver, 1));
            } else if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding instanceof zzcb.zzi) {
                zzcb.zzi zzi = (zzcb.zzi) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding;
                arrayList.add(nullsFirstOrdering.write(zzi));
                NullsFirstOrdering.write(arrayList, zzi);
            } else {
                if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding instanceof zzcb.zzj) {
                    populateSequenceNumber IconCompatParcelizer = nullsFirstOrdering.IconCompatParcelizer((zzcb.zzi.zza) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding);
                    if (IconCompatParcelizer.read) {
                        str2 = "CASH";
                    }
                    arrayList.add(IconCompatParcelizer);
                    NullsFirstOrdering.write(arrayList, merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding);
                } else if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding instanceof zzcb.zzk) {
                    zzcb.zzk zzk = (zzcb.zzk) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding;
                    arrayList.add(nullsFirstOrdering.write((zzcb.zzi.zza) zzk));
                    NullsFirstOrdering.write(arrayList, zzk);
                } else if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding instanceof zzcb.zzk.zza) {
                    zzcb.zzk.zza zza3 = (zzcb.zzk.zza) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding;
                    arrayList.add(new convertLongToTwoByteBuffer(zza3.IconCompatParcelizer));
                    NullsFirstOrdering.IconCompatParcelizer(arrayList, zza3);
                } else if (merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding instanceof zzcb.zzj.zza) {
                    C6960x24be0e72 merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding2 = (zzcb.zzj.zza) merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding;
                    arrayList.add(new asFilePayload(merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding2.IconCompatParcelizer));
                    NullsFirstOrdering.write(arrayList, merchantWalletOutgoingTransactionAdapter$OutgoingGroupItemViewHolder_ViewBinding2);
                }
                str = str2;
            }
        }
        return new BytesBackedNativeSessionFile(zza, arrayList, str);
    }
}

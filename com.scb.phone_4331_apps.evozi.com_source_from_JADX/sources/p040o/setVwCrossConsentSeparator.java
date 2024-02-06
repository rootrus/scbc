package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.ProtocolViolationException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setVwCrossConsentSeparator */
public enum setVwCrossConsentSeparator implements SelectProvinceOrDistrictAdapter$ViewHolder {
    ;

    public final void aQ_() {
    }

    public final void write(long j) {
    }

    private setVwCrossConsentSeparator(String str) {
    }

    public static boolean MediaBrowserCompat$ItemReceiver(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder, SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder2) {
        if (selectProvinceOrDistrictAdapter$ViewHolder2 == null) {
            AlertController$RecycleListView.read.read((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (selectProvinceOrDistrictAdapter$ViewHolder == null) {
            return true;
        } else {
            selectProvinceOrDistrictAdapter$ViewHolder2.aQ_();
            AlertController$RecycleListView.read.read((Throwable) new ProtocolViolationException("Subscription already set!"));
            return false;
        }
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(j);
        AlertController$RecycleListView.read.read((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    public static boolean read(AtomicReference<SelectProvinceOrDistrictAdapter$ViewHolder> atomicReference, SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        HmlLatestPersonalInformationDeepLinkActivity.write(selectProvinceOrDistrictAdapter$ViewHolder, "s is null");
        if (atomicReference.compareAndSet((Object) null, selectProvinceOrDistrictAdapter$ViewHolder)) {
            return true;
        }
        selectProvinceOrDistrictAdapter$ViewHolder.aQ_();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        AlertController$RecycleListView.read.read((Throwable) new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static boolean write(AtomicReference<SelectProvinceOrDistrictAdapter$ViewHolder> atomicReference) {
        SelectProvinceOrDistrictAdapter$ViewHolder andSet;
        SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder = atomicReference.get();
        setVwCrossConsentSeparator setvwcrossconsentseparator = CANCELLED;
        if (selectProvinceOrDistrictAdapter$ViewHolder == setvwcrossconsentseparator || (andSet = atomicReference.getAndSet(setvwcrossconsentseparator)) == CANCELLED) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.aQ_();
        return true;
    }
}

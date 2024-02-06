package p040o;

/* renamed from: o.DepositDetailRecyclerViewAdapter$DepositViewHolder */
public interface DepositDetailRecyclerViewAdapter$DepositViewHolder<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder);
}

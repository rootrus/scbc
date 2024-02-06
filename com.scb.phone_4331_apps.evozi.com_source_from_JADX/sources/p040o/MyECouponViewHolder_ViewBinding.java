package p040o;

import java.io.IOException;
import java.net.Socket;

@Deprecated
/* renamed from: o.MyECouponViewHolder_ViewBinding */
public final class MyECouponViewHolder_ViewBinding extends ExportCardStatementSelectionAdapter$MonthViewHolder {
    public MyECouponViewHolder_ViewBinding(Socket socket, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        MediaBrowserCompat$CustomActionResultReceiver(socket.getOutputStream(), i < 1024 ? 1024 : i, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }
}

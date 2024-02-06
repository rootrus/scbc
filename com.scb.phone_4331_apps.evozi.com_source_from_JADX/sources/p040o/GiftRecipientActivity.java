package p040o;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

@Deprecated
/* renamed from: o.GiftRecipientActivity */
public interface GiftRecipientActivity extends GiftingActivity {
    Socket read(Socket socket, String str, int i) throws IOException, UnknownHostException;
}

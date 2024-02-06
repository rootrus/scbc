package okhttp3;

import java.io.IOException;
import p040o.PinChangeActivity_ViewBinding;

public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    PinChangeActivity_ViewBinding timeout();
}

package presto.watch.prestosampleproject;

/**
 * Created by davidjay on 8/7/15.
 */
public class DefaultUnwindowedReceiverService extends AppControllerReceiverService {
    @Override
    protected Class getWatchActivityClass() {
        return DefaultUnwindowedReceiverService.class;
    }
}
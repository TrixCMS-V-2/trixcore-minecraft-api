package eu.trixcms.trixcore.api.scheduler;

import java.util.TimerTask;

public interface IScheduler {

    void schedule(TimerTask task, int delay);

    void resetScheduler();

}

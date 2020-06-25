package eu.trixcms.trixcore.api.scheduler;

import java.util.TimerTask;

public interface IScheduler {

    /**
     * Start a task
     * @param task
     * @param delay in seconds
     */
    void schedule(TimerTask task, int delay);

    /**
     * Reset the scheduler
     */
    void resetScheduler();

}

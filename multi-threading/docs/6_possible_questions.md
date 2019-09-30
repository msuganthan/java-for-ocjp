What is daemon thread?

	A thread which is executing in the background is called deamon thread.

		. GC
		. Attach Listener
		. Singal Dispatcher
	Usually daemon thread having low priority but it based on our requirement daemon threads can run with high priority also.

How you check a thread is daemon or not?

	public boolean isDaemon();

Change the daemon nature?

	public void setDaemon(boolean b);

What is the default nature of thread?

	By default main thread – is non-daemon, for other threads daemon nature will be inherited from parent to child.

Is it possible to change the daemon nature of main thread?

	Impossible.

Refer DaemonThreadTest.java for more details :)

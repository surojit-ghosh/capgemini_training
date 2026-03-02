### Thread
- thread is a small unit of execution
- thread is a lightweight process


- Context switching: the process of storing the state of the process and swapping to other process and executing the process and then switching back to the original process and resuming execution from the point where it was left off.
- whenever we create a thread the JVM creates a main thread and the main thread is responsible for executing the main method and the main thread is also responsible for creating other threads.
- using thread reference if we call `.run()` method then it will execute the run method in the same thread and it will not create a new thread but if we call `.start()` method then it will create a new thread and it will execute the run method in the new thread.
- the main method/main thread will start the threads and then exits after completing the statements and then the threads will continue to execute.
- `join()` method is used to wait for a thread to die. If we call `join()` method on a thread then the current thread will wait until the thread on which `join()` method is called is dead.
- we cant call `.join()`for main thread because main thread is the thread that is responsible for executing the main method and if we call `join()` method on main thread then it will wait for main thread to die and it will cause a deadlock.
- if a thread is synchronized then its thread safe
- in multithreading when one thread is running in a synchronized method then other thread will only run in the synchronized method when the first thread is done with the synchronized method and it will release the lock on the synchronized method and then the second thread will acquire the lock on the synchronized method and then it will execute the synchronized method.


### Thread Lifecycle

- `Thread thread = new Thread(() -> { ... });`
- New:
- Runnable: `.start()`
- Blocked:
- Waiting: `.wait()`
- Timed Waiting: `.sleep()`
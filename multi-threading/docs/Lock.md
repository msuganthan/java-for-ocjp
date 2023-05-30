### Intro
The problems with traditional `synchronized` keyword:
1. We are not having to try for a lock without waiting
2. There is no way to specify maximum waiting time for a thread to get lock so that thread will wait until getting the lock which may creates performance problems which may cause deadlock
3. If a thread releases lock then which waiting thread will get that lock we are not having any control on this.
4. There is no API to list out all waiting threads for a lock.
5. The `synchronized` keyword compulsory we have to use either at method level or within a method and it is not possible to use across multiple methods.

To overcome this problem `Sun` people introduced `java.util.concurrent.locks` package

It also provides several enhancements to the programmer to provide more control on concurrency.

### Lock interface

* `Lock` object is similar to implicit lock acquired by a thread to execute synchronized method or synchronized block.
* Lock implementation provide more extensive operations than traditional implicit locks

#### Methods of lock interface

* `void lock()`: We can use this method to acquire a lock if lock is already available, then immediately the current thread will get that lock, if it is not available then it will wait until getting the lock. This is exactly behavior of traditional `synchronized` keyword.
* `boolean tryLock()`: To acquire the lock without waiting. If lock is available then the thread acquires the lock and return true. If it is not available then this method return false and can continue its execution without waiting, in this case, thread never be entered into waiting state.

```java
if(l.tryLock()) {
    //perform safe operation
} else {
    //perform alternate operation
}
```
* `boolean tryLock(long time, TimeUnit unit)`: If the lock is available, then the thread will get the lock and continue its execution. If the lock is not available then the thread will wait until specified amount of time. Still if the lock is not available then thread can continue its execution.

```java
if(l.tryLock(1, TimeUnit.HOUR)) {
    
} else {
    //perform alternate operation
}
```

* `void lockInterruptibly`:  Acquires the lock if it is available and returns immediately, if the lock is not available, then it will wait, while waiting if the thread is interrupted then the thread won't get the lock

* `void unlock()`: To release the lock. To call this method compulsory current thread should be owner of the lock otherwise we will get `IllegalMonitorStateException`.

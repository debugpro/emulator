package cn.banny.emulator.hook.hookzz;

import com.sun.jna.Pointer;

public interface RegisterContext {

    long getLr();

    Pointer getLrPointer();

    void set(String key, Object value);
    <T> T get(String key);

}
